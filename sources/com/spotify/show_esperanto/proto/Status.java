package com.spotify.show_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.stb1;
import p.ttb1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class Status extends h implements v2j0 {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final Status DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 2;
    private int code_;
    private String reason_ = "";

    static {
        Status status = new Status();
        DEFAULT_INSTANCE = status;
        h.registerDefaultInstance(Status.class, status);
    }

    private Status() {
    }

    public static Status o() {
        return DEFAULT_INSTANCE;
    }

    public static stb1 p() {
        return (stb1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"code_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new Status();
        }
        if (iOrdinal == 4) {
            return new stb1(DEFAULT_INSTANCE);
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
        synchronized (Status.class) {
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

    public final ttb1 n() {
        ttb1 ttb1Var;
        int i = this.code_;
        if (i == 0) {
            ttb1Var = ttb1.SUCCESS;
        } else if (i == 1) {
            ttb1Var = ttb1.BAD_REQUEST;
        } else if (i != 2) {
            ttb1Var = i != 3 ? null : ttb1.NOT_FOUND;
        } else {
            ttb1Var = ttb1.INTERNAL_ERROR;
        }
        return ttb1Var == null ? ttb1.UNRECOGNIZED : ttb1Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void q(ttb1 ttb1Var) {
        this.code_ = ttb1Var.getNumber();
    }

    public final void r(String str) {
        str.getClass();
        this.reason_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
