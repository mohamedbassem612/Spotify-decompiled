package com.spotify.lockstate.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.coc;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class Callback extends h implements v2j0 {
    public static final int AUTO_DISMISS_FIELD_NUMBER = 4;
    private static final Callback DEFAULT_INSTANCE;
    public static final int ON_ERROR_FIELD_NUMBER = 3;
    public static final int ON_SUCCESS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PATH_FIELD_NUMBER = 1;
    private boolean autoDismiss_;
    private int bitField0_;
    private Action onError_;
    private Action onSuccess_;
    private String path_ = "";

    static {
        Callback callback = new Callback();
        DEFAULT_INSTANCE = callback;
        h.registerDefaultInstance(Callback.class, callback);
    }

    private Callback() {
    }

    public static Callback o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004\u0007", new Object[]{"bitField0_", "path_", "onSuccess_", "onError_", "autoDismiss_"});
        }
        if (iOrdinal == 3) {
            return new Callback();
        }
        if (iOrdinal == 4) {
            return new coc(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (Callback.class) {
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

    public final String getPath() {
        return this.path_;
    }

    public final boolean n() {
        return this.autoDismiss_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Action p() {
        Action action = this.onError_;
        return action == null ? Action.o() : action;
    }

    public final Action q() {
        Action action = this.onSuccess_;
        return action == null ? Action.o() : action;
    }

    public final boolean r() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean s() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
