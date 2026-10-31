package com.spotify.graduation.v1;

import com.google.protobuf.Timestamp;
import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public interface DownloadOrBuilder extends v2j0 {
    Timestamp getDate();

    /* synthetic */ s2j0 getDefaultInstanceForType();

    String getDownloadUrl();

    phc getDownloadUrlBytes();

    DownloadLevel getLevel();

    int getLevelValue();

    String getSecurityCode();

    phc getSecurityCodeBytes();

    DownloadStatus getStatus();

    int getStatusValue();

    int getTtl();

    boolean hasDate();

    /* synthetic */ boolean isInitialized();
}
