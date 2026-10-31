package com.spotify.kidsview.v1.proto;

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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ManagedAccountProfile extends h implements ManagedAccountProfileOrBuilder {
    public static final int COLOR_FIELD_NUMBER = 3;
    private static final ManagedAccountProfile DEFAULT_INSTANCE;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 1;
    public static final int IMAGE_URL_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private int color_;
    private String displayName_ = "";
    private String imageUrl_ = "";

    /* JADX INFO: renamed from: com.spotify.kidsview.v1.proto.ManagedAccountProfile$1, reason: invalid class name */
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
        ManagedAccountProfile managedAccountProfile = new ManagedAccountProfile();
        DEFAULT_INSTANCE = managedAccountProfile;
        h.registerDefaultInstance(ManagedAccountProfile.class, managedAccountProfile);
    }

    private ManagedAccountProfile() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearColor() {
        this.bitField0_ &= -3;
        this.color_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayName() {
        this.displayName_ = getDefaultInstance().getDisplayName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageUrl() {
        this.bitField0_ &= -2;
        this.imageUrl_ = getDefaultInstance().getImageUrl();
    }

    public static ManagedAccountProfile getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ManagedAccountProfile parseDelimitedFrom(InputStream inputStream) {
        return (ManagedAccountProfile) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ManagedAccountProfile parseFrom(ByteBuffer byteBuffer) {
        return (ManagedAccountProfile) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColor(int i) {
        this.bitField0_ |= 2;
        this.color_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayName(String str) {
        str.getClass();
        this.displayName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayNameBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.displayName_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageUrl(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.imageUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageUrlBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.imageUrl_ = phcVar.v();
        this.bitField0_ |= 1;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003င\u0001", new Object[]{"bitField0_", "displayName_", "imageUrl_", "color_"});
        }
        if (iOrdinal == 3) {
            return new ManagedAccountProfile();
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
        synchronized (ManagedAccountProfile.class) {
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

    @Override // com.spotify.kidsview.v1.proto.ManagedAccountProfileOrBuilder
    public int getColor() {
        return this.color_;
    }

    @Override // com.spotify.kidsview.v1.proto.ManagedAccountProfileOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.kidsview.v1.proto.ManagedAccountProfileOrBuilder
    public String getDisplayName() {
        return this.displayName_;
    }

    @Override // com.spotify.kidsview.v1.proto.ManagedAccountProfileOrBuilder
    public phc getDisplayNameBytes() {
        return phc.i(this.displayName_);
    }

    @Override // com.spotify.kidsview.v1.proto.ManagedAccountProfileOrBuilder
    public String getImageUrl() {
        return this.imageUrl_;
    }

    @Override // com.spotify.kidsview.v1.proto.ManagedAccountProfileOrBuilder
    public phc getImageUrlBytes() {
        return phc.i(this.imageUrl_);
    }

    @Override // com.spotify.kidsview.v1.proto.ManagedAccountProfileOrBuilder
    public boolean hasColor() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.kidsview.v1.proto.ManagedAccountProfileOrBuilder
    public boolean hasImageUrl() {
        return (this.bitField0_ & 1) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements ManagedAccountProfileOrBuilder {
        private Builder() {
            super(ManagedAccountProfile.DEFAULT_INSTANCE);
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

        public Builder clearColor() {
            copyOnWrite();
            ((ManagedAccountProfile) ((g) this).instance).clearColor();
            return this;
        }

        public Builder clearDisplayName() {
            copyOnWrite();
            ((ManagedAccountProfile) ((g) this).instance).clearDisplayName();
            return this;
        }

        public Builder clearImageUrl() {
            copyOnWrite();
            ((ManagedAccountProfile) ((g) this).instance).clearImageUrl();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.kidsview.v1.proto.ManagedAccountProfileOrBuilder
        public int getColor() {
            return ((ManagedAccountProfile) ((g) this).instance).getColor();
        }

        @Override // com.spotify.kidsview.v1.proto.ManagedAccountProfileOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.kidsview.v1.proto.ManagedAccountProfileOrBuilder
        public String getDisplayName() {
            return ((ManagedAccountProfile) ((g) this).instance).getDisplayName();
        }

        @Override // com.spotify.kidsview.v1.proto.ManagedAccountProfileOrBuilder
        public phc getDisplayNameBytes() {
            return ((ManagedAccountProfile) ((g) this).instance).getDisplayNameBytes();
        }

        @Override // com.spotify.kidsview.v1.proto.ManagedAccountProfileOrBuilder
        public String getImageUrl() {
            return ((ManagedAccountProfile) ((g) this).instance).getImageUrl();
        }

        @Override // com.spotify.kidsview.v1.proto.ManagedAccountProfileOrBuilder
        public phc getImageUrlBytes() {
            return ((ManagedAccountProfile) ((g) this).instance).getImageUrlBytes();
        }

        @Override // com.spotify.kidsview.v1.proto.ManagedAccountProfileOrBuilder
        public boolean hasColor() {
            return ((ManagedAccountProfile) ((g) this).instance).hasColor();
        }

        @Override // com.spotify.kidsview.v1.proto.ManagedAccountProfileOrBuilder
        public boolean hasImageUrl() {
            return ((ManagedAccountProfile) ((g) this).instance).hasImageUrl();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m123mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setColor(int i) {
            copyOnWrite();
            ((ManagedAccountProfile) ((g) this).instance).setColor(i);
            return this;
        }

        public Builder setDisplayName(String str) {
            copyOnWrite();
            ((ManagedAccountProfile) ((g) this).instance).setDisplayName(str);
            return this;
        }

        public Builder setDisplayNameBytes(phc phcVar) {
            copyOnWrite();
            ((ManagedAccountProfile) ((g) this).instance).setDisplayNameBytes(phcVar);
            return this;
        }

        public Builder setImageUrl(String str) {
            copyOnWrite();
            ((ManagedAccountProfile) ((g) this).instance).setImageUrl(str);
            return this;
        }

        public Builder setImageUrlBytes(phc phcVar) {
            copyOnWrite();
            ((ManagedAccountProfile) ((g) this).instance).setImageUrlBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m122clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m124mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m121clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m125mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(ManagedAccountProfile managedAccountProfile) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(managedAccountProfile);
    }

    public static ManagedAccountProfile parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (ManagedAccountProfile) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ManagedAccountProfile parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (ManagedAccountProfile) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static ManagedAccountProfile parseFrom(phc phcVar) {
        return (ManagedAccountProfile) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static ManagedAccountProfile parseFrom(phc phcVar, uz00 uz00Var) {
        return (ManagedAccountProfile) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static ManagedAccountProfile parseFrom(byte[] bArr) {
        return (ManagedAccountProfile) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ManagedAccountProfile parseFrom(byte[] bArr, uz00 uz00Var) {
        return (ManagedAccountProfile) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static ManagedAccountProfile parseFrom(InputStream inputStream) {
        return (ManagedAccountProfile) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ManagedAccountProfile parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (ManagedAccountProfile) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ManagedAccountProfile parseFrom(lwg lwgVar) {
        return (ManagedAccountProfile) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static ManagedAccountProfile parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (ManagedAccountProfile) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
