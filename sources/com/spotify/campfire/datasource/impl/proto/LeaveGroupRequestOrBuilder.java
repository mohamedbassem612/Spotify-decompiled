package com.spotify.campfire.datasource.impl.proto;

import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface LeaveGroupRequestOrBuilder extends v2j0 {
    @Override // p.v2j0
    /* synthetic */ s2j0 getDefaultInstanceForType();

    String getHierarchyId();

    phc getHierarchyIdBytes();

    LeaveMode getLeaveMode();

    int getLeaveModeValue();

    @Override // p.v2j0
    /* synthetic */ boolean isInitialized();
}
