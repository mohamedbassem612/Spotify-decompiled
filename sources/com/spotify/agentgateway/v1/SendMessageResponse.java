package com.spotify.agentgateway.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.pg51;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class SendMessageResponse extends h implements v2j0 {
    public static final int AUDIO_URL_FIELD_NUMBER = 3;
    private static final SendMessageResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RESPONSE_FIELD_NUMBER = 1;
    private String audioUrl_ = "";
    private int bitField0_;
    private AgentMessage response_;

    static {
        SendMessageResponse sendMessageResponse = new SendMessageResponse();
        DEFAULT_INSTANCE = sendMessageResponse;
        h.registerDefaultInstance(SendMessageResponse.class, sendMessageResponse);
    }

    private SendMessageResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ለ\u0001", new Object[]{"bitField0_", "response_", "audioUrl_"});
        }
        if (iOrdinal == 3) {
            return new SendMessageResponse();
        }
        if (iOrdinal == 4) {
            return new pg51(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (SendMessageResponse.class) {
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
        return this.audioUrl_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final AgentMessage o() {
        AgentMessage agentMessage = this.response_;
        return agentMessage == null ? AgentMessage.p() : agentMessage;
    }

    public final boolean p() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
