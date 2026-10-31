package org.chromium.net.httpflags;

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
import p.k220;
import p.lwg;
import p.phc;
import p.qzr0;
import p.s2j0;
import p.s8;
import p.uz00;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlagValue extends h implements FlagValueOrBuilder {
    public static final int CONSTRAINED_VALUES_FIELD_NUMBER = 8;
    private static final FlagValue DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private h290 constrainedValues_ = h.emptyProtobufList();

    /* JADX INFO: renamed from: org.chromium.net.httpflags.FlagValue$1, reason: invalid class name */
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

    public interface ConstrainedValueOrBuilder extends v2j0 {
        String getAppId();

        phc getAppIdBytes();

        boolean getApplyEvenIfCronetTelemetryDisabled();

        boolean getBoolValue();

        phc getBytesValue();

        /* synthetic */ s2j0 getDefaultInstanceForType();

        float getFloatValue();

        long getIntValue();

        String getMinVersion();

        phc getMinVersionBytes();

        String getStringValue();

        phc getStringValueBytes();

        ConstrainedValue.ValueCase getValueCase();

        boolean hasAppId();

        boolean hasApplyEvenIfCronetTelemetryDisabled();

        boolean hasBoolValue();

        boolean hasBytesValue();

        boolean hasFloatValue();

        boolean hasIntValue();

        boolean hasMinVersion();

        boolean hasStringValue();

        /* synthetic */ boolean isInitialized();
    }

    static {
        FlagValue flagValue = new FlagValue();
        DEFAULT_INSTANCE = flagValue;
        h.registerDefaultInstance(FlagValue.class, flagValue);
    }

    private FlagValue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllConstrainedValues(Iterable<? extends ConstrainedValue> iterable) {
        ensureConstrainedValuesIsMutable();
        s8.addAll(iterable, this.constrainedValues_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConstrainedValues(ConstrainedValue constrainedValue) {
        constrainedValue.getClass();
        ensureConstrainedValuesIsMutable();
        this.constrainedValues_.add(constrainedValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConstrainedValues() {
        this.constrainedValues_ = h.emptyProtobufList();
    }

    private void ensureConstrainedValuesIsMutable() {
        i9 i9Var = this.constrainedValues_;
        if (i9Var.a) {
            return;
        }
        this.constrainedValues_ = h.mutableCopy(i9Var);
    }

    public static FlagValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static FlagValue parseDelimitedFrom(InputStream inputStream) {
        return (FlagValue) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FlagValue parseFrom(ByteBuffer byteBuffer) {
        return (FlagValue) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeConstrainedValues(int i) {
        ensureConstrainedValuesIsMutable();
        this.constrainedValues_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConstrainedValues(int i, ConstrainedValue constrainedValue) {
        constrainedValue.getClass();
        ensureConstrainedValuesIsMutable();
        this.constrainedValues_.set(i, constrainedValue);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        switch (jf40Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\b\b\u0001\u0000\u0001\u0000\b\u001b", new Object[]{"constrainedValues_", ConstrainedValue.class});
            case 3:
                return new FlagValue();
            case 4:
                return new Builder(0);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                qzr0 qzr0Var = PARSER;
                if (qzr0Var != null) {
                    return qzr0Var;
                }
                synchronized (FlagValue.class) {
                    try {
                        bf40Var = PARSER;
                        if (bf40Var == null) {
                            bf40Var = new bf40(DEFAULT_INSTANCE);
                            PARSER = bf40Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return bf40Var;
            default:
                k220.c();
                return null;
        }
    }

    @Override // org.chromium.net.httpflags.FlagValueOrBuilder
    public ConstrainedValue getConstrainedValues(int i) {
        return (ConstrainedValue) this.constrainedValues_.get(i);
    }

    @Override // org.chromium.net.httpflags.FlagValueOrBuilder
    public int getConstrainedValuesCount() {
        return this.constrainedValues_.size();
    }

    @Override // org.chromium.net.httpflags.FlagValueOrBuilder
    public List<ConstrainedValue> getConstrainedValuesList() {
        return this.constrainedValues_;
    }

    public ConstrainedValueOrBuilder getConstrainedValuesOrBuilder(int i) {
        return (ConstrainedValueOrBuilder) this.constrainedValues_.get(i);
    }

    public List<? extends ConstrainedValueOrBuilder> getConstrainedValuesOrBuilderList() {
        return this.constrainedValues_;
    }

    public static final class ConstrainedValue extends h implements ConstrainedValueOrBuilder {
        public static final int APPLY_EVEN_IF_CRONET_TELEMETRY_DISABLED_FIELD_NUMBER = 8;
        public static final int APP_ID_FIELD_NUMBER = 1;
        public static final int BOOL_VALUE_FIELD_NUMBER = 3;
        public static final int BYTES_VALUE_FIELD_NUMBER = 7;
        private static final ConstrainedValue DEFAULT_INSTANCE;
        public static final int FLOAT_VALUE_FIELD_NUMBER = 5;
        public static final int INT_VALUE_FIELD_NUMBER = 4;
        public static final int MIN_VERSION_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER = null;
        public static final int STRING_VALUE_FIELD_NUMBER = 6;
        private boolean applyEvenIfCronetTelemetryDisabled_;
        private int bitField0_;
        private Object value_;
        private int valueCase_ = 0;
        private String appId_ = "";
        private String minVersion_ = "";

        static {
            ConstrainedValue constrainedValue = new ConstrainedValue();
            DEFAULT_INSTANCE = constrainedValue;
            h.registerDefaultInstance(ConstrainedValue.class, constrainedValue);
        }

        private ConstrainedValue() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppId() {
            this.bitField0_ &= -2;
            this.appId_ = getDefaultInstance().getAppId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearApplyEvenIfCronetTelemetryDisabled() {
            this.bitField0_ &= -5;
            this.applyEvenIfCronetTelemetryDisabled_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBoolValue() {
            if (this.valueCase_ == 3) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBytesValue() {
            if (this.valueCase_ == 7) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFloatValue() {
            if (this.valueCase_ == 5) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIntValue() {
            if (this.valueCase_ == 4) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMinVersion() {
            this.bitField0_ &= -3;
            this.minVersion_ = getDefaultInstance().getMinVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStringValue() {
            if (this.valueCase_ == 6) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.valueCase_ = 0;
            this.value_ = null;
        }

        public static ConstrainedValue getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ConstrainedValue parseDelimitedFrom(InputStream inputStream) {
            return (ConstrainedValue) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ConstrainedValue parseFrom(ByteBuffer byteBuffer) {
            return (ConstrainedValue) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppId(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.appId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppIdBytes(phc phcVar) {
            this.appId_ = phcVar.v();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setApplyEvenIfCronetTelemetryDisabled(boolean z) {
            this.bitField0_ |= 4;
            this.applyEvenIfCronetTelemetryDisabled_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBoolValue(boolean z) {
            this.valueCase_ = 3;
            this.value_ = Boolean.valueOf(z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBytesValue(phc phcVar) {
            phcVar.getClass();
            this.valueCase_ = 7;
            this.value_ = phcVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFloatValue(float f) {
            this.valueCase_ = 5;
            this.value_ = Float.valueOf(f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIntValue(long j) {
            this.valueCase_ = 4;
            this.value_ = Long.valueOf(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMinVersion(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.minVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMinVersionBytes(phc phcVar) {
            this.minVersion_ = phcVar.v();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStringValue(String str) {
            str.getClass();
            this.valueCase_ = 6;
            this.value_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStringValueBytes(phc phcVar) {
            this.value_ = phcVar.v();
            this.valueCase_ = 6;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            switch (jf40Var.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003:\u0000\u00045\u0000\u00054\u0000\u0006;\u0000\u0007=\u0000\bဇ\u0002", new Object[]{"value_", "valueCase_", "bitField0_", "appId_", "minVersion_", "applyEvenIfCronetTelemetryDisabled_"});
                case 3:
                    return new ConstrainedValue();
                case 4:
                    return new Builder(0);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    qzr0 qzr0Var = PARSER;
                    if (qzr0Var != null) {
                        return qzr0Var;
                    }
                    synchronized (ConstrainedValue.class) {
                        try {
                            bf40Var = PARSER;
                            if (bf40Var == null) {
                                bf40Var = new bf40(DEFAULT_INSTANCE);
                                PARSER = bf40Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return bf40Var;
                default:
                    k220.c();
                    return null;
            }
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public String getAppId() {
            return this.appId_;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public phc getAppIdBytes() {
            return phc.i(this.appId_);
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public boolean getApplyEvenIfCronetTelemetryDisabled() {
            return this.applyEvenIfCronetTelemetryDisabled_;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public boolean getBoolValue() {
            if (this.valueCase_ == 3) {
                return ((Boolean) this.value_).booleanValue();
            }
            return false;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public phc getBytesValue() {
            return this.valueCase_ == 7 ? (phc) this.value_ : phc.b;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public float getFloatValue() {
            if (this.valueCase_ == 5) {
                return ((Float) this.value_).floatValue();
            }
            return 0.0f;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public long getIntValue() {
            if (this.valueCase_ == 4) {
                return ((Long) this.value_).longValue();
            }
            return 0L;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public String getMinVersion() {
            return this.minVersion_;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public phc getMinVersionBytes() {
            return phc.i(this.minVersion_);
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public String getStringValue() {
            return this.valueCase_ == 6 ? (String) this.value_ : "";
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public phc getStringValueBytes() {
            return phc.i(this.valueCase_ == 6 ? (String) this.value_ : "");
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public ValueCase getValueCase() {
            return ValueCase.forNumber(this.valueCase_);
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public boolean hasAppId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public boolean hasApplyEvenIfCronetTelemetryDisabled() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public boolean hasBoolValue() {
            return this.valueCase_ == 3;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public boolean hasBytesValue() {
            return this.valueCase_ == 7;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public boolean hasFloatValue() {
            return this.valueCase_ == 5;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public boolean hasIntValue() {
            return this.valueCase_ == 4;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public boolean hasMinVersion() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public boolean hasStringValue() {
            return this.valueCase_ == 6;
        }

        public static final class Builder extends g implements ConstrainedValueOrBuilder {
            private Builder() {
                super(ConstrainedValue.DEFAULT_INSTANCE);
            }

            public Builder clearAppId() {
                copyOnWrite();
                ((ConstrainedValue) ((g) this).instance).clearAppId();
                return this;
            }

            public Builder clearApplyEvenIfCronetTelemetryDisabled() {
                copyOnWrite();
                ((ConstrainedValue) ((g) this).instance).clearApplyEvenIfCronetTelemetryDisabled();
                return this;
            }

            public Builder clearBoolValue() {
                copyOnWrite();
                ((ConstrainedValue) ((g) this).instance).clearBoolValue();
                return this;
            }

            public Builder clearBytesValue() {
                copyOnWrite();
                ((ConstrainedValue) ((g) this).instance).clearBytesValue();
                return this;
            }

            public Builder clearFloatValue() {
                copyOnWrite();
                ((ConstrainedValue) ((g) this).instance).clearFloatValue();
                return this;
            }

            public Builder clearIntValue() {
                copyOnWrite();
                ((ConstrainedValue) ((g) this).instance).clearIntValue();
                return this;
            }

            public Builder clearMinVersion() {
                copyOnWrite();
                ((ConstrainedValue) ((g) this).instance).clearMinVersion();
                return this;
            }

            public Builder clearStringValue() {
                copyOnWrite();
                ((ConstrainedValue) ((g) this).instance).clearStringValue();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((ConstrainedValue) ((g) this).instance).clearValue();
                return this;
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public String getAppId() {
                return ((ConstrainedValue) ((g) this).instance).getAppId();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public phc getAppIdBytes() {
                return ((ConstrainedValue) ((g) this).instance).getAppIdBytes();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public boolean getApplyEvenIfCronetTelemetryDisabled() {
                return ((ConstrainedValue) ((g) this).instance).getApplyEvenIfCronetTelemetryDisabled();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public boolean getBoolValue() {
                return ((ConstrainedValue) ((g) this).instance).getBoolValue();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public phc getBytesValue() {
                return ((ConstrainedValue) ((g) this).instance).getBytesValue();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public float getFloatValue() {
                return ((ConstrainedValue) ((g) this).instance).getFloatValue();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public long getIntValue() {
                return ((ConstrainedValue) ((g) this).instance).getIntValue();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public String getMinVersion() {
                return ((ConstrainedValue) ((g) this).instance).getMinVersion();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public phc getMinVersionBytes() {
                return ((ConstrainedValue) ((g) this).instance).getMinVersionBytes();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public String getStringValue() {
                return ((ConstrainedValue) ((g) this).instance).getStringValue();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public phc getStringValueBytes() {
                return ((ConstrainedValue) ((g) this).instance).getStringValueBytes();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public ValueCase getValueCase() {
                return ((ConstrainedValue) ((g) this).instance).getValueCase();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public boolean hasAppId() {
                return ((ConstrainedValue) ((g) this).instance).hasAppId();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public boolean hasApplyEvenIfCronetTelemetryDisabled() {
                return ((ConstrainedValue) ((g) this).instance).hasApplyEvenIfCronetTelemetryDisabled();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public boolean hasBoolValue() {
                return ((ConstrainedValue) ((g) this).instance).hasBoolValue();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public boolean hasBytesValue() {
                return ((ConstrainedValue) ((g) this).instance).hasBytesValue();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public boolean hasFloatValue() {
                return ((ConstrainedValue) ((g) this).instance).hasFloatValue();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public boolean hasIntValue() {
                return ((ConstrainedValue) ((g) this).instance).hasIntValue();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public boolean hasMinVersion() {
                return ((ConstrainedValue) ((g) this).instance).hasMinVersion();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public boolean hasStringValue() {
                return ((ConstrainedValue) ((g) this).instance).hasStringValue();
            }

            public Builder setAppId(String str) {
                copyOnWrite();
                ((ConstrainedValue) ((g) this).instance).setAppId(str);
                return this;
            }

            public Builder setAppIdBytes(phc phcVar) {
                copyOnWrite();
                ((ConstrainedValue) ((g) this).instance).setAppIdBytes(phcVar);
                return this;
            }

            public Builder setApplyEvenIfCronetTelemetryDisabled(boolean z) {
                copyOnWrite();
                ((ConstrainedValue) ((g) this).instance).setApplyEvenIfCronetTelemetryDisabled(z);
                return this;
            }

            public Builder setBoolValue(boolean z) {
                copyOnWrite();
                ((ConstrainedValue) ((g) this).instance).setBoolValue(z);
                return this;
            }

            public Builder setBytesValue(phc phcVar) {
                copyOnWrite();
                ((ConstrainedValue) ((g) this).instance).setBytesValue(phcVar);
                return this;
            }

            public Builder setFloatValue(float f) {
                copyOnWrite();
                ((ConstrainedValue) ((g) this).instance).setFloatValue(f);
                return this;
            }

            public Builder setIntValue(long j) {
                copyOnWrite();
                ((ConstrainedValue) ((g) this).instance).setIntValue(j);
                return this;
            }

            public Builder setMinVersion(String str) {
                copyOnWrite();
                ((ConstrainedValue) ((g) this).instance).setMinVersion(str);
                return this;
            }

            public Builder setMinVersionBytes(phc phcVar) {
                copyOnWrite();
                ((ConstrainedValue) ((g) this).instance).setMinVersionBytes(phcVar);
                return this;
            }

            public Builder setStringValue(String str) {
                copyOnWrite();
                ((ConstrainedValue) ((g) this).instance).setStringValue(str);
                return this;
            }

            public Builder setStringValueBytes(phc phcVar) {
                copyOnWrite();
                ((ConstrainedValue) ((g) this).instance).setStringValueBytes(phcVar);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public enum ValueCase {
            BOOL_VALUE(3),
            INT_VALUE(4),
            FLOAT_VALUE(5),
            STRING_VALUE(6),
            BYTES_VALUE(7),
            VALUE_NOT_SET(0);

            private final int value;

            ValueCase(int i) {
                this.value = i;
            }

            public static ValueCase forNumber(int i) {
                if (i == 0) {
                    return VALUE_NOT_SET;
                }
                if (i == 3) {
                    return BOOL_VALUE;
                }
                if (i == 4) {
                    return INT_VALUE;
                }
                if (i == 5) {
                    return FLOAT_VALUE;
                }
                if (i == 6) {
                    return STRING_VALUE;
                }
                if (i != 7) {
                    return null;
                }
                return BYTES_VALUE;
            }

            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static ValueCase valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Builder newBuilder(ConstrainedValue constrainedValue) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(constrainedValue);
        }

        public static ConstrainedValue parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (ConstrainedValue) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static ConstrainedValue parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (ConstrainedValue) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static ConstrainedValue parseFrom(phc phcVar) {
            return (ConstrainedValue) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static ConstrainedValue parseFrom(phc phcVar, uz00 uz00Var) {
            return (ConstrainedValue) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static ConstrainedValue parseFrom(byte[] bArr) {
            return (ConstrainedValue) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ConstrainedValue parseFrom(byte[] bArr, uz00 uz00Var) {
            return (ConstrainedValue) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static ConstrainedValue parseFrom(InputStream inputStream) {
            return (ConstrainedValue) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ConstrainedValue parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (ConstrainedValue) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static ConstrainedValue parseFrom(lwg lwgVar) {
            return (ConstrainedValue) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static ConstrainedValue parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (ConstrainedValue) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class Builder extends g implements FlagValueOrBuilder {
        private Builder() {
            super(FlagValue.DEFAULT_INSTANCE);
        }

        public Builder addAllConstrainedValues(Iterable<? extends ConstrainedValue> iterable) {
            copyOnWrite();
            ((FlagValue) ((g) this).instance).addAllConstrainedValues(iterable);
            return this;
        }

        public Builder addConstrainedValues(ConstrainedValue.Builder builder) {
            copyOnWrite();
            ((FlagValue) ((g) this).instance).addConstrainedValues((ConstrainedValue) builder.build());
            return this;
        }

        public Builder clearConstrainedValues() {
            copyOnWrite();
            ((FlagValue) ((g) this).instance).clearConstrainedValues();
            return this;
        }

        @Override // org.chromium.net.httpflags.FlagValueOrBuilder
        public ConstrainedValue getConstrainedValues(int i) {
            return ((FlagValue) ((g) this).instance).getConstrainedValues(i);
        }

        @Override // org.chromium.net.httpflags.FlagValueOrBuilder
        public int getConstrainedValuesCount() {
            return ((FlagValue) ((g) this).instance).getConstrainedValuesCount();
        }

        @Override // org.chromium.net.httpflags.FlagValueOrBuilder
        public List<ConstrainedValue> getConstrainedValuesList() {
            return Collections.unmodifiableList(((FlagValue) ((g) this).instance).getConstrainedValuesList());
        }

        public Builder removeConstrainedValues(int i) {
            copyOnWrite();
            ((FlagValue) ((g) this).instance).removeConstrainedValues(i);
            return this;
        }

        public Builder setConstrainedValues(int i, ConstrainedValue.Builder builder) {
            copyOnWrite();
            ((FlagValue) ((g) this).instance).setConstrainedValues(i, (ConstrainedValue) builder.build());
            return this;
        }

        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder addConstrainedValues(int i, ConstrainedValue constrainedValue) {
            copyOnWrite();
            ((FlagValue) ((g) this).instance).addConstrainedValues(i, constrainedValue);
            return this;
        }

        public Builder setConstrainedValues(int i, ConstrainedValue constrainedValue) {
            copyOnWrite();
            ((FlagValue) ((g) this).instance).setConstrainedValues(i, constrainedValue);
            return this;
        }

        public Builder addConstrainedValues(ConstrainedValue constrainedValue) {
            copyOnWrite();
            ((FlagValue) ((g) this).instance).addConstrainedValues(constrainedValue);
            return this;
        }

        public Builder addConstrainedValues(int i, ConstrainedValue.Builder builder) {
            copyOnWrite();
            ((FlagValue) ((g) this).instance).addConstrainedValues(i, (ConstrainedValue) builder.build());
            return this;
        }
    }

    public static Builder newBuilder(FlagValue flagValue) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(flagValue);
    }

    public static FlagValue parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (FlagValue) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static FlagValue parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (FlagValue) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static FlagValue parseFrom(phc phcVar) {
        return (FlagValue) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static FlagValue parseFrom(phc phcVar, uz00 uz00Var) {
        return (FlagValue) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConstrainedValues(int i, ConstrainedValue constrainedValue) {
        constrainedValue.getClass();
        ensureConstrainedValuesIsMutable();
        this.constrainedValues_.add(i, constrainedValue);
    }

    public static FlagValue parseFrom(byte[] bArr) {
        return (FlagValue) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FlagValue parseFrom(byte[] bArr, uz00 uz00Var) {
        return (FlagValue) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static FlagValue parseFrom(InputStream inputStream) {
        return (FlagValue) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FlagValue parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (FlagValue) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static FlagValue parseFrom(lwg lwgVar) {
        return (FlagValue) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static FlagValue parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (FlagValue) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
