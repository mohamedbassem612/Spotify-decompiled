package com.spotify.playability.esperanto.proto;

import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xoz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class EsPlayability$GetLocallyPlayableResponse extends h implements v2j0 {
    private static final EsPlayability$GetLocallyPlayableResponse DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private h290 items_ = h.emptyProtobufList();

    static {
        EsPlayability$GetLocallyPlayableResponse esPlayability$GetLocallyPlayableResponse = new EsPlayability$GetLocallyPlayableResponse();
        DEFAULT_INSTANCE = esPlayability$GetLocallyPlayableResponse;
        h.registerDefaultInstance(EsPlayability$GetLocallyPlayableResponse.class, esPlayability$GetLocallyPlayableResponse);
    }

    private EsPlayability$GetLocallyPlayableResponse() {
    }

    public static EsPlayability$GetLocallyPlayableResponse n(byte[] bArr) {
        return (EsPlayability$GetLocallyPlayableResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"items_", EsPlayability$LocallyPlayable.class});
        }
        if (iOrdinal == 3) {
            return new EsPlayability$GetLocallyPlayableResponse();
        }
        if (iOrdinal == 4) {
            return new xoz(DEFAULT_INSTANCE, (byte) 17);
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
        synchronized (EsPlayability$GetLocallyPlayableResponse.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
