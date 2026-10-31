package com.spotify.cosmos.util.policy.proto;

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
public final class ArtistCollectionDecorationPolicy extends h implements ArtistCollectionDecorationPolicyOrBuilder {
    public static final int CAN_BAN_FIELD_NUMBER = 6;
    public static final int COLLECTION_LINK_FIELD_NUMBER = 1;
    private static final ArtistCollectionDecorationPolicy DEFAULT_INSTANCE;
    public static final int IS_BANNED_FIELD_NUMBER = 5;
    public static final int IS_FOLLOWED_FIELD_NUMBER = 2;
    public static final int NUM_ALBUMS_IN_COLLECTION_FIELD_NUMBER = 4;
    public static final int NUM_EXPLICITLY_LIKED_TRACKS_FIELD_NUMBER = 8;
    public static final int NUM_TRACKS_IN_COLLECTION_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private boolean canBan_;
    private boolean collectionLink_;
    private boolean isBanned_;
    private boolean isFollowed_;
    private boolean numAlbumsInCollection_;
    private boolean numExplicitlyLikedTracks_;
    private boolean numTracksInCollection_;

    static {
        ArtistCollectionDecorationPolicy artistCollectionDecorationPolicy = new ArtistCollectionDecorationPolicy();
        DEFAULT_INSTANCE = artistCollectionDecorationPolicy;
        h.registerDefaultInstance(ArtistCollectionDecorationPolicy.class, artistCollectionDecorationPolicy);
    }

    private ArtistCollectionDecorationPolicy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanBan() {
        this.canBan_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCollectionLink() {
        this.collectionLink_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsBanned() {
        this.isBanned_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsFollowed() {
        this.isFollowed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumAlbumsInCollection() {
        this.numAlbumsInCollection_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumExplicitlyLikedTracks() {
        this.numExplicitlyLikedTracks_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumTracksInCollection() {
        this.numTracksInCollection_ = false;
    }

    public static ArtistCollectionDecorationPolicy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ArtistCollectionDecorationPolicy parseDelimitedFrom(InputStream inputStream) {
        return (ArtistCollectionDecorationPolicy) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArtistCollectionDecorationPolicy parseFrom(ByteBuffer byteBuffer) {
        return (ArtistCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanBan(boolean z) {
        this.canBan_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCollectionLink(boolean z) {
        this.collectionLink_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsBanned(boolean z) {
        this.isBanned_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsFollowed(boolean z) {
        this.isFollowed_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumAlbumsInCollection(boolean z) {
        this.numAlbumsInCollection_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumExplicitlyLikedTracks(boolean z) {
        this.numExplicitlyLikedTracks_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumTracksInCollection(boolean z) {
        this.numTracksInCollection_ = z;
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\b\u0007\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\b\u0007", new Object[]{"collectionLink_", "isFollowed_", "numTracksInCollection_", "numAlbumsInCollection_", "isBanned_", "canBan_", "numExplicitlyLikedTracks_"});
        }
        if (iOrdinal == 3) {
            return new ArtistCollectionDecorationPolicy();
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
        synchronized (ArtistCollectionDecorationPolicy.class) {
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

    @Override // com.spotify.cosmos.util.policy.proto.ArtistCollectionDecorationPolicyOrBuilder
    public boolean getCanBan() {
        return this.canBan_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.ArtistCollectionDecorationPolicyOrBuilder
    public boolean getCollectionLink() {
        return this.collectionLink_;
    }

    @Override // com.google.protobuf.h, p.v2j0
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.policy.proto.ArtistCollectionDecorationPolicyOrBuilder
    public boolean getIsBanned() {
        return this.isBanned_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.ArtistCollectionDecorationPolicyOrBuilder
    public boolean getIsFollowed() {
        return this.isFollowed_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.ArtistCollectionDecorationPolicyOrBuilder
    public boolean getNumAlbumsInCollection() {
        return this.numAlbumsInCollection_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.ArtistCollectionDecorationPolicyOrBuilder
    public boolean getNumExplicitlyLikedTracks() {
        return this.numExplicitlyLikedTracks_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.ArtistCollectionDecorationPolicyOrBuilder
    public boolean getNumTracksInCollection() {
        return this.numTracksInCollection_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(ArtistCollectionDecorationPolicy artistCollectionDecorationPolicy) {
        return DEFAULT_INSTANCE.createBuilder(artistCollectionDecorationPolicy);
    }

    public static ArtistCollectionDecorationPolicy parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (ArtistCollectionDecorationPolicy) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ArtistCollectionDecorationPolicy parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (ArtistCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static ArtistCollectionDecorationPolicy parseFrom(phc phcVar) {
        return (ArtistCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static ArtistCollectionDecorationPolicy parseFrom(phc phcVar, uz00 uz00Var) {
        return (ArtistCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static ArtistCollectionDecorationPolicy parseFrom(byte[] bArr) {
        return (ArtistCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ArtistCollectionDecorationPolicy parseFrom(byte[] bArr, uz00 uz00Var) {
        return (ArtistCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static ArtistCollectionDecorationPolicy parseFrom(InputStream inputStream) {
        return (ArtistCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArtistCollectionDecorationPolicy parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (ArtistCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ArtistCollectionDecorationPolicy parseFrom(lwg lwgVar) {
        return (ArtistCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static ArtistCollectionDecorationPolicy parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (ArtistCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
