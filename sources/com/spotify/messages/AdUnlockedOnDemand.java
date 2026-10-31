package com.spotify.messages;

import p.a01;
import p.b01;
import p.bf40;
import p.c01;
import p.d01;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class AdUnlockedOnDemand extends com.google.protobuf.h implements v2j0 {
    public static final int ACTION_TYPE_FIELD_NUMBER = 1;
    public static final int CONTEXT_URI_FIELD_NUMBER = 7;
    private static final AdUnlockedOnDemand DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 6;
    public static final int REQUEST_ID_FIELD_NUMBER = 5;
    public static final int SESSION_ID_FIELD_NUMBER = 3;
    public static final int SOURCE_FIELD_NUMBER = 2;
    public static final int VIDEO_PROGRESS_PCT_FIELD_NUMBER = 4;
    private int actionType_;
    private int bitField0_;
    private int source_;
    private int videoProgressPct_;
    private String sessionId_ = "";
    private String requestId_ = "";
    private String reason_ = "";
    private String contextUri_ = "";

    static {
        AdUnlockedOnDemand adUnlockedOnDemand = new AdUnlockedOnDemand();
        DEFAULT_INSTANCE = adUnlockedOnDemand;
        com.google.protobuf.h.registerDefaultInstance(AdUnlockedOnDemand.class, adUnlockedOnDemand);
    }

    private AdUnlockedOnDemand() {
    }

    public static c01 n() {
        return (c01) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"bitField0_", "actionType_", a01.b, "source_", a01.c, "sessionId_", "videoProgressPct_", "requestId_", "reason_", "contextUri_"});
        }
        if (iOrdinal == 3) {
            return new AdUnlockedOnDemand();
        }
        if (iOrdinal == 4) {
            return new c01(DEFAULT_INSTANCE);
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
        synchronized (AdUnlockedOnDemand.class) {
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

    public final void o(b01 b01Var) {
        this.actionType_ = b01Var.getNumber();
        this.bitField0_ |= 1;
    }

    public final void p(String str) {
        this.bitField0_ |= 32;
        this.reason_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.requestId_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.sessionId_ = str;
    }

    public final void s(d01 d01Var) {
        this.source_ = d01Var.getNumber();
        this.bitField0_ |= 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
