package com.spotify.rcs.resolver.grpc.v0;

import com.spotify.rcs.admin.grpc.v0.PropertyDefinition$Identifier;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class Configuration extends com.google.protobuf.h implements v2j0 {
    public static final int ASSIGNED_VALUES_FIELD_NUMBER = 3;
    public static final int CONFIGURATION_ASSIGNMENT_ID_FIELD_NUMBER = 1;
    private static final Configuration DEFAULT_INSTANCE;
    public static final int FETCH_TIME_MILLIS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int POLICY_SNAPSHOT_ID_FIELD_NUMBER = 4;
    private long fetchTimeMillis_;
    private long policySnapshotId_;
    private String configurationAssignmentId_ = "";
    private h290 assignedValues_ = com.google.protobuf.h.emptyProtobufList();

    public static final class AssignedValue extends com.google.protobuf.h implements v2j0 {
        public static final int BOOL_VALUE_FIELD_NUMBER = 3;
        private static final AssignedValue DEFAULT_INSTANCE;
        public static final int ENUM_VALUE_FIELD_NUMBER = 5;
        public static final int INT_VALUE_FIELD_NUMBER = 4;
        public static final int METADATA_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int PROPERTY_ID_FIELD_NUMBER = 1;
        private int bitField0_;
        private Metadata metadata_;
        private PropertyDefinition$Identifier propertyId_;
        private int structuredValueCase_ = 0;
        private Object structuredValue_;

        public static final class BoolValue extends com.google.protobuf.h implements v2j0 {
            private static final BoolValue DEFAULT_INSTANCE;
            private static volatile qzr0 PARSER = null;
            public static final int VALUE_FIELD_NUMBER = 1;
            private boolean value_;

            static {
                BoolValue boolValue = new BoolValue();
                DEFAULT_INSTANCE = boolValue;
                com.google.protobuf.h.registerDefaultInstance(BoolValue.class, boolValue);
            }

            private BoolValue() {
            }

            public static BoolValue o() {
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"value_"});
                }
                if (iOrdinal == 3) {
                    return new BoolValue();
                }
                if (iOrdinal == 4) {
                    return new a();
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
                synchronized (BoolValue.class) {
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

            public final boolean getValue() {
                return this.value_;
            }

            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class EnumValue extends com.google.protobuf.h implements v2j0 {
            private static final EnumValue DEFAULT_INSTANCE;
            private static volatile qzr0 PARSER = null;
            public static final int VALUE_FIELD_NUMBER = 1;
            private String value_ = "";

            static {
                EnumValue enumValue = new EnumValue();
                DEFAULT_INSTANCE = enumValue;
                com.google.protobuf.h.registerDefaultInstance(EnumValue.class, enumValue);
            }

            private EnumValue() {
            }

            public static EnumValue o() {
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"value_"});
                }
                if (iOrdinal == 3) {
                    return new EnumValue();
                }
                if (iOrdinal == 4) {
                    return new c();
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
                synchronized (EnumValue.class) {
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

            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class IntValue extends com.google.protobuf.h implements v2j0 {
            private static final IntValue DEFAULT_INSTANCE;
            private static volatile qzr0 PARSER = null;
            public static final int VALUE_FIELD_NUMBER = 1;
            private int value_;

            static {
                IntValue intValue = new IntValue();
                DEFAULT_INSTANCE = intValue;
                com.google.protobuf.h.registerDefaultInstance(IntValue.class, intValue);
            }

            private IntValue() {
            }

            public static IntValue o() {
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"value_"});
                }
                if (iOrdinal == 3) {
                    return new IntValue();
                }
                if (iOrdinal == 4) {
                    return new d();
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
                synchronized (IntValue.class) {
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

            public final int getValue() {
                return this.value_;
            }

            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class Metadata extends com.google.protobuf.h implements v2j0 {
            private static final Metadata DEFAULT_INSTANCE;
            public static final int EXTERNAL_REALM_FIELD_NUMBER = 2;
            public static final int EXTERNAL_REALM_ID_FIELD_NUMBER = 3;
            private static volatile qzr0 PARSER = null;
            public static final int POLICY_ID_FIELD_NUMBER = 1;
            private long externalRealmId_;
            private String externalRealm_ = "";
            private long policyId_;

            static {
                Metadata metadata = new Metadata();
                DEFAULT_INSTANCE = metadata;
                com.google.protobuf.h.registerDefaultInstance(Metadata.class, metadata);
            }

            private Metadata() {
            }

            public static Metadata o() {
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0003\u0002", new Object[]{"policyId_", "externalRealm_", "externalRealmId_"});
                }
                if (iOrdinal == 3) {
                    return new Metadata();
                }
                if (iOrdinal == 4) {
                    return new e();
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
                synchronized (Metadata.class) {
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

            public final long getPolicyId() {
                return this.policyId_;
            }

            public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public final long p() {
                return this.externalRealmId_;
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            AssignedValue assignedValue = new AssignedValue();
            DEFAULT_INSTANCE = assignedValue;
            com.google.protobuf.h.registerDefaultInstance(AssignedValue.class, assignedValue);
        }

        private AssignedValue() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"structuredValue_", "structuredValueCase_", "bitField0_", "propertyId_", "metadata_", BoolValue.class, IntValue.class, EnumValue.class});
            }
            if (iOrdinal == 3) {
                return new AssignedValue();
            }
            if (iOrdinal == 4) {
                return new b();
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
            synchronized (AssignedValue.class) {
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

        public final BoolValue o() {
            return this.structuredValueCase_ == 3 ? (BoolValue) this.structuredValue_ : BoolValue.o();
        }

        public final EnumValue p() {
            return this.structuredValueCase_ == 5 ? (EnumValue) this.structuredValue_ : EnumValue.o();
        }

        public final IntValue q() {
            return this.structuredValueCase_ == 4 ? (IntValue) this.structuredValue_ : IntValue.o();
        }

        public final Metadata r() {
            Metadata metadata = this.metadata_;
            return metadata == null ? Metadata.o() : metadata;
        }

        public final PropertyDefinition$Identifier s() {
            PropertyDefinition$Identifier propertyDefinition$Identifier = this.propertyId_;
            return propertyDefinition$Identifier == null ? PropertyDefinition$Identifier.o() : propertyDefinition$Identifier;
        }

        public final f t() {
            int i = this.structuredValueCase_;
            if (i == 0) {
                return f.STRUCTUREDVALUE_NOT_SET;
            }
            if (i == 3) {
                return f.BOOL_VALUE;
            }
            if (i == 4) {
                return f.INT_VALUE;
            }
            if (i != 5) {
                return null;
            }
            return f.ENUM_VALUE;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        Configuration configuration = new Configuration();
        DEFAULT_INSTANCE = configuration;
        com.google.protobuf.h.registerDefaultInstance(Configuration.class, configuration);
    }

    private Configuration() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Configuration q() {
        return DEFAULT_INSTANCE;
    }

    public static Configuration t(byte[] bArr) {
        return (Configuration) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u0002\u0003\u001b\u0004\u0002", new Object[]{"configurationAssignmentId_", "fetchTimeMillis_", "assignedValues_", AssignedValue.class, "policySnapshotId_"});
        }
        if (iOrdinal == 3) {
            return new Configuration();
        }
        if (iOrdinal == 4) {
            return new g();
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
        synchronized (Configuration.class) {
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
        return this.assignedValues_;
    }

    public final String p() {
        return this.configurationAssignmentId_;
    }

    public final long r() {
        return this.fetchTimeMillis_;
    }

    public final long s() {
        return this.policySnapshotId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
