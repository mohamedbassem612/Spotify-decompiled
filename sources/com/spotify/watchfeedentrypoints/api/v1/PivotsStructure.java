package com.spotify.watchfeedentrypoints.api.v1;

import com.google.protobuf.h;
import p.bf40;
import p.ets0;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class PivotsStructure extends h implements v2j0 {
    private static final PivotsStructure DEFAULT_INSTANCE;
    public static final int FILTERS_SECTION_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int PROMPT_SECTION_FIELD_NUMBER = 3;
    public static final int SECTIONS_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private FiltersSection filtersSection_;
    private PromptSection promptSection_;
    private String title_ = "";
    private h290 sections_ = h.emptyProtobufList();

    static {
        PivotsStructure pivotsStructure = new PivotsStructure();
        DEFAULT_INSTANCE = pivotsStructure;
        h.registerDefaultInstance(PivotsStructure.class, pivotsStructure);
    }

    private PivotsStructure() {
    }

    public static PivotsStructure n() {
        return DEFAULT_INSTANCE;
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "title_", "sections_", PivotsSection.class, "promptSection_", "filtersSection_"});
        }
        if (iOrdinal == 3) {
            return new PivotsStructure();
        }
        if (iOrdinal == 4) {
            return new ets0(DEFAULT_INSTANCE, (byte) 11);
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
        synchronized (PivotsStructure.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final FiltersSection o() {
        FiltersSection filtersSection = this.filtersSection_;
        return filtersSection == null ? FiltersSection.n() : filtersSection;
    }

    public final PromptSection p() {
        PromptSection promptSection = this.promptSection_;
        return promptSection == null ? PromptSection.n() : promptSection;
    }

    public final h290 q() {
        return this.sections_;
    }

    public final boolean r() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean s() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
