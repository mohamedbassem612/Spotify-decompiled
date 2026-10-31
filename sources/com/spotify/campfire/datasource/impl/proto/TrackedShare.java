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
public final class TrackedShare extends h implements TrackedShareOrBuilder {
    public static final int CONTEXT_FIELD_NUMBER = 3;
    private static final TrackedShare DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PREVIEW_ID_FIELD_NUMBER = 2;
    public static final int SHARE_CARD_CONFIG_ID_FIELD_NUMBER = 4;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private TrackedShareContext context_;
    private String uri_ = "";
    private String previewId_ = "";
    private String shareCardConfigId_ = "";

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.TrackedShare$1, reason: invalid class name */
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
        TrackedShare trackedShare = new TrackedShare();
        DEFAULT_INSTANCE = trackedShare;
        h.registerDefaultInstance(TrackedShare.class, trackedShare);
    }

    private TrackedShare() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContext() {
        this.context_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreviewId() {
        this.previewId_ = getDefaultInstance().getPreviewId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareCardConfigId() {
        this.shareCardConfigId_ = getDefaultInstance().getShareCardConfigId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.uri_ = getDefaultInstance().getUri();
    }

    public static TrackedShare getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeContext(TrackedShareContext trackedShareContext) {
        trackedShareContext.getClass();
        TrackedShareContext trackedShareContext2 = this.context_;
        if (trackedShareContext2 == null || trackedShareContext2 == TrackedShareContext.getDefaultInstance()) {
            this.context_ = trackedShareContext;
        } else {
            this.context_ = (TrackedShareContext) ((TrackedShareContext.Builder) TrackedShareContext.newBuilder(this.context_).mergeFrom(trackedShareContext)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TrackedShare parseDelimitedFrom(InputStream inputStream) {
        return (TrackedShare) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrackedShare parseFrom(ByteBuffer byteBuffer) {
        return (TrackedShare) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContext(TrackedShareContext trackedShareContext) {
        trackedShareContext.getClass();
        this.context_ = trackedShareContext;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviewId(String str) {
        str.getClass();
        this.previewId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviewIdBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.previewId_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareCardConfigId(String str) {
        str.getClass();
        this.shareCardConfigId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareCardConfigIdBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.shareCardConfigId_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUri(String str) {
        str.getClass();
        this.uri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUriBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.uri_ = phcVar.v();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004Ȉ", new Object[]{"bitField0_", "uri_", "previewId_", "context_", "shareCardConfigId_"});
        }
        if (iOrdinal == 3) {
            return new TrackedShare();
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
        synchronized (TrackedShare.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareOrBuilder
    public TrackedShareContext getContext() {
        TrackedShareContext trackedShareContext = this.context_;
        return trackedShareContext == null ? TrackedShareContext.getDefaultInstance() : trackedShareContext;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareOrBuilder
    public String getPreviewId() {
        return this.previewId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareOrBuilder
    public phc getPreviewIdBytes() {
        return phc.i(this.previewId_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareOrBuilder
    public String getShareCardConfigId() {
        return this.shareCardConfigId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareOrBuilder
    public phc getShareCardConfigIdBytes() {
        return phc.i(this.shareCardConfigId_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareOrBuilder
    public String getUri() {
        return this.uri_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareOrBuilder
    public phc getUriBytes() {
        return phc.i(this.uri_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareOrBuilder
    public boolean hasContext() {
        return (this.bitField0_ & 1) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements TrackedShareOrBuilder {
        private Builder() {
            super(TrackedShare.DEFAULT_INSTANCE);
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

        public Builder clearContext() {
            copyOnWrite();
            ((TrackedShare) ((g) this).instance).clearContext();
            return this;
        }

        public Builder clearPreviewId() {
            copyOnWrite();
            ((TrackedShare) ((g) this).instance).clearPreviewId();
            return this;
        }

        public Builder clearShareCardConfigId() {
            copyOnWrite();
            ((TrackedShare) ((g) this).instance).clearShareCardConfigId();
            return this;
        }

        public Builder clearUri() {
            copyOnWrite();
            ((TrackedShare) ((g) this).instance).clearUri();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareOrBuilder
        public TrackedShareContext getContext() {
            return ((TrackedShare) ((g) this).instance).getContext();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareOrBuilder
        public String getPreviewId() {
            return ((TrackedShare) ((g) this).instance).getPreviewId();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareOrBuilder
        public phc getPreviewIdBytes() {
            return ((TrackedShare) ((g) this).instance).getPreviewIdBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareOrBuilder
        public String getShareCardConfigId() {
            return ((TrackedShare) ((g) this).instance).getShareCardConfigId();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareOrBuilder
        public phc getShareCardConfigIdBytes() {
            return ((TrackedShare) ((g) this).instance).getShareCardConfigIdBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareOrBuilder
        public String getUri() {
            return ((TrackedShare) ((g) this).instance).getUri();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareOrBuilder
        public phc getUriBytes() {
            return ((TrackedShare) ((g) this).instance).getUriBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareOrBuilder
        public boolean hasContext() {
            return ((TrackedShare) ((g) this).instance).hasContext();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        public Builder mergeContext(TrackedShareContext trackedShareContext) {
            copyOnWrite();
            ((TrackedShare) ((g) this).instance).mergeContext(trackedShareContext);
            return this;
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m745mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setContext(TrackedShareContext.Builder builder) {
            copyOnWrite();
            ((TrackedShare) ((g) this).instance).setContext((TrackedShareContext) builder.build());
            return this;
        }

        public Builder setPreviewId(String str) {
            copyOnWrite();
            ((TrackedShare) ((g) this).instance).setPreviewId(str);
            return this;
        }

        public Builder setPreviewIdBytes(phc phcVar) {
            copyOnWrite();
            ((TrackedShare) ((g) this).instance).setPreviewIdBytes(phcVar);
            return this;
        }

        public Builder setShareCardConfigId(String str) {
            copyOnWrite();
            ((TrackedShare) ((g) this).instance).setShareCardConfigId(str);
            return this;
        }

        public Builder setShareCardConfigIdBytes(phc phcVar) {
            copyOnWrite();
            ((TrackedShare) ((g) this).instance).setShareCardConfigIdBytes(phcVar);
            return this;
        }

        public Builder setUri(String str) {
            copyOnWrite();
            ((TrackedShare) ((g) this).instance).setUri(str);
            return this;
        }

        public Builder setUriBytes(phc phcVar) {
            copyOnWrite();
            ((TrackedShare) ((g) this).instance).setUriBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m744clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m746mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m743clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m747mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder setContext(TrackedShareContext trackedShareContext) {
            copyOnWrite();
            ((TrackedShare) ((g) this).instance).setContext(trackedShareContext);
            return this;
        }
    }

    public static Builder newBuilder(TrackedShare trackedShare) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(trackedShare);
    }

    public static TrackedShare parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (TrackedShare) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static TrackedShare parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (TrackedShare) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static TrackedShare parseFrom(phc phcVar) {
        return (TrackedShare) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static TrackedShare parseFrom(phc phcVar, uz00 uz00Var) {
        return (TrackedShare) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static TrackedShare parseFrom(byte[] bArr) {
        return (TrackedShare) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TrackedShare parseFrom(byte[] bArr, uz00 uz00Var) {
        return (TrackedShare) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static TrackedShare parseFrom(InputStream inputStream) {
        return (TrackedShare) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrackedShare parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (TrackedShare) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static TrackedShare parseFrom(lwg lwgVar) {
        return (TrackedShare) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static TrackedShare parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (TrackedShare) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
