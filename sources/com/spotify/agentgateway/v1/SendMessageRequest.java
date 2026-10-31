package com.spotify.agentgateway.v1;

import com.google.protobuf.h;
import p.b290;
import p.bf40;
import p.c290;
import p.h290;
import p.jf40;
import p.nfb;
import p.pg51;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class SendMessageRequest extends h implements v2j0 {
    private static final SendMessageRequest DEFAULT_INSTANCE;
    public static final int ENTRYPOINT_FIELD_NUMBER = 8;
    public static final int EXPERIENCE_NAME_FIELD_NUMBER = 2;
    public static final int INCLUDE_DEBUG_INFO_FIELD_NUMBER = 3;
    public static final int INPUT_TYPE_FIELD_NUMBER = 9;
    public static final int MESSAGES_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PERSONA_FIELD_NUMBER = 10;
    public static final int SUPPORTED_ACTIONS_FIELD_NUMBER = 4;
    public static final int VARIANT_FIELD_NUMBER = 7;
    private static final c290 supportedActions_converter_ = new nfb((byte) 24, false);
    private int bitField0_;
    private boolean includeDebugInfo_;
    private int supportedActionsMemoizedSerializedSize;
    private h290 messages_ = h.emptyProtobufList();
    private String experienceName_ = "";
    private b290 supportedActions_ = h.emptyIntList();
    private String variant_ = "";
    private String entrypoint_ = "";
    private String inputType_ = "";
    private String persona_ = "";

    static {
        SendMessageRequest sendMessageRequest = new SendMessageRequest();
        DEFAULT_INSTANCE = sendMessageRequest;
        h.registerDefaultInstance(SendMessageRequest.class, sendMessageRequest);
    }

    private SendMessageRequest() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\n\b\u0000\u0002\u0000\u0001\u001b\u0002Ȉ\u0003\u0007\u0004,\u0007ለ\u0000\bለ\u0001\tለ\u0002\nለ\u0003", new Object[]{"bitField0_", "messages_", Message.class, "experienceName_", "includeDebugInfo_", "supportedActions_", "variant_", "entrypoint_", "inputType_", "persona_"});
        }
        if (iOrdinal == 3) {
            return new SendMessageRequest();
        }
        if (iOrdinal == 4) {
            return new pg51((byte) 24);
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
        synchronized (SendMessageRequest.class) {
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

    @Override // com.google.protobuf.h, p.s2j0
    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
