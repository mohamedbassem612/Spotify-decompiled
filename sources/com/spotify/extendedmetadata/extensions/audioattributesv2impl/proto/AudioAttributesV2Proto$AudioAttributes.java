package com.spotify.extendedmetadata.extensions.audioattributesv2impl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class AudioAttributesV2Proto$AudioAttributes extends h implements v2j0 {
    public static final int BPM_FIELD_NUMBER = 1;
    private static final AudioAttributesV2Proto$AudioAttributes DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private double bpm_;
    private Key key_;

    public static final class Key extends h implements v2j0 {
        public static final int CAMELOT_KEY_FIELD_NUMBER = 3;
        private static final Key DEFAULT_INSTANCE;
        public static final int KEY_FIELD_NUMBER = 1;
        public static final int MODE_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER;
        private int bitField0_;
        private CamelotKey camelotKey_;
        private String key_ = "";
        private int mode_;

        public static final class CamelotKey extends h implements v2j0 {
            public static final int COLOR_FIELD_NUMBER = 2;
            private static final CamelotKey DEFAULT_INSTANCE;
            private static volatile qzr0 PARSER = null;
            public static final int VALUE_FIELD_NUMBER = 1;
            private String value_ = "";
            private String color_ = "";

            static {
                CamelotKey camelotKey = new CamelotKey();
                DEFAULT_INSTANCE = camelotKey;
                h.registerDefaultInstance(CamelotKey.class, camelotKey);
            }

            private CamelotKey() {
            }

            public static CamelotKey o() {
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
                    return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"value_", "color_"});
                }
                if (iOrdinal == 3) {
                    return new CamelotKey();
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
                synchronized (CamelotKey.class) {
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

            public final String getValue() {
                return this.value_;
            }

            public final String n() {
                return this.color_;
            }

            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            Key key = new Key();
            DEFAULT_INSTANCE = key;
            h.registerDefaultInstance(Key.class, key);
        }

        private Key() {
        }

        public static Key o() {
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
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003ဉ\u0000", new Object[]{"bitField0_", "key_", "mode_", "camelotKey_"});
            }
            if (iOrdinal == 3) {
                return new Key();
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
            synchronized (Key.class) {
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

        public final String getKey() {
            return this.key_;
        }

        public final CamelotKey n() {
            CamelotKey camelotKey = this.camelotKey_;
            return camelotKey == null ? CamelotKey.o() : camelotKey;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final d p() {
            d dVar;
            int i = this.mode_;
            if (i == 0) {
                dVar = d.MODE_UNKNOWN;
            } else if (i != 1) {
                dVar = i != 2 ? null : d.MODE_MAJOR;
            } else {
                dVar = d.MODE_MINOR;
            }
            return dVar == null ? d.UNRECOGNIZED : dVar;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        AudioAttributesV2Proto$AudioAttributes audioAttributesV2Proto$AudioAttributes = new AudioAttributesV2Proto$AudioAttributes();
        DEFAULT_INSTANCE = audioAttributesV2Proto$AudioAttributes;
        h.registerDefaultInstance(AudioAttributesV2Proto$AudioAttributes.class, audioAttributesV2Proto$AudioAttributes);
    }

    private AudioAttributesV2Proto$AudioAttributes() {
    }

    public static AudioAttributesV2Proto$AudioAttributes p(byte[] bArr) {
        return (AudioAttributesV2Proto$AudioAttributes) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002ဉ\u0000", new Object[]{"bitField0_", "bpm_", "key_"});
        }
        if (iOrdinal == 3) {
            return new AudioAttributesV2Proto$AudioAttributes();
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
        synchronized (AudioAttributesV2Proto$AudioAttributes.class) {
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

    public final double n() {
        return this.bpm_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Key o() {
        Key key = this.key_;
        return key == null ? Key.o() : key;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
