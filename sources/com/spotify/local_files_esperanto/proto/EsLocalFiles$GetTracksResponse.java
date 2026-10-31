package com.spotify.local_files_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.onz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class EsLocalFiles$GetTracksResponse extends h implements v2j0 {
    public static final int DATA_FIELD_NUMBER = 2;
    private static final EsLocalFiles$GetTracksResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private EsLocalFiles$Response data_;
    private EsLocalFiles$ResponseStatus status_;

    static {
        EsLocalFiles$GetTracksResponse esLocalFiles$GetTracksResponse = new EsLocalFiles$GetTracksResponse();
        DEFAULT_INSTANCE = esLocalFiles$GetTracksResponse;
        h.registerDefaultInstance(EsLocalFiles$GetTracksResponse.class, esLocalFiles$GetTracksResponse);
    }

    private EsLocalFiles$GetTracksResponse() {
    }

    public static EsLocalFiles$GetTracksResponse o(byte[] bArr) {
        return (EsLocalFiles$GetTracksResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "status_", "data_"});
        }
        if (iOrdinal == 3) {
            return new EsLocalFiles$GetTracksResponse();
        }
        if (iOrdinal == 4) {
            return new onz(DEFAULT_INSTANCE, (byte) 12);
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
        synchronized (EsLocalFiles$GetTracksResponse.class) {
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

    public final EsLocalFiles$Response n() {
        EsLocalFiles$Response esLocalFiles$Response = this.data_;
        return esLocalFiles$Response == null ? EsLocalFiles$Response.n() : esLocalFiles$Response;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
