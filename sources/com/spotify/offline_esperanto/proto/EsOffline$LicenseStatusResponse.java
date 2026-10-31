package com.spotify.offline_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xoz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class EsOffline$LicenseStatusResponse extends h implements v2j0 {
    private static final EsOffline$LicenseStatusResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 3;
    public static final int FREE_LICENSES_FIELD_NUMBER = 2;
    public static final int MAX_LICENSES_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private long error_;
    private int freeLicenses_;
    private int maxLicenses_;

    static {
        EsOffline$LicenseStatusResponse esOffline$LicenseStatusResponse = new EsOffline$LicenseStatusResponse();
        DEFAULT_INSTANCE = esOffline$LicenseStatusResponse;
        h.registerDefaultInstance(EsOffline$LicenseStatusResponse.class, esOffline$LicenseStatusResponse);
    }

    private EsOffline$LicenseStatusResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static EsOffline$LicenseStatusResponse q(byte[] bArr) {
        return (EsOffline$LicenseStatusResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0002", new Object[]{"maxLicenses_", "freeLicenses_", "error_"});
        }
        if (iOrdinal == 3) {
            return new EsOffline$LicenseStatusResponse();
        }
        if (iOrdinal == 4) {
            return new xoz(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (EsOffline$LicenseStatusResponse.class) {
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

    public final long n() {
        return this.error_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.freeLicenses_;
    }

    public final int p() {
        return this.maxLicenses_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
