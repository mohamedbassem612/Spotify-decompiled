package com.spotify.personalizedepisodes.contentservice.v1;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.bf40;
import p.ckn;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class CreateGenerationRequest extends h implements v2j0 {
    public static final int ATTACHMENT_IDS_FIELD_NUMBER = 3;
    private static final CreateGenerationRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PROMPT_FIELD_NUMBER = 1;
    public static final int SCHEDULE_FIELD_NUMBER = 4;
    public static final int STEP_ANSWERS_FIELD_NUMBER = 5;
    public static final int VOICE_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private Schedule schedule_;
    private String prompt_ = "";
    private String voiceId_ = "";
    private h290 attachmentIds_ = h.emptyProtobufList();
    private h290 stepAnswers_ = h.emptyProtobufList();

    static {
        CreateGenerationRequest createGenerationRequest = new CreateGenerationRequest();
        DEFAULT_INSTANCE = createGenerationRequest;
        h.registerDefaultInstance(CreateGenerationRequest.class, createGenerationRequest);
    }

    private CreateGenerationRequest() {
    }

    public static ckn p() {
        return (ckn) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003Ț\u0004ဉ\u0000\u0005\u001b", new Object[]{"bitField0_", "prompt_", "voiceId_", "attachmentIds_", "schedule_", "stepAnswers_", StepAnswer.class});
        }
        if (iOrdinal == 3) {
            return new CreateGenerationRequest();
        }
        if (iOrdinal == 4) {
            return new ckn(DEFAULT_INSTANCE);
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
        synchronized (CreateGenerationRequest.class) {
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

    public final void n(Iterable iterable) {
        h290 h290VarMutableCopy = this.attachmentIds_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.attachmentIds_ = h290VarMutableCopy;
        }
        s8.addAll(iterable, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.stepAnswers_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.stepAnswers_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final void q(String str) {
        str.getClass();
        this.prompt_ = str;
    }

    public final void r(Schedule schedule) {
        this.schedule_ = schedule;
        this.bitField0_ |= 1;
    }

    public final void s(String str) {
        str.getClass();
        this.voiceId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
