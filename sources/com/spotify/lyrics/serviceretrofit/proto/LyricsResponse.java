package com.spotify.lyrics.serviceretrofit.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.mnf0;
import p.nnf0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class LyricsResponse extends h implements v2j0 {
    public static final int ALTERNATIVES_FIELD_NUMBER = 9;
    public static final int CAP_STATUS_FIELD_NUMBER = 14;
    private static final LyricsResponse DEFAULT_INSTANCE;
    public static final int IS_RTL_LANGUAGE_FIELD_NUMBER = 11;
    public static final int LANGUAGE_FIELD_NUMBER = 10;
    public static final int LINES_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PROVIDER_DISPLAY_NAME_FIELD_NUMBER = 5;
    public static final int PROVIDER_FIELD_NUMBER = 3;
    public static final int PROVIDER_LYRICS_ID_FIELD_NUMBER = 4;
    public static final int SYNC_LYRICS_URI_FIELD_NUMBER = 7;
    public static final int SYNC_TYPE_FIELD_NUMBER = 1;
    public static final int TRANSLATION_LANGUAGES_FIELD_NUMBER = 19;
    private int capStatus_;
    private boolean isRtlLanguage_;
    private int syncType_;
    private h290 lines_ = h.emptyProtobufList();
    private String provider_ = "";
    private String providerLyricsId_ = "";
    private String providerDisplayName_ = "";
    private String syncLyricsUri_ = "";
    private h290 alternatives_ = h.emptyProtobufList();
    private String language_ = "";
    private h290 translationLanguages_ = h.emptyProtobufList();

    public static final class Alternative extends h implements v2j0 {
        private static final Alternative DEFAULT_INSTANCE;
        public static final int IS_RTL_LANGUAGE_FIELD_NUMBER = 3;
        public static final int LANGUAGE_FIELD_NUMBER = 1;
        public static final int LINES_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER;
        private boolean isRtlLanguage_;
        private String language_ = "";
        private h290 lines_ = h.emptyProtobufList();

        static {
            Alternative alternative = new Alternative();
            DEFAULT_INSTANCE = alternative;
            h.registerDefaultInstance(Alternative.class, alternative);
        }

        private Alternative() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003\u0007", new Object[]{"language_", "lines_", "isRtlLanguage_"});
            }
            if (iOrdinal == 3) {
                return new Alternative();
            }
            if (iOrdinal == 4) {
                return new c(DEFAULT_INSTANCE);
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
            synchronized (Alternative.class) {
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

        public final boolean n() {
            return this.isRtlLanguage_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final h290 o() {
            return this.lines_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class LyricsLine extends h implements v2j0 {
        private static final LyricsLine DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int START_TIME_MS_FIELD_NUMBER = 1;
        public static final int SYLLABLES_FIELD_NUMBER = 3;
        public static final int WORDS_FIELD_NUMBER = 2;
        private long startTimeMs_;
        private String words_ = "";
        private h290 syllables_ = h.emptyProtobufList();

        public static final class Syllable extends h implements v2j0 {
            private static final Syllable DEFAULT_INSTANCE;
            public static final int NUM_CHARS_FIELD_NUMBER = 2;
            private static volatile qzr0 PARSER = null;
            public static final int START_TIME_MS_FIELD_NUMBER = 1;
            private long numChars_;
            private long startTimeMs_;

            static {
                Syllable syllable = new Syllable();
                DEFAULT_INSTANCE = syllable;
                h.registerDefaultInstance(Syllable.class, syllable);
            }

            private Syllable() {
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
                    return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"startTimeMs_", "numChars_"});
                }
                if (iOrdinal == 3) {
                    return new Syllable();
                }
                if (iOrdinal == 4) {
                    return new f(DEFAULT_INSTANCE);
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
                synchronized (Syllable.class) {
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

            public final long n() {
                return this.numChars_;
            }

            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final long o() {
                return this.startTimeMs_;
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            LyricsLine lyricsLine = new LyricsLine();
            DEFAULT_INSTANCE = lyricsLine;
            h.registerDefaultInstance(LyricsLine.class, lyricsLine);
        }

        private LyricsLine() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0002\u0002Ȉ\u0003\u001b", new Object[]{"startTimeMs_", "words_", "syllables_", Syllable.class});
            }
            if (iOrdinal == 3) {
                return new LyricsLine();
            }
            if (iOrdinal == 4) {
                return new e(DEFAULT_INSTANCE);
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
            synchronized (LyricsLine.class) {
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

        public final long n() {
            return this.startTimeMs_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final h290 o() {
            return this.syllables_;
        }

        public final String p() {
            return this.words_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        LyricsResponse lyricsResponse = new LyricsResponse();
        DEFAULT_INSTANCE = lyricsResponse;
        h.registerDefaultInstance(LyricsResponse.class, lyricsResponse);
    }

    private LyricsResponse() {
    }

    public static LyricsResponse p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u0013\u000b\u0000\u0003\u0000\u0001\f\u0002\u001b\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0007Ȉ\t\u001b\nȈ\u000b\u0007\u000e\f\u0013Ț", new Object[]{"syncType_", "lines_", LyricsLine.class, "provider_", "providerLyricsId_", "providerDisplayName_", "syncLyricsUri_", "alternatives_", Alternative.class, "language_", "isRtlLanguage_", "capStatus_", "translationLanguages_"});
        }
        if (iOrdinal == 3) {
            return new LyricsResponse();
        }
        if (iOrdinal == 4) {
            return new d(DEFAULT_INSTANCE);
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
        synchronized (LyricsResponse.class) {
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

    public final h290 n() {
        return this.alternatives_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final mnf0 o() {
        mnf0 mnf0Var;
        int i = this.capStatus_;
        if (i == 0) {
            mnf0Var = mnf0.NONE;
        } else if (i != 1) {
            mnf0Var = i != 3 ? null : mnf0.CAPPED;
        } else {
            mnf0Var = mnf0.UNCAPPED;
        }
        return mnf0Var == null ? mnf0.UNRECOGNIZED : mnf0Var;
    }

    public final boolean q() {
        return this.isRtlLanguage_;
    }

    public final h290 r() {
        return this.lines_;
    }

    public final String s() {
        return this.provider_;
    }

    public final String t() {
        return this.providerDisplayName_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final String u() {
        return this.providerLyricsId_;
    }

    public final nnf0 v() {
        nnf0 nnf0Var;
        int i = this.syncType_;
        if (i == 0) {
            nnf0Var = nnf0.UNSYNCED;
        } else if (i != 1) {
            nnf0Var = i != 2 ? null : nnf0.SYLLABLE_SYNCED;
        } else {
            nnf0Var = nnf0.LINE_SYNCED;
        }
        return nnf0Var == null ? nnf0.UNRECOGNIZED : nnf0Var;
    }

    public final h290 w() {
        return this.translationLanguages_;
    }
}
