package com.spotify.agentgateway.v1;

import com.google.protobuf.h;
import p.bf40;
import p.em40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class GetConversationStartersResponse extends h implements v2j0 {
    public static final int BIG_CHAT_HIGHLIGHTED_INTENT_ID_FIELD_NUMBER = 6;
    public static final int CONVERSATION_STARTERS_FIELD_NUMBER = 2;
    private static final GetConversationStartersResponse DEFAULT_INSTANCE;
    public static final int GROUPED_CONVERSATION_STARTERS_FIELD_NUMBER = 4;
    public static final int MINI_CHAT_HIGHLIGHTED_INTENT_ID_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int PROSUP_REQUEST_ID_FIELD_NUMBER = 3;
    private int bitField0_;
    private h290 conversationStarters_ = h.emptyProtobufList();
    private String prosupRequestId_ = "";
    private h290 groupedConversationStarters_ = h.emptyProtobufList();
    private String miniChatHighlightedIntentId_ = "";
    private String bigChatHighlightedIntentId_ = "";

    static {
        GetConversationStartersResponse getConversationStartersResponse = new GetConversationStartersResponse();
        DEFAULT_INSTANCE = getConversationStartersResponse;
        h.registerDefaultInstance(GetConversationStartersResponse.class, getConversationStartersResponse);
    }

    private GetConversationStartersResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0002\u0000\u0002\u001b\u0003Ȉ\u0004\u001b\u0005ለ\u0000\u0006ለ\u0001", new Object[]{"bitField0_", "conversationStarters_", ConversationStarter.class, "prosupRequestId_", "groupedConversationStarters_", ConversationStarterIntentGroup.class, "miniChatHighlightedIntentId_", "bigChatHighlightedIntentId_"});
        }
        if (iOrdinal == 3) {
            return new GetConversationStartersResponse();
        }
        if (iOrdinal == 4) {
            return new em40(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (GetConversationStartersResponse.class) {
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
        return this.bigChatHighlightedIntentId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.conversationStarters_;
    }

    public final h290 p() {
        return this.groupedConversationStarters_;
    }

    public final String q() {
        return this.miniChatHighlightedIntentId_;
    }

    public final String r() {
        return this.prosupRequestId_;
    }

    public final boolean s() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean t() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
