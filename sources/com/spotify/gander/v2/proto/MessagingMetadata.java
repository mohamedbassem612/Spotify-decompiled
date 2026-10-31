package com.spotify.gander.v2.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zcj0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class MessagingMetadata extends h implements v2j0 {
    private static final MessagingMetadata DEFAULT_INSTANCE;
    public static final int MESSAGE_ID_FIELD_NUMBER = 2;
    public static final int OPPORTUNITY_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private String opportunityId_ = "";
    private String messageId_ = "";

    static {
        MessagingMetadata messagingMetadata = new MessagingMetadata();
        DEFAULT_INSTANCE = messagingMetadata;
        h.registerDefaultInstance(MessagingMetadata.class, messagingMetadata);
    }

    private MessagingMetadata() {
    }

    public static MessagingMetadata n() {
        return DEFAULT_INSTANCE;
    }

    public static zcj0 p() {
        return (zcj0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"opportunityId_", "messageId_"});
        }
        if (iOrdinal == 3) {
            return new MessagingMetadata();
        }
        if (iOrdinal == 4) {
            return new zcj0(DEFAULT_INSTANCE);
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
        synchronized (MessagingMetadata.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.opportunityId_;
    }

    public final void q(String str) {
        this.opportunityId_ = str;
    }

    public final void setMessageId(String str) {
        this.messageId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
