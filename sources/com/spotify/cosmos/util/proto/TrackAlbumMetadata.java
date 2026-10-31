package com.spotify.cosmos.util.proto;

import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p.bf40;
import p.jf40;
import p.lwg;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class TrackAlbumMetadata extends h implements TrackAlbumMetadataOrBuilder {
    public static final int ARTIST_FIELD_NUMBER = 1;
    public static final int COVERS_FIELD_NUMBER = 4;
    private static final TrackAlbumMetadata DEFAULT_INSTANCE;
    public static final int LINK_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private TrackAlbumArtistMetadata artist_;
    private int bitField0_;
    private ImageGroup covers_;
    private String link_ = "";
    private String name_ = "";

    static {
        TrackAlbumMetadata trackAlbumMetadata = new TrackAlbumMetadata();
        DEFAULT_INSTANCE = trackAlbumMetadata;
        h.registerDefaultInstance(TrackAlbumMetadata.class, trackAlbumMetadata);
    }

    private TrackAlbumMetadata() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArtist() {
        this.artist_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCovers() {
        this.covers_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLink() {
        this.bitField0_ &= -3;
        this.link_ = getDefaultInstance().getLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -5;
        this.name_ = getDefaultInstance().getName();
    }

    public static TrackAlbumMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeArtist(TrackAlbumArtistMetadata trackAlbumArtistMetadata) {
        trackAlbumArtistMetadata.getClass();
        TrackAlbumArtistMetadata trackAlbumArtistMetadata2 = this.artist_;
        if (trackAlbumArtistMetadata2 == null || trackAlbumArtistMetadata2 == TrackAlbumArtistMetadata.getDefaultInstance()) {
            this.artist_ = trackAlbumArtistMetadata;
        } else {
            this.artist_ = TrackAlbumArtistMetadata.newBuilder(this.artist_).mergeFrom(trackAlbumArtistMetadata).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCovers(ImageGroup imageGroup) {
        imageGroup.getClass();
        ImageGroup imageGroup2 = this.covers_;
        if (imageGroup2 == null || imageGroup2 == ImageGroup.getDefaultInstance()) {
            this.covers_ = imageGroup;
        } else {
            this.covers_ = (ImageGroup) ImageGroup.newBuilder(this.covers_).mergeFrom(imageGroup).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TrackAlbumMetadata parseDelimitedFrom(InputStream inputStream) {
        return (TrackAlbumMetadata) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrackAlbumMetadata parseFrom(ByteBuffer byteBuffer) {
        return (TrackAlbumMetadata) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArtist(TrackAlbumArtistMetadata trackAlbumArtistMetadata) {
        trackAlbumArtistMetadata.getClass();
        this.artist_ = trackAlbumArtistMetadata;
        this.bitField0_ |= 1;
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
        this.bitField0_ |= 2;
        this.link_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkBytes(phc phcVar) {
        this.link_ = phcVar.v();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(phc phcVar) {
        this.name_ = phcVar.v();
        this.bitField0_ |= 4;
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "artist_", "link_", "name_", "covers_"});
        }
        if (iOrdinal == 3) {
            return new TrackAlbumMetadata();
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
        synchronized (TrackAlbumMetadata.class) {
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

    @Override // com.spotify.cosmos.util.proto.TrackAlbumMetadataOrBuilder
    public TrackAlbumArtistMetadata getArtist() {
        TrackAlbumArtistMetadata trackAlbumArtistMetadata = this.artist_;
        return trackAlbumArtistMetadata == null ? TrackAlbumArtistMetadata.getDefaultInstance() : trackAlbumArtistMetadata;
    }

    @Override // com.spotify.cosmos.util.proto.TrackAlbumMetadataOrBuilder
    public ImageGroup getCovers() {
        ImageGroup imageGroup = this.covers_;
        return imageGroup == null ? ImageGroup.getDefaultInstance() : imageGroup;
    }

    @Override // com.google.protobuf.h, p.v2j0
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.proto.TrackAlbumMetadataOrBuilder
    public String getLink() {
        return this.link_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackAlbumMetadataOrBuilder
    public phc getLinkBytes() {
        return phc.i(this.link_);
    }

    @Override // com.spotify.cosmos.util.proto.TrackAlbumMetadataOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackAlbumMetadataOrBuilder
    public phc getNameBytes() {
        return phc.i(this.name_);
    }

    @Override // com.spotify.cosmos.util.proto.TrackAlbumMetadataOrBuilder
    public boolean hasArtist() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.TrackAlbumMetadataOrBuilder
    public boolean hasCovers() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.TrackAlbumMetadataOrBuilder
    public boolean hasLink() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.TrackAlbumMetadataOrBuilder
    public boolean hasName() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(TrackAlbumMetadata trackAlbumMetadata) {
        return DEFAULT_INSTANCE.createBuilder(trackAlbumMetadata);
    }

    public static TrackAlbumMetadata parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (TrackAlbumMetadata) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static TrackAlbumMetadata parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (TrackAlbumMetadata) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static TrackAlbumMetadata parseFrom(phc phcVar) {
        return (TrackAlbumMetadata) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static TrackAlbumMetadata parseFrom(phc phcVar, uz00 uz00Var) {
        return (TrackAlbumMetadata) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static TrackAlbumMetadata parseFrom(byte[] bArr) {
        return (TrackAlbumMetadata) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TrackAlbumMetadata parseFrom(byte[] bArr, uz00 uz00Var) {
        return (TrackAlbumMetadata) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static TrackAlbumMetadata parseFrom(InputStream inputStream) {
        return (TrackAlbumMetadata) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrackAlbumMetadata parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (TrackAlbumMetadata) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static TrackAlbumMetadata parseFrom(lwg lwgVar) {
        return (TrackAlbumMetadata) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static TrackAlbumMetadata parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (TrackAlbumMetadata) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
