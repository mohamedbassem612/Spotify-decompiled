package com.spotify.casita.v1.resolved;

import com.google.protobuf.h;
import p.bf40;
import p.coc;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.z5c;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class CallToAction extends h implements v2j0 {
    private static final CallToAction DEFAULT_INSTANCE;
    public static final int DJ_CALL_TO_ACTION_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int RICH_CALL_TO_ACTION_FIELD_NUMBER = 1;
    public static final int SIMPLE_CALL_TO_ACTION_FIELD_NUMBER = 2;
    private int variantCase_ = 0;
    private Object variant_;

    static {
        CallToAction callToAction = new CallToAction();
        DEFAULT_INSTANCE = callToAction;
        h.registerDefaultInstance(CallToAction.class, callToAction);
    }

    private CallToAction() {
    }

    public static CallToAction o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"variant_", "variantCase_", RichCallToAction.class, SimpleCallToAction.class, DjCallToAction.class});
        }
        if (iOrdinal == 3) {
            return new CallToAction();
        }
        if (iOrdinal == 4) {
            return new coc((byte) 2);
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
        synchronized (CallToAction.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final DjCallToAction p() {
        return this.variantCase_ == 3 ? (DjCallToAction) this.variant_ : DjCallToAction.o();
    }

    public final RichCallToAction q() {
        return this.variantCase_ == 1 ? (RichCallToAction) this.variant_ : RichCallToAction.o();
    }

    public final SimpleCallToAction r() {
        return this.variantCase_ == 2 ? (SimpleCallToAction) this.variant_ : SimpleCallToAction.o();
    }

    public final int s() {
        return z5c.a(this.variantCase_);
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
