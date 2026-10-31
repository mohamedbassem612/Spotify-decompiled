package com.spotify.connectivity.reachability.esperanto.proto;

import com.google.protobuf.Empty;
import com.google.protobuf.h;
import p.amz;
import p.bf40;
import p.bmz;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class EsConnectionType$ConnectionType extends h implements v2j0 {
    public static final int CELLULAR_FIELD_NUMBER = 3;
    private static final EsConnectionType$ConnectionType DEFAULT_INSTANCE;
    public static final int NONE_FIELD_NUMBER = 1;
    public static final int OTHER_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int WLAN_FIELD_NUMBER = 2;
    private int typeCase_ = 0;
    private Object type_;

    static {
        EsConnectionType$ConnectionType esConnectionType$ConnectionType = new EsConnectionType$ConnectionType();
        DEFAULT_INSTANCE = esConnectionType$ConnectionType;
        h.registerDefaultInstance(EsConnectionType$ConnectionType.class, esConnectionType$ConnectionType);
    }

    private EsConnectionType$ConnectionType() {
    }

    public static bmz n() {
        return (bmz) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003?\u0000\u0004<\u0000", new Object[]{"type_", "typeCase_", Empty.class, Empty.class, Empty.class});
        }
        if (iOrdinal == 3) {
            return new EsConnectionType$ConnectionType();
        }
        if (iOrdinal == 4) {
            return new bmz(DEFAULT_INSTANCE);
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
        synchronized (EsConnectionType$ConnectionType.class) {
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

    public final void o(amz amzVar) {
        this.type_ = Integer.valueOf(amzVar.getNumber());
        this.typeCase_ = 3;
    }

    public final void p(Empty empty) {
        empty.getClass();
        this.type_ = empty;
        this.typeCase_ = 1;
    }

    public final void q(Empty empty) {
        empty.getClass();
        this.type_ = empty;
        this.typeCase_ = 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
