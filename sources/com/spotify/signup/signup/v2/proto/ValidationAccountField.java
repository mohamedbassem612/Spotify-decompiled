package com.spotify.signup.signup.v2.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.p120;
import p.qzr0;
import p.r2j0;
import p.rri1;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ValidationAccountField extends h implements v2j0 {
    private static final ValidationAccountField DEFAULT_INSTANCE;
    public static final int FIELD_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int field_;
    private String value_ = "";

    static {
        ValidationAccountField validationAccountField = new ValidationAccountField();
        DEFAULT_INSTANCE = validationAccountField;
        h.registerDefaultInstance(ValidationAccountField.class, validationAccountField);
    }

    private ValidationAccountField() {
    }

    public static rri1 n() {
        return (rri1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"field_", "value_"});
        }
        if (iOrdinal == 3) {
            return new ValidationAccountField();
        }
        if (iOrdinal == 4) {
            return new rri1(DEFAULT_INSTANCE);
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
        synchronized (ValidationAccountField.class) {
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

    public final void o(p120 p120Var) {
        this.field_ = p120Var.getNumber();
    }

    public final void p(String str) {
        str.getClass();
        this.value_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
