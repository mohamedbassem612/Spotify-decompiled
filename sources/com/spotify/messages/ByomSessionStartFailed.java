package com.spotify.messages;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yfc;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ByomSessionStartFailed extends com.google.protobuf.h implements v2j0 {
    private static final ByomSessionStartFailed DEFAULT_INSTANCE;
    public static final int ENTRY_POINT_FIELD_NUMBER = 2;
    public static final int EPISODE_URI_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 3;
    public static final int UBI_INTERACTION_ID_FIELD_NUMBER = 4;
    private int bitField0_;
    private String episodeUri_ = "";
    private String entryPoint_ = "";
    private String reason_ = "";
    private String ubiInteractionId_ = "";

    static {
        ByomSessionStartFailed byomSessionStartFailed = new ByomSessionStartFailed();
        DEFAULT_INSTANCE = byomSessionStartFailed;
        com.google.protobuf.h.registerDefaultInstance(ByomSessionStartFailed.class, byomSessionStartFailed);
    }

    private ByomSessionStartFailed() {
    }

    public static yfc n() {
        return (yfc) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "episodeUri_", "entryPoint_", "reason_", "ubiInteractionId_"});
        }
        if (iOrdinal == 3) {
            return new ByomSessionStartFailed();
        }
        if (iOrdinal == 4) {
            return new yfc(DEFAULT_INSTANCE);
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
        synchronized (ByomSessionStartFailed.class) {
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

    public final void o(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.entryPoint_ = str;
    }

    public final void p(String str) {
        this.bitField0_ |= 1;
        this.episodeUri_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.reason_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.ubiInteractionId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
