package com.spotify.searchview.proto;

import p.bf40;
import p.h290;
import p.hhe;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ChatEntryPoint extends com.google.protobuf.h implements v2j0 {
    public static final int CHAT_STARTER_ITEMS_FIELD_NUMBER = 2;
    public static final int CONVERSATION_ID_FIELD_NUMBER = 3;
    private static final ChatEntryPoint DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PLACEHOLDER_FIELD_NUMBER = 1;
    private String placeholder_ = "";
    private h290 chatStarterItems_ = com.google.protobuf.h.emptyProtobufList();
    private String conversationId_ = "";

    static {
        ChatEntryPoint chatEntryPoint = new ChatEntryPoint();
        DEFAULT_INSTANCE = chatEntryPoint;
        com.google.protobuf.h.registerDefaultInstance(ChatEntryPoint.class, chatEntryPoint);
    }

    private ChatEntryPoint() {
    }

    public static ChatEntryPoint p() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003Ȉ", new Object[]{"placeholder_", "chatStarterItems_", ConversationStarterItem.class, "conversationId_"});
        }
        if (iOrdinal == 3) {
            return new ChatEntryPoint();
        }
        if (iOrdinal == 4) {
            return new hhe(DEFAULT_INSTANCE, (byte) 11);
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
        synchronized (ChatEntryPoint.class) {
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

    public final h290 n() {
        return this.chatStarterItems_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.conversationId_;
    }

    public final String q() {
        return this.placeholder_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
