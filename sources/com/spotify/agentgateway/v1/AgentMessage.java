package com.spotify.agentgateway.v1;

import com.google.protobuf.h;
import p.bf40;
import p.dw0;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class AgentMessage extends h implements v2j0 {
    public static final int ACTIONS_FIELD_NUMBER = 2;
    public static final int CONTENTS_FIELD_NUMBER = 1;
    private static final AgentMessage DEFAULT_INSTANCE;
    public static final int MESSAGE_ID_FIELD_NUMBER = 3;
    public static final int NAVIGATION_HINT_URI_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private h290 contents_ = h.emptyProtobufList();
    private h290 actions_ = h.emptyProtobufList();
    private String messageId_ = "";
    private String navigationHintUri_ = "";

    static {
        AgentMessage agentMessage = new AgentMessage();
        DEFAULT_INSTANCE = agentMessage;
        h.registerDefaultInstance(AgentMessage.class, agentMessage);
    }

    private AgentMessage() {
    }

    public static AgentMessage p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003Ȉ\u0005ለ\u0000", new Object[]{"bitField0_", "contents_", Content.class, "actions_", Action.class, "messageId_", "navigationHintUri_"});
        }
        if (iOrdinal == 3) {
            return new AgentMessage();
        }
        if (iOrdinal == 4) {
            return new dw0(DEFAULT_INSTANCE, (byte) 16);
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
        synchronized (AgentMessage.class) {
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

    public final String getMessageId() {
        return this.messageId_;
    }

    public final h290 n() {
        return this.actions_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.contents_;
    }

    public final String q() {
        return this.navigationHintUri_;
    }

    public final boolean r() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
