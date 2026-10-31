package com.spotify.extendedmetadata.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uca;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class BatchedExtensionResponse extends h implements v2j0 {
    private static final BatchedExtensionResponse DEFAULT_INSTANCE;
    public static final int EXTENDED_METADATA_FIELD_NUMBER = 2;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private h290 extendedMetadata_ = h.emptyProtobufList();
    private BatchedExtensionResponseHeader header_;

    static {
        BatchedExtensionResponse batchedExtensionResponse = new BatchedExtensionResponse();
        DEFAULT_INSTANCE = batchedExtensionResponse;
        h.registerDefaultInstance(BatchedExtensionResponse.class, batchedExtensionResponse);
    }

    private BatchedExtensionResponse() {
    }

    public static BatchedExtensionResponse o() {
        return DEFAULT_INSTANCE;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "header_", "extendedMetadata_", EntityExtensionDataArray.class});
        }
        if (iOrdinal == 3) {
            return new BatchedExtensionResponse();
        }
        if (iOrdinal == 4) {
            return new uca((byte) 16);
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
        synchronized (BatchedExtensionResponse.class) {
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

    public final int p() {
        return this.extendedMetadata_.size();
    }

    public final h290 q() {
        return this.extendedMetadata_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
