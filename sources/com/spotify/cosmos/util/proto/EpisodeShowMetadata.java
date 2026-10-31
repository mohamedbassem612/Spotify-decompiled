package com.spotify.cosmos.util.proto;

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
public final class EpisodeShowMetadata extends h implements EpisodeShowMetadataOrBuilder {
    public static final int COVERS_FIELD_NUMBER = 4;
    private static final EpisodeShowMetadata DEFAULT_INSTANCE;
    public static final int LINK_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PUBLISHER_FIELD_NUMBER = 3;
    private int bitField0_;
    private ImageGroup covers_;
    private String link_ = "";
    private String name_ = "";
    private String publisher_ = "";

    /* JADX INFO: renamed from: com.spotify.cosmos.util.proto.EpisodeShowMetadata$1, reason: invalid class name */
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
        EpisodeShowMetadata episodeShowMetadata = new EpisodeShowMetadata();
        DEFAULT_INSTANCE = episodeShowMetadata;
        h.registerDefaultInstance(EpisodeShowMetadata.class, episodeShowMetadata);
    }

    private EpisodeShowMetadata() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCovers() {
        this.covers_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLink() {
        this.bitField0_ &= -2;
        this.link_ = getDefaultInstance().getLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -3;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublisher() {
        this.bitField0_ &= -5;
        this.publisher_ = getDefaultInstance().getPublisher();
    }

    public static EpisodeShowMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCovers(ImageGroup imageGroup) {
        imageGroup.getClass();
        ImageGroup imageGroup2 = this.covers_;
        if (imageGroup2 == null || imageGroup2 == ImageGroup.getDefaultInstance()) {
            this.covers_ = imageGroup;
        } else {
            this.covers_ = ImageGroup.newBuilder(this.covers_).mergeFrom(imageGroup).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static EpisodeShowMetadata parseDelimitedFrom(InputStream inputStream) {
        return (EpisodeShowMetadata) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodeShowMetadata parseFrom(ByteBuffer byteBuffer) {
        return (EpisodeShowMetadata) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCovers(ImageGroup imageGroup) {
        imageGroup.getClass();
        this.covers_ = imageGroup;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLink(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.link_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkBytes(phc phcVar) {
        this.link_ = phcVar.v();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(phc phcVar) {
        this.name_ = phcVar.v();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublisher(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.publisher_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublisherBytes(phc phcVar) {
        this.publisher_ = phcVar.v();
        this.bitField0_ |= 4;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "link_", "name_", "publisher_", "covers_"});
        }
        if (iOrdinal == 3) {
            return new EpisodeShowMetadata();
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
        synchronized (EpisodeShowMetadata.class) {
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

    @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
    public ImageGroup getCovers() {
        ImageGroup imageGroup = this.covers_;
        return imageGroup == null ? ImageGroup.getDefaultInstance() : imageGroup;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
    public String getLink() {
        return this.link_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
    public phc getLinkBytes() {
        return phc.i(this.link_);
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
    public phc getNameBytes() {
        return phc.i(this.name_);
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
    public String getPublisher() {
        return this.publisher_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
    public phc getPublisherBytes() {
        return phc.i(this.publisher_);
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
    public boolean hasCovers() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
    public boolean hasLink() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
    public boolean hasName() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
    public boolean hasPublisher() {
        return (this.bitField0_ & 4) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements EpisodeShowMetadataOrBuilder {
        private Builder() {
            super(EpisodeShowMetadata.DEFAULT_INSTANCE);
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

        public Builder clearCovers() {
            copyOnWrite();
            ((EpisodeShowMetadata) ((g) this).instance).clearCovers();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((EpisodeShowMetadata) ((g) this).instance).clearLink();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((EpisodeShowMetadata) ((g) this).instance).clearName();
            return this;
        }

        public Builder clearPublisher() {
            copyOnWrite();
            ((EpisodeShowMetadata) ((g) this).instance).clearPublisher();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
        public ImageGroup getCovers() {
            return ((EpisodeShowMetadata) ((g) this).instance).getCovers();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
        public String getLink() {
            return ((EpisodeShowMetadata) ((g) this).instance).getLink();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
        public phc getLinkBytes() {
            return ((EpisodeShowMetadata) ((g) this).instance).getLinkBytes();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
        public String getName() {
            return ((EpisodeShowMetadata) ((g) this).instance).getName();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
        public phc getNameBytes() {
            return ((EpisodeShowMetadata) ((g) this).instance).getNameBytes();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
        public String getPublisher() {
            return ((EpisodeShowMetadata) ((g) this).instance).getPublisher();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
        public phc getPublisherBytes() {
            return ((EpisodeShowMetadata) ((g) this).instance).getPublisherBytes();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
        public boolean hasCovers() {
            return ((EpisodeShowMetadata) ((g) this).instance).hasCovers();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
        public boolean hasLink() {
            return ((EpisodeShowMetadata) ((g) this).instance).hasLink();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
        public boolean hasName() {
            return ((EpisodeShowMetadata) ((g) this).instance).hasName();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeShowMetadataOrBuilder
        public boolean hasPublisher() {
            return ((EpisodeShowMetadata) ((g) this).instance).hasPublisher();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        public Builder mergeCovers(ImageGroup imageGroup) {
            copyOnWrite();
            ((EpisodeShowMetadata) ((g) this).instance).mergeCovers(imageGroup);
            return this;
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1436mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setCovers(ImageGroup.Builder builder) {
            copyOnWrite();
            ((EpisodeShowMetadata) ((g) this).instance).setCovers(builder.build());
            return this;
        }

        public Builder setLink(String str) {
            copyOnWrite();
            ((EpisodeShowMetadata) ((g) this).instance).setLink(str);
            return this;
        }

        public Builder setLinkBytes(phc phcVar) {
            copyOnWrite();
            ((EpisodeShowMetadata) ((g) this).instance).setLinkBytes(phcVar);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((EpisodeShowMetadata) ((g) this).instance).setName(str);
            return this;
        }

        public Builder setNameBytes(phc phcVar) {
            copyOnWrite();
            ((EpisodeShowMetadata) ((g) this).instance).setNameBytes(phcVar);
            return this;
        }

        public Builder setPublisher(String str) {
            copyOnWrite();
            ((EpisodeShowMetadata) ((g) this).instance).setPublisher(str);
            return this;
        }

        public Builder setPublisherBytes(phc phcVar) {
            copyOnWrite();
            ((EpisodeShowMetadata) ((g) this).instance).setPublisherBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1435clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1437mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m1434clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1438mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder setCovers(ImageGroup imageGroup) {
            copyOnWrite();
            ((EpisodeShowMetadata) ((g) this).instance).setCovers(imageGroup);
            return this;
        }
    }

    public static Builder newBuilder(EpisodeShowMetadata episodeShowMetadata) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(episodeShowMetadata);
    }

    public static EpisodeShowMetadata parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (EpisodeShowMetadata) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static EpisodeShowMetadata parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (EpisodeShowMetadata) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static EpisodeShowMetadata parseFrom(phc phcVar) {
        return (EpisodeShowMetadata) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static EpisodeShowMetadata parseFrom(phc phcVar, uz00 uz00Var) {
        return (EpisodeShowMetadata) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static EpisodeShowMetadata parseFrom(byte[] bArr) {
        return (EpisodeShowMetadata) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EpisodeShowMetadata parseFrom(byte[] bArr, uz00 uz00Var) {
        return (EpisodeShowMetadata) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static EpisodeShowMetadata parseFrom(InputStream inputStream) {
        return (EpisodeShowMetadata) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodeShowMetadata parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (EpisodeShowMetadata) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static EpisodeShowMetadata parseFrom(lwg lwgVar) {
        return (EpisodeShowMetadata) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static EpisodeShowMetadata parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (EpisodeShowMetadata) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
