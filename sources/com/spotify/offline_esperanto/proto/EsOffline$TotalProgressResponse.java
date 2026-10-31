package com.spotify.offline_esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xoz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class EsOffline$TotalProgressResponse extends h implements v2j0 {
    private static final EsOffline$TotalProgressResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PROGRESS_FIELD_NUMBER = 1;
    private int bitField0_;
    private EsOffline$Progress progress_;

    static {
        EsOffline$TotalProgressResponse esOffline$TotalProgressResponse = new EsOffline$TotalProgressResponse();
        DEFAULT_INSTANCE = esOffline$TotalProgressResponse;
        h.registerDefaultInstance(EsOffline$TotalProgressResponse.class, esOffline$TotalProgressResponse);
    }

    private EsOffline$TotalProgressResponse() {
    }

    public static EsOffline$TotalProgressResponse p(byte[] bArr) {
        return (EsOffline$TotalProgressResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "progress_"});
        }
        if (iOrdinal == 3) {
            return new EsOffline$TotalProgressResponse();
        }
        if (iOrdinal == 4) {
            return new xoz((byte) 10);
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
        synchronized (EsOffline$TotalProgressResponse.class) {
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

    public final EsOffline$Progress o() {
        EsOffline$Progress esOffline$Progress = this.progress_;
        return esOffline$Progress == null ? EsOffline$Progress.o() : esOffline$Progress;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
