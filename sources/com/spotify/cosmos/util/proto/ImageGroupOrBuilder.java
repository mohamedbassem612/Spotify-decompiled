package com.spotify.cosmos.util.proto;

import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface ImageGroupOrBuilder extends v2j0 {
    @Override // p.v2j0
    /* synthetic */ s2j0 getDefaultInstanceForType();

    String getLargeLink();

    phc getLargeLinkBytes();

    String getSmallLink();

    phc getSmallLinkBytes();

    String getStandardLink();

    phc getStandardLinkBytes();

    String getXlargeLink();

    phc getXlargeLinkBytes();

    boolean hasLargeLink();

    boolean hasSmallLink();

    boolean hasStandardLink();

    boolean hasXlargeLink();

    @Override // p.v2j0
    /* synthetic */ boolean isInitialized();
}
