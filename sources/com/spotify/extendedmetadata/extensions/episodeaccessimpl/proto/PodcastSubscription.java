package com.spotify.extendedmetadata.extensions.episodeaccessimpl.proto;

import com.google.protobuf.h;
import p.a9v0;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class PodcastSubscription extends h implements v2j0 {
    public static final int BADGE_FIELD_NUMBER = 5;
    private static final PodcastSubscription DEFAULT_INSTANCE;
    public static final int IS_PAYWALLED_FIELD_NUMBER = 1;
    public static final int IS_USER_SUBSCRIBED_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SIGNIFIER_FIELD_NUMBER = 4;
    public static final int USER_EXPLANATION_FIELD_NUMBER = 3;
    private int badge_;
    private int bitField0_;
    private boolean isPaywalled_;
    private boolean isUserSubscribed_;
    private Signifier signifier_;
    private int userExplanation_;

    public static final class Signifier extends h implements v2j0 {
        private static final Signifier DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        private String text_ = "";

        static {
            Signifier signifier = new Signifier();
            DEFAULT_INSTANCE = signifier;
            h.registerDefaultInstance(Signifier.class, signifier);
        }

        private Signifier() {
        }

        public static Signifier n() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"text_"});
            }
            if (iOrdinal == 3) {
                return new Signifier();
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
            synchronized (Signifier.class) {
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

    static {
        PodcastSubscription podcastSubscription = new PodcastSubscription();
        DEFAULT_INSTANCE = podcastSubscription;
        h.registerDefaultInstance(PodcastSubscription.class, podcastSubscription);
    }

    private PodcastSubscription() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static PodcastSubscription r(byte[] bArr) {
        return (PodcastSubscription) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\f\u0004ဉ\u0000\u0005\f", new Object[]{"bitField0_", "isPaywalled_", "isUserSubscribed_", "userExplanation_", "signifier_", "badge_"});
        }
        if (iOrdinal == 3) {
            return new PodcastSubscription();
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
        synchronized (PodcastSubscription.class) {
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

    public final a9v0 n() {
        a9v0 a9v0Var;
        int i = this.badge_;
        if (i != 0) {
            a9v0Var = i != 1 ? null : a9v0.BADGE_EXTRAS;
        } else {
            a9v0Var = a9v0.BADGE_UNSPECIFIED;
        }
        return a9v0Var == null ? a9v0.UNRECOGNIZED : a9v0Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.isPaywalled_;
    }

    public final boolean p() {
        return this.isUserSubscribed_;
    }

    public final Signifier q() {
        Signifier signifier = this.signifier_;
        return signifier == null ? Signifier.n() : signifier;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
