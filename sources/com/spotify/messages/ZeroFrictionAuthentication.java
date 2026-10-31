package com.spotify.messages;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.n3n1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ZeroFrictionAuthentication extends h implements v2j0 {
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 7;
    public static final int AUTHENTICATION_METHOD_FIELD_NUMBER = 6;
    public static final int AUTHENTICATION_TYPE_FIELD_NUMBER = 5;
    private static final ZeroFrictionAuthentication DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REGISTRATION_FIELD_NUMBER = 4;
    public static final int REQUEST_ID_FIELD_NUMBER = 3;
    public static final int SESSION_ID_FIELD_NUMBER = 2;
    public static final int SPOTIFY_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean registration_;
    private String spotifyId_ = "";
    private String sessionId_ = "";
    private String requestId_ = "";
    private String authenticationType_ = "";
    private String authenticationMethod_ = "";
    private String appInstanceId_ = "";

    static {
        ZeroFrictionAuthentication zeroFrictionAuthentication = new ZeroFrictionAuthentication();
        DEFAULT_INSTANCE = zeroFrictionAuthentication;
        h.registerDefaultInstance(ZeroFrictionAuthentication.class, zeroFrictionAuthentication);
    }

    private ZeroFrictionAuthentication() {
    }

    public static n3n1 n() {
        return (n3n1) DEFAULT_INSTANCE.createBuilder();
    }

    public static ZeroFrictionAuthentication o(byte[] bArr) {
        return (ZeroFrictionAuthentication) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"bitField0_", "spotifyId_", "sessionId_", "requestId_", "registration_", "authenticationType_", "authenticationMethod_", "appInstanceId_"});
        }
        if (iOrdinal == 3) {
            return new ZeroFrictionAuthentication();
        }
        if (iOrdinal == 4) {
            return new n3n1(DEFAULT_INSTANCE);
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
        synchronized (ZeroFrictionAuthentication.class) {
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

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.appInstanceId_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 32;
        this.authenticationMethod_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 16;
        this.authenticationType_ = str;
    }

    public final void s(boolean z) {
        this.bitField0_ |= 8;
        this.registration_ = z;
    }

    public final void t(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.requestId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        this.bitField0_ |= 2;
        this.sessionId_ = str;
    }

    public final void v(String str) {
        this.bitField0_ |= 1;
        this.spotifyId_ = str;
    }
}
