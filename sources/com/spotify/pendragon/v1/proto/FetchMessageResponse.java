package com.spotify.pendragon.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.fs00;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FetchMessageResponse extends h implements v2j0 {
    private static final FetchMessageResponse DEFAULT_INSTANCE;
    public static final int MESSAGE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private InAppMessage message_;

    static {
        FetchMessageResponse fetchMessageResponse = new FetchMessageResponse();
        DEFAULT_INSTANCE = fetchMessageResponse;
        h.registerDefaultInstance(FetchMessageResponse.class, fetchMessageResponse);
    }

    private FetchMessageResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "message_"});
        }
        if (iOrdinal == 3) {
            return new FetchMessageResponse();
        }
        if (iOrdinal == 4) {
            return new fs00((byte) 21);
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
        synchronized (FetchMessageResponse.class) {
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

    public final InAppMessage o() {
        InAppMessage inAppMessage = this.message_;
        return inAppMessage == null ? InAppMessage.q() : inAppMessage;
    }

    public final boolean p() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
