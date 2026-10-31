package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p.bf40;
import p.hhg1;
import p.jf40;
import p.lwg;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.r8;
import p.s2j0;
import p.s8;
import p.uz00;
import p.v190;
import p.v2j0;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ErrorReason extends h implements ErrorReasonOrBuilder {
    private static final ErrorReason DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 7;
    public static final int FAILED_USER_FIELD_NUMBER = 10;
    public static final int GROUPS_NOT_ENABLED_FIELD_NUMBER = 11;
    public static final int JOIN_LIMIT_EXCEEDED_FIELD_NUMBER = 13;
    public static final int LINK_EXPIRED_FIELD_NUMBER = 5;
    public static final int MEMBER_LIMIT_EXCEEDED_FIELD_NUMBER = 12;
    public static final int NOT_AN_ADMIN_FIELD_NUMBER = 15;
    public static final int NOT_FRIENDS_FIELD_NUMBER = 18;
    public static final int NOT_TRUSTED_FIELD_NUMBER = 16;
    public static final int OPT_OUT_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PARTICIPATION_STATUS_FIELD_NUMBER = 6;
    public static final int RESTRICTED_FROM_MESSAGING_FIELD_NUMBER = 4;
    public static final int SHOULD_ASSURE_AGE_FIELD_NUMBER = 2;
    public static final int TOO_YOUNG_FIELD_NUMBER = 9;
    public static final int UNRELEASED_MARKET_FIELD_NUMBER = 8;
    public static final int UNSPECIFIED_FIELD_NUMBER = 1;
    public static final int USER_BLOCKED_FIELD_NUMBER = 17;
    public static final int VIOLATIVE_CONTENT_FIELD_NUMBER = 14;
    private Object e_;
    private int failedUser_;
    private int eCase_ = 0;
    private String description_ = "";

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.ErrorReason$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[jf40.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public interface ChatParticipationStatusOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    public interface GroupsNotEnabledOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    public interface JoinLimitExceededOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    public interface LinkExpiredOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    public interface MemberLimitExceededOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    public interface NotAnAdminOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    public interface NotFriendsOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    public interface NotTrustedOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    public interface OptOutOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    public interface RestrictedFromMessagingOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    public interface ShouldAssureAgeOrBuilder extends v2j0 {
        int getAgeThreshold();

        /* synthetic */ s2j0 getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    public interface TooYoungOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    public interface UnreleasedMarketOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        String getMarket();

        phc getMarketBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface UnspecifiedOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    public interface UserBlockedOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    public interface ViolativeContentOrBuilder extends v2j0 {
        /* synthetic */ s2j0 getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    static {
        ErrorReason errorReason = new ErrorReason();
        DEFAULT_INSTANCE = errorReason;
        h.registerDefaultInstance(ErrorReason.class, errorReason);
    }

    private ErrorReason() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearE() {
        this.eCase_ = 0;
        this.e_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFailedUser() {
        this.failedUser_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGroupsNotEnabled() {
        if (this.eCase_ == 11) {
            this.eCase_ = 0;
            this.e_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJoinLimitExceeded() {
        if (this.eCase_ == 13) {
            this.eCase_ = 0;
            this.e_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinkExpired() {
        if (this.eCase_ == 5) {
            this.eCase_ = 0;
            this.e_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMemberLimitExceeded() {
        if (this.eCase_ == 12) {
            this.eCase_ = 0;
            this.e_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNotAnAdmin() {
        if (this.eCase_ == 15) {
            this.eCase_ = 0;
            this.e_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNotFriends() {
        if (this.eCase_ == 18) {
            this.eCase_ = 0;
            this.e_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNotTrusted() {
        if (this.eCase_ == 16) {
            this.eCase_ = 0;
            this.e_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptOut() {
        if (this.eCase_ == 3) {
            this.eCase_ = 0;
            this.e_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipationStatus() {
        if (this.eCase_ == 6) {
            this.eCase_ = 0;
            this.e_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRestrictedFromMessaging() {
        if (this.eCase_ == 4) {
            this.eCase_ = 0;
            this.e_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShouldAssureAge() {
        if (this.eCase_ == 2) {
            this.eCase_ = 0;
            this.e_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTooYoung() {
        if (this.eCase_ == 9) {
            this.eCase_ = 0;
            this.e_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnreleasedMarket() {
        if (this.eCase_ == 8) {
            this.eCase_ = 0;
            this.e_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnspecified() {
        if (this.eCase_ == 1) {
            this.eCase_ = 0;
            this.e_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserBlocked() {
        if (this.eCase_ == 17) {
            this.eCase_ = 0;
            this.e_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearViolativeContent() {
        if (this.eCase_ == 14) {
            this.eCase_ = 0;
            this.e_ = null;
        }
    }

    public static ErrorReason getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGroupsNotEnabled(GroupsNotEnabled groupsNotEnabled) {
        groupsNotEnabled.getClass();
        if (this.eCase_ != 11 || this.e_ == GroupsNotEnabled.getDefaultInstance()) {
            this.e_ = groupsNotEnabled;
        } else {
            this.e_ = ((GroupsNotEnabled.Builder) GroupsNotEnabled.newBuilder((GroupsNotEnabled) this.e_).mergeFrom(groupsNotEnabled)).buildPartial();
        }
        this.eCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeJoinLimitExceeded(JoinLimitExceeded joinLimitExceeded) {
        joinLimitExceeded.getClass();
        if (this.eCase_ != 13 || this.e_ == JoinLimitExceeded.getDefaultInstance()) {
            this.e_ = joinLimitExceeded;
        } else {
            this.e_ = ((JoinLimitExceeded.Builder) JoinLimitExceeded.newBuilder((JoinLimitExceeded) this.e_).mergeFrom(joinLimitExceeded)).buildPartial();
        }
        this.eCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLinkExpired(LinkExpired linkExpired) {
        linkExpired.getClass();
        if (this.eCase_ != 5 || this.e_ == LinkExpired.getDefaultInstance()) {
            this.e_ = linkExpired;
        } else {
            this.e_ = ((LinkExpired.Builder) LinkExpired.newBuilder((LinkExpired) this.e_).mergeFrom(linkExpired)).buildPartial();
        }
        this.eCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMemberLimitExceeded(MemberLimitExceeded memberLimitExceeded) {
        memberLimitExceeded.getClass();
        if (this.eCase_ != 12 || this.e_ == MemberLimitExceeded.getDefaultInstance()) {
            this.e_ = memberLimitExceeded;
        } else {
            this.e_ = ((MemberLimitExceeded.Builder) MemberLimitExceeded.newBuilder((MemberLimitExceeded) this.e_).mergeFrom(memberLimitExceeded)).buildPartial();
        }
        this.eCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNotAnAdmin(NotAnAdmin notAnAdmin) {
        notAnAdmin.getClass();
        if (this.eCase_ != 15 || this.e_ == NotAnAdmin.getDefaultInstance()) {
            this.e_ = notAnAdmin;
        } else {
            this.e_ = ((NotAnAdmin.Builder) NotAnAdmin.newBuilder((NotAnAdmin) this.e_).mergeFrom(notAnAdmin)).buildPartial();
        }
        this.eCase_ = 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNotFriends(NotFriends notFriends) {
        notFriends.getClass();
        if (this.eCase_ != 18 || this.e_ == NotFriends.getDefaultInstance()) {
            this.e_ = notFriends;
        } else {
            this.e_ = ((NotFriends.Builder) NotFriends.newBuilder((NotFriends) this.e_).mergeFrom(notFriends)).buildPartial();
        }
        this.eCase_ = 18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNotTrusted(NotTrusted notTrusted) {
        notTrusted.getClass();
        if (this.eCase_ != 16 || this.e_ == NotTrusted.getDefaultInstance()) {
            this.e_ = notTrusted;
        } else {
            this.e_ = ((NotTrusted.Builder) NotTrusted.newBuilder((NotTrusted) this.e_).mergeFrom(notTrusted)).buildPartial();
        }
        this.eCase_ = 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOptOut(OptOut optOut) {
        optOut.getClass();
        if (this.eCase_ != 3 || this.e_ == OptOut.getDefaultInstance()) {
            this.e_ = optOut;
        } else {
            this.e_ = ((OptOut.Builder) OptOut.newBuilder((OptOut) this.e_).mergeFrom(optOut)).buildPartial();
        }
        this.eCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParticipationStatus(ChatParticipationStatus chatParticipationStatus) {
        chatParticipationStatus.getClass();
        if (this.eCase_ != 6 || this.e_ == ChatParticipationStatus.getDefaultInstance()) {
            this.e_ = chatParticipationStatus;
        } else {
            this.e_ = ((ChatParticipationStatus.Builder) ChatParticipationStatus.newBuilder((ChatParticipationStatus) this.e_).mergeFrom(chatParticipationStatus)).buildPartial();
        }
        this.eCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRestrictedFromMessaging(RestrictedFromMessaging restrictedFromMessaging) {
        restrictedFromMessaging.getClass();
        if (this.eCase_ != 4 || this.e_ == RestrictedFromMessaging.getDefaultInstance()) {
            this.e_ = restrictedFromMessaging;
        } else {
            this.e_ = ((RestrictedFromMessaging.Builder) RestrictedFromMessaging.newBuilder((RestrictedFromMessaging) this.e_).mergeFrom(restrictedFromMessaging)).buildPartial();
        }
        this.eCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeShouldAssureAge(ShouldAssureAge shouldAssureAge) {
        shouldAssureAge.getClass();
        if (this.eCase_ != 2 || this.e_ == ShouldAssureAge.getDefaultInstance()) {
            this.e_ = shouldAssureAge;
        } else {
            this.e_ = ((ShouldAssureAge.Builder) ShouldAssureAge.newBuilder((ShouldAssureAge) this.e_).mergeFrom(shouldAssureAge)).buildPartial();
        }
        this.eCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTooYoung(TooYoung tooYoung) {
        tooYoung.getClass();
        if (this.eCase_ != 9 || this.e_ == TooYoung.getDefaultInstance()) {
            this.e_ = tooYoung;
        } else {
            this.e_ = ((TooYoung.Builder) TooYoung.newBuilder((TooYoung) this.e_).mergeFrom(tooYoung)).buildPartial();
        }
        this.eCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUnreleasedMarket(UnreleasedMarket unreleasedMarket) {
        unreleasedMarket.getClass();
        if (this.eCase_ != 8 || this.e_ == UnreleasedMarket.getDefaultInstance()) {
            this.e_ = unreleasedMarket;
        } else {
            this.e_ = ((UnreleasedMarket.Builder) UnreleasedMarket.newBuilder((UnreleasedMarket) this.e_).mergeFrom(unreleasedMarket)).buildPartial();
        }
        this.eCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUnspecified(Unspecified unspecified) {
        unspecified.getClass();
        if (this.eCase_ != 1 || this.e_ == Unspecified.getDefaultInstance()) {
            this.e_ = unspecified;
        } else {
            this.e_ = ((Unspecified.Builder) Unspecified.newBuilder((Unspecified) this.e_).mergeFrom(unspecified)).buildPartial();
        }
        this.eCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserBlocked(UserBlocked userBlocked) {
        userBlocked.getClass();
        if (this.eCase_ != 17 || this.e_ == UserBlocked.getDefaultInstance()) {
            this.e_ = userBlocked;
        } else {
            this.e_ = ((UserBlocked.Builder) UserBlocked.newBuilder((UserBlocked) this.e_).mergeFrom(userBlocked)).buildPartial();
        }
        this.eCase_ = 17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeViolativeContent(ViolativeContent violativeContent) {
        violativeContent.getClass();
        if (this.eCase_ != 14 || this.e_ == ViolativeContent.getDefaultInstance()) {
            this.e_ = violativeContent;
        } else {
            this.e_ = ((ViolativeContent.Builder) ViolativeContent.newBuilder((ViolativeContent) this.e_).mergeFrom(violativeContent)).buildPartial();
        }
        this.eCase_ = 14;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ErrorReason parseDelimitedFrom(InputStream inputStream) {
        return (ErrorReason) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ErrorReason parseFrom(ByteBuffer byteBuffer) {
        return (ErrorReason) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        str.getClass();
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.description_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailedUser(UserRole userRole) {
        this.failedUser_ = userRole.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailedUserValue(int i) {
        this.failedUser_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGroupsNotEnabled(GroupsNotEnabled groupsNotEnabled) {
        groupsNotEnabled.getClass();
        this.e_ = groupsNotEnabled;
        this.eCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJoinLimitExceeded(JoinLimitExceeded joinLimitExceeded) {
        joinLimitExceeded.getClass();
        this.e_ = joinLimitExceeded;
        this.eCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkExpired(LinkExpired linkExpired) {
        linkExpired.getClass();
        this.e_ = linkExpired;
        this.eCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMemberLimitExceeded(MemberLimitExceeded memberLimitExceeded) {
        memberLimitExceeded.getClass();
        this.e_ = memberLimitExceeded;
        this.eCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNotAnAdmin(NotAnAdmin notAnAdmin) {
        notAnAdmin.getClass();
        this.e_ = notAnAdmin;
        this.eCase_ = 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNotFriends(NotFriends notFriends) {
        notFriends.getClass();
        this.e_ = notFriends;
        this.eCase_ = 18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNotTrusted(NotTrusted notTrusted) {
        notTrusted.getClass();
        this.e_ = notTrusted;
        this.eCase_ = 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptOut(OptOut optOut) {
        optOut.getClass();
        this.e_ = optOut;
        this.eCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipationStatus(ChatParticipationStatus chatParticipationStatus) {
        chatParticipationStatus.getClass();
        this.e_ = chatParticipationStatus;
        this.eCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRestrictedFromMessaging(RestrictedFromMessaging restrictedFromMessaging) {
        restrictedFromMessaging.getClass();
        this.e_ = restrictedFromMessaging;
        this.eCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShouldAssureAge(ShouldAssureAge shouldAssureAge) {
        shouldAssureAge.getClass();
        this.e_ = shouldAssureAge;
        this.eCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTooYoung(TooYoung tooYoung) {
        tooYoung.getClass();
        this.e_ = tooYoung;
        this.eCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnreleasedMarket(UnreleasedMarket unreleasedMarket) {
        unreleasedMarket.getClass();
        this.e_ = unreleasedMarket;
        this.eCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnspecified(Unspecified unspecified) {
        unspecified.getClass();
        this.e_ = unspecified;
        this.eCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserBlocked(UserBlocked userBlocked) {
        userBlocked.getClass();
        this.e_ = userBlocked;
        this.eCase_ = 17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViolativeContent(ViolativeContent violativeContent) {
        violativeContent.getClass();
        this.e_ = violativeContent;
        this.eCase_ = 14;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0012\u0001\u0000\u0001\u0012\u0012\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007Ȉ\b<\u0000\t<\u0000\n\f\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000", new Object[]{"e_", "eCase_", Unspecified.class, ShouldAssureAge.class, OptOut.class, RestrictedFromMessaging.class, LinkExpired.class, ChatParticipationStatus.class, "description_", UnreleasedMarket.class, TooYoung.class, "failedUser_", GroupsNotEnabled.class, MemberLimitExceeded.class, JoinLimitExceeded.class, ViolativeContent.class, NotAnAdmin.class, NotTrusted.class, UserBlocked.class, NotFriends.class});
        }
        if (iOrdinal == 3) {
            return new ErrorReason();
        }
        if (iOrdinal == 4) {
            return new Builder(0);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        qzr0 qzr0Var = PARSER;
        if (qzr0Var != null) {
            return qzr0Var;
        }
        synchronized (ErrorReason.class) {
            try {
                bf40Var = PARSER;
                if (bf40Var == null) {
                    bf40Var = new bf40(DEFAULT_INSTANCE);
                    PARSER = bf40Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bf40Var;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public String getDescription() {
        return this.description_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public phc getDescriptionBytes() {
        return phc.i(this.description_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public ECase getECase() {
        return ECase.forNumber(this.eCase_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public UserRole getFailedUser() {
        UserRole userRoleForNumber = UserRole.forNumber(this.failedUser_);
        return userRoleForNumber == null ? UserRole.UNRECOGNIZED : userRoleForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public int getFailedUserValue() {
        return this.failedUser_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public GroupsNotEnabled getGroupsNotEnabled() {
        return this.eCase_ == 11 ? (GroupsNotEnabled) this.e_ : GroupsNotEnabled.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public JoinLimitExceeded getJoinLimitExceeded() {
        return this.eCase_ == 13 ? (JoinLimitExceeded) this.e_ : JoinLimitExceeded.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public LinkExpired getLinkExpired() {
        return this.eCase_ == 5 ? (LinkExpired) this.e_ : LinkExpired.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public MemberLimitExceeded getMemberLimitExceeded() {
        return this.eCase_ == 12 ? (MemberLimitExceeded) this.e_ : MemberLimitExceeded.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public NotAnAdmin getNotAnAdmin() {
        return this.eCase_ == 15 ? (NotAnAdmin) this.e_ : NotAnAdmin.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public NotFriends getNotFriends() {
        return this.eCase_ == 18 ? (NotFriends) this.e_ : NotFriends.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public NotTrusted getNotTrusted() {
        return this.eCase_ == 16 ? (NotTrusted) this.e_ : NotTrusted.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public OptOut getOptOut() {
        return this.eCase_ == 3 ? (OptOut) this.e_ : OptOut.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public ChatParticipationStatus getParticipationStatus() {
        return this.eCase_ == 6 ? (ChatParticipationStatus) this.e_ : ChatParticipationStatus.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public RestrictedFromMessaging getRestrictedFromMessaging() {
        return this.eCase_ == 4 ? (RestrictedFromMessaging) this.e_ : RestrictedFromMessaging.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public ShouldAssureAge getShouldAssureAge() {
        return this.eCase_ == 2 ? (ShouldAssureAge) this.e_ : ShouldAssureAge.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public TooYoung getTooYoung() {
        return this.eCase_ == 9 ? (TooYoung) this.e_ : TooYoung.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public UnreleasedMarket getUnreleasedMarket() {
        return this.eCase_ == 8 ? (UnreleasedMarket) this.e_ : UnreleasedMarket.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public Unspecified getUnspecified() {
        return this.eCase_ == 1 ? (Unspecified) this.e_ : Unspecified.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public UserBlocked getUserBlocked() {
        return this.eCase_ == 17 ? (UserBlocked) this.e_ : UserBlocked.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public ViolativeContent getViolativeContent() {
        return this.eCase_ == 14 ? (ViolativeContent) this.e_ : ViolativeContent.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public boolean hasGroupsNotEnabled() {
        return this.eCase_ == 11;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public boolean hasJoinLimitExceeded() {
        return this.eCase_ == 13;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public boolean hasLinkExpired() {
        return this.eCase_ == 5;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public boolean hasMemberLimitExceeded() {
        return this.eCase_ == 12;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public boolean hasNotAnAdmin() {
        return this.eCase_ == 15;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public boolean hasNotFriends() {
        return this.eCase_ == 18;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public boolean hasNotTrusted() {
        return this.eCase_ == 16;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public boolean hasOptOut() {
        return this.eCase_ == 3;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public boolean hasParticipationStatus() {
        return this.eCase_ == 6;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public boolean hasRestrictedFromMessaging() {
        return this.eCase_ == 4;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public boolean hasShouldAssureAge() {
        return this.eCase_ == 2;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public boolean hasTooYoung() {
        return this.eCase_ == 9;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public boolean hasUnreleasedMarket() {
        return this.eCase_ == 8;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public boolean hasUnspecified() {
        return this.eCase_ == 1;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public boolean hasUserBlocked() {
        return this.eCase_ == 17;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
    public boolean hasViolativeContent() {
        return this.eCase_ == 14;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class ChatParticipationStatus extends h implements ChatParticipationStatusOrBuilder {
        private static final ChatParticipationStatus DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;

        static {
            ChatParticipationStatus chatParticipationStatus = new ChatParticipationStatus();
            DEFAULT_INSTANCE = chatParticipationStatus;
            h.registerDefaultInstance(ChatParticipationStatus.class, chatParticipationStatus);
        }

        private ChatParticipationStatus() {
        }

        public static ChatParticipationStatus getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ChatParticipationStatus parseDelimitedFrom(InputStream inputStream) {
            return (ChatParticipationStatus) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChatParticipationStatus parseFrom(ByteBuffer byteBuffer) {
            return (ChatParticipationStatus) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
            }
            if (iOrdinal == 3) {
                return new ChatParticipationStatus();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
            }
            if (iOrdinal == 5) {
                return DEFAULT_INSTANCE;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            qzr0 qzr0Var = PARSER;
            if (qzr0Var != null) {
                return qzr0Var;
            }
            synchronized (ChatParticipationStatus.class) {
                try {
                    bf40Var = PARSER;
                    if (bf40Var == null) {
                        bf40Var = new bf40(DEFAULT_INSTANCE);
                        PARSER = bf40Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bf40Var;
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.ChatParticipationStatusOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements ChatParticipationStatusOrBuilder {
            private Builder() {
                super(ChatParticipationStatus.DEFAULT_INSTANCE);
            }

            public /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.ChatParticipationStatusOrBuilder
            public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m236mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m235clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m237mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r2j0 m234clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m238mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }
        }

        public static Builder newBuilder(ChatParticipationStatus chatParticipationStatus) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(chatParticipationStatus);
        }

        public static ChatParticipationStatus parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (ChatParticipationStatus) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static ChatParticipationStatus parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (ChatParticipationStatus) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static ChatParticipationStatus parseFrom(phc phcVar) {
            return (ChatParticipationStatus) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static ChatParticipationStatus parseFrom(phc phcVar, uz00 uz00Var) {
            return (ChatParticipationStatus) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static ChatParticipationStatus parseFrom(byte[] bArr) {
            return (ChatParticipationStatus) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ChatParticipationStatus parseFrom(byte[] bArr, uz00 uz00Var) {
            return (ChatParticipationStatus) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static ChatParticipationStatus parseFrom(InputStream inputStream) {
            return (ChatParticipationStatus) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChatParticipationStatus parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (ChatParticipationStatus) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static ChatParticipationStatus parseFrom(lwg lwgVar) {
            return (ChatParticipationStatus) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static ChatParticipationStatus parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (ChatParticipationStatus) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class GroupsNotEnabled extends h implements GroupsNotEnabledOrBuilder {
        private static final GroupsNotEnabled DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;

        static {
            GroupsNotEnabled groupsNotEnabled = new GroupsNotEnabled();
            DEFAULT_INSTANCE = groupsNotEnabled;
            h.registerDefaultInstance(GroupsNotEnabled.class, groupsNotEnabled);
        }

        private GroupsNotEnabled() {
        }

        public static GroupsNotEnabled getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static GroupsNotEnabled parseDelimitedFrom(InputStream inputStream) {
            return (GroupsNotEnabled) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GroupsNotEnabled parseFrom(ByteBuffer byteBuffer) {
            return (GroupsNotEnabled) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
            }
            if (iOrdinal == 3) {
                return new GroupsNotEnabled();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
            }
            if (iOrdinal == 5) {
                return DEFAULT_INSTANCE;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            qzr0 qzr0Var = PARSER;
            if (qzr0Var != null) {
                return qzr0Var;
            }
            synchronized (GroupsNotEnabled.class) {
                try {
                    bf40Var = PARSER;
                    if (bf40Var == null) {
                        bf40Var = new bf40(DEFAULT_INSTANCE);
                        PARSER = bf40Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bf40Var;
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.GroupsNotEnabledOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements GroupsNotEnabledOrBuilder {
            private Builder() {
                super(GroupsNotEnabled.DEFAULT_INSTANCE);
            }

            public /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.GroupsNotEnabledOrBuilder
            public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m241mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m240clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m242mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r2j0 m239clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m243mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }
        }

        public static Builder newBuilder(GroupsNotEnabled groupsNotEnabled) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(groupsNotEnabled);
        }

        public static GroupsNotEnabled parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (GroupsNotEnabled) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static GroupsNotEnabled parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (GroupsNotEnabled) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static GroupsNotEnabled parseFrom(phc phcVar) {
            return (GroupsNotEnabled) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static GroupsNotEnabled parseFrom(phc phcVar, uz00 uz00Var) {
            return (GroupsNotEnabled) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static GroupsNotEnabled parseFrom(byte[] bArr) {
            return (GroupsNotEnabled) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GroupsNotEnabled parseFrom(byte[] bArr, uz00 uz00Var) {
            return (GroupsNotEnabled) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static GroupsNotEnabled parseFrom(InputStream inputStream) {
            return (GroupsNotEnabled) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GroupsNotEnabled parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (GroupsNotEnabled) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static GroupsNotEnabled parseFrom(lwg lwgVar) {
            return (GroupsNotEnabled) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static GroupsNotEnabled parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (GroupsNotEnabled) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class JoinLimitExceeded extends h implements JoinLimitExceededOrBuilder {
        private static final JoinLimitExceeded DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;

        static {
            JoinLimitExceeded joinLimitExceeded = new JoinLimitExceeded();
            DEFAULT_INSTANCE = joinLimitExceeded;
            h.registerDefaultInstance(JoinLimitExceeded.class, joinLimitExceeded);
        }

        private JoinLimitExceeded() {
        }

        public static JoinLimitExceeded getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static JoinLimitExceeded parseDelimitedFrom(InputStream inputStream) {
            return (JoinLimitExceeded) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static JoinLimitExceeded parseFrom(ByteBuffer byteBuffer) {
            return (JoinLimitExceeded) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
            }
            if (iOrdinal == 3) {
                return new JoinLimitExceeded();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
            }
            if (iOrdinal == 5) {
                return DEFAULT_INSTANCE;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            qzr0 qzr0Var = PARSER;
            if (qzr0Var != null) {
                return qzr0Var;
            }
            synchronized (JoinLimitExceeded.class) {
                try {
                    bf40Var = PARSER;
                    if (bf40Var == null) {
                        bf40Var = new bf40(DEFAULT_INSTANCE);
                        PARSER = bf40Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bf40Var;
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.JoinLimitExceededOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements JoinLimitExceededOrBuilder {
            private Builder() {
                super(JoinLimitExceeded.DEFAULT_INSTANCE);
            }

            public /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.JoinLimitExceededOrBuilder
            public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m246mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m245clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m247mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r2j0 m244clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m248mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }
        }

        public static Builder newBuilder(JoinLimitExceeded joinLimitExceeded) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(joinLimitExceeded);
        }

        public static JoinLimitExceeded parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (JoinLimitExceeded) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static JoinLimitExceeded parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (JoinLimitExceeded) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static JoinLimitExceeded parseFrom(phc phcVar) {
            return (JoinLimitExceeded) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static JoinLimitExceeded parseFrom(phc phcVar, uz00 uz00Var) {
            return (JoinLimitExceeded) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static JoinLimitExceeded parseFrom(byte[] bArr) {
            return (JoinLimitExceeded) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static JoinLimitExceeded parseFrom(byte[] bArr, uz00 uz00Var) {
            return (JoinLimitExceeded) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static JoinLimitExceeded parseFrom(InputStream inputStream) {
            return (JoinLimitExceeded) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static JoinLimitExceeded parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (JoinLimitExceeded) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static JoinLimitExceeded parseFrom(lwg lwgVar) {
            return (JoinLimitExceeded) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static JoinLimitExceeded parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (JoinLimitExceeded) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class LinkExpired extends h implements LinkExpiredOrBuilder {
        private static final LinkExpired DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;

        static {
            LinkExpired linkExpired = new LinkExpired();
            DEFAULT_INSTANCE = linkExpired;
            h.registerDefaultInstance(LinkExpired.class, linkExpired);
        }

        private LinkExpired() {
        }

        public static LinkExpired getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static LinkExpired parseDelimitedFrom(InputStream inputStream) {
            return (LinkExpired) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LinkExpired parseFrom(ByteBuffer byteBuffer) {
            return (LinkExpired) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
            }
            if (iOrdinal == 3) {
                return new LinkExpired();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
            }
            if (iOrdinal == 5) {
                return DEFAULT_INSTANCE;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            qzr0 qzr0Var = PARSER;
            if (qzr0Var != null) {
                return qzr0Var;
            }
            synchronized (LinkExpired.class) {
                try {
                    bf40Var = PARSER;
                    if (bf40Var == null) {
                        bf40Var = new bf40(DEFAULT_INSTANCE);
                        PARSER = bf40Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bf40Var;
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.LinkExpiredOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements LinkExpiredOrBuilder {
            private Builder() {
                super(LinkExpired.DEFAULT_INSTANCE);
            }

            public /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.LinkExpiredOrBuilder
            public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m251mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m250clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m252mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r2j0 m249clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m253mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }
        }

        public static Builder newBuilder(LinkExpired linkExpired) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(linkExpired);
        }

        public static LinkExpired parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (LinkExpired) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static LinkExpired parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (LinkExpired) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static LinkExpired parseFrom(phc phcVar) {
            return (LinkExpired) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static LinkExpired parseFrom(phc phcVar, uz00 uz00Var) {
            return (LinkExpired) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static LinkExpired parseFrom(byte[] bArr) {
            return (LinkExpired) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LinkExpired parseFrom(byte[] bArr, uz00 uz00Var) {
            return (LinkExpired) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static LinkExpired parseFrom(InputStream inputStream) {
            return (LinkExpired) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LinkExpired parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (LinkExpired) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static LinkExpired parseFrom(lwg lwgVar) {
            return (LinkExpired) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static LinkExpired parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (LinkExpired) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class MemberLimitExceeded extends h implements MemberLimitExceededOrBuilder {
        private static final MemberLimitExceeded DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;

        static {
            MemberLimitExceeded memberLimitExceeded = new MemberLimitExceeded();
            DEFAULT_INSTANCE = memberLimitExceeded;
            h.registerDefaultInstance(MemberLimitExceeded.class, memberLimitExceeded);
        }

        private MemberLimitExceeded() {
        }

        public static MemberLimitExceeded getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static MemberLimitExceeded parseDelimitedFrom(InputStream inputStream) {
            return (MemberLimitExceeded) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MemberLimitExceeded parseFrom(ByteBuffer byteBuffer) {
            return (MemberLimitExceeded) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
            }
            if (iOrdinal == 3) {
                return new MemberLimitExceeded();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
            }
            if (iOrdinal == 5) {
                return DEFAULT_INSTANCE;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            qzr0 qzr0Var = PARSER;
            if (qzr0Var != null) {
                return qzr0Var;
            }
            synchronized (MemberLimitExceeded.class) {
                try {
                    bf40Var = PARSER;
                    if (bf40Var == null) {
                        bf40Var = new bf40(DEFAULT_INSTANCE);
                        PARSER = bf40Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bf40Var;
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.MemberLimitExceededOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements MemberLimitExceededOrBuilder {
            private Builder() {
                super(MemberLimitExceeded.DEFAULT_INSTANCE);
            }

            public /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.MemberLimitExceededOrBuilder
            public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m256mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m255clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m257mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r2j0 m254clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m258mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }
        }

        public static Builder newBuilder(MemberLimitExceeded memberLimitExceeded) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(memberLimitExceeded);
        }

        public static MemberLimitExceeded parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (MemberLimitExceeded) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static MemberLimitExceeded parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (MemberLimitExceeded) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static MemberLimitExceeded parseFrom(phc phcVar) {
            return (MemberLimitExceeded) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static MemberLimitExceeded parseFrom(phc phcVar, uz00 uz00Var) {
            return (MemberLimitExceeded) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static MemberLimitExceeded parseFrom(byte[] bArr) {
            return (MemberLimitExceeded) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MemberLimitExceeded parseFrom(byte[] bArr, uz00 uz00Var) {
            return (MemberLimitExceeded) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static MemberLimitExceeded parseFrom(InputStream inputStream) {
            return (MemberLimitExceeded) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MemberLimitExceeded parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (MemberLimitExceeded) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static MemberLimitExceeded parseFrom(lwg lwgVar) {
            return (MemberLimitExceeded) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static MemberLimitExceeded parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (MemberLimitExceeded) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class NotAnAdmin extends h implements NotAnAdminOrBuilder {
        private static final NotAnAdmin DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;

        static {
            NotAnAdmin notAnAdmin = new NotAnAdmin();
            DEFAULT_INSTANCE = notAnAdmin;
            h.registerDefaultInstance(NotAnAdmin.class, notAnAdmin);
        }

        private NotAnAdmin() {
        }

        public static NotAnAdmin getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static NotAnAdmin parseDelimitedFrom(InputStream inputStream) {
            return (NotAnAdmin) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotAnAdmin parseFrom(ByteBuffer byteBuffer) {
            return (NotAnAdmin) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
            }
            if (iOrdinal == 3) {
                return new NotAnAdmin();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
            }
            if (iOrdinal == 5) {
                return DEFAULT_INSTANCE;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            qzr0 qzr0Var = PARSER;
            if (qzr0Var != null) {
                return qzr0Var;
            }
            synchronized (NotAnAdmin.class) {
                try {
                    bf40Var = PARSER;
                    if (bf40Var == null) {
                        bf40Var = new bf40(DEFAULT_INSTANCE);
                        PARSER = bf40Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bf40Var;
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.NotAnAdminOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements NotAnAdminOrBuilder {
            private Builder() {
                super(NotAnAdmin.DEFAULT_INSTANCE);
            }

            public /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.NotAnAdminOrBuilder
            public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m261mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m260clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m262mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r2j0 m259clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m263mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }
        }

        public static Builder newBuilder(NotAnAdmin notAnAdmin) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(notAnAdmin);
        }

        public static NotAnAdmin parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (NotAnAdmin) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static NotAnAdmin parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (NotAnAdmin) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static NotAnAdmin parseFrom(phc phcVar) {
            return (NotAnAdmin) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static NotAnAdmin parseFrom(phc phcVar, uz00 uz00Var) {
            return (NotAnAdmin) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static NotAnAdmin parseFrom(byte[] bArr) {
            return (NotAnAdmin) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NotAnAdmin parseFrom(byte[] bArr, uz00 uz00Var) {
            return (NotAnAdmin) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static NotAnAdmin parseFrom(InputStream inputStream) {
            return (NotAnAdmin) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotAnAdmin parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (NotAnAdmin) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static NotAnAdmin parseFrom(lwg lwgVar) {
            return (NotAnAdmin) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static NotAnAdmin parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (NotAnAdmin) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class NotFriends extends h implements NotFriendsOrBuilder {
        private static final NotFriends DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;

        static {
            NotFriends notFriends = new NotFriends();
            DEFAULT_INSTANCE = notFriends;
            h.registerDefaultInstance(NotFriends.class, notFriends);
        }

        private NotFriends() {
        }

        public static NotFriends getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static NotFriends parseDelimitedFrom(InputStream inputStream) {
            return (NotFriends) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotFriends parseFrom(ByteBuffer byteBuffer) {
            return (NotFriends) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
            }
            if (iOrdinal == 3) {
                return new NotFriends();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
            }
            if (iOrdinal == 5) {
                return DEFAULT_INSTANCE;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            qzr0 qzr0Var = PARSER;
            if (qzr0Var != null) {
                return qzr0Var;
            }
            synchronized (NotFriends.class) {
                try {
                    bf40Var = PARSER;
                    if (bf40Var == null) {
                        bf40Var = new bf40(DEFAULT_INSTANCE);
                        PARSER = bf40Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bf40Var;
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.NotFriendsOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements NotFriendsOrBuilder {
            private Builder() {
                super(NotFriends.DEFAULT_INSTANCE);
            }

            public /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.NotFriendsOrBuilder
            public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m266mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m265clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m267mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r2j0 m264clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m268mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }
        }

        public static Builder newBuilder(NotFriends notFriends) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(notFriends);
        }

        public static NotFriends parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (NotFriends) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static NotFriends parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (NotFriends) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static NotFriends parseFrom(phc phcVar) {
            return (NotFriends) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static NotFriends parseFrom(phc phcVar, uz00 uz00Var) {
            return (NotFriends) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static NotFriends parseFrom(byte[] bArr) {
            return (NotFriends) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NotFriends parseFrom(byte[] bArr, uz00 uz00Var) {
            return (NotFriends) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static NotFriends parseFrom(InputStream inputStream) {
            return (NotFriends) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotFriends parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (NotFriends) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static NotFriends parseFrom(lwg lwgVar) {
            return (NotFriends) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static NotFriends parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (NotFriends) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class NotTrusted extends h implements NotTrustedOrBuilder {
        private static final NotTrusted DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;

        static {
            NotTrusted notTrusted = new NotTrusted();
            DEFAULT_INSTANCE = notTrusted;
            h.registerDefaultInstance(NotTrusted.class, notTrusted);
        }

        private NotTrusted() {
        }

        public static NotTrusted getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static NotTrusted parseDelimitedFrom(InputStream inputStream) {
            return (NotTrusted) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotTrusted parseFrom(ByteBuffer byteBuffer) {
            return (NotTrusted) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
            }
            if (iOrdinal == 3) {
                return new NotTrusted();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
            }
            if (iOrdinal == 5) {
                return DEFAULT_INSTANCE;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            qzr0 qzr0Var = PARSER;
            if (qzr0Var != null) {
                return qzr0Var;
            }
            synchronized (NotTrusted.class) {
                try {
                    bf40Var = PARSER;
                    if (bf40Var == null) {
                        bf40Var = new bf40(DEFAULT_INSTANCE);
                        PARSER = bf40Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bf40Var;
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.NotTrustedOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements NotTrustedOrBuilder {
            private Builder() {
                super(NotTrusted.DEFAULT_INSTANCE);
            }

            public /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.NotTrustedOrBuilder
            public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m271mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m270clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m272mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r2j0 m269clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m273mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }
        }

        public static Builder newBuilder(NotTrusted notTrusted) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(notTrusted);
        }

        public static NotTrusted parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (NotTrusted) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static NotTrusted parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (NotTrusted) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static NotTrusted parseFrom(phc phcVar) {
            return (NotTrusted) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static NotTrusted parseFrom(phc phcVar, uz00 uz00Var) {
            return (NotTrusted) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static NotTrusted parseFrom(byte[] bArr) {
            return (NotTrusted) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NotTrusted parseFrom(byte[] bArr, uz00 uz00Var) {
            return (NotTrusted) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static NotTrusted parseFrom(InputStream inputStream) {
            return (NotTrusted) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NotTrusted parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (NotTrusted) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static NotTrusted parseFrom(lwg lwgVar) {
            return (NotTrusted) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static NotTrusted parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (NotTrusted) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class OptOut extends h implements OptOutOrBuilder {
        private static final OptOut DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;

        static {
            OptOut optOut = new OptOut();
            DEFAULT_INSTANCE = optOut;
            h.registerDefaultInstance(OptOut.class, optOut);
        }

        private OptOut() {
        }

        public static OptOut getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static OptOut parseDelimitedFrom(InputStream inputStream) {
            return (OptOut) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OptOut parseFrom(ByteBuffer byteBuffer) {
            return (OptOut) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
            }
            if (iOrdinal == 3) {
                return new OptOut();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
            }
            if (iOrdinal == 5) {
                return DEFAULT_INSTANCE;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            qzr0 qzr0Var = PARSER;
            if (qzr0Var != null) {
                return qzr0Var;
            }
            synchronized (OptOut.class) {
                try {
                    bf40Var = PARSER;
                    if (bf40Var == null) {
                        bf40Var = new bf40(DEFAULT_INSTANCE);
                        PARSER = bf40Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bf40Var;
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.OptOutOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements OptOutOrBuilder {
            private Builder() {
                super(OptOut.DEFAULT_INSTANCE);
            }

            public /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.OptOutOrBuilder
            public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m276mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m275clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m277mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r2j0 m274clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m278mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }
        }

        public static Builder newBuilder(OptOut optOut) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(optOut);
        }

        public static OptOut parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (OptOut) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static OptOut parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (OptOut) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static OptOut parseFrom(phc phcVar) {
            return (OptOut) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static OptOut parseFrom(phc phcVar, uz00 uz00Var) {
            return (OptOut) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static OptOut parseFrom(byte[] bArr) {
            return (OptOut) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OptOut parseFrom(byte[] bArr, uz00 uz00Var) {
            return (OptOut) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static OptOut parseFrom(InputStream inputStream) {
            return (OptOut) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OptOut parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (OptOut) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static OptOut parseFrom(lwg lwgVar) {
            return (OptOut) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static OptOut parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (OptOut) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class RestrictedFromMessaging extends h implements RestrictedFromMessagingOrBuilder {
        private static final RestrictedFromMessaging DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;

        static {
            RestrictedFromMessaging restrictedFromMessaging = new RestrictedFromMessaging();
            DEFAULT_INSTANCE = restrictedFromMessaging;
            h.registerDefaultInstance(RestrictedFromMessaging.class, restrictedFromMessaging);
        }

        private RestrictedFromMessaging() {
        }

        public static RestrictedFromMessaging getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static RestrictedFromMessaging parseDelimitedFrom(InputStream inputStream) {
            return (RestrictedFromMessaging) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RestrictedFromMessaging parseFrom(ByteBuffer byteBuffer) {
            return (RestrictedFromMessaging) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
            }
            if (iOrdinal == 3) {
                return new RestrictedFromMessaging();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
            }
            if (iOrdinal == 5) {
                return DEFAULT_INSTANCE;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            qzr0 qzr0Var = PARSER;
            if (qzr0Var != null) {
                return qzr0Var;
            }
            synchronized (RestrictedFromMessaging.class) {
                try {
                    bf40Var = PARSER;
                    if (bf40Var == null) {
                        bf40Var = new bf40(DEFAULT_INSTANCE);
                        PARSER = bf40Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bf40Var;
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.RestrictedFromMessagingOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements RestrictedFromMessagingOrBuilder {
            private Builder() {
                super(RestrictedFromMessaging.DEFAULT_INSTANCE);
            }

            public /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.RestrictedFromMessagingOrBuilder
            public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m281mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m280clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m282mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r2j0 m279clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m283mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }
        }

        public static Builder newBuilder(RestrictedFromMessaging restrictedFromMessaging) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(restrictedFromMessaging);
        }

        public static RestrictedFromMessaging parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (RestrictedFromMessaging) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static RestrictedFromMessaging parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (RestrictedFromMessaging) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static RestrictedFromMessaging parseFrom(phc phcVar) {
            return (RestrictedFromMessaging) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static RestrictedFromMessaging parseFrom(phc phcVar, uz00 uz00Var) {
            return (RestrictedFromMessaging) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static RestrictedFromMessaging parseFrom(byte[] bArr) {
            return (RestrictedFromMessaging) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RestrictedFromMessaging parseFrom(byte[] bArr, uz00 uz00Var) {
            return (RestrictedFromMessaging) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static RestrictedFromMessaging parseFrom(InputStream inputStream) {
            return (RestrictedFromMessaging) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RestrictedFromMessaging parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (RestrictedFromMessaging) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static RestrictedFromMessaging parseFrom(lwg lwgVar) {
            return (RestrictedFromMessaging) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static RestrictedFromMessaging parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (RestrictedFromMessaging) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class ShouldAssureAge extends h implements ShouldAssureAgeOrBuilder {
        public static final int AGE_THRESHOLD_FIELD_NUMBER = 1;
        private static final ShouldAssureAge DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;
        private int ageThreshold_;

        static {
            ShouldAssureAge shouldAssureAge = new ShouldAssureAge();
            DEFAULT_INSTANCE = shouldAssureAge;
            h.registerDefaultInstance(ShouldAssureAge.class, shouldAssureAge);
        }

        private ShouldAssureAge() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAgeThreshold() {
            this.ageThreshold_ = 0;
        }

        public static ShouldAssureAge getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ShouldAssureAge parseDelimitedFrom(InputStream inputStream) {
            return (ShouldAssureAge) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ShouldAssureAge parseFrom(ByteBuffer byteBuffer) {
            return (ShouldAssureAge) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAgeThreshold(int i) {
            this.ageThreshold_ = i;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"ageThreshold_"});
            }
            if (iOrdinal == 3) {
                return new ShouldAssureAge();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
            }
            if (iOrdinal == 5) {
                return DEFAULT_INSTANCE;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            qzr0 qzr0Var = PARSER;
            if (qzr0Var != null) {
                return qzr0Var;
            }
            synchronized (ShouldAssureAge.class) {
                try {
                    bf40Var = PARSER;
                    if (bf40Var == null) {
                        bf40Var = new bf40(DEFAULT_INSTANCE);
                        PARSER = bf40Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bf40Var;
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.ShouldAssureAgeOrBuilder
        public int getAgeThreshold() {
            return this.ageThreshold_;
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.ShouldAssureAgeOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements ShouldAssureAgeOrBuilder {
            private Builder() {
                super(ShouldAssureAge.DEFAULT_INSTANCE);
            }

            public /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public Builder clearAgeThreshold() {
                copyOnWrite();
                ((ShouldAssureAge) ((g) this).instance).clearAgeThreshold();
                return this;
            }

            public /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.ShouldAssureAgeOrBuilder
            public int getAgeThreshold() {
                return ((ShouldAssureAge) ((g) this).instance).getAgeThreshold();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.ShouldAssureAgeOrBuilder
            public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m286mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public Builder setAgeThreshold(int i) {
                copyOnWrite();
                ((ShouldAssureAge) ((g) this).instance).setAgeThreshold(i);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m285clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m287mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r2j0 m284clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m288mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }
        }

        public static Builder newBuilder(ShouldAssureAge shouldAssureAge) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(shouldAssureAge);
        }

        public static ShouldAssureAge parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (ShouldAssureAge) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static ShouldAssureAge parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (ShouldAssureAge) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static ShouldAssureAge parseFrom(phc phcVar) {
            return (ShouldAssureAge) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static ShouldAssureAge parseFrom(phc phcVar, uz00 uz00Var) {
            return (ShouldAssureAge) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static ShouldAssureAge parseFrom(byte[] bArr) {
            return (ShouldAssureAge) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ShouldAssureAge parseFrom(byte[] bArr, uz00 uz00Var) {
            return (ShouldAssureAge) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static ShouldAssureAge parseFrom(InputStream inputStream) {
            return (ShouldAssureAge) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ShouldAssureAge parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (ShouldAssureAge) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static ShouldAssureAge parseFrom(lwg lwgVar) {
            return (ShouldAssureAge) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static ShouldAssureAge parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (ShouldAssureAge) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class TooYoung extends h implements TooYoungOrBuilder {
        private static final TooYoung DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;

        static {
            TooYoung tooYoung = new TooYoung();
            DEFAULT_INSTANCE = tooYoung;
            h.registerDefaultInstance(TooYoung.class, tooYoung);
        }

        private TooYoung() {
        }

        public static TooYoung getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TooYoung parseDelimitedFrom(InputStream inputStream) {
            return (TooYoung) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TooYoung parseFrom(ByteBuffer byteBuffer) {
            return (TooYoung) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
            }
            if (iOrdinal == 3) {
                return new TooYoung();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
            }
            if (iOrdinal == 5) {
                return DEFAULT_INSTANCE;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            qzr0 qzr0Var = PARSER;
            if (qzr0Var != null) {
                return qzr0Var;
            }
            synchronized (TooYoung.class) {
                try {
                    bf40Var = PARSER;
                    if (bf40Var == null) {
                        bf40Var = new bf40(DEFAULT_INSTANCE);
                        PARSER = bf40Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bf40Var;
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.TooYoungOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements TooYoungOrBuilder {
            private Builder() {
                super(TooYoung.DEFAULT_INSTANCE);
            }

            public /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.TooYoungOrBuilder
            public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m291mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m290clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m292mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r2j0 m289clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m293mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }
        }

        public static Builder newBuilder(TooYoung tooYoung) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tooYoung);
        }

        public static TooYoung parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (TooYoung) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static TooYoung parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (TooYoung) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static TooYoung parseFrom(phc phcVar) {
            return (TooYoung) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static TooYoung parseFrom(phc phcVar, uz00 uz00Var) {
            return (TooYoung) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static TooYoung parseFrom(byte[] bArr) {
            return (TooYoung) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TooYoung parseFrom(byte[] bArr, uz00 uz00Var) {
            return (TooYoung) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static TooYoung parseFrom(InputStream inputStream) {
            return (TooYoung) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TooYoung parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (TooYoung) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static TooYoung parseFrom(lwg lwgVar) {
            return (TooYoung) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static TooYoung parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (TooYoung) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class UnreleasedMarket extends h implements UnreleasedMarketOrBuilder {
        private static final UnreleasedMarket DEFAULT_INSTANCE;
        public static final int MARKET_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER;
        private String market_ = "";

        static {
            UnreleasedMarket unreleasedMarket = new UnreleasedMarket();
            DEFAULT_INSTANCE = unreleasedMarket;
            h.registerDefaultInstance(UnreleasedMarket.class, unreleasedMarket);
        }

        private UnreleasedMarket() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMarket() {
            this.market_ = getDefaultInstance().getMarket();
        }

        public static UnreleasedMarket getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static UnreleasedMarket parseDelimitedFrom(InputStream inputStream) {
            return (UnreleasedMarket) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UnreleasedMarket parseFrom(ByteBuffer byteBuffer) {
            return (UnreleasedMarket) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMarket(String str) {
            str.getClass();
            this.market_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMarketBytes(phc phcVar) {
            s8.checkByteStringIsUtf8(phcVar);
            this.market_ = phcVar.v();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"market_"});
            }
            if (iOrdinal == 3) {
                return new UnreleasedMarket();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
            }
            if (iOrdinal == 5) {
                return DEFAULT_INSTANCE;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            qzr0 qzr0Var = PARSER;
            if (qzr0Var != null) {
                return qzr0Var;
            }
            synchronized (UnreleasedMarket.class) {
                try {
                    bf40Var = PARSER;
                    if (bf40Var == null) {
                        bf40Var = new bf40(DEFAULT_INSTANCE);
                        PARSER = bf40Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bf40Var;
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.UnreleasedMarketOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.UnreleasedMarketOrBuilder
        public String getMarket() {
            return this.market_;
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.UnreleasedMarketOrBuilder
        public phc getMarketBytes() {
            return phc.i(this.market_);
        }

        public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements UnreleasedMarketOrBuilder {
            private Builder() {
                super(UnreleasedMarket.DEFAULT_INSTANCE);
            }

            public /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public Builder clearMarket() {
                copyOnWrite();
                ((UnreleasedMarket) ((g) this).instance).clearMarket();
                return this;
            }

            public /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.UnreleasedMarketOrBuilder
            public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.UnreleasedMarketOrBuilder
            public String getMarket() {
                return ((UnreleasedMarket) ((g) this).instance).getMarket();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.UnreleasedMarketOrBuilder
            public phc getMarketBytes() {
                return ((UnreleasedMarket) ((g) this).instance).getMarketBytes();
            }

            public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m296mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public Builder setMarket(String str) {
                copyOnWrite();
                ((UnreleasedMarket) ((g) this).instance).setMarket(str);
                return this;
            }

            public Builder setMarketBytes(phc phcVar) {
                copyOnWrite();
                ((UnreleasedMarket) ((g) this).instance).setMarketBytes(phcVar);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m295clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m297mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r2j0 m294clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m298mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }
        }

        public static Builder newBuilder(UnreleasedMarket unreleasedMarket) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(unreleasedMarket);
        }

        public static UnreleasedMarket parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (UnreleasedMarket) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static UnreleasedMarket parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (UnreleasedMarket) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static UnreleasedMarket parseFrom(phc phcVar) {
            return (UnreleasedMarket) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static UnreleasedMarket parseFrom(phc phcVar, uz00 uz00Var) {
            return (UnreleasedMarket) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static UnreleasedMarket parseFrom(byte[] bArr) {
            return (UnreleasedMarket) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UnreleasedMarket parseFrom(byte[] bArr, uz00 uz00Var) {
            return (UnreleasedMarket) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static UnreleasedMarket parseFrom(InputStream inputStream) {
            return (UnreleasedMarket) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UnreleasedMarket parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (UnreleasedMarket) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static UnreleasedMarket parseFrom(lwg lwgVar) {
            return (UnreleasedMarket) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static UnreleasedMarket parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (UnreleasedMarket) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class Unspecified extends h implements UnspecifiedOrBuilder {
        private static final Unspecified DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;

        static {
            Unspecified unspecified = new Unspecified();
            DEFAULT_INSTANCE = unspecified;
            h.registerDefaultInstance(Unspecified.class, unspecified);
        }

        private Unspecified() {
        }

        public static Unspecified getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Unspecified parseDelimitedFrom(InputStream inputStream) {
            return (Unspecified) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Unspecified parseFrom(ByteBuffer byteBuffer) {
            return (Unspecified) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
            }
            if (iOrdinal == 3) {
                return new Unspecified();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
            }
            if (iOrdinal == 5) {
                return DEFAULT_INSTANCE;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            qzr0 qzr0Var = PARSER;
            if (qzr0Var != null) {
                return qzr0Var;
            }
            synchronized (Unspecified.class) {
                try {
                    bf40Var = PARSER;
                    if (bf40Var == null) {
                        bf40Var = new bf40(DEFAULT_INSTANCE);
                        PARSER = bf40Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bf40Var;
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.UnspecifiedOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements UnspecifiedOrBuilder {
            private Builder() {
                super(Unspecified.DEFAULT_INSTANCE);
            }

            public /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.UnspecifiedOrBuilder
            public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m301mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m300clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m302mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r2j0 m299clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m303mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }
        }

        public static Builder newBuilder(Unspecified unspecified) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(unspecified);
        }

        public static Unspecified parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (Unspecified) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static Unspecified parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (Unspecified) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static Unspecified parseFrom(phc phcVar) {
            return (Unspecified) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static Unspecified parseFrom(phc phcVar, uz00 uz00Var) {
            return (Unspecified) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static Unspecified parseFrom(byte[] bArr) {
            return (Unspecified) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Unspecified parseFrom(byte[] bArr, uz00 uz00Var) {
            return (Unspecified) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static Unspecified parseFrom(InputStream inputStream) {
            return (Unspecified) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Unspecified parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (Unspecified) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static Unspecified parseFrom(lwg lwgVar) {
            return (Unspecified) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static Unspecified parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (Unspecified) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class UserBlocked extends h implements UserBlockedOrBuilder {
        private static final UserBlocked DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;

        static {
            UserBlocked userBlocked = new UserBlocked();
            DEFAULT_INSTANCE = userBlocked;
            h.registerDefaultInstance(UserBlocked.class, userBlocked);
        }

        private UserBlocked() {
        }

        public static UserBlocked getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static UserBlocked parseDelimitedFrom(InputStream inputStream) {
            return (UserBlocked) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserBlocked parseFrom(ByteBuffer byteBuffer) {
            return (UserBlocked) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
            }
            if (iOrdinal == 3) {
                return new UserBlocked();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
            }
            if (iOrdinal == 5) {
                return DEFAULT_INSTANCE;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            qzr0 qzr0Var = PARSER;
            if (qzr0Var != null) {
                return qzr0Var;
            }
            synchronized (UserBlocked.class) {
                try {
                    bf40Var = PARSER;
                    if (bf40Var == null) {
                        bf40Var = new bf40(DEFAULT_INSTANCE);
                        PARSER = bf40Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bf40Var;
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.UserBlockedOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements UserBlockedOrBuilder {
            private Builder() {
                super(UserBlocked.DEFAULT_INSTANCE);
            }

            public /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.UserBlockedOrBuilder
            public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m306mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m305clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m307mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r2j0 m304clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m308mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }
        }

        public static Builder newBuilder(UserBlocked userBlocked) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(userBlocked);
        }

        public static UserBlocked parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (UserBlocked) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static UserBlocked parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (UserBlocked) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static UserBlocked parseFrom(phc phcVar) {
            return (UserBlocked) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static UserBlocked parseFrom(phc phcVar, uz00 uz00Var) {
            return (UserBlocked) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static UserBlocked parseFrom(byte[] bArr) {
            return (UserBlocked) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UserBlocked parseFrom(byte[] bArr, uz00 uz00Var) {
            return (UserBlocked) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static UserBlocked parseFrom(InputStream inputStream) {
            return (UserBlocked) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserBlocked parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (UserBlocked) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static UserBlocked parseFrom(lwg lwgVar) {
            return (UserBlocked) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static UserBlocked parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (UserBlocked) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class ViolativeContent extends h implements ViolativeContentOrBuilder {
        private static final ViolativeContent DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;

        static {
            ViolativeContent violativeContent = new ViolativeContent();
            DEFAULT_INSTANCE = violativeContent;
            h.registerDefaultInstance(ViolativeContent.class, violativeContent);
        }

        private ViolativeContent() {
        }

        public static ViolativeContent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ViolativeContent parseDelimitedFrom(InputStream inputStream) {
            return (ViolativeContent) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ViolativeContent parseFrom(ByteBuffer byteBuffer) {
            return (ViolativeContent) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
            }
            if (iOrdinal == 3) {
                return new ViolativeContent();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
            }
            if (iOrdinal == 5) {
                return DEFAULT_INSTANCE;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            qzr0 qzr0Var = PARSER;
            if (qzr0Var != null) {
                return qzr0Var;
            }
            synchronized (ViolativeContent.class) {
                try {
                    bf40Var = PARSER;
                    if (bf40Var == null) {
                        bf40Var = new bf40(DEFAULT_INSTANCE);
                        PARSER = bf40Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bf40Var;
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.ViolativeContentOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements ViolativeContentOrBuilder {
            private Builder() {
                super(ViolativeContent.DEFAULT_INSTANCE);
            }

            public /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.ErrorReason.ViolativeContentOrBuilder
            public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m312mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m311clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m313mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r2j0 m310clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m314mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }
        }

        public static Builder newBuilder(ViolativeContent violativeContent) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(violativeContent);
        }

        public static ViolativeContent parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (ViolativeContent) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static ViolativeContent parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (ViolativeContent) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static ViolativeContent parseFrom(phc phcVar) {
            return (ViolativeContent) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static ViolativeContent parseFrom(phc phcVar, uz00 uz00Var) {
            return (ViolativeContent) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static ViolativeContent parseFrom(byte[] bArr) {
            return (ViolativeContent) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ViolativeContent parseFrom(byte[] bArr, uz00 uz00Var) {
            return (ViolativeContent) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static ViolativeContent parseFrom(InputStream inputStream) {
            return (ViolativeContent) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ViolativeContent parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (ViolativeContent) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static ViolativeContent parseFrom(lwg lwgVar) {
            return (ViolativeContent) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static ViolativeContent parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (ViolativeContent) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class Builder extends g implements ErrorReasonOrBuilder {
        private Builder() {
            super(ErrorReason.DEFAULT_INSTANCE);
        }

        public /* bridge */ /* synthetic */ s2j0 build() {
            return build();
        }

        public /* bridge */ /* synthetic */ s2j0 buildPartial() {
            return super.buildPartial();
        }

        public /* bridge */ /* synthetic */ r2j0 clear() {
            return clear();
        }

        public Builder clearDescription() {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).clearDescription();
            return this;
        }

        public Builder clearE() {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).clearE();
            return this;
        }

        public Builder clearFailedUser() {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).clearFailedUser();
            return this;
        }

        public Builder clearGroupsNotEnabled() {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).clearGroupsNotEnabled();
            return this;
        }

        public Builder clearJoinLimitExceeded() {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).clearJoinLimitExceeded();
            return this;
        }

        public Builder clearLinkExpired() {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).clearLinkExpired();
            return this;
        }

        public Builder clearMemberLimitExceeded() {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).clearMemberLimitExceeded();
            return this;
        }

        public Builder clearNotAnAdmin() {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).clearNotAnAdmin();
            return this;
        }

        public Builder clearNotFriends() {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).clearNotFriends();
            return this;
        }

        public Builder clearNotTrusted() {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).clearNotTrusted();
            return this;
        }

        public Builder clearOptOut() {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).clearOptOut();
            return this;
        }

        public Builder clearParticipationStatus() {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).clearParticipationStatus();
            return this;
        }

        public Builder clearRestrictedFromMessaging() {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).clearRestrictedFromMessaging();
            return this;
        }

        public Builder clearShouldAssureAge() {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).clearShouldAssureAge();
            return this;
        }

        public Builder clearTooYoung() {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).clearTooYoung();
            return this;
        }

        public Builder clearUnreleasedMarket() {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).clearUnreleasedMarket();
            return this;
        }

        public Builder clearUnspecified() {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).clearUnspecified();
            return this;
        }

        public Builder clearUserBlocked() {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).clearUserBlocked();
            return this;
        }

        public Builder clearViolativeContent() {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).clearViolativeContent();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public String getDescription() {
            return ((ErrorReason) ((g) this).instance).getDescription();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public phc getDescriptionBytes() {
            return ((ErrorReason) ((g) this).instance).getDescriptionBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public ECase getECase() {
            return ((ErrorReason) ((g) this).instance).getECase();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public UserRole getFailedUser() {
            return ((ErrorReason) ((g) this).instance).getFailedUser();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public int getFailedUserValue() {
            return ((ErrorReason) ((g) this).instance).getFailedUserValue();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public GroupsNotEnabled getGroupsNotEnabled() {
            return ((ErrorReason) ((g) this).instance).getGroupsNotEnabled();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public JoinLimitExceeded getJoinLimitExceeded() {
            return ((ErrorReason) ((g) this).instance).getJoinLimitExceeded();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public LinkExpired getLinkExpired() {
            return ((ErrorReason) ((g) this).instance).getLinkExpired();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public MemberLimitExceeded getMemberLimitExceeded() {
            return ((ErrorReason) ((g) this).instance).getMemberLimitExceeded();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public NotAnAdmin getNotAnAdmin() {
            return ((ErrorReason) ((g) this).instance).getNotAnAdmin();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public NotFriends getNotFriends() {
            return ((ErrorReason) ((g) this).instance).getNotFriends();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public NotTrusted getNotTrusted() {
            return ((ErrorReason) ((g) this).instance).getNotTrusted();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public OptOut getOptOut() {
            return ((ErrorReason) ((g) this).instance).getOptOut();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public ChatParticipationStatus getParticipationStatus() {
            return ((ErrorReason) ((g) this).instance).getParticipationStatus();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public RestrictedFromMessaging getRestrictedFromMessaging() {
            return ((ErrorReason) ((g) this).instance).getRestrictedFromMessaging();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public ShouldAssureAge getShouldAssureAge() {
            return ((ErrorReason) ((g) this).instance).getShouldAssureAge();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public TooYoung getTooYoung() {
            return ((ErrorReason) ((g) this).instance).getTooYoung();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public UnreleasedMarket getUnreleasedMarket() {
            return ((ErrorReason) ((g) this).instance).getUnreleasedMarket();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public Unspecified getUnspecified() {
            return ((ErrorReason) ((g) this).instance).getUnspecified();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public UserBlocked getUserBlocked() {
            return ((ErrorReason) ((g) this).instance).getUserBlocked();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public ViolativeContent getViolativeContent() {
            return ((ErrorReason) ((g) this).instance).getViolativeContent();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public boolean hasGroupsNotEnabled() {
            return ((ErrorReason) ((g) this).instance).hasGroupsNotEnabled();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public boolean hasJoinLimitExceeded() {
            return ((ErrorReason) ((g) this).instance).hasJoinLimitExceeded();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public boolean hasLinkExpired() {
            return ((ErrorReason) ((g) this).instance).hasLinkExpired();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public boolean hasMemberLimitExceeded() {
            return ((ErrorReason) ((g) this).instance).hasMemberLimitExceeded();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public boolean hasNotAnAdmin() {
            return ((ErrorReason) ((g) this).instance).hasNotAnAdmin();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public boolean hasNotFriends() {
            return ((ErrorReason) ((g) this).instance).hasNotFriends();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public boolean hasNotTrusted() {
            return ((ErrorReason) ((g) this).instance).hasNotTrusted();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public boolean hasOptOut() {
            return ((ErrorReason) ((g) this).instance).hasOptOut();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public boolean hasParticipationStatus() {
            return ((ErrorReason) ((g) this).instance).hasParticipationStatus();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public boolean hasRestrictedFromMessaging() {
            return ((ErrorReason) ((g) this).instance).hasRestrictedFromMessaging();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public boolean hasShouldAssureAge() {
            return ((ErrorReason) ((g) this).instance).hasShouldAssureAge();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public boolean hasTooYoung() {
            return ((ErrorReason) ((g) this).instance).hasTooYoung();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public boolean hasUnreleasedMarket() {
            return ((ErrorReason) ((g) this).instance).hasUnreleasedMarket();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public boolean hasUnspecified() {
            return ((ErrorReason) ((g) this).instance).hasUnspecified();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public boolean hasUserBlocked() {
            return ((ErrorReason) ((g) this).instance).hasUserBlocked();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ErrorReasonOrBuilder
        public boolean hasViolativeContent() {
            return ((ErrorReason) ((g) this).instance).hasViolativeContent();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m231mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder mergeGroupsNotEnabled(GroupsNotEnabled groupsNotEnabled) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).mergeGroupsNotEnabled(groupsNotEnabled);
            return this;
        }

        public Builder mergeJoinLimitExceeded(JoinLimitExceeded joinLimitExceeded) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).mergeJoinLimitExceeded(joinLimitExceeded);
            return this;
        }

        public Builder mergeLinkExpired(LinkExpired linkExpired) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).mergeLinkExpired(linkExpired);
            return this;
        }

        public Builder mergeMemberLimitExceeded(MemberLimitExceeded memberLimitExceeded) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).mergeMemberLimitExceeded(memberLimitExceeded);
            return this;
        }

        public Builder mergeNotAnAdmin(NotAnAdmin notAnAdmin) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).mergeNotAnAdmin(notAnAdmin);
            return this;
        }

        public Builder mergeNotFriends(NotFriends notFriends) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).mergeNotFriends(notFriends);
            return this;
        }

        public Builder mergeNotTrusted(NotTrusted notTrusted) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).mergeNotTrusted(notTrusted);
            return this;
        }

        public Builder mergeOptOut(OptOut optOut) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).mergeOptOut(optOut);
            return this;
        }

        public Builder mergeParticipationStatus(ChatParticipationStatus chatParticipationStatus) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).mergeParticipationStatus(chatParticipationStatus);
            return this;
        }

        public Builder mergeRestrictedFromMessaging(RestrictedFromMessaging restrictedFromMessaging) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).mergeRestrictedFromMessaging(restrictedFromMessaging);
            return this;
        }

        public Builder mergeShouldAssureAge(ShouldAssureAge shouldAssureAge) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).mergeShouldAssureAge(shouldAssureAge);
            return this;
        }

        public Builder mergeTooYoung(TooYoung tooYoung) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).mergeTooYoung(tooYoung);
            return this;
        }

        public Builder mergeUnreleasedMarket(UnreleasedMarket unreleasedMarket) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).mergeUnreleasedMarket(unreleasedMarket);
            return this;
        }

        public Builder mergeUnspecified(Unspecified unspecified) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).mergeUnspecified(unspecified);
            return this;
        }

        public Builder mergeUserBlocked(UserBlocked userBlocked) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).mergeUserBlocked(userBlocked);
            return this;
        }

        public Builder mergeViolativeContent(ViolativeContent violativeContent) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).mergeViolativeContent(violativeContent);
            return this;
        }

        public Builder setDescription(String str) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).setDescription(str);
            return this;
        }

        public Builder setDescriptionBytes(phc phcVar) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).setDescriptionBytes(phcVar);
            return this;
        }

        public Builder setFailedUser(UserRole userRole) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).setFailedUser(userRole);
            return this;
        }

        public Builder setFailedUserValue(int i) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).setFailedUserValue(i);
            return this;
        }

        public Builder setGroupsNotEnabled(GroupsNotEnabled.Builder builder) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).setGroupsNotEnabled((GroupsNotEnabled) builder.build());
            return this;
        }

        public Builder setJoinLimitExceeded(JoinLimitExceeded.Builder builder) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).setJoinLimitExceeded((JoinLimitExceeded) builder.build());
            return this;
        }

        public Builder setLinkExpired(LinkExpired.Builder builder) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).setLinkExpired((LinkExpired) builder.build());
            return this;
        }

        public Builder setMemberLimitExceeded(MemberLimitExceeded.Builder builder) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).setMemberLimitExceeded((MemberLimitExceeded) builder.build());
            return this;
        }

        public Builder setNotAnAdmin(NotAnAdmin.Builder builder) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).setNotAnAdmin((NotAnAdmin) builder.build());
            return this;
        }

        public Builder setNotFriends(NotFriends.Builder builder) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).setNotFriends((NotFriends) builder.build());
            return this;
        }

        public Builder setNotTrusted(NotTrusted.Builder builder) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).setNotTrusted((NotTrusted) builder.build());
            return this;
        }

        public Builder setOptOut(OptOut.Builder builder) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).setOptOut((OptOut) builder.build());
            return this;
        }

        public Builder setParticipationStatus(ChatParticipationStatus.Builder builder) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).setParticipationStatus((ChatParticipationStatus) builder.build());
            return this;
        }

        public Builder setRestrictedFromMessaging(RestrictedFromMessaging.Builder builder) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).setRestrictedFromMessaging((RestrictedFromMessaging) builder.build());
            return this;
        }

        public Builder setShouldAssureAge(ShouldAssureAge.Builder builder) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).setShouldAssureAge((ShouldAssureAge) builder.build());
            return this;
        }

        public Builder setTooYoung(TooYoung.Builder builder) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).setTooYoung((TooYoung) builder.build());
            return this;
        }

        public Builder setUnreleasedMarket(UnreleasedMarket.Builder builder) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).setUnreleasedMarket((UnreleasedMarket) builder.build());
            return this;
        }

        public Builder setUnspecified(Unspecified.Builder builder) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).setUnspecified((Unspecified) builder.build());
            return this;
        }

        public Builder setUserBlocked(UserBlocked.Builder builder) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).setUserBlocked((UserBlocked) builder.build());
            return this;
        }

        public Builder setViolativeContent(ViolativeContent.Builder builder) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).setViolativeContent((ViolativeContent) builder.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m230clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m232mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m229clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m233mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
            return super.mergeFrom(bArr, i, i2, uz00Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
            return super/*p.r8*/.mergeFrom(inputStream);
        }

        public /* synthetic */ Builder(int i) {
            this();
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
            return super/*p.r8*/.mergeFrom(phcVar);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
            return super/*p.r8*/.mergeFrom(lwgVar);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
            return super/*p.r8*/.mergeFrom(s2j0Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
            return super/*p.r8*/.mergeFrom(bArr);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
            return super.mergeFrom(bArr, i, i2, uz00Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(bArr, uz00Var);
        }

        public Builder setGroupsNotEnabled(GroupsNotEnabled groupsNotEnabled) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).setGroupsNotEnabled(groupsNotEnabled);
            return this;
        }

        public Builder setJoinLimitExceeded(JoinLimitExceeded joinLimitExceeded) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).setJoinLimitExceeded(joinLimitExceeded);
            return this;
        }

        public Builder setLinkExpired(LinkExpired linkExpired) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).setLinkExpired(linkExpired);
            return this;
        }

        public Builder setMemberLimitExceeded(MemberLimitExceeded memberLimitExceeded) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).setMemberLimitExceeded(memberLimitExceeded);
            return this;
        }

        public Builder setNotAnAdmin(NotAnAdmin notAnAdmin) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).setNotAnAdmin(notAnAdmin);
            return this;
        }

        public Builder setNotFriends(NotFriends notFriends) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).setNotFriends(notFriends);
            return this;
        }

        public Builder setNotTrusted(NotTrusted notTrusted) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).setNotTrusted(notTrusted);
            return this;
        }

        public Builder setOptOut(OptOut optOut) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).setOptOut(optOut);
            return this;
        }

        public Builder setParticipationStatus(ChatParticipationStatus chatParticipationStatus) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).setParticipationStatus(chatParticipationStatus);
            return this;
        }

        public Builder setRestrictedFromMessaging(RestrictedFromMessaging restrictedFromMessaging) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).setRestrictedFromMessaging(restrictedFromMessaging);
            return this;
        }

        public Builder setShouldAssureAge(ShouldAssureAge shouldAssureAge) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).setShouldAssureAge(shouldAssureAge);
            return this;
        }

        public Builder setTooYoung(TooYoung tooYoung) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).setTooYoung(tooYoung);
            return this;
        }

        public Builder setUnreleasedMarket(UnreleasedMarket unreleasedMarket) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).setUnreleasedMarket(unreleasedMarket);
            return this;
        }

        public Builder setUnspecified(Unspecified unspecified) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).setUnspecified(unspecified);
            return this;
        }

        public Builder setUserBlocked(UserBlocked userBlocked) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).setUserBlocked(userBlocked);
            return this;
        }

        public Builder setViolativeContent(ViolativeContent violativeContent) {
            copyOnWrite();
            ((ErrorReason) ((g) this).instance).setViolativeContent(violativeContent);
            return this;
        }
    }

    public enum ECase {
        UNSPECIFIED(1),
        SHOULD_ASSURE_AGE(2),
        OPT_OUT(3),
        RESTRICTED_FROM_MESSAGING(4),
        LINK_EXPIRED(5),
        PARTICIPATION_STATUS(6),
        UNRELEASED_MARKET(8),
        TOO_YOUNG(9),
        GROUPS_NOT_ENABLED(11),
        MEMBER_LIMIT_EXCEEDED(12),
        JOIN_LIMIT_EXCEEDED(13),
        VIOLATIVE_CONTENT(14),
        NOT_AN_ADMIN(15),
        NOT_TRUSTED(16),
        USER_BLOCKED(17),
        NOT_FRIENDS(18),
        E_NOT_SET(0);

        private final int value;

        ECase(int i) {
            this.value = i;
        }

        public static ECase forNumber(int i) {
            switch (i) {
                case 0:
                    return E_NOT_SET;
                case 1:
                    return UNSPECIFIED;
                case 2:
                    return SHOULD_ASSURE_AGE;
                case 3:
                    return OPT_OUT;
                case 4:
                    return RESTRICTED_FROM_MESSAGING;
                case 5:
                    return LINK_EXPIRED;
                case 6:
                    return PARTICIPATION_STATUS;
                case 7:
                case 10:
                default:
                    return null;
                case 8:
                    return UNRELEASED_MARKET;
                case 9:
                    return TOO_YOUNG;
                case 11:
                    return GROUPS_NOT_ENABLED;
                case 12:
                    return MEMBER_LIMIT_EXCEEDED;
                case 13:
                    return JOIN_LIMIT_EXCEEDED;
                case 14:
                    return VIOLATIVE_CONTENT;
                case 15:
                    return NOT_AN_ADMIN;
                case 16:
                    return NOT_TRUSTED;
                case 17:
                    return USER_BLOCKED;
                case 18:
                    return NOT_FRIENDS;
            }
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static ECase valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum UserRole implements v190 {
        USER_ROLE_UNSPECIFIED(0),
        USER_ROLE_SENDER(1),
        USER_ROLE_RECEIVER(2),
        UNRECOGNIZED(-1);

        public static final int USER_ROLE_RECEIVER_VALUE = 2;
        public static final int USER_ROLE_SENDER_VALUE = 1;
        public static final int USER_ROLE_UNSPECIFIED_VALUE = 0;
        private static final y190 internalValueMap = new y190() { // from class: com.spotify.campfire.datasource.impl.proto.ErrorReason.UserRole.1
            /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
            public UserRole m309findValueByNumber(int i) {
                return UserRole.forNumber(i);
            }
        };
        private final int value;

        public static final class UserRoleVerifier implements z190 {
            static final z190 INSTANCE = new UserRoleVerifier();

            private UserRoleVerifier() {
            }

            public boolean isInRange(int i) {
                return UserRole.forNumber(i) != null;
            }
        }

        UserRole(int i) {
            this.value = i;
        }

        public static UserRole forNumber(int i) {
            if (i == 0) {
                return USER_ROLE_UNSPECIFIED;
            }
            if (i == 1) {
                return USER_ROLE_SENDER;
            }
            if (i != 2) {
                return null;
            }
            return USER_ROLE_RECEIVER;
        }

        public static y190 internalGetValueMap() {
            return internalValueMap;
        }

        public static z190 internalGetVerifier() {
            return UserRoleVerifier.INSTANCE;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            hhg1.n("Can't get the number of an unknown enum value.");
            return 0;
        }

        @Deprecated
        public static UserRole valueOf(int i) {
            return forNumber(i);
        }
    }

    public static Builder newBuilder(ErrorReason errorReason) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(errorReason);
    }

    public static ErrorReason parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (ErrorReason) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ErrorReason parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (ErrorReason) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static ErrorReason parseFrom(phc phcVar) {
        return (ErrorReason) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static ErrorReason parseFrom(phc phcVar, uz00 uz00Var) {
        return (ErrorReason) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static ErrorReason parseFrom(byte[] bArr) {
        return (ErrorReason) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ErrorReason parseFrom(byte[] bArr, uz00 uz00Var) {
        return (ErrorReason) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static ErrorReason parseFrom(InputStream inputStream) {
        return (ErrorReason) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ErrorReason parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (ErrorReason) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ErrorReason parseFrom(lwg lwgVar) {
        return (ErrorReason) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static ErrorReason parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (ErrorReason) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
