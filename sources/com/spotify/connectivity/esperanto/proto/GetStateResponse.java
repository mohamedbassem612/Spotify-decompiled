package com.spotify.connectivity.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.iq40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sp40;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class GetStateResponse extends h implements v2j0 {
    private static final GetStateResponse DEFAULT_INSTANCE;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_CODE_FIELD_NUMBER = 1;
    public static final int STATUS_FIELD_NUMBER = 3;
    private int bitField0_;
    private int statusCode_;
    private String errorMessage_ = "";
    private String status_ = "";

    static {
        GetStateResponse getStateResponse = new GetStateResponse();
        DEFAULT_INSTANCE = getStateResponse;
        h.registerDefaultInstance(GetStateResponse.class, getStateResponse);
    }

    private GetStateResponse() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static GetStateResponse q(byte[] bArr) {
        return (GetStateResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ለ\u0000\u0003Ȉ", new Object[]{"bitField0_", "statusCode_", "errorMessage_", "status_"});
        }
        if (iOrdinal == 3) {
            return new GetStateResponse();
        }
        if (iOrdinal == 4) {
            return new sp40();
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
        synchronized (GetStateResponse.class) {
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

    public final String getStatus() {
        return this.status_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.errorMessage_;
    }

    public final iq40 p() {
        iq40 iq40Var;
        int i = this.statusCode_;
        if (i != 0) {
            iq40Var = i != 2 ? null : iq40.NOT_FOUND;
        } else {
            iq40Var = iq40.SUCCESS;
        }
        return iq40Var == null ? iq40.UNRECOGNIZED : iq40Var;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
