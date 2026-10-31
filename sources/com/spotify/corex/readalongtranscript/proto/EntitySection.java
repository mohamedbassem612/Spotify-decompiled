package com.spotify.corex.readalongtranscript.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class EntitySection extends h implements v2j0 {
    public static final int CONTENT_TYPE_LABEL_FIELD_NUMBER = 3;
    private static final EntitySection DEFAULT_INSTANCE;
    public static final int IMAGES_FIELD_NUMBER = 5;
    public static final int LIKE_URI_FIELD_NUMBER = 7;
    public static final int NAVIGATE_URI_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private Subtitle subtitle_;
    private String uri_ = "";
    private String title_ = "";
    private String contentTypeLabel_ = "";
    private h290 images_ = h.emptyProtobufList();
    private String navigateUri_ = "";
    private String likeUri_ = "";

    public static final class Subtitle extends h implements v2j0 {
        private static final Subtitle DEFAULT_INSTANCE;
        public static final int FULL_TEXT_FIELD_NUMBER = 1;
        public static final int LINKS_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER;
        private int bitField0_;
        private String fullText_ = "";
        private h290 links_ = h.emptyProtobufList();

        static {
            Subtitle subtitle = new Subtitle();
            DEFAULT_INSTANCE = subtitle;
            h.registerDefaultInstance(Subtitle.class, subtitle);
        }

        private Subtitle() {
        }

        public static Subtitle n() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ለ\u0000\u0002\u001b", new Object[]{"bitField0_", "fullText_", "links_", NavigableTitle.class});
            }
            if (iOrdinal == 3) {
                return new Subtitle();
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
            synchronized (Subtitle.class) {
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
            return this.fullText_;
        }

        public final h290 p() {
            return this.links_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        EntitySection entitySection = new EntitySection();
        DEFAULT_INSTANCE = entitySection;
        h.registerDefaultInstance(EntitySection.class, entitySection);
    }

    private EntitySection() {
    }

    public static EntitySection o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000\u0005\u001b\u0006ለ\u0001\u0007ለ\u0002", new Object[]{"bitField0_", "uri_", "title_", "contentTypeLabel_", "subtitle_", "images_", Image.class, "navigateUri_", "likeUri_"});
        }
        if (iOrdinal == 3) {
            return new EntitySection();
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
        synchronized (EntitySection.class) {
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
        return this.contentTypeLabel_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final h290 p() {
        return this.images_;
    }

    public final String q() {
        return this.likeUri_;
    }

    public final String r() {
        return this.navigateUri_;
    }

    public final Subtitle s() {
        Subtitle subtitle = this.subtitle_;
        return subtitle == null ? Subtitle.n() : subtitle;
    }

    public final boolean t() {
        return (this.bitField0_ & 4) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 2) != 0;
    }
}
