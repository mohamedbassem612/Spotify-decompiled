package com.spotify.offline_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.dpz;
import p.gpz;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class EsOffline$PrepareResourceRequest extends h implements v2j0 {
    private static final EsOffline$PrepareResourceRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RESOURCE_ID_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 2;
    private String resourceId_ = "";
    private int type_;

    static {
        EsOffline$PrepareResourceRequest esOffline$PrepareResourceRequest = new EsOffline$PrepareResourceRequest();
        DEFAULT_INSTANCE = esOffline$PrepareResourceRequest;
        h.registerDefaultInstance(EsOffline$PrepareResourceRequest.class, esOffline$PrepareResourceRequest);
    }

    private EsOffline$PrepareResourceRequest() {
    }

    public static dpz n() {
        return (dpz) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"resourceId_", "type_"});
        }
        if (iOrdinal == 3) {
            return new EsOffline$PrepareResourceRequest();
        }
        if (iOrdinal == 4) {
            return new dpz(DEFAULT_INSTANCE);
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
        synchronized (EsOffline$PrepareResourceRequest.class) {
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

    public final void o(String str) {
        this.resourceId_ = str;
    }

    public final void p(gpz gpzVar) {
        this.type_ = gpzVar.getNumber();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
