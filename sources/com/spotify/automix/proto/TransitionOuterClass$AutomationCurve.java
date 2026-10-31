package com.spotify.automix.proto;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.rjg1;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class TransitionOuterClass$AutomationCurve extends h implements v2j0 {
    private static final TransitionOuterClass$AutomationCurve DEFAULT_INSTANCE;
    public static final int END_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int POINTS_FIELD_NUMBER = 1;
    public static final int START_FIELD_NUMBER = 2;
    private double end_;
    private h290 points_ = h.emptyProtobufList();
    private double start_;

    static {
        TransitionOuterClass$AutomationCurve transitionOuterClass$AutomationCurve = new TransitionOuterClass$AutomationCurve();
        DEFAULT_INSTANCE = transitionOuterClass$AutomationCurve;
        h.registerDefaultInstance(TransitionOuterClass$AutomationCurve.class, transitionOuterClass$AutomationCurve);
    }

    private TransitionOuterClass$AutomationCurve() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static rjg1 r() {
        return (rjg1) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\u0000\u0003\u0000", new Object[]{"points_", TransitionOuterClass$Point.class, "start_", "end_"});
        }
        if (iOrdinal == 3) {
            return new TransitionOuterClass$AutomationCurve();
        }
        if (iOrdinal == 4) {
            return new rjg1(DEFAULT_INSTANCE);
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
        synchronized (TransitionOuterClass$AutomationCurve.class) {
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
        h290 h290VarMutableCopy = this.points_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.points_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final double o() {
        return this.end_;
    }

    public final h290 p() {
        return this.points_;
    }

    public final double q() {
        return this.start_;
    }

    public final void s(double d) {
        this.end_ = d;
    }

    public final void t(double d) {
        this.start_ = d;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
