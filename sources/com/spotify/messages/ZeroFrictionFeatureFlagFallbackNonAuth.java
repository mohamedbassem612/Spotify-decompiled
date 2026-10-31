package com.spotify.messages;

import p.bf40;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s3n1;
import p.t3n1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ZeroFrictionFeatureFlagFallbackNonAuth extends com.google.protobuf.h implements v2j0 {
    private static final ZeroFrictionFeatureFlagFallbackNonAuth DEFAULT_INSTANCE;
    public static final int FLAGS_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 2;
    public static final int SPOTIFY_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private qng0 flags_ = qng0.b;
    private String spotifyId_ = "";
    private String sessionId_ = "";

    static {
        ZeroFrictionFeatureFlagFallbackNonAuth zeroFrictionFeatureFlagFallbackNonAuth = new ZeroFrictionFeatureFlagFallbackNonAuth();
        DEFAULT_INSTANCE = zeroFrictionFeatureFlagFallbackNonAuth;
        com.google.protobuf.h.registerDefaultInstance(ZeroFrictionFeatureFlagFallbackNonAuth.class, zeroFrictionFeatureFlagFallbackNonAuth);
    }

    private ZeroFrictionFeatureFlagFallbackNonAuth() {
    }

    public static s3n1 o() {
        return (s3n1) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u00032", new Object[]{"bitField0_", "spotifyId_", "sessionId_", "flags_", t3n1.a});
        }
        if (iOrdinal == 3) {
            return new ZeroFrictionFeatureFlagFallbackNonAuth();
        }
        if (iOrdinal == 4) {
            return new s3n1(DEFAULT_INSTANCE);
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
        synchronized (ZeroFrictionFeatureFlagFallbackNonAuth.class) {
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

    public final qng0 n() {
        qng0 qng0Var = this.flags_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.flags_ = qng0VarH;
        return qng0VarH;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        this.bitField0_ |= 2;
        this.sessionId_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 1;
        this.spotifyId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
