package com.spotify.playlistmixing.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.jf8;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class BackendTransition extends h implements v2j0 {
    public static final int BACKEND_TYPE_FIELD_NUMBER = 2;
    public static final int CURRENT_DEFAULT_FIELD_NUMBER = 5;
    private static final BackendTransition DEFAULT_INSTANCE;
    public static final int IDENTIFIER_FIELD_NUMBER = 4;
    public static final int INCLUDE_IN_COMPARISON_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int TRANSITION_FIELD_NUMBER = 1;
    private int backendType_;
    private boolean currentDefault_;
    private boolean includeInComparison_;
    private String transition_ = "";
    private String identifier_ = "";

    static {
        BackendTransition backendTransition = new BackendTransition();
        DEFAULT_INSTANCE = backendTransition;
        h.registerDefaultInstance(BackendTransition.class, backendTransition);
    }

    private BackendTransition() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0007\u0004Ȉ\u0005\u0007", new Object[]{"transition_", "backendType_", "includeInComparison_", "identifier_", "currentDefault_"});
        }
        if (iOrdinal == 3) {
            return new BackendTransition();
        }
        if (iOrdinal == 4) {
            return new jf8(DEFAULT_INSTANCE, (byte) 28);
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
        synchronized (BackendTransition.class) {
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

    public final boolean n() {
        return this.currentDefault_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.identifier_;
    }

    public final boolean p() {
        return this.includeInComparison_;
    }

    public final String q() {
        return this.transition_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
