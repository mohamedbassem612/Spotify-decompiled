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
public final class EpisodeCollectionState extends h implements EpisodeCollectionStateOrBuilder {
    private static final EpisodeCollectionState DEFAULT_INSTANCE;
    public static final int IS_FOLLOWING_SHOW_FIELD_NUMBER = 1;
    public static final int IS_IN_LISTEN_LATER_FIELD_NUMBER = 3;
    public static final int IS_NEW_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private boolean isFollowingShow_;
    private boolean isInListenLater_;
    private boolean isNew_;

    static {
        EpisodeCollectionState episodeCollectionState = new EpisodeCollectionState();
        DEFAULT_INSTANCE = episodeCollectionState;
        h.registerDefaultInstance(EpisodeCollectionState.class, episodeCollectionState);
    }

    private EpisodeCollectionState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsFollowingShow() {
        this.bitField0_ &= -2;
        this.isFollowingShow_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsInListenLater() {
        this.bitField0_ &= -5;
        this.isInListenLater_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsNew() {
        this.bitField0_ &= -3;
        this.isNew_ = false;
    }

    public static EpisodeCollectionState getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static EpisodeCollectionState parseDelimitedFrom(InputStream inputStream) {
        return (EpisodeCollectionState) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodeCollectionState parseFrom(ByteBuffer byteBuffer) {
        return (EpisodeCollectionState) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsFollowingShow(boolean z) {
        this.bitField0_ |= 1;
        this.isFollowingShow_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsInListenLater(boolean z) {
        this.bitField0_ |= 4;
        this.isInListenLater_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsNew(boolean z) {
        this.bitField0_ |= 2;
        this.isNew_ = z;
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "isFollowingShow_", "isNew_", "isInListenLater_"});
        }
        if (iOrdinal == 3) {
            return new EpisodeCollectionState();
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
        synchronized (EpisodeCollectionState.class) {
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

    @Override // com.spotify.cosmos.util.proto.EpisodeCollectionStateOrBuilder
    public boolean getIsFollowingShow() {
        return this.isFollowingShow_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeCollectionStateOrBuilder
    public boolean getIsInListenLater() {
        return this.isInListenLater_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeCollectionStateOrBuilder
    public boolean getIsNew() {
        return this.isNew_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeCollectionStateOrBuilder
    public boolean hasIsFollowingShow() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeCollectionStateOrBuilder
    public boolean hasIsInListenLater() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeCollectionStateOrBuilder
    public boolean hasIsNew() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(EpisodeCollectionState episodeCollectionState) {
        return DEFAULT_INSTANCE.createBuilder(episodeCollectionState);
    }

    public static EpisodeCollectionState parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (EpisodeCollectionState) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static EpisodeCollectionState parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (EpisodeCollectionState) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static EpisodeCollectionState parseFrom(phc phcVar) {
        return (EpisodeCollectionState) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static EpisodeCollectionState parseFrom(phc phcVar, uz00 uz00Var) {
        return (EpisodeCollectionState) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static EpisodeCollectionState parseFrom(byte[] bArr) {
        return (EpisodeCollectionState) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EpisodeCollectionState parseFrom(byte[] bArr, uz00 uz00Var) {
        return (EpisodeCollectionState) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static EpisodeCollectionState parseFrom(InputStream inputStream) {
        return (EpisodeCollectionState) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodeCollectionState parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (EpisodeCollectionState) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static EpisodeCollectionState parseFrom(lwg lwgVar) {
        return (EpisodeCollectionState) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static EpisodeCollectionState parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (EpisodeCollectionState) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
