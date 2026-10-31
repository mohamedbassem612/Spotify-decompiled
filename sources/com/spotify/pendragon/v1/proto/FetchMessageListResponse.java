package com.spotify.pendragon.v1.proto;

import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.fs00;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FetchMessageListResponse extends h implements v2j0 {
    private static final FetchMessageListResponse DEFAULT_INSTANCE;
    public static final int MESSAGES_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int TRIGGERS_FIELD_NUMBER = 2;
    private h290 messages_ = h.emptyProtobufList();
    private h290 triggers_ = h.emptyProtobufList();

    static {
        FetchMessageListResponse fetchMessageListResponse = new FetchMessageListResponse();
        DEFAULT_INSTANCE = fetchMessageListResponse;
        h.registerDefaultInstance(FetchMessageListResponse.class, fetchMessageListResponse);
    }

    private FetchMessageListResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"messages_", InAppMessage.class, "triggers_", Trigger.class});
        }
        if (iOrdinal == 3) {
            return new FetchMessageListResponse();
        }
        if (iOrdinal == 4) {
            return new fs00((byte) 20);
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
        synchronized (FetchMessageListResponse.class) {
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

    public final List getMessagesList() {
        return this.messages_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.triggers_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
