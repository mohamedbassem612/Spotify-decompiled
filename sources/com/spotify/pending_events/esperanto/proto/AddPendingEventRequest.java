package com.spotify.pending_events.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.ii1;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class AddPendingEventRequest extends h implements v2j0 {
    private static final AddPendingEventRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PROTO_DATA_FIELD_NUMBER = 2;
    public static final int PROTO_NAME_FIELD_NUMBER = 1;
    private String protoName_ = "";
    private phc protoData_ = phc.b;

    static {
        AddPendingEventRequest addPendingEventRequest = new AddPendingEventRequest();
        DEFAULT_INSTANCE = addPendingEventRequest;
        h.registerDefaultInstance(AddPendingEventRequest.class, addPendingEventRequest);
    }

    private AddPendingEventRequest() {
    }

    public static ii1 n() {
        return (ii1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"protoName_", "protoData_"});
        }
        if (iOrdinal == 3) {
            return new AddPendingEventRequest();
        }
        if (iOrdinal == 4) {
            return new ii1(DEFAULT_INSTANCE);
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
        synchronized (AddPendingEventRequest.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
