package com.spotify.messages;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.ujs0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class PerformanceDiagnosticsV2NonAuth extends h implements v2j0 {
    public static final int DATA_FIELD_NUMBER = 2;
    private static final PerformanceDiagnosticsV2NonAuth DEFAULT_INSTANCE;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private String identifier_ = "";
    private String data_ = "";

    static {
        PerformanceDiagnosticsV2NonAuth performanceDiagnosticsV2NonAuth = new PerformanceDiagnosticsV2NonAuth();
        DEFAULT_INSTANCE = performanceDiagnosticsV2NonAuth;
        h.registerDefaultInstance(PerformanceDiagnosticsV2NonAuth.class, performanceDiagnosticsV2NonAuth);
    }

    private PerformanceDiagnosticsV2NonAuth() {
    }

    public static ujs0 n() {
        return (ujs0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "identifier_", "data_"});
        }
        if (iOrdinal == 3) {
            return new PerformanceDiagnosticsV2NonAuth();
        }
        if (iOrdinal == 4) {
            return new ujs0(DEFAULT_INSTANCE);
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
        synchronized (PerformanceDiagnosticsV2NonAuth.class) {
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
        this.bitField0_ |= 2;
        this.data_ = str;
    }

    public final void p() {
        this.bitField0_ |= 1;
        this.identifier_ = "diagnostic_reports";
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
