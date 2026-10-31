package com.spotify.playlistmixing.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.wl61;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class SetTransition extends h implements v2j0 {
    public static final int AUTO_FIELD_NUMBER = 3;
    public static final int COMPLETED_FIELD_NUMBER = 2;
    private static final SetTransition DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TRANSITION_FIELD_NUMBER = 1;
    public static final int USER_DEFINED_FIELD_NUMBER = 4;
    public static final int USER_DEFINED_URI_FIELD_NUMBER = 5;
    private boolean completed_;
    private Object oldTransition_;
    private int oldTransitionCase_ = 0;
    private String transition_ = "";

    static {
        SetTransition setTransition = new SetTransition();
        DEFAULT_INSTANCE = setTransition;
        h.registerDefaultInstance(SetTransition.class, setTransition);
    }

    private SetTransition() {
    }

    public static wl61 n() {
        return (wl61) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003Ȼ\u0000\u0004Ȼ\u0000\u0005Ȼ\u0000", new Object[]{"oldTransition_", "oldTransitionCase_", "transition_", "completed_"});
        }
        if (iOrdinal == 3) {
            return new SetTransition();
        }
        if (iOrdinal == 4) {
            return new wl61(DEFAULT_INSTANCE);
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
        synchronized (SetTransition.class) {
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

    public final void o(String str) {
        this.oldTransitionCase_ = 3;
        this.oldTransition_ = str;
    }

    public final void p() {
        this.completed_ = true;
    }

    public final void q(String str) {
        str.getClass();
        this.transition_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.oldTransitionCase_ = 4;
        this.oldTransition_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
