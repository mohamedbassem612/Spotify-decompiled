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
public final class TrackPlayState extends h implements TrackPlayStateOrBuilder {
    private static final TrackPlayState DEFAULT_INSTANCE;
    public static final int IS_PLAYABLE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYABILITY_RESTRICTION_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean isPlayable_;
    private int playabilityRestriction_;

    static {
        TrackPlayState trackPlayState = new TrackPlayState();
        DEFAULT_INSTANCE = trackPlayState;
        h.registerDefaultInstance(TrackPlayState.class, trackPlayState);
    }

    private TrackPlayState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPlayable() {
        this.bitField0_ &= -2;
        this.isPlayable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayabilityRestriction() {
        this.bitField0_ &= -3;
        this.playabilityRestriction_ = 0;
    }

    public static TrackPlayState getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TrackPlayState parseDelimitedFrom(InputStream inputStream) {
        return (TrackPlayState) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrackPlayState parseFrom(ByteBuffer byteBuffer) {
        return (TrackPlayState) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPlayable(boolean z) {
        this.bitField0_ |= 1;
        this.isPlayable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayabilityRestriction(PlayabilityRestriction playabilityRestriction) {
        this.playabilityRestriction_ = playabilityRestriction.getNumber();
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001", new Object[]{"bitField0_", "isPlayable_", "playabilityRestriction_", PlayabilityRestriction.internalGetVerifier()});
        }
        if (iOrdinal == 3) {
            return new TrackPlayState();
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
        synchronized (TrackPlayState.class) {
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

    @Override // com.spotify.cosmos.util.proto.TrackPlayStateOrBuilder
    public boolean getIsPlayable() {
        return this.isPlayable_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackPlayStateOrBuilder
    public PlayabilityRestriction getPlayabilityRestriction() {
        PlayabilityRestriction playabilityRestrictionForNumber = PlayabilityRestriction.forNumber(this.playabilityRestriction_);
        return playabilityRestrictionForNumber == null ? PlayabilityRestriction.UNKNOWN : playabilityRestrictionForNumber;
    }

    @Override // com.spotify.cosmos.util.proto.TrackPlayStateOrBuilder
    public boolean hasIsPlayable() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.TrackPlayStateOrBuilder
    public boolean hasPlayabilityRestriction() {
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

    public static Builder newBuilder(TrackPlayState trackPlayState) {
        return DEFAULT_INSTANCE.createBuilder(trackPlayState);
    }

    public static TrackPlayState parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (TrackPlayState) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static TrackPlayState parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (TrackPlayState) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static TrackPlayState parseFrom(phc phcVar) {
        return (TrackPlayState) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static TrackPlayState parseFrom(phc phcVar, uz00 uz00Var) {
        return (TrackPlayState) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static TrackPlayState parseFrom(byte[] bArr) {
        return (TrackPlayState) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TrackPlayState parseFrom(byte[] bArr, uz00 uz00Var) {
        return (TrackPlayState) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static TrackPlayState parseFrom(InputStream inputStream) {
        return (TrackPlayState) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrackPlayState parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (TrackPlayState) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static TrackPlayState parseFrom(lwg lwgVar) {
        return (TrackPlayState) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static TrackPlayState parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (TrackPlayState) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
