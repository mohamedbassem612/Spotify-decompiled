package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p.bf40;
import p.jf40;
import p.lwg;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.r8;
import p.s2j0;
import p.s8;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class HierarchyAgent extends h implements HierarchyAgentOrBuilder {
    public static final int AGENT_URI_FIELD_NUMBER = 2;
    private static final HierarchyAgent DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private String username_ = "";
    private String agentUri_ = "";

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.HierarchyAgent$1, reason: invalid class name */
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

    static {
        HierarchyAgent hierarchyAgent = new HierarchyAgent();
        DEFAULT_INSTANCE = hierarchyAgent;
        h.registerDefaultInstance(HierarchyAgent.class, hierarchyAgent);
    }

    private HierarchyAgent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAgentUri() {
        this.agentUri_ = getDefaultInstance().getAgentUri();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUsername() {
        this.username_ = getDefaultInstance().getUsername();
    }

    public static HierarchyAgent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static HierarchyAgent parseDelimitedFrom(InputStream inputStream) {
        return (HierarchyAgent) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HierarchyAgent parseFrom(ByteBuffer byteBuffer) {
        return (HierarchyAgent) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAgentUri(String str) {
        str.getClass();
        this.agentUri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAgentUriBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.agentUri_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsername(String str) {
        str.getClass();
        this.username_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsernameBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.username_ = phcVar.v();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"username_", "agentUri_"});
        }
        if (iOrdinal == 3) {
            return new HierarchyAgent();
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
        synchronized (HierarchyAgent.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyAgentOrBuilder
    public String getAgentUri() {
        return this.agentUri_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyAgentOrBuilder
    public phc getAgentUriBytes() {
        return phc.i(this.agentUri_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyAgentOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyAgentOrBuilder
    public String getUsername() {
        return this.username_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyAgentOrBuilder
    public phc getUsernameBytes() {
        return phc.i(this.username_);
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements HierarchyAgentOrBuilder {
        private Builder() {
            super(HierarchyAgent.DEFAULT_INSTANCE);
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

        public Builder clearAgentUri() {
            copyOnWrite();
            ((HierarchyAgent) ((g) this).instance).clearAgentUri();
            return this;
        }

        public Builder clearUsername() {
            copyOnWrite();
            ((HierarchyAgent) ((g) this).instance).clearUsername();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyAgentOrBuilder
        public String getAgentUri() {
            return ((HierarchyAgent) ((g) this).instance).getAgentUri();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyAgentOrBuilder
        public phc getAgentUriBytes() {
            return ((HierarchyAgent) ((g) this).instance).getAgentUriBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyAgentOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyAgentOrBuilder
        public String getUsername() {
            return ((HierarchyAgent) ((g) this).instance).getUsername();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyAgentOrBuilder
        public phc getUsernameBytes() {
            return ((HierarchyAgent) ((g) this).instance).getUsernameBytes();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m371mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setAgentUri(String str) {
            copyOnWrite();
            ((HierarchyAgent) ((g) this).instance).setAgentUri(str);
            return this;
        }

        public Builder setAgentUriBytes(phc phcVar) {
            copyOnWrite();
            ((HierarchyAgent) ((g) this).instance).setAgentUriBytes(phcVar);
            return this;
        }

        public Builder setUsername(String str) {
            copyOnWrite();
            ((HierarchyAgent) ((g) this).instance).setUsername(str);
            return this;
        }

        public Builder setUsernameBytes(phc phcVar) {
            copyOnWrite();
            ((HierarchyAgent) ((g) this).instance).setUsernameBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m370clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m372mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m369clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m373mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(HierarchyAgent hierarchyAgent) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(hierarchyAgent);
    }

    public static HierarchyAgent parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (HierarchyAgent) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static HierarchyAgent parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (HierarchyAgent) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static HierarchyAgent parseFrom(phc phcVar) {
        return (HierarchyAgent) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static HierarchyAgent parseFrom(phc phcVar, uz00 uz00Var) {
        return (HierarchyAgent) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static HierarchyAgent parseFrom(byte[] bArr) {
        return (HierarchyAgent) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HierarchyAgent parseFrom(byte[] bArr, uz00 uz00Var) {
        return (HierarchyAgent) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static HierarchyAgent parseFrom(InputStream inputStream) {
        return (HierarchyAgent) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HierarchyAgent parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (HierarchyAgent) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static HierarchyAgent parseFrom(lwg lwgVar) {
        return (HierarchyAgent) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static HierarchyAgent parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (HierarchyAgent) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
