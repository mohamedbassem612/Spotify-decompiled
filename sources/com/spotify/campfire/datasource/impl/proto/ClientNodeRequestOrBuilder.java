package com.spotify.campfire.datasource.impl.proto;

import java.util.List;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface ClientNodeRequestOrBuilder extends v2j0 {
    @Override // p.v2j0
    /* synthetic */ s2j0 getDefaultInstanceForType();

    NodeRequest getNodeRequest(int i);

    int getNodeRequestCount();

    List<NodeRequest> getNodeRequestList();

    boolean getOmitLatestNodeUpdates();

    boolean getOmitPubsubEvents();

    boolean getOmitPusherEvents();

    @Override // p.v2j0
    /* synthetic */ boolean isInitialized();
}
