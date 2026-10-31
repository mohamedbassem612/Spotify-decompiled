package com.spotify.messages;

import p.bf40;
import p.ima;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class BetamaxCDN extends com.google.protobuf.h implements v2j0 {
    public static final int AVAILABLE_CDNS_FIELD_NUMBER = 15;
    public static final int CDN_HOST_FIELD_NUMBER = 2;
    public static final int CONTENT_LENGTH_FIELD_NUMBER = 11;
    private static final BetamaxCDN DEFAULT_INSTANCE;
    public static final int MS_REQUEST_TIME_FIELD_NUMBER = 12;
    private static volatile qzr0 PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 13;
    public static final int REQUEST_TYPE_FIELD_NUMBER = 14;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int STATUS_FIELD_NUMBER = 5;
    public static final int URI_FIELD_NUMBER = 7;
    public static final int USER_AGENT_FIELD_NUMBER = 4;
    public static final int VERB_FIELD_NUMBER = 6;
    public static final int VERSION_FIELD_NUMBER = 8;
    public static final int X_CACHE_FIELD_NUMBER = 9;
    public static final int X_CACHE_HITS_FIELD_NUMBER = 10;
    private int bitField0_;
    private long contentLength_;
    private long msRequestTime_;
    private int status_;
    private String sessionId_ = "";
    private String cdnHost_ = "";
    private String userAgent_ = "";
    private String verb_ = "";
    private String uri_ = "";
    private String version_ = "";
    private String xCache_ = "";
    private String xCacheHits_ = "";
    private String requestId_ = "";
    private String requestType_ = "";
    private String availableCdns_ = "";

    static {
        BetamaxCDN betamaxCDN = new BetamaxCDN();
        DEFAULT_INSTANCE = betamaxCDN;
        com.google.protobuf.h.registerDefaultInstance(BetamaxCDN.class, betamaxCDN);
    }

    private BetamaxCDN() {
    }

    public static ima n() {
        return (ima) DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final void A(String str) {
        this.bitField0_ |= 128;
        this.xCache_ = str;
    }

    public final void B(String str) {
        this.bitField0_ |= 256;
        this.xCacheHits_ = str;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဈ\u0002\u0005င\u0003\u0006ဈ\u0004\u0007ဈ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဂ\t\fဂ\n\rဈ\u000b\u000eဈ\f\u000fဈ\r", new Object[]{"bitField0_", "sessionId_", "cdnHost_", "userAgent_", "status_", "verb_", "uri_", "version_", "xCache_", "xCacheHits_", "contentLength_", "msRequestTime_", "requestId_", "requestType_", "availableCdns_"});
        }
        if (iOrdinal == 3) {
            return new BetamaxCDN();
        }
        if (iOrdinal == 4) {
            return new ima(DEFAULT_INSTANCE);
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
        synchronized (BetamaxCDN.class) {
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
        this.bitField0_ |= 8192;
        this.availableCdns_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.cdnHost_ = str;
    }

    public final void q(long j) {
        this.bitField0_ |= 512;
        this.contentLength_ = j;
    }

    public final void r(long j) {
        this.bitField0_ |= 1024;
        this.msRequestTime_ = j;
    }

    public final void s(String str) {
        this.bitField0_ |= 2048;
        this.requestId_ = str;
    }

    public final void t(String str) {
        this.bitField0_ |= 4096;
        this.requestType_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    public final void v(int i) {
        this.bitField0_ |= 8;
        this.status_ = i;
    }

    public final void w(String str) {
        this.bitField0_ |= 32;
        this.uri_ = str;
    }

    public final void x(String str) {
        this.bitField0_ |= 4;
        this.userAgent_ = str;
    }

    public final void y(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.verb_ = str;
    }

    public final void z(String str) {
        this.bitField0_ |= 64;
        this.version_ = str;
    }
}
