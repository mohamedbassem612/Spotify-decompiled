package com.spotify.personalizedepisodes.contentservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vzw0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class PromptCategory extends h implements v2j0 {
    private static final PromptCategory DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LABEL_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PROMPTS_FIELD_NUMBER = 3;
    private String id_ = "";
    private String label_ = "";
    private h290 prompts_ = h.emptyProtobufList();

    static {
        PromptCategory promptCategory = new PromptCategory();
        DEFAULT_INSTANCE = promptCategory;
        h.registerDefaultInstance(PromptCategory.class, promptCategory);
    }

    private PromptCategory() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b", new Object[]{"id_", "label_", "prompts_", Prompt.class});
        }
        if (iOrdinal == 3) {
            return new PromptCategory();
        }
        if (iOrdinal == 4) {
            return new vzw0(DEFAULT_INSTANCE, (byte) 22);
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
        synchronized (PromptCategory.class) {
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

    public final String getId() {
        return this.id_;
    }

    public final String n() {
        return this.label_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.prompts_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
