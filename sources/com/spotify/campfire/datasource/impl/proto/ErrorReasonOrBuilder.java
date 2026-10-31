package com.spotify.campfire.datasource.impl.proto;

import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public interface ErrorReasonOrBuilder extends v2j0 {
    /* synthetic */ s2j0 getDefaultInstanceForType();

    String getDescription();

    phc getDescriptionBytes();

    ErrorReason.ECase getECase();

    ErrorReason.UserRole getFailedUser();

    int getFailedUserValue();

    ErrorReason.GroupsNotEnabled getGroupsNotEnabled();

    ErrorReason.JoinLimitExceeded getJoinLimitExceeded();

    ErrorReason.LinkExpired getLinkExpired();

    ErrorReason.MemberLimitExceeded getMemberLimitExceeded();

    ErrorReason.NotAnAdmin getNotAnAdmin();

    ErrorReason.NotFriends getNotFriends();

    ErrorReason.NotTrusted getNotTrusted();

    ErrorReason.OptOut getOptOut();

    ErrorReason.ChatParticipationStatus getParticipationStatus();

    ErrorReason.RestrictedFromMessaging getRestrictedFromMessaging();

    ErrorReason.ShouldAssureAge getShouldAssureAge();

    ErrorReason.TooYoung getTooYoung();

    ErrorReason.UnreleasedMarket getUnreleasedMarket();

    ErrorReason.Unspecified getUnspecified();

    ErrorReason.UserBlocked getUserBlocked();

    ErrorReason.ViolativeContent getViolativeContent();

    boolean hasGroupsNotEnabled();

    boolean hasJoinLimitExceeded();

    boolean hasLinkExpired();

    boolean hasMemberLimitExceeded();

    boolean hasNotAnAdmin();

    boolean hasNotFriends();

    boolean hasNotTrusted();

    boolean hasOptOut();

    boolean hasParticipationStatus();

    boolean hasRestrictedFromMessaging();

    boolean hasShouldAssureAge();

    boolean hasTooYoung();

    boolean hasUnreleasedMarket();

    boolean hasUnspecified();

    boolean hasUserBlocked();

    boolean hasViolativeContent();

    /* synthetic */ boolean isInitialized();
}
