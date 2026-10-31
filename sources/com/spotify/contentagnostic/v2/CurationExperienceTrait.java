package com.spotify.contentagnostic.v2;

import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class CurationExperienceTrait extends com.google.protobuf.h implements v2j0 {
    public static final int ALLOWED_METHODS_FIELD_NUMBER = 3;
    private static final CurationExperienceTrait DEFAULT_INSTANCE;
    public static final int DEFAULT_METHOD_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int URI_TO_CURATE_FIELD_NUMBER = 1;
    private int bitField0_;
    private Method defaultMethod_;
    private String uriToCurate_ = "";
    private h290 allowedMethods_ = com.google.protobuf.h.emptyProtobufList();

    public static final class Method extends com.google.protobuf.h implements v2j0 {
        public static final int ANY_PLAYLIST_FIELD_NUMBER = 4;
        public static final int COLLECTION_FIELD_NUMBER = 3;
        private static final Method DEFAULT_INSTANCE;
        private static volatile qzr0 PARSER = null;
        public static final int PLAYLIST_FIELD_NUMBER = 2;
        public static final int ROOTLIST_FIELD_NUMBER = 1;
        private int methodCase_ = 0;
        private Object method_;

        public static final class AnyUserPlaylist extends com.google.protobuf.h implements v2j0 {
            private static final AnyUserPlaylist DEFAULT_INSTANCE;
            public static final int EXCLUSIONS_FIELD_NUMBER = 1;
            private static volatile qzr0 PARSER;
            private h290 exclusions_ = com.google.protobuf.h.emptyProtobufList();

            static {
                AnyUserPlaylist anyUserPlaylist = new AnyUserPlaylist();
                DEFAULT_INSTANCE = anyUserPlaylist;
                com.google.protobuf.h.registerDefaultInstance(AnyUserPlaylist.class, anyUserPlaylist);
            }

            private AnyUserPlaylist() {
            }

            public static AnyUserPlaylist n() {
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"exclusions_"});
                }
                if (iOrdinal == 3) {
                    return new AnyUserPlaylist();
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
                synchronized (AnyUserPlaylist.class) {
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

            public final h290 o() {
                return this.exclusions_;
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class Collection extends com.google.protobuf.h implements v2j0 {
            private static final Collection DEFAULT_INSTANCE;
            private static volatile qzr0 PARSER = null;
            public static final int SET_FIELD_NUMBER = 1;
            private String set_ = "";

            static {
                Collection collection = new Collection();
                DEFAULT_INSTANCE = collection;
                com.google.protobuf.h.registerDefaultInstance(Collection.class, collection);
            }

            private Collection() {
            }

            public static Collection n() {
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"set_"});
                }
                if (iOrdinal == 3) {
                    return new Collection();
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
                synchronized (Collection.class) {
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
                return this.set_;
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class Playlist extends com.google.protobuf.h implements v2j0 {
            private static final Playlist DEFAULT_INSTANCE;
            private static volatile qzr0 PARSER = null;
            public static final int URI_FIELD_NUMBER = 1;
            private String uri_ = "";

            static {
                Playlist playlist = new Playlist();
                DEFAULT_INSTANCE = playlist;
                com.google.protobuf.h.registerDefaultInstance(Playlist.class, playlist);
            }

            private Playlist() {
            }

            public static Playlist n() {
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"uri_"});
                }
                if (iOrdinal == 3) {
                    return new Playlist();
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
                synchronized (Playlist.class) {
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

            public final String getUri() {
                return this.uri_;
            }

            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class Rootlist extends com.google.protobuf.h implements v2j0 {
            private static final Rootlist DEFAULT_INSTANCE;
            private static volatile qzr0 PARSER;

            static {
                Rootlist rootlist = new Rootlist();
                DEFAULT_INSTANCE = rootlist;
                com.google.protobuf.h.registerDefaultInstance(Rootlist.class, rootlist);
            }

            private Rootlist() {
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
                }
                if (iOrdinal == 3) {
                    return new Rootlist();
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
                synchronized (Rootlist.class) {
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
            Method method = new Method();
            DEFAULT_INSTANCE = method;
            com.google.protobuf.h.registerDefaultInstance(Method.class, method);
        }

        private Method() {
        }

        public static Method p() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"method_", "methodCase_", Rootlist.class, Playlist.class, Collection.class, AnyUserPlaylist.class});
            }
            if (iOrdinal == 3) {
                return new Method();
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
            synchronized (Method.class) {
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

        public final AnyUserPlaylist n() {
            return this.methodCase_ == 4 ? (AnyUserPlaylist) this.method_ : AnyUserPlaylist.n();
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final Collection o() {
            return this.methodCase_ == 3 ? (Collection) this.method_ : Collection.n();
        }

        public final int q() {
            int i = this.methodCase_;
            if (i == 0) {
                return 5;
            }
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = 3;
                    if (i != 3) {
                        i2 = 4;
                        if (i != 4) {
                            return 0;
                        }
                    }
                }
            }
            return i2;
        }

        public final Playlist r() {
            return this.methodCase_ == 2 ? (Playlist) this.method_ : Playlist.n();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        CurationExperienceTrait curationExperienceTrait = new CurationExperienceTrait();
        DEFAULT_INSTANCE = curationExperienceTrait;
        com.google.protobuf.h.registerDefaultInstance(CurationExperienceTrait.class, curationExperienceTrait);
    }

    private CurationExperienceTrait() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static CurationExperienceTrait q(byte[] bArr) {
        return (CurationExperienceTrait) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u001b", new Object[]{"bitField0_", "uriToCurate_", "defaultMethod_", "allowedMethods_", Method.class});
        }
        if (iOrdinal == 3) {
            return new CurationExperienceTrait();
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
        synchronized (CurationExperienceTrait.class) {
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
        return this.allowedMethods_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Method o() {
        Method method = this.defaultMethod_;
        return method == null ? Method.p() : method;
    }

    public final String p() {
        return this.uriToCurate_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
