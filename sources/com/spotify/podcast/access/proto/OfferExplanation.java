package com.spotify.podcast.access.proto;

import java.util.List;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class OfferExplanation extends com.google.protobuf.h implements v2j0 {
    private static final OfferExplanation DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SECTIONS_FIELD_NUMBER = 2;
    public static final int TERMS_FOOTER_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int UNAVAILABLE_FOOTER_FIELD_NUMBER = 5;
    private Object footer_;
    private int footerCase_ = 0;
    private String title_ = "";
    private h290 sections_ = com.google.protobuf.h.emptyProtobufList();

    public static final class Cta extends com.google.protobuf.h implements v2j0 {
        public static final int CTA_TEXT_FIELD_NUMBER = 3;
        public static final int CTA_TYPE_FIELD_NUMBER = 1;
        public static final int CTA_URI_FIELD_NUMBER = 2;
        private static final Cta DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;
        private int ctaType_;
        private String ctaUri_ = "";
        private String ctaText_ = "";

        static {
            Cta cta = new Cta();
            DEFAULT_INSTANCE = cta;
            com.google.protobuf.h.registerDefaultInstance(Cta.class, cta);
        }

        private Cta() {
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static Cta q() {
            return DEFAULT_INSTANCE;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ", new Object[]{"ctaType_", "ctaUri_", "ctaText_"});
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
                cVar = c.UNSPECIFIED;
            } else if (i == 1) {
                cVar = c.EXTERNAL_LINK;
            } else if (i != 2) {
                cVar = i != 3 ? null : c.INTERNAL_REDIRECT;
            } else {
                cVar = c.EMAIL;
            }
            return cVar == null ? c.UNRECOGNIZED : cVar;
        }

        public final String p() {
            return this.ctaUri_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class Section extends com.google.protobuf.h implements v2j0 {
        public static final int BODY_FIELD_NUMBER = 3;
        private static final Section DEFAULT_INSTANCE;
        public static final int HEADER_FIELD_NUMBER = 2;
        public static final int ICON_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 4;
        private int bitField0_;
        private Body body_;
        private int icon_;
        private String header_ = "";
        private String text_ = "";

        public static final class Body extends com.google.protobuf.h implements v2j0 {
            private static final Body DEFAULT_INSTANCE;
            public static final int ITEMS_FIELD_NUMBER = 1;
            private static volatile qzr0 PARSER;
            private h290 items_ = com.google.protobuf.h.emptyProtobufList();

            static {
                Body body = new Body();
                DEFAULT_INSTANCE = body;
                com.google.protobuf.h.registerDefaultInstance(Body.class, body);
            }

            private Body() {
            }

            public static Body n() {
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"items_"});
                }
                if (iOrdinal == 3) {
                    return new Body();
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
                synchronized (Body.class) {
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

            public final List getItemsList() {
                return this.items_;
            }

            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            Section section = new Section();
            DEFAULT_INSTANCE = section;
            com.google.protobuf.h.registerDefaultInstance(Section.class, section);
        }

        private Section() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003ဉ\u0000\u0004Ȉ", new Object[]{"bitField0_", "icon_", "header_", "body_", "text_"});
            }
            if (iOrdinal == 3) {
                return new Section();
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
            synchronized (Section.class) {
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

        public final Body n() {
            Body body = this.body_;
            return body == null ? Body.n() : body;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String o() {
            return this.header_;
        }

        public final f p() {
            f fVar;
            int i = this.icon_;
            if (i == 0) {
                fVar = f.NONE;
            } else if (i != 1) {
                fVar = i != 2 ? null : f.PADLOCK;
            } else {
                fVar = f.HEART;
            }
            return fVar == null ? f.UNRECOGNIZED : fVar;
        }

        public final String q() {
            return this.text_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class TermsFooter extends com.google.protobuf.h implements v2j0 {
        public static final int BODY_FIELD_NUMBER = 1;
        public static final int CTA_FIELD_NUMBER = 2;
        private static final TermsFooter DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int TERMS_TEXT_FIELD_NUMBER = 4;
        public static final int TERMS_URI_FIELD_NUMBER = 3;
        private int bitField0_;
        private Cta cta_;
        private String body_ = "";
        private String termsUri_ = "";
        private String termsText_ = "";

        static {
            TermsFooter termsFooter = new TermsFooter();
            DEFAULT_INSTANCE = termsFooter;
            com.google.protobuf.h.registerDefaultInstance(TermsFooter.class, termsFooter);
        }

        private TermsFooter() {
        }

        public static TermsFooter p() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u0004Ȉ", new Object[]{"bitField0_", "body_", "cta_", "termsUri_", "termsText_"});
            }
            if (iOrdinal == 3) {
                return new TermsFooter();
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
            synchronized (TermsFooter.class) {
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
            return this.body_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final Cta o() {
            Cta cta = this.cta_;
            return cta == null ? Cta.q() : cta;
        }

        public final String q() {
            return this.termsText_;
        }

        public final String r() {
            return this.termsUri_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class UnavailableFooter extends com.google.protobuf.h implements v2j0 {
        public static final int BODY_FIELD_NUMBER = 1;
        private static final UnavailableFooter DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER;
        private String body_ = "";

        static {
            UnavailableFooter unavailableFooter = new UnavailableFooter();
            DEFAULT_INSTANCE = unavailableFooter;
            com.google.protobuf.h.registerDefaultInstance(UnavailableFooter.class, unavailableFooter);
        }

        private UnavailableFooter() {
        }

        public static UnavailableFooter o() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"body_"});
            }
            if (iOrdinal == 3) {
                return new UnavailableFooter();
            }
            if (iOrdinal == 4) {
                return new h(DEFAULT_INSTANCE);
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
            synchronized (UnavailableFooter.class) {
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
            return this.body_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        OfferExplanation offerExplanation = new OfferExplanation();
        DEFAULT_INSTANCE = offerExplanation;
        com.google.protobuf.h.registerDefaultInstance(OfferExplanation.class, offerExplanation);
    }

    private OfferExplanation() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static OfferExplanation s(byte[] bArr) {
        return (OfferExplanation) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0005\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0004<\u0000\u0005<\u0000", new Object[]{"footer_", "footerCase_", "title_", "sections_", Section.class, TermsFooter.class, UnavailableFooter.class});
        }
        if (iOrdinal == 3) {
            return new OfferExplanation();
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
        synchronized (OfferExplanation.class) {
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

    public final h290 n() {
        return this.sections_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final TermsFooter o() {
        return this.footerCase_ == 4 ? (TermsFooter) this.footer_ : TermsFooter.p();
    }

    public final UnavailableFooter p() {
        return this.footerCase_ == 5 ? (UnavailableFooter) this.footer_ : UnavailableFooter.o();
    }

    public final boolean q() {
        return this.footerCase_ == 4;
    }

    public final boolean r() {
        return this.footerCase_ == 5;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
