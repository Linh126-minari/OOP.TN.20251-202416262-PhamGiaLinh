package com.hust.kstn.test;

import com.hust.kstn.models.Track;
import com.hust.kstn.models.CompactDisc;

public class CompactDiscTest {
	public static void main(String[] args) {
		String[] artists = {"Son Tung MTP", "Min"};
        String[] directors = {"Abc"};

        Track track1 = new Track("track1", 150);
        Track track2 = new Track("track2", 200);
        Track track3 = new Track("track3", 250);
        Track track4 = new Track("track4", 300);

        Track[] tracks = {track1, track2};
        CompactDisc cd = new CompactDisc("12345", "Pop", 11, artists, directors, tracks);
        System.out.println(cd);

        cd.addTrack(track3);
        System.out.println(cd);

        cd.removeTrack(track4);
        cd.removeTrack(track2);
        System.out.println(cd);

	}
}
