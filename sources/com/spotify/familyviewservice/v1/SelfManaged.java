package com.spotify.familyviewservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.pg51;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SelfManaged extends h implements v2j0 {
    public static final int ALLOCATIONS_FIELD_NUMBER = 10;
    public static final int ALLOW_EXPLICIT_CONTENT_FIELD_NUMBER = 3;
    public static final int AUDIOBOOK_TOP_UP_URL_FIELD_NUMBER = 8;
    public static final int CAN_CHANGE_EXPLICIT_CONTENT_FIELD_NUMBER = 6;
    public static final int CAN_SET_PARENTAL_CONTROLS_FIELD_NUMBER = 12;
    public static final int CAN_TOP_UP_AUDIOBOOK_HOURS_FIELD_NUMBER = 7;
    public static final int CAN_TRANSITION_FIELD_NUMBER = 5;
    private static final SelfManaged DEFAULT_INSTANCE;
    public static final int IN_TRANSITION_FIELD_NUMBER = 4;
    public static final int IS_EXPIRING_FIELD_NUMBER = 11;
    public static final int PARENTAL_CONTROLS_FIELD_NUMBER = 13;
    private static volatile qzr0 PARSER = null;
    public static final int PROFILE_FIELD_NUMBER = 2;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private boolean allowExplicitContent_;
    private int bitField0_;
    private boolean canChangeExplicitContent_;
    private boolean canSetParentalControls_;
    private boolean canTopUpAudiobookHours_;
    private boolean canTransition_;
    private boolean inTransition_;
    private boolean isExpiring_;
    private ParentalControls parentalControls_;
    private MemberProfile profile_;
    private String username_ = "";
    private String audiobookTopUpUrl_ = "";
    private h290 allocations_ = h.emptyProtobufList();

    static {
        SelfManaged selfManaged = new SelfManaged();
        DEFAULT_INSTANCE = selfManaged;
        h.registerDefaultInstance(SelfManaged.class, selfManaged);
    }

    private SelfManaged() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static SelfManaged t() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\r\f\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\u0007ဇ\u0001\bለ\u0002\n\u001b\u000bဇ\u0003\f\u0007\rဉ\u0004", new Object[]{"bitField0_", "username_", "profile_", "allowExplicitContent_", "inTransition_", "canTransition_", "canChangeExplicitContent_", "canTopUpAudiobookHours_", "audiobookTopUpUrl_", "allocations_", Allocation.class, "isExpiring_", "canSetParentalControls_", "parentalControls_"});
        }
        if (iOrdinal == 3) {
            return new SelfManaged();
        }
        if (iOrdinal == 4) {
            return new pg51(DEFAULT_INSTANCE, (byte) 20);
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
        synchronized (SelfManaged.class) {
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

    public final boolean getAllowExplicitContent() {
        return this.allowExplicitContent_;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final boolean getIsExpiring() {
        return this.isExpiring_;
    }

    public final String getUsername() {
        return this.username_;
    }

    public final h290 n() {
        return this.allocations_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.audiobookTopUpUrl_;
    }

    public final boolean p() {
        return this.canChangeExplicitContent_;
    }

    public final boolean q() {
        return this.canSetParentalControls_;
    }

    public final boolean r() {
        return this.canTopUpAudiobookHours_;
    }

    public final boolean s() {
        return this.canTransition_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return this.inTransition_;
    }

    public final MemberProfile v() {
        MemberProfile memberProfile = this.profile_;
        return memberProfile == null ? MemberProfile.n() : memberProfile;
    }
}
