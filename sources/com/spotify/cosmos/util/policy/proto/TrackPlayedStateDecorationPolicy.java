package com.spotify.cosmos.util.policy.proto;

import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p.bf40;
import p.jf40;
import p.lwg;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.r8;
import p.s2j0;
import p.s8;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class TrackPlayedStateDecorationPolicy extends h implements TrackPlayedStateDecorationPolicyOrBuilder {
    private static final TrackPlayedStateDecorationPolicy DEFAULT_INSTANCE;
    public static final int IS_CURRENTLY_PLAYABLE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYABILITY_RESTRICTION_FIELD_NUMBER = 3;
    public static final int PLAYABLE_FIELD_NUMBER = 1;
    private boolean isCurrentlyPlayable_;
    private boolean playabilityRestriction_;
    private boolean playable_;

    static {
        TrackPlayedStateDecorationPolicy trackPlayedStateDecorationPolicy = new TrackPlayedStateDecorationPolicy();
        DEFAULT_INSTANCE = trackPlayedStateDecorationPolicy;
        h.registerDefaultInstance(TrackPlayedStateDecorationPolicy.class, trackPlayedStateDecorationPolicy);
    }

    private TrackPlayedStateDecorationPolicy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsCurrentlyPlayable() {
        this.isCurrentlyPlayable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayabilityRestriction() {
        this.playabilityRestriction_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayable() {
        this.playable_ = false;
    }

    public static TrackPlayedStateDecorationPolicy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TrackPlayedStateDecorationPolicy parseDelimitedFrom(InputStream inputStream) {
        return (TrackPlayedStateDecorationPolicy) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrackPlayedStateDecorationPolicy parseFrom(ByteBuffer byteBuffer) {
        return (TrackPlayedStateDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsCurrentlyPlayable(boolean z) {
        this.isCurrentlyPlayable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayabilityRestriction(boolean z) {
        this.playabilityRestriction_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayable(boolean z) {
        this.playable_ = z;
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007", new Object[]{"playable_", "isCurrentlyPlayable_", "playabilityRestriction_"});
        }
        if (iOrdinal == 3) {
            return new TrackPlayedStateDecorationPolicy();
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
        synchronized (TrackPlayedStateDecorationPolicy.class) {
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

    @Override // com.spotify.cosmos.util.policy.proto.TrackPlayedStateDecorationPolicyOrBuilder
    public boolean getIsCurrentlyPlayable() {
        return this.isCurrentlyPlayable_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.TrackPlayedStateDecorationPolicyOrBuilder
    public boolean getPlayabilityRestriction() {
        return this.playabilityRestriction_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.TrackPlayedStateDecorationPolicyOrBuilder
    public boolean getPlayable() {
        return this.playable_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements TrackPlayedStateDecorationPolicyOrBuilder {
        private Builder() {
            super(TrackPlayedStateDecorationPolicy.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.g, p.r2j0
        public /* bridge */ /* synthetic */ s2j0 build() {
            return build();
        }

        @Override // com.google.protobuf.g, p.r2j0
        public /* bridge */ /* synthetic */ s2j0 buildPartial() {
            return super.buildPartial();
        }

        @Override // com.google.protobuf.g
        /* JADX INFO: renamed from: clear */
        public /* bridge */ /* synthetic */ r2j0 mo0clear() {
            return mo0clear();
        }

        public Builder clearIsCurrentlyPlayable() {
            copyOnWrite();
            ((TrackPlayedStateDecorationPolicy) this.instance).clearIsCurrentlyPlayable();
            return this;
        }

        public Builder clearPlayabilityRestriction() {
            copyOnWrite();
            ((TrackPlayedStateDecorationPolicy) this.instance).clearPlayabilityRestriction();
            return this;
        }

        public Builder clearPlayable() {
            copyOnWrite();
            ((TrackPlayedStateDecorationPolicy) this.instance).clearPlayable();
            return this;
        }

        @Override // com.google.protobuf.g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo3clone() {
            return super.mo1clone();
        }

        @Override // com.google.protobuf.g, p.v2j0
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.cosmos.util.policy.proto.TrackPlayedStateDecorationPolicyOrBuilder
        public boolean getIsCurrentlyPlayable() {
            return ((TrackPlayedStateDecorationPolicy) this.instance).getIsCurrentlyPlayable();
        }

        @Override // com.spotify.cosmos.util.policy.proto.TrackPlayedStateDecorationPolicyOrBuilder
        public boolean getPlayabilityRestriction() {
            return ((TrackPlayedStateDecorationPolicy) this.instance).getPlayabilityRestriction();
        }

        @Override // com.spotify.cosmos.util.policy.proto.TrackPlayedStateDecorationPolicyOrBuilder
        public boolean getPlayable() {
            return ((TrackPlayedStateDecorationPolicy) this.instance).getPlayable();
        }

        @Override // com.google.protobuf.g, p.r8
        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        @Override // com.google.protobuf.g, p.r8, p.r2j0
        public /* bridge */ /* synthetic */ r8 mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setIsCurrentlyPlayable(boolean z) {
            copyOnWrite();
            ((TrackPlayedStateDecorationPolicy) this.instance).setIsCurrentlyPlayable(z);
            return this;
        }

        public Builder setPlayabilityRestriction(boolean z) {
            copyOnWrite();
            ((TrackPlayedStateDecorationPolicy) this.instance).setPlayabilityRestriction(z);
            return this;
        }

        public Builder setPlayable(boolean z) {
            copyOnWrite();
            ((TrackPlayedStateDecorationPolicy) this.instance).setPlayable(z);
            return this;
        }

        @Override // com.google.protobuf.g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ r8 mo2clone() {
            return super.mo1clone();
        }

        @Override // com.google.protobuf.g, p.r8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ r8 mo4mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo4mergeFrom(bArr, i, i2);
        }

        @Override // com.google.protobuf.g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ r2j0 mo2clone() {
            return super.mo1clone();
        }

        @Override // com.google.protobuf.g, p.r8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ r8 mo5mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
            return super.mo5mergeFrom(bArr, i, i2, uz00Var);
        }

        @Override // p.r8
        public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
            return super.mergeFrom(inputStream);
        }

        public /* synthetic */ Builder(int i) {
            this();
        }

        @Override // p.r8
        public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
            return super.mergeFrom(inputStream, uz00Var);
        }

        @Override // p.r8
        public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
            return super.mergeFrom(phcVar);
        }

        @Override // p.r8
        public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
            return super.mergeFrom(phcVar, uz00Var);
        }

        @Override // p.r8
        public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
            return super.mergeFrom(lwgVar);
        }

        @Override // com.google.protobuf.g, p.r2j0
        public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        @Override // p.r8, p.r2j0
        public /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
            return super.mergeFrom(s2j0Var);
        }

        @Override // p.r8
        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
            return super.mergeFrom(bArr);
        }

        @Override // com.google.protobuf.g
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ r2j0 mo4mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo4mergeFrom(bArr, i, i2);
        }

        @Override // com.google.protobuf.g
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ r2j0 mo5mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
            return super.mo5mergeFrom(bArr, i, i2, uz00Var);
        }

        @Override // p.r8
        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
            return super.mergeFrom(bArr, uz00Var);
        }
    }

    public static Builder newBuilder(TrackPlayedStateDecorationPolicy trackPlayedStateDecorationPolicy) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(trackPlayedStateDecorationPolicy);
    }

    public static TrackPlayedStateDecorationPolicy parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (TrackPlayedStateDecorationPolicy) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static TrackPlayedStateDecorationPolicy parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (TrackPlayedStateDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static TrackPlayedStateDecorationPolicy parseFrom(phc phcVar) {
        return (TrackPlayedStateDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static TrackPlayedStateDecorationPolicy parseFrom(phc phcVar, uz00 uz00Var) {
        return (TrackPlayedStateDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static TrackPlayedStateDecorationPolicy parseFrom(byte[] bArr) {
        return (TrackPlayedStateDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TrackPlayedStateDecorationPolicy parseFrom(byte[] bArr, uz00 uz00Var) {
        return (TrackPlayedStateDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static TrackPlayedStateDecorationPolicy parseFrom(InputStream inputStream) {
        return (TrackPlayedStateDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrackPlayedStateDecorationPolicy parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (TrackPlayedStateDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static TrackPlayedStateDecorationPolicy parseFrom(lwg lwgVar) {
        return (TrackPlayedStateDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static TrackPlayedStateDecorationPolicy parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (TrackPlayedStateDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
