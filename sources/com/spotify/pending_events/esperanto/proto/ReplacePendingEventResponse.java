package com.spotify.pending_events.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.wfs0;
import p.xe11;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ReplacePendingEventResponse extends h implements v2j0 {
    private static final ReplacePendingEventResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private int error_;
    private boolean success_;

    static {
        ReplacePendingEventResponse replacePendingEventResponse = new ReplacePendingEventResponse();
        DEFAULT_INSTANCE = replacePendingEventResponse;
        h.registerDefaultInstance(ReplacePendingEventResponse.class, replacePendingEventResponse);
    }

    private ReplacePendingEventResponse() {
    }

    public static ReplacePendingEventResponse p(byte[] bArr) {
        return (ReplacePendingEventResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\f", new Object[]{"success_", "error_"});
        }
        if (iOrdinal == 3) {
            return new ReplacePendingEventResponse();
        }
        if (iOrdinal == 4) {
            return new xe11(DEFAULT_INSTANCE, (byte) 24);
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
        synchronized (ReplacePendingEventResponse.class) {
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

    public final wfs0 n() {
        wfs0 wfs0VarA = wfs0.a(this.error_);
        return wfs0VarA == null ? wfs0.UNRECOGNIZED : wfs0VarA;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.success_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
