package com.spotify.lockstate.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.fin0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class NavigateTo extends h implements v2j0 {
    public static final int AUTO_DISMISS_FIELD_NUMBER = 2;
    private static final NavigateTo DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TARGET_FIELD_NUMBER = 1;
    private boolean autoDismiss_;
    private int bitField0_;
    private Target target_;

    static {
        NavigateTo navigateTo = new NavigateTo();
        DEFAULT_INSTANCE = navigateTo;
        h.registerDefaultInstance(NavigateTo.class, navigateTo);
    }

    private NavigateTo() {
    }

    public static NavigateTo o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0007", new Object[]{"bitField0_", "target_", "autoDismiss_"});
        }
        if (iOrdinal == 3) {
            return new NavigateTo();
        }
        if (iOrdinal == 4) {
            return new fin0(DEFAULT_INSTANCE, (byte) 8);
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
        synchronized (NavigateTo.class) {
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
        return this.autoDismiss_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Target p() {
        Target target = this.target_;
        return target == null ? Target.n() : target;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
