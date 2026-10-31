package com.spotify.messages;

import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class UbiProd1Impression$SourcePaths extends com.google.protobuf.h implements v2j0 {
    private static final UbiProd1Impression$SourcePaths DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PATH_FIELD_NUMBER = 1;
    private h290 path_ = com.google.protobuf.h.emptyProtobufList();

    public static final class Path extends com.google.protobuf.h implements v2j0 {
        private static final Path DEFAULT_INSTANCE;
        public static final int ELEMENTS_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int VERSION_FIELD_NUMBER = 1;
        private int bitField0_;
        private String version_ = "";
        private h290 elements_ = com.google.protobuf.h.emptyProtobufList();

        public static final class Elements extends com.google.protobuf.h implements v2j0 {
            private static final Elements DEFAULT_INSTANCE;
            public static final int ID_FIELD_NUMBER = 3;
            public static final int NAME_FIELD_NUMBER = 1;
            private static volatile qzr0 PARSER = null;
            public static final int POS_FIELD_NUMBER = 2;
            public static final int REASON_FIELD_NUMBER = 5;
            public static final int URI_FIELD_NUMBER = 4;
            private int bitField0_;
            private String name_ = "";
            private String pos_ = "";
            private String id_ = "";
            private String uri_ = "";
            private String reason_ = "";

            static {
                Elements elements = new Elements();
                DEFAULT_INSTANCE = elements;
                com.google.protobuf.h.registerDefaultInstance(Elements.class, elements);
            }

            private Elements() {
            }

            public static d n() {
                return (d) DEFAULT_INSTANCE.createBuilder();
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "name_", "pos_", "id_", "uri_", "reason_"});
                }
                if (iOrdinal == 3) {
                    return new Elements();
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
                synchronized (Elements.class) {
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

            public final void o(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.id_ = str;
            }

            public final void p(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.name_ = str;
            }

            public final void q(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.pos_ = str;
            }

            public final void r(String str) {
                str.getClass();
                this.bitField0_ |= 16;
                this.reason_ = str;
            }

            public final void s(String str) {
                str.getClass();
                this.bitField0_ |= 8;
                this.uri_ = str;
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            Path path = new Path();
            DEFAULT_INSTANCE = path;
            com.google.protobuf.h.registerDefaultInstance(Path.class, path);
        }

        private Path() {
        }

        public static c p() {
            return (c) DEFAULT_INSTANCE.createBuilder();
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"bitField0_", "version_", "elements_", Elements.class});
            }
            if (iOrdinal == 3) {
                return new Path();
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
            synchronized (Path.class) {
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

        public final void n(Elements elements) {
            elements.getClass();
            h290 h290VarMutableCopy = this.elements_;
            if (!((i9) h290VarMutableCopy).a) {
                h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
                this.elements_ = h290VarMutableCopy;
            }
            h290VarMutableCopy.add(elements);
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final int o() {
            return this.elements_.size();
        }

        public final void q(String str) {
            this.bitField0_ |= 1;
            this.version_ = str;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        UbiProd1Impression$SourcePaths ubiProd1Impression$SourcePaths = new UbiProd1Impression$SourcePaths();
        DEFAULT_INSTANCE = ubiProd1Impression$SourcePaths;
        com.google.protobuf.h.registerDefaultInstance(UbiProd1Impression$SourcePaths.class, ubiProd1Impression$SourcePaths);
    }

    private UbiProd1Impression$SourcePaths() {
    }

    public static b p() {
        return (b) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"path_", Path.class});
        }
        if (iOrdinal == 3) {
            return new UbiProd1Impression$SourcePaths();
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
        synchronized (UbiProd1Impression$SourcePaths.class) {
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

    public final void n(Path path) {
        path.getClass();
        h290 h290VarMutableCopy = this.path_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = com.google.protobuf.h.mutableCopy(h290VarMutableCopy);
            this.path_ = h290VarMutableCopy;
        }
        h290VarMutableCopy.add(path);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.path_.size();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
