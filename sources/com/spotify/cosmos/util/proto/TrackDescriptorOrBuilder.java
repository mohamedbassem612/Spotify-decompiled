package com.spotify.cosmos.util.proto;

import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface TrackDescriptorOrBuilder extends v2j0 {
    @Override // p.v2j0
    /* synthetic */ s2j0 getDefaultInstanceForType();

    String getName();

    phc getNameBytes();

    float getWeight();

    boolean hasName();

    boolean hasWeight();

    @Override // p.v2j0
    /* synthetic */ boolean isInitialized();
}
