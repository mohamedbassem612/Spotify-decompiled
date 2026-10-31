package com.spotify.checkout.proto.model.v1.proto;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class CheckoutStatus extends com.google.protobuf.h implements v2j0 {
    public static final int CLOSE_CTA_FIELD_NUMBER = 10;
    private static final CheckoutStatus DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private Object cta_;
    private int ctaCase_ = 0;
    private String title_ = "";
    private String subtitle_ = "";

    public static final class CloseCta extends com.google.protobuf.h implements v2j0 {
        private static final CloseCta DEFAULT_INSTANCE;
        public static final int LABEL_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER;
        private String label_ = "";

        static {
            CloseCta closeCta = new CloseCta();
            DEFAULT_INSTANCE = closeCta;
            com.google.protobuf.h.registerDefaultInstance(CloseCta.class, closeCta);
        }

        private CloseCta() {
        }

        public static CloseCta n() {
            return DEFAULT_INSTANCE;
        }

        public static i p() {
            return (i) DEFAULT_INSTANCE.createBuilder();
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"label_"});
            }
            if (iOrdinal == 3) {
                return new CloseCta();
            }
            if (iOrdinal == 4) {
                return new i(DEFAULT_INSTANCE);
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
            synchronized (CloseCta.class) {
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
            return this.label_;
        }

        public final void q(String str) {
            this.label_ = str;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        CheckoutStatus checkoutStatus = new CheckoutStatus();
        DEFAULT_INSTANCE = checkoutStatus;
        com.google.protobuf.h.registerDefaultInstance(CheckoutStatus.class, checkoutStatus);
    }

    private CheckoutStatus() {
    }

    public static CheckoutStatus p() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static h q() {
        return (h) DEFAULT_INSTANCE.createBuilder();
    }

    public static CheckoutStatus r(byte[] bArr) {
        return (CheckoutStatus) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\n\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\n<\u0000", new Object[]{"cta_", "ctaCase_", "title_", "subtitle_", CloseCta.class});
        }
        if (iOrdinal == 3) {
            return new CheckoutStatus();
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
        synchronized (CheckoutStatus.class) {
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

    public final CloseCta n() {
        return this.ctaCase_ == 10 ? (CloseCta) this.cta_ : CloseCta.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        int i = this.ctaCase_;
        if (i != 0) {
            return i != 10 ? 0 : 1;
        }
        return 2;
    }

    public final void s(CloseCta closeCta) {
        closeCta.getClass();
        this.cta_ = closeCta;
        this.ctaCase_ = 10;
    }

    public final void setSubtitle(String str) {
        this.subtitle_ = str;
    }

    public final void t(String str) {
        this.title_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
