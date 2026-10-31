package com.spotify.playlist_signal.model.proto;

import com.google.protobuf.h;
import p.bf40;
import p.hhc;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.vl81;
import p.wl81;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class SignalModelProto$Signal extends h implements wl81 {
    public static final int CLIENT_PAYLOAD_FIELD_NUMBER = 3;
    public static final int DATA_FIELD_NUMBER = 2;
    private static final SignalModelProto$Signal DEFAULT_INSTANCE;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    public static final int INSTANCE_ID_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER;
    private phc clientPayload_;
    private phc data_;
    private String identifier_ = "";
    private String instanceId_;

    static {
        SignalModelProto$Signal signalModelProto$Signal = new SignalModelProto$Signal();
        DEFAULT_INSTANCE = signalModelProto$Signal;
        h.registerDefaultInstance(SignalModelProto$Signal.class, signalModelProto$Signal);
    }

    private SignalModelProto$Signal() {
        hhc hhcVar = phc.b;
        this.data_ = hhcVar;
        this.clientPayload_ = hhcVar;
        this.instanceId_ = "";
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\n\u0004Ȉ", new Object[]{"identifier_", "data_", "clientPayload_", "instanceId_"});
        }
        if (iOrdinal == 3) {
            return new SignalModelProto$Signal();
        }
        if (iOrdinal == 4) {
            return new vl81(DEFAULT_INSTANCE);
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
        synchronized (SignalModelProto$Signal.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
