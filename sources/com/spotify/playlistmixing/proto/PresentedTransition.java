package com.spotify.playlistmixing.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.n6w0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PresentedTransition extends h implements v2j0 {
    private static final PresentedTransition DEFAULT_INSTANCE;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int TRANSITION_BASE_64_FIELD_NUMBER = 2;
    private String identifier_ = "";
    private String transitionBase64_ = "";

    static {
        PresentedTransition presentedTransition = new PresentedTransition();
        DEFAULT_INSTANCE = presentedTransition;
        h.registerDefaultInstance(PresentedTransition.class, presentedTransition);
    }

    private PresentedTransition() {
    }

    public static n6w0 n() {
        return (n6w0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"identifier_", "transitionBase64_"});
        }
        if (iOrdinal == 3) {
            return new PresentedTransition();
        }
        if (iOrdinal == 4) {
            return new n6w0(DEFAULT_INSTANCE);
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
        synchronized (PresentedTransition.class) {
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
        str.getClass();
        this.identifier_ = str;
    }

    public final void p(String str) {
        this.transitionBase64_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
