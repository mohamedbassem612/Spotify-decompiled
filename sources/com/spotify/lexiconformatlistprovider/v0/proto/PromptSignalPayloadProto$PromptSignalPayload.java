package com.spotify.lexiconformatlistprovider.v0.proto;

import com.google.protobuf.h;
import p.ayx0;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zxx0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class PromptSignalPayloadProto$PromptSignalPayload extends h implements v2j0 {
    private static final PromptSignalPayloadProto$PromptSignalPayload DEFAULT_INSTANCE;
    public static final int INPUT_TYPE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int USER_PROMPT_FIELD_NUMBER = 1;
    private int inputType_;
    private String userPrompt_ = "";

    static {
        PromptSignalPayloadProto$PromptSignalPayload promptSignalPayloadProto$PromptSignalPayload = new PromptSignalPayloadProto$PromptSignalPayload();
        DEFAULT_INSTANCE = promptSignalPayloadProto$PromptSignalPayload;
        h.registerDefaultInstance(PromptSignalPayloadProto$PromptSignalPayload.class, promptSignalPayloadProto$PromptSignalPayload);
    }

    private PromptSignalPayloadProto$PromptSignalPayload() {
    }

    public static zxx0 n() {
        return (zxx0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"userPrompt_", "inputType_"});
        }
        if (iOrdinal == 3) {
            return new PromptSignalPayloadProto$PromptSignalPayload();
        }
        if (iOrdinal == 4) {
            return new zxx0(DEFAULT_INSTANCE);
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
        synchronized (PromptSignalPayloadProto$PromptSignalPayload.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(ayx0 ayx0Var) {
        this.inputType_ = ayx0Var.getNumber();
    }

    public final void p(String str) {
        this.userPrompt_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
