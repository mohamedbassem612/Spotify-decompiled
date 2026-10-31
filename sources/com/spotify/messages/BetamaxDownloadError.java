package com.spotify.messages;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.tma;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class BetamaxDownloadError extends com.google.protobuf.h implements v2j0 {
    private static final BetamaxDownloadError DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 5;
    public static final int ERROR_DESCRIPTION_FIELD_NUMBER = 6;
    public static final int ERROR_DOMAIN_FIELD_NUMBER = 4;
    public static final int ERROR_EXTRA1_FIELD_NUMBER = 7;
    public static final int ERROR_EXTRA2_FIELD_NUMBER = 8;
    public static final int FEATURE_IDENTIFIER_FIELD_NUMBER = 1;
    public static final int MEDIA_URL_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 3;
    private int bitField0_;
    private int errorCode_;
    private String featureIdentifier_ = "";
    private String mediaUrl_ = "";
    private String sessionId_ = "";
    private String errorDomain_ = "";
    private String errorDescription_ = "";
    private String errorExtra1_ = "";
    private String errorExtra2_ = "";

    static {
        BetamaxDownloadError betamaxDownloadError = new BetamaxDownloadError();
        DEFAULT_INSTANCE = betamaxDownloadError;
        com.google.protobuf.h.registerDefaultInstance(BetamaxDownloadError.class, betamaxDownloadError);
    }

    private BetamaxDownloadError() {
    }

    public static tma n() {
        return (tma) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005င\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007", new Object[]{"bitField0_", "featureIdentifier_", "mediaUrl_", "sessionId_", "errorDomain_", "errorCode_", "errorDescription_", "errorExtra1_", "errorExtra2_"});
        }
        if (iOrdinal == 3) {
            return new BetamaxDownloadError();
        }
        if (iOrdinal == 4) {
            return new tma(DEFAULT_INSTANCE);
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
        synchronized (BetamaxDownloadError.class) {
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

    public final void o(int i) {
        this.bitField0_ |= 16;
        this.errorCode_ = i;
    }

    public final void p(String str) {
        this.bitField0_ |= 32;
        this.errorDescription_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 8;
        this.errorDomain_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 64;
        this.errorExtra1_ = str;
    }

    public final void s(String str) {
        this.bitField0_ |= 128;
        this.errorExtra2_ = str;
    }

    public final void t() {
        this.bitField0_ |= 1;
        this.featureIdentifier_ = "offline-coordinator";
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.mediaUrl_ = str;
    }

    public final void v(String str) {
        this.bitField0_ |= 4;
        this.sessionId_ = str;
    }
}
