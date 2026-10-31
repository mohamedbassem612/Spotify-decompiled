package com.spotify.campfire.datasource.impl.proto;

import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public interface ChatEventTypeOrBuilder extends v2j0 {
    ChatEventType.CetCase getCetCase();

    CreateEvent getCreateEvent();

    /* synthetic */ s2j0 getDefaultInstanceForType();

    InviteLinkEvent getInviteLink();

    JoinEvent getJoinEvent();

    LeaveEvent getLeaveEvent();

    NameChangeEvent getNameChange();

    NewAdminEvent getNewAdminEvent();

    PhotoChangeEvent getPhotoChange();

    RemoveUserEvent getRemoveUser();

    ReportChatEvent getReportChatEvent();

    InviteEvent getUserInvite();

    boolean hasCreateEvent();

    boolean hasInviteLink();

    boolean hasJoinEvent();

    boolean hasLeaveEvent();

    boolean hasNameChange();

    boolean hasNewAdminEvent();

    boolean hasPhotoChange();

    boolean hasRemoveUser();

    boolean hasReportChatEvent();

    boolean hasUserInvite();

    /* synthetic */ boolean isInitialized();
}
