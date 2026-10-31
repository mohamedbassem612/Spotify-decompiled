package com.spotify.campfire.datasource.impl.proto;

import java.util.List;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface RetrieveLatestNodeResponseOrBuilder extends v2j0 {
    @Override // p.v2j0
    /* synthetic */ s2j0 getDefaultInstanceForType();

    LatestNodeResponse getLatestNodeResponse(int i);

    int getLatestNodeResponseCount();

    List<LatestNodeResponse> getLatestNodeResponseList();

    @Override // p.v2j0
    /* synthetic */ boolean isInitialized();
}
