package com.spotify.cosmos.util.proto;

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
public final class AlbumMetadata extends h implements AlbumMetadataOrBuilder {
    public static final int ARTISTS_FIELD_NUMBER = 1;
    public static final int COVERS_FIELD_NUMBER = 5;
    private static final AlbumMetadata DEFAULT_INSTANCE;
    public static final int LINK_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int YEAR_FIELD_NUMBER = 6;
    private int bitField0_;
    private ImageGroup covers_;
    private int year_;
    private h290 artists_ = h.emptyProtobufList();
    private String link_ = "";
    private String name_ = "";

    /* JADX INFO: renamed from: com.spotify.cosmos.util.proto.AlbumMetadata$1, reason: invalid class name */
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
        AlbumMetadata albumMetadata = new AlbumMetadata();
        DEFAULT_INSTANCE = albumMetadata;
        h.registerDefaultInstance(AlbumMetadata.class, albumMetadata);
    }

    private AlbumMetadata() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllArtists(Iterable<? extends AlbumArtistMetadata> iterable) {
        ensureArtistsIsMutable();
        s8.addAll(iterable, this.artists_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addArtists(AlbumArtistMetadata albumArtistMetadata) {
        albumArtistMetadata.getClass();
        ensureArtistsIsMutable();
        this.artists_.add(albumArtistMetadata);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArtists() {
        this.artists_ = h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCovers() {
        this.covers_ = null;
        this.bitField0_ &= -5;
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
    public void clearYear() {
        this.bitField0_ &= -9;
        this.year_ = 0;
    }

    private void ensureArtistsIsMutable() {
        i9 i9Var = this.artists_;
        if (i9Var.a) {
            return;
        }
        this.artists_ = h.mutableCopy(i9Var);
    }

    public static AlbumMetadata getDefaultInstance() {
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
        this.bitField0_ |= 4;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static AlbumMetadata parseDelimitedFrom(InputStream inputStream) {
        return (AlbumMetadata) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AlbumMetadata parseFrom(ByteBuffer byteBuffer) {
        return (AlbumMetadata) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeArtists(int i) {
        ensureArtistsIsMutable();
        this.artists_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArtists(int i, AlbumArtistMetadata albumArtistMetadata) {
        albumArtistMetadata.getClass();
        ensureArtistsIsMutable();
        this.artists_.set(i, albumArtistMetadata);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCovers(ImageGroup imageGroup) {
        imageGroup.getClass();
        this.covers_ = imageGroup;
        this.bitField0_ |= 4;
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
    public void setYear(int i) {
        this.bitField0_ |= 8;
        this.year_ = i;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဈ\u0001\u0005ဉ\u0002\u0006ဋ\u0003", new Object[]{"bitField0_", "artists_", AlbumArtistMetadata.class, "link_", "name_", "covers_", "year_"});
        }
        if (iOrdinal == 3) {
            return new AlbumMetadata();
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
        synchronized (AlbumMetadata.class) {
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

    @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
    public AlbumArtistMetadata getArtists(int i) {
        return (AlbumArtistMetadata) this.artists_.get(i);
    }

    @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
    public int getArtistsCount() {
        return this.artists_.size();
    }

    @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
    public List<AlbumArtistMetadata> getArtistsList() {
        return this.artists_;
    }

    public AlbumArtistMetadataOrBuilder getArtistsOrBuilder(int i) {
        return (AlbumArtistMetadataOrBuilder) this.artists_.get(i);
    }

    public List<? extends AlbumArtistMetadataOrBuilder> getArtistsOrBuilderList() {
        return this.artists_;
    }

    @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
    public ImageGroup getCovers() {
        ImageGroup imageGroup = this.covers_;
        return imageGroup == null ? ImageGroup.getDefaultInstance() : imageGroup;
    }

    @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
    public String getLink() {
        return this.link_;
    }

    @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
    public phc getLinkBytes() {
        return phc.i(this.link_);
    }

    @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
    public phc getNameBytes() {
        return phc.i(this.name_);
    }

    @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
    public int getYear() {
        return this.year_;
    }

    @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
    public boolean hasCovers() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
    public boolean hasLink() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
    public boolean hasName() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
    public boolean hasYear() {
        return (this.bitField0_ & 8) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements AlbumMetadataOrBuilder {
        private Builder() {
            super(AlbumMetadata.DEFAULT_INSTANCE);
        }

        public Builder addAllArtists(Iterable<? extends AlbumArtistMetadata> iterable) {
            copyOnWrite();
            ((AlbumMetadata) ((g) this).instance).addAllArtists(iterable);
            return this;
        }

        public Builder addArtists(AlbumArtistMetadata.Builder builder) {
            copyOnWrite();
            ((AlbumMetadata) ((g) this).instance).addArtists((AlbumArtistMetadata) builder.build());
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

        public Builder clearArtists() {
            copyOnWrite();
            ((AlbumMetadata) ((g) this).instance).clearArtists();
            return this;
        }

        public Builder clearCovers() {
            copyOnWrite();
            ((AlbumMetadata) ((g) this).instance).clearCovers();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((AlbumMetadata) ((g) this).instance).clearLink();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((AlbumMetadata) ((g) this).instance).clearName();
            return this;
        }

        public Builder clearYear() {
            copyOnWrite();
            ((AlbumMetadata) ((g) this).instance).clearYear();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
        public AlbumArtistMetadata getArtists(int i) {
            return ((AlbumMetadata) ((g) this).instance).getArtists(i);
        }

        @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
        public int getArtistsCount() {
            return ((AlbumMetadata) ((g) this).instance).getArtistsCount();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
        public List<AlbumArtistMetadata> getArtistsList() {
            return Collections.unmodifiableList(((AlbumMetadata) ((g) this).instance).getArtistsList());
        }

        @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
        public ImageGroup getCovers() {
            return ((AlbumMetadata) ((g) this).instance).getCovers();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
        public String getLink() {
            return ((AlbumMetadata) ((g) this).instance).getLink();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
        public phc getLinkBytes() {
            return ((AlbumMetadata) ((g) this).instance).getLinkBytes();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
        public String getName() {
            return ((AlbumMetadata) ((g) this).instance).getName();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
        public phc getNameBytes() {
            return ((AlbumMetadata) ((g) this).instance).getNameBytes();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
        public int getYear() {
            return ((AlbumMetadata) ((g) this).instance).getYear();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
        public boolean hasCovers() {
            return ((AlbumMetadata) ((g) this).instance).hasCovers();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
        public boolean hasLink() {
            return ((AlbumMetadata) ((g) this).instance).hasLink();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
        public boolean hasName() {
            return ((AlbumMetadata) ((g) this).instance).hasName();
        }

        @Override // com.spotify.cosmos.util.proto.AlbumMetadataOrBuilder
        public boolean hasYear() {
            return ((AlbumMetadata) ((g) this).instance).hasYear();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        public Builder mergeCovers(ImageGroup imageGroup) {
            copyOnWrite();
            ((AlbumMetadata) ((g) this).instance).mergeCovers(imageGroup);
            return this;
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1390mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder removeArtists(int i) {
            copyOnWrite();
            ((AlbumMetadata) ((g) this).instance).removeArtists(i);
            return this;
        }

        public Builder setArtists(int i, AlbumArtistMetadata.Builder builder) {
            copyOnWrite();
            ((AlbumMetadata) ((g) this).instance).setArtists(i, (AlbumArtistMetadata) builder.build());
            return this;
        }

        public Builder setCovers(ImageGroup.Builder builder) {
            copyOnWrite();
            ((AlbumMetadata) ((g) this).instance).setCovers(builder.build());
            return this;
        }

        public Builder setLink(String str) {
            copyOnWrite();
            ((AlbumMetadata) ((g) this).instance).setLink(str);
            return this;
        }

        public Builder setLinkBytes(phc phcVar) {
            copyOnWrite();
            ((AlbumMetadata) ((g) this).instance).setLinkBytes(phcVar);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((AlbumMetadata) ((g) this).instance).setName(str);
            return this;
        }

        public Builder setNameBytes(phc phcVar) {
            copyOnWrite();
            ((AlbumMetadata) ((g) this).instance).setNameBytes(phcVar);
            return this;
        }

        public Builder setYear(int i) {
            copyOnWrite();
            ((AlbumMetadata) ((g) this).instance).setYear(i);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1389clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1391mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m1388clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1392mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder addArtists(int i, AlbumArtistMetadata albumArtistMetadata) {
            copyOnWrite();
            ((AlbumMetadata) ((g) this).instance).addArtists(i, albumArtistMetadata);
            return this;
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(bArr, uz00Var);
        }

        public Builder setArtists(int i, AlbumArtistMetadata albumArtistMetadata) {
            copyOnWrite();
            ((AlbumMetadata) ((g) this).instance).setArtists(i, albumArtistMetadata);
            return this;
        }

        public Builder setCovers(ImageGroup imageGroup) {
            copyOnWrite();
            ((AlbumMetadata) ((g) this).instance).setCovers(imageGroup);
            return this;
        }

        public Builder addArtists(AlbumArtistMetadata albumArtistMetadata) {
            copyOnWrite();
            ((AlbumMetadata) ((g) this).instance).addArtists(albumArtistMetadata);
            return this;
        }

        public Builder addArtists(int i, AlbumArtistMetadata.Builder builder) {
            copyOnWrite();
            ((AlbumMetadata) ((g) this).instance).addArtists(i, (AlbumArtistMetadata) builder.build());
            return this;
        }
    }

    public static Builder newBuilder(AlbumMetadata albumMetadata) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(albumMetadata);
    }

    public static AlbumMetadata parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (AlbumMetadata) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static AlbumMetadata parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (AlbumMetadata) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static AlbumMetadata parseFrom(phc phcVar) {
        return (AlbumMetadata) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static AlbumMetadata parseFrom(phc phcVar, uz00 uz00Var) {
        return (AlbumMetadata) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addArtists(int i, AlbumArtistMetadata albumArtistMetadata) {
        albumArtistMetadata.getClass();
        ensureArtistsIsMutable();
        this.artists_.add(i, albumArtistMetadata);
    }

    public static AlbumMetadata parseFrom(byte[] bArr) {
        return (AlbumMetadata) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AlbumMetadata parseFrom(byte[] bArr, uz00 uz00Var) {
        return (AlbumMetadata) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static AlbumMetadata parseFrom(InputStream inputStream) {
        return (AlbumMetadata) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AlbumMetadata parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (AlbumMetadata) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static AlbumMetadata parseFrom(lwg lwgVar) {
        return (AlbumMetadata) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static AlbumMetadata parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (AlbumMetadata) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
