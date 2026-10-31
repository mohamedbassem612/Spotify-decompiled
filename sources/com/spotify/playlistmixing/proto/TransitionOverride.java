package com.spotify.playlistmixing.proto;

import com.google.protobuf.h;
import p.bf40;
import p.hhc;
import p.jf40;
import p.jkg1;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class TransitionOverride extends h implements v2j0 {
    private static final TransitionOverride DEFAULT_INSTANCE;
    public static final int ITEM_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int TRANSITION_FIELD_NUMBER = 2;
    private phc itemId_ = phc.b;
    private String transition_ = "";

    static {
        TransitionOverride transitionOverride = new TransitionOverride();
        DEFAULT_INSTANCE = transitionOverride;
        h.registerDefaultInstance(TransitionOverride.class, transitionOverride);
    }

    private TransitionOverride() {
    }

    public static jkg1 n() {
        return (jkg1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002Ȉ", new Object[]{"itemId_", "transition_"});
        }
        if (iOrdinal == 3) {
            return new TransitionOverride();
        }
        if (iOrdinal == 4) {
            return new jkg1(DEFAULT_INSTANCE);
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
        synchronized (TransitionOverride.class) {
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

    public final void o(hhc hhcVar) {
        this.itemId_ = hhcVar;
    }

    public final void p(String str) {
        this.transition_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
