package com.spotify.campfire.datasource.impl.proto;

import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public interface HierarchyStatisticOrBuilder extends v2j0 {
    boolean getAllEventsSeen();

    /* synthetic */ s2j0 getDefaultInstanceForType();

    String getRevision();

    phc getRevisionBytes();

    int getTotalUserUnseenActivityEvents();

    int getTotalUserUnseenContributionEvents();

    int getTotalUserUnseenEvents();

    /* synthetic */ boolean isInitialized();
}
