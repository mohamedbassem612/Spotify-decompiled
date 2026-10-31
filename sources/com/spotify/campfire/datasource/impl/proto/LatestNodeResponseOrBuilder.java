package com.spotify.campfire.datasource.impl.proto;

import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface LatestNodeResponseOrBuilder extends v2j0 {
    ClientNode getClientNode();

    @Override // p.v2j0
    /* synthetic */ s2j0 getDefaultInstanceForType();

    Hierarchy getHierarchy();

    boolean hasClientNode();

    boolean hasHierarchy();

    @Override // p.v2j0
    /* synthetic */ boolean isInitialized();
}
