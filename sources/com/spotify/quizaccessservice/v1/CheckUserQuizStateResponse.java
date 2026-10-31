package com.spotify.quizaccessservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.hhe;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class CheckUserQuizStateResponse extends h implements v2j0 {
    public static final int ACCESSIBLE_FIELD_NUMBER = 2;
    public static final int COMPLETED_FIELD_NUMBER = 1;
    private static final CheckUserQuizStateResponse DEFAULT_INSTANCE;
    public static final int INACCESSIBLE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private int stateCase_ = 0;
    private Object state_;

    static {
        CheckUserQuizStateResponse checkUserQuizStateResponse = new CheckUserQuizStateResponse();
        DEFAULT_INSTANCE = checkUserQuizStateResponse;
        h.registerDefaultInstance(CheckUserQuizStateResponse.class, checkUserQuizStateResponse);
    }

    private CheckUserQuizStateResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"state_", "stateCase_", Completed.class, Accessible.class, Inaccessible.class});
        }
        if (iOrdinal == 3) {
            return new CheckUserQuizStateResponse();
        }
        if (iOrdinal == 4) {
            return new hhe(DEFAULT_INSTANCE, (byte) 17);
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
        synchronized (CheckUserQuizStateResponse.class) {
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

    public final Accessible n() {
        return this.stateCase_ == 2 ? (Accessible) this.state_ : Accessible.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Completed o() {
        return this.stateCase_ == 1 ? (Completed) this.state_ : Completed.o();
    }

    public final Inaccessible p() {
        return this.stateCase_ == 3 ? (Inaccessible) this.state_ : Inaccessible.n();
    }

    public final boolean q() {
        return this.stateCase_ == 2;
    }

    public final boolean r() {
        return this.stateCase_ == 1;
    }

    public final boolean s() {
        return this.stateCase_ == 3;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
