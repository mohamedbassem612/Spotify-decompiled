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
public final class EpisodeDecorationPolicy extends h implements EpisodeDecorationPolicyOrBuilder {
    public static final int AVAILABLE_FIELD_NUMBER = 12;
    public static final int BACKGROUNDABLE_FIELD_NUMBER = 15;
    public static final int COVERS_FIELD_NUMBER = 9;
    private static final EpisodeDecorationPolicy DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 7;
    public static final int FREEZE_FRAMES_FIELD_NUMBER = 10;
    public static final int IS_19_PLUS_ONLY_FIELD_NUMBER = 22;
    public static final int IS_BOOK_CHAPTER_FIELD_NUMBER = 23;
    public static final int IS_CURATED_FIELD_NUMBER = 25;
    public static final int IS_EXPLICIT_FIELD_NUMBER = 16;
    public static final int IS_MUSIC_AND_TALK_FIELD_NUMBER = 18;
    public static final int IS_PODCAST_SHORT_FIELD_NUMBER = 24;
    public static final int LANGUAGE_FIELD_NUMBER = 11;
    public static final int LENGTH_FIELD_NUMBER = 2;
    public static final int LINK_FIELD_NUMBER = 1;
    public static final int MANIFEST_ID_FIELD_NUMBER = 4;
    public static final int MEDIA_TYPE_ENUM_FIELD_NUMBER = 13;
    public static final int NAME_FIELD_NUMBER = 3;
    public static final int NUMBER_FIELD_NUMBER = 14;
    private static volatile qzr0 PARSER = null;
    public static final int PODCAST_SEGMENTS_FIELD_NUMBER = 19;
    public static final int PODCAST_SUBSCRIPTION_FIELD_NUMBER = 20;
    public static final int PREVIEW_ID_FIELD_NUMBER = 5;
    public static final int PREVIEW_MANIFEST_ID_FIELD_NUMBER = 6;
    public static final int PUBLISH_DATE_FIELD_NUMBER = 8;
    public static final int TYPE_FIELD_NUMBER = 17;
    private boolean available_;
    private boolean backgroundable_;
    private int bitField0_;
    private boolean covers_;
    private boolean description_;
    private boolean freezeFrames_;
    private boolean is19PlusOnly_;
    private boolean isBookChapter_;
    private boolean isCurated_;
    private boolean isExplicit_;
    private boolean isMusicAndTalk_;
    private boolean isPodcastShort_;
    private boolean language_;
    private boolean length_;
    private boolean link_;
    private boolean manifestId_;
    private boolean mediaTypeEnum_;
    private boolean name_;
    private boolean number_;
    private PodcastSegmentsPolicy podcastSegments_;
    private boolean podcastSubscription_;
    private boolean previewId_;
    private boolean previewManifestId_;
    private boolean publishDate_;
    private boolean type_;

    /* JADX INFO: renamed from: com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy$1, reason: invalid class name */
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
        EpisodeDecorationPolicy episodeDecorationPolicy = new EpisodeDecorationPolicy();
        DEFAULT_INSTANCE = episodeDecorationPolicy;
        h.registerDefaultInstance(EpisodeDecorationPolicy.class, episodeDecorationPolicy);
    }

    private EpisodeDecorationPolicy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvailable() {
        this.available_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackgroundable() {
        this.backgroundable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCovers() {
        this.covers_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFreezeFrames() {
        this.freezeFrames_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIs19PlusOnly() {
        this.is19PlusOnly_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsBookChapter() {
        this.isBookChapter_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsCurated() {
        this.isCurated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsExplicit() {
        this.isExplicit_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsMusicAndTalk() {
        this.isMusicAndTalk_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPodcastShort() {
        this.isPodcastShort_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguage() {
        this.language_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLength() {
        this.length_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLink() {
        this.link_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearManifestId() {
        this.manifestId_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMediaTypeEnum() {
        this.mediaTypeEnum_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumber() {
        this.number_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPodcastSegments() {
        this.podcastSegments_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPodcastSubscription() {
        this.podcastSubscription_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreviewId() {
        this.previewId_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreviewManifestId() {
        this.previewManifestId_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublishDate() {
        this.publishDate_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = false;
    }

    public static EpisodeDecorationPolicy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePodcastSegments(PodcastSegmentsPolicy podcastSegmentsPolicy) {
        podcastSegmentsPolicy.getClass();
        PodcastSegmentsPolicy podcastSegmentsPolicy2 = this.podcastSegments_;
        if (podcastSegmentsPolicy2 == null || podcastSegmentsPolicy2 == PodcastSegmentsPolicy.getDefaultInstance()) {
            this.podcastSegments_ = podcastSegmentsPolicy;
        } else {
            this.podcastSegments_ = (PodcastSegmentsPolicy) ((PodcastSegmentsPolicy.Builder) PodcastSegmentsPolicy.newBuilder(this.podcastSegments_).mergeFrom(podcastSegmentsPolicy)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static EpisodeDecorationPolicy parseDelimitedFrom(InputStream inputStream) {
        return (EpisodeDecorationPolicy) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodeDecorationPolicy parseFrom(ByteBuffer byteBuffer) {
        return (EpisodeDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvailable(boolean z) {
        this.available_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackgroundable(boolean z) {
        this.backgroundable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCovers(boolean z) {
        this.covers_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(boolean z) {
        this.description_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFreezeFrames(boolean z) {
        this.freezeFrames_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIs19PlusOnly(boolean z) {
        this.is19PlusOnly_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsBookChapter(boolean z) {
        this.isBookChapter_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsCurated(boolean z) {
        this.isCurated_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsExplicit(boolean z) {
        this.isExplicit_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsMusicAndTalk(boolean z) {
        this.isMusicAndTalk_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPodcastShort(boolean z) {
        this.isPodcastShort_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguage(boolean z) {
        this.language_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLength(boolean z) {
        this.length_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLink(boolean z) {
        this.link_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setManifestId(boolean z) {
        this.manifestId_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediaTypeEnum(boolean z) {
        this.mediaTypeEnum_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(boolean z) {
        this.name_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumber(boolean z) {
        this.number_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPodcastSegments(PodcastSegmentsPolicy podcastSegmentsPolicy) {
        podcastSegmentsPolicy.getClass();
        this.podcastSegments_ = podcastSegmentsPolicy;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPodcastSubscription(boolean z) {
        this.podcastSubscription_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviewId(boolean z) {
        this.previewId_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviewManifestId(boolean z) {
        this.previewManifestId_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublishDate(boolean z) {
        this.publishDate_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(boolean z) {
        this.type_ = z;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0018\u0000\u0001\u0001\u0019\u0018\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\u0007\u0007\b\u0007\t\u0007\n\u0007\u000b\u0007\f\u0007\r\u0007\u000e\u0007\u000f\u0007\u0010\u0007\u0011\u0007\u0012\u0007\u0013ဉ\u0000\u0014\u0007\u0016\u0007\u0017\u0007\u0018\u0007\u0019\u0007", new Object[]{"bitField0_", "link_", "length_", "name_", "manifestId_", "previewId_", "previewManifestId_", "description_", "publishDate_", "covers_", "freezeFrames_", "language_", "available_", "mediaTypeEnum_", "number_", "backgroundable_", "isExplicit_", "type_", "isMusicAndTalk_", "podcastSegments_", "podcastSubscription_", "is19PlusOnly_", "isBookChapter_", "isPodcastShort_", "isCurated_"});
        }
        if (iOrdinal == 3) {
            return new EpisodeDecorationPolicy();
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
        synchronized (EpisodeDecorationPolicy.class) {
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

    @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getAvailable() {
        return this.available_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getBackgroundable() {
        return this.backgroundable_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getCovers() {
        return this.covers_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getDescription() {
        return this.description_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getFreezeFrames() {
        return this.freezeFrames_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getIs19PlusOnly() {
        return this.is19PlusOnly_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getIsBookChapter() {
        return this.isBookChapter_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getIsCurated() {
        return this.isCurated_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getIsExplicit() {
        return this.isExplicit_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getIsMusicAndTalk() {
        return this.isMusicAndTalk_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getIsPodcastShort() {
        return this.isPodcastShort_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getLanguage() {
        return this.language_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getLength() {
        return this.length_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getLink() {
        return this.link_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getManifestId() {
        return this.manifestId_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getMediaTypeEnum() {
        return this.mediaTypeEnum_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getName() {
        return this.name_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getNumber() {
        return this.number_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
    public PodcastSegmentsPolicy getPodcastSegments() {
        PodcastSegmentsPolicy podcastSegmentsPolicy = this.podcastSegments_;
        return podcastSegmentsPolicy == null ? PodcastSegmentsPolicy.getDefaultInstance() : podcastSegmentsPolicy;
    }

    @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getPodcastSubscription() {
        return this.podcastSubscription_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getPreviewId() {
        return this.previewId_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getPreviewManifestId() {
        return this.previewManifestId_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getPublishDate() {
        return this.publishDate_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getType() {
        return this.type_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
    public boolean hasPodcastSegments() {
        return (this.bitField0_ & 1) != 0;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements EpisodeDecorationPolicyOrBuilder {
        private Builder() {
            super(EpisodeDecorationPolicy.DEFAULT_INSTANCE);
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

        public Builder clearAvailable() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).clearAvailable();
            return this;
        }

        public Builder clearBackgroundable() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).clearBackgroundable();
            return this;
        }

        public Builder clearCovers() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).clearCovers();
            return this;
        }

        public Builder clearDescription() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).clearDescription();
            return this;
        }

        public Builder clearFreezeFrames() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).clearFreezeFrames();
            return this;
        }

        public Builder clearIs19PlusOnly() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).clearIs19PlusOnly();
            return this;
        }

        public Builder clearIsBookChapter() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).clearIsBookChapter();
            return this;
        }

        public Builder clearIsCurated() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).clearIsCurated();
            return this;
        }

        public Builder clearIsExplicit() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).clearIsExplicit();
            return this;
        }

        public Builder clearIsMusicAndTalk() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).clearIsMusicAndTalk();
            return this;
        }

        public Builder clearIsPodcastShort() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).clearIsPodcastShort();
            return this;
        }

        public Builder clearLanguage() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).clearLanguage();
            return this;
        }

        public Builder clearLength() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).clearLength();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).clearLink();
            return this;
        }

        public Builder clearManifestId() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).clearManifestId();
            return this;
        }

        public Builder clearMediaTypeEnum() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).clearMediaTypeEnum();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).clearName();
            return this;
        }

        public Builder clearNumber() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).clearNumber();
            return this;
        }

        public Builder clearPodcastSegments() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).clearPodcastSegments();
            return this;
        }

        public Builder clearPodcastSubscription() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).clearPodcastSubscription();
            return this;
        }

        public Builder clearPreviewId() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).clearPreviewId();
            return this;
        }

        public Builder clearPreviewManifestId() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).clearPreviewManifestId();
            return this;
        }

        public Builder clearPublishDate() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).clearPublishDate();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).clearType();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getAvailable() {
            return ((EpisodeDecorationPolicy) ((g) this).instance).getAvailable();
        }

        @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getBackgroundable() {
            return ((EpisodeDecorationPolicy) ((g) this).instance).getBackgroundable();
        }

        @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getCovers() {
            return ((EpisodeDecorationPolicy) ((g) this).instance).getCovers();
        }

        @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getDescription() {
            return ((EpisodeDecorationPolicy) ((g) this).instance).getDescription();
        }

        @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getFreezeFrames() {
            return ((EpisodeDecorationPolicy) ((g) this).instance).getFreezeFrames();
        }

        @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getIs19PlusOnly() {
            return ((EpisodeDecorationPolicy) ((g) this).instance).getIs19PlusOnly();
        }

        @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getIsBookChapter() {
            return ((EpisodeDecorationPolicy) ((g) this).instance).getIsBookChapter();
        }

        @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getIsCurated() {
            return ((EpisodeDecorationPolicy) ((g) this).instance).getIsCurated();
        }

        @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getIsExplicit() {
            return ((EpisodeDecorationPolicy) ((g) this).instance).getIsExplicit();
        }

        @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getIsMusicAndTalk() {
            return ((EpisodeDecorationPolicy) ((g) this).instance).getIsMusicAndTalk();
        }

        @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getIsPodcastShort() {
            return ((EpisodeDecorationPolicy) ((g) this).instance).getIsPodcastShort();
        }

        @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getLanguage() {
            return ((EpisodeDecorationPolicy) ((g) this).instance).getLanguage();
        }

        @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getLength() {
            return ((EpisodeDecorationPolicy) ((g) this).instance).getLength();
        }

        @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getLink() {
            return ((EpisodeDecorationPolicy) ((g) this).instance).getLink();
        }

        @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getManifestId() {
            return ((EpisodeDecorationPolicy) ((g) this).instance).getManifestId();
        }

        @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getMediaTypeEnum() {
            return ((EpisodeDecorationPolicy) ((g) this).instance).getMediaTypeEnum();
        }

        @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getName() {
            return ((EpisodeDecorationPolicy) ((g) this).instance).getName();
        }

        @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getNumber() {
            return ((EpisodeDecorationPolicy) ((g) this).instance).getNumber();
        }

        @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
        public PodcastSegmentsPolicy getPodcastSegments() {
            return ((EpisodeDecorationPolicy) ((g) this).instance).getPodcastSegments();
        }

        @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getPodcastSubscription() {
            return ((EpisodeDecorationPolicy) ((g) this).instance).getPodcastSubscription();
        }

        @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getPreviewId() {
            return ((EpisodeDecorationPolicy) ((g) this).instance).getPreviewId();
        }

        @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getPreviewManifestId() {
            return ((EpisodeDecorationPolicy) ((g) this).instance).getPreviewManifestId();
        }

        @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getPublishDate() {
            return ((EpisodeDecorationPolicy) ((g) this).instance).getPublishDate();
        }

        @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getType() {
            return ((EpisodeDecorationPolicy) ((g) this).instance).getType();
        }

        @Override // com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicyOrBuilder
        public boolean hasPodcastSegments() {
            return ((EpisodeDecorationPolicy) ((g) this).instance).hasPodcastSegments();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1299mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder mergePodcastSegments(PodcastSegmentsPolicy podcastSegmentsPolicy) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).mergePodcastSegments(podcastSegmentsPolicy);
            return this;
        }

        public Builder setAvailable(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).setAvailable(z);
            return this;
        }

        public Builder setBackgroundable(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).setBackgroundable(z);
            return this;
        }

        public Builder setCovers(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).setCovers(z);
            return this;
        }

        public Builder setDescription(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).setDescription(z);
            return this;
        }

        public Builder setFreezeFrames(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).setFreezeFrames(z);
            return this;
        }

        public Builder setIs19PlusOnly(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).setIs19PlusOnly(z);
            return this;
        }

        public Builder setIsBookChapter(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).setIsBookChapter(z);
            return this;
        }

        public Builder setIsCurated(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).setIsCurated(z);
            return this;
        }

        public Builder setIsExplicit(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).setIsExplicit(z);
            return this;
        }

        public Builder setIsMusicAndTalk(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).setIsMusicAndTalk(z);
            return this;
        }

        public Builder setIsPodcastShort(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).setIsPodcastShort(z);
            return this;
        }

        public Builder setLanguage(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).setLanguage(z);
            return this;
        }

        public Builder setLength(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).setLength(z);
            return this;
        }

        public Builder setLink(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).setLink(z);
            return this;
        }

        public Builder setManifestId(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).setManifestId(z);
            return this;
        }

        public Builder setMediaTypeEnum(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).setMediaTypeEnum(z);
            return this;
        }

        public Builder setName(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).setName(z);
            return this;
        }

        public Builder setNumber(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).setNumber(z);
            return this;
        }

        public Builder setPodcastSegments(PodcastSegmentsPolicy.Builder builder) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).setPodcastSegments((PodcastSegmentsPolicy) builder.build());
            return this;
        }

        public Builder setPodcastSubscription(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).setPodcastSubscription(z);
            return this;
        }

        public Builder setPreviewId(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).setPreviewId(z);
            return this;
        }

        public Builder setPreviewManifestId(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).setPreviewManifestId(z);
            return this;
        }

        public Builder setPublishDate(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).setPublishDate(z);
            return this;
        }

        public Builder setType(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).setType(z);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1298clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1300mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m1297clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1301mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

        public Builder setPodcastSegments(PodcastSegmentsPolicy podcastSegmentsPolicy) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) ((g) this).instance).setPodcastSegments(podcastSegmentsPolicy);
            return this;
        }
    }

    public static Builder newBuilder(EpisodeDecorationPolicy episodeDecorationPolicy) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(episodeDecorationPolicy);
    }

    public static EpisodeDecorationPolicy parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (EpisodeDecorationPolicy) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static EpisodeDecorationPolicy parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (EpisodeDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static EpisodeDecorationPolicy parseFrom(phc phcVar) {
        return (EpisodeDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static EpisodeDecorationPolicy parseFrom(phc phcVar, uz00 uz00Var) {
        return (EpisodeDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static EpisodeDecorationPolicy parseFrom(byte[] bArr) {
        return (EpisodeDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EpisodeDecorationPolicy parseFrom(byte[] bArr, uz00 uz00Var) {
        return (EpisodeDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static EpisodeDecorationPolicy parseFrom(InputStream inputStream) {
        return (EpisodeDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodeDecorationPolicy parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (EpisodeDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static EpisodeDecorationPolicy parseFrom(lwg lwgVar) {
        return (EpisodeDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static EpisodeDecorationPolicy parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (EpisodeDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
