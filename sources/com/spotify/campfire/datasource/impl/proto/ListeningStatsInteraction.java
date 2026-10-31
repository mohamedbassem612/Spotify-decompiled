package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.g;
import com.google.protobuf.h;
import com.google.type.Interval;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p.bf40;
import p.f890;
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
public final class ListeningStatsInteraction extends h implements ListeningStatsInteractionOrBuilder {
    public static final int CONTRIBUTION_URI_FIELD_NUMBER = 5;
    private static final ListeningStatsInteraction DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int REACTION_FIELD_NUMBER = 4;
    public static final int TIME_RANGE_FIELD_NUMBER = 1;
    public static final int TOP_ARTIST_FIELD_NUMBER = 3;
    public static final int TOP_TRACK_FIELD_NUMBER = 2;
    private int bitField0_;
    private Object content_;
    private Interval timeRange_;
    private int contentCase_ = 0;
    private String reaction_ = "";
    private String contributionUri_ = "";

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.ListeningStatsInteraction$1, reason: invalid class name */
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
        ListeningStatsInteraction listeningStatsInteraction = new ListeningStatsInteraction();
        DEFAULT_INSTANCE = listeningStatsInteraction;
        h.registerDefaultInstance(ListeningStatsInteraction.class, listeningStatsInteraction);
    }

    private ListeningStatsInteraction() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.contentCase_ = 0;
        this.content_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContributionUri() {
        this.bitField0_ &= -3;
        this.contributionUri_ = getDefaultInstance().getContributionUri();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReaction() {
        this.reaction_ = getDefaultInstance().getReaction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeRange() {
        this.timeRange_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTopArtist() {
        if (this.contentCase_ == 3) {
            this.contentCase_ = 0;
            this.content_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTopTrack() {
        if (this.contentCase_ == 2) {
            this.contentCase_ = 0;
            this.content_ = null;
        }
    }

    public static ListeningStatsInteraction getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTimeRange(Interval interval) {
        interval.getClass();
        Interval interval2 = this.timeRange_;
        if (interval2 == null || interval2 == Interval.n()) {
            this.timeRange_ = interval;
        } else {
            this.timeRange_ = (Interval) ((f890) Interval.t(this.timeRange_).mergeFrom(interval)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTopArtist(ListeningStatsTopArtistContent listeningStatsTopArtistContent) {
        listeningStatsTopArtistContent.getClass();
        if (this.contentCase_ != 3 || this.content_ == ListeningStatsTopArtistContent.getDefaultInstance()) {
            this.content_ = listeningStatsTopArtistContent;
        } else {
            this.content_ = ((ListeningStatsTopArtistContent.Builder) ListeningStatsTopArtistContent.newBuilder((ListeningStatsTopArtistContent) this.content_).mergeFrom(listeningStatsTopArtistContent)).buildPartial();
        }
        this.contentCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTopTrack(ListeningStatsTopTrackContent listeningStatsTopTrackContent) {
        listeningStatsTopTrackContent.getClass();
        if (this.contentCase_ != 2 || this.content_ == ListeningStatsTopTrackContent.getDefaultInstance()) {
            this.content_ = listeningStatsTopTrackContent;
        } else {
            this.content_ = ((ListeningStatsTopTrackContent.Builder) ListeningStatsTopTrackContent.newBuilder((ListeningStatsTopTrackContent) this.content_).mergeFrom(listeningStatsTopTrackContent)).buildPartial();
        }
        this.contentCase_ = 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ListeningStatsInteraction parseDelimitedFrom(InputStream inputStream) {
        return (ListeningStatsInteraction) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListeningStatsInteraction parseFrom(ByteBuffer byteBuffer) {
        return (ListeningStatsInteraction) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContributionUri(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.contributionUri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContributionUriBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.contributionUri_ = phcVar.v();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReaction(String str) {
        str.getClass();
        this.reaction_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReactionBytes(phc phcVar) {
        s8.checkByteStringIsUtf8(phcVar);
        this.reaction_ = phcVar.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeRange(Interval interval) {
        interval.getClass();
        this.timeRange_ = interval;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopArtist(ListeningStatsTopArtistContent listeningStatsTopArtistContent) {
        listeningStatsTopArtistContent.getClass();
        this.content_ = listeningStatsTopArtistContent;
        this.contentCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopTrack(ListeningStatsTopTrackContent listeningStatsTopTrackContent) {
        listeningStatsTopTrackContent.getClass();
        this.content_ = listeningStatsTopTrackContent;
        this.contentCase_ = 2;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004Ȉ\u0005ለ\u0001", new Object[]{"content_", "contentCase_", "bitField0_", "timeRange_", ListeningStatsTopTrackContent.class, ListeningStatsTopArtistContent.class, "reaction_", "contributionUri_"});
        }
        if (iOrdinal == 3) {
            return new ListeningStatsInteraction();
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
        synchronized (ListeningStatsInteraction.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.ListeningStatsInteractionOrBuilder
    public ContentCase getContentCase() {
        return ContentCase.forNumber(this.contentCase_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ListeningStatsInteractionOrBuilder
    public String getContributionUri() {
        return this.contributionUri_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ListeningStatsInteractionOrBuilder
    public phc getContributionUriBytes() {
        return phc.i(this.contributionUri_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ListeningStatsInteractionOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ListeningStatsInteractionOrBuilder
    public String getReaction() {
        return this.reaction_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ListeningStatsInteractionOrBuilder
    public phc getReactionBytes() {
        return phc.i(this.reaction_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ListeningStatsInteractionOrBuilder
    public Interval getTimeRange() {
        Interval interval = this.timeRange_;
        return interval == null ? Interval.n() : interval;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ListeningStatsInteractionOrBuilder
    public ListeningStatsTopArtistContent getTopArtist() {
        return this.contentCase_ == 3 ? (ListeningStatsTopArtistContent) this.content_ : ListeningStatsTopArtistContent.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ListeningStatsInteractionOrBuilder
    public ListeningStatsTopTrackContent getTopTrack() {
        return this.contentCase_ == 2 ? (ListeningStatsTopTrackContent) this.content_ : ListeningStatsTopTrackContent.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ListeningStatsInteractionOrBuilder
    public boolean hasContributionUri() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ListeningStatsInteractionOrBuilder
    public boolean hasTimeRange() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ListeningStatsInteractionOrBuilder
    public boolean hasTopArtist() {
        return this.contentCase_ == 3;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ListeningStatsInteractionOrBuilder
    public boolean hasTopTrack() {
        return this.contentCase_ == 2;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements ListeningStatsInteractionOrBuilder {
        private Builder() {
            super(ListeningStatsInteraction.DEFAULT_INSTANCE);
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

        public Builder clearContent() {
            copyOnWrite();
            ((ListeningStatsInteraction) ((g) this).instance).clearContent();
            return this;
        }

        public Builder clearContributionUri() {
            copyOnWrite();
            ((ListeningStatsInteraction) ((g) this).instance).clearContributionUri();
            return this;
        }

        public Builder clearReaction() {
            copyOnWrite();
            ((ListeningStatsInteraction) ((g) this).instance).clearReaction();
            return this;
        }

        public Builder clearTimeRange() {
            copyOnWrite();
            ((ListeningStatsInteraction) ((g) this).instance).clearTimeRange();
            return this;
        }

        public Builder clearTopArtist() {
            copyOnWrite();
            ((ListeningStatsInteraction) ((g) this).instance).clearTopArtist();
            return this;
        }

        public Builder clearTopTrack() {
            copyOnWrite();
            ((ListeningStatsInteraction) ((g) this).instance).clearTopTrack();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ListeningStatsInteractionOrBuilder
        public ContentCase getContentCase() {
            return ((ListeningStatsInteraction) ((g) this).instance).getContentCase();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ListeningStatsInteractionOrBuilder
        public String getContributionUri() {
            return ((ListeningStatsInteraction) ((g) this).instance).getContributionUri();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ListeningStatsInteractionOrBuilder
        public phc getContributionUriBytes() {
            return ((ListeningStatsInteraction) ((g) this).instance).getContributionUriBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ListeningStatsInteractionOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ListeningStatsInteractionOrBuilder
        public String getReaction() {
            return ((ListeningStatsInteraction) ((g) this).instance).getReaction();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ListeningStatsInteractionOrBuilder
        public phc getReactionBytes() {
            return ((ListeningStatsInteraction) ((g) this).instance).getReactionBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ListeningStatsInteractionOrBuilder
        public Interval getTimeRange() {
            return ((ListeningStatsInteraction) ((g) this).instance).getTimeRange();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ListeningStatsInteractionOrBuilder
        public ListeningStatsTopArtistContent getTopArtist() {
            return ((ListeningStatsInteraction) ((g) this).instance).getTopArtist();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ListeningStatsInteractionOrBuilder
        public ListeningStatsTopTrackContent getTopTrack() {
            return ((ListeningStatsInteraction) ((g) this).instance).getTopTrack();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ListeningStatsInteractionOrBuilder
        public boolean hasContributionUri() {
            return ((ListeningStatsInteraction) ((g) this).instance).hasContributionUri();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ListeningStatsInteractionOrBuilder
        public boolean hasTimeRange() {
            return ((ListeningStatsInteraction) ((g) this).instance).hasTimeRange();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ListeningStatsInteractionOrBuilder
        public boolean hasTopArtist() {
            return ((ListeningStatsInteraction) ((g) this).instance).hasTopArtist();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ListeningStatsInteractionOrBuilder
        public boolean hasTopTrack() {
            return ((ListeningStatsInteraction) ((g) this).instance).hasTopTrack();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m489mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder mergeTimeRange(Interval interval) {
            copyOnWrite();
            ((ListeningStatsInteraction) ((g) this).instance).mergeTimeRange(interval);
            return this;
        }

        public Builder mergeTopArtist(ListeningStatsTopArtistContent listeningStatsTopArtistContent) {
            copyOnWrite();
            ((ListeningStatsInteraction) ((g) this).instance).mergeTopArtist(listeningStatsTopArtistContent);
            return this;
        }

        public Builder mergeTopTrack(ListeningStatsTopTrackContent listeningStatsTopTrackContent) {
            copyOnWrite();
            ((ListeningStatsInteraction) ((g) this).instance).mergeTopTrack(listeningStatsTopTrackContent);
            return this;
        }

        public Builder setContributionUri(String str) {
            copyOnWrite();
            ((ListeningStatsInteraction) ((g) this).instance).setContributionUri(str);
            return this;
        }

        public Builder setContributionUriBytes(phc phcVar) {
            copyOnWrite();
            ((ListeningStatsInteraction) ((g) this).instance).setContributionUriBytes(phcVar);
            return this;
        }

        public Builder setReaction(String str) {
            copyOnWrite();
            ((ListeningStatsInteraction) ((g) this).instance).setReaction(str);
            return this;
        }

        public Builder setReactionBytes(phc phcVar) {
            copyOnWrite();
            ((ListeningStatsInteraction) ((g) this).instance).setReactionBytes(phcVar);
            return this;
        }

        public Builder setTimeRange(f890 f890Var) {
            copyOnWrite();
            ((ListeningStatsInteraction) ((g) this).instance).setTimeRange((Interval) f890Var.build());
            return this;
        }

        public Builder setTopArtist(ListeningStatsTopArtistContent.Builder builder) {
            copyOnWrite();
            ((ListeningStatsInteraction) ((g) this).instance).setTopArtist((ListeningStatsTopArtistContent) builder.build());
            return this;
        }

        public Builder setTopTrack(ListeningStatsTopTrackContent.Builder builder) {
            copyOnWrite();
            ((ListeningStatsInteraction) ((g) this).instance).setTopTrack((ListeningStatsTopTrackContent) builder.build());
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m488clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m490mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m487clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m491mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder setTimeRange(Interval interval) {
            copyOnWrite();
            ((ListeningStatsInteraction) ((g) this).instance).setTimeRange(interval);
            return this;
        }

        public Builder setTopArtist(ListeningStatsTopArtistContent listeningStatsTopArtistContent) {
            copyOnWrite();
            ((ListeningStatsInteraction) ((g) this).instance).setTopArtist(listeningStatsTopArtistContent);
            return this;
        }

        public Builder setTopTrack(ListeningStatsTopTrackContent listeningStatsTopTrackContent) {
            copyOnWrite();
            ((ListeningStatsInteraction) ((g) this).instance).setTopTrack(listeningStatsTopTrackContent);
            return this;
        }
    }

    public enum ContentCase {
        TOP_TRACK(2),
        TOP_ARTIST(3),
        CONTENT_NOT_SET(0);

        private final int value;

        ContentCase(int i) {
            this.value = i;
        }

        public static ContentCase forNumber(int i) {
            if (i == 0) {
                return CONTENT_NOT_SET;
            }
            if (i == 2) {
                return TOP_TRACK;
            }
            if (i != 3) {
                return null;
            }
            return TOP_ARTIST;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static ContentCase valueOf(int i) {
            return forNumber(i);
        }
    }

    public static Builder newBuilder(ListeningStatsInteraction listeningStatsInteraction) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(listeningStatsInteraction);
    }

    public static ListeningStatsInteraction parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (ListeningStatsInteraction) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ListeningStatsInteraction parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (ListeningStatsInteraction) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static ListeningStatsInteraction parseFrom(phc phcVar) {
        return (ListeningStatsInteraction) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static ListeningStatsInteraction parseFrom(phc phcVar, uz00 uz00Var) {
        return (ListeningStatsInteraction) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static ListeningStatsInteraction parseFrom(byte[] bArr) {
        return (ListeningStatsInteraction) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ListeningStatsInteraction parseFrom(byte[] bArr, uz00 uz00Var) {
        return (ListeningStatsInteraction) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static ListeningStatsInteraction parseFrom(InputStream inputStream) {
        return (ListeningStatsInteraction) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListeningStatsInteraction parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (ListeningStatsInteraction) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static ListeningStatsInteraction parseFrom(lwg lwgVar) {
        return (ListeningStatsInteraction) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static ListeningStatsInteraction parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (ListeningStatsInteraction) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
