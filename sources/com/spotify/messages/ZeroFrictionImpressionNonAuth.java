package com.spotify.messages;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.w3n1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ZeroFrictionImpressionNonAuth extends com.google.protobuf.h implements v2j0 {
    public static final int CONTEXT_FIELD_NUMBER = 5;
    private static final ZeroFrictionImpressionNonAuth DEFAULT_INSTANCE;
    public static final int IMPRESSION_ID_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int SCREEN_ID_FIELD_NUMBER = 3;
    public static final int SESSION_ID_FIELD_NUMBER = 2;
    public static final int SPOTIFY_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private String spotifyId_ = "";
    private String sessionId_ = "";
    private String screenId_ = "";
    private String impressionId_ = "";
    private String context_ = "";

    static {
        ZeroFrictionImpressionNonAuth zeroFrictionImpressionNonAuth = new ZeroFrictionImpressionNonAuth();
        DEFAULT_INSTANCE = zeroFrictionImpressionNonAuth;
        com.google.protobuf.h.registerDefaultInstance(ZeroFrictionImpressionNonAuth.class, zeroFrictionImpressionNonAuth);
    }

    private ZeroFrictionImpressionNonAuth() {
    }

    public static w3n1 n() {
        return (w3n1) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "spotifyId_", "sessionId_", "screenId_", "impressionId_", "context_"});
        }
        if (iOrdinal == 3) {
            return new ZeroFrictionImpressionNonAuth();
        }
        if (iOrdinal == 4) {
            return new w3n1(DEFAULT_INSTANCE);
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
        synchronized (ZeroFrictionImpressionNonAuth.class) {
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
        this.bitField0_ |= 8;
        this.impressionId_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.screenId_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 2;
        this.sessionId_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 1;
        this.spotifyId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
