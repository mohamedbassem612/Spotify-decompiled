package com.spotify.agentgateway.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.jjn;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class CreateConversationResponse extends h implements v2j0 {
    public static final int AUDIO_URL_FIELD_NUMBER = 3;
    public static final int CONVERSATION_ID_FIELD_NUMBER = 1;
    public static final int CONVERSATION_NAME_FIELD_NUMBER = 5;
    private static final CreateConversationResponse DEFAULT_INSTANCE;
    public static final int INITIAL_RESPONSE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private AgentMessage initialResponse_;
    private String conversationId_ = "";
    private String audioUrl_ = "";
    private String conversationName_ = "";

    static {
        CreateConversationResponse createConversationResponse = new CreateConversationResponse();
        DEFAULT_INSTANCE = createConversationResponse;
        h.registerDefaultInstance(CreateConversationResponse.class, createConversationResponse);
    }

    private CreateConversationResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ለ\u0001\u0005Ȉ", new Object[]{"bitField0_", "conversationId_", "initialResponse_", "audioUrl_", "conversationName_"});
        }
        if (iOrdinal == 3) {
            return new CreateConversationResponse();
        }
        if (iOrdinal == 4) {
            return new jjn(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (CreateConversationResponse.class) {
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

    public final String o() {
        return this.conversationId_;
    }

    public final String p() {
        return this.conversationName_;
    }

    public final AgentMessage q() {
        AgentMessage agentMessage = this.initialResponse_;
        return agentMessage == null ? AgentMessage.p() : agentMessage;
    }

    public final boolean r() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean s() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
