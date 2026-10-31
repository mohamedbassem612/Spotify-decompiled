package com.spotify.pending_events.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lf21;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ReplacePendingEventRequest extends h implements v2j0 {
    private static final ReplacePendingEventRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PROTO_DATA_FIELD_NUMBER = 4;
    public static final int PROTO_NAME_FIELD_NUMBER = 3;
    public static final int TOKEN_EVENT_NAME_FIELD_NUMBER = 1;
    public static final int TOKEN_SEQUENCE_NO_FIELD_NUMBER = 2;
    private int tokenSequenceNo_;
    private String tokenEventName_ = "";
    private String protoName_ = "";
    private phc protoData_ = phc.b;

    static {
        ReplacePendingEventRequest replacePendingEventRequest = new ReplacePendingEventRequest();
        DEFAULT_INSTANCE = replacePendingEventRequest;
        h.registerDefaultInstance(ReplacePendingEventRequest.class, replacePendingEventRequest);
    }

    private ReplacePendingEventRequest() {
    }

    public static lf21 n() {
        return (lf21) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003Ȉ\u0004\n", new Object[]{"tokenEventName_", "tokenSequenceNo_", "protoName_", "protoData_"});
        }
        if (iOrdinal == 3) {
            return new ReplacePendingEventRequest();
        }
        if (iOrdinal == 4) {
            return new lf21(DEFAULT_INSTANCE);
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
        synchronized (ReplacePendingEventRequest.class) {
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

    public final void o(phc phcVar) {
        phcVar.getClass();
        this.protoData_ = phcVar;
    }

    public final void p(String str) {
        this.protoName_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.tokenEventName_ = str;
    }

    public final void r(int i) {
        this.tokenSequenceNo_ = i;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
