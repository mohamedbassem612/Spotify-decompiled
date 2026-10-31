package com.spotify.allboarding.model.v2.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lub1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class Step extends h implements v2j0 {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final Step DEFAULT_INSTANCE;
    public static final int NEXT_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SCREEN_FIELD_NUMBER = 2;
    private Action action_;
    private int bitField0_;
    private Step next_;
    private Screen screen_;

    static {
        Step step = new Step();
        DEFAULT_INSTANCE = step;
        h.registerDefaultInstance(Step.class, step);
    }

    private Step() {
    }

    public static Step o() {
        return DEFAULT_INSTANCE;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "action_", "screen_", "next_"});
        }
        if (iOrdinal == 3) {
            return new Step();
        }
        if (iOrdinal == 4) {
            return new lub1(DEFAULT_INSTANCE, (byte) 1);
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
        synchronized (Step.class) {
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

    public final Action n() {
        Action action = this.action_;
        return action == null ? Action.n() : action;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Step p() {
        Step step = this.next_;
        return step == null ? DEFAULT_INSTANCE : step;
    }

    public final Screen q() {
        Screen screen = this.screen_;
        return screen == null ? Screen.q() : screen;
    }

    public final boolean r() {
        return (this.bitField0_ & 4) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
