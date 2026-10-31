package spotify.campfire.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class TasteMatchCard extends h implements v2j0 {
    private static final TasteMatchCard DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PLACEHOLDER_FIELD_NUMBER = 1;
    public static final int RESULT_FIELD_NUMBER = 2;
    private int stateCase_ = 0;
    private Object state_;

    public static final class Placeholder extends h implements v2j0 {
        private static final Placeholder DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;

        static {
            Placeholder placeholder = new Placeholder();
            DEFAULT_INSTANCE = placeholder;
            h.registerDefaultInstance(Placeholder.class, placeholder);
        }

        private Placeholder() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
            }
            if (iOrdinal == 3) {
                return new Placeholder();
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
            synchronized (Placeholder.class) {
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

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class TasteMatch extends h implements v2j0 {
        private static final TasteMatch DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int SHARED_ARTIST_URIS_FIELD_NUMBER = 1;
        public static final int SHARED_TRACK_URIS_FIELD_NUMBER = 2;
        private int bitField0_;
        private String sharedArtistUris_ = "";
        private String sharedTrackUris_ = "";

        static {
            TasteMatch tasteMatch = new TasteMatch();
            DEFAULT_INSTANCE = tasteMatch;
            h.registerDefaultInstance(TasteMatch.class, tasteMatch);
        }

        private TasteMatch() {
        }

        public static TasteMatch n() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "sharedArtistUris_", "sharedTrackUris_"});
            }
            if (iOrdinal == 3) {
                return new TasteMatch();
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
            synchronized (TasteMatch.class) {
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

        public final String getSharedArtistUris() {
            return this.sharedArtistUris_;
        }

        public final String getSharedTrackUris() {
            return this.sharedTrackUris_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class TasteMatchResult extends h implements v2j0 {
        private static final TasteMatchResult DEFAULT_INSTANCE;
        public static final int MATCH_PERCENTAGE_FIELD_NUMBER = 3;
        private static volatile qzr0 PARSER = null;
        public static final int TASTE_MATCH_FIELD_NUMBER = 2;
        public static final int TASTE_MATCH_SCORE_FIELD_NUMBER = 1;
        private int bitField0_;
        private int matchPercentage_;
        private float tasteMatchScore_;
        private TasteMatch tasteMatch_;

        static {
            TasteMatchResult tasteMatchResult = new TasteMatchResult();
            DEFAULT_INSTANCE = tasteMatchResult;
            h.registerDefaultInstance(TasteMatchResult.class, tasteMatchResult);
        }

        private TasteMatchResult() {
        }

        public static TasteMatchResult n() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ဉ\u0001\u0003ဋ\u0002", new Object[]{"bitField0_", "tasteMatchScore_", "tasteMatch_", "matchPercentage_"});
            }
            if (iOrdinal == 3) {
                return new TasteMatchResult();
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
            synchronized (TasteMatchResult.class) {
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

        public final int getMatchPercentage() {
            return this.matchPercentage_;
        }

        public final boolean hasMatchPercentage() {
            return (this.bitField0_ & 4) != 0;
        }

        public final boolean hasTasteMatch() {
            return (this.bitField0_ & 2) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final TasteMatch o() {
            TasteMatch tasteMatch = this.tasteMatch_;
            return tasteMatch == null ? TasteMatch.n() : tasteMatch;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        TasteMatchCard tasteMatchCard = new TasteMatchCard();
        DEFAULT_INSTANCE = tasteMatchCard;
        h.registerDefaultInstance(TasteMatchCard.class, tasteMatchCard);
    }

    private TasteMatchCard() {
    }

    public static TasteMatchCard p(byte[] bArr) {
        return (TasteMatchCard) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"state_", "stateCase_", Placeholder.class, TasteMatchResult.class});
        }
        if (iOrdinal == 3) {
            return new TasteMatchCard();
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
        synchronized (TasteMatchCard.class) {
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

    public final TasteMatchResult n() {
        return this.stateCase_ == 2 ? (TasteMatchResult) this.state_ : TasteMatchResult.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        int i = this.stateCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
