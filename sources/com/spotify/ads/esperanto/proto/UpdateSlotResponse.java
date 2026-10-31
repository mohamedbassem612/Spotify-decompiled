package com.spotify.ads.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.pvh1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sug1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class UpdateSlotResponse extends h implements v2j0 {
    private static final UpdateSlotResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int status_;

    static {
        UpdateSlotResponse updateSlotResponse = new UpdateSlotResponse();
        DEFAULT_INSTANCE = updateSlotResponse;
        h.registerDefaultInstance(UpdateSlotResponse.class, updateSlotResponse);
    }

    private UpdateSlotResponse() {
    }

    public static UpdateSlotResponse p(byte[] bArr) {
        return (UpdateSlotResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"status_"});
        }
        if (iOrdinal == 3) {
            return new UpdateSlotResponse();
        }
        if (iOrdinal == 4) {
            return new sug1((byte) 20);
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
        synchronized (UpdateSlotResponse.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final pvh1 o() {
        pvh1 pvh1Var;
        int i = this.status_;
        if (i == 0) {
            pvh1Var = pvh1.OK;
        } else if (i != 1) {
            pvh1Var = i != 2 ? null : pvh1.BAD_REQUEST;
        } else {
            pvh1Var = pvh1.INVALID_SLOT;
        }
        return pvh1Var == null ? pvh1.UNRECOGNIZED : pvh1Var;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
