package com.spotify.lyrics.serviceretrofit.proto.v3;

import com.google.protobuf.h;
import p.bf40;
import p.gtf0;
import p.h290;
import p.htf0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class LyricsV3Response extends h implements v2j0 {
    public static final int CAP_STATUS_FIELD_NUMBER = 7;
    private static final LyricsV3Response DEFAULT_INSTANCE;
    public static final int LANGUAGE_FIELD_NUMBER = 6;
    public static final int LINES_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PREVIEW_LINES_FIELD_NUMBER = 3;
    public static final int PROVIDER_FIELD_NUMBER = 4;
    public static final int SYNC_TYPE_FIELD_NUMBER = 1;
    public static final int TRANSLATION_FIELD_NUMBER = 5;
    private int bitField0_;
    private int capStatus_;
    private Language language_;
    private h290 lines_ = h.emptyProtobufList();
    private h290 previewLines_ = h.emptyProtobufList();
    private Provider provider_;
    private int syncType_;
    private Translation translation_;

    public static final class Language extends h implements v2j0 {
        public static final int CODE_FIELD_NUMBER = 1;
        private static final Language DEFAULT_INSTANCE;
        public static final int IS_RTL_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER;
        private String code_ = "";
        private boolean isRtl_;

        static {
            Language language = new Language();
            DEFAULT_INSTANCE = language;
            h.registerDefaultInstance(Language.class, language);
        }

        private Language() {
        }

        public static Language o() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"code_", "isRtl_"});
            }
            if (iOrdinal == 3) {
                return new Language();
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
            synchronized (Language.class) {
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

        public final String n() {
            return this.code_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final boolean p() {
            return this.isRtl_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class LyricsLine extends h implements v2j0 {
        private static final LyricsLine DEFAULT_INSTANCE;
        public static final int END_TIME_MS_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int START_TIME_MS_FIELD_NUMBER = 1;
        public static final int SYNC_DATA_FIELD_NUMBER = 4;
        public static final int WORDS_FIELD_NUMBER = 3;
        private long endTimeMs_;
        private long startTimeMs_;
        private String words_ = "";
        private h290 syncData_ = h.emptyProtobufList();

        public static final class SyncData extends h implements v2j0 {
            private static final SyncData DEFAULT_INSTANCE;
            public static final int END_TIME_MS_FIELD_NUMBER = 2;
            public static final int NUM_CHARS_FIELD_NUMBER = 3;
            private static volatile qzr0 PARSER = null;
            public static final int START_TIME_MS_FIELD_NUMBER = 1;
            private long endTimeMs_;
            private long numChars_;
            private long startTimeMs_;

            static {
                SyncData syncData = new SyncData();
                DEFAULT_INSTANCE = syncData;
                h.registerDefaultInstance(SyncData.class, syncData);
            }

            private SyncData() {
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
                    return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002", new Object[]{"startTimeMs_", "endTimeMs_", "numChars_"});
                }
                if (iOrdinal == 3) {
                    return new SyncData();
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
                synchronized (SyncData.class) {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0002\u0002\u0002\u0003Ȉ\u0004\u001b", new Object[]{"startTimeMs_", "endTimeMs_", "words_", "syncData_", SyncData.class});
            }
            if (iOrdinal == 3) {
                return new LyricsLine();
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
            return this.syncData_;
        }

        public final String p() {
            return this.words_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Provider extends h implements v2j0 {
        private static final Provider DEFAULT_INSTANCE;
        public static final int DISPLAY_NAME_FIELD_NUMBER = 3;
        public static final int LYRICS_ID_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER;
        private String name_ = "";
        private String lyricsId_ = "";
        private String displayName_ = "";

        static {
            Provider provider = new Provider();
            DEFAULT_INSTANCE = provider;
            h.registerDefaultInstance(Provider.class, provider);
        }

        private Provider() {
        }

        public static Provider n() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"name_", "lyricsId_", "displayName_"});
            }
            if (iOrdinal == 3) {
                return new Provider();
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
            synchronized (Provider.class) {
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

        public final String getDisplayName() {
            return this.displayName_;
        }

        public final String getName() {
            return this.name_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String o() {
            return this.lyricsId_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Translation extends h implements v2j0 {
        private static final Translation DEFAULT_INSTANCE;
        public static final int LANGUAGE_FIELD_NUMBER = 1;
        public static final int LINES_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER;
        private int bitField0_;
        private Language language_;
        private h290 lines_ = h.emptyProtobufList();

        static {
            Translation translation = new Translation();
            DEFAULT_INSTANCE = translation;
            h.registerDefaultInstance(Translation.class, translation);
        }

        private Translation() {
        }

        public static Translation n() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002Ț", new Object[]{"bitField0_", "language_", "lines_"});
            }
            if (iOrdinal == 3) {
                return new Translation();
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
            synchronized (Translation.class) {
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

        public final Language o() {
            Language language = this.language_;
            return language == null ? Language.o() : language;
        }

        public final h290 p() {
            return this.lines_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        LyricsV3Response lyricsV3Response = new LyricsV3Response();
        DEFAULT_INSTANCE = lyricsV3Response;
        h.registerDefaultInstance(LyricsV3Response.class, lyricsV3Response);
    }

    private LyricsV3Response() {
    }

    public static LyricsV3Response o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001\f\u0002\u001b\u0003\u001b\u0004ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0002\u0007\f", new Object[]{"bitField0_", "syncType_", "lines_", LyricsLine.class, "previewLines_", LyricsLine.class, "provider_", "translation_", "language_", "capStatus_"});
        }
        if (iOrdinal == 3) {
            return new LyricsV3Response();
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
        synchronized (LyricsV3Response.class) {
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

    public final gtf0 n() {
        gtf0 gtf0Var;
        int i = this.capStatus_;
        if (i == 0) {
            gtf0Var = gtf0.NONE;
        } else if (i != 1) {
            gtf0Var = i != 3 ? null : gtf0.CAPPED;
        } else {
            gtf0Var = gtf0.UNCAPPED;
        }
        return gtf0Var == null ? gtf0.UNRECOGNIZED : gtf0Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Language p() {
        Language language = this.language_;
        return language == null ? Language.o() : language;
    }

    public final h290 q() {
        return this.lines_;
    }

    public final Provider r() {
        Provider provider = this.provider_;
        return provider == null ? Provider.n() : provider;
    }

    public final htf0 s() {
        htf0 htf0Var;
        int i = this.syncType_;
        if (i == 0) {
            htf0Var = htf0.UNSYNCED;
        } else if (i != 1) {
            htf0Var = i != 2 ? null : htf0.RICH_SYNCED;
        } else {
            htf0Var = htf0.LINE_SYNCED;
        }
        return htf0Var == null ? htf0.UNRECOGNIZED : htf0Var;
    }

    public final Translation t() {
        Translation translation = this.translation_;
        return translation == null ? Translation.n() : translation;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
