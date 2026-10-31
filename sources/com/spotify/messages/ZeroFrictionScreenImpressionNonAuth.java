package com.spotify.messages;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.y3n1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ZeroFrictionScreenImpressionNonAuth extends h implements v2j0 {
    private static final ZeroFrictionScreenImpressionNonAuth DEFAULT_INSTANCE;
    public static final int PAGE_INSTANCE_ID_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int SCREEN_ID_FIELD_NUMBER = 3;
    public static final int SESSION_ID_FIELD_NUMBER = 2;
    public static final int SPOTIFY_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private String spotifyId_ = "";
    private String sessionId_ = "";
    private String screenId_ = "";
    private String pageInstanceId_ = "";

    static {
        ZeroFrictionScreenImpressionNonAuth zeroFrictionScreenImpressionNonAuth = new ZeroFrictionScreenImpressionNonAuth();
        DEFAULT_INSTANCE = zeroFrictionScreenImpressionNonAuth;
        h.registerDefaultInstance(ZeroFrictionScreenImpressionNonAuth.class, zeroFrictionScreenImpressionNonAuth);
    }

    private ZeroFrictionScreenImpressionNonAuth() {
    }

    public static y3n1 n() {
        return (y3n1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "spotifyId_", "sessionId_", "screenId_", "pageInstanceId_"});
        }
        if (iOrdinal == 3) {
            return new ZeroFrictionScreenImpressionNonAuth();
        }
        if (iOrdinal == 4) {
            return new y3n1(DEFAULT_INSTANCE);
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
        synchronized (ZeroFrictionScreenImpressionNonAuth.class) {
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
        this.pageInstanceId_ = str;
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
