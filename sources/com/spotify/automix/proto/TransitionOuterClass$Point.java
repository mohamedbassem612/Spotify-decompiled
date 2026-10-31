package com.spotify.automix.proto;

import com.google.protobuf.h;
import p.bf40;
import p.dkg1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class TransitionOuterClass$Point extends h implements v2j0 {
    private static final TransitionOuterClass$Point DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int X_FIELD_NUMBER = 1;
    public static final int Y_FIELD_NUMBER = 2;
    private double x_;
    private double y_;

    static {
        TransitionOuterClass$Point transitionOuterClass$Point = new TransitionOuterClass$Point();
        DEFAULT_INSTANCE = transitionOuterClass$Point;
        h.registerDefaultInstance(TransitionOuterClass$Point.class, transitionOuterClass$Point);
    }

    private TransitionOuterClass$Point() {
    }

    public static dkg1 p() {
        return (dkg1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"x_", "y_"});
        }
        if (iOrdinal == 3) {
            return new TransitionOuterClass$Point();
        }
        if (iOrdinal == 4) {
            return new dkg1(DEFAULT_INSTANCE);
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
        synchronized (TransitionOuterClass$Point.class) {
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

    public final double n() {
        return this.x_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final double o() {
        return this.y_;
    }

    public final void q(double d) {
        this.x_ = d;
    }

    public final void r(double d) {
        this.y_ = d;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
