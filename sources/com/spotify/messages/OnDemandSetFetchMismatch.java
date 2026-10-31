package com.spotify.messages;

import p.bf40;
import p.i3q0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class OnDemandSetFetchMismatch extends com.google.protobuf.h implements v2j0 {
    private static final OnDemandSetFetchMismatch DEFAULT_INSTANCE;
    public static final int EMPTY_FROM_FETCH_FIELD_NUMBER = 2;
    public static final int EMPTY_FROM_HOME_FIELD_NUMBER = 3;
    public static final int FETCH_FAILED_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private boolean emptyFromFetch_;
    private boolean emptyFromHome_;
    private boolean fetchFailed_;

    static {
        OnDemandSetFetchMismatch onDemandSetFetchMismatch = new OnDemandSetFetchMismatch();
        DEFAULT_INSTANCE = onDemandSetFetchMismatch;
        com.google.protobuf.h.registerDefaultInstance(OnDemandSetFetchMismatch.class, onDemandSetFetchMismatch);
    }

    private OnDemandSetFetchMismatch() {
    }

    public static i3q0 n() {
        return (i3q0) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "fetchFailed_", "emptyFromFetch_", "emptyFromHome_"});
        }
        if (iOrdinal == 3) {
            return new OnDemandSetFetchMismatch();
        }
        if (iOrdinal == 4) {
            return new i3q0(DEFAULT_INSTANCE);
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
        synchronized (OnDemandSetFetchMismatch.class) {
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

    public final void o(boolean z) {
        this.bitField0_ |= 2;
        this.emptyFromFetch_ = z;
    }

    public final void p(boolean z) {
        this.bitField0_ |= 4;
        this.emptyFromHome_ = z;
    }

    public final void q() {
        this.bitField0_ |= 1;
        this.fetchFailed_ = true;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
