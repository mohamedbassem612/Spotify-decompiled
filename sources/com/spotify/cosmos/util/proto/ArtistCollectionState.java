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
public final class ArtistCollectionState extends h implements ArtistCollectionStateOrBuilder {
    public static final int CAN_BAN_FIELD_NUMBER = 6;
    public static final int COLLECTION_LINK_FIELD_NUMBER = 1;
    private static final ArtistCollectionState DEFAULT_INSTANCE;
    public static final int FOLLOWED_FIELD_NUMBER = 2;
    public static final int IS_BANNED_FIELD_NUMBER = 5;
    public static final int NUM_ALBUMS_IN_COLLECTION_FIELD_NUMBER = 4;
    public static final int NUM_EXPLICITLY_LIKED_TRACKS_FIELD_NUMBER = 7;
    public static final int NUM_TRACKS_IN_COLLECTION_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private boolean canBan_;
    private String collectionLink_ = "";
    private boolean followed_;
    private boolean isBanned_;
    private int numAlbumsInCollection_;
    private int numExplicitlyLikedTracks_;
    private int numTracksInCollection_;

    static {
        ArtistCollectionState artistCollectionState = new ArtistCollectionState();
        DEFAULT_INSTANCE = artistCollectionState;
        h.registerDefaultInstance(ArtistCollectionState.class, artistCollectionState);
    }

    private ArtistCollectionState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanBan() {
        this.bitField0_ &= -33;
        this.canBan_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCollectionLink() {
        this.bitField0_ &= -2;
        this.collectionLink_ = getDefaultInstance().getCollectionLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFollowed() {
        this.bitField0_ &= -3;
        this.followed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsBanned() {
        this.bitField0_ &= -17;
        this.isBanned_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumAlbumsInCollection() {
        this.bitField0_ &= -9;
        this.numAlbumsInCollection_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumExplicitlyLikedTracks() {
        this.bitField0_ &= -65;
        this.numExplicitlyLikedTracks_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumTracksInCollection() {
        this.bitField0_ &= -5;
        this.numTracksInCollection_ = 0;
    }

    public static ArtistCollectionState getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ArtistCollectionState parseDelimitedFrom(InputStream inputStream) {
        return (ArtistCollectionState) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArtistCollectionState parseFrom(ByteBuffer byteBuffer) {
        return (ArtistCollectionState) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanBan(boolean z) {
        this.bitField0_ |= 32;
        this.canBan_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCollectionLink(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.collectionLink_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCollectionLinkBytes(phc phcVar) {
        this.collectionLink_ = phcVar.v();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFollowed(boolean z) {
        this.bitField0_ |= 2;
        this.followed_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsBanned(boolean z) {
        this.bitField0_ |= 16;
        this.isBanned_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumAlbumsInCollection(int i) {
        this.bitField0_ |= 8;
        this.numAlbumsInCollection_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumExplicitlyLikedTracks(int i) {
        this.bitField0_ |= 64;
        this.numExplicitlyLikedTracks_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumTracksInCollection(int i) {
        this.bitField0_ |= 4;
        this.numTracksInCollection_ = i;
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဋ\u0006", new Object[]{"bitField0_", "collectionLink_", "followed_", "numTracksInCollection_", "numAlbumsInCollection_", "isBanned_", "canBan_", "numExplicitlyLikedTracks_"});
        }
        if (iOrdinal == 3) {
            return new ArtistCollectionState();
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
        synchronized (ArtistCollectionState.class) {
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

    @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
    public boolean getCanBan() {
        return this.canBan_;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
    public String getCollectionLink() {
        return this.collectionLink_;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
    public phc getCollectionLinkBytes() {
        return phc.i(this.collectionLink_);
    }

    @Override // com.google.protobuf.h, p.v2j0
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
    public boolean getFollowed() {
        return this.followed_;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
    public boolean getIsBanned() {
        return this.isBanned_;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
    public int getNumAlbumsInCollection() {
        return this.numAlbumsInCollection_;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
    public int getNumExplicitlyLikedTracks() {
        return this.numExplicitlyLikedTracks_;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
    public int getNumTracksInCollection() {
        return this.numTracksInCollection_;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
    public boolean hasCanBan() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
    public boolean hasCollectionLink() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
    public boolean hasFollowed() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
    public boolean hasIsBanned() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
    public boolean hasNumAlbumsInCollection() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
    public boolean hasNumExplicitlyLikedTracks() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ArtistCollectionStateOrBuilder
    public boolean hasNumTracksInCollection() {
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

    public static Builder newBuilder(ArtistCollectionState artistCollectionState) {
        return DEFAULT_INSTANCE.createBuilder(artistCollectionState);
    }

    public static ArtistCollectionState parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (ArtistCollectionState) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ArtistCollectionState parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (ArtistCollectionState) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static ArtistCollectionState parseFrom(phc phcVar) {
        return (ArtistCollectionState) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static ArtistCollectionState parseFrom(phc phcVar, uz00 uz00Var) {
        return (ArtistCollectionState) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static ArtistCollectionState parseFrom(byte[] bArr) {
        return (ArtistCollectionState) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ArtistCollectionState parseFrom(byte[] bArr, uz00 uz00Var) {
        return (ArtistCollectionState) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static ArtistCollectionState parseFrom(InputStream inputStream) {
        return (ArtistCollectionState) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArtistCollectionState parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (ArtistCollectionState) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ArtistCollectionState parseFrom(lwg lwgVar) {
        return (ArtistCollectionState) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static ArtistCollectionState parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (ArtistCollectionState) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
