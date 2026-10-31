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
public final class AgentContext extends h implements AgentContextOrBuilder {
    public static final int AGENT_ID_FIELD_NUMBER = 1;
    private static final AgentContext DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int ROLE_FIELD_NUMBER = 2;
    private String agentId_ = "";
    private String role_ = "";

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.AgentContext$1, reason: invalid class name */
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
        AgentContext agentContext = new AgentContext();
        DEFAULT_INSTANCE = agentContext;
        h.registerDefaultInstance(AgentContext.class, agentContext);
    }

    private AgentContext() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAgentId() {
        this.agentId_ = getDefaultInstance().getAgentId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRole() {
        this.role_ = getDefaultInstance().getRole();
    }

    public static AgentContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static AgentContext parseDelimitedFrom(InputStream inputStream) {
        return (AgentContext) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AgentContext parseFrom(ByteBuffer byteBuffer) {
        return (AgentContext) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAgentId(String str) {
        str.getClass();
        this.agentId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAgentIdBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.agentId_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRole(String str) {
        str.getClass();
        this.role_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoleBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.role_ = phcVar.v();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"agentId_", "role_"});
        }
        if (iOrdinal == 3) {
            return new AgentContext();
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
        synchronized (AgentContext.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.AgentContextOrBuilder
    public String getAgentId() {
        return this.agentId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AgentContextOrBuilder
    public phc getAgentIdBytes() {
        return phc.i(this.agentId_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AgentContextOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AgentContextOrBuilder
    public String getRole() {
        return this.role_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AgentContextOrBuilder
    public phc getRoleBytes() {
        return phc.i(this.role_);
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements AgentContextOrBuilder {
        private Builder() {
            super(AgentContext.DEFAULT_INSTANCE);
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

        public Builder clearAgentId() {
            copyOnWrite();
            ((AgentContext) ((g) this).instance).clearAgentId();
            return this;
        }

        public Builder clearRole() {
            copyOnWrite();
            ((AgentContext) ((g) this).instance).clearRole();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AgentContextOrBuilder
        public String getAgentId() {
            return ((AgentContext) ((g) this).instance).getAgentId();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AgentContextOrBuilder
        public phc getAgentIdBytes() {
            return ((AgentContext) ((g) this).instance).getAgentIdBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AgentContextOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AgentContextOrBuilder
        public String getRole() {
            return ((AgentContext) ((g) this).instance).getRole();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AgentContextOrBuilder
        public phc getRoleBytes() {
            return ((AgentContext) ((g) this).instance).getRoleBytes();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m59mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setAgentId(String str) {
            copyOnWrite();
            ((AgentContext) ((g) this).instance).setAgentId(str);
            return this;
        }

        public Builder setAgentIdBytes(phc phcVar) {
            copyOnWrite();
            ((AgentContext) ((g) this).instance).setAgentIdBytes(phcVar);
            return this;
        }

        public Builder setRole(String str) {
            copyOnWrite();
            ((AgentContext) ((g) this).instance).setRole(str);
            return this;
        }

        public Builder setRoleBytes(phc phcVar) {
            copyOnWrite();
            ((AgentContext) ((g) this).instance).setRoleBytes(phcVar);
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
    }

    public static Builder newBuilder(AgentContext agentContext) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(agentContext);
    }

    public static AgentContext parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (AgentContext) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static AgentContext parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (AgentContext) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static AgentContext parseFrom(phc phcVar) {
        return (AgentContext) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static AgentContext parseFrom(phc phcVar, uz00 uz00Var) {
        return (AgentContext) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static AgentContext parseFrom(byte[] bArr) {
        return (AgentContext) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AgentContext parseFrom(byte[] bArr, uz00 uz00Var) {
        return (AgentContext) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static AgentContext parseFrom(InputStream inputStream) {
        return (AgentContext) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AgentContext parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (AgentContext) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static AgentContext parseFrom(lwg lwgVar) {
        return (AgentContext) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static AgentContext parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (AgentContext) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
