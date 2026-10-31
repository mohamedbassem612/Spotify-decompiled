package com.spotify.offline_esperanto.proto;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class EsOffline$OfflineLicenseInfo extends h implements v2j0 {
    private static final EsOffline$OfflineLicenseInfo DEFAULT_INSTANCE;
    public static final int EXPIRY_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private Expiry expiry_;

    public static final class Expiry extends h implements v2j0 {
        private static final Expiry DEFAULT_INSTANCE;
        public static final int EPISODE_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int TRACK_FIELD_NUMBER = 1;
        private int bitField0_;
        private Timestamp episode_;
        private Timestamp track_;

        static {
            Expiry expiry = new Expiry();
            DEFAULT_INSTANCE = expiry;
            h.registerDefaultInstance(Expiry.class, expiry);
        }

        private Expiry() {
        }

        public static Expiry n() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "track_", "episode_"});
            }
            if (iOrdinal == 3) {
                return new Expiry();
            }
            if (iOrdinal == 4) {
                return new f(DEFAULT_INSTANCE);
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
            synchronized (Expiry.class) {
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

        public final Timestamp o() {
            Timestamp timestamp = this.episode_;
            return timestamp == null ? Timestamp.o() : timestamp;
        }

        public final Timestamp p() {
            Timestamp timestamp = this.track_;
            return timestamp == null ? Timestamp.o() : timestamp;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        EsOffline$OfflineLicenseInfo esOffline$OfflineLicenseInfo = new EsOffline$OfflineLicenseInfo();
        DEFAULT_INSTANCE = esOffline$OfflineLicenseInfo;
        h.registerDefaultInstance(EsOffline$OfflineLicenseInfo.class, esOffline$OfflineLicenseInfo);
    }

    private EsOffline$OfflineLicenseInfo() {
    }

    public static EsOffline$OfflineLicenseInfo o(byte[] bArr) {
        return (EsOffline$OfflineLicenseInfo) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "expiry_"});
        }
        if (iOrdinal == 3) {
            return new EsOffline$OfflineLicenseInfo();
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
        synchronized (EsOffline$OfflineLicenseInfo.class) {
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

    public final Expiry n() {
        Expiry expiry = this.expiry_;
        return expiry == null ? Expiry.n() : expiry;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
