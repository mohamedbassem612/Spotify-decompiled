package com.spotify.offline_esperanto.proto;

import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.h290;
import p.jf40;
import p.onz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class EsOffline$ContextInfo extends h implements v2j0 {
    public static final int CONTEXT_FIELD_NUMBER = 1;
    private static final EsOffline$ContextInfo DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private EsOffline$Context context_;
    private h290 items_ = h.emptyProtobufList();

    static {
        EsOffline$ContextInfo esOffline$ContextInfo = new EsOffline$ContextInfo();
        DEFAULT_INSTANCE = esOffline$ContextInfo;
        h.registerDefaultInstance(EsOffline$ContextInfo.class, esOffline$ContextInfo);
    }

    private EsOffline$ContextInfo() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "context_", "items_", EsOffline$Item.class});
        }
        if (iOrdinal == 3) {
            return new EsOffline$ContextInfo();
        }
        if (iOrdinal == 4) {
            return new onz((byte) 23);
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
        synchronized (EsOffline$ContextInfo.class) {
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

    public final List getItemsList() {
        return this.items_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final EsOffline$Context o() {
        EsOffline$Context esOffline$Context = this.context_;
        return esOffline$Context == null ? EsOffline$Context.o() : esOffline$Context;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
