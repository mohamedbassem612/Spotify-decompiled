package com.spotify.offline.offlineplugin_proto;

import com.google.protobuf.Any;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class EsOfflinePlugin$Metadata extends com.google.protobuf.h implements v2j0 {
    private static final EsOfflinePlugin$Metadata DEFAULT_INSTANCE;
    public static final int EXTENSION_DATA_FIELD_NUMBER = 2;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private Any extensionData_;
    private Header header_;

    public static final class Header extends com.google.protobuf.h implements v2j0 {
        private static final Header DEFAULT_INSTANCE;
        public static final int IS_EMPTY_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int STATUS_CODE_FIELD_NUMBER = 1;
        private boolean isEmpty_;
        private int statusCode_;

        static {
            Header header = new Header();
            DEFAULT_INSTANCE = header;
            com.google.protobuf.h.registerDefaultInstance(Header.class, header);
        }

        private Header() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0007", new Object[]{"statusCode_", "isEmpty_"});
            }
            if (iOrdinal == 3) {
                return new Header();
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

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        EsOfflinePlugin$Metadata esOfflinePlugin$Metadata = new EsOfflinePlugin$Metadata();
        DEFAULT_INSTANCE = esOfflinePlugin$Metadata;
        com.google.protobuf.h.registerDefaultInstance(EsOfflinePlugin$Metadata.class, esOfflinePlugin$Metadata);
    }

    private EsOfflinePlugin$Metadata() {
    }

    public static EsOfflinePlugin$Metadata n() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "header_", "extensionData_"});
        }
        if (iOrdinal == 3) {
            return new EsOfflinePlugin$Metadata();
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
        synchronized (EsOfflinePlugin$Metadata.class) {
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

    public final Any o() {
        Any any = this.extensionData_;
        return any == null ? Any.o() : any;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
