package com.spotify.campfire.datasource.impl.proto;

import java.util.List;
import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface CanMessageUsersRequestOrBuilder extends v2j0 {
    @Override // p.v2j0
    /* synthetic */ s2j0 getDefaultInstanceForType();

    HierarchyType getSharedHierarchyTypeFilter();

    int getSharedHierarchyTypeFilterValue();

    String getTargetUsernames(int i);

    phc getTargetUsernamesBytes(int i);

    int getTargetUsernamesCount();

    List<String> getTargetUsernamesList();

    boolean hasSharedHierarchyTypeFilter();

    @Override // p.v2j0
    /* synthetic */ boolean isInitialized();
}
