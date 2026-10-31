package com.spotify.campfire.datasource.impl.proto;

import java.util.List;
import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public interface CreateNewOrBuilder extends v2j0 {
    CreateGroupOptions getCreateGroupOptions();

    /* synthetic */ s2j0 getDefaultInstanceForType();

    boolean getFriendRequest();

    HierarchyType getHierarchyType();

    int getHierarchyTypeValue();

    String getMemberUsername(int i);

    phc getMemberUsernameBytes(int i);

    int getMemberUsernameCount();

    List<String> getMemberUsernameList();

    String getName();

    phc getNameBytes();

    boolean hasCreateGroupOptions();

    boolean hasFriendRequest();

    boolean hasName();

    /* synthetic */ boolean isInitialized();
}
