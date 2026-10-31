package com.spotify.automix.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zif1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class TransitionOuterClass$LoopingStyleBlocks extends h implements v2j0 {
    private static final TransitionOuterClass$LoopingStyleBlocks DEFAULT_INSTANCE;
    public static final int IN_FIELD_NUMBER = 3;
    public static final int OUT_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int STYLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private TransitionOuterClass$BlockSequence in_;
    private TransitionOuterClass$BlockSequence out_;
    private TransitionOuterClass$LoopingStyle style_;

    static {
        TransitionOuterClass$LoopingStyleBlocks transitionOuterClass$LoopingStyleBlocks = new TransitionOuterClass$LoopingStyleBlocks();
        DEFAULT_INSTANCE = transitionOuterClass$LoopingStyleBlocks;
        h.registerDefaultInstance(TransitionOuterClass$LoopingStyleBlocks.class, transitionOuterClass$LoopingStyleBlocks);
    }

    private TransitionOuterClass$LoopingStyleBlocks() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "style_", "out_", "in_"});
        }
        if (iOrdinal == 3) {
            return new TransitionOuterClass$LoopingStyleBlocks();
        }
        if (iOrdinal == 4) {
            return new zif1(DEFAULT_INSTANCE, (byte) 27);
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
        synchronized (TransitionOuterClass$LoopingStyleBlocks.class) {
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

    public final TransitionOuterClass$BlockSequence n() {
        TransitionOuterClass$BlockSequence transitionOuterClass$BlockSequence = this.in_;
        return transitionOuterClass$BlockSequence == null ? TransitionOuterClass$BlockSequence.p() : transitionOuterClass$BlockSequence;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final TransitionOuterClass$BlockSequence o() {
        TransitionOuterClass$BlockSequence transitionOuterClass$BlockSequence = this.out_;
        return transitionOuterClass$BlockSequence == null ? TransitionOuterClass$BlockSequence.p() : transitionOuterClass$BlockSequence;
    }

    public final TransitionOuterClass$LoopingStyle p() {
        TransitionOuterClass$LoopingStyle transitionOuterClass$LoopingStyle = this.style_;
        return transitionOuterClass$LoopingStyle == null ? TransitionOuterClass$LoopingStyle.n() : transitionOuterClass$LoopingStyle;
    }

    public final boolean q() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean r() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
