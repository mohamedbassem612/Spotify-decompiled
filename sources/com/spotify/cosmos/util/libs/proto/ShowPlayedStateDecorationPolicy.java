package com.spotify.cosmos.util.libs.proto;

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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ShowPlayedStateDecorationPolicy extends h implements ShowPlayedStateDecorationPolicyOrBuilder {
    private static final ShowPlayedStateDecorationPolicy DEFAULT_INSTANCE;
    public static final int IS_PLAYABLE_FIELD_NUMBER = 3;
    public static final int LABEL_FIELD_NUMBER = 5;
    public static final int LATEST_PLAYED_EPISODE_LINK_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYABILITY_RESTRICTION_FIELD_NUMBER = 4;
    public static final int PLAYED_TIME_FIELD_NUMBER = 2;
    public static final int RESUME_EPISODE_LINK_FIELD_NUMBER = 7;
    private boolean isPlayable_;
    private boolean label_;
    private boolean latestPlayedEpisodeLink_;
    private boolean playabilityRestriction_;
    private boolean playedTime_;
    private boolean resumeEpisodeLink_;

    /* JADX INFO: renamed from: com.spotify.cosmos.util.libs.proto.ShowPlayedStateDecorationPolicy$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[jf40.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        ShowPlayedStateDecorationPolicy showPlayedStateDecorationPolicy = new ShowPlayedStateDecorationPolicy();
        DEFAULT_INSTANCE = showPlayedStateDecorationPolicy;
        h.registerDefaultInstance(ShowPlayedStateDecorationPolicy.class, showPlayedStateDecorationPolicy);
    }

    private ShowPlayedStateDecorationPolicy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPlayable() {
        this.isPlayable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabel() {
        this.label_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatestPlayedEpisodeLink() {
        this.latestPlayedEpisodeLink_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayabilityRestriction() {
        this.playabilityRestriction_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayedTime() {
        this.playedTime_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResumeEpisodeLink() {
        this.resumeEpisodeLink_ = false;
    }

    public static ShowPlayedStateDecorationPolicy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ShowPlayedStateDecorationPolicy parseDelimitedFrom(InputStream inputStream) {
        return (ShowPlayedStateDecorationPolicy) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ShowPlayedStateDecorationPolicy parseFrom(ByteBuffer byteBuffer) {
        return (ShowPlayedStateDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPlayable(boolean z) {
        this.isPlayable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabel(boolean z) {
        this.label_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatestPlayedEpisodeLink(boolean z) {
        this.latestPlayedEpisodeLink_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayabilityRestriction(boolean z) {
        this.playabilityRestriction_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayedTime(boolean z) {
        this.playedTime_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResumeEpisodeLink(boolean z) {
        this.resumeEpisodeLink_ = z;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0007\u0007", new Object[]{"latestPlayedEpisodeLink_", "playedTime_", "isPlayable_", "playabilityRestriction_", "label_", "resumeEpisodeLink_"});
        }
        if (iOrdinal == 3) {
            return new ShowPlayedStateDecorationPolicy();
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
        synchronized (ShowPlayedStateDecorationPolicy.class) {
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

    @Override // com.spotify.cosmos.util.libs.proto.ShowPlayedStateDecorationPolicyOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.libs.proto.ShowPlayedStateDecorationPolicyOrBuilder
    public boolean getIsPlayable() {
        return this.isPlayable_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.ShowPlayedStateDecorationPolicyOrBuilder
    public boolean getLabel() {
        return this.label_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.ShowPlayedStateDecorationPolicyOrBuilder
    public boolean getLatestPlayedEpisodeLink() {
        return this.latestPlayedEpisodeLink_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.ShowPlayedStateDecorationPolicyOrBuilder
    public boolean getPlayabilityRestriction() {
        return this.playabilityRestriction_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.ShowPlayedStateDecorationPolicyOrBuilder
    public boolean getPlayedTime() {
        return this.playedTime_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.ShowPlayedStateDecorationPolicyOrBuilder
    public boolean getResumeEpisodeLink() {
        return this.resumeEpisodeLink_;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements ShowPlayedStateDecorationPolicyOrBuilder {
        private Builder() {
            super(ShowPlayedStateDecorationPolicy.DEFAULT_INSTANCE);
        }

        public /* bridge */ /* synthetic */ s2j0 build() {
            return build();
        }

        public /* bridge */ /* synthetic */ s2j0 buildPartial() {
            return super.buildPartial();
        }

        public /* bridge */ /* synthetic */ r2j0 clear() {
            return clear();
        }

        public Builder clearIsPlayable() {
            copyOnWrite();
            ((ShowPlayedStateDecorationPolicy) ((g) this).instance).clearIsPlayable();
            return this;
        }

        public Builder clearLabel() {
            copyOnWrite();
            ((ShowPlayedStateDecorationPolicy) ((g) this).instance).clearLabel();
            return this;
        }

        public Builder clearLatestPlayedEpisodeLink() {
            copyOnWrite();
            ((ShowPlayedStateDecorationPolicy) ((g) this).instance).clearLatestPlayedEpisodeLink();
            return this;
        }

        public Builder clearPlayabilityRestriction() {
            copyOnWrite();
            ((ShowPlayedStateDecorationPolicy) ((g) this).instance).clearPlayabilityRestriction();
            return this;
        }

        public Builder clearPlayedTime() {
            copyOnWrite();
            ((ShowPlayedStateDecorationPolicy) ((g) this).instance).clearPlayedTime();
            return this;
        }

        public Builder clearResumeEpisodeLink() {
            copyOnWrite();
            ((ShowPlayedStateDecorationPolicy) ((g) this).instance).clearResumeEpisodeLink();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.cosmos.util.libs.proto.ShowPlayedStateDecorationPolicyOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.cosmos.util.libs.proto.ShowPlayedStateDecorationPolicyOrBuilder
        public boolean getIsPlayable() {
            return ((ShowPlayedStateDecorationPolicy) ((g) this).instance).getIsPlayable();
        }

        @Override // com.spotify.cosmos.util.libs.proto.ShowPlayedStateDecorationPolicyOrBuilder
        public boolean getLabel() {
            return ((ShowPlayedStateDecorationPolicy) ((g) this).instance).getLabel();
        }

        @Override // com.spotify.cosmos.util.libs.proto.ShowPlayedStateDecorationPolicyOrBuilder
        public boolean getLatestPlayedEpisodeLink() {
            return ((ShowPlayedStateDecorationPolicy) ((g) this).instance).getLatestPlayedEpisodeLink();
        }

        @Override // com.spotify.cosmos.util.libs.proto.ShowPlayedStateDecorationPolicyOrBuilder
        public boolean getPlayabilityRestriction() {
            return ((ShowPlayedStateDecorationPolicy) ((g) this).instance).getPlayabilityRestriction();
        }

        @Override // com.spotify.cosmos.util.libs.proto.ShowPlayedStateDecorationPolicyOrBuilder
        public boolean getPlayedTime() {
            return ((ShowPlayedStateDecorationPolicy) ((g) this).instance).getPlayedTime();
        }

        @Override // com.spotify.cosmos.util.libs.proto.ShowPlayedStateDecorationPolicyOrBuilder
        public boolean getResumeEpisodeLink() {
            return ((ShowPlayedStateDecorationPolicy) ((g) this).instance).getResumeEpisodeLink();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1335mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setIsPlayable(boolean z) {
            copyOnWrite();
            ((ShowPlayedStateDecorationPolicy) ((g) this).instance).setIsPlayable(z);
            return this;
        }

        public Builder setLabel(boolean z) {
            copyOnWrite();
            ((ShowPlayedStateDecorationPolicy) ((g) this).instance).setLabel(z);
            return this;
        }

        public Builder setLatestPlayedEpisodeLink(boolean z) {
            copyOnWrite();
            ((ShowPlayedStateDecorationPolicy) ((g) this).instance).setLatestPlayedEpisodeLink(z);
            return this;
        }

        public Builder setPlayabilityRestriction(boolean z) {
            copyOnWrite();
            ((ShowPlayedStateDecorationPolicy) ((g) this).instance).setPlayabilityRestriction(z);
            return this;
        }

        public Builder setPlayedTime(boolean z) {
            copyOnWrite();
            ((ShowPlayedStateDecorationPolicy) ((g) this).instance).setPlayedTime(z);
            return this;
        }

        public Builder setResumeEpisodeLink(boolean z) {
            copyOnWrite();
            ((ShowPlayedStateDecorationPolicy) ((g) this).instance).setResumeEpisodeLink(z);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1334clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1336mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m1333clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1337mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
            return super.mergeFrom(bArr, i, i2, uz00Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream) {
            return super/*p.r8*/.mergeFrom(inputStream);
        }

        public /* synthetic */ Builder(int i) {
            this();
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(InputStream inputStream, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(inputStream, uz00Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar) {
            return super/*p.r8*/.mergeFrom(phcVar);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(phc phcVar, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(phcVar, uz00Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar) {
            return super/*p.r8*/.mergeFrom(lwgVar);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(s2j0 s2j0Var) {
            return super/*p.r8*/.mergeFrom(s2j0Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr) {
            return super/*p.r8*/.mergeFrom(bArr);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
            return super.mergeFrom(bArr, i, i2, uz00Var);
        }

        public /* bridge */ /* synthetic */ r2j0 mergeFrom(byte[] bArr, uz00 uz00Var) {
            return super/*p.r8*/.mergeFrom(bArr, uz00Var);
        }
    }

    public static Builder newBuilder(ShowPlayedStateDecorationPolicy showPlayedStateDecorationPolicy) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(showPlayedStateDecorationPolicy);
    }

    public static ShowPlayedStateDecorationPolicy parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (ShowPlayedStateDecorationPolicy) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ShowPlayedStateDecorationPolicy parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (ShowPlayedStateDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static ShowPlayedStateDecorationPolicy parseFrom(phc phcVar) {
        return (ShowPlayedStateDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static ShowPlayedStateDecorationPolicy parseFrom(phc phcVar, uz00 uz00Var) {
        return (ShowPlayedStateDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static ShowPlayedStateDecorationPolicy parseFrom(byte[] bArr) {
        return (ShowPlayedStateDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ShowPlayedStateDecorationPolicy parseFrom(byte[] bArr, uz00 uz00Var) {
        return (ShowPlayedStateDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static ShowPlayedStateDecorationPolicy parseFrom(InputStream inputStream) {
        return (ShowPlayedStateDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ShowPlayedStateDecorationPolicy parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (ShowPlayedStateDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ShowPlayedStateDecorationPolicy parseFrom(lwg lwgVar) {
        return (ShowPlayedStateDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static ShowPlayedStateDecorationPolicy parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (ShowPlayedStateDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
