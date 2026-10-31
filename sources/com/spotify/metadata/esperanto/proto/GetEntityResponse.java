package com.spotify.metadata.esperanto.proto;

import com.google.protobuf.h;
import com.spotify.metadata.cosmos.proto.MetadataCosmos;
import p.bf40;
import p.em40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class GetEntityResponse extends h implements v2j0 {
    private static final GetEntityResponse DEFAULT_INSTANCE;
    public static final int ITEM_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private MetadataCosmos.MetadataItem item_;

    static {
        GetEntityResponse getEntityResponse = new GetEntityResponse();
        DEFAULT_INSTANCE = getEntityResponse;
        h.registerDefaultInstance(GetEntityResponse.class, getEntityResponse);
    }

    private GetEntityResponse() {
    }

    public static GetEntityResponse o(byte[] bArr) {
        return (GetEntityResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "item_"});
        }
        if (iOrdinal == 3) {
            return new GetEntityResponse();
        }
        if (iOrdinal == 4) {
            return new em40(DEFAULT_INSTANCE, (byte) 12);
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
        synchronized (GetEntityResponse.class) {
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

    public final MetadataCosmos.MetadataItem n() {
        MetadataCosmos.MetadataItem metadataItem = this.item_;
        return metadataItem == null ? MetadataCosmos.MetadataItem.p() : metadataItem;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
