package com.spotify.extendedmetadata.extensions.extendedcreditsimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ExtendedCredits extends h implements v2j0 {
    public static final int CREDITS_FIELD_NUMBER = 1;
    private static final ExtendedCredits DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private h290 credits_ = h.emptyProtobufList();

    public static final class Credit extends h implements v2j0 {
        public static final int ARTIST_NAME_FIELD_NUMBER = 2;
        public static final int ARTIST_URI_FIELD_NUMBER = 1;
        private static final Credit DEFAULT_INSTANCE;
        public static final int IS_ARTIST_URI_LINKABLE_FIELD_NUMBER = 5;
        public static final int ORDINAL_FIELD_NUMBER = 4;
        private static volatile qzr0 PARSER = null;
        public static final int ROLE_FIELD_NUMBER = 3;
        private boolean isArtistUriLinkable_;
        private int ordinal_;
        private String artistUri_ = "";
        private String artistName_ = "";
        private String role_ = "";

        static {
            Credit credit = new Credit();
            DEFAULT_INSTANCE = credit;
            h.registerDefaultInstance(Credit.class, credit);
        }

        private Credit() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0004\u0005\u0007", new Object[]{"artistUri_", "artistName_", "role_", "ordinal_", "isArtistUriLinkable_"});
            }
            if (iOrdinal == 3) {
                return new Credit();
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
            synchronized (Credit.class) {
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

        public final String getRole() {
            return this.role_;
        }

        public final String n() {
            return this.artistName_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String o() {
            return this.artistUri_;
        }

        public final boolean p() {
            return this.isArtistUriLinkable_;
        }

        public final int q() {
            return this.ordinal_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        ExtendedCredits extendedCredits = new ExtendedCredits();
        DEFAULT_INSTANCE = extendedCredits;
        h.registerDefaultInstance(ExtendedCredits.class, extendedCredits);
    }

    private ExtendedCredits() {
    }

    public static ExtendedCredits o(byte[] bArr) {
        return (ExtendedCredits) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"credits_", Credit.class});
        }
        if (iOrdinal == 3) {
            return new ExtendedCredits();
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
        synchronized (ExtendedCredits.class) {
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
        return this.credits_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
