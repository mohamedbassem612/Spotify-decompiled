package com.spotify.campfire.datasource.impl.proto;

import java.util.List;
import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public interface GroupOrBuilder extends v2j0 {
    /* synthetic */ s2j0 getDefaultInstanceForType();

    GroupMember getGroupMember(int i);

    int getGroupMemberCount();

    List<GroupMember> getGroupMemberList();

    InviteToken getInviteToken(int i);

    int getInviteTokenCount();

    List<InviteToken> getInviteTokenList();

    String getName();

    phc getNameBytes();

    boolean hasName();

    /* synthetic */ boolean isInitialized();
}
