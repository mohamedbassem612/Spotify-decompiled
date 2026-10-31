package com.spotify.lyrics.serviceretrofit.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ColorLyricsResponse extends h implements v2j0 {
    public static final int COLORS_FIELD_NUMBER = 2;
    private static final ColorLyricsResponse DEFAULT_INSTANCE;
    public static final int HAS_VOCAL_REMOVAL_FIELD_NUMBER = 3;
    public static final int LYRICS_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private ColorData colors_;
    private boolean hasVocalRemoval_;
    private LyricsResponse lyrics_;

    public static final class ColorData extends h implements v2j0 {
        public static final int BACKGROUND_FIELD_NUMBER = 1;
        private static final ColorData DEFAULT_INSTANCE;
        public static final int HIGHLIGHT_TEXT_FIELD_NUMBER = 3;
        private static volatile qzr0 PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 2;
        private int background_;
        private int highlightText_;
        private int text_;

        static {
            ColorData colorData = new ColorData();
            DEFAULT_INSTANCE = colorData;
            h.registerDefaultInstance(ColorData.class, colorData);
        }

        private ColorData() {
        }

        public static ColorData o() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"background_", "text_", "highlightText_"});
            }
            if (iOrdinal == 3) {
                return new ColorData();
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
            synchronized (ColorData.class) {
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
            return this.background_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final int p() {
            return this.highlightText_;
        }

        public final int q() {
            return this.text_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        ColorLyricsResponse colorLyricsResponse = new ColorLyricsResponse();
        DEFAULT_INSTANCE = colorLyricsResponse;
        h.registerDefaultInstance(ColorLyricsResponse.class, colorLyricsResponse);
    }

    private ColorLyricsResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u0007", new Object[]{"bitField0_", "lyrics_", "colors_", "hasVocalRemoval_"});
        }
        if (iOrdinal == 3) {
            return new ColorLyricsResponse();
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
        synchronized (ColorLyricsResponse.class) {
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

    public final ColorData n() {
        ColorData colorData = this.colors_;
        return colorData == null ? ColorData.o() : colorData;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.hasVocalRemoval_;
    }

    public final LyricsResponse p() {
        LyricsResponse lyricsResponse = this.lyrics_;
        return lyricsResponse == null ? LyricsResponse.p() : lyricsResponse;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
