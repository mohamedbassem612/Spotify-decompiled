package p;

import com.spotify.campfire.datasource.impl.proto.ChatEventType;
import com.spotify.campfire.datasource.impl.proto.ContributionPayload;
import com.spotify.campfire.datasource.impl.proto.ErrorReason;
import com.spotify.campfire.datasource.impl.proto.GroupMemberStatus;
import com.spotify.campfire.datasource.impl.proto.HierarchyMessagingAvailability;
import com.spotify.campfire.datasource.impl.proto.HierarchyMessagingUnavailableReason;
import com.spotify.campfire.datasource.impl.proto.HierarchySource;
import com.spotify.campfire.datasource.impl.proto.HierarchyStatus;
import com.spotify.campfire.datasource.impl.proto.HierarchyType;
import com.spotify.campfire.datasource.impl.proto.HierarchyUserParticipationStatus;
import com.spotify.campfire.datasource.impl.proto.HierarchyUserRole;
import com.spotify.campfire.datasource.impl.proto.MessagePayload;
import com.spotify.campfire.datasource.impl.proto.ModerationStatus;
import com.spotify.campfire.datasource.impl.proto.ReceiptType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public abstract /* synthetic */ class cdd {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;
    public static final /* synthetic */ int[] g;
    public static final /* synthetic */ int[] h;
    public static final /* synthetic */ int[] i;
    public static final /* synthetic */ int[] j;
    public static final /* synthetic */ int[] k;
    public static final /* synthetic */ int[] l;
    public static final /* synthetic */ int[] m;
    public static final /* synthetic */ int[] n;

    static {
        int[] iArr = new int[MessagePayload.CmpCase.values().length];
        try {
            iArr[MessagePayload.CmpCase.ACTIVITY_PAYLOAD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MessagePayload.CmpCase.CONTRIBUTION_PAYLOAD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MessagePayload.CmpCase.CMP_NOT_SET.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[HierarchyType.values().length];
        try {
            iArr2[HierarchyType.HIERARCHY_TYPE_DM.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[HierarchyType.HIERARCHY_TYPE_GROUP.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[HierarchyType.UNRECOGNIZED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[HierarchyType.HIERARCHY_TYPE_UNSPECIFIED.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
        int[] iArr3 = new int[HierarchySource.values().length];
        try {
            iArr3[HierarchySource.UNRECOGNIZED.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[HierarchySource.HIERARCHY_SOURCE_UNSPECIFIED.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[HierarchySource.HIERARCHY_SOURCE_USER_CREATED.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[HierarchySource.HIERARCHY_SOURCE_IN_APP_SHARE.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[HierarchySource.HIERARCHY_SOURCE_OFF_PLATFORM_SHARE.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[HierarchySource.HIERARCHY_SOURCE_CHAT_INVITE.ordinal()] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[HierarchySource.HIERARCHY_SOURCE_FRIEND_REQUEST.ordinal()] = 7;
        } catch (NoSuchFieldError unused14) {
        }
        c = iArr3;
        int[] iArr4 = new int[HierarchyMessagingUnavailableReason.values().length];
        try {
            iArr4[HierarchyMessagingUnavailableReason.HIERARCHY_MESSAGING_UNAVAILABLE_REASON_CURRENT_USER_BLOCKING_OTHER_USER.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr4[HierarchyMessagingUnavailableReason.HIERARCHY_MESSAGING_UNAVAILABLE_REASON_OTHER_USER_OPTED_OUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr4[HierarchyMessagingUnavailableReason.HIERARCHY_MESSAGING_UNAVAILABLE_REASON_AWAITING_ACCEPTANCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr4[HierarchyMessagingUnavailableReason.HIERARCHY_MESSAGING_UNAVAILABLE_REASON_ACCEPTANCE_REQUIRED.ordinal()] = 4;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr4[HierarchyMessagingUnavailableReason.HIERARCHY_MESSAGING_UNAVAILABLE_REASON_NOT_FRIENDS.ordinal()] = 5;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr4[HierarchyMessagingUnavailableReason.HIERARCHY_MESSAGING_UNAVAILABLE_REASON_HIERARCHY_INACTIVE.ordinal()] = 6;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr4[HierarchyMessagingUnavailableReason.HIERARCHY_MESSAGING_UNAVAILABLE_REASON_START_REQUIRED.ordinal()] = 7;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr4[HierarchyMessagingUnavailableReason.HIERARCHY_MESSAGING_UNAVAILABLE_REASON_UNSPECIFIED.ordinal()] = 8;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr4[HierarchyMessagingUnavailableReason.UNRECOGNIZED.ordinal()] = 9;
        } catch (NoSuchFieldError unused23) {
        }
        d = iArr4;
        int[] iArr5 = new int[HierarchyMessagingAvailability.AvailabilityCase.values().length];
        try {
            iArr5[HierarchyMessagingAvailability.AvailabilityCase.DISALLOWED.ordinal()] = 1;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr5[HierarchyMessagingAvailability.AvailabilityCase.ALLOWED.ordinal()] = 2;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr5[HierarchyMessagingAvailability.AvailabilityCase.AVAILABILITY_NOT_SET.ordinal()] = 3;
        } catch (NoSuchFieldError unused26) {
        }
        e = iArr5;
        int[] iArr6 = new int[HierarchyStatus.values().length];
        try {
            iArr6[HierarchyStatus.HIERARCHY_STATUS_BLOCKED.ordinal()] = 1;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr6[HierarchyStatus.HIERARCHY_STATUS_UNSPECIFIED.ordinal()] = 2;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr6[HierarchyStatus.UNRECOGNIZED.ordinal()] = 3;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr6[HierarchyStatus.HIERARCHY_STATUS_INACTIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr6[HierarchyStatus.HIERARCHY_STATUS_DRAFT.ordinal()] = 5;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr6[HierarchyStatus.HIERARCHY_STATUS_ACTIVE.ordinal()] = 6;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr6[HierarchyStatus.HIERARCHY_STATUS_CANCELED.ordinal()] = 7;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr6[HierarchyStatus.HIERARCHY_STATUS_DELETED.ordinal()] = 8;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr6[HierarchyStatus.HIERARCHY_STATUS_REJECTED.ordinal()] = 9;
        } catch (NoSuchFieldError unused35) {
        }
        f = iArr6;
        int[] iArr7 = new int[HierarchyUserParticipationStatus.values().length];
        try {
            iArr7[HierarchyUserParticipationStatus.HIERARCHY_USER_PARTICIPATION_STATUS_INITIATOR.ordinal()] = 1;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr7[HierarchyUserParticipationStatus.HIERARCHY_USER_PARTICIPATION_STATUS_ACCEPTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr7[HierarchyUserParticipationStatus.HIERARCHY_USER_PARTICIPATION_STATUS_PENDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr7[HierarchyUserParticipationStatus.HIERARCHY_USER_PARTICIPATION_STATUS_REJECTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr7[HierarchyUserParticipationStatus.HIERARCHY_USER_PARTICIPATION_STATUS_DELETED.ordinal()] = 5;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr7[HierarchyUserParticipationStatus.HIERARCHY_USER_PARTICIPATION_STATUS_LEFT.ordinal()] = 6;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr7[HierarchyUserParticipationStatus.HIERARCHY_USER_PARTICIPATION_STATUS_BLOCKED.ordinal()] = 7;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr7[HierarchyUserParticipationStatus.HIERARCHY_USER_PARTICIPATION_STATUS_UNSPECIFIED.ordinal()] = 8;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr7[HierarchyUserParticipationStatus.UNRECOGNIZED.ordinal()] = 9;
        } catch (NoSuchFieldError unused44) {
        }
        g = iArr7;
        int[] iArr8 = new int[HierarchyUserRole.values().length];
        try {
            iArr8[HierarchyUserRole.HIERARCHY_USER_ROLE_ADMIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr8[HierarchyUserRole.UNRECOGNIZED.ordinal()] = 2;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr8[HierarchyUserRole.HIERARCHY_USER_ROLE_MEMBER.ordinal()] = 3;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr8[HierarchyUserRole.HIERARCHY_USER_ROLE_UNSPECIFIED.ordinal()] = 4;
        } catch (NoSuchFieldError unused48) {
        }
        h = iArr8;
        int[] iArr9 = new int[GroupMemberStatus.values().length];
        try {
            iArr9[GroupMemberStatus.OPTED_OUT.ordinal()] = 1;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr9[GroupMemberStatus.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr9[GroupMemberStatus.LEFT.ordinal()] = 3;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr9[GroupMemberStatus.UNSPECIFIED.ordinal()] = 4;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr9[GroupMemberStatus.UNRECOGNIZED.ordinal()] = 5;
        } catch (NoSuchFieldError unused53) {
        }
        i = iArr9;
        int[] iArr10 = new int[ModerationStatus.StatusCase.values().length];
        try {
            iArr10[ModerationStatus.StatusCase.REPORTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            iArr10[ModerationStatus.StatusCase.REMOVED.ordinal()] = 2;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr10[ModerationStatus.StatusCase.HIDDEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            iArr10[ModerationStatus.StatusCase.DELETED_FOR_USER.ordinal()] = 4;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            iArr10[ModerationStatus.StatusCase.DELETED_FOR_ALL.ordinal()] = 5;
        } catch (NoSuchFieldError unused58) {
        }
        j = iArr10;
        int[] iArr11 = new int[ContributionPayload.CcpCase.values().length];
        try {
            iArr11[ContributionPayload.CcpCase.FREE_TEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused59) {
        }
        try {
            iArr11[ContributionPayload.CcpCase.TRACKED_SHARE.ordinal()] = 2;
        } catch (NoSuchFieldError unused60) {
        }
        try {
            iArr11[ContributionPayload.CcpCase.OP_TRACKED_SHARE.ordinal()] = 3;
        } catch (NoSuchFieldError unused61) {
        }
        try {
            iArr11[ContributionPayload.CcpCase.CHAT_INVITE.ordinal()] = 4;
        } catch (NoSuchFieldError unused62) {
        }
        try {
            iArr11[ContributionPayload.CcpCase.CHAT_EVENT.ordinal()] = 5;
        } catch (NoSuchFieldError unused63) {
        }
        try {
            iArr11[ContributionPayload.CcpCase.RICH_MEDIA.ordinal()] = 6;
        } catch (NoSuchFieldError unused64) {
        }
        try {
            iArr11[ContributionPayload.CcpCase.TASTE_MATCH_CARD.ordinal()] = 7;
        } catch (NoSuchFieldError unused65) {
        }
        try {
            iArr11[ContributionPayload.CcpCase.CCP_NOT_SET.ordinal()] = 8;
        } catch (NoSuchFieldError unused66) {
        }
        k = iArr11;
        int[] iArr12 = new int[ChatEventType.CetCase.values().length];
        try {
            iArr12[ChatEventType.CetCase.CREATE_EVENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused67) {
        }
        try {
            iArr12[ChatEventType.CetCase.USER_INVITE.ordinal()] = 2;
        } catch (NoSuchFieldError unused68) {
        }
        try {
            iArr12[ChatEventType.CetCase.REMOVE_USER.ordinal()] = 3;
        } catch (NoSuchFieldError unused69) {
        }
        try {
            iArr12[ChatEventType.CetCase.JOIN_EVENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused70) {
        }
        try {
            iArr12[ChatEventType.CetCase.LEAVE_EVENT.ordinal()] = 5;
        } catch (NoSuchFieldError unused71) {
        }
        try {
            iArr12[ChatEventType.CetCase.NAME_CHANGE.ordinal()] = 6;
        } catch (NoSuchFieldError unused72) {
        }
        try {
            iArr12[ChatEventType.CetCase.NEW_ADMIN_EVENT.ordinal()] = 7;
        } catch (NoSuchFieldError unused73) {
        }
        try {
            iArr12[ChatEventType.CetCase.PHOTO_CHANGE.ordinal()] = 8;
        } catch (NoSuchFieldError unused74) {
        }
        try {
            iArr12[ChatEventType.CetCase.INVITE_LINK.ordinal()] = 9;
        } catch (NoSuchFieldError unused75) {
        }
        try {
            iArr12[ChatEventType.CetCase.CET_NOT_SET.ordinal()] = 10;
        } catch (NoSuchFieldError unused76) {
        }
        try {
            iArr12[ChatEventType.CetCase.REPORT_CHAT_EVENT.ordinal()] = 11;
        } catch (NoSuchFieldError unused77) {
        }
        l = iArr12;
        int[] iArr13 = new int[ReceiptType.values().length];
        try {
            iArr13[ReceiptType.RECEIPT_TYPE_PLAYED.ordinal()] = 1;
        } catch (NoSuchFieldError unused78) {
        }
        try {
            iArr13[ReceiptType.RECEIPT_TYPE_SAVED.ordinal()] = 2;
        } catch (NoSuchFieldError unused79) {
        }
        try {
            iArr13[ReceiptType.RECEIPT_TYPE_SEEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused80) {
        }
        try {
            iArr13[ReceiptType.RECEIPT_TYPE_UNDEFINED.ordinal()] = 4;
        } catch (NoSuchFieldError unused81) {
        }
        try {
            iArr13[ReceiptType.UNRECOGNIZED.ordinal()] = 5;
        } catch (NoSuchFieldError unused82) {
        }
        m = iArr13;
        int[] iArr14 = new int[ErrorReason.ECase.values().length];
        try {
            iArr14[ErrorReason.ECase.TOO_YOUNG.ordinal()] = 1;
        } catch (NoSuchFieldError unused83) {
        }
        try {
            iArr14[ErrorReason.ECase.SHOULD_ASSURE_AGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused84) {
        }
        try {
            iArr14[ErrorReason.ECase.OPT_OUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused85) {
        }
        try {
            iArr14[ErrorReason.ECase.RESTRICTED_FROM_MESSAGING.ordinal()] = 4;
        } catch (NoSuchFieldError unused86) {
        }
        try {
            iArr14[ErrorReason.ECase.LINK_EXPIRED.ordinal()] = 5;
        } catch (NoSuchFieldError unused87) {
        }
        try {
            iArr14[ErrorReason.ECase.UNRELEASED_MARKET.ordinal()] = 6;
        } catch (NoSuchFieldError unused88) {
        }
        try {
            iArr14[ErrorReason.ECase.MEMBER_LIMIT_EXCEEDED.ordinal()] = 7;
        } catch (NoSuchFieldError unused89) {
        }
        try {
            iArr14[ErrorReason.ECase.NOT_FRIENDS.ordinal()] = 8;
        } catch (NoSuchFieldError unused90) {
        }
        try {
            iArr14[ErrorReason.ECase.PARTICIPATION_STATUS.ordinal()] = 9;
        } catch (NoSuchFieldError unused91) {
        }
        try {
            iArr14[ErrorReason.ECase.UNSPECIFIED.ordinal()] = 10;
        } catch (NoSuchFieldError unused92) {
        }
        try {
            iArr14[ErrorReason.ECase.GROUPS_NOT_ENABLED.ordinal()] = 11;
        } catch (NoSuchFieldError unused93) {
        }
        try {
            iArr14[ErrorReason.ECase.JOIN_LIMIT_EXCEEDED.ordinal()] = 12;
        } catch (NoSuchFieldError unused94) {
        }
        try {
            iArr14[ErrorReason.ECase.VIOLATIVE_CONTENT.ordinal()] = 13;
        } catch (NoSuchFieldError unused95) {
        }
        try {
            iArr14[ErrorReason.ECase.NOT_AN_ADMIN.ordinal()] = 14;
        } catch (NoSuchFieldError unused96) {
        }
        try {
            iArr14[ErrorReason.ECase.NOT_TRUSTED.ordinal()] = 15;
        } catch (NoSuchFieldError unused97) {
        }
        try {
            iArr14[ErrorReason.ECase.USER_BLOCKED.ordinal()] = 16;
        } catch (NoSuchFieldError unused98) {
        }
        try {
            iArr14[ErrorReason.ECase.E_NOT_SET.ordinal()] = 17;
        } catch (NoSuchFieldError unused99) {
        }
        n = iArr14;
    }
}
