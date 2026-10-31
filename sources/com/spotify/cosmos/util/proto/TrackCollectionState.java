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
public final class TrackCollectionState extends h implements TrackCollectionStateOrBuilder {
    public static final int CAN_ADD_TO_COLLECTION_FIELD_NUMBER = 2;
    public static final int CAN_BAN_FIELD_NUMBER = 4;
    private static final TrackCollectionState DEFAULT_INSTANCE;
    public static final int IS_BANNED_FIELD_NUMBER = 3;
    public static final int IS_IN_COLLECTION_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private boolean canAddToCollection_;
    private boolean canBan_;
    private boolean isBanned_;
    private boolean isInCollection_;

    static {
        TrackCollectionState trackCollectionState = new TrackCollectionState();
        DEFAULT_INSTANCE = trackCollectionState;
        h.registerDefaultInstance(TrackCollectionState.class, trackCollectionState);
    }

    private TrackCollectionState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanAddToCollection() {
        this.bitField0_ &= -3;
        this.canAddToCollection_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanBan() {
        this.bitField0_ &= -9;
        this.canBan_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsBanned() {
        this.bitField0_ &= -5;
        this.isBanned_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsInCollection() {
        this.bitField0_ &= -2;
        this.isInCollection_ = false;
    }

    public static TrackCollectionState getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TrackCollectionState parseDelimitedFrom(InputStream inputStream) {
        return (TrackCollectionState) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrackCollectionState parseFrom(ByteBuffer byteBuffer) {
        return (TrackCollectionState) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanAddToCollection(boolean z) {
        this.bitField0_ |= 2;
        this.canAddToCollection_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanBan(boolean z) {
        this.bitField0_ |= 8;
        this.canBan_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsBanned(boolean z) {
        this.bitField0_ |= 4;
        this.isBanned_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsInCollection(boolean z) {
        this.bitField0_ |= 1;
        this.isInCollection_ = z;
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"bitField0_", "isInCollection_", "canAddToCollection_", "isBanned_", "canBan_"});
        }
        if (iOrdinal == 3) {
            return new TrackCollectionState();
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
        synchronized (TrackCollectionState.class) {
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

    @Override // com.spotify.cosmos.util.proto.TrackCollectionStateOrBuilder
    public boolean getCanAddToCollection() {
        return this.canAddToCollection_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackCollectionStateOrBuilder
    public boolean getCanBan() {
        return this.canBan_;
    }

    @Override // com.google.protobuf.h, p.v2j0
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.proto.TrackCollectionStateOrBuilder
    public boolean getIsBanned() {
        return this.isBanned_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackCollectionStateOrBuilder
    public boolean getIsInCollection() {
        return this.isInCollection_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackCollectionStateOrBuilder
    public boolean hasCanAddToCollection() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.TrackCollectionStateOrBuilder
    public boolean hasCanBan() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.TrackCollectionStateOrBuilder
    public boolean hasIsBanned() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.TrackCollectionStateOrBuilder
    public boolean hasIsInCollection() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(TrackCollectionState trackCollectionState) {
        return DEFAULT_INSTANCE.createBuilder(trackCollectionState);
    }

    public static TrackCollectionState parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (TrackCollectionState) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static TrackCollectionState parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (TrackCollectionState) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static TrackCollectionState parseFrom(phc phcVar) {
        return (TrackCollectionState) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static TrackCollectionState parseFrom(phc phcVar, uz00 uz00Var) {
        return (TrackCollectionState) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static TrackCollectionState parseFrom(byte[] bArr) {
        return (TrackCollectionState) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TrackCollectionState parseFrom(byte[] bArr, uz00 uz00Var) {
        return (TrackCollectionState) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static TrackCollectionState parseFrom(InputStream inputStream) {
        return (TrackCollectionState) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrackCollectionState parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (TrackCollectionState) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static TrackCollectionState parseFrom(lwg lwgVar) {
        return (TrackCollectionState) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static TrackCollectionState parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (TrackCollectionState) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
