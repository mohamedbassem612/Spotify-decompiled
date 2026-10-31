package com.spotify.automix.proto;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.sjg1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class TransitionOuterClass$AutomationCurves extends h implements v2j0 {
    public static final int CURVES_FIELD_NUMBER = 1;
    private static final TransitionOuterClass$AutomationCurves DEFAULT_INSTANCE;
    public static final int MAXIMUM_FIELD_NUMBER = 4;
    public static final int MINIMUM_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private h290 curves_ = h.emptyProtobufList();
    private double maximum_;
    private double minimum_;

    static {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = new TransitionOuterClass$AutomationCurves();
        DEFAULT_INSTANCE = transitionOuterClass$AutomationCurves;
        h.registerDefaultInstance(TransitionOuterClass$AutomationCurves.class, transitionOuterClass$AutomationCurves);
    }

    private TransitionOuterClass$AutomationCurves() {
    }

    public static TransitionOuterClass$AutomationCurves p() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static sjg1 s() {
        return (sjg1) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0001\u0000\u0001\u001b\u0003\u0000\u0004\u0000", new Object[]{"curves_", TransitionOuterClass$AutomationCurve.class, "minimum_", "maximum_"});
        }
        if (iOrdinal == 3) {
            return new TransitionOuterClass$AutomationCurves();
        }
        if (iOrdinal == 4) {
            return new sjg1(DEFAULT_INSTANCE);
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
        synchronized (TransitionOuterClass$AutomationCurves.class) {
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

    public final void n(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.curves_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.curves_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.curves_;
    }

    public final double q() {
        return this.maximum_;
    }

    public final double r() {
        return this.minimum_;
    }

    public final void t(double d) {
        this.maximum_ = d;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(double d) {
        this.minimum_ = d;
    }
}
