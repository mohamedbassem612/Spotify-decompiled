package com.spotify.share.linkgeneration.api.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sug1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class UnshortenUrlResponse extends h implements v2j0 {
    public static final int CHANNEL_FIELD_NUMBER = 3;
    public static final int DATA_FIELD_NUMBER = 4;
    private static final UnshortenUrlResponse DEFAULT_INSTANCE;
    public static final int FEATURE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private UnshortenUrlResponseData data_;
    private int type_;
    private String feature_ = "";
    private String channel_ = "";

    static {
        UnshortenUrlResponse unshortenUrlResponse = new UnshortenUrlResponse();
        DEFAULT_INSTANCE = unshortenUrlResponse;
        h.registerDefaultInstance(UnshortenUrlResponse.class, unshortenUrlResponse);
    }

    private UnshortenUrlResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000", new Object[]{"bitField0_", "type_", "feature_", "channel_", "data_"});
        }
        if (iOrdinal == 3) {
            return new UnshortenUrlResponse();
        }
        if (iOrdinal == 4) {
            return new sug1(DEFAULT_INSTANCE, (byte) 12);
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
        synchronized (UnshortenUrlResponse.class) {
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

    public final String n() {
        return this.channel_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final UnshortenUrlResponseData o() {
        UnshortenUrlResponseData unshortenUrlResponseData = this.data_;
        return unshortenUrlResponseData == null ? UnshortenUrlResponseData.s() : unshortenUrlResponseData;
    }

    public final String p() {
        return this.feature_;
    }

    public final int q() {
        return this.type_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
