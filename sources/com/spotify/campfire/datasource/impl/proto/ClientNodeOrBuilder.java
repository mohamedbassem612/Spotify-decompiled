package com.spotify.campfire.datasource.impl.proto;

import java.util.List;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public interface ClientNodeOrBuilder extends v2j0 {
    ClientNode getChildNode(int i);

    int getChildNodeCount();

    List<ClientNode> getChildNodeList();

    /* synthetic */ s2j0 getDefaultInstanceForType();

    ClientEventCapture getEventCapture();

    HierarchyIdentifier getHierarchyIdentifier();

    MessagePayload getMessagePayload();

    ModerationStatus getModerationStatus();

    NodeIdentifier getNodeIdentifier();

    NodeStatistic getNodeStatistic();

    boolean hasEventCapture();

    boolean hasHierarchyIdentifier();

    boolean hasMessagePayload();

    boolean hasModerationStatus();

    boolean hasNodeIdentifier();

    boolean hasNodeStatistic();

    /* synthetic */ boolean isInitialized();
}
