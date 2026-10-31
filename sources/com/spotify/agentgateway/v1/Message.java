package com.spotify.agentgateway.v1;

import com.google.protobuf.h;
import p.bf40;
import p.eog0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class Message extends h implements v2j0 {
    public static final int AGENT_MESSAGE_FIELD_NUMBER = 1;
    public static final int CREATE_TIMESTAMP_FIELD_NUMBER = 3;
    private static final Message DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int USER_MESSAGE_FIELD_NUMBER = 2;
    private int bitField0_;
    private long createTimestamp_;
    private int messageContentsCase_ = 0;
    private Object messageContents_;

    static {
        Message message = new Message();
        DEFAULT_INSTANCE = message;
        h.registerDefaultInstance(Message.class, message);
    }

    private Message() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003ဂ\u0000", new Object[]{"messageContents_", "messageContentsCase_", "bitField0_", AgentMessage.class, UserMessage.class, "createTimestamp_"});
        }
        if (iOrdinal == 3) {
            return new Message();
        }
        if (iOrdinal == 4) {
            return new eog0(DEFAULT_INSTANCE, (byte) 26);
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
        synchronized (Message.class) {
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

    public final AgentMessage n() {
        return this.messageContentsCase_ == 1 ? (AgentMessage) this.messageContents_ : AgentMessage.p();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final long o() {
        return this.createTimestamp_;
    }

    public final UserMessage p() {
        return this.messageContentsCase_ == 2 ? (UserMessage) this.messageContents_ : UserMessage.n();
    }

    public final boolean q() {
        return this.messageContentsCase_ == 1;
    }

    public final boolean r() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean s() {
        return this.messageContentsCase_ == 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
