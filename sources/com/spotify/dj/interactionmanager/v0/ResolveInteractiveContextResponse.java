package com.spotify.dj.interactionmanager.v0;

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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ResolveInteractiveContextResponse extends h implements ResolveInteractiveContextResponseOrBuilder {
    private static final ResolveInteractiveContextResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_CODE_FIELD_NUMBER = 1;
    public static final int STATUS_MESSAGE_FIELD_NUMBER = 2;
    private String statusCode_ = "";
    private String statusMessage_ = "";

    /* JADX INFO: renamed from: com.spotify.dj.interactionmanager.v0.ResolveInteractiveContextResponse$1, reason: invalid class name */
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
        ResolveInteractiveContextResponse resolveInteractiveContextResponse = new ResolveInteractiveContextResponse();
        DEFAULT_INSTANCE = resolveInteractiveContextResponse;
        h.registerDefaultInstance(ResolveInteractiveContextResponse.class, resolveInteractiveContextResponse);
    }

    private ResolveInteractiveContextResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatusCode() {
        this.statusCode_ = DEFAULT_INSTANCE.statusCode_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatusMessage() {
        this.statusMessage_ = DEFAULT_INSTANCE.statusMessage_;
    }

    public static ResolveInteractiveContextResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ResolveInteractiveContextResponse parseDelimitedFrom(InputStream inputStream) {
        return (ResolveInteractiveContextResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResolveInteractiveContextResponse parseFrom(ByteBuffer byteBuffer) {
        return (ResolveInteractiveContextResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusCode(String str) {
        str.getClass();
        this.statusCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusCodeBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.statusCode_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusMessage(String str) {
        str.getClass();
        this.statusMessage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusMessageBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.statusMessage_ = phcVar.v();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"statusCode_", "statusMessage_"});
        }
        if (iOrdinal == 3) {
            return new ResolveInteractiveContextResponse();
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
        synchronized (ResolveInteractiveContextResponse.class) {
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

    @Override // com.spotify.dj.interactionmanager.v0.ResolveInteractiveContextResponseOrBuilder
    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.dj.interactionmanager.v0.ResolveInteractiveContextResponseOrBuilder
    public final String getStatusCode() {
        return this.statusCode_;
    }

    @Override // com.spotify.dj.interactionmanager.v0.ResolveInteractiveContextResponseOrBuilder
    public final phc getStatusCodeBytes() {
        return phc.i(this.statusCode_);
    }

    @Override // com.spotify.dj.interactionmanager.v0.ResolveInteractiveContextResponseOrBuilder
    public final String getStatusMessage() {
        return this.statusMessage_;
    }

    @Override // com.spotify.dj.interactionmanager.v0.ResolveInteractiveContextResponseOrBuilder
    public final phc getStatusMessageBytes() {
        return phc.i(this.statusMessage_);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements ResolveInteractiveContextResponseOrBuilder {
        private Builder() {
            super(ResolveInteractiveContextResponse.DEFAULT_INSTANCE);
        }

        public final /* bridge */ /* synthetic */ s2j0 build() {
            return build();
        }

        public final /* bridge */ /* synthetic */ s2j0 buildPartial() {
            return super.buildPartial();
        }

        public final /* bridge */ /* synthetic */ r2j0 clear() {
            return clear();
        }

        public final Builder clearStatusCode() {
            copyOnWrite();
            ((ResolveInteractiveContextResponse) ((g) this).instance).clearStatusCode();
            return this;
        }

        public final Builder clearStatusMessage() {
            copyOnWrite();
            ((ResolveInteractiveContextResponse) ((g) this).instance).clearStatusMessage();
            return this;
        }

        public final /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.dj.interactionmanager.v0.ResolveInteractiveContextResponseOrBuilder
        public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.dj.interactionmanager.v0.ResolveInteractiveContextResponseOrBuilder
        public final String getStatusCode() {
            return ((ResolveInteractiveContextResponse) ((g) this).instance).getStatusCode();
        }

        @Override // com.spotify.dj.interactionmanager.v0.ResolveInteractiveContextResponseOrBuilder
        public final phc getStatusCodeBytes() {
            return ((ResolveInteractiveContextResponse) ((g) this).instance).getStatusCodeBytes();
        }

        @Override // com.spotify.dj.interactionmanager.v0.ResolveInteractiveContextResponseOrBuilder
        public final String getStatusMessage() {
            return ((ResolveInteractiveContextResponse) ((g) this).instance).getStatusMessage();
        }

        @Override // com.spotify.dj.interactionmanager.v0.ResolveInteractiveContextResponseOrBuilder
        public final phc getStatusMessageBytes() {
            return ((ResolveInteractiveContextResponse) ((g) this).instance).getStatusMessageBytes();
        }

        public final /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m71mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public final Builder setStatusCode(String str) {
            copyOnWrite();
            ((ResolveInteractiveContextResponse) ((g) this).instance).setStatusCode(str);
            return this;
        }

        public final Builder setStatusCodeBytes(phc phcVar) {
            copyOnWrite();
            ((ResolveInteractiveContextResponse) ((g) this).instance).setStatusCodeBytes(phcVar);
            return this;
        }

        public final Builder setStatusMessage(String str) {
            copyOnWrite();
            ((ResolveInteractiveContextResponse) ((g) this).instance).setStatusMessage(str);
            return this;
        }

        public final Builder setStatusMessageBytes(phc phcVar) {
            copyOnWrite();
            ((ResolveInteractiveContextResponse) ((g) this).instance).setStatusMessageBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m70clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m72mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r2j0 m69clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public final /* bridge */ /* synthetic */ r8 m73mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
            return super.mergeFrom(bArr, i, i2, uz00Var);
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
            return super/*p.r8*/.mergeFrom(inputStream);
        }

        public /* synthetic */ Builder(int i) {
            this();
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
            return super/*p.r8*/.mergeFrom(phcVar);
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
            return super/*p.r8*/.mergeFrom(lwgVar);
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
            return super/*p.r8*/.mergeFrom(s2j0Var);
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
            return super/*p.r8*/.mergeFrom(bArr);
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
            return super.mergeFrom(bArr, i, i2, uz00Var);
        }

        public final /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(bArr, uz00Var);
        }
    }

    public static Builder newBuilder(ResolveInteractiveContextResponse resolveInteractiveContextResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(resolveInteractiveContextResponse);
    }

    public static ResolveInteractiveContextResponse parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (ResolveInteractiveContextResponse) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ResolveInteractiveContextResponse parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (ResolveInteractiveContextResponse) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static ResolveInteractiveContextResponse parseFrom(phc phcVar) {
        return (ResolveInteractiveContextResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static ResolveInteractiveContextResponse parseFrom(phc phcVar, uz00 uz00Var) {
        return (ResolveInteractiveContextResponse) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static ResolveInteractiveContextResponse parseFrom(byte[] bArr) {
        return (ResolveInteractiveContextResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ResolveInteractiveContextResponse parseFrom(byte[] bArr, uz00 uz00Var) {
        return (ResolveInteractiveContextResponse) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static ResolveInteractiveContextResponse parseFrom(InputStream inputStream) {
        return (ResolveInteractiveContextResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResolveInteractiveContextResponse parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (ResolveInteractiveContextResponse) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ResolveInteractiveContextResponse parseFrom(lwg lwgVar) {
        return (ResolveInteractiveContextResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static ResolveInteractiveContextResponse parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (ResolveInteractiveContextResponse) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
