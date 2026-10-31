package com.spotify.music.instrumentation.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.dn5;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class AppFocusStateNonAuth extends h implements v2j0 {
    private static final AppFocusStateNonAuth DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int STATE_FIELD_NUMBER = 1;
    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    private int bitField0_;
    private String state_ = "";
    private long timestamp_;

    static {
        AppFocusStateNonAuth appFocusStateNonAuth = new AppFocusStateNonAuth();
        DEFAULT_INSTANCE = appFocusStateNonAuth;
        h.registerDefaultInstance(AppFocusStateNonAuth.class, appFocusStateNonAuth);
    }

    private AppFocusStateNonAuth() {
    }

    public static dn5 n() {
        return (dn5) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "state_", "timestamp_"});
        }
        if (iOrdinal == 3) {
            return new AppFocusStateNonAuth();
        }
        if (iOrdinal == 4) {
            return new dn5(DEFAULT_INSTANCE);
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
        synchronized (AppFocusStateNonAuth.class) {
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
        this.bitField0_ |= 1;
        this.state_ = str;
    }

    public final void p(long j) {
        this.bitField0_ |= 2;
        this.timestamp_ = j;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
