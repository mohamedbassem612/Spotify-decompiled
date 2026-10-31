package com.spotify.messages;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.n3t0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class PitResult extends h implements v2j0 {
    public static final int BE_CORRELATION_ID_FIELD_NUMBER = 4;
    private static final PitResult DEFAULT_INSTANCE;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private int status_;
    private String errorMessage_ = "";
    private String packageName_ = "";
    private String beCorrelationId_ = "";

    static {
        PitResult pitResult = new PitResult();
        DEFAULT_INSTANCE = pitResult;
        h.registerDefaultInstance(PitResult.class, pitResult);
    }

    private PitResult() {
    }

    public static n3t0 n() {
        return (n3t0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "status_", "errorMessage_", "packageName_", "beCorrelationId_"});
        }
        if (iOrdinal == 3) {
            return new PitResult();
        }
        if (iOrdinal == 4) {
            return new n3t0(DEFAULT_INSTANCE);
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
        synchronized (PitResult.class) {
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
        this.beCorrelationId_ = str;
    }

    public final void p(String str) {
        this.bitField0_ |= 2;
        this.errorMessage_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 4;
        this.packageName_ = str;
    }

    public final void r(int i) {
        this.bitField0_ |= 1;
        this.status_ = i;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
