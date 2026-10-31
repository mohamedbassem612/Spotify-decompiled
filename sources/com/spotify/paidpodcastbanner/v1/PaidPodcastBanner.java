package com.spotify.paidpodcastbanner.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.y5a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PaidPodcastBanner extends h implements v2j0 {
    public static final int BANNER_TEXT_FIELD_NUMBER = 4;
    public static final int BODY_FIELD_NUMBER = 8;
    public static final int CTA_FIELD_NUMBER = 9;
    private static final PaidPodcastBanner DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int SHOW_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int SHOW_IMAGE_URI_FIELD_NUMBER = 2;
    public static final int SHOW_PUBLISHER_NAME_FIELD_NUMBER = 5;
    public static final int SHOW_TITLE_FIELD_NUMBER = 3;
    public static final int SHOW_URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private Cta cta_;
    private int showContentType_;
    private String showUri_ = "";
    private String showImageUri_ = "";
    private String showTitle_ = "";
    private String bannerText_ = "";
    private String showPublisherName_ = "";
    private String header_ = "";
    private String body_ = "";

    public static final class Cta extends h implements v2j0 {
        public static final int CTA_TEXT_FIELD_NUMBER = 2;
        public static final int CTA_TYPE_FIELD_NUMBER = 1;
        private static final Cta DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;
        private int bitField0_;
        private String ctaText_ = "";
        private int ctaType_;

        static {
            Cta cta = new Cta();
            DEFAULT_INSTANCE = cta;
            h.registerDefaultInstance(Cta.class, cta);
        }

        private Cta() {
        }

        public static Cta p() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ለ\u0000", new Object[]{"bitField0_", "ctaType_", "ctaText_"});
            }
            if (iOrdinal == 3) {
                return new Cta();
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
            synchronized (Cta.class) {
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
            return this.ctaText_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final c o() {
            c cVar;
            int i = this.ctaType_;
            if (i == 0) {
                cVar = c.CTA_TYPE_UNKNOWN;
            } else if (i != 1) {
                cVar = i != 2 ? null : c.CTA_TYPE_CHEVRON;
            } else {
                cVar = c.CTA_TYPE_BUTTON;
            }
            return cVar == null ? c.UNRECOGNIZED : cVar;
        }

        public final boolean q() {
            return (this.bitField0_ & 1) != 0;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        PaidPodcastBanner paidPodcastBanner = new PaidPodcastBanner();
        DEFAULT_INSTANCE = paidPodcastBanner;
        h.registerDefaultInstance(PaidPodcastBanner.class, paidPodcastBanner);
    }

    private PaidPodcastBanner() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static PaidPodcastBanner w(byte[] bArr) {
        return (PaidPodcastBanner) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\f\u0007Ȉ\bȈ\tဉ\u0000", new Object[]{"bitField0_", "showUri_", "showImageUri_", "showTitle_", "bannerText_", "showPublisherName_", "showContentType_", "header_", "body_", "cta_"});
        }
        if (iOrdinal == 3) {
            return new PaidPodcastBanner();
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
        synchronized (PaidPodcastBanner.class) {
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
        return this.bannerText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.body_;
    }

    public final Cta p() {
        Cta cta = this.cta_;
        return cta == null ? Cta.p() : cta;
    }

    public final String q() {
        return this.header_;
    }

    public final y5a r() {
        y5a y5aVar;
        int i = this.showContentType_;
        if (i == 0) {
            y5aVar = y5a.CONTENT_TYPE_UNSPECIFIED;
        } else if (i == 1) {
            y5aVar = y5a.CONTENT_TYPE_PODCAST;
        } else if (i == 2) {
            y5aVar = y5a.CONTENT_TYPE_AUDIOBOOK;
        } else if (i == 3) {
            y5aVar = y5a.CONTENT_TYPE_CREATOR_CHANNEL;
        } else if (i != 4) {
            y5aVar = i != 5 ? null : y5a.CONTENT_TYPE_MEMBERSHIP;
        } else {
            y5aVar = y5a.CONTENT_TYPE_COURSE;
        }
        return y5aVar == null ? y5a.UNRECOGNIZED : y5aVar;
    }

    public final String s() {
        return this.showImageUri_;
    }

    public final String t() {
        return this.showPublisherName_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final String u() {
        return this.showTitle_;
    }

    public final String v() {
        return this.showUri_;
    }
}
