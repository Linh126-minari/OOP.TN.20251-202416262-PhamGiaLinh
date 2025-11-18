package com.hust.kstn.models;



public class CompactDisc extends Media {
	private String[] artists;
	private String[] directors;
	private Track[] tracks = new Track[20];
	private int trackCount =0;

	
	public CompactDisc(String title, String category, double cost, String[] artists, String[] directors,Track[] tracks) {
		super(title,cost,category);
		this.artists = new String[artists.length];
		for(int i=0;i<artists.length;i++) {
			this.artists[i] = artists[i];
		}
		this.directors = new String[directors.length];
		for(int i=0;i< directors.length;i++) {
			this.directors[i] = directors[i];
		}
		for (int i = 0; i < tracks.length; i++) 
            if (tracks[i] != null) {
                this.tracks[i] = tracks[i];
                trackCount++;
            }
	}


	public String[] getArtists() {
		return artists;
	}

	public String[] getDirectors() {
		return directors;
	}

	public Track[] getTracks() {
		return tracks;
	}
	
	public int totalLength() {
		int length = 0;
        for (int i = 0; i < trackCount; i++)
            length += tracks[i].getLength();
        return length;
	}
	public void addTrack(Track track) {
		if(trackCount<20) {
			tracks[trackCount]=track;
			trackCount++;
			System.out.println("This track has been added sucessfully");
		}
		else {
			System.out.println("The CD is almost full");
		}
	}
	public void removeTrack(Track track) {
		if(trackCount==0) {
			System.out.println("The CD is empty");
		}
		if(trackCount>0) {
			boolean found = false;
			for(int i=0;i<trackCount;i++) {
				if(tracks[i].equals(track)) {
					found = true;
					for(int j=i;j<trackCount-1;j++) {
						tracks[j] = tracks[j+1];
					}
					tracks[trackCount-1] = null;
					trackCount--;
					System.out.println("The track has been removed sucessfully");
					break;
				}
			}
			if(!found) {
				System.out.println("The track does not exist");
			}
		}
	}
	@Override
	public String toString() {
		if(trackCount == 0) {
			return "The CD is empty";
		}
		String result = "CD" + super.toString()+"\n";
		result += "Artists: ";
        for (int i = 0; i < artists.length; i++) {
            result += artists[i];
            if (i < artists.length - 1) 
                result += ", ";
        }
        result += "\n";

        result += "Directors: ";
        for (int i = 0; i < directors.length; i++) {
            result += directors[i];
            if (i < directors.length - 1)
                result += ", ";
        }
        result += "\n";

        result += "Tracks: ";
        for (int i = 0; i < trackCount; i++)     
            result += this.tracks[i].toString();
        return result;
		
				
	}
}
