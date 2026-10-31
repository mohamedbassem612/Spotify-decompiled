package com.spotify.campfire.datasource.impl.proto;

import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public interface GroupMemberOrBuilder extends v2j0 {
    /* synthetic */ s2j0 getDefaultInstanceForType();

    GroupMemberStatus getGroupMemberStatus();

    int getGroupMemberStatusValue();

    String getInvitedByUsername();

    phc getInvitedByUsernameBytes();

    String getMemberUsername();

    phc getMemberUsernameBytes();

    HierarchyUserRole getUserRole();

    int getUserRoleValue();

    /* synthetic */ boolean isInitialized();
}
