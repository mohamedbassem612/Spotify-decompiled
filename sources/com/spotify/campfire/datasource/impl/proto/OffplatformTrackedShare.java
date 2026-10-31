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
public final class OffplatformTrackedShare extends h implements OffplatformTrackedShareOrBuilder {
    private static final OffplatformTrackedShare DEFAULT_INSTANCE;
    public static final int DESTINATION_FIELD_NUMBER = 3;
    public static final int OFFPLATFORM_SHARE_SOURCE_FIELD_NUMBER = 6;
    public static final int OPENING_USER_ID_FIELD_NUMBER = 5;
    public static final int OP_SHARE_ID_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SHARING_USER_ID_FIELD_NUMBER = 4;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private int offplatformShareSource_;
    private String opShareId_ = "";
    private String uri_ = "";
    private String destination_ = "";
    private String sharingUserId_ = "";
    private String openingUserId_ = "";

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShare$1, reason: invalid class name */
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
        OffplatformTrackedShare offplatformTrackedShare = new OffplatformTrackedShare();
        DEFAULT_INSTANCE = offplatformTrackedShare;
        h.registerDefaultInstance(OffplatformTrackedShare.class, offplatformTrackedShare);
    }

    private OffplatformTrackedShare() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestination() {
        this.destination_ = getDefaultInstance().getDestination();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOffplatformShareSource() {
        this.bitField0_ &= -2;
        this.offplatformShareSource_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOpShareId() {
        this.opShareId_ = getDefaultInstance().getOpShareId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOpeningUserId() {
        this.openingUserId_ = getDefaultInstance().getOpeningUserId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSharingUserId() {
        this.sharingUserId_ = getDefaultInstance().getSharingUserId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.uri_ = getDefaultInstance().getUri();
    }

    public static OffplatformTrackedShare getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static OffplatformTrackedShare parseDelimitedFrom(InputStream inputStream) {
        return (OffplatformTrackedShare) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OffplatformTrackedShare parseFrom(ByteBuffer byteBuffer) {
        return (OffplatformTrackedShare) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestination(String str) {
        str.getClass();
        this.destination_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.destination_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOffplatformShareSource(OffplatformShareSource offplatformShareSource) {
        this.offplatformShareSource_ = offplatformShareSource.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOffplatformShareSourceValue(int i) {
        this.bitField0_ |= 1;
        this.offplatformShareSource_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpShareId(String str) {
        str.getClass();
        this.opShareId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpShareIdBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.opShareId_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpeningUserId(String str) {
        str.getClass();
        this.openingUserId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpeningUserIdBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.openingUserId_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSharingUserId(String str) {
        str.getClass();
        this.sharingUserId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSharingUserIdBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.sharingUserId_ = phcVar.v();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006ဌ\u0000", new Object[]{"bitField0_", "uri_", "opShareId_", "destination_", "sharingUserId_", "openingUserId_", "offplatformShareSource_"});
        }
        if (iOrdinal == 3) {
            return new OffplatformTrackedShare();
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
        synchronized (OffplatformTrackedShare.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
    public String getDestination() {
        return this.destination_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
    public phc getDestinationBytes() {
        return phc.i(this.destination_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
    public OffplatformShareSource getOffplatformShareSource() {
        OffplatformShareSource offplatformShareSourceForNumber = OffplatformShareSource.forNumber(this.offplatformShareSource_);
        return offplatformShareSourceForNumber == null ? OffplatformShareSource.UNRECOGNIZED : offplatformShareSourceForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
    public int getOffplatformShareSourceValue() {
        return this.offplatformShareSource_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
    public String getOpShareId() {
        return this.opShareId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
    public phc getOpShareIdBytes() {
        return phc.i(this.opShareId_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
    public String getOpeningUserId() {
        return this.openingUserId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
    public phc getOpeningUserIdBytes() {
        return phc.i(this.openingUserId_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
    public String getSharingUserId() {
        return this.sharingUserId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
    public phc getSharingUserIdBytes() {
        return phc.i(this.sharingUserId_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
    public String getUri() {
        return this.uri_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
    public phc getUriBytes() {
        return phc.i(this.uri_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
    public boolean hasOffplatformShareSource() {
        return (this.bitField0_ & 1) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements OffplatformTrackedShareOrBuilder {
        private Builder() {
            super(OffplatformTrackedShare.DEFAULT_INSTANCE);
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

        public Builder clearDestination() {
            copyOnWrite();
            ((OffplatformTrackedShare) ((g) this).instance).clearDestination();
            return this;
        }

        public Builder clearOffplatformShareSource() {
            copyOnWrite();
            ((OffplatformTrackedShare) ((g) this).instance).clearOffplatformShareSource();
            return this;
        }

        public Builder clearOpShareId() {
            copyOnWrite();
            ((OffplatformTrackedShare) ((g) this).instance).clearOpShareId();
            return this;
        }

        public Builder clearOpeningUserId() {
            copyOnWrite();
            ((OffplatformTrackedShare) ((g) this).instance).clearOpeningUserId();
            return this;
        }

        public Builder clearSharingUserId() {
            copyOnWrite();
            ((OffplatformTrackedShare) ((g) this).instance).clearSharingUserId();
            return this;
        }

        public Builder clearUri() {
            copyOnWrite();
            ((OffplatformTrackedShare) ((g) this).instance).clearUri();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
        public String getDestination() {
            return ((OffplatformTrackedShare) ((g) this).instance).getDestination();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
        public phc getDestinationBytes() {
            return ((OffplatformTrackedShare) ((g) this).instance).getDestinationBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
        public OffplatformShareSource getOffplatformShareSource() {
            return ((OffplatformTrackedShare) ((g) this).instance).getOffplatformShareSource();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
        public int getOffplatformShareSourceValue() {
            return ((OffplatformTrackedShare) ((g) this).instance).getOffplatformShareSourceValue();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
        public String getOpShareId() {
            return ((OffplatformTrackedShare) ((g) this).instance).getOpShareId();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
        public phc getOpShareIdBytes() {
            return ((OffplatformTrackedShare) ((g) this).instance).getOpShareIdBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
        public String getOpeningUserId() {
            return ((OffplatformTrackedShare) ((g) this).instance).getOpeningUserId();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
        public phc getOpeningUserIdBytes() {
            return ((OffplatformTrackedShare) ((g) this).instance).getOpeningUserIdBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
        public String getSharingUserId() {
            return ((OffplatformTrackedShare) ((g) this).instance).getSharingUserId();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
        public phc getSharingUserIdBytes() {
            return ((OffplatformTrackedShare) ((g) this).instance).getSharingUserIdBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
        public String getUri() {
            return ((OffplatformTrackedShare) ((g) this).instance).getUri();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
        public phc getUriBytes() {
            return ((OffplatformTrackedShare) ((g) this).instance).getUriBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.OffplatformTrackedShareOrBuilder
        public boolean hasOffplatformShareSource() {
            return ((OffplatformTrackedShare) ((g) this).instance).hasOffplatformShareSource();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m565mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setDestination(String str) {
            copyOnWrite();
            ((OffplatformTrackedShare) ((g) this).instance).setDestination(str);
            return this;
        }

        public Builder setDestinationBytes(phc phcVar) {
            copyOnWrite();
            ((OffplatformTrackedShare) ((g) this).instance).setDestinationBytes(phcVar);
            return this;
        }

        public Builder setOffplatformShareSource(OffplatformShareSource offplatformShareSource) {
            copyOnWrite();
            ((OffplatformTrackedShare) ((g) this).instance).setOffplatformShareSource(offplatformShareSource);
            return this;
        }

        public Builder setOffplatformShareSourceValue(int i) {
            copyOnWrite();
            ((OffplatformTrackedShare) ((g) this).instance).setOffplatformShareSourceValue(i);
            return this;
        }

        public Builder setOpShareId(String str) {
            copyOnWrite();
            ((OffplatformTrackedShare) ((g) this).instance).setOpShareId(str);
            return this;
        }

        public Builder setOpShareIdBytes(phc phcVar) {
            copyOnWrite();
            ((OffplatformTrackedShare) ((g) this).instance).setOpShareIdBytes(phcVar);
            return this;
        }

        public Builder setOpeningUserId(String str) {
            copyOnWrite();
            ((OffplatformTrackedShare) ((g) this).instance).setOpeningUserId(str);
            return this;
        }

        public Builder setOpeningUserIdBytes(phc phcVar) {
            copyOnWrite();
            ((OffplatformTrackedShare) ((g) this).instance).setOpeningUserIdBytes(phcVar);
            return this;
        }

        public Builder setSharingUserId(String str) {
            copyOnWrite();
            ((OffplatformTrackedShare) ((g) this).instance).setSharingUserId(str);
            return this;
        }

        public Builder setSharingUserIdBytes(phc phcVar) {
            copyOnWrite();
            ((OffplatformTrackedShare) ((g) this).instance).setSharingUserIdBytes(phcVar);
            return this;
        }

        public Builder setUri(String str) {
            copyOnWrite();
            ((OffplatformTrackedShare) ((g) this).instance).setUri(str);
            return this;
        }

        public Builder setUriBytes(phc phcVar) {
            copyOnWrite();
            ((OffplatformTrackedShare) ((g) this).instance).setUriBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m564clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m566mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m563clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m567mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(OffplatformTrackedShare offplatformTrackedShare) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(offplatformTrackedShare);
    }

    public static OffplatformTrackedShare parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (OffplatformTrackedShare) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static OffplatformTrackedShare parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (OffplatformTrackedShare) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static OffplatformTrackedShare parseFrom(phc phcVar) {
        return (OffplatformTrackedShare) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static OffplatformTrackedShare parseFrom(phc phcVar, uz00 uz00Var) {
        return (OffplatformTrackedShare) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static OffplatformTrackedShare parseFrom(byte[] bArr) {
        return (OffplatformTrackedShare) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OffplatformTrackedShare parseFrom(byte[] bArr, uz00 uz00Var) {
        return (OffplatformTrackedShare) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static OffplatformTrackedShare parseFrom(InputStream inputStream) {
        return (OffplatformTrackedShare) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OffplatformTrackedShare parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (OffplatformTrackedShare) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static OffplatformTrackedShare parseFrom(lwg lwgVar) {
        return (OffplatformTrackedShare) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static OffplatformTrackedShare parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (OffplatformTrackedShare) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
