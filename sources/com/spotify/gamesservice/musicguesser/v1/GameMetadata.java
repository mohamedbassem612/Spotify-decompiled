package com.spotify.gamesservice.musicguesser.v1;

import java.util.Collections;
import java.util.Map;
import p.bf40;
import p.jf40;
import p.qng0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class GameMetadata extends com.google.protobuf.h implements v2j0 {
    public static final int ARTIST_METADATA_FIELD_NUMBER = 2;
    private static final GameMetadata DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TRACK_METADATA_FIELD_NUMBER = 1;
    private qng0 artistMetadata_;
    private qng0 trackMetadata_;

    public static final class ArtistMetadata extends com.google.protobuf.h implements v2j0 {
        private static final ArtistMetadata DEFAULT_INSTANCE;
        public static final int DISPLAY_NAME_FIELD_NUMBER = 2;
        public static final int IMAGE_URL_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER;
        private String imageUrl_ = "";
        private String displayName_ = "";

        static {
            ArtistMetadata artistMetadata = new ArtistMetadata();
            DEFAULT_INSTANCE = artistMetadata;
            com.google.protobuf.h.registerDefaultInstance(ArtistMetadata.class, artistMetadata);
        }

        private ArtistMetadata() {
        }

        public static ArtistMetadata n() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"imageUrl_", "displayName_"});
            }
            if (iOrdinal == 3) {
                return new ArtistMetadata();
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
            synchronized (ArtistMetadata.class) {
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

        public final String getImageUrl() {
            return this.imageUrl_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class TrackMetadata extends com.google.protobuf.h implements v2j0 {
        private static final TrackMetadata DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int PREVIEW_TRACK_URL_FIELD_NUMBER = 1;
        private String previewTrackUrl_ = "";

        static {
            TrackMetadata trackMetadata = new TrackMetadata();
            DEFAULT_INSTANCE = trackMetadata;
            com.google.protobuf.h.registerDefaultInstance(TrackMetadata.class, trackMetadata);
        }

        private TrackMetadata() {
        }

        public static TrackMetadata n() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"previewTrackUrl_"});
            }
            if (iOrdinal == 3) {
                return new TrackMetadata();
            }
            if (iOrdinal == 4) {
                return new g(DEFAULT_INSTANCE);
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
            synchronized (TrackMetadata.class) {
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

        public final String o() {
            return this.previewTrackUrl_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        GameMetadata gameMetadata = new GameMetadata();
        DEFAULT_INSTANCE = gameMetadata;
        com.google.protobuf.h.registerDefaultInstance(GameMetadata.class, gameMetadata);
    }

    private GameMetadata() {
        qng0 qng0Var = qng0.b;
        this.trackMetadata_ = qng0Var;
        this.artistMetadata_ = qng0Var;
    }

    public static GameMetadata o() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0002\u0000\u0000\u00012\u00022", new Object[]{"trackMetadata_", h.a, "artistMetadata_", e.a});
        }
        if (iOrdinal == 3) {
            return new GameMetadata();
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
        synchronized (GameMetadata.class) {
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

    public final Map n() {
        return Collections.unmodifiableMap(this.artistMetadata_);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Map p() {
        return Collections.unmodifiableMap(this.trackMetadata_);
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
