package com.spotify.messages;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vd30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ForegroundServiceStartTwoStepSolutionResult extends com.google.protobuf.h implements v2j0 {
    private static final ForegroundServiceStartTwoStepSolutionResult DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 2;
    private int bitField0_;
    private String name_ = "";
    private String result_ = "";

    static {
        ForegroundServiceStartTwoStepSolutionResult foregroundServiceStartTwoStepSolutionResult = new ForegroundServiceStartTwoStepSolutionResult();
        DEFAULT_INSTANCE = foregroundServiceStartTwoStepSolutionResult;
        com.google.protobuf.h.registerDefaultInstance(ForegroundServiceStartTwoStepSolutionResult.class, foregroundServiceStartTwoStepSolutionResult);
    }

    private ForegroundServiceStartTwoStepSolutionResult() {
    }

    public static vd30 n() {
        return (vd30) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "name_", "result_"});
        }
        if (iOrdinal == 3) {
            return new ForegroundServiceStartTwoStepSolutionResult();
        }
        if (iOrdinal == 4) {
            return new vd30(DEFAULT_INSTANCE);
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
        synchronized (ForegroundServiceStartTwoStepSolutionResult.class) {
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
        this.name_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.result_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
