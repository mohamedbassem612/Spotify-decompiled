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
public final class Asset extends h implements AssetOrBuilder {
    public static final int ASSET_REF_FIELD_NUMBER = 1;
    private static final Asset DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int THUMBNAIL_ASSET_REF_FIELD_NUMBER = 2;
    private String assetRef_ = "";
    private String thumbnailAssetRef_ = "";

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.Asset$1, reason: invalid class name */
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
        Asset asset = new Asset();
        DEFAULT_INSTANCE = asset;
        h.registerDefaultInstance(Asset.class, asset);
    }

    private Asset() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAssetRef() {
        this.assetRef_ = getDefaultInstance().getAssetRef();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearThumbnailAssetRef() {
        this.thumbnailAssetRef_ = getDefaultInstance().getThumbnailAssetRef();
    }

    public static Asset getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Asset parseDelimitedFrom(InputStream inputStream) {
        return (Asset) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Asset parseFrom(ByteBuffer byteBuffer) {
        return (Asset) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAssetRef(String str) {
        str.getClass();
        this.assetRef_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAssetRefBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.assetRef_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThumbnailAssetRef(String str) {
        str.getClass();
        this.thumbnailAssetRef_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThumbnailAssetRefBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.thumbnailAssetRef_ = phcVar.v();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"assetRef_", "thumbnailAssetRef_"});
        }
        if (iOrdinal == 3) {
            return new Asset();
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
        synchronized (Asset.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.AssetOrBuilder
    public String getAssetRef() {
        return this.assetRef_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AssetOrBuilder
    public phc getAssetRefBytes() {
        return phc.i(this.assetRef_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AssetOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AssetOrBuilder
    public String getThumbnailAssetRef() {
        return this.thumbnailAssetRef_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AssetOrBuilder
    public phc getThumbnailAssetRefBytes() {
        return phc.i(this.thumbnailAssetRef_);
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements AssetOrBuilder {
        private Builder() {
            super(Asset.DEFAULT_INSTANCE);
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

        public Builder clearAssetRef() {
            copyOnWrite();
            ((Asset) ((g) this).instance).clearAssetRef();
            return this;
        }

        public Builder clearThumbnailAssetRef() {
            copyOnWrite();
            ((Asset) ((g) this).instance).clearThumbnailAssetRef();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AssetOrBuilder
        public String getAssetRef() {
            return ((Asset) ((g) this).instance).getAssetRef();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AssetOrBuilder
        public phc getAssetRefBytes() {
            return ((Asset) ((g) this).instance).getAssetRefBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AssetOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AssetOrBuilder
        public String getThumbnailAssetRef() {
            return ((Asset) ((g) this).instance).getThumbnailAssetRef();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AssetOrBuilder
        public phc getThumbnailAssetRefBytes() {
            return ((Asset) ((g) this).instance).getThumbnailAssetRefBytes();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m64mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setAssetRef(String str) {
            copyOnWrite();
            ((Asset) ((g) this).instance).setAssetRef(str);
            return this;
        }

        public Builder setAssetRefBytes(phc phcVar) {
            copyOnWrite();
            ((Asset) ((g) this).instance).setAssetRefBytes(phcVar);
            return this;
        }

        public Builder setThumbnailAssetRef(String str) {
            copyOnWrite();
            ((Asset) ((g) this).instance).setThumbnailAssetRef(str);
            return this;
        }

        public Builder setThumbnailAssetRefBytes(phc phcVar) {
            copyOnWrite();
            ((Asset) ((g) this).instance).setThumbnailAssetRefBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m63clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m65mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m62clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m66mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(Asset asset) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(asset);
    }

    public static Asset parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (Asset) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static Asset parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (Asset) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static Asset parseFrom(phc phcVar) {
        return (Asset) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static Asset parseFrom(phc phcVar, uz00 uz00Var) {
        return (Asset) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static Asset parseFrom(byte[] bArr) {
        return (Asset) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Asset parseFrom(byte[] bArr, uz00 uz00Var) {
        return (Asset) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static Asset parseFrom(InputStream inputStream) {
        return (Asset) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Asset parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (Asset) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static Asset parseFrom(lwg lwgVar) {
        return (Asset) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static Asset parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (Asset) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
