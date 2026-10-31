package com.spotify.watchfeed.component.layout.v1;

import com.google.protobuf.Any;
import com.google.protobuf.h;
import com.spotify.watchfeed.component.model.v1.proto.HeaderOverrides;
import com.spotify.watchfeed.component.model.v1.proto.Image;
import com.spotify.watchfeed.component.model.v1.proto.StylingOverrides;
import com.spotify.watchfeed.component.model.v1.proto.VideoFile;
import p.bf40;
import p.h290;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class WatchFeedPivotingCarouselLayout extends h implements v2j0 {
    public static final int BOTTOM_COMPONENT_FIELD_NUMBER = 8;
    public static final int CARDS_FIELD_NUMBER = 4;
    public static final int CONTENT_FIELD_NUMBER = 5;
    private static final WatchFeedPivotingCarouselLayout DEFAULT_INSTANCE;
    public static final int HEADER_OVERRIDES_FIELD_NUMBER = 9;
    public static final int HEADER_TITLE_OVERRIDE_FIELD_NUMBER = 6;
    public static final int HIDE_HEADER_FIELD_NUMBER = 7;
    public static final int ITEM_ID_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int STYLING_OVERRIDES_FIELD_NUMBER = 10;
    public static final int TITLE_FIELD_NUMBER = 3;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private Any bottomComponent_;
    private Any content_;
    private HeaderOverrides headerOverrides_;
    private boolean hideHeader_;
    private StylingOverrides stylingOverrides_;
    private String uri_ = "";
    private String itemId_ = "";
    private String title_ = "";
    private h290 cards_ = h.emptyProtobufList();
    private String headerTitleOverride_ = "";

    public static final class PivotingCard extends h implements v2j0 {
        public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 9;
        public static final int DECISION_ID_FIELD_NUMBER = 7;
        private static final PivotingCard DEFAULT_INSTANCE;
        public static final int FIRST_ITEM_URI_FIELD_NUMBER = 2;
        public static final int IS_LARGE_FIELD_NUMBER = 8;
        public static final int LOGO_IMAGE_FIELD_NUMBER = 10;
        public static final int NAVIGATION_URI_FIELD_NUMBER = 6;
        private static volatile qzr0 PARSER = null;
        public static final int THUMBNAIL_IMAGE_FIELD_NUMBER = 5;
        public static final int TITLE_FIELD_NUMBER = 3;
        public static final int URI_FIELD_NUMBER = 1;
        public static final int VIDEO_FILE_FIELD_NUMBER = 4;
        private int bitField0_;
        private boolean isLarge_;
        private Image logoImage_;
        private Image thumbnailImage_;
        private VideoFile videoFile_;
        private String uri_ = "";
        private String firstItemUri_ = "";
        private String title_ = "";
        private String navigationUri_ = "";
        private String decisionId_ = "";
        private String accessibilityText_ = "";

        static {
            PivotingCard pivotingCard = new PivotingCard();
            DEFAULT_INSTANCE = pivotingCard;
            h.registerDefaultInstance(PivotingCard.class, pivotingCard);
        }

        private PivotingCard() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000\u0005ဉ\u0001\u0006Ȉ\u0007Ȉ\b\u0007\tȈ\nဉ\u0002", new Object[]{"bitField0_", "uri_", "firstItemUri_", "title_", "videoFile_", "thumbnailImage_", "navigationUri_", "decisionId_", "isLarge_", "accessibilityText_", "logoImage_"});
            }
            if (iOrdinal == 3) {
                return new PivotingCard();
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
            synchronized (PivotingCard.class) {
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

        public final String getUri() {
            return this.uri_;
        }

        public final String n() {
            return this.accessibilityText_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String o() {
            return this.decisionId_;
        }

        public final String p() {
            return this.firstItemUri_;
        }

        public final boolean q() {
            return this.isLarge_;
        }

        public final Image r() {
            Image image = this.logoImage_;
            return image == null ? Image.n() : image;
        }

        public final String s() {
            return this.navigationUri_;
        }

        public final Image t() {
            Image image = this.thumbnailImage_;
            return image == null ? Image.n() : image;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public final VideoFile u() {
            VideoFile videoFile = this.videoFile_;
            return videoFile == null ? VideoFile.n() : videoFile;
        }

        public final boolean v() {
            return (this.bitField0_ & 4) != 0;
        }
    }

    static {
        WatchFeedPivotingCarouselLayout watchFeedPivotingCarouselLayout = new WatchFeedPivotingCarouselLayout();
        DEFAULT_INSTANCE = watchFeedPivotingCarouselLayout;
        h.registerDefaultInstance(WatchFeedPivotingCarouselLayout.class, watchFeedPivotingCarouselLayout);
    }

    private WatchFeedPivotingCarouselLayout() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static WatchFeedPivotingCarouselLayout w(phc phcVar) {
        return (WatchFeedPivotingCarouselLayout) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u001b\u0005ဉ\u0000\u0006Ȉ\u0007\u0007\bဉ\u0001\tဉ\u0002\nဉ\u0003", new Object[]{"bitField0_", "uri_", "itemId_", "title_", "cards_", PivotingCard.class, "content_", "headerTitleOverride_", "hideHeader_", "bottomComponent_", "headerOverrides_", "stylingOverrides_"});
        }
        if (iOrdinal == 3) {
            return new WatchFeedPivotingCarouselLayout();
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
        synchronized (WatchFeedPivotingCarouselLayout.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    public final Any n() {
        Any any = this.bottomComponent_;
        return any == null ? Any.o() : any;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 o() {
        return this.cards_;
    }

    public final Any p() {
        Any any = this.content_;
        return any == null ? Any.o() : any;
    }

    public final HeaderOverrides q() {
        HeaderOverrides headerOverrides = this.headerOverrides_;
        return headerOverrides == null ? HeaderOverrides.o() : headerOverrides;
    }

    public final String r() {
        return this.itemId_;
    }

    public final StylingOverrides s() {
        StylingOverrides stylingOverrides = this.stylingOverrides_;
        return stylingOverrides == null ? StylingOverrides.n() : stylingOverrides;
    }

    public final boolean t() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean v() {
        return (this.bitField0_ & 8) != 0;
    }
}
