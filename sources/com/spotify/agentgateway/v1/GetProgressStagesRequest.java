package com.spotify.agentgateway.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yo40;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class GetProgressStagesRequest extends h implements v2j0 {
    public static final int CONVERSATION_ID_FIELD_NUMBER = 1;
    private static final GetProgressStagesRequest DEFAULT_INSTANCE;
    public static final int EXPERIENCE_NAME_FIELD_NUMBER = 3;
    public static final int INCLUDE_DEBUG_INFO_FIELD_NUMBER = 4;
    public static final int NEW_USER_MESSAGE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private String conversationId_ = "";
    private String experienceName_ = "";
    private boolean includeDebugInfo_;
    private UserMessage newUserMessage_;

    static {
        GetProgressStagesRequest getProgressStagesRequest = new GetProgressStagesRequest();
        DEFAULT_INSTANCE = getProgressStagesRequest;
        h.registerDefaultInstance(GetProgressStagesRequest.class, getProgressStagesRequest);
    }

    private GetProgressStagesRequest() {
    }

    public static yo40 o() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004\u0007", new Object[]{"bitField0_", "conversationId_", "newUserMessage_", "experienceName_", "includeDebugInfo_"});
        }
        if (iOrdinal == 3) {
            return new GetProgressStagesRequest();
        }
        if (iOrdinal == 4) {
            return new yo40();
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
        synchronized (GetProgressStagesRequest.class) {
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

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.conversationId_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.experienceName_ = str;
    }

    public final void r(UserMessage userMessage) {
        this.newUserMessage_ = userMessage;
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
