package com.spotify.watchfeed.component.layout.v1;

import com.google.protobuf.Any;
import com.google.protobuf.h;
import com.spotify.watchfeed.component.model.v1.proto.HeaderOverrides;
import com.spotify.watchfeed.component.model.v1.proto.MediaItem;
import com.spotify.watchfeed.component.model.v1.proto.StylingOverrides;
import p.bf40;
import p.h290;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class WatchFeedSurveyLayout extends h implements v2j0 {
    public static final int CONTENT_FIELD_NUMBER = 3;
    private static final WatchFeedSurveyLayout DEFAULT_INSTANCE;
    public static final int HEADER_OVERRIDES_FIELD_NUMBER = 9;
    public static final int ITEM_ID_FIELD_NUMBER = 4;
    public static final int MEDIA_ITEM_FIELD_NUMBER = 5;
    public static final int OPTIONS_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int REFERENCED_URI_FIELD_NUMBER = 2;
    public static final int SKIP_OPTION_FIELD_NUMBER = 8;
    public static final int STYLING_OVERRIDES_FIELD_NUMBER = 10;
    public static final int TITLE_FIELD_NUMBER = 6;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private Any content_;
    private HeaderOverrides headerOverrides_;
    private MediaItem mediaItem_;
    private SkipOption skipOption_;
    private StylingOverrides stylingOverrides_;
    private String uri_ = "";
    private String referencedUri_ = "";
    private String itemId_ = "";
    private String title_ = "";
    private h290 options_ = h.emptyProtobufList();

    public static final class Option extends h implements v2j0 {
        public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 2;
        private static final Option DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        public static final int VALUE_FIELD_NUMBER = 3;
        private String text_ = "";
        private String accessibilityText_ = "";
        private String value_ = "";

        static {
            Option option = new Option();
            DEFAULT_INSTANCE = option;
            h.registerDefaultInstance(Option.class, option);
        }

        private Option() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"text_", "accessibilityText_", "value_"});
            }
            if (iOrdinal == 3) {
                return new Option();
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
            synchronized (Option.class) {
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

        public final String getValue() {
            return this.value_;
        }

        public final String n() {
            return this.accessibilityText_;
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

    public static final class SkipOption extends h implements v2j0 {
        public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 2;
        private static final SkipOption DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        private String text_ = "";
        private String accessibilityText_ = "";

        static {
            SkipOption skipOption = new SkipOption();
            DEFAULT_INSTANCE = skipOption;
            h.registerDefaultInstance(SkipOption.class, skipOption);
        }

        private SkipOption() {
        }

        public static SkipOption o() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"text_", "accessibilityText_"});
            }
            if (iOrdinal == 3) {
                return new SkipOption();
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
            synchronized (SkipOption.class) {
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
            return this.accessibilityText_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String p() {
            return this.text_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        WatchFeedSurveyLayout watchFeedSurveyLayout = new WatchFeedSurveyLayout();
        DEFAULT_INSTANCE = watchFeedSurveyLayout;
        h.registerDefaultInstance(WatchFeedSurveyLayout.class, watchFeedSurveyLayout);
    }

    private WatchFeedSurveyLayout() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static WatchFeedSurveyLayout w(phc phcVar) {
        return (WatchFeedSurveyLayout) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004Ȉ\u0005ဉ\u0001\u0006Ȉ\u0007\u001b\bဉ\u0002\tဉ\u0003\nဉ\u0004", new Object[]{"bitField0_", "uri_", "referencedUri_", "content_", "itemId_", "mediaItem_", "title_", "options_", Option.class, "skipOption_", "headerOverrides_", "stylingOverrides_"});
        }
        if (iOrdinal == 3) {
            return new WatchFeedSurveyLayout();
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
        synchronized (WatchFeedSurveyLayout.class) {
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
        Any any = this.content_;
        return any == null ? Any.o() : any;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final HeaderOverrides o() {
        HeaderOverrides headerOverrides = this.headerOverrides_;
        return headerOverrides == null ? HeaderOverrides.o() : headerOverrides;
    }

    public final String p() {
        return this.itemId_;
    }

    public final MediaItem q() {
        MediaItem mediaItem = this.mediaItem_;
        return mediaItem == null ? MediaItem.n() : mediaItem;
    }

    public final h290 r() {
        return this.options_;
    }

    public final String s() {
        return this.referencedUri_;
    }

    public final SkipOption t() {
        SkipOption skipOption = this.skipOption_;
        return skipOption == null ? SkipOption.o() : skipOption;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean v() {
        return (this.bitField0_ & 4) != 0;
    }
}
