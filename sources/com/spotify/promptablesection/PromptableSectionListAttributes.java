package com.spotify.promptablesection;

import com.google.protobuf.h;
import p.aj51;
import p.bf40;
import p.jf40;
import p.pi51;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vzw0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class PromptableSectionListAttributes extends h implements v2j0 {
    private static final PromptableSectionListAttributes DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 4;
    public static final int GENERATION_ID_FIELD_NUMBER = 5;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int PROMPT_FIELD_NUMBER = 1;
    public static final int SECTION_TYPE_FIELD_NUMBER = 3;
    public static final int STATE_FIELD_NUMBER = 2;
    private int bitField0_;
    private SectionError error_;
    private int sectionType_;
    private int state_;
    private String prompt_ = "";
    private String generationId_ = "";
    private String navigationUri_ = "";

    static {
        PromptableSectionListAttributes promptableSectionListAttributes = new PromptableSectionListAttributes();
        DEFAULT_INSTANCE = promptableSectionListAttributes;
        h.registerDefaultInstance(PromptableSectionListAttributes.class, promptableSectionListAttributes);
    }

    private PromptableSectionListAttributes() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static PromptableSectionListAttributes t(byte[] bArr) {
        return (PromptableSectionListAttributes) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ለ\u0000\u0002\f\u0003\f\u0004ဉ\u0001\u0005Ȉ\u0006ለ\u0002", new Object[]{"bitField0_", "prompt_", "state_", "sectionType_", "error_", "generationId_", "navigationUri_"});
        }
        if (iOrdinal == 3) {
            return new PromptableSectionListAttributes();
        }
        if (iOrdinal == 4) {
            return new vzw0(DEFAULT_INSTANCE, (byte) 26);
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
        synchronized (PromptableSectionListAttributes.class) {
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

    public final String getPrompt() {
        return this.prompt_;
    }

    public final SectionError n() {
        SectionError sectionError = this.error_;
        return sectionError == null ? SectionError.n() : sectionError;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.generationId_;
    }

    public final String p() {
        return this.navigationUri_;
    }

    public final aj51 q() {
        aj51 aj51Var;
        int i = this.sectionType_;
        if (i == 0) {
            aj51Var = aj51.SECTION_TYPE_UNDEFINED;
        } else if (i != 1) {
            aj51Var = i != 2 ? null : aj51.SECTION_TYPE_MDC;
        } else {
            aj51Var = aj51.SECTION_TYPE_CAROUSEL;
        }
        return aj51Var == null ? aj51.UNRECOGNIZED : aj51Var;
    }

    public final pi51 r() {
        pi51 pi51Var;
        int i = this.state_;
        if (i == 0) {
            pi51Var = pi51.SECTION_STATE_UNDEFINED;
        } else if (i == 1) {
            pi51Var = pi51.SECTION_STATE_EMPTY;
        } else if (i == 2) {
            pi51Var = pi51.SECTION_STATE_IN_PROGRESS;
        } else if (i != 3) {
            pi51Var = i != 4 ? null : pi51.SECTION_STATE_DELETED;
        } else {
            pi51Var = pi51.SECTION_STATE_POPULATED;
        }
        return pi51Var == null ? pi51.UNRECOGNIZED : pi51Var;
    }

    public final boolean s() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
