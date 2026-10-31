package com.spotify.cosmos.util.proto;

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
import p.v190;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ShowPlayState extends h implements ShowPlayStateOrBuilder {
    private static final ShowPlayState DEFAULT_INSTANCE;
    public static final int IS_PLAYABLE_FIELD_NUMBER = 3;
    public static final int LABEL_FIELD_NUMBER = 5;
    public static final int LATEST_PLAYED_EPISODE_LINK_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYABILITY_RESTRICTION_FIELD_NUMBER = 4;
    public static final int PLAYED_PERCENTAGE_FIELD_NUMBER = 6;
    public static final int PLAYED_TIME_FIELD_NUMBER = 2;
    public static final int RESUME_EPISODE_LINK_FIELD_NUMBER = 7;
    private int bitField0_;
    private boolean isPlayable_;
    private int label_;
    private int playabilityRestriction_;
    private int playedPercentage_;
    private long playedTime_;
    private String latestPlayedEpisodeLink_ = "";
    private String resumeEpisodeLink_ = "";

    /* JADX INFO: renamed from: com.spotify.cosmos.util.proto.ShowPlayState$1, reason: invalid class name */
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
        ShowPlayState showPlayState = new ShowPlayState();
        DEFAULT_INSTANCE = showPlayState;
        h.registerDefaultInstance(ShowPlayState.class, showPlayState);
    }

    private ShowPlayState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPlayable() {
        this.bitField0_ &= -5;
        this.isPlayable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabel() {
        this.bitField0_ &= -17;
        this.label_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatestPlayedEpisodeLink() {
        this.bitField0_ &= -2;
        this.latestPlayedEpisodeLink_ = getDefaultInstance().getLatestPlayedEpisodeLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayabilityRestriction() {
        this.bitField0_ &= -9;
        this.playabilityRestriction_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayedPercentage() {
        this.bitField0_ &= -33;
        this.playedPercentage_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayedTime() {
        this.bitField0_ &= -3;
        this.playedTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResumeEpisodeLink() {
        this.bitField0_ &= -65;
        this.resumeEpisodeLink_ = getDefaultInstance().getResumeEpisodeLink();
    }

    public static ShowPlayState getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ShowPlayState parseDelimitedFrom(InputStream inputStream) {
        return (ShowPlayState) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ShowPlayState parseFrom(ByteBuffer byteBuffer) {
        return (ShowPlayState) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPlayable(boolean z) {
        this.bitField0_ |= 4;
        this.isPlayable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabel(Label label) {
        this.label_ = label.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatestPlayedEpisodeLink(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.latestPlayedEpisodeLink_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatestPlayedEpisodeLinkBytes(phc phcVar) {
        this.latestPlayedEpisodeLink_ = phcVar.v();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayabilityRestriction(PlayabilityRestriction playabilityRestriction) {
        this.playabilityRestriction_ = playabilityRestriction.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayedPercentage(int i) {
        this.bitField0_ |= 32;
        this.playedPercentage_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayedTime(long j) {
        this.bitField0_ |= 2;
        this.playedTime_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResumeEpisodeLink(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.resumeEpisodeLink_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResumeEpisodeLinkBytes(phc phcVar) {
        this.resumeEpisodeLink_ = phcVar.v();
        this.bitField0_ |= 64;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဃ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ဋ\u0005\u0007ဈ\u0006", new Object[]{"bitField0_", "latestPlayedEpisodeLink_", "playedTime_", "isPlayable_", "playabilityRestriction_", PlayabilityRestriction.internalGetVerifier(), "label_", Label.internalGetVerifier(), "playedPercentage_", "resumeEpisodeLink_"});
        }
        if (iOrdinal == 3) {
            return new ShowPlayState();
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
        synchronized (ShowPlayState.class) {
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

    @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
    public boolean getIsPlayable() {
        return this.isPlayable_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
    public Label getLabel() {
        Label labelForNumber = Label.forNumber(this.label_);
        return labelForNumber == null ? Label.UNKNOWN_LABEL : labelForNumber;
    }

    @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
    public String getLatestPlayedEpisodeLink() {
        return this.latestPlayedEpisodeLink_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
    public phc getLatestPlayedEpisodeLinkBytes() {
        return phc.i(this.latestPlayedEpisodeLink_);
    }

    @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
    public PlayabilityRestriction getPlayabilityRestriction() {
        PlayabilityRestriction playabilityRestrictionForNumber = PlayabilityRestriction.forNumber(this.playabilityRestriction_);
        return playabilityRestrictionForNumber == null ? PlayabilityRestriction.UNKNOWN : playabilityRestrictionForNumber;
    }

    @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
    public int getPlayedPercentage() {
        return this.playedPercentage_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
    public long getPlayedTime() {
        return this.playedTime_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
    public String getResumeEpisodeLink() {
        return this.resumeEpisodeLink_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
    public phc getResumeEpisodeLinkBytes() {
        return phc.i(this.resumeEpisodeLink_);
    }

    @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
    public boolean hasIsPlayable() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
    public boolean hasLabel() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
    public boolean hasLatestPlayedEpisodeLink() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
    public boolean hasPlayabilityRestriction() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
    public boolean hasPlayedPercentage() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
    public boolean hasPlayedTime() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
    public boolean hasResumeEpisodeLink() {
        return (this.bitField0_ & 64) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements ShowPlayStateOrBuilder {
        private Builder() {
            super(ShowPlayState.DEFAULT_INSTANCE);
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
            ((ShowPlayState) ((g) this).instance).clearIsPlayable();
            return this;
        }

        public Builder clearLabel() {
            copyOnWrite();
            ((ShowPlayState) ((g) this).instance).clearLabel();
            return this;
        }

        public Builder clearLatestPlayedEpisodeLink() {
            copyOnWrite();
            ((ShowPlayState) ((g) this).instance).clearLatestPlayedEpisodeLink();
            return this;
        }

        public Builder clearPlayabilityRestriction() {
            copyOnWrite();
            ((ShowPlayState) ((g) this).instance).clearPlayabilityRestriction();
            return this;
        }

        public Builder clearPlayedPercentage() {
            copyOnWrite();
            ((ShowPlayState) ((g) this).instance).clearPlayedPercentage();
            return this;
        }

        public Builder clearPlayedTime() {
            copyOnWrite();
            ((ShowPlayState) ((g) this).instance).clearPlayedTime();
            return this;
        }

        public Builder clearResumeEpisodeLink() {
            copyOnWrite();
            ((ShowPlayState) ((g) this).instance).clearResumeEpisodeLink();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
        public boolean getIsPlayable() {
            return ((ShowPlayState) ((g) this).instance).getIsPlayable();
        }

        @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
        public Label getLabel() {
            return ((ShowPlayState) ((g) this).instance).getLabel();
        }

        @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
        public String getLatestPlayedEpisodeLink() {
            return ((ShowPlayState) ((g) this).instance).getLatestPlayedEpisodeLink();
        }

        @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
        public phc getLatestPlayedEpisodeLinkBytes() {
            return ((ShowPlayState) ((g) this).instance).getLatestPlayedEpisodeLinkBytes();
        }

        @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
        public PlayabilityRestriction getPlayabilityRestriction() {
            return ((ShowPlayState) ((g) this).instance).getPlayabilityRestriction();
        }

        @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
        public int getPlayedPercentage() {
            return ((ShowPlayState) ((g) this).instance).getPlayedPercentage();
        }

        @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
        public long getPlayedTime() {
            return ((ShowPlayState) ((g) this).instance).getPlayedTime();
        }

        @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
        public String getResumeEpisodeLink() {
            return ((ShowPlayState) ((g) this).instance).getResumeEpisodeLink();
        }

        @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
        public phc getResumeEpisodeLinkBytes() {
            return ((ShowPlayState) ((g) this).instance).getResumeEpisodeLinkBytes();
        }

        @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
        public boolean hasIsPlayable() {
            return ((ShowPlayState) ((g) this).instance).hasIsPlayable();
        }

        @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
        public boolean hasLabel() {
            return ((ShowPlayState) ((g) this).instance).hasLabel();
        }

        @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
        public boolean hasLatestPlayedEpisodeLink() {
            return ((ShowPlayState) ((g) this).instance).hasLatestPlayedEpisodeLink();
        }

        @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
        public boolean hasPlayabilityRestriction() {
            return ((ShowPlayState) ((g) this).instance).hasPlayabilityRestriction();
        }

        @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
        public boolean hasPlayedPercentage() {
            return ((ShowPlayState) ((g) this).instance).hasPlayedPercentage();
        }

        @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
        public boolean hasPlayedTime() {
            return ((ShowPlayState) ((g) this).instance).hasPlayedTime();
        }

        @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
        public boolean hasResumeEpisodeLink() {
            return ((ShowPlayState) ((g) this).instance).hasResumeEpisodeLink();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1466mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setIsPlayable(boolean z) {
            copyOnWrite();
            ((ShowPlayState) ((g) this).instance).setIsPlayable(z);
            return this;
        }

        public Builder setLabel(Label label) {
            copyOnWrite();
            ((ShowPlayState) ((g) this).instance).setLabel(label);
            return this;
        }

        public Builder setLatestPlayedEpisodeLink(String str) {
            copyOnWrite();
            ((ShowPlayState) ((g) this).instance).setLatestPlayedEpisodeLink(str);
            return this;
        }

        public Builder setLatestPlayedEpisodeLinkBytes(phc phcVar) {
            copyOnWrite();
            ((ShowPlayState) ((g) this).instance).setLatestPlayedEpisodeLinkBytes(phcVar);
            return this;
        }

        public Builder setPlayabilityRestriction(PlayabilityRestriction playabilityRestriction) {
            copyOnWrite();
            ((ShowPlayState) ((g) this).instance).setPlayabilityRestriction(playabilityRestriction);
            return this;
        }

        public Builder setPlayedPercentage(int i) {
            copyOnWrite();
            ((ShowPlayState) ((g) this).instance).setPlayedPercentage(i);
            return this;
        }

        public Builder setPlayedTime(long j) {
            copyOnWrite();
            ((ShowPlayState) ((g) this).instance).setPlayedTime(j);
            return this;
        }

        public Builder setResumeEpisodeLink(String str) {
            copyOnWrite();
            ((ShowPlayState) ((g) this).instance).setResumeEpisodeLink(str);
            return this;
        }

        public Builder setResumeEpisodeLinkBytes(phc phcVar) {
            copyOnWrite();
            ((ShowPlayState) ((g) this).instance).setResumeEpisodeLinkBytes(phcVar);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1465clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1467mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m1464clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1468mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public enum Label implements v190 {
        UNKNOWN_LABEL(0),
        NOT_STARTED(1),
        IN_PROGRESS(2),
        COMPLETED(3);

        public static final int COMPLETED_VALUE = 3;
        public static final int IN_PROGRESS_VALUE = 2;
        public static final int NOT_STARTED_VALUE = 1;
        public static final int UNKNOWN_LABEL_VALUE = 0;
        private static final y190 internalValueMap = new y190() { // from class: com.spotify.cosmos.util.proto.ShowPlayState.Label.1
            /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
            public Label m1469findValueByNumber(int i) {
                return Label.forNumber(i);
            }
        };
        private final int value;

        public static final class LabelVerifier implements z190 {
            static final z190 INSTANCE = new LabelVerifier();

            private LabelVerifier() {
            }

            public boolean isInRange(int i) {
                return Label.forNumber(i) != null;
            }
        }

        Label(int i) {
            this.value = i;
        }

        public static Label forNumber(int i) {
            if (i == 0) {
                return UNKNOWN_LABEL;
            }
            if (i == 1) {
                return NOT_STARTED;
            }
            if (i == 2) {
                return IN_PROGRESS;
            }
            if (i != 3) {
                return null;
            }
            return COMPLETED;
        }

        public static y190 internalGetValueMap() {
            return internalValueMap;
        }

        public static z190 internalGetVerifier() {
            return LabelVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static Label valueOf(int i) {
            return forNumber(i);
        }
    }

    public static Builder newBuilder(ShowPlayState showPlayState) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(showPlayState);
    }

    public static ShowPlayState parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (ShowPlayState) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ShowPlayState parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (ShowPlayState) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static ShowPlayState parseFrom(phc phcVar) {
        return (ShowPlayState) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static ShowPlayState parseFrom(phc phcVar, uz00 uz00Var) {
        return (ShowPlayState) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static ShowPlayState parseFrom(byte[] bArr) {
        return (ShowPlayState) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ShowPlayState parseFrom(byte[] bArr, uz00 uz00Var) {
        return (ShowPlayState) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static ShowPlayState parseFrom(InputStream inputStream) {
        return (ShowPlayState) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ShowPlayState parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (ShowPlayState) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ShowPlayState parseFrom(lwg lwgVar) {
        return (ShowPlayState) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static ShowPlayState parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (ShowPlayState) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
