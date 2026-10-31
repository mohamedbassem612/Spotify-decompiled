package com.spotify.signup.signup.v2.proto;

import com.google.protobuf.BoolValue;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zfl;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ConsentFlags extends h implements v2j0 {
    public static final int COLLECT_PERSONAL_INFO_FIELD_NUMBER = 2;
    private static final ConsentFlags DEFAULT_INSTANCE;
    public static final int EULA_AGREED_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PUSH_NOTIFICATIONS_FIELD_NUMBER = 5;
    public static final int SEND_EMAIL_FIELD_NUMBER = 3;
    public static final int TAILORED_ADS_FIELD_NUMBER = 6;
    public static final int THIRD_PARTY_EMAIL_FIELD_NUMBER = 4;
    private int bitField0_;
    private BoolValue collectPersonalInfo_;
    private BoolValue eulaAgreed_;
    private BoolValue pushNotifications_;
    private BoolValue sendEmail_;
    private BoolValue tailoredAds_;
    private BoolValue thirdPartyEmail_;

    static {
        ConsentFlags consentFlags = new ConsentFlags();
        DEFAULT_INSTANCE = consentFlags;
        h.registerDefaultInstance(ConsentFlags.class, consentFlags);
    }

    private ConsentFlags() {
    }

    public static zfl n() {
        return (zfl) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"bitField0_", "eulaAgreed_", "collectPersonalInfo_", "sendEmail_", "thirdPartyEmail_", "pushNotifications_", "tailoredAds_"});
        }
        if (iOrdinal == 3) {
            return new ConsentFlags();
        }
        if (iOrdinal == 4) {
            return new zfl(DEFAULT_INSTANCE);
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
        synchronized (ConsentFlags.class) {
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

    public final void o(BoolValue boolValue) {
        boolValue.getClass();
        this.collectPersonalInfo_ = boolValue;
        this.bitField0_ |= 2;
    }

    public final void p(BoolValue boolValue) {
        boolValue.getClass();
        this.eulaAgreed_ = boolValue;
        this.bitField0_ |= 1;
    }

    public final void q(BoolValue boolValue) {
        boolValue.getClass();
        this.sendEmail_ = boolValue;
        this.bitField0_ |= 4;
    }

    public final void r(BoolValue boolValue) {
        boolValue.getClass();
        this.tailoredAds_ = boolValue;
        this.bitField0_ |= 32;
    }

    public final void s(BoolValue boolValue) {
        boolValue.getClass();
        this.thirdPartyEmail_ = boolValue;
        this.bitField0_ |= 8;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
