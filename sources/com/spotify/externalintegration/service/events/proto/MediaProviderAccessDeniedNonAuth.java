package com.spotify.externalintegration.service.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.iuh0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class MediaProviderAccessDeniedNonAuth extends h implements v2j0 {
    public static final int CALLING_PACKAGE_FIELD_NUMBER = 1;
    public static final int CDN_HOST_FIELD_NUMBER = 2;
    private static final MediaProviderAccessDeniedNonAuth DEFAULT_INSTANCE;
    public static final int DIAGNOSTIC_SESSION_ID_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private String callingPackage_ = "";
    private String cdnHost_ = "";
    private String diagnosticSessionId_ = "";

    static {
        MediaProviderAccessDeniedNonAuth mediaProviderAccessDeniedNonAuth = new MediaProviderAccessDeniedNonAuth();
        DEFAULT_INSTANCE = mediaProviderAccessDeniedNonAuth;
        h.registerDefaultInstance(MediaProviderAccessDeniedNonAuth.class, mediaProviderAccessDeniedNonAuth);
    }

    private MediaProviderAccessDeniedNonAuth() {
    }

    public static iuh0 n() {
        return (iuh0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "callingPackage_", "cdnHost_", "diagnosticSessionId_"});
        }
        if (iOrdinal == 3) {
            return new MediaProviderAccessDeniedNonAuth();
        }
        if (iOrdinal == 4) {
            return new iuh0(DEFAULT_INSTANCE);
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
        synchronized (MediaProviderAccessDeniedNonAuth.class) {
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
        this.bitField0_ |= 1;
        this.callingPackage_ = str;
    }

    public final void p(String str) {
        this.bitField0_ |= 2;
        this.cdnHost_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.diagnosticSessionId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
