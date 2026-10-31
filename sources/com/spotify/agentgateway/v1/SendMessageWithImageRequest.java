package com.spotify.agentgateway.v1;

import com.google.protobuf.h;
import java.util.ArrayList;
import java.util.Iterator;
import p.b290;
import p.bf40;
import p.c290;
import p.dgb;
import p.er80;
import p.h290;
import p.i9;
import p.jf40;
import p.k461;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;
import p.w80;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class SendMessageWithImageRequest extends h implements v2j0 {
    public static final int CONVERSATION_ID_FIELD_NUMBER = 1;
    private static final SendMessageWithImageRequest DEFAULT_INSTANCE;
    public static final int ENTRYPOINT_FIELD_NUMBER = 8;
    public static final int EXPERIENCE_NAME_FIELD_NUMBER = 4;
    public static final int IMAGE_ATTACHMENTS_FIELD_NUMBER = 3;
    public static final int INCLUDE_DEBUG_INFO_FIELD_NUMBER = 5;
    public static final int INPUT_TYPE_FIELD_NUMBER = 9;
    public static final int NEW_USER_MESSAGE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PERSONA_FIELD_NUMBER = 10;
    public static final int SUPPORTED_ACTIONS_FIELD_NUMBER = 6;
    public static final int VARIANT_FIELD_NUMBER = 7;
    private static final c290 supportedActions_converter_ = new dgb((byte) 24);
    private int bitField0_;
    private boolean includeDebugInfo_;
    private UserMessage newUserMessage_;
    private int supportedActionsMemoizedSerializedSize;
    private String conversationId_ = "";
    private h290 imageAttachments_ = h.emptyProtobufList();
    private String experienceName_ = "";
    private b290 supportedActions_ = h.emptyIntList();
    private String variant_ = "";
    private String entrypoint_ = "";
    private String inputType_ = "";
    private String persona_ = "";

    static {
        SendMessageWithImageRequest sendMessageWithImageRequest = new SendMessageWithImageRequest();
        DEFAULT_INSTANCE = sendMessageWithImageRequest;
        h.registerDefaultInstance(SendMessageWithImageRequest.class, sendMessageWithImageRequest);
    }

    private SendMessageWithImageRequest() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static k461 q() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u001b\u0004Ȉ\u0005\u0007\u0006,\u0007ለ\u0001\bለ\u0002\tለ\u0003\nለ\u0004", new Object[]{"bitField0_", "conversationId_", "newUserMessage_", "imageAttachments_", ImageAttachment.class, "experienceName_", "includeDebugInfo_", "supportedActions_", "variant_", "entrypoint_", "inputType_", "persona_"});
        }
        if (iOrdinal == 3) {
            return new SendMessageWithImageRequest();
        }
        if (iOrdinal == 4) {
            return new k461();
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
        synchronized (SendMessageWithImageRequest.class) {
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

    public final void o(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.imageAttachments_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.imageAttachments_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(Iterable iterable) {
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

    public final void r(String str) {
        str.getClass();
        this.conversationId_ = str;
    }

    public final void s(String str) {
        this.bitField0_ |= 4;
        this.entrypoint_ = str;
    }

    public final void t(String str) {
        str.getClass();
        this.experienceName_ = str;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        this.bitField0_ |= 8;
        this.inputType_ = str;
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
