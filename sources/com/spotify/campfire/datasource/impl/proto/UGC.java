package com.spotify.campfire.datasource.impl.proto;

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
import p.lwg;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.r8;
import p.s2j0;
import p.s8;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class UGC extends h implements UGCOrBuilder {
    private static final UGC DEFAULT_INSTANCE;
    public static final int IMAGE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int VIDEO_FIELD_NUMBER = 2;
    private h290 image_ = h.emptyProtobufList();
    private h290 video_ = h.emptyProtobufList();

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.UGC$1, reason: invalid class name */
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
        UGC ugc = new UGC();
        DEFAULT_INSTANCE = ugc;
        h.registerDefaultInstance(UGC.class, ugc);
    }

    private UGC() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllImage(Iterable<? extends Asset> iterable) {
        ensureImageIsMutable();
        s8.addAll(iterable, this.image_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllVideo(Iterable<? extends Asset> iterable) {
        ensureVideoIsMutable();
        s8.addAll(iterable, this.video_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addImage(Asset asset) {
        asset.getClass();
        ensureImageIsMutable();
        this.image_.add(asset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVideo(Asset asset) {
        asset.getClass();
        ensureVideoIsMutable();
        this.video_.add(asset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImage() {
        this.image_ = h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideo() {
        this.video_ = h.emptyProtobufList();
    }

    private void ensureImageIsMutable() {
        i9 i9Var = this.image_;
        if (i9Var.a) {
            return;
        }
        this.image_ = h.mutableCopy(i9Var);
    }

    private void ensureVideoIsMutable() {
        i9 i9Var = this.video_;
        if (i9Var.a) {
            return;
        }
        this.video_ = h.mutableCopy(i9Var);
    }

    public static UGC getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static UGC parseDelimitedFrom(InputStream inputStream) {
        return (UGC) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UGC parseFrom(ByteBuffer byteBuffer) {
        return (UGC) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeImage(int i) {
        ensureImageIsMutable();
        this.image_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeVideo(int i) {
        ensureVideoIsMutable();
        this.video_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImage(int i, Asset asset) {
        asset.getClass();
        ensureImageIsMutable();
        this.image_.set(i, asset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideo(int i, Asset asset) {
        asset.getClass();
        ensureVideoIsMutable();
        this.video_.set(i, asset);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"image_", Asset.class, "video_", Asset.class});
        }
        if (iOrdinal == 3) {
            return new UGC();
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
        synchronized (UGC.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.UGCOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.UGCOrBuilder
    public Asset getImage(int i) {
        return (Asset) this.image_.get(i);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.UGCOrBuilder
    public int getImageCount() {
        return this.image_.size();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.UGCOrBuilder
    public List<Asset> getImageList() {
        return this.image_;
    }

    public AssetOrBuilder getImageOrBuilder(int i) {
        return (AssetOrBuilder) this.image_.get(i);
    }

    public List<? extends AssetOrBuilder> getImageOrBuilderList() {
        return this.image_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.UGCOrBuilder
    public Asset getVideo(int i) {
        return (Asset) this.video_.get(i);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.UGCOrBuilder
    public int getVideoCount() {
        return this.video_.size();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.UGCOrBuilder
    public List<Asset> getVideoList() {
        return this.video_;
    }

    public AssetOrBuilder getVideoOrBuilder(int i) {
        return (AssetOrBuilder) this.video_.get(i);
    }

    public List<? extends AssetOrBuilder> getVideoOrBuilderList() {
        return this.video_;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements UGCOrBuilder {
        private Builder() {
            super(UGC.DEFAULT_INSTANCE);
        }

        public Builder addAllImage(Iterable<? extends Asset> iterable) {
            copyOnWrite();
            ((UGC) ((g) this).instance).addAllImage(iterable);
            return this;
        }

        public Builder addAllVideo(Iterable<? extends Asset> iterable) {
            copyOnWrite();
            ((UGC) ((g) this).instance).addAllVideo(iterable);
            return this;
        }

        public Builder addImage(Asset.Builder builder) {
            copyOnWrite();
            ((UGC) ((g) this).instance).addImage((Asset) builder.build());
            return this;
        }

        public Builder addVideo(Asset.Builder builder) {
            copyOnWrite();
            ((UGC) ((g) this).instance).addVideo((Asset) builder.build());
            return this;
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

        public Builder clearImage() {
            copyOnWrite();
            ((UGC) ((g) this).instance).clearImage();
            return this;
        }

        public Builder clearVideo() {
            copyOnWrite();
            ((UGC) ((g) this).instance).clearVideo();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.UGCOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.UGCOrBuilder
        public Asset getImage(int i) {
            return ((UGC) ((g) this).instance).getImage(i);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.UGCOrBuilder
        public int getImageCount() {
            return ((UGC) ((g) this).instance).getImageCount();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.UGCOrBuilder
        public List<Asset> getImageList() {
            return Collections.unmodifiableList(((UGC) ((g) this).instance).getImageList());
        }

        @Override // com.spotify.campfire.datasource.impl.proto.UGCOrBuilder
        public Asset getVideo(int i) {
            return ((UGC) ((g) this).instance).getVideo(i);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.UGCOrBuilder
        public int getVideoCount() {
            return ((UGC) ((g) this).instance).getVideoCount();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.UGCOrBuilder
        public List<Asset> getVideoList() {
            return Collections.unmodifiableList(((UGC) ((g) this).instance).getVideoList());
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m755mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder removeImage(int i) {
            copyOnWrite();
            ((UGC) ((g) this).instance).removeImage(i);
            return this;
        }

        public Builder removeVideo(int i) {
            copyOnWrite();
            ((UGC) ((g) this).instance).removeVideo(i);
            return this;
        }

        public Builder setImage(int i, Asset.Builder builder) {
            copyOnWrite();
            ((UGC) ((g) this).instance).setImage(i, (Asset) builder.build());
            return this;
        }

        public Builder setVideo(int i, Asset.Builder builder) {
            copyOnWrite();
            ((UGC) ((g) this).instance).setVideo(i, (Asset) builder.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m754clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m756mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m753clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m757mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder addImage(int i, Asset asset) {
            copyOnWrite();
            ((UGC) ((g) this).instance).addImage(i, asset);
            return this;
        }

        public Builder addVideo(int i, Asset asset) {
            copyOnWrite();
            ((UGC) ((g) this).instance).addVideo(i, asset);
            return this;
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(bArr, uz00Var);
        }

        public Builder setImage(int i, Asset asset) {
            copyOnWrite();
            ((UGC) ((g) this).instance).setImage(i, asset);
            return this;
        }

        public Builder setVideo(int i, Asset asset) {
            copyOnWrite();
            ((UGC) ((g) this).instance).setVideo(i, asset);
            return this;
        }

        public Builder addImage(Asset asset) {
            copyOnWrite();
            ((UGC) ((g) this).instance).addImage(asset);
            return this;
        }

        public Builder addVideo(Asset asset) {
            copyOnWrite();
            ((UGC) ((g) this).instance).addVideo(asset);
            return this;
        }

        public Builder addImage(int i, Asset.Builder builder) {
            copyOnWrite();
            ((UGC) ((g) this).instance).addImage(i, (Asset) builder.build());
            return this;
        }

        public Builder addVideo(int i, Asset.Builder builder) {
            copyOnWrite();
            ((UGC) ((g) this).instance).addVideo(i, (Asset) builder.build());
            return this;
        }
    }

    public static Builder newBuilder(UGC ugc) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(ugc);
    }

    public static UGC parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (UGC) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static UGC parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (UGC) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static UGC parseFrom(phc phcVar) {
        return (UGC) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static UGC parseFrom(phc phcVar, uz00 uz00Var) {
        return (UGC) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addImage(int i, Asset asset) {
        asset.getClass();
        ensureImageIsMutable();
        this.image_.add(i, asset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVideo(int i, Asset asset) {
        asset.getClass();
        ensureVideoIsMutable();
        this.video_.add(i, asset);
    }

    public static UGC parseFrom(byte[] bArr) {
        return (UGC) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UGC parseFrom(byte[] bArr, uz00 uz00Var) {
        return (UGC) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static UGC parseFrom(InputStream inputStream) {
        return (UGC) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UGC parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (UGC) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static UGC parseFrom(lwg lwgVar) {
        return (UGC) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static UGC parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (UGC) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
