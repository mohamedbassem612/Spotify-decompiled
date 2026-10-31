package com.spotify.microsoftcontinuity.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.mrj0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class MicrosoftContinuityError extends h implements v2j0 {
    private static final MicrosoftContinuityError DEFAULT_INSTANCE;
    public static final int ERROR_DESCRIPTION_FIELD_NUMBER = 2;
    public static final int ERROR_TYPE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private String errorType_ = "";
    private String errorDescription_ = "";

    static {
        MicrosoftContinuityError microsoftContinuityError = new MicrosoftContinuityError();
        DEFAULT_INSTANCE = microsoftContinuityError;
        h.registerDefaultInstance(MicrosoftContinuityError.class, microsoftContinuityError);
    }

    private MicrosoftContinuityError() {
    }

    public static mrj0 n() {
        return (mrj0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "errorType_", "errorDescription_"});
        }
        if (iOrdinal == 3) {
            return new MicrosoftContinuityError();
        }
        if (iOrdinal == 4) {
            return new mrj0(DEFAULT_INSTANCE);
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
        synchronized (MicrosoftContinuityError.class) {
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
        this.errorDescription_ = str;
    }

    public final void p(String str) {
        this.bitField0_ |= 1;
        this.errorType_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
