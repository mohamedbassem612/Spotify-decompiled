package com.spotify.campfire.datasource.impl.proto;

import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public interface HierarchyRequestOrBuilder extends v2j0 {
    AddMembers getAddMembers();

    HierarchyRequest.ChrCase getChrCase();

    CreateNew getCreateNew();

    /* synthetic */ s2j0 getDefaultInstanceForType();

    DeleteChannel getDeleteChannel();

    SetParticipationStatus getParticipationStatus();

    RemoveMember getRemoveMember();

    RenameGroup getRenameGroup();

    SetUserRole getUserRole();

    boolean hasAddMembers();

    boolean hasCreateNew();

    boolean hasDeleteChannel();

    boolean hasParticipationStatus();

    boolean hasRemoveMember();

    boolean hasRenameGroup();

    boolean hasUserRole();

    /* synthetic */ boolean isInitialized();
}
