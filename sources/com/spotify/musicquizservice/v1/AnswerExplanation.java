package com.spotify.musicquizservice.v1;

import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class AnswerExplanation extends com.google.protobuf.h implements v2j0 {
    public static final int ASSETS_FIELD_NUMBER = 3;
    public static final int CAPTION_FIELD_NUMBER = 2;
    private static final AnswerExplanation DEFAULT_INSTANCE;
    public static final int ENTITY_URIS_FIELD_NUMBER = 6;
    public static final int EXPLANATION_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int QUESTION_ID_FIELD_NUMBER = 1;
    public static final int SOURCES_FIELD_NUMBER = 4;
    private Object visualExplanation_;
    private int visualExplanationCase_ = 0;
    private String questionId_ = "";
    private h290 sources_ = com.google.protobuf.h.emptyProtobufList();
    private String explanation_ = "";
    private h290 entityUris_ = com.google.protobuf.h.emptyProtobufList();

    public static final class Caption extends com.google.protobuf.h implements v2j0 {
        private static final Caption DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        private String text_ = "";

        static {
            Caption caption = new Caption();
            DEFAULT_INSTANCE = caption;
            com.google.protobuf.h.registerDefaultInstance(Caption.class, caption);
        }

        private Caption() {
        }

        public static Caption n() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"text_"});
            }
            if (iOrdinal == 3) {
                return new Caption();
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
            synchronized (Caption.class) {
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
            return this.text_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class ImageAsset extends com.google.protobuf.h implements v2j0 {
        private static final ImageAsset DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int SPOTIFY_URI_FIELD_NUMBER = 2;
        public static final int URL_FIELD_NUMBER = 1;
        private int sourceCase_ = 0;
        private Object source_;

        static {
            ImageAsset imageAsset = new ImageAsset();
            DEFAULT_INSTANCE = imageAsset;
            com.google.protobuf.h.registerDefaultInstance(ImageAsset.class, imageAsset);
        }

        private ImageAsset() {
        }

        public static ImageAsset n() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000", new Object[]{"source_", "sourceCase_"});
            }
            if (iOrdinal == 3) {
                return new ImageAsset();
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
            synchronized (ImageAsset.class) {
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

        public final String getUrl() {
            return this.sourceCase_ == 1 ? (String) this.source_ : "";
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final int o() {
            int i = this.sourceCase_;
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

        public final String p() {
            return this.sourceCase_ == 2 ? (String) this.source_ : "";
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class VideoAsset extends com.google.protobuf.h implements v2j0 {
        private static final VideoAsset DEFAULT_INSTANCE;
        public static final int MANIFEST_ID_FIELD_NUMBER = 2;
        public static final int MEDIA_URL_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER = null;
        public static final int TRACK_URI_FIELD_NUMBER = 3;
        private int sourceCase_ = 0;
        private Object source_;

        static {
            VideoAsset videoAsset = new VideoAsset();
            DEFAULT_INSTANCE = videoAsset;
            com.google.protobuf.h.registerDefaultInstance(VideoAsset.class, videoAsset);
        }

        private VideoAsset() {
        }

        public static VideoAsset n() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003Ȼ\u0000", new Object[]{"source_", "sourceCase_"});
            }
            if (iOrdinal == 3) {
                return new VideoAsset();
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
            synchronized (VideoAsset.class) {
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

        public final String getManifestId() {
            return this.sourceCase_ == 2 ? (String) this.source_ : "";
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String o() {
            return this.sourceCase_ == 1 ? (String) this.source_ : "";
        }

        public final int p() {
            int i = this.sourceCase_;
            if (i == 0) {
                return 4;
            }
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = 3;
                    if (i != 3) {
                        return 0;
                    }
                }
            }
            return i2;
        }

        public final String q() {
            return this.sourceCase_ == 3 ? (String) this.source_ : "";
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class VisualAsset extends com.google.protobuf.h implements v2j0 {
        private static final VisualAsset DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 3;
        public static final int IMAGE_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER = null;
        public static final int VIDEO_FIELD_NUMBER = 2;
        private Object assetSource_;
        private int assetSourceCase_ = 0;
        private String description_ = "";

        static {
            VisualAsset visualAsset = new VisualAsset();
            DEFAULT_INSTANCE = visualAsset;
            com.google.protobuf.h.registerDefaultInstance(VisualAsset.class, visualAsset);
        }

        private VisualAsset() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003Ȉ", new Object[]{"assetSource_", "assetSourceCase_", ImageAsset.class, VideoAsset.class, "description_"});
            }
            if (iOrdinal == 3) {
                return new VisualAsset();
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
            synchronized (VisualAsset.class) {
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

        public final String getDescription() {
            return this.description_;
        }

        public final int n() {
            int i = this.assetSourceCase_;
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

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final ImageAsset o() {
            return this.assetSourceCase_ == 1 ? (ImageAsset) this.assetSource_ : ImageAsset.n();
        }

        public final VideoAsset p() {
            return this.assetSourceCase_ == 2 ? (VideoAsset) this.assetSource_ : VideoAsset.n();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class VisualAssets extends com.google.protobuf.h implements v2j0 {
        public static final int ASSETS_FIELD_NUMBER = 1;
        private static final VisualAssets DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;
        private h290 assets_ = com.google.protobuf.h.emptyProtobufList();

        static {
            VisualAssets visualAssets = new VisualAssets();
            DEFAULT_INSTANCE = visualAssets;
            com.google.protobuf.h.registerDefaultInstance(VisualAssets.class, visualAssets);
        }

        private VisualAssets() {
        }

        public static VisualAssets o() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"assets_", VisualAsset.class});
            }
            if (iOrdinal == 3) {
                return new VisualAssets();
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
            synchronized (VisualAssets.class) {
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

        public final h290 n() {
            return this.assets_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        AnswerExplanation answerExplanation = new AnswerExplanation();
        DEFAULT_INSTANCE = answerExplanation;
        com.google.protobuf.h.registerDefaultInstance(AnswerExplanation.class, answerExplanation);
    }

    private AnswerExplanation() {
    }

    public static AnswerExplanation p() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0002\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004\u001b\u0005Ȉ\u0006Ț", new Object[]{"visualExplanation_", "visualExplanationCase_", "questionId_", Caption.class, VisualAssets.class, "sources_", Source.class, "explanation_", "entityUris_"});
        }
        if (iOrdinal == 3) {
            return new AnswerExplanation();
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
        synchronized (AnswerExplanation.class) {
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

    public final VisualAssets n() {
        return this.visualExplanationCase_ == 3 ? (VisualAssets) this.visualExplanation_ : VisualAssets.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Caption o() {
        return this.visualExplanationCase_ == 2 ? (Caption) this.visualExplanation_ : Caption.n();
    }

    public final h290 q() {
        return this.entityUris_;
    }

    public final String r() {
        return this.explanation_;
    }

    public final String s() {
        return this.questionId_;
    }

    public final h290 t() {
        return this.sources_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final int u() {
        int i = this.visualExplanationCase_;
        if (i == 0) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }
}
