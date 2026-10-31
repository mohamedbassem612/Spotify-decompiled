package com.spotify.address.endpoint.model.v1.proto;

import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ExtraFields extends com.google.protobuf.h implements v2j0 {
    private static final ExtraFields DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 1;
    public static final int LEARN_MORE_EXPLANATION_FIELD_NUMBER = 3;
    public static final int LEGAL_TERMS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private Header header_;
    private LearnMoreExplanation learnMoreExplanation_;
    private h290 legalTerms_ = com.google.protobuf.h.emptyProtobufList();

    public static final class Header extends com.google.protobuf.h implements v2j0 {
        private static final Header DEFAULT_INSTANCE;
        public static final int LEARN_MORE_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER = null;
        public static final int TITLE_ADDRESS_FIELD_NUMBER = 3;
        public static final int TITLE_ENTER_BILLING_ADDRESS_FIELD_NUMBER = 2;
        private String learnMore_ = "";
        private String titleEnterBillingAddress_ = "";
        private String titleAddress_ = "";

        static {
            Header header = new Header();
            DEFAULT_INSTANCE = header;
            com.google.protobuf.h.registerDefaultInstance(Header.class, header);
        }

        private Header() {
        }

        public static Header n() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"learnMore_", "titleEnterBillingAddress_", "titleAddress_"});
            }
            if (iOrdinal == 3) {
                return new Header();
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
            synchronized (Header.class) {
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
            return this.learnMore_;
        }

        public final String p() {
            return this.titleEnterBillingAddress_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class LearnMoreExplanation extends com.google.protobuf.h implements v2j0 {
        public static final int BODY_FIELD_NUMBER = 3;
        private static final LearnMoreExplanation DEFAULT_INSTANCE;
        public static final int GOT_IT_FIELD_NUMBER = 5;
        public static final int LEARN_MORE_FIELD_NUMBER = 4;
        private static volatile qzr0 PARSER = null;
        public static final int SUBTITLE_FIELD_NUMBER = 2;
        public static final int TITLE_FIELD_NUMBER = 1;
        private String title_ = "";
        private String subtitle_ = "";
        private String body_ = "";
        private String learnMore_ = "";
        private String gotIt_ = "";

        static {
            LearnMoreExplanation learnMoreExplanation = new LearnMoreExplanation();
            DEFAULT_INSTANCE = learnMoreExplanation;
            com.google.protobuf.h.registerDefaultInstance(LearnMoreExplanation.class, learnMoreExplanation);
        }

        private LearnMoreExplanation() {
        }

        public static LearnMoreExplanation o() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"title_", "subtitle_", "body_", "learnMore_", "gotIt_"});
            }
            if (iOrdinal == 3) {
                return new LearnMoreExplanation();
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
            synchronized (LearnMoreExplanation.class) {
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

        public final String getSubtitle() {
            return this.subtitle_;
        }

        public final String getTitle() {
            return this.title_;
        }

        public final String n() {
            return this.body_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String p() {
            return this.gotIt_;
        }

        public final String q() {
            return this.learnMore_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        ExtraFields extraFields = new ExtraFields();
        DEFAULT_INSTANCE = extraFields;
        com.google.protobuf.h.registerDefaultInstance(ExtraFields.class, extraFields);
    }

    private ExtraFields() {
    }

    public static ExtraFields n() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002Ț\u0003ဉ\u0001", new Object[]{"bitField0_", "header_", "legalTerms_", "learnMoreExplanation_"});
        }
        if (iOrdinal == 3) {
            return new ExtraFields();
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
        synchronized (ExtraFields.class) {
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

    public final Header o() {
        Header header = this.header_;
        return header == null ? Header.n() : header;
    }

    public final LearnMoreExplanation p() {
        LearnMoreExplanation learnMoreExplanation = this.learnMoreExplanation_;
        return learnMoreExplanation == null ? LearnMoreExplanation.o() : learnMoreExplanation;
    }

    public final h290 q() {
        return this.legalTerms_;
    }

    public final boolean r() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
