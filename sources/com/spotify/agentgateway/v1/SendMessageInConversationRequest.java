package com.spotify.agentgateway.v1;

import com.google.protobuf.h;
import java.util.Iterator;
import p.b290;
import p.bf40;
import p.c290;
import p.er80;
import p.h461;
import p.i9;
import p.jf40;
import p.lfb;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.w80;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class SendMessageInConversationRequest extends h implements v2j0 {
    public static final int CONVERSATION_ID_FIELD_NUMBER = 1;
    private static final SendMessageInConversationRequest DEFAULT_INSTANCE;
    public static final int ENTRYPOINT_FIELD_NUMBER = 7;
    public static final int EXPERIENCE_NAME_FIELD_NUMBER = 3;
    public static final int INCLUDE_DEBUG_INFO_FIELD_NUMBER = 4;
    public static final int INPUT_TYPE_FIELD_NUMBER = 8;
    public static final int INTERACTION_FIELD_NUMBER = 10;
    public static final int NEW_USER_MESSAGE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PERSONA_FIELD_NUMBER = 9;
    public static final int SUPPORTED_ACTIONS_FIELD_NUMBER = 5;
    public static final int VARIANT_FIELD_NUMBER = 6;
    private static final c290 supportedActions_converter_ = new lfb((byte) 24);
    private int bitField0_;
    private boolean includeDebugInfo_;
    private InteractionReference interaction_;
    private UserMessage newUserMessage_;
    private int supportedActionsMemoizedSerializedSize;
    private String conversationId_ = "";
    private String experienceName_ = "";
    private b290 supportedActions_ = h.emptyIntList();
    private String variant_ = "";
    private String entrypoint_ = "";
    private String inputType_ = "";
    private String persona_ = "";

    static {
        SendMessageInConversationRequest sendMessageInConversationRequest = new SendMessageInConversationRequest();
        DEFAULT_INSTANCE = sendMessageInConversationRequest;
        h.registerDefaultInstance(SendMessageInConversationRequest.class, sendMessageInConversationRequest);
    }

    private SendMessageInConversationRequest() {
    }

    public static h461 p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u0004\u0007\u0005,\u0006ለ\u0001\u0007ለ\u0002\bለ\u0003\tለ\u0004\nဉ\u0005", new Object[]{"bitField0_", "conversationId_", "newUserMessage_", "experienceName_", "includeDebugInfo_", "supportedActions_", "variant_", "entrypoint_", "inputType_", "persona_", "interaction_"});
        }
        if (iOrdinal == 3) {
            return new SendMessageInConversationRequest();
        }
        if (iOrdinal == 4) {
            return new h461();
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
        synchronized (SendMessageInConversationRequest.class) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(Iterable iterable) {
        b290 b290Var = this.supportedActions_;
        if (!((i9) b290Var).a) {
            this.supportedActions_ = h.mutableCopy(b290Var);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            w80 w80Var = (w80) it.next();
            ((er80) this.supportedActions_).c(w80Var.getNumber());
        }
    }

    public final void q(String str) {
        str.getClass();
        this.conversationId_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 4;
        this.entrypoint_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.experienceName_ = str;
    }

    public final void t(String str) {
        this.bitField0_ |= 8;
        this.inputType_ = str;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(InteractionReference interactionReference) {
        this.interaction_ = interactionReference;
        this.bitField0_ |= 32;
    }

    public final void v(UserMessage userMessage) {
        this.newUserMessage_ = userMessage;
        this.bitField0_ |= 1;
    }

    public final void w(String str) {
        this.bitField0_ |= 16;
        this.persona_ = str;
    }

    public final void x(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.variant_ = str;
    }
}
