package com.spotify.upsells.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yga;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class BatchShouldUpsellRequestItem extends h implements v2j0 {
    private static final BatchShouldUpsellRequestItem DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REQUEST_FIELD_NUMBER = 2;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private String requestId_ = "";
    private ShouldUpsellRequest request_;

    static {
        BatchShouldUpsellRequestItem batchShouldUpsellRequestItem = new BatchShouldUpsellRequestItem();
        DEFAULT_INSTANCE = batchShouldUpsellRequestItem;
        h.registerDefaultInstance(BatchShouldUpsellRequestItem.class, batchShouldUpsellRequestItem);
    }

    private BatchShouldUpsellRequestItem() {
    }

    public static yga n() {
        return (yga) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "requestId_", "request_"});
        }
        if (iOrdinal == 3) {
            return new BatchShouldUpsellRequestItem();
        }
        if (iOrdinal == 4) {
            return new yga(DEFAULT_INSTANCE);
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
        synchronized (BatchShouldUpsellRequestItem.class) {
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

    public final void o(ShouldUpsellRequest shouldUpsellRequest) {
        shouldUpsellRequest.getClass();
        this.request_ = shouldUpsellRequest;
        this.bitField0_ |= 1;
    }

    public final void p(String str) {
        str.getClass();
        this.requestId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
