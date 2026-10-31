package com.spotify.gpb.trackingimpl.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.e550;
import p.f550;
import p.g550;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class GpbOperation extends h implements v2j0 {
    private static final GpbOperation DEFAULT_INSTANCE;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 9;
    public static final int ERROR_TYPE_FIELD_NUMBER = 8;
    public static final int INPUT_FIELD_NUMBER = 5;
    public static final int NAME_FIELD_NUMBER = 3;
    public static final int OUTPUT_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 6;
    public static final int SESSION_ID_FIELD_NUMBER = 2;
    public static final int SOURCE_FIELD_NUMBER = 1;
    public static final int STEP_FIELD_NUMBER = 4;
    private int bitField0_;
    private String errorMessage_;
    private String errorType_;
    private qng0 input_;
    private String name_;
    private qng0 output_;
    private String result_;
    private String sessionId_;
    private String source_;
    private String step_;

    static {
        GpbOperation gpbOperation = new GpbOperation();
        DEFAULT_INSTANCE = gpbOperation;
        h.registerDefaultInstance(GpbOperation.class, gpbOperation);
    }

    private GpbOperation() {
        qng0 qng0Var = qng0.b;
        this.input_ = qng0Var;
        this.output_ = qng0Var;
        this.source_ = "";
        this.sessionId_ = "";
        this.name_ = "";
        this.step_ = "";
        this.result_ = "";
        this.errorType_ = "";
        this.errorMessage_ = "";
    }

    public static e550 p() {
        return (e550) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u00052\u0006ဈ\u0004\u00072\bဈ\u0005\tဈ\u0006", new Object[]{"bitField0_", "source_", "sessionId_", "name_", "step_", "input_", f550.a, "result_", "output_", g550.a, "errorType_", "errorMessage_"});
        }
        if (iOrdinal == 3) {
            return new GpbOperation();
        }
        if (iOrdinal == 4) {
            return new e550(DEFAULT_INSTANCE);
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
        synchronized (GpbOperation.class) {
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
        qng0 qng0Var = this.input_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.input_ = qng0VarH;
        return qng0VarH;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final qng0 o() {
        qng0 qng0Var = this.output_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.output_ = qng0VarH;
        return qng0VarH;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.errorMessage_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 32;
        this.errorType_ = str;
    }

    public final void s(String str) {
        this.bitField0_ |= 4;
        this.name_ = str;
    }

    public final void t(String str) {
        this.bitField0_ |= 16;
        this.result_ = str;
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
        this.source_ = str;
    }

    public final void w(String str) {
        this.bitField0_ |= 8;
        this.step_ = str;
    }
}
