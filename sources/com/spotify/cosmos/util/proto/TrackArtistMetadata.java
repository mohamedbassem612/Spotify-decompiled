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
public final class TrackArtistMetadata extends h implements TrackArtistMetadataOrBuilder {
    private static final TrackArtistMetadata DEFAULT_INSTANCE;
    public static final int LINK_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PORTRAITS_FIELD_NUMBER = 3;
    private int bitField0_;
    private String link_ = "";
    private String name_ = "";
    private ImageGroup portraits_;

    static {
        TrackArtistMetadata trackArtistMetadata = new TrackArtistMetadata();
        DEFAULT_INSTANCE = trackArtistMetadata;
        h.registerDefaultInstance(TrackArtistMetadata.class, trackArtistMetadata);
    }

    private TrackArtistMetadata() {
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
        this.bitField0_ &= -5;
    }

    public static TrackArtistMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePortraits(ImageGroup imageGroup) {
        imageGroup.getClass();
        ImageGroup imageGroup2 = this.portraits_;
        if (imageGroup2 == null || imageGroup2 == ImageGroup.getDefaultInstance()) {
            this.portraits_ = imageGroup;
        } else {
            this.portraits_ = (ImageGroup) ImageGroup.newBuilder(this.portraits_).mergeFrom(imageGroup).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TrackArtistMetadata parseDelimitedFrom(InputStream inputStream) {
        return (TrackArtistMetadata) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrackArtistMetadata parseFrom(ByteBuffer byteBuffer) {
        return (TrackArtistMetadata) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "link_", "name_", "portraits_"});
        }
        if (iOrdinal == 3) {
            return new TrackArtistMetadata();
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
        synchronized (TrackArtistMetadata.class) {
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

    @Override // com.google.protobuf.h, p.v2j0
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.proto.TrackArtistMetadataOrBuilder
    public String getLink() {
        return this.link_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackArtistMetadataOrBuilder
    public phc getLinkBytes() {
        return phc.i(this.link_);
    }

    @Override // com.spotify.cosmos.util.proto.TrackArtistMetadataOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackArtistMetadataOrBuilder
    public phc getNameBytes() {
        return phc.i(this.name_);
    }

    @Override // com.spotify.cosmos.util.proto.TrackArtistMetadataOrBuilder
    public ImageGroup getPortraits() {
        ImageGroup imageGroup = this.portraits_;
        return imageGroup == null ? ImageGroup.getDefaultInstance() : imageGroup;
    }

    @Override // com.spotify.cosmos.util.proto.TrackArtistMetadataOrBuilder
    public boolean hasLink() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.TrackArtistMetadataOrBuilder
    public boolean hasName() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.TrackArtistMetadataOrBuilder
    public boolean hasPortraits() {
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

    public static Builder newBuilder(TrackArtistMetadata trackArtistMetadata) {
        return DEFAULT_INSTANCE.createBuilder(trackArtistMetadata);
    }

    public static TrackArtistMetadata parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (TrackArtistMetadata) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static TrackArtistMetadata parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (TrackArtistMetadata) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static TrackArtistMetadata parseFrom(phc phcVar) {
        return (TrackArtistMetadata) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static TrackArtistMetadata parseFrom(phc phcVar, uz00 uz00Var) {
        return (TrackArtistMetadata) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static TrackArtistMetadata parseFrom(byte[] bArr) {
        return (TrackArtistMetadata) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TrackArtistMetadata parseFrom(byte[] bArr, uz00 uz00Var) {
        return (TrackArtistMetadata) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static TrackArtistMetadata parseFrom(InputStream inputStream) {
        return (TrackArtistMetadata) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrackArtistMetadata parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (TrackArtistMetadata) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static TrackArtistMetadata parseFrom(lwg lwgVar) {
        return (TrackArtistMetadata) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static TrackArtistMetadata parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (TrackArtistMetadata) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
