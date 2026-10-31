package com.spotify.localfiles.proto;

import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p.bf40;
import p.hhg1;
import p.jf40;
import p.lwg;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.r8;
import p.s2j0;
import p.s8;
import p.uz00;
import p.v190;
import p.v2j0;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class LocalFile extends h implements LocalFileOrBuilder {
    private static final LocalFile DEFAULT_INSTANCE;
    public static final int METADATA_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PATH_FIELD_NUMBER = 1;
    private int bitField0_;
    private Metadata metadata_;
    private String path_ = "";

    /* JADX INFO: renamed from: com.spotify.localfiles.proto.LocalFile$1, reason: invalid class name */
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

    public interface MetadataOrBuilder extends v2j0 {
        String getAlbum();

        phc getAlbumBytes();

        String getArtist();

        phc getArtistBytes();

        /* synthetic */ s2j0 getDefaultInstanceForType();

        int getDuration();

        Metadata.ImageState getImageState();

        int getImageStateValue();

        String getTitle();

        phc getTitleBytes();

        /* synthetic */ boolean isInitialized();
    }

    static {
        LocalFile localFile = new LocalFile();
        DEFAULT_INSTANCE = localFile;
        h.registerDefaultInstance(LocalFile.class, localFile);
    }

    private LocalFile() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPath() {
        this.path_ = getDefaultInstance().getPath();
    }

    public static LocalFile getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMetadata(Metadata metadata) {
        metadata.getClass();
        Metadata metadata2 = this.metadata_;
        if (metadata2 == null || metadata2 == Metadata.getDefaultInstance()) {
            this.metadata_ = metadata;
        } else {
            this.metadata_ = (Metadata) ((Metadata.Builder) Metadata.newBuilder(this.metadata_).mergeFrom(metadata)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static LocalFile parseDelimitedFrom(InputStream inputStream) {
        return (LocalFile) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LocalFile parseFrom(ByteBuffer byteBuffer) {
        return (LocalFile) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(Metadata metadata) {
        metadata.getClass();
        this.metadata_ = metadata;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPath(String str) {
        str.getClass();
        this.path_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPathBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.path_ = phcVar.v();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "path_", "metadata_"});
        }
        if (iOrdinal == 3) {
            return new LocalFile();
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
        synchronized (LocalFile.class) {
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

    @Override // com.spotify.localfiles.proto.LocalFileOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.localfiles.proto.LocalFileOrBuilder
    public Metadata getMetadata() {
        Metadata metadata = this.metadata_;
        return metadata == null ? Metadata.getDefaultInstance() : metadata;
    }

    @Override // com.spotify.localfiles.proto.LocalFileOrBuilder
    public String getPath() {
        return this.path_;
    }

    @Override // com.spotify.localfiles.proto.LocalFileOrBuilder
    public phc getPathBytes() {
        return phc.i(this.path_);
    }

    @Override // com.spotify.localfiles.proto.LocalFileOrBuilder
    public boolean hasMetadata() {
        return (this.bitField0_ & 1) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Metadata extends h implements MetadataOrBuilder {
        public static final int ALBUM_FIELD_NUMBER = 2;
        public static final int ARTIST_FIELD_NUMBER = 3;
        private static final Metadata DEFAULT_INSTANCE;
        public static final int DURATION_FIELD_NUMBER = 4;
        public static final int IMAGE_STATE_FIELD_NUMBER = 5;
        private static volatile qzr0 PARSER = null;
        public static final int TITLE_FIELD_NUMBER = 1;
        private int duration_;
        private int imageState_;
        private String title_ = "";
        private String album_ = "";
        private String artist_ = "";

        static {
            Metadata metadata = new Metadata();
            DEFAULT_INSTANCE = metadata;
            h.registerDefaultInstance(Metadata.class, metadata);
        }

        private Metadata() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlbum() {
            this.album_ = getDefaultInstance().getAlbum();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearArtist() {
            this.artist_ = getDefaultInstance().getArtist();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDuration() {
            this.duration_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImageState() {
            this.imageState_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTitle() {
            this.title_ = getDefaultInstance().getTitle();
        }

        public static Metadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Metadata parseDelimitedFrom(InputStream inputStream) {
            return (Metadata) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Metadata parseFrom(ByteBuffer byteBuffer) {
            return (Metadata) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlbum(String str) {
            str.getClass();
            this.album_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlbumBytes(phc phcVar) {
            s8.checkByteStringIsUtf8(phcVar);
            this.album_ = phcVar.v();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setArtist(String str) {
            str.getClass();
            this.artist_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setArtistBytes(phc phcVar) {
            s8.checkByteStringIsUtf8(phcVar);
            this.artist_ = phcVar.v();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDuration(int i) {
            this.duration_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageState(ImageState imageState) {
            this.imageState_ = imageState.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageStateValue(int i) {
            this.imageState_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitle(String str) {
            str.getClass();
            this.title_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitleBytes(phc phcVar) {
            s8.checkByteStringIsUtf8(phcVar);
            this.title_ = phcVar.v();
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0004\u0005\f", new Object[]{"title_", "album_", "artist_", "duration_", "imageState_"});
            }
            if (iOrdinal == 3) {
                return new Metadata();
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
            synchronized (Metadata.class) {
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

        @Override // com.spotify.localfiles.proto.LocalFile.MetadataOrBuilder
        public String getAlbum() {
            return this.album_;
        }

        @Override // com.spotify.localfiles.proto.LocalFile.MetadataOrBuilder
        public phc getAlbumBytes() {
            return phc.i(this.album_);
        }

        @Override // com.spotify.localfiles.proto.LocalFile.MetadataOrBuilder
        public String getArtist() {
            return this.artist_;
        }

        @Override // com.spotify.localfiles.proto.LocalFile.MetadataOrBuilder
        public phc getArtistBytes() {
            return phc.i(this.artist_);
        }

        @Override // com.spotify.localfiles.proto.LocalFile.MetadataOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.localfiles.proto.LocalFile.MetadataOrBuilder
        public int getDuration() {
            return this.duration_;
        }

        @Override // com.spotify.localfiles.proto.LocalFile.MetadataOrBuilder
        public ImageState getImageState() {
            ImageState imageStateForNumber = ImageState.forNumber(this.imageState_);
            return imageStateForNumber == null ? ImageState.UNRECOGNIZED : imageStateForNumber;
        }

        @Override // com.spotify.localfiles.proto.LocalFile.MetadataOrBuilder
        public int getImageStateValue() {
            return this.imageState_;
        }

        @Override // com.spotify.localfiles.proto.LocalFile.MetadataOrBuilder
        public String getTitle() {
            return this.title_;
        }

        @Override // com.spotify.localfiles.proto.LocalFile.MetadataOrBuilder
        public phc getTitleBytes() {
            return phc.i(this.title_);
        }

        public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public static final class Builder extends g implements MetadataOrBuilder {
            private Builder() {
                super(Metadata.DEFAULT_INSTANCE);
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

            public Builder clearAlbum() {
                copyOnWrite();
                ((Metadata) ((g) this).instance).clearAlbum();
                return this;
            }

            public Builder clearArtist() {
                copyOnWrite();
                ((Metadata) ((g) this).instance).clearArtist();
                return this;
            }

            public Builder clearDuration() {
                copyOnWrite();
                ((Metadata) ((g) this).instance).clearDuration();
                return this;
            }

            public Builder clearImageState() {
                copyOnWrite();
                ((Metadata) ((g) this).instance).clearImageState();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((Metadata) ((g) this).instance).clearTitle();
                return this;
            }

            public /* bridge */ /* synthetic */ Object clone() {
                return super.clone();
            }

            @Override // com.spotify.localfiles.proto.LocalFile.MetadataOrBuilder
            public String getAlbum() {
                return ((Metadata) ((g) this).instance).getAlbum();
            }

            @Override // com.spotify.localfiles.proto.LocalFile.MetadataOrBuilder
            public phc getAlbumBytes() {
                return ((Metadata) ((g) this).instance).getAlbumBytes();
            }

            @Override // com.spotify.localfiles.proto.LocalFile.MetadataOrBuilder
            public String getArtist() {
                return ((Metadata) ((g) this).instance).getArtist();
            }

            @Override // com.spotify.localfiles.proto.LocalFile.MetadataOrBuilder
            public phc getArtistBytes() {
                return ((Metadata) ((g) this).instance).getArtistBytes();
            }

            @Override // com.spotify.localfiles.proto.LocalFile.MetadataOrBuilder
            public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.localfiles.proto.LocalFile.MetadataOrBuilder
            public int getDuration() {
                return ((Metadata) ((g) this).instance).getDuration();
            }

            @Override // com.spotify.localfiles.proto.LocalFile.MetadataOrBuilder
            public ImageState getImageState() {
                return ((Metadata) ((g) this).instance).getImageState();
            }

            @Override // com.spotify.localfiles.proto.LocalFile.MetadataOrBuilder
            public int getImageStateValue() {
                return ((Metadata) ((g) this).instance).getImageStateValue();
            }

            @Override // com.spotify.localfiles.proto.LocalFile.MetadataOrBuilder
            public String getTitle() {
                return ((Metadata) ((g) this).instance).getTitle();
            }

            @Override // com.spotify.localfiles.proto.LocalFile.MetadataOrBuilder
            public phc getTitleBytes() {
                return ((Metadata) ((g) this).instance).getTitleBytes();
            }

            public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
                return super.internalMergeFrom((h) s8Var);
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m469mergeFrom(lwg lwgVar, uz00 uz00Var) {
                return super.mergeFrom(lwgVar, uz00Var);
            }

            public Builder setAlbum(String str) {
                copyOnWrite();
                ((Metadata) ((g) this).instance).setAlbum(str);
                return this;
            }

            public Builder setAlbumBytes(phc phcVar) {
                copyOnWrite();
                ((Metadata) ((g) this).instance).setAlbumBytes(phcVar);
                return this;
            }

            public Builder setArtist(String str) {
                copyOnWrite();
                ((Metadata) ((g) this).instance).setArtist(str);
                return this;
            }

            public Builder setArtistBytes(phc phcVar) {
                copyOnWrite();
                ((Metadata) ((g) this).instance).setArtistBytes(phcVar);
                return this;
            }

            public Builder setDuration(int i) {
                copyOnWrite();
                ((Metadata) ((g) this).instance).setDuration(i);
                return this;
            }

            public Builder setImageState(ImageState imageState) {
                copyOnWrite();
                ((Metadata) ((g) this).instance).setImageState(imageState);
                return this;
            }

            public Builder setImageStateValue(int i) {
                copyOnWrite();
                ((Metadata) ((g) this).instance).setImageStateValue(i);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((Metadata) ((g) this).instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(phc phcVar) {
                copyOnWrite();
                ((Metadata) ((g) this).instance).setTitleBytes(phcVar);
                return this;
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m468clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m470mergeFrom(byte[] bArr, int i, int i2) {
                return super.mergeFrom(bArr, i, i2);
            }

            /* JADX INFO: renamed from: clone, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r2j0 m467clone() {
                return super.clone();
            }

            /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ r8 m471mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public enum ImageState implements v190 {
            UNKNOWN(0),
            AVAILABLE(1),
            UNAVAILABLE(2),
            UNRECOGNIZED(-1);

            public static final int AVAILABLE_VALUE = 1;
            public static final int UNAVAILABLE_VALUE = 2;
            public static final int UNKNOWN_VALUE = 0;
            private static final y190 internalValueMap = new y190() { // from class: com.spotify.localfiles.proto.LocalFile.Metadata.ImageState.1
                /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
                public ImageState m472findValueByNumber(int i) {
                    return ImageState.forNumber(i);
                }
            };
            private final int value;

            public static final class ImageStateVerifier implements z190 {
                static final z190 INSTANCE = new ImageStateVerifier();

                private ImageStateVerifier() {
                }

                public boolean isInRange(int i) {
                    return ImageState.forNumber(i) != null;
                }
            }

            ImageState(int i) {
                this.value = i;
            }

            public static ImageState forNumber(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return AVAILABLE;
                }
                if (i != 2) {
                    return null;
                }
                return UNAVAILABLE;
            }

            public static y190 internalGetValueMap() {
                return internalValueMap;
            }

            public static z190 internalGetVerifier() {
                return ImageStateVerifier.INSTANCE;
            }

            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                hhg1.n("Can't get the number of an unknown enum value.");
                return 0;
            }

            @Deprecated
            public static ImageState valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Builder newBuilder(Metadata metadata) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(metadata);
        }

        public static Metadata parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
            return (Metadata) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static Metadata parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
            return (Metadata) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
        }

        public static Metadata parseFrom(phc phcVar) {
            return (Metadata) h.parseFrom(DEFAULT_INSTANCE, phcVar);
        }

        public static Metadata parseFrom(phc phcVar, uz00 uz00Var) {
            return (Metadata) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
        }

        public static Metadata parseFrom(byte[] bArr) {
            return (Metadata) h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Metadata parseFrom(byte[] bArr, uz00 uz00Var) {
            return (Metadata) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
        }

        public static Metadata parseFrom(InputStream inputStream) {
            return (Metadata) h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Metadata parseFrom(InputStream inputStream, uz00 uz00Var) {
            return (Metadata) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
        }

        public static Metadata parseFrom(lwg lwgVar) {
            return (Metadata) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
        }

        public static Metadata parseFrom(lwg lwgVar, uz00 uz00Var) {
            return (Metadata) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
        }
    }

    public static final class Builder extends g implements LocalFileOrBuilder {
        private Builder() {
            super(LocalFile.DEFAULT_INSTANCE);
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

        public Builder clearMetadata() {
            copyOnWrite();
            ((LocalFile) ((g) this).instance).clearMetadata();
            return this;
        }

        public Builder clearPath() {
            copyOnWrite();
            ((LocalFile) ((g) this).instance).clearPath();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.localfiles.proto.LocalFileOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.localfiles.proto.LocalFileOrBuilder
        public Metadata getMetadata() {
            return ((LocalFile) ((g) this).instance).getMetadata();
        }

        @Override // com.spotify.localfiles.proto.LocalFileOrBuilder
        public String getPath() {
            return ((LocalFile) ((g) this).instance).getPath();
        }

        @Override // com.spotify.localfiles.proto.LocalFileOrBuilder
        public phc getPathBytes() {
            return ((LocalFile) ((g) this).instance).getPathBytes();
        }

        @Override // com.spotify.localfiles.proto.LocalFileOrBuilder
        public boolean hasMetadata() {
            return ((LocalFile) ((g) this).instance).hasMetadata();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m464mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder mergeMetadata(Metadata metadata) {
            copyOnWrite();
            ((LocalFile) ((g) this).instance).mergeMetadata(metadata);
            return this;
        }

        public Builder setMetadata(Metadata.Builder builder) {
            copyOnWrite();
            ((LocalFile) ((g) this).instance).setMetadata((Metadata) builder.build());
            return this;
        }

        public Builder setPath(String str) {
            copyOnWrite();
            ((LocalFile) ((g) this).instance).setPath(str);
            return this;
        }

        public Builder setPathBytes(phc phcVar) {
            copyOnWrite();
            ((LocalFile) ((g) this).instance).setPathBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m463clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m465mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m462clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m466mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder setMetadata(Metadata metadata) {
            copyOnWrite();
            ((LocalFile) ((g) this).instance).setMetadata(metadata);
            return this;
        }
    }

    public static Builder newBuilder(LocalFile localFile) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(localFile);
    }

    public static LocalFile parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (LocalFile) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static LocalFile parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (LocalFile) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static LocalFile parseFrom(phc phcVar) {
        return (LocalFile) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static LocalFile parseFrom(phc phcVar, uz00 uz00Var) {
        return (LocalFile) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static LocalFile parseFrom(byte[] bArr) {
        return (LocalFile) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LocalFile parseFrom(byte[] bArr, uz00 uz00Var) {
        return (LocalFile) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static LocalFile parseFrom(InputStream inputStream) {
        return (LocalFile) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LocalFile parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (LocalFile) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static LocalFile parseFrom(lwg lwgVar) {
        return (LocalFile) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static LocalFile parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (LocalFile) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
