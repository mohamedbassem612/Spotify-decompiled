package com.spotify.checkout.proto.model.v1.proto;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class Error extends com.google.protobuf.h implements v2j0 {
    public static final int ACTION_CLOSE_FIELD_NUMBER = 10;
    public static final int ACTION_DOUBLE_LINK_FIELD_NUMBER = 12;
    public static final int ACTION_LINK_AND_CLOSE_FIELD_NUMBER = 13;
    public static final int ACTION_LINK_FIELD_NUMBER = 11;
    private static final Error DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private Object actions_;
    private int actionsCase_ = 0;
    private String title_ = "";
    private String description_ = "";

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

        public static k p() {
            return (k) DEFAULT_INSTANCE.createBuilder();
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
                return new k(DEFAULT_INSTANCE);
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

    public static final class DoubleFollowLinkCta extends com.google.protobuf.h implements v2j0 {
        private static final DoubleFollowLinkCta DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int PRIMARY_FIELD_NUMBER = 1;
        public static final int SECONDARY_FIELD_NUMBER = 2;
        private int bitField0_;
        private FollowLinkCta primary_;
        private FollowLinkCta secondary_;

        static {
            DoubleFollowLinkCta doubleFollowLinkCta = new DoubleFollowLinkCta();
            DEFAULT_INSTANCE = doubleFollowLinkCta;
            com.google.protobuf.h.registerDefaultInstance(DoubleFollowLinkCta.class, doubleFollowLinkCta);
        }

        private DoubleFollowLinkCta() {
        }

        public static DoubleFollowLinkCta n() {
            return DEFAULT_INSTANCE;
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static l q() {
            return (l) DEFAULT_INSTANCE.createBuilder();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "primary_", "secondary_"});
            }
            if (iOrdinal == 3) {
                return new DoubleFollowLinkCta();
            }
            if (iOrdinal == 4) {
                return new l(DEFAULT_INSTANCE);
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
            synchronized (DoubleFollowLinkCta.class) {
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

        public final FollowLinkCta o() {
            FollowLinkCta followLinkCta = this.primary_;
            return followLinkCta == null ? FollowLinkCta.n() : followLinkCta;
        }

        public final FollowLinkCta p() {
            FollowLinkCta followLinkCta = this.secondary_;
            return followLinkCta == null ? FollowLinkCta.n() : followLinkCta;
        }

        public final void r(FollowLinkCta followLinkCta) {
            followLinkCta.getClass();
            this.primary_ = followLinkCta;
            this.bitField0_ |= 1;
        }

        public final void s(FollowLinkCta followLinkCta) {
            followLinkCta.getClass();
            this.secondary_ = followLinkCta;
            this.bitField0_ |= 2;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    public static final class PrimaryLinkSecondaryCloseCta extends com.google.protobuf.h implements v2j0 {
        private static final PrimaryLinkSecondaryCloseCta DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int PRIMARY_FIELD_NUMBER = 1;
        public static final int SECONDARY_FIELD_NUMBER = 2;
        private int bitField0_;
        private FollowLinkCta primary_;
        private CloseCta secondary_;

        static {
            PrimaryLinkSecondaryCloseCta primaryLinkSecondaryCloseCta = new PrimaryLinkSecondaryCloseCta();
            DEFAULT_INSTANCE = primaryLinkSecondaryCloseCta;
            com.google.protobuf.h.registerDefaultInstance(PrimaryLinkSecondaryCloseCta.class, primaryLinkSecondaryCloseCta);
        }

        private PrimaryLinkSecondaryCloseCta() {
        }

        public static PrimaryLinkSecondaryCloseCta n() {
            return DEFAULT_INSTANCE;
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static m q() {
            return (m) DEFAULT_INSTANCE.createBuilder();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "primary_", "secondary_"});
            }
            if (iOrdinal == 3) {
                return new PrimaryLinkSecondaryCloseCta();
            }
            if (iOrdinal == 4) {
                return new m(DEFAULT_INSTANCE);
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
            synchronized (PrimaryLinkSecondaryCloseCta.class) {
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

        public final FollowLinkCta o() {
            FollowLinkCta followLinkCta = this.primary_;
            return followLinkCta == null ? FollowLinkCta.n() : followLinkCta;
        }

        public final CloseCta p() {
            CloseCta closeCta = this.secondary_;
            return closeCta == null ? CloseCta.n() : closeCta;
        }

        public final void r(FollowLinkCta followLinkCta) {
            followLinkCta.getClass();
            this.primary_ = followLinkCta;
            this.bitField0_ |= 1;
        }

        public final void s(CloseCta closeCta) {
            closeCta.getClass();
            this.secondary_ = closeCta;
            this.bitField0_ |= 2;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        Error error = new Error();
        DEFAULT_INSTANCE = error;
        com.google.protobuf.h.registerDefaultInstance(Error.class, error);
    }

    private Error() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Error s() {
        return DEFAULT_INSTANCE;
    }

    public static j t() {
        return (j) DEFAULT_INSTANCE.createBuilder();
    }

    public static Error u(byte[] bArr) {
        return (Error) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final void A(String str) {
        this.title_ = str;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\r\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000", new Object[]{"actions_", "actionsCase_", "title_", "description_", CloseCta.class, FollowLinkCta.class, DoubleFollowLinkCta.class, PrimaryLinkSecondaryCloseCta.class});
        }
        if (iOrdinal == 3) {
            return new Error();
        }
        if (iOrdinal == 4) {
            return new j(DEFAULT_INSTANCE);
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
        synchronized (Error.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final CloseCta n() {
        return this.actionsCase_ == 10 ? (CloseCta) this.actions_ : CloseCta.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final DoubleFollowLinkCta o() {
        return this.actionsCase_ == 12 ? (DoubleFollowLinkCta) this.actions_ : DoubleFollowLinkCta.n();
    }

    public final FollowLinkCta p() {
        return this.actionsCase_ == 11 ? (FollowLinkCta) this.actions_ : FollowLinkCta.n();
    }

    public final PrimaryLinkSecondaryCloseCta q() {
        return this.actionsCase_ == 13 ? (PrimaryLinkSecondaryCloseCta) this.actions_ : PrimaryLinkSecondaryCloseCta.n();
    }

    public final int r() {
        int i = this.actionsCase_;
        if (i == 0) {
            return 5;
        }
        switch (i) {
            case 10:
                return 1;
            case 11:
                return 2;
            case 12:
                return 3;
            case 13:
                return 4;
            default:
                return 0;
        }
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void v(CloseCta closeCta) {
        closeCta.getClass();
        this.actions_ = closeCta;
        this.actionsCase_ = 10;
    }

    public final void w(DoubleFollowLinkCta doubleFollowLinkCta) {
        doubleFollowLinkCta.getClass();
        this.actions_ = doubleFollowLinkCta;
        this.actionsCase_ = 12;
    }

    public final void x(FollowLinkCta followLinkCta) {
        followLinkCta.getClass();
        this.actions_ = followLinkCta;
        this.actionsCase_ = 11;
    }

    public final void y(PrimaryLinkSecondaryCloseCta primaryLinkSecondaryCloseCta) {
        primaryLinkSecondaryCloseCta.getClass();
        this.actions_ = primaryLinkSecondaryCloseCta;
        this.actionsCase_ = 13;
    }

    public final void z(String str) {
        this.description_ = str;
    }
}
