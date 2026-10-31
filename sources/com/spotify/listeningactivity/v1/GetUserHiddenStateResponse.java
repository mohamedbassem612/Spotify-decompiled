package com.spotify.listeningactivity.v1;

import com.google.protobuf.h;
import p.bf40;
import p.ir40;
import p.j860;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class GetUserHiddenStateResponse extends h implements v2j0 {
    private static final GetUserHiddenStateResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int STATE_FIELD_NUMBER = 1;
    private int state_;

    static {
        GetUserHiddenStateResponse getUserHiddenStateResponse = new GetUserHiddenStateResponse();
        DEFAULT_INSTANCE = getUserHiddenStateResponse;
        h.registerDefaultInstance(GetUserHiddenStateResponse.class, getUserHiddenStateResponse);
    }

    private GetUserHiddenStateResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"state_"});
        }
        if (iOrdinal == 3) {
            return new GetUserHiddenStateResponse();
        }
        if (iOrdinal == 4) {
            return new ir40(DEFAULT_INSTANCE, (byte) 0);
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
        synchronized (GetUserHiddenStateResponse.class) {
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

    public final j860 n() {
        j860 j860Var;
        int i = this.state_;
        if (i == 0) {
            j860Var = j860.HIDDEN_STATE_UNSPECIFIED;
        } else if (i == 1) {
            j860Var = j860.VISIBLE_CAN_HIDE;
        } else if (i != 2) {
            j860Var = i != 3 ? null : j860.NOT_ELIGIBLE;
        } else {
            j860Var = j860.HIDDEN_CAN_UNHIDE;
        }
        return j860Var == null ? j860.UNRECOGNIZED : j860Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
