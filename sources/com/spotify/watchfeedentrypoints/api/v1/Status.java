package com.spotify.watchfeedentrypoints.api.v1;

import com.google.protobuf.h;
import p.bf40;
import p.g10;
import p.jf40;
import p.o9b1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class Status extends h implements v2j0 {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final Status DEFAULT_INSTANCE;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int action_;
    private String message_ = "";

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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"action_", "message_"});
        }
        if (iOrdinal == 3) {
            return new Status();
        }
        if (iOrdinal == 4) {
            return new o9b1(DEFAULT_INSTANCE, (byte) 26);
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

    public final g10 n() {
        g10 g10Var;
        int i = this.action_;
        if (i == 0) {
            g10Var = g10.ACTION_UNSPECIFIED;
        } else if (i == 1) {
            g10Var = g10.ACTION_QUEUED;
        } else if (i == 2) {
            g10Var = g10.ACTION_PROCESSING;
        } else if (i == 3) {
            g10Var = g10.ACTION_TIMEOUT;
        } else if (i != 4) {
            g10Var = i != 5 ? null : g10.ACTION_ERROR;
        } else {
            g10Var = g10.ACTION_SUCCESS;
        }
        return g10Var == null ? g10.UNRECOGNIZED : g10Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
