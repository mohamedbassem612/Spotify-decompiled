package org.chromium.net.httpflags;

import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import p.bf40;
import p.bhn0;
import p.dng0;
import p.jf40;
import p.k220;
import p.kul1;
import p.lwg;
import p.phc;
import p.qng0;
import p.qzr0;
import p.s2j0;
import p.uz00;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class BaseFeatureOverrides extends h implements BaseFeatureOverridesOrBuilder {
    private static final BaseFeatureOverrides DEFAULT_INSTANCE;
    public static final int FEATURE_STATES_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private qng0 featureStates_ = qng0.b;

    /* JADX INFO: renamed from: org.chromium.net.httpflags.BaseFeatureOverrides$1, reason: invalid class name */
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

    public interface FeatureStateOrBuilder extends v2j0 {
        boolean containsParams(String str);

        /* synthetic */ s2j0 getDefaultInstanceForType();

        boolean getEnabled();

        @Deprecated
        Map<String, phc> getParams();

        int getParamsCount();

        Map<String, phc> getParamsMap();

        phc getParamsOrDefault(String str, phc phcVar);

        phc getParamsOrThrow(String str);

        boolean hasEnabled();

        /* synthetic */ boolean isInitialized();
    }

    public static final class FeatureStatesDefaultEntryHolder {
        static final dng0 defaultEntry = new dng0(kul1.g, "", kul1.i, FeatureState.getDefaultInstance());

        private FeatureStatesDefaultEntryHolder() {
        }
    }

    static {
        BaseFeatureOverrides baseFeatureOverrides = new BaseFeatureOverrides();
        DEFAULT_INSTANCE = baseFeatureOverrides;
        h.registerDefaultInstance(BaseFeatureOverrides.class, baseFeatureOverrides);
    }

    private BaseFeatureOverrides() {
    }

    public static BaseFeatureOverrides getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, FeatureState> getMutableFeatureStatesMap() {
        return internalGetMutableFeatureStates();
    }

    private qng0 internalGetFeatureStates() {
        return this.featureStates_;
    }

    private qng0 internalGetMutableFeatureStates() {
        qng0 qng0Var = this.featureStates_;
        if (qng0Var.a) {
            return qng0Var;
        }
        qng0 qng0VarH = qng0Var.h();
        this.featureStates_ = qng0VarH;
        return qng0VarH;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static BaseFeatureOverrides parseDelimitedFrom(InputStream inputStream) {
        return (BaseFeatureOverrides) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BaseFeatureOverrides parseFrom(ByteBuffer byteBuffer) {
        return (BaseFeatureOverrides) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
    public boolean containsFeatureStates(String str) {
        str.getClass();
        return internalGetFeatureStates().containsKey(str);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        switch (jf40Var.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"featureStates_", FeatureStatesDefaultEntryHolder.defaultEntry});
            case 3:
                return new BaseFeatureOverrides();
            case 4:
                return new Builder(0);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                qzr0 qzr0Var = PARSER;
                if (qzr0Var != null) {
                    return qzr0Var;
                }
                synchronized (BaseFeatureOverrides.class) {
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

    @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
    @Deprecated
    public Map<String, FeatureState> getFeatureStates() {
        return getFeatureStatesMap();
    }

    @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
    public int getFeatureStatesCount() {
        return internalGetFeatureStates().size();
    }

    @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
    public Map<String, FeatureState> getFeatureStatesMap() {
        return Collections.unmodifiableMap(internalGetFeatureStates());
    }

    @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
    public FeatureState getFeatureStatesOrDefault(String str, FeatureState featureState) {
        str.getClass();
        qng0 qng0VarInternalGetFeatureStates = internalGetFeatureStates();
        return qng0VarInternalGetFeatureStates.containsKey(str) ? (FeatureState) qng0VarInternalGetFeatureStates.get(str) : featureState;
    }

    @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
    public FeatureState getFeatureStatesOrThrow(String str) {
        str.getClass();
        qng0 qng0VarInternalGetFeatureStates = internalGetFeatureStates();
        if (qng0VarInternalGetFeatureStates.containsKey(str)) {
            return (FeatureState) qng0VarInternalGetFeatureStates.get(str);
        }
        bhn0.q();
        return null;
    }

    public static final class FeatureState extends h implements FeatureStateOrBuilder {
        private static final FeatureState DEFAULT_INSTANCE;
        public static final int ENABLED_FIELD_NUMBER = 1;
        public static final int PARAMS_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER;
        private int bitField0_;
        private boolean enabled_;
        private qng0 params_ = qng0.b;

        public static final class ParamsDefaultEntryHolder {
            static final dng0 defaultEntry = new dng0(kul1.g, "", kul1.t, phc.b);

            private ParamsDefaultEntryHolder() {
            }
        }

        static {
            FeatureState featureState = new FeatureState();
            DEFAULT_INSTANCE = featureState;
            h.registerDefaultInstance(FeatureState.class, featureState);
        }

        private FeatureState() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnabled() {
            this.bitField0_ &= -2;
            this.enabled_ = false;
        }

        public static FeatureState getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, phc> getMutableParamsMap() {
            return internalGetMutableParams();
        }

        private qng0 internalGetMutableParams() {
            qng0 qng0Var = this.params_;
            if (qng0Var.a) {
                return qng0Var;
            }
            qng0 qng0VarH = qng0Var.h();
            this.params_ = qng0VarH;
            return qng0VarH;
        }

        private qng0 internalGetParams() {
            return this.params_;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FeatureState parseDelimitedFrom(InputStream inputStream) {
            return (FeatureState) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FeatureState parseFrom(ByteBuffer byteBuffer) {
            return (FeatureState) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnabled(boolean z) {
            this.bitField0_ |= 1;
            this.enabled_ = z;
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public boolean containsParams(String str) {
            str.getClass();
            return internalGetParams().containsKey(str);
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            switch (jf40Var.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဇ\u0000\u00022", new Object[]{"bitField0_", "enabled_", "params_", ParamsDefaultEntryHolder.defaultEntry});
                case 3:
                    return new FeatureState();
                case 4:
                    return new Builder(0);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    qzr0 qzr0Var = PARSER;
                    if (qzr0Var != null) {
                        return qzr0Var;
                    }
                    synchronized (FeatureState.class) {
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

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public boolean getEnabled() {
            return this.enabled_;
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        @Deprecated
        public Map<String, phc> getParams() {
            return getParamsMap();
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public int getParamsCount() {
            return internalGetParams().size();
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public Map<String, phc> getParamsMap() {
            return Collections.unmodifiableMap(internalGetParams());
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public phc getParamsOrDefault(String str, phc phcVar) {
            str.getClass();
            qng0 qng0VarInternalGetParams = internalGetParams();
            return qng0VarInternalGetParams.containsKey(str) ? (phc) qng0VarInternalGetParams.get(str) : phcVar;
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public phc getParamsOrThrow(String str) {
            str.getClass();
            qng0 qng0VarInternalGetParams = internalGetParams();
            if (qng0VarInternalGetParams.containsKey(str)) {
                return (phc) qng0VarInternalGetParams.get(str);
            }
            bhn0.q();
            return null;
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public boolean hasEnabled() {
            return (this.bitField0_ & 1) != 0;
        }

        public static final class Builder extends g implements FeatureStateOrBuilder {
            private Builder() {
                super(FeatureState.DEFAULT_INSTANCE);
            }

            public Builder clearEnabled() {
                copyOnWrite();
                ((FeatureState) ((g) this).instance).clearEnabled();
                return this;
            }

            public Builder clearParams() {
                copyOnWrite();
                ((FeatureState) ((g) this).instance).getMutableParamsMap().clear();
                return this;
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public boolean containsParams(String str) {
                str.getClass();
                return ((FeatureState) ((g) this).instance).getParamsMap().containsKey(str);
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public boolean getEnabled() {
                return ((FeatureState) ((g) this).instance).getEnabled();
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            @Deprecated
            public Map<String, phc> getParams() {
                return getParamsMap();
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public int getParamsCount() {
                return ((FeatureState) ((g) this).instance).getParamsMap().size();
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public Map<String, phc> getParamsMap() {
                return Collections.unmodifiableMap(((FeatureState) ((g) this).instance).getParamsMap());
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public phc getParamsOrDefault(String str, phc phcVar) {
                str.getClass();
                Map<String, phc> paramsMap = ((FeatureState) ((g) this).instance).getParamsMap();
                return paramsMap.containsKey(str) ? paramsMap.get(str) : phcVar;
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public phc getParamsOrThrow(String str) {
                str.getClass();
                Map<String, phc> paramsMap = ((FeatureState) ((g) this).instance).getParamsMap();
                if (paramsMap.containsKey(str)) {
                    return paramsMap.get(str);
                }
                bhn0.q();
                return null;
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public boolean hasEnabled() {
                return ((FeatureState) ((g) this).instance).hasEnabled();
            }

            public Builder putAllParams(Map<String, phc> map) {
                copyOnWrite();
                ((FeatureState) ((g) this).instance).getMutableParamsMap().putAll(map);
                return this;
            }

            public Builder putParams(String str, phc phcVar) {
                str.getClass();
                phcVar.getClass();
                copyOnWrite();
                ((FeatureState) ((g) this).instance).getMutableParamsMap().put(str, phcVar);
                return this;
            }

            public Builder removeParams(String str) {
                str.getClass();
                copyOnWrite();
                ((FeatureState) ((g) this).instance).getMutableParamsMap().remove(str);
                return this;
            }

            public Builder setEnabled(boolean z) {
                copyOnWrite();
                ((FeatureState) ((g) this).instance).setEnabled(z);
                return this;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }
        }

        public static Builder newBuilder(FeatureState featureState) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(featureState);
        }

        public static FeatureState parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (FeatureState) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static FeatureState parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (FeatureState) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static FeatureState parseFrom(phc phcVar) {
            return (FeatureState) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static FeatureState parseFrom(phc phcVar, uz00 uz00Var) {
            return (FeatureState) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static FeatureState parseFrom(byte[] bArr) {
            return (FeatureState) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FeatureState parseFrom(byte[] bArr, uz00 uz00Var) {
            return (FeatureState) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static FeatureState parseFrom(InputStream inputStream) {
            return (FeatureState) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FeatureState parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (FeatureState) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static FeatureState parseFrom(lwg lwgVar) {
            return (FeatureState) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static FeatureState parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (FeatureState) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class Builder extends g implements BaseFeatureOverridesOrBuilder {
        private Builder() {
            super(BaseFeatureOverrides.DEFAULT_INSTANCE);
        }

        public Builder clearFeatureStates() {
            copyOnWrite();
            ((BaseFeatureOverrides) ((g) this).instance).getMutableFeatureStatesMap().clear();
            return this;
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
        public boolean containsFeatureStates(String str) {
            str.getClass();
            return ((BaseFeatureOverrides) ((g) this).instance).getFeatureStatesMap().containsKey(str);
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
        @Deprecated
        public Map<String, FeatureState> getFeatureStates() {
            return getFeatureStatesMap();
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
        public int getFeatureStatesCount() {
            return ((BaseFeatureOverrides) ((g) this).instance).getFeatureStatesMap().size();
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
        public Map<String, FeatureState> getFeatureStatesMap() {
            return Collections.unmodifiableMap(((BaseFeatureOverrides) ((g) this).instance).getFeatureStatesMap());
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
        public FeatureState getFeatureStatesOrDefault(String str, FeatureState featureState) {
            str.getClass();
            Map<String, FeatureState> featureStatesMap = ((BaseFeatureOverrides) ((g) this).instance).getFeatureStatesMap();
            return featureStatesMap.containsKey(str) ? featureStatesMap.get(str) : featureState;
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
        public FeatureState getFeatureStatesOrThrow(String str) {
            str.getClass();
            Map<String, FeatureState> featureStatesMap = ((BaseFeatureOverrides) ((g) this).instance).getFeatureStatesMap();
            if (featureStatesMap.containsKey(str)) {
                return featureStatesMap.get(str);
            }
            bhn0.q();
            return null;
        }

        public Builder putAllFeatureStates(Map<String, FeatureState> map) {
            copyOnWrite();
            ((BaseFeatureOverrides) ((g) this).instance).getMutableFeatureStatesMap().putAll(map);
            return this;
        }

        public Builder putFeatureStates(String str, FeatureState featureState) {
            str.getClass();
            featureState.getClass();
            copyOnWrite();
            ((BaseFeatureOverrides) ((g) this).instance).getMutableFeatureStatesMap().put(str, featureState);
            return this;
        }

        public Builder removeFeatureStates(String str) {
            str.getClass();
            copyOnWrite();
            ((BaseFeatureOverrides) ((g) this).instance).getMutableFeatureStatesMap().remove(str);
            return this;
        }

        public /* synthetic */ Builder(int i) {
            this();
        }
    }

    public static Builder newBuilder(BaseFeatureOverrides baseFeatureOverrides) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(baseFeatureOverrides);
    }

    public static BaseFeatureOverrides parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (BaseFeatureOverrides) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static BaseFeatureOverrides parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (BaseFeatureOverrides) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static BaseFeatureOverrides parseFrom(phc phcVar) {
        return (BaseFeatureOverrides) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static BaseFeatureOverrides parseFrom(phc phcVar, uz00 uz00Var) {
        return (BaseFeatureOverrides) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static BaseFeatureOverrides parseFrom(byte[] bArr) {
        return (BaseFeatureOverrides) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BaseFeatureOverrides parseFrom(byte[] bArr, uz00 uz00Var) {
        return (BaseFeatureOverrides) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static BaseFeatureOverrides parseFrom(InputStream inputStream) {
        return (BaseFeatureOverrides) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BaseFeatureOverrides parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (BaseFeatureOverrides) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static BaseFeatureOverrides parseFrom(lwg lwgVar) {
        return (BaseFeatureOverrides) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static BaseFeatureOverrides parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (BaseFeatureOverrides) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
