package com.spotify.libs.sociallistening.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yx91;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class SocialConnectInviteNotificationCriteriaFailureV1 extends h implements v2j0 {
    public static final int APP_IS_ON_FOREGROUND_FIELD_NUMBER = 3;
    public static final int BACKEND_VISIBILITY_IS_FALSE_FIELD_NUMBER = 4;
    private static final SocialConnectInviteNotificationCriteriaFailureV1 DEFAULT_INSTANCE;
    public static final int EXCEPTION_VALIDATING_URI_FIELD_NUMBER = 5;
    public static final int HAS_NO_JAM_NEARBY_FIELD_NUMBER = 2;
    public static final int JAM_JOIN_URI_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private boolean appIsOnForeground_;
    private boolean backendVisibilityIsFalse_;
    private int bitField0_;
    private boolean hasNoJamNearby_;
    private String jamJoinUri_ = "";
    private String exceptionValidatingUri_ = "";

    static {
        SocialConnectInviteNotificationCriteriaFailureV1 socialConnectInviteNotificationCriteriaFailureV1 = new SocialConnectInviteNotificationCriteriaFailureV1();
        DEFAULT_INSTANCE = socialConnectInviteNotificationCriteriaFailureV1;
        h.registerDefaultInstance(SocialConnectInviteNotificationCriteriaFailureV1.class, socialConnectInviteNotificationCriteriaFailureV1);
    }

    private SocialConnectInviteNotificationCriteriaFailureV1() {
    }

    public static yx91 n() {
        return (yx91) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "jamJoinUri_", "hasNoJamNearby_", "appIsOnForeground_", "backendVisibilityIsFalse_", "exceptionValidatingUri_"});
        }
        if (iOrdinal == 3) {
            return new SocialConnectInviteNotificationCriteriaFailureV1();
        }
        if (iOrdinal == 4) {
            return new yx91(DEFAULT_INSTANCE);
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
        synchronized (SocialConnectInviteNotificationCriteriaFailureV1.class) {
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

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(boolean z) {
        this.bitField0_ |= 4;
        this.appIsOnForeground_ = z;
    }

    public final void p(boolean z) {
        this.bitField0_ |= 8;
        this.backendVisibilityIsFalse_ = z;
    }

    public final void q(String str) {
        this.bitField0_ |= 16;
        this.exceptionValidatingUri_ = str;
    }

    public final void r(boolean z) {
        this.bitField0_ |= 2;
        this.hasNoJamNearby_ = z;
    }

    public final void s(String str) {
        this.bitField0_ |= 1;
        this.jamJoinUri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
