package com.spotify.scrollsita.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.nle;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class Chapters extends h implements v2j0 {
    public static final int CHAPTER_ITEMS_FIELD_NUMBER = 2;
    public static final int CURATION_BLOCKED_FIELD_NUMBER = 4;
    private static final Chapters DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 1;
    public static final int ML_GENERATED_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 5;
    private boolean curationBlocked_;
    private boolean mlGenerated_;
    private String entityUri_ = "";
    private h290 chapterItems_ = h.emptyProtobufList();
    private String title_ = "";

    static {
        Chapters chapters = new Chapters();
        DEFAULT_INSTANCE = chapters;
        h.registerDefaultInstance(Chapters.class, chapters);
    }

    private Chapters() {
    }

    public static Chapters o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static nle q() {
        return (nle) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\u0007\u0004\u0007\u0005Ȉ", new Object[]{"entityUri_", "chapterItems_", ChapterItem.class, "mlGenerated_", "curationBlocked_", "title_"});
        }
        if (iOrdinal == 3) {
            return new Chapters();
        }
        if (iOrdinal == 4) {
            return new nle(DEFAULT_INSTANCE);
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
        synchronized (Chapters.class) {
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

    public final String getEntityUri() {
        return this.entityUri_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final h290 n() {
        return this.chapterItems_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean p() {
        return this.mlGenerated_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
