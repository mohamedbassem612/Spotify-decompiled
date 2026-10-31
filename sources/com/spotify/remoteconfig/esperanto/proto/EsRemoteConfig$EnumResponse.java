package com.spotify.remoteconfig.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vqz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class EsRemoteConfig$EnumResponse extends h implements v2j0 {
    private static final EsRemoteConfig$EnumResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int bitField0_;
    private String value_ = "";

    static {
        EsRemoteConfig$EnumResponse esRemoteConfig$EnumResponse = new EsRemoteConfig$EnumResponse();
        DEFAULT_INSTANCE = esRemoteConfig$EnumResponse;
        h.registerDefaultInstance(EsRemoteConfig$EnumResponse.class, esRemoteConfig$EnumResponse);
    }

    private EsRemoteConfig$EnumResponse() {
    }

    public static vqz n() {
        return (vqz) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"bitField0_", "value_"});
        }
        if (iOrdinal == 3) {
            return new EsRemoteConfig$EnumResponse();
        }
        if (iOrdinal == 4) {
            return new vqz(DEFAULT_INSTANCE);
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
        synchronized (EsRemoteConfig$EnumResponse.class) {
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
        str.getClass();
        this.bitField0_ |= 1;
        this.value_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
