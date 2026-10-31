package com.spotify.rcs.model;

import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.lwg;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.r8;
import p.s2j0;
import p.s8;
import p.uz00;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class GranularConfiguration extends h implements v2j0 {
    public static final int CONFIGURATION_ASSIGNMENT_ID_FIELD_NUMBER = 3;
    private static final GranularConfiguration DEFAULT_INSTANCE;
    public static final int ETAG_FIELD_NUMBER = 10;
    private static volatile qzr0 PARSER = null;
    public static final int POLICY_SNAPSHOT_ID_FIELD_NUMBER = 4;
    public static final int PROPERTIES_FIELD_NUMBER = 1;
    public static final int RCS_FETCH_TIME_FIELD_NUMBER = 2;
    private int bitField0_;
    private long policySnapshotId_;
    private long rcsFetchTime_;
    private h290 properties_ = h.emptyProtobufList();
    private String configurationAssignmentId_ = "";
    private String etag_ = "";

    /* JADX INFO: renamed from: com.spotify.rcs.model.GranularConfiguration$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[jf40.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public interface AssignedPropertyValueOrBuilder extends v2j0 {
        AssignedPropertyValue.BoolValue getBoolValue();

        String getClientId();

        phc getClientIdBytes();

        String getComponentId();

        phc getComponentIdBytes();

        /* synthetic */ s2j0 getDefaultInstanceForType();

        AssignedPropertyValue.EnumValue getEnumValue();

        long getGroupId();

        AssignedPropertyValue.IntValue getIntValue();

        String getName();

        phc getNameBytes();

        a getPlatform();

        int getPlatformValue();

        long getPolicyId();

        AssignedPropertyValue.StructuredValueCase getStructuredValueCase();

        boolean hasBoolValue();

        boolean hasEnumValue();

        boolean hasIntValue();

        /* synthetic */ boolean isInitialized();
    }

    static {
        GranularConfiguration granularConfiguration = new GranularConfiguration();
        DEFAULT_INSTANCE = granularConfiguration;
        h.registerDefaultInstance(GranularConfiguration.class, granularConfiguration);
    }

    private GranularConfiguration() {
    }

    public static Builder H() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GranularConfiguration I(byte[] bArr) {
        return (GranularConfiguration) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final phc A() {
        return phc.i(this.etag_);
    }

    public final long B() {
        return this.policySnapshotId_;
    }

    public final AssignedPropertyValue C(int i) {
        return (AssignedPropertyValue) this.properties_.get(i);
    }

    public final int D() {
        return this.properties_.size();
    }

    public final List E() {
        return this.properties_;
    }

    public final long F() {
        return this.rcsFetchTime_;
    }

    public final boolean G() {
        return (this.bitField0_ & 1) != 0;
    }

    public final void J(int i) {
        w();
        this.properties_.remove(i);
    }

    public final void K(String str) {
        str.getClass();
        this.configurationAssignmentId_ = str;
    }

    public final void L(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.configurationAssignmentId_ = phcVar.v();
    }

    public final void M(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.etag_ = str;
    }

    public final void N(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.etag_ = phcVar.v();
        this.bitField0_ |= 1;
    }

    public final void O(long j) {
        this.policySnapshotId_ = j;
    }

    public final void P(int i, AssignedPropertyValue assignedPropertyValue) {
        assignedPropertyValue.getClass();
        w();
        this.properties_.set(i, assignedPropertyValue);
    }

    public final void Q(long j) {
        this.rcsFetchTime_ = j;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\n\u0005\u0000\u0001\u0000\u0001\u001b\u0002\u0002\u0003Ȉ\u0004\u0002\nለ\u0000", new Object[]{"bitField0_", "properties_", AssignedPropertyValue.class, "rcsFetchTime_", "configurationAssignmentId_", "policySnapshotId_", "etag_"});
        }
        if (iOrdinal == 3) {
            return new GranularConfiguration();
        }
        if (iOrdinal == 4) {
            return new Builder(0);
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
        synchronized (GranularConfiguration.class) {
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

    public final void o(Iterable iterable) {
        w();
        s8.addAll(iterable, this.properties_);
    }

    public final void p(int i, AssignedPropertyValue assignedPropertyValue) {
        assignedPropertyValue.getClass();
        w();
        this.properties_.add(i, assignedPropertyValue);
    }

    public final void q(AssignedPropertyValue assignedPropertyValue) {
        assignedPropertyValue.getClass();
        w();
        this.properties_.add(assignedPropertyValue);
    }

    public final void r() {
        this.configurationAssignmentId_ = DEFAULT_INSTANCE.configurationAssignmentId_;
    }

    public final void s() {
        this.bitField0_ &= -2;
        this.etag_ = DEFAULT_INSTANCE.etag_;
    }

    public final void t() {
        this.policySnapshotId_ = 0L;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u() {
        this.properties_ = h.emptyProtobufList();
    }

    public final void v() {
        this.rcsFetchTime_ = 0L;
    }

    public final void w() {
        i9 i9Var = this.properties_;
        if (i9Var.a) {
            return;
        }
        this.properties_ = h.mutableCopy(i9Var);
    }

    public final String x() {
        return this.configurationAssignmentId_;
    }

    public final phc y() {
        return phc.i(this.configurationAssignmentId_);
    }

    public final String z() {
        return this.etag_;
    }

    public static final class AssignedPropertyValue extends h implements AssignedPropertyValueOrBuilder {
        public static final int BOOL_VALUE_FIELD_NUMBER = 1;
        public static final int CLIENT_ID_FIELD_NUMBER = 4;
        public static final int COMPONENT_ID_FIELD_NUMBER = 5;
        private static final AssignedPropertyValue DEFAULT_INSTANCE;
        public static final int ENUM_VALUE_FIELD_NUMBER = 3;
        public static final int GROUPID_FIELD_NUMBER = 8;
        public static final int INT_VALUE_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 6;
        private static volatile qzr0 PARSER = null;
        public static final int PLATFORM_FIELD_NUMBER = 7;
        public static final int POLICYID_FIELD_NUMBER = 9;
        private long groupId_;
        private int platform_;
        private long policyId_;
        private Object structuredValue_;
        private int structuredValueCase_ = 0;
        private String clientId_ = "";
        private String componentId_ = "";
        private String name_ = "";

        public interface BoolValueOrBuilder extends v2j0 {
            /* synthetic */ s2j0 getDefaultInstanceForType();

            boolean getValue();

            /* synthetic */ boolean isInitialized();
        }

        public interface EnumValueOrBuilder extends v2j0 {
            /* synthetic */ s2j0 getDefaultInstanceForType();

            String getValue();

            phc getValueBytes();

            /* synthetic */ boolean isInitialized();
        }

        public interface IntValueOrBuilder extends v2j0 {
            /* synthetic */ s2j0 getDefaultInstanceForType();

            int getValue();

            /* synthetic */ boolean isInitialized();
        }

        static {
            AssignedPropertyValue assignedPropertyValue = new AssignedPropertyValue();
            DEFAULT_INSTANCE = assignedPropertyValue;
            h.registerDefaultInstance(AssignedPropertyValue.class, assignedPropertyValue);
        }

        private AssignedPropertyValue() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBoolValue() {
            if (this.structuredValueCase_ == 1) {
                this.structuredValueCase_ = 0;
                this.structuredValue_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClientId() {
            this.clientId_ = getDefaultInstance().getClientId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearComponentId() {
            this.componentId_ = getDefaultInstance().getComponentId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnumValue() {
            if (this.structuredValueCase_ == 3) {
                this.structuredValueCase_ = 0;
                this.structuredValue_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGroupId() {
            this.groupId_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIntValue() {
            if (this.structuredValueCase_ == 2) {
                this.structuredValueCase_ = 0;
                this.structuredValue_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlatform() {
            this.platform_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPolicyId() {
            this.policyId_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStructuredValue() {
            this.structuredValueCase_ = 0;
            this.structuredValue_ = null;
        }

        public static AssignedPropertyValue getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBoolValue(BoolValue boolValue) {
            boolValue.getClass();
            if (this.structuredValueCase_ != 1 || this.structuredValue_ == BoolValue.getDefaultInstance()) {
                this.structuredValue_ = boolValue;
            } else {
                this.structuredValue_ = ((BoolValue.Builder) BoolValue.newBuilder((BoolValue) this.structuredValue_).mergeFrom(boolValue)).buildPartial();
            }
            this.structuredValueCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeEnumValue(EnumValue enumValue) {
            enumValue.getClass();
            if (this.structuredValueCase_ != 3 || this.structuredValue_ == EnumValue.getDefaultInstance()) {
                this.structuredValue_ = enumValue;
            } else {
                this.structuredValue_ = ((EnumValue.Builder) EnumValue.newBuilder((EnumValue) this.structuredValue_).mergeFrom(enumValue)).buildPartial();
            }
            this.structuredValueCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeIntValue(IntValue intValue) {
            intValue.getClass();
            if (this.structuredValueCase_ != 2 || this.structuredValue_ == IntValue.getDefaultInstance()) {
                this.structuredValue_ = intValue;
            } else {
                this.structuredValue_ = ((IntValue.Builder) IntValue.newBuilder((IntValue) this.structuredValue_).mergeFrom(intValue)).buildPartial();
            }
            this.structuredValueCase_ = 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static AssignedPropertyValue parseDelimitedFrom(InputStream inputStream) {
            return (AssignedPropertyValue) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AssignedPropertyValue parseFrom(ByteBuffer byteBuffer) {
            return (AssignedPropertyValue) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBoolValue(BoolValue boolValue) {
            boolValue.getClass();
            this.structuredValue_ = boolValue;
            this.structuredValueCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientId(String str) {
            str.getClass();
            this.clientId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientIdBytes(phc phcVar) {
            s8.checkByteStringIsUtf8(phcVar);
            this.clientId_ = phcVar.v();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setComponentId(String str) {
            str.getClass();
            this.componentId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setComponentIdBytes(phc phcVar) {
            s8.checkByteStringIsUtf8(phcVar);
            this.componentId_ = phcVar.v();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnumValue(EnumValue enumValue) {
            enumValue.getClass();
            this.structuredValue_ = enumValue;
            this.structuredValueCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGroupId(long j) {
            this.groupId_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIntValue(IntValue intValue) {
            intValue.getClass();
            this.structuredValue_ = intValue;
            this.structuredValueCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(phc phcVar) {
            s8.checkByteStringIsUtf8(phcVar);
            this.name_ = phcVar.v();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlatform(a aVar) {
            this.platform_ = aVar.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlatformValue(int i) {
            this.platform_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPolicyId(long j) {
            this.policyId_ = j;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007\f\b\u0002\t\u0002", new Object[]{"structuredValue_", "structuredValueCase_", BoolValue.class, IntValue.class, EnumValue.class, "clientId_", "componentId_", "name_", "platform_", "groupId_", "policyId_"});
            }
            if (iOrdinal == 3) {
                return new AssignedPropertyValue();
            }
            if (iOrdinal == 4) {
                return new Builder(0);
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
            synchronized (AssignedPropertyValue.class) {
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

        @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
        public BoolValue getBoolValue() {
            return this.structuredValueCase_ == 1 ? (BoolValue) this.structuredValue_ : BoolValue.getDefaultInstance();
        }

        @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
        public String getClientId() {
            return this.clientId_;
        }

        @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
        public phc getClientIdBytes() {
            return phc.i(this.clientId_);
        }

        @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
        public String getComponentId() {
            return this.componentId_;
        }

        @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
        public phc getComponentIdBytes() {
            return phc.i(this.componentId_);
        }

        @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
        public EnumValue getEnumValue() {
            return this.structuredValueCase_ == 3 ? (EnumValue) this.structuredValue_ : EnumValue.getDefaultInstance();
        }

        @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
        public long getGroupId() {
            return this.groupId_;
        }

        @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
        public IntValue getIntValue() {
            return this.structuredValueCase_ == 2 ? (IntValue) this.structuredValue_ : IntValue.getDefaultInstance();
        }

        @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
        public phc getNameBytes() {
            return phc.i(this.name_);
        }

        @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
        public a getPlatform() {
            a aVarA = a.a(this.platform_);
            return aVarA == null ? a.f : aVarA;
        }

        @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
        public int getPlatformValue() {
            return this.platform_;
        }

        @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
        public long getPolicyId() {
            return this.policyId_;
        }

        @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
        public StructuredValueCase getStructuredValueCase() {
            return StructuredValueCase.forNumber(this.structuredValueCase_);
        }

        @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
        public boolean hasBoolValue() {
            return this.structuredValueCase_ == 1;
        }

        @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
        public boolean hasEnumValue() {
            return this.structuredValueCase_ == 3;
        }

        @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
        public boolean hasIntValue() {
            return this.structuredValueCase_ == 2;
        }

        public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class BoolValue extends h implements BoolValueOrBuilder {
            private static final BoolValue DEFAULT_INSTANCE;
            private static volatile qzr0 PARSER = null;
            public static final int VALUE_FIELD_NUMBER = 1;
            private boolean value_;

            static {
                BoolValue boolValue = new BoolValue();
                DEFAULT_INSTANCE = boolValue;
                h.registerDefaultInstance(BoolValue.class, boolValue);
            }

            private BoolValue() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearValue() {
                this.value_ = false;
            }

            public static BoolValue getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static BoolValue parseDelimitedFrom(InputStream inputStream) {
                return (BoolValue) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static BoolValue parseFrom(ByteBuffer byteBuffer) {
                return (BoolValue) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static qzr0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setValue(boolean z) {
                this.value_ = z;
            }

            public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
                bf40 bf40Var;
                int iOrdinal = jf40Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"value_"});
                }
                if (iOrdinal == 3) {
                    return new BoolValue();
                }
                if (iOrdinal == 4) {
                    return new Builder(0);
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

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue.BoolValueOrBuilder
            public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return getDefaultInstanceForType();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue.BoolValueOrBuilder
            public boolean getValue() {
                return this.value_;
            }

            public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }

            public static final class Builder extends g implements BoolValueOrBuilder {
                private Builder() {
                    super(BoolValue.DEFAULT_INSTANCE);
                }

                public /* bridge */ /* synthetic */ s2j0 build() {
                    return build();
                }

                public /* bridge */ /* synthetic */ s2j0 buildPartial() {
                    return super.buildPartial();
                }

                public /* bridge */ /* synthetic */ r2j0 clear() {
                    return clear();
                }

                public Builder clearValue() {
                    copyOnWrite();
                    ((BoolValue) ((g) this).instance).clearValue();
                    return this;
                }

                public /* bridge */ /* synthetic */ Object clone() {
                    return super.clone();
                }

                @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue.BoolValueOrBuilder
                public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                    return super.getDefaultInstanceForType();
                }

                @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue.BoolValueOrBuilder
                public boolean getValue() {
                    return ((BoolValue) ((g) this).instance).getValue();
                }

                public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                    return super.internalMergeFrom((h) s8Var);
                }

                /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
                public /* bridge */ /* synthetic */ r8 m39mergeFrom(lwg lwgVar, uz00 uz00Var) {
                    return super.mergeFrom(lwgVar, uz00Var);
                }

                public Builder setValue(boolean z) {
                    copyOnWrite();
                    ((BoolValue) ((g) this).instance).setValue(z);
                    return this;
                }

                /* JADX INFO: renamed from: clone, reason: collision with other method in class */
                public /* bridge */ /* synthetic */ r8 m38clone() {
                    return super.clone();
                }

                /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
                public /* bridge */ /* synthetic */ r8 m40mergeFrom(byte[] bArr, int i, int i2) {
                    return super.mergeFrom(bArr, i, i2);
                }

                /* JADX INFO: renamed from: clone, reason: collision with other method in class */
                public /* bridge */ /* synthetic */ r2j0 m37clone() {
                    return super.clone();
                }

                /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
                public /* bridge */ /* synthetic */ r8 m41mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                    return super.mergeFrom(bArr, i, i2, uz00Var);
                }

                public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                    return super/*p.r8*/.mergeFrom(inputStream);
                }

                public /* synthetic */ Builder(int i) {
                    this();
                }

                public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                    return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
                }

                public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                    return super/*p.r8*/.mergeFrom(phcVar);
                }

                public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                    return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
                }

                public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                    return super/*p.r8*/.mergeFrom(lwgVar);
                }

                public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                    return super.mergeFrom(lwgVar, uz00Var);
                }

                public /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                    return super/*p.r8*/.mergeFrom(s2j0Var);
                }

                public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                    return super/*p.r8*/.mergeFrom(bArr);
                }

                public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                    return super.mergeFrom(bArr, i, i2);
                }

                public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                    return super.mergeFrom(bArr, i, i2, uz00Var);
                }

                public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                    return super/*p.r8*/.mergeFrom(bArr, uz00Var);
                }
            }

            public static Builder newBuilder(BoolValue boolValue) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(boolValue);
            }

            public static BoolValue parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
                return (BoolValue) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
            }

            public static BoolValue parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
                return (BoolValue) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
            }

            public static BoolValue parseFrom(phc phcVar) {
                return (BoolValue) h.parseFrom(DEFAULT_INSTANCE, phcVar);
            }

            public static BoolValue parseFrom(phc phcVar, uz00 uz00Var) {
                return (BoolValue) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
            }

            public static BoolValue parseFrom(byte[] bArr) {
                return (BoolValue) h.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static BoolValue parseFrom(byte[] bArr, uz00 uz00Var) {
                return (BoolValue) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
            }

            public static BoolValue parseFrom(InputStream inputStream) {
                return (BoolValue) h.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static BoolValue parseFrom(InputStream inputStream, uz00 uz00Var) {
                return (BoolValue) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
            }

            public static BoolValue parseFrom(lwg lwgVar) {
                return (BoolValue) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
            }

            public static BoolValue parseFrom(lwg lwgVar, uz00 uz00Var) {
                return (BoolValue) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
            }
        }

        public static final class EnumValue extends h implements EnumValueOrBuilder {
            private static final EnumValue DEFAULT_INSTANCE;
            private static volatile qzr0 PARSER = null;
            public static final int VALUE_FIELD_NUMBER = 1;
            private String value_ = "";

            static {
                EnumValue enumValue = new EnumValue();
                DEFAULT_INSTANCE = enumValue;
                h.registerDefaultInstance(EnumValue.class, enumValue);
            }

            private EnumValue() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearValue() {
                this.value_ = getDefaultInstance().getValue();
            }

            public static EnumValue getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static EnumValue parseDelimitedFrom(InputStream inputStream) {
                return (EnumValue) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static EnumValue parseFrom(ByteBuffer byteBuffer) {
                return (EnumValue) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static qzr0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setValue(String str) {
                str.getClass();
                this.value_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setValueBytes(phc phcVar) {
                s8.checkByteStringIsUtf8(phcVar);
                this.value_ = phcVar.v();
            }

            public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
                bf40 bf40Var;
                int iOrdinal = jf40Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"value_"});
                }
                if (iOrdinal == 3) {
                    return new EnumValue();
                }
                if (iOrdinal == 4) {
                    return new Builder(0);
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

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue.EnumValueOrBuilder
            public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return getDefaultInstanceForType();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue.EnumValueOrBuilder
            public String getValue() {
                return this.value_;
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue.EnumValueOrBuilder
            public phc getValueBytes() {
                return phc.i(this.value_);
            }

            public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }

            public static final class Builder extends g implements EnumValueOrBuilder {
                private Builder() {
                    super(EnumValue.DEFAULT_INSTANCE);
                }

                public /* bridge */ /* synthetic */ s2j0 build() {
                    return build();
                }

                public /* bridge */ /* synthetic */ s2j0 buildPartial() {
                    return super.buildPartial();
                }

                public /* bridge */ /* synthetic */ r2j0 clear() {
                    return clear();
                }

                public Builder clearValue() {
                    copyOnWrite();
                    ((EnumValue) ((g) this).instance).clearValue();
                    return this;
                }

                public /* bridge */ /* synthetic */ Object clone() {
                    return super.clone();
                }

                @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue.EnumValueOrBuilder
                public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                    return super.getDefaultInstanceForType();
                }

                @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue.EnumValueOrBuilder
                public String getValue() {
                    return ((EnumValue) ((g) this).instance).getValue();
                }

                @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue.EnumValueOrBuilder
                public phc getValueBytes() {
                    return ((EnumValue) ((g) this).instance).getValueBytes();
                }

                public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                    return super.internalMergeFrom((h) s8Var);
                }

                /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
                public /* bridge */ /* synthetic */ r8 m49mergeFrom(lwg lwgVar, uz00 uz00Var) {
                    return super.mergeFrom(lwgVar, uz00Var);
                }

                public Builder setValue(String str) {
                    copyOnWrite();
                    ((EnumValue) ((g) this).instance).setValue(str);
                    return this;
                }

                public Builder setValueBytes(phc phcVar) {
                    copyOnWrite();
                    ((EnumValue) ((g) this).instance).setValueBytes(phcVar);
                    return this;
                }

                /* JADX INFO: renamed from: clone, reason: collision with other method in class */
                public /* bridge */ /* synthetic */ r8 m48clone() {
                    return super.clone();
                }

                /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
                public /* bridge */ /* synthetic */ r8 m50mergeFrom(byte[] bArr, int i, int i2) {
                    return super.mergeFrom(bArr, i, i2);
                }

                /* JADX INFO: renamed from: clone, reason: collision with other method in class */
                public /* bridge */ /* synthetic */ r2j0 m47clone() {
                    return super.clone();
                }

                /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
                public /* bridge */ /* synthetic */ r8 m51mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                    return super.mergeFrom(bArr, i, i2, uz00Var);
                }

                public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                    return super/*p.r8*/.mergeFrom(inputStream);
                }

                public /* synthetic */ Builder(int i) {
                    this();
                }

                public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                    return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
                }

                public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                    return super/*p.r8*/.mergeFrom(phcVar);
                }

                public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                    return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
                }

                public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                    return super/*p.r8*/.mergeFrom(lwgVar);
                }

                public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                    return super.mergeFrom(lwgVar, uz00Var);
                }

                public /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                    return super/*p.r8*/.mergeFrom(s2j0Var);
                }

                public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                    return super/*p.r8*/.mergeFrom(bArr);
                }

                public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                    return super.mergeFrom(bArr, i, i2);
                }

                public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                    return super.mergeFrom(bArr, i, i2, uz00Var);
                }

                public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                    return super/*p.r8*/.mergeFrom(bArr, uz00Var);
                }
            }

            public static Builder newBuilder(EnumValue enumValue) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(enumValue);
            }

            public static EnumValue parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
                return (EnumValue) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
            }

            public static EnumValue parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
                return (EnumValue) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
            }

            public static EnumValue parseFrom(phc phcVar) {
                return (EnumValue) h.parseFrom(DEFAULT_INSTANCE, phcVar);
            }

            public static EnumValue parseFrom(phc phcVar, uz00 uz00Var) {
                return (EnumValue) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
            }

            public static EnumValue parseFrom(byte[] bArr) {
                return (EnumValue) h.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static EnumValue parseFrom(byte[] bArr, uz00 uz00Var) {
                return (EnumValue) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
            }

            public static EnumValue parseFrom(InputStream inputStream) {
                return (EnumValue) h.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static EnumValue parseFrom(InputStream inputStream, uz00 uz00Var) {
                return (EnumValue) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
            }

            public static EnumValue parseFrom(lwg lwgVar) {
                return (EnumValue) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
            }

            public static EnumValue parseFrom(lwg lwgVar, uz00 uz00Var) {
                return (EnumValue) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
            }
        }

        public static final class IntValue extends h implements IntValueOrBuilder {
            private static final IntValue DEFAULT_INSTANCE;
            private static volatile qzr0 PARSER = null;
            public static final int VALUE_FIELD_NUMBER = 1;
            private int value_;

            static {
                IntValue intValue = new IntValue();
                DEFAULT_INSTANCE = intValue;
                h.registerDefaultInstance(IntValue.class, intValue);
            }

            private IntValue() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearValue() {
                this.value_ = 0;
            }

            public static IntValue getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static IntValue parseDelimitedFrom(InputStream inputStream) {
                return (IntValue) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static IntValue parseFrom(ByteBuffer byteBuffer) {
                return (IntValue) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static qzr0 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setValue(int i) {
                this.value_ = i;
            }

            public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
                bf40 bf40Var;
                int iOrdinal = jf40Var.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"value_"});
                }
                if (iOrdinal == 3) {
                    return new IntValue();
                }
                if (iOrdinal == 4) {
                    return new Builder(0);
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

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue.IntValueOrBuilder
            public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return getDefaultInstanceForType();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue.IntValueOrBuilder
            public int getValue() {
                return this.value_;
            }

            public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
                return newBuilderForType();
            }

            public /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }

            public static final class Builder extends g implements IntValueOrBuilder {
                private Builder() {
                    super(IntValue.DEFAULT_INSTANCE);
                }

                public /* bridge */ /* synthetic */ s2j0 build() {
                    return build();
                }

                public /* bridge */ /* synthetic */ s2j0 buildPartial() {
                    return super.buildPartial();
                }

                public /* bridge */ /* synthetic */ r2j0 clear() {
                    return clear();
                }

                public Builder clearValue() {
                    copyOnWrite();
                    ((IntValue) ((g) this).instance).clearValue();
                    return this;
                }

                public /* bridge */ /* synthetic */ Object clone() {
                    return super.clone();
                }

                @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue.IntValueOrBuilder
                public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                    return super.getDefaultInstanceForType();
                }

                @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValue.IntValueOrBuilder
                public int getValue() {
                    return ((IntValue) ((g) this).instance).getValue();
                }

                public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                    return super.internalMergeFrom((h) s8Var);
                }

                /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
                public /* bridge */ /* synthetic */ r8 m54mergeFrom(lwg lwgVar, uz00 uz00Var) {
                    return super.mergeFrom(lwgVar, uz00Var);
                }

                public Builder setValue(int i) {
                    copyOnWrite();
                    ((IntValue) ((g) this).instance).setValue(i);
                    return this;
                }

                /* JADX INFO: renamed from: clone, reason: collision with other method in class */
                public /* bridge */ /* synthetic */ r8 m53clone() {
                    return super.clone();
                }

                /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
                public /* bridge */ /* synthetic */ r8 m55mergeFrom(byte[] bArr, int i, int i2) {
                    return super.mergeFrom(bArr, i, i2);
                }

                /* JADX INFO: renamed from: clone, reason: collision with other method in class */
                public /* bridge */ /* synthetic */ r2j0 m52clone() {
                    return super.clone();
                }

                /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
                public /* bridge */ /* synthetic */ r8 m56mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                    return super.mergeFrom(bArr, i, i2, uz00Var);
                }

                public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                    return super/*p.r8*/.mergeFrom(inputStream);
                }

                public /* synthetic */ Builder(int i) {
                    this();
                }

                public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                    return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
                }

                public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                    return super/*p.r8*/.mergeFrom(phcVar);
                }

                public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                    return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
                }

                public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                    return super/*p.r8*/.mergeFrom(lwgVar);
                }

                public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                    return super.mergeFrom(lwgVar, uz00Var);
                }

                public /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                    return super/*p.r8*/.mergeFrom(s2j0Var);
                }

                public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                    return super/*p.r8*/.mergeFrom(bArr);
                }

                public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                    return super.mergeFrom(bArr, i, i2);
                }

                public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                    return super.mergeFrom(bArr, i, i2, uz00Var);
                }

                public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                    return super/*p.r8*/.mergeFrom(bArr, uz00Var);
                }
            }

            public static Builder newBuilder(IntValue intValue) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(intValue);
            }

            public static IntValue parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
                return (IntValue) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
            }

            public static IntValue parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
                return (IntValue) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
            }

            public static IntValue parseFrom(phc phcVar) {
                return (IntValue) h.parseFrom(DEFAULT_INSTANCE, phcVar);
            }

            public static IntValue parseFrom(phc phcVar, uz00 uz00Var) {
                return (IntValue) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
            }

            public static IntValue parseFrom(byte[] bArr) {
                return (IntValue) h.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static IntValue parseFrom(byte[] bArr, uz00 uz00Var) {
                return (IntValue) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
            }

            public static IntValue parseFrom(InputStream inputStream) {
                return (IntValue) h.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static IntValue parseFrom(InputStream inputStream, uz00 uz00Var) {
                return (IntValue) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
            }

            public static IntValue parseFrom(lwg lwgVar) {
                return (IntValue) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
            }

            public static IntValue parseFrom(lwg lwgVar, uz00 uz00Var) {
                return (IntValue) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
            }
        }

        public static final class Builder extends g implements AssignedPropertyValueOrBuilder {
            private Builder() {
                super(AssignedPropertyValue.DEFAULT_INSTANCE);
            }

            public /* bridge */ /* synthetic */ s2j0 build() {
                return build();
            }

            public /* bridge */ /* synthetic */ s2j0 buildPartial() {
                return super.buildPartial();
            }

            public /* bridge */ /* synthetic */ r2j0 clear() {
                return clear();
            }

            public Builder clearBoolValue() {
                copyOnWrite();
                ((AssignedPropertyValue) ((g) this).instance).clearBoolValue();
                return this;
            }

            public Builder clearClientId() {
                copyOnWrite();
                ((AssignedPropertyValue) ((g) this).instance).clearClientId();
                return this;
            }

            public Builder clearComponentId() {
                copyOnWrite();
                ((AssignedPropertyValue) ((g) this).instance).clearComponentId();
                return this;
            }

            public Builder clearEnumValue() {
                copyOnWrite();
                ((AssignedPropertyValue) ((g) this).instance).clearEnumValue();
                return this;
            }

            public Builder clearGroupId() {
                copyOnWrite();
                ((AssignedPropertyValue) ((g) this).instance).clearGroupId();
                return this;
            }

            public Builder clearIntValue() {
                copyOnWrite();
                ((AssignedPropertyValue) ((g) this).instance).clearIntValue();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((AssignedPropertyValue) ((g) this).instance).clearName();
                return this;
            }

            public Builder clearPlatform() {
                copyOnWrite();
                ((AssignedPropertyValue) ((g) this).instance).clearPlatform();
                return this;
            }

            public Builder clearPolicyId() {
                copyOnWrite();
                ((AssignedPropertyValue) ((g) this).instance).clearPolicyId();
                return this;
            }

            public Builder clearStructuredValue() {
                copyOnWrite();
                ((AssignedPropertyValue) ((g) this).instance).clearStructuredValue();
                return this;
            }

            public /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
            public BoolValue getBoolValue() {
                return ((AssignedPropertyValue) ((g) this).instance).getBoolValue();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
            public String getClientId() {
                return ((AssignedPropertyValue) ((g) this).instance).getClientId();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
            public phc getClientIdBytes() {
                return ((AssignedPropertyValue) ((g) this).instance).getClientIdBytes();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
            public String getComponentId() {
                return ((AssignedPropertyValue) ((g) this).instance).getComponentId();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
            public phc getComponentIdBytes() {
                return ((AssignedPropertyValue) ((g) this).instance).getComponentIdBytes();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
            public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
            public EnumValue getEnumValue() {
                return ((AssignedPropertyValue) ((g) this).instance).getEnumValue();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
            public long getGroupId() {
                return ((AssignedPropertyValue) ((g) this).instance).getGroupId();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
            public IntValue getIntValue() {
                return ((AssignedPropertyValue) ((g) this).instance).getIntValue();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
            public String getName() {
                return ((AssignedPropertyValue) ((g) this).instance).getName();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
            public phc getNameBytes() {
                return ((AssignedPropertyValue) ((g) this).instance).getNameBytes();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
            public a getPlatform() {
                return ((AssignedPropertyValue) ((g) this).instance).getPlatform();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
            public int getPlatformValue() {
                return ((AssignedPropertyValue) ((g) this).instance).getPlatformValue();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
            public long getPolicyId() {
                return ((AssignedPropertyValue) ((g) this).instance).getPolicyId();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
            public StructuredValueCase getStructuredValueCase() {
                return ((AssignedPropertyValue) ((g) this).instance).getStructuredValueCase();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
            public boolean hasBoolValue() {
                return ((AssignedPropertyValue) ((g) this).instance).hasBoolValue();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
            public boolean hasEnumValue() {
                return ((AssignedPropertyValue) ((g) this).instance).hasEnumValue();
            }

            @Override // com.spotify.rcs.model.GranularConfiguration.AssignedPropertyValueOrBuilder
            public boolean hasIntValue() {
                return ((AssignedPropertyValue) ((g) this).instance).hasIntValue();
            }

            public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            public Builder mergeBoolValue(BoolValue boolValue) {
                copyOnWrite();
                ((AssignedPropertyValue) ((g) this).instance).mergeBoolValue(boolValue);
                return this;
            }

            public Builder mergeEnumValue(EnumValue enumValue) {
                copyOnWrite();
                ((AssignedPropertyValue) ((g) this).instance).mergeEnumValue(enumValue);
                return this;
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m44mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public Builder mergeIntValue(IntValue intValue) {
                copyOnWrite();
                ((AssignedPropertyValue) ((g) this).instance).mergeIntValue(intValue);
                return this;
            }

            public Builder setBoolValue(BoolValue.Builder builder) {
                copyOnWrite();
                ((AssignedPropertyValue) ((g) this).instance).setBoolValue((BoolValue) builder.build());
                return this;
            }

            public Builder setClientId(String str) {
                copyOnWrite();
                ((AssignedPropertyValue) ((g) this).instance).setClientId(str);
                return this;
            }

            public Builder setClientIdBytes(phc phcVar) {
                copyOnWrite();
                ((AssignedPropertyValue) ((g) this).instance).setClientIdBytes(phcVar);
                return this;
            }

            public Builder setComponentId(String str) {
                copyOnWrite();
                ((AssignedPropertyValue) ((g) this).instance).setComponentId(str);
                return this;
            }

            public Builder setComponentIdBytes(phc phcVar) {
                copyOnWrite();
                ((AssignedPropertyValue) ((g) this).instance).setComponentIdBytes(phcVar);
                return this;
            }

            public Builder setEnumValue(EnumValue.Builder builder) {
                copyOnWrite();
                ((AssignedPropertyValue) ((g) this).instance).setEnumValue((EnumValue) builder.build());
                return this;
            }

            public Builder setGroupId(long j) {
                copyOnWrite();
                ((AssignedPropertyValue) ((g) this).instance).setGroupId(j);
                return this;
            }

            public Builder setIntValue(IntValue.Builder builder) {
                copyOnWrite();
                ((AssignedPropertyValue) ((g) this).instance).setIntValue((IntValue) builder.build());
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((AssignedPropertyValue) ((g) this).instance).setName(str);
                return this;
            }

            public Builder setNameBytes(phc phcVar) {
                copyOnWrite();
                ((AssignedPropertyValue) ((g) this).instance).setNameBytes(phcVar);
                return this;
            }

            public Builder setPlatform(a aVar) {
                copyOnWrite();
                ((AssignedPropertyValue) ((g) this).instance).setPlatform(aVar);
                return this;
            }

            public Builder setPlatformValue(int i) {
                copyOnWrite();
                ((AssignedPropertyValue) ((g) this).instance).setPlatformValue(i);
                return this;
            }

            public Builder setPolicyId(long j) {
                copyOnWrite();
                ((AssignedPropertyValue) ((g) this).instance).setPolicyId(j);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m43clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m45mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r2j0 m42clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m46mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
                return super/*p.r8*/.mergeFrom(inputStream);
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
                return super/*p.r8*/.mergeFrom(phcVar);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
                return super/*p.r8*/.mergeFrom(lwgVar);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
                return super/*p.r8*/.mergeFrom(s2j0Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
                return super/*p.r8*/.mergeFrom(bArr);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
                return super.mergeFrom(bArr, i, i2, uz00Var);
            }

            public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
                return super/*p.r8*/.mergeFrom(bArr, uz00Var);
            }

            public Builder setBoolValue(BoolValue boolValue) {
                copyOnWrite();
                ((AssignedPropertyValue) ((g) this).instance).setBoolValue(boolValue);
                return this;
            }

            public Builder setEnumValue(EnumValue enumValue) {
                copyOnWrite();
                ((AssignedPropertyValue) ((g) this).instance).setEnumValue(enumValue);
                return this;
            }

            public Builder setIntValue(IntValue intValue) {
                copyOnWrite();
                ((AssignedPropertyValue) ((g) this).instance).setIntValue(intValue);
                return this;
            }
        }

        public enum StructuredValueCase {
            BOOL_VALUE(1),
            INT_VALUE(2),
            ENUM_VALUE(3),
            STRUCTUREDVALUE_NOT_SET(0);

            private final int value;

            StructuredValueCase(int i) {
                this.value = i;
            }

            public static StructuredValueCase forNumber(int i) {
                if (i == 0) {
                    return STRUCTUREDVALUE_NOT_SET;
                }
                if (i == 1) {
                    return BOOL_VALUE;
                }
                if (i == 2) {
                    return INT_VALUE;
                }
                if (i != 3) {
                    return null;
                }
                return ENUM_VALUE;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static StructuredValueCase valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Builder newBuilder(AssignedPropertyValue assignedPropertyValue) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(assignedPropertyValue);
        }

        public static AssignedPropertyValue parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (AssignedPropertyValue) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static AssignedPropertyValue parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (AssignedPropertyValue) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static AssignedPropertyValue parseFrom(phc phcVar) {
            return (AssignedPropertyValue) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static AssignedPropertyValue parseFrom(phc phcVar, uz00 uz00Var) {
            return (AssignedPropertyValue) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static AssignedPropertyValue parseFrom(byte[] bArr) {
            return (AssignedPropertyValue) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AssignedPropertyValue parseFrom(byte[] bArr, uz00 uz00Var) {
            return (AssignedPropertyValue) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static AssignedPropertyValue parseFrom(InputStream inputStream) {
            return (AssignedPropertyValue) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AssignedPropertyValue parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (AssignedPropertyValue) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static AssignedPropertyValue parseFrom(lwg lwgVar) {
            return (AssignedPropertyValue) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static AssignedPropertyValue parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (AssignedPropertyValue) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class Builder extends g implements v2j0 {
        private Builder() {
            super(GranularConfiguration.DEFAULT_INSTANCE);
        }

        public Builder addAllProperties(Iterable<? extends AssignedPropertyValue> iterable) {
            copyOnWrite();
            GranularConfiguration granularConfiguration = (GranularConfiguration) ((g) this).instance;
            int i = GranularConfiguration.PROPERTIES_FIELD_NUMBER;
            granularConfiguration.o(iterable);
            return this;
        }

        public Builder addProperties(AssignedPropertyValue.Builder builder) {
            copyOnWrite();
            GranularConfiguration granularConfiguration = (GranularConfiguration) ((g) this).instance;
            AssignedPropertyValue assignedPropertyValue = (AssignedPropertyValue) builder.build();
            int i = GranularConfiguration.PROPERTIES_FIELD_NUMBER;
            granularConfiguration.q(assignedPropertyValue);
            return this;
        }

        public /* bridge */ /* synthetic */ s2j0 build() {
            return build();
        }

        public /* bridge */ /* synthetic */ s2j0 buildPartial() {
            return super.buildPartial();
        }

        public /* bridge */ /* synthetic */ r2j0 clear() {
            return clear();
        }

        public Builder clearConfigurationAssignmentId() {
            copyOnWrite();
            GranularConfiguration granularConfiguration = (GranularConfiguration) ((g) this).instance;
            int i = GranularConfiguration.PROPERTIES_FIELD_NUMBER;
            granularConfiguration.r();
            return this;
        }

        public Builder clearEtag() {
            copyOnWrite();
            GranularConfiguration granularConfiguration = (GranularConfiguration) ((g) this).instance;
            int i = GranularConfiguration.PROPERTIES_FIELD_NUMBER;
            granularConfiguration.s();
            return this;
        }

        public Builder clearPolicySnapshotId() {
            copyOnWrite();
            GranularConfiguration granularConfiguration = (GranularConfiguration) ((g) this).instance;
            int i = GranularConfiguration.PROPERTIES_FIELD_NUMBER;
            granularConfiguration.t();
            return this;
        }

        public Builder clearProperties() {
            copyOnWrite();
            GranularConfiguration granularConfiguration = (GranularConfiguration) ((g) this).instance;
            int i = GranularConfiguration.PROPERTIES_FIELD_NUMBER;
            granularConfiguration.u();
            return this;
        }

        public Builder clearRcsFetchTime() {
            copyOnWrite();
            GranularConfiguration granularConfiguration = (GranularConfiguration) ((g) this).instance;
            int i = GranularConfiguration.PROPERTIES_FIELD_NUMBER;
            granularConfiguration.v();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        public String getConfigurationAssignmentId() {
            return ((GranularConfiguration) ((g) this).instance).x();
        }

        public phc getConfigurationAssignmentIdBytes() {
            return ((GranularConfiguration) ((g) this).instance).y();
        }

        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        public String getEtag() {
            return ((GranularConfiguration) ((g) this).instance).z();
        }

        public phc getEtagBytes() {
            return ((GranularConfiguration) ((g) this).instance).A();
        }

        public long getPolicySnapshotId() {
            return ((GranularConfiguration) ((g) this).instance).B();
        }

        public AssignedPropertyValue getProperties(int i) {
            return ((GranularConfiguration) ((g) this).instance).C(i);
        }

        public int getPropertiesCount() {
            return ((GranularConfiguration) ((g) this).instance).D();
        }

        public List<AssignedPropertyValue> getPropertiesList() {
            return Collections.unmodifiableList(((GranularConfiguration) ((g) this).instance).E());
        }

        public long getRcsFetchTime() {
            return ((GranularConfiguration) ((g) this).instance).F();
        }

        public boolean hasEtag() {
            return ((GranularConfiguration) ((g) this).instance).G();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m59mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder removeProperties(int i) {
            copyOnWrite();
            GranularConfiguration granularConfiguration = (GranularConfiguration) ((g) this).instance;
            int i2 = GranularConfiguration.PROPERTIES_FIELD_NUMBER;
            granularConfiguration.J(i);
            return this;
        }

        public Builder setConfigurationAssignmentId(String str) {
            copyOnWrite();
            GranularConfiguration granularConfiguration = (GranularConfiguration) ((g) this).instance;
            int i = GranularConfiguration.PROPERTIES_FIELD_NUMBER;
            granularConfiguration.K(str);
            return this;
        }

        public Builder setConfigurationAssignmentIdBytes(phc phcVar) {
            copyOnWrite();
            GranularConfiguration granularConfiguration = (GranularConfiguration) ((g) this).instance;
            int i = GranularConfiguration.PROPERTIES_FIELD_NUMBER;
            granularConfiguration.L(phcVar);
            return this;
        }

        public Builder setEtag(String str) {
            copyOnWrite();
            GranularConfiguration granularConfiguration = (GranularConfiguration) ((g) this).instance;
            int i = GranularConfiguration.PROPERTIES_FIELD_NUMBER;
            granularConfiguration.M(str);
            return this;
        }

        public Builder setEtagBytes(phc phcVar) {
            copyOnWrite();
            GranularConfiguration granularConfiguration = (GranularConfiguration) ((g) this).instance;
            int i = GranularConfiguration.PROPERTIES_FIELD_NUMBER;
            granularConfiguration.N(phcVar);
            return this;
        }

        public Builder setPolicySnapshotId(long j) {
            copyOnWrite();
            GranularConfiguration granularConfiguration = (GranularConfiguration) ((g) this).instance;
            int i = GranularConfiguration.PROPERTIES_FIELD_NUMBER;
            granularConfiguration.O(j);
            return this;
        }

        public Builder setProperties(int i, AssignedPropertyValue.Builder builder) {
            copyOnWrite();
            GranularConfiguration granularConfiguration = (GranularConfiguration) ((g) this).instance;
            AssignedPropertyValue assignedPropertyValue = (AssignedPropertyValue) builder.build();
            int i2 = GranularConfiguration.PROPERTIES_FIELD_NUMBER;
            granularConfiguration.P(i, assignedPropertyValue);
            return this;
        }

        public Builder setRcsFetchTime(long j) {
            copyOnWrite();
            GranularConfiguration granularConfiguration = (GranularConfiguration) ((g) this).instance;
            int i = GranularConfiguration.PROPERTIES_FIELD_NUMBER;
            granularConfiguration.Q(j);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m58clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m60mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m57clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m61mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
            return super.mergeFrom(bArr, i, i2, uz00Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
            return super/*p.r8*/.mergeFrom(inputStream);
        }

        public /* synthetic */ Builder(int i) {
            this();
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
            return super/*p.r8*/.mergeFrom(phcVar);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
            return super/*p.r8*/.mergeFrom(lwgVar);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
            return super/*p.r8*/.mergeFrom(s2j0Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
            return super/*p.r8*/.mergeFrom(bArr);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
            return super.mergeFrom(bArr, i, i2, uz00Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(bArr, uz00Var);
        }

        public Builder addProperties(int i, AssignedPropertyValue assignedPropertyValue) {
            copyOnWrite();
            GranularConfiguration granularConfiguration = (GranularConfiguration) ((g) this).instance;
            int i2 = GranularConfiguration.PROPERTIES_FIELD_NUMBER;
            granularConfiguration.p(i, assignedPropertyValue);
            return this;
        }

        public Builder setProperties(int i, AssignedPropertyValue assignedPropertyValue) {
            copyOnWrite();
            GranularConfiguration granularConfiguration = (GranularConfiguration) ((g) this).instance;
            int i2 = GranularConfiguration.PROPERTIES_FIELD_NUMBER;
            granularConfiguration.P(i, assignedPropertyValue);
            return this;
        }

        public Builder addProperties(AssignedPropertyValue assignedPropertyValue) {
            copyOnWrite();
            GranularConfiguration granularConfiguration = (GranularConfiguration) ((g) this).instance;
            int i = GranularConfiguration.PROPERTIES_FIELD_NUMBER;
            granularConfiguration.q(assignedPropertyValue);
            return this;
        }

        public Builder addProperties(int i, AssignedPropertyValue.Builder builder) {
            copyOnWrite();
            GranularConfiguration granularConfiguration = (GranularConfiguration) ((g) this).instance;
            AssignedPropertyValue assignedPropertyValue = (AssignedPropertyValue) builder.build();
            int i2 = GranularConfiguration.PROPERTIES_FIELD_NUMBER;
            granularConfiguration.p(i, assignedPropertyValue);
            return this;
        }
    }
}
