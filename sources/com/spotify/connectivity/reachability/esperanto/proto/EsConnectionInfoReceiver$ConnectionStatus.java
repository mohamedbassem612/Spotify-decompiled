package com.spotify.connectivity.reachability.esperanto.proto;

import com.google.protobuf.Empty;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xlz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class EsConnectionInfoReceiver$ConnectionStatus extends h implements v2j0 {
    public static final int CONNECTED_FIELD_NUMBER = 1;
    private static final EsConnectionInfoReceiver$ConnectionStatus DEFAULT_INSTANCE;
    public static final int NOT_CONNECTED_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int UNKNOWN_FIELD_NUMBER = 3;
    private int typeCase_ = 0;
    private Object type_;

    static {
        EsConnectionInfoReceiver$ConnectionStatus esConnectionInfoReceiver$ConnectionStatus = new EsConnectionInfoReceiver$ConnectionStatus();
        DEFAULT_INSTANCE = esConnectionInfoReceiver$ConnectionStatus;
        h.registerDefaultInstance(EsConnectionInfoReceiver$ConnectionStatus.class, esConnectionInfoReceiver$ConnectionStatus);
    }

    private EsConnectionInfoReceiver$ConnectionStatus() {
    }

    public static xlz n() {
        return (xlz) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"type_", "typeCase_", EsConnectionInfoReceiver$Connected.class, Empty.class, Empty.class});
        }
        if (iOrdinal == 3) {
            return new EsConnectionInfoReceiver$ConnectionStatus();
        }
        if (iOrdinal == 4) {
            return new xlz(DEFAULT_INSTANCE);
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
        synchronized (EsConnectionInfoReceiver$ConnectionStatus.class) {
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

    public final void o(EsConnectionInfoReceiver$Connected esConnectionInfoReceiver$Connected) {
        esConnectionInfoReceiver$Connected.getClass();
        this.type_ = esConnectionInfoReceiver$Connected;
        this.typeCase_ = 1;
    }

    public final void p(Empty empty) {
        empty.getClass();
        this.type_ = empty;
        this.typeCase_ = 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
