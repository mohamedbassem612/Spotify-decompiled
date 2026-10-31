package com.spotify.corex.readalong.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class TranscriptExcerpt extends h implements v2j0 {
    public static final int COLOUR_DATA_FIELD_NUMBER = 6;
    private static final TranscriptExcerpt DEFAULT_INSTANCE;
    public static final int END_MS_FIELD_NUMBER = 7;
    public static final int EPISODE_URI_FIELD_NUMBER = 1;
    public static final int LANGUAGE_FIELD_NUMBER = 4;
    public static final int OLD_COLOURS_ENABLED_FIELD_NUMBER = 8;
    private static volatile qzr0 PARSER = null;
    public static final int PUBLISHED_AT_FIELD_NUMBER = 3;
    public static final int SENTENCES_FIELD_NUMBER = 5;
    public static final int TRANSCRIPT_URI_FIELD_NUMBER = 2;
    private int bitField0_;
    private ColourData colourData_;
    private int endMs_;
    private boolean oldColoursEnabled_;
    private String episodeUri_ = "";
    private String transcriptUri_ = "";
    private String publishedAt_ = "";
    private String language_ = "";
    private h290 sentences_ = h.emptyProtobufList();

    public static final class Sentence extends h implements v2j0 {
        private static final Sentence DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int START_MS_FIELD_NUMBER = 2;
        public static final int TEXT_FIELD_NUMBER = 1;
        private int startMs_;
        private String text_ = "";

        static {
            Sentence sentence = new Sentence();
            DEFAULT_INSTANCE = sentence;
            h.registerDefaultInstance(Sentence.class, sentence);
        }

        private Sentence() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"text_", "startMs_"});
            }
            if (iOrdinal == 3) {
                return new Sentence();
            }
            if (iOrdinal == 4) {
                return new b(DEFAULT_INSTANCE);
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
            synchronized (Sentence.class) {
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

        public final int n() {
            return this.startMs_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String o() {
            return this.text_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        TranscriptExcerpt transcriptExcerpt = new TranscriptExcerpt();
        DEFAULT_INSTANCE = transcriptExcerpt;
        h.registerDefaultInstance(TranscriptExcerpt.class, transcriptExcerpt);
    }

    private TranscriptExcerpt() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u001b\u0006ဉ\u0000\u0007\u0004\b\u0007", new Object[]{"bitField0_", "episodeUri_", "transcriptUri_", "publishedAt_", "language_", "sentences_", Sentence.class, "colourData_", "endMs_", "oldColoursEnabled_"});
        }
        if (iOrdinal == 3) {
            return new TranscriptExcerpt();
        }
        if (iOrdinal == 4) {
            return new a(DEFAULT_INSTANCE);
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
        synchronized (TranscriptExcerpt.class) {
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

    public final String getLanguage() {
        return this.language_;
    }

    public final ColourData n() {
        ColourData colourData = this.colourData_;
        return colourData == null ? ColourData.o() : colourData;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.endMs_;
    }

    public final boolean p() {
        return this.oldColoursEnabled_;
    }

    public final String q() {
        return this.publishedAt_;
    }

    public final h290 r() {
        return this.sentences_;
    }

    public final String s() {
        return this.transcriptUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
