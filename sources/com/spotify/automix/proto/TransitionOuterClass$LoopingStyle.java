package com.spotify.automix.proto;

import com.google.protobuf.h;
import p.bf40;
import p.bkg1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class TransitionOuterClass$LoopingStyle extends h implements v2j0 {
    private static final TransitionOuterClass$LoopingStyle DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int id_;

    static {
        TransitionOuterClass$LoopingStyle transitionOuterClass$LoopingStyle = new TransitionOuterClass$LoopingStyle();
        DEFAULT_INSTANCE = transitionOuterClass$LoopingStyle;
        h.registerDefaultInstance(TransitionOuterClass$LoopingStyle.class, transitionOuterClass$LoopingStyle);
    }

    private TransitionOuterClass$LoopingStyle() {
    }

    public static TransitionOuterClass$LoopingStyle n() {
        return DEFAULT_INSTANCE;
    }

    public static bkg1 p() {
        return (bkg1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"id_"});
        }
        if (iOrdinal == 3) {
            return new TransitionOuterClass$LoopingStyle();
        }
        if (iOrdinal == 4) {
            return new bkg1(DEFAULT_INSTANCE);
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
        synchronized (TransitionOuterClass$LoopingStyle.class) {
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

    public final int o() {
        return this.id_;
    }

    public final void q(int i) {
        this.id_ = i;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
