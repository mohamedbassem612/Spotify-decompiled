package com.spotify.automix.proto;

import com.google.protobuf.h;
import p.bf40;
import p.fkg1;
import p.gkg1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class TransitionOuterClass$StyleBlock extends h implements v2j0 {
    public static final int BEATS_FIELD_NUMBER = 2;
    private static final TransitionOuterClass$StyleBlock DEFAULT_INSTANCE;
    public static final int END_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int START_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 1;
    private float beats_;
    private float end_;
    private float start_;
    private int type_;

    static {
        TransitionOuterClass$StyleBlock transitionOuterClass$StyleBlock = new TransitionOuterClass$StyleBlock();
        DEFAULT_INSTANCE = transitionOuterClass$StyleBlock;
        h.registerDefaultInstance(TransitionOuterClass$StyleBlock.class, transitionOuterClass$StyleBlock);
    }

    private TransitionOuterClass$StyleBlock() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static fkg1 r() {
        return (fkg1) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\u0001\u0003\u0001\u0004\u0001", new Object[]{"type_", "beats_", "start_", "end_"});
        }
        if (iOrdinal == 3) {
            return new TransitionOuterClass$StyleBlock();
        }
        if (iOrdinal == 4) {
            return new fkg1(DEFAULT_INSTANCE);
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
        synchronized (TransitionOuterClass$StyleBlock.class) {
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

    public final float n() {
        return this.beats_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final float o() {
        return this.end_;
    }

    public final float p() {
        return this.start_;
    }

    public final gkg1 q() {
        gkg1 gkg1Var;
        int i = this.type_;
        if (i == 0) {
            gkg1Var = gkg1.STYLE_BLOCK_TYPE_UNSPECIFIED;
        } else if (i == 1) {
            gkg1Var = gkg1.STYLE_BLOCK_TYPE_LOOP;
        } else if (i != 2) {
            gkg1Var = i != 3 ? null : gkg1.STYLE_BLOCK_TYPE_VINYL_STOP;
        } else {
            gkg1Var = gkg1.STYLE_BLOCK_TYPE_SPINBACK;
        }
        return gkg1Var == null ? gkg1.UNRECOGNIZED : gkg1Var;
    }

    public final void s(float f) {
        this.beats_ = f;
    }

    public final void t(float f) {
        this.end_ = f;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(float f) {
        this.start_ = f;
    }

    public final void v(gkg1 gkg1Var) {
        this.type_ = gkg1Var.getNumber();
    }
}
