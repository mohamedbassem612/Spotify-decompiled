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
public final class ArtistMetadata extends h implements ArtistMetadataOrBuilder {
    private static final ArtistMetadata DEFAULT_INSTANCE;
    public static final int IS_VARIOUS_ARTISTS_FIELD_NUMBER = 3;
    public static final int LINK_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PORTRAITS_FIELD_NUMBER = 4;
    private int bitField0_;
    private boolean isVariousArtists_;
    private String link_ = "";
    private String name_ = "";
    private ImageGroup portraits_;

    /* JADX INFO: renamed from: com.spotify.cosmos.util.proto.ArtistMetadata$1, reason: invalid class name */
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
        ArtistMetadata artistMetadata = new ArtistMetadata();
        DEFAULT_INSTANCE = artistMetadata;
        h.registerDefaultInstance(ArtistMetadata.class, artistMetadata);
    }

    private ArtistMetadata() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsVariousArtists() {
        this.bitField0_ &= -5;
        this.isVariousArtists_ = false;
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
    public void clearPortraits() {
        this.portraits_ = null;
        this.bitField0_ &= -9;
    }

    public static ArtistMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePortraits(ImageGroup imageGroup) {
        imageGroup.getClass();
        ImageGroup imageGroup2 = this.portraits_;
        if (imageGroup2 == null || imageGroup2 == ImageGroup.getDefaultInstance()) {
            this.portraits_ = imageGroup;
        } else {
            this.portraits_ = ImageGroup.newBuilder(this.portraits_).mergeFrom(imageGroup).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ArtistMetadata parseDelimitedFrom(InputStream inputStream) {
        return (ArtistMetadata) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArtistMetadata parseFrom(ByteBuffer byteBuffer) {
        return (ArtistMetadata) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsVariousArtists(boolean z) {
        this.bitField0_ |= 4;
        this.isVariousArtists_ = z;
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
    public void setPortraits(ImageGroup imageGroup) {
        imageGroup.getClass();
        this.portraits_ = imageGroup;
        this.bitField0_ |= 8;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "link_", "name_", "isVariousArtists_", "portraits_"});
        }
        if (iOrdinal == 3) {
            return new ArtistMetadata();
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
        synchronized (ArtistMetadata.class) {
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

    @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
    public boolean getIsVariousArtists() {
        return this.isVariousArtists_;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
    public String getLink() {
        return this.link_;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
    public phc getLinkBytes() {
        return phc.i(this.link_);
    }

    @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
    public phc getNameBytes() {
        return phc.i(this.name_);
    }

    @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
    public ImageGroup getPortraits() {
        ImageGroup imageGroup = this.portraits_;
        return imageGroup == null ? ImageGroup.getDefaultInstance() : imageGroup;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
    public boolean hasIsVariousArtists() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
    public boolean hasLink() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
    public boolean hasName() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
    public boolean hasPortraits() {
        return (this.bitField0_ & 8) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements ArtistMetadataOrBuilder {
        private Builder() {
            super(ArtistMetadata.DEFAULT_INSTANCE);
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

        public Builder clearIsVariousArtists() {
            copyOnWrite();
            ((ArtistMetadata) ((g) this).instance).clearIsVariousArtists();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((ArtistMetadata) ((g) this).instance).clearLink();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((ArtistMetadata) ((g) this).instance).clearName();
            return this;
        }

        public Builder clearPortraits() {
            copyOnWrite();
            ((ArtistMetadata) ((g) this).instance).clearPortraits();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
        public boolean getIsVariousArtists() {
            return ((ArtistMetadata) ((g) this).instance).getIsVariousArtists();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
        public String getLink() {
            return ((ArtistMetadata) ((g) this).instance).getLink();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
        public phc getLinkBytes() {
            return ((ArtistMetadata) ((g) this).instance).getLinkBytes();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
        public String getName() {
            return ((ArtistMetadata) ((g) this).instance).getName();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
        public phc getNameBytes() {
            return ((ArtistMetadata) ((g) this).instance).getNameBytes();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
        public ImageGroup getPortraits() {
            return ((ArtistMetadata) ((g) this).instance).getPortraits();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
        public boolean hasIsVariousArtists() {
            return ((ArtistMetadata) ((g) this).instance).hasIsVariousArtists();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
        public boolean hasLink() {
            return ((ArtistMetadata) ((g) this).instance).hasLink();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
        public boolean hasName() {
            return ((ArtistMetadata) ((g) this).instance).hasName();
        }

        @Override // com.spotify.cosmos.util.proto.ArtistMetadataOrBuilder
        public boolean hasPortraits() {
            return ((ArtistMetadata) ((g) this).instance).hasPortraits();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1405mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder mergePortraits(ImageGroup imageGroup) {
            copyOnWrite();
            ((ArtistMetadata) ((g) this).instance).mergePortraits(imageGroup);
            return this;
        }

        public Builder setIsVariousArtists(boolean z) {
            copyOnWrite();
            ((ArtistMetadata) ((g) this).instance).setIsVariousArtists(z);
            return this;
        }

        public Builder setLink(String str) {
            copyOnWrite();
            ((ArtistMetadata) ((g) this).instance).setLink(str);
            return this;
        }

        public Builder setLinkBytes(phc phcVar) {
            copyOnWrite();
            ((ArtistMetadata) ((g) this).instance).setLinkBytes(phcVar);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((ArtistMetadata) ((g) this).instance).setName(str);
            return this;
        }

        public Builder setNameBytes(phc phcVar) {
            copyOnWrite();
            ((ArtistMetadata) ((g) this).instance).setNameBytes(phcVar);
            return this;
        }

        public Builder setPortraits(ImageGroup.Builder builder) {
            copyOnWrite();
            ((ArtistMetadata) ((g) this).instance).setPortraits(builder.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1404clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1406mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m1403clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1407mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder setPortraits(ImageGroup imageGroup) {
            copyOnWrite();
            ((ArtistMetadata) ((g) this).instance).setPortraits(imageGroup);
            return this;
        }
    }

    public static Builder newBuilder(ArtistMetadata artistMetadata) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(artistMetadata);
    }

    public static ArtistMetadata parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (ArtistMetadata) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ArtistMetadata parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (ArtistMetadata) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static ArtistMetadata parseFrom(phc phcVar) {
        return (ArtistMetadata) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static ArtistMetadata parseFrom(phc phcVar, uz00 uz00Var) {
        return (ArtistMetadata) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static ArtistMetadata parseFrom(byte[] bArr) {
        return (ArtistMetadata) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ArtistMetadata parseFrom(byte[] bArr, uz00 uz00Var) {
        return (ArtistMetadata) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static ArtistMetadata parseFrom(InputStream inputStream) {
        return (ArtistMetadata) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArtistMetadata parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (ArtistMetadata) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ArtistMetadata parseFrom(lwg lwgVar) {
        return (ArtistMetadata) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static ArtistMetadata parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (ArtistMetadata) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
