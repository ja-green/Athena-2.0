package com.athena.attacks;

import com.athena.utils.HashManager;

import java.io.File;
import java.util.ArrayList;

public class BruteForce extends Attack {
    public BruteForce(ArrayList<byte[]> hashes, int hashType) {
        super.setHashType(hashType, hashes);
        super.setHashman(new HashManager(hashes));
        super.initDigestInstance();
    }

    @Override
    public void attack() {

    }

    public ArrayList<byte[]> getNextCandidates() {
        return null;
    }
}