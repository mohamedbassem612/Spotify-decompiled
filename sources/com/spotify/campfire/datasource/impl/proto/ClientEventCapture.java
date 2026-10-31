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
public final class ClientEventCapture extends h implements ClientEventCaptureOrBuilder {
    public static final int AGENT_CONTEXT_FIELD_NUMBER = 3;
    private static final ClientEventCapture DEFAULT_INSTANCE;
    public static final int EVENT_CAPTURE_FIELD_NUMBER = 2;
    public static final int INIT_USERNAME_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private AgentContext agentContext_;
    private int bitField0_;
    private EventCapture eventCapture_;
    private String initUsername_ = "";

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.ClientEventCapture$1, reason: invalid class name */
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
        ClientEventCapture clientEventCapture = new ClientEventCapture();
        DEFAULT_INSTANCE = clientEventCapture;
        h.registerDefaultInstance(ClientEventCapture.class, clientEventCapture);
    }

    private ClientEventCapture() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAgentContext() {
        this.agentContext_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventCapture() {
        this.eventCapture_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInitUsername() {
        this.initUsername_ = getDefaultInstance().getInitUsername();
    }

    public static ClientEventCapture getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAgentContext(AgentContext agentContext) {
        agentContext.getClass();
        AgentContext agentContext2 = this.agentContext_;
        if (agentContext2 == null || agentContext2 == AgentContext.getDefaultInstance()) {
            this.agentContext_ = agentContext;
        } else {
            this.agentContext_ = (AgentContext) ((AgentContext.Builder) AgentContext.newBuilder(this.agentContext_).mergeFrom(agentContext)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEventCapture(EventCapture eventCapture) {
        eventCapture.getClass();
        EventCapture eventCapture2 = this.eventCapture_;
        if (eventCapture2 == null || eventCapture2 == EventCapture.getDefaultInstance()) {
            this.eventCapture_ = eventCapture;
        } else {
            this.eventCapture_ = (EventCapture) ((EventCapture.Builder) EventCapture.newBuilder(this.eventCapture_).mergeFrom(eventCapture)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ClientEventCapture parseDelimitedFrom(InputStream inputStream) {
        return (ClientEventCapture) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClientEventCapture parseFrom(ByteBuffer byteBuffer) {
        return (ClientEventCapture) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAgentContext(AgentContext agentContext) {
        agentContext.getClass();
        this.agentContext_ = agentContext;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventCapture(EventCapture eventCapture) {
        eventCapture.getClass();
        this.eventCapture_ = eventCapture;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInitUsername(String str) {
        str.getClass();
        this.initUsername_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInitUsernameBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.initUsername_ = phcVar.v();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "initUsername_", "eventCapture_", "agentContext_"});
        }
        if (iOrdinal == 3) {
            return new ClientEventCapture();
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
        synchronized (ClientEventCapture.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.ClientEventCaptureOrBuilder
    public AgentContext getAgentContext() {
        AgentContext agentContext = this.agentContext_;
        return agentContext == null ? AgentContext.getDefaultInstance() : agentContext;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientEventCaptureOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientEventCaptureOrBuilder
    public EventCapture getEventCapture() {
        EventCapture eventCapture = this.eventCapture_;
        return eventCapture == null ? EventCapture.getDefaultInstance() : eventCapture;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientEventCaptureOrBuilder
    public String getInitUsername() {
        return this.initUsername_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientEventCaptureOrBuilder
    public phc getInitUsernameBytes() {
        return phc.i(this.initUsername_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientEventCaptureOrBuilder
    public boolean hasAgentContext() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ClientEventCaptureOrBuilder
    public boolean hasEventCapture() {
        return (this.bitField0_ & 1) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements ClientEventCaptureOrBuilder {
        private Builder() {
            super(ClientEventCapture.DEFAULT_INSTANCE);
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

        public Builder clearAgentContext() {
            copyOnWrite();
            ((ClientEventCapture) ((g) this).instance).clearAgentContext();
            return this;
        }

        public Builder clearEventCapture() {
            copyOnWrite();
            ((ClientEventCapture) ((g) this).instance).clearEventCapture();
            return this;
        }

        public Builder clearInitUsername() {
            copyOnWrite();
            ((ClientEventCapture) ((g) this).instance).clearInitUsername();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientEventCaptureOrBuilder
        public AgentContext getAgentContext() {
            return ((ClientEventCapture) ((g) this).instance).getAgentContext();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientEventCaptureOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientEventCaptureOrBuilder
        public EventCapture getEventCapture() {
            return ((ClientEventCapture) ((g) this).instance).getEventCapture();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientEventCaptureOrBuilder
        public String getInitUsername() {
            return ((ClientEventCapture) ((g) this).instance).getInitUsername();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientEventCaptureOrBuilder
        public phc getInitUsernameBytes() {
            return ((ClientEventCapture) ((g) this).instance).getInitUsernameBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientEventCaptureOrBuilder
        public boolean hasAgentContext() {
            return ((ClientEventCapture) ((g) this).instance).hasAgentContext();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ClientEventCaptureOrBuilder
        public boolean hasEventCapture() {
            return ((ClientEventCapture) ((g) this).instance).hasEventCapture();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        public Builder mergeAgentContext(AgentContext agentContext) {
            copyOnWrite();
            ((ClientEventCapture) ((g) this).instance).mergeAgentContext(agentContext);
            return this;
        }

        public Builder mergeEventCapture(EventCapture eventCapture) {
            copyOnWrite();
            ((ClientEventCapture) ((g) this).instance).mergeEventCapture(eventCapture);
            return this;
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m109mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setAgentContext(AgentContext.Builder builder) {
            copyOnWrite();
            ((ClientEventCapture) ((g) this).instance).setAgentContext((AgentContext) builder.build());
            return this;
        }

        public Builder setEventCapture(EventCapture.Builder builder) {
            copyOnWrite();
            ((ClientEventCapture) ((g) this).instance).setEventCapture((EventCapture) builder.build());
            return this;
        }

        public Builder setInitUsername(String str) {
            copyOnWrite();
            ((ClientEventCapture) ((g) this).instance).setInitUsername(str);
            return this;
        }

        public Builder setInitUsernameBytes(phc phcVar) {
            copyOnWrite();
            ((ClientEventCapture) ((g) this).instance).setInitUsernameBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m108clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m110mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m107clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m111mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder setAgentContext(AgentContext agentContext) {
            copyOnWrite();
            ((ClientEventCapture) ((g) this).instance).setAgentContext(agentContext);
            return this;
        }

        public Builder setEventCapture(EventCapture eventCapture) {
            copyOnWrite();
            ((ClientEventCapture) ((g) this).instance).setEventCapture(eventCapture);
            return this;
        }
    }

    public static Builder newBuilder(ClientEventCapture clientEventCapture) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(clientEventCapture);
    }

    public static ClientEventCapture parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (ClientEventCapture) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ClientEventCapture parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (ClientEventCapture) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static ClientEventCapture parseFrom(phc phcVar) {
        return (ClientEventCapture) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static ClientEventCapture parseFrom(phc phcVar, uz00 uz00Var) {
        return (ClientEventCapture) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static ClientEventCapture parseFrom(byte[] bArr) {
        return (ClientEventCapture) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ClientEventCapture parseFrom(byte[] bArr, uz00 uz00Var) {
        return (ClientEventCapture) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static ClientEventCapture parseFrom(InputStream inputStream) {
        return (ClientEventCapture) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClientEventCapture parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (ClientEventCapture) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ClientEventCapture parseFrom(lwg lwgVar) {
        return (ClientEventCapture) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static ClientEventCapture parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (ClientEventCapture) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
