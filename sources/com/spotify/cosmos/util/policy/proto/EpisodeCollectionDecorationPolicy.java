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
public final class EpisodeCollectionDecorationPolicy extends h implements EpisodeCollectionDecorationPolicyOrBuilder {
    private static final EpisodeCollectionDecorationPolicy DEFAULT_INSTANCE;
    public static final int IS_FOLLOWING_SHOW_FIELD_NUMBER = 1;
    public static final int IS_IN_LISTEN_LATER_FIELD_NUMBER = 2;
    public static final int IS_NEW_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER;
    private boolean isFollowingShow_;
    private boolean isInListenLater_;
    private boolean isNew_;

    static {
        EpisodeCollectionDecorationPolicy episodeCollectionDecorationPolicy = new EpisodeCollectionDecorationPolicy();
        DEFAULT_INSTANCE = episodeCollectionDecorationPolicy;
        h.registerDefaultInstance(EpisodeCollectionDecorationPolicy.class, episodeCollectionDecorationPolicy);
    }

    private EpisodeCollectionDecorationPolicy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsFollowingShow() {
        this.isFollowingShow_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsInListenLater() {
        this.isInListenLater_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsNew() {
        this.isNew_ = false;
    }

    public static EpisodeCollectionDecorationPolicy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static EpisodeCollectionDecorationPolicy parseDelimitedFrom(InputStream inputStream) {
        return (EpisodeCollectionDecorationPolicy) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodeCollectionDecorationPolicy parseFrom(ByteBuffer byteBuffer) {
        return (EpisodeCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsFollowingShow(boolean z) {
        this.isFollowingShow_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsInListenLater(boolean z) {
        this.isInListenLater_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsNew(boolean z) {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007", new Object[]{"isFollowingShow_", "isInListenLater_", "isNew_"});
        }
        if (iOrdinal == 3) {
            return new EpisodeCollectionDecorationPolicy();
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
        synchronized (EpisodeCollectionDecorationPolicy.class) {
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

    @Override // com.spotify.cosmos.util.policy.proto.EpisodeCollectionDecorationPolicyOrBuilder
    public boolean getIsFollowingShow() {
        return this.isFollowingShow_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.EpisodeCollectionDecorationPolicyOrBuilder
    public boolean getIsInListenLater() {
        return this.isInListenLater_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.EpisodeCollectionDecorationPolicyOrBuilder
    public boolean getIsNew() {
        return this.isNew_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements EpisodeCollectionDecorationPolicyOrBuilder {
        private Builder() {
            super(EpisodeCollectionDecorationPolicy.DEFAULT_INSTANCE);
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

        public Builder clearIsFollowingShow() {
            copyOnWrite();
            ((EpisodeCollectionDecorationPolicy) this.instance).clearIsFollowingShow();
            return this;
        }

        public Builder clearIsInListenLater() {
            copyOnWrite();
            ((EpisodeCollectionDecorationPolicy) this.instance).clearIsInListenLater();
            return this;
        }

        public Builder clearIsNew() {
            copyOnWrite();
            ((EpisodeCollectionDecorationPolicy) this.instance).clearIsNew();
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

        @Override // com.spotify.cosmos.util.policy.proto.EpisodeCollectionDecorationPolicyOrBuilder
        public boolean getIsFollowingShow() {
            return ((EpisodeCollectionDecorationPolicy) this.instance).getIsFollowingShow();
        }

        @Override // com.spotify.cosmos.util.policy.proto.EpisodeCollectionDecorationPolicyOrBuilder
        public boolean getIsInListenLater() {
            return ((EpisodeCollectionDecorationPolicy) this.instance).getIsInListenLater();
        }

        @Override // com.spotify.cosmos.util.policy.proto.EpisodeCollectionDecorationPolicyOrBuilder
        public boolean getIsNew() {
            return ((EpisodeCollectionDecorationPolicy) this.instance).getIsNew();
        }

        @Override // com.google.protobuf.g, p.r8
        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        @Override // com.google.protobuf.g, p.r8, p.r2j0
        public /* bridge */ /* synthetic */ r8 mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setIsFollowingShow(boolean z) {
            copyOnWrite();
            ((EpisodeCollectionDecorationPolicy) this.instance).setIsFollowingShow(z);
            return this;
        }

        public Builder setIsInListenLater(boolean z) {
            copyOnWrite();
            ((EpisodeCollectionDecorationPolicy) this.instance).setIsInListenLater(z);
            return this;
        }

        public Builder setIsNew(boolean z) {
            copyOnWrite();
            ((EpisodeCollectionDecorationPolicy) this.instance).setIsNew(z);
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

    public static Builder newBuilder(EpisodeCollectionDecorationPolicy episodeCollectionDecorationPolicy) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(episodeCollectionDecorationPolicy);
    }

    public static EpisodeCollectionDecorationPolicy parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (EpisodeCollectionDecorationPolicy) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static EpisodeCollectionDecorationPolicy parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (EpisodeCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static EpisodeCollectionDecorationPolicy parseFrom(phc phcVar) {
        return (EpisodeCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static EpisodeCollectionDecorationPolicy parseFrom(phc phcVar, uz00 uz00Var) {
        return (EpisodeCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static EpisodeCollectionDecorationPolicy parseFrom(byte[] bArr) {
        return (EpisodeCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EpisodeCollectionDecorationPolicy parseFrom(byte[] bArr, uz00 uz00Var) {
        return (EpisodeCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static EpisodeCollectionDecorationPolicy parseFrom(InputStream inputStream) {
        return (EpisodeCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodeCollectionDecorationPolicy parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (EpisodeCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static EpisodeCollectionDecorationPolicy parseFrom(lwg lwgVar) {
        return (EpisodeCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static EpisodeCollectionDecorationPolicy parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (EpisodeCollectionDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
