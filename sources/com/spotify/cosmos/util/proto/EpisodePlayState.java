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
public final class EpisodePlayState extends h implements EpisodePlayStateOrBuilder {
    private static final EpisodePlayState DEFAULT_INSTANCE;
    public static final int IS_PLAYABLE_FIELD_NUMBER = 2;
    public static final int IS_PLAYED_FIELD_NUMBER = 3;
    public static final int LAST_PLAYED_AT_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYABILITY_RESTRICTION_FIELD_NUMBER = 5;
    public static final int TIME_LEFT_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean isPlayable_;
    private boolean isPlayed_;
    private int lastPlayedAt_;
    private int playabilityRestriction_;
    private int timeLeft_;

    static {
        EpisodePlayState episodePlayState = new EpisodePlayState();
        DEFAULT_INSTANCE = episodePlayState;
        h.registerDefaultInstance(EpisodePlayState.class, episodePlayState);
    }

    private EpisodePlayState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPlayable() {
        this.bitField0_ &= -3;
        this.isPlayable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPlayed() {
        this.bitField0_ &= -5;
        this.isPlayed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastPlayedAt() {
        this.bitField0_ &= -9;
        this.lastPlayedAt_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayabilityRestriction() {
        this.bitField0_ &= -17;
        this.playabilityRestriction_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeLeft() {
        this.bitField0_ &= -2;
        this.timeLeft_ = 0;
    }

    public static EpisodePlayState getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static EpisodePlayState parseDelimitedFrom(InputStream inputStream) {
        return (EpisodePlayState) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodePlayState parseFrom(ByteBuffer byteBuffer) {
        return (EpisodePlayState) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPlayable(boolean z) {
        this.bitField0_ |= 2;
        this.isPlayable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPlayed(boolean z) {
        this.bitField0_ |= 4;
        this.isPlayed_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastPlayedAt(int i) {
        this.bitField0_ |= 8;
        this.lastPlayedAt_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayabilityRestriction(PlayabilityRestriction playabilityRestriction) {
        this.playabilityRestriction_ = playabilityRestriction.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeLeft(int i) {
        this.bitField0_ |= 1;
        this.timeLeft_ = i;
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဋ\u0003\u0005᠌\u0004", new Object[]{"bitField0_", "timeLeft_", "isPlayable_", "isPlayed_", "lastPlayedAt_", "playabilityRestriction_", PlayabilityRestriction.internalGetVerifier()});
        }
        if (iOrdinal == 3) {
            return new EpisodePlayState();
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
        synchronized (EpisodePlayState.class) {
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

    @Override // com.spotify.cosmos.util.proto.EpisodePlayStateOrBuilder
    public boolean getIsPlayable() {
        return this.isPlayable_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodePlayStateOrBuilder
    public boolean getIsPlayed() {
        return this.isPlayed_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodePlayStateOrBuilder
    public int getLastPlayedAt() {
        return this.lastPlayedAt_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodePlayStateOrBuilder
    public PlayabilityRestriction getPlayabilityRestriction() {
        PlayabilityRestriction playabilityRestrictionForNumber = PlayabilityRestriction.forNumber(this.playabilityRestriction_);
        return playabilityRestrictionForNumber == null ? PlayabilityRestriction.UNKNOWN : playabilityRestrictionForNumber;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodePlayStateOrBuilder
    public int getTimeLeft() {
        return this.timeLeft_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodePlayStateOrBuilder
    public boolean hasIsPlayable() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodePlayStateOrBuilder
    public boolean hasIsPlayed() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodePlayStateOrBuilder
    public boolean hasLastPlayedAt() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodePlayStateOrBuilder
    public boolean hasPlayabilityRestriction() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodePlayStateOrBuilder
    public boolean hasTimeLeft() {
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

    public static Builder newBuilder(EpisodePlayState episodePlayState) {
        return DEFAULT_INSTANCE.createBuilder(episodePlayState);
    }

    public static EpisodePlayState parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (EpisodePlayState) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static EpisodePlayState parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (EpisodePlayState) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static EpisodePlayState parseFrom(phc phcVar) {
        return (EpisodePlayState) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static EpisodePlayState parseFrom(phc phcVar, uz00 uz00Var) {
        return (EpisodePlayState) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static EpisodePlayState parseFrom(byte[] bArr) {
        return (EpisodePlayState) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EpisodePlayState parseFrom(byte[] bArr, uz00 uz00Var) {
        return (EpisodePlayState) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static EpisodePlayState parseFrom(InputStream inputStream) {
        return (EpisodePlayState) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodePlayState parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (EpisodePlayState) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static EpisodePlayState parseFrom(lwg lwgVar) {
        return (EpisodePlayState) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static EpisodePlayState parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (EpisodePlayState) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
