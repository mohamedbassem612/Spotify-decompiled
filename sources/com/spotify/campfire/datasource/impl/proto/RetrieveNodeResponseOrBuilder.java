package com.spotify.campfire.datasource.impl.proto;

import java.util.List;
import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public interface RetrieveNodeResponseOrBuilder extends v2j0 {
    ClientNode getClientNode(int i);

    int getClientNodeCount();

    List<ClientNode> getClientNodeList();

    /* synthetic */ s2j0 getDefaultInstanceForType();

    Hierarchy getHierarchy();

    String getNextPageToken();

    phc getNextPageTokenBytes();

    String getPreviousPageToken();

    phc getPreviousPageTokenBytes();

    boolean hasHierarchy();

    /* synthetic */ boolean isInitialized();
}
