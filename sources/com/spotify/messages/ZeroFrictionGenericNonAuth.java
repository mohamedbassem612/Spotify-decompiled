package com.spotify.messages;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.u3n1;
import p.v2j0;
import p.v3n1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ZeroFrictionGenericNonAuth extends h implements v2j0 {
    public static final int DATA_FIELD_NUMBER = 5;
    private static final ZeroFrictionGenericNonAuth DEFAULT_INSTANCE;
    public static final int GENERIC_EVENT_ID_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int SCREEN_ID_FIELD_NUMBER = 3;
    public static final int SESSION_ID_FIELD_NUMBER = 2;
    public static final int SPOTIFY_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private qng0 data_ = qng0.b;
    private String spotifyId_ = "";
    private String sessionId_ = "";
    private String screenId_ = "";
    private String genericEventId_ = "";

    static {
        ZeroFrictionGenericNonAuth zeroFrictionGenericNonAuth = new ZeroFrictionGenericNonAuth();
        DEFAULT_INSTANCE = zeroFrictionGenericNonAuth;
        h.registerDefaultInstance(ZeroFrictionGenericNonAuth.class, zeroFrictionGenericNonAuth);
    }

    private ZeroFrictionGenericNonAuth() {
    }

    public static u3n1 o() {
        return (u3n1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u00052", new Object[]{"bitField0_", "spotifyId_", "sessionId_", "screenId_", "genericEventId_", "data_", v3n1.a});
        }
        if (iOrdinal == 3) {
            return new ZeroFrictionGenericNonAuth();
        }
        if (iOrdinal == 4) {
            return new u3n1(DEFAULT_INSTANCE);
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
        synchronized (ZeroFrictionGenericNonAuth.class) {
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
        qng0 qng0Var = this.data_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.data_ = qng0VarH;
        return qng0VarH;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.genericEventId_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.screenId_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 2;
        this.sessionId_ = str;
    }

    public final void s(String str) {
        this.bitField0_ |= 1;
        this.spotifyId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
