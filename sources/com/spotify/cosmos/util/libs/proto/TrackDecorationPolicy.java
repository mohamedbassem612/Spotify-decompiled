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
public final class TrackDecorationPolicy extends h implements TrackDecorationPolicyOrBuilder {
    private static final TrackDecorationPolicy DEFAULT_INSTANCE;
    public static final int DISC_NUMBER_FIELD_NUMBER = 9;
    public static final int HAS_LYRICS_FIELD_NUMBER = 1;
    public static final int IS_19_PLUS_ONLY_FIELD_NUMBER = 17;
    public static final int IS_AVAILABLE_IN_METADATA_CATALOGUE_FIELD_NUMBER = 6;
    public static final int IS_EXPLICIT_FIELD_NUMBER = 11;
    public static final int IS_LOCAL_FIELD_NUMBER = 13;
    public static final int IS_PREMIUM_ONLY_FIELD_NUMBER = 14;
    public static final int LENGTH_FIELD_NUMBER = 4;
    public static final int LINK_FIELD_NUMBER = 2;
    public static final int LOCALLY_PLAYABLE_FIELD_NUMBER = 7;
    public static final int NAME_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYABLE_FIELD_NUMBER = 5;
    public static final int PLAYABLE_LOCAL_TRACK_FIELD_NUMBER = 8;
    public static final int PLAYABLE_TRACK_LINK_FIELD_NUMBER = 15;
    public static final int POPULARITY_FIELD_NUMBER = 16;
    public static final int PREVIEW_ID_FIELD_NUMBER = 12;
    public static final int TO_BE_OBFUSCATED_FIELD_NUMBER = 22;
    public static final int TRACK_DESCRIPTORS_FIELD_NUMBER = 18;
    public static final int TRACK_NUMBER_FIELD_NUMBER = 10;
    private boolean discNumber_;
    private boolean hasLyrics_;
    private boolean is19PlusOnly_;
    private boolean isAvailableInMetadataCatalogue_;
    private boolean isExplicit_;
    private boolean isLocal_;
    private boolean isPremiumOnly_;
    private boolean length_;
    private boolean link_;
    private boolean locallyPlayable_;
    private boolean name_;
    private boolean playableLocalTrack_;
    private boolean playableTrackLink_;
    private boolean playable_;
    private boolean popularity_;
    private boolean previewId_;
    private boolean toBeObfuscated_;
    private boolean trackDescriptors_;
    private boolean trackNumber_;

    /* JADX INFO: renamed from: com.spotify.cosmos.util.libs.proto.TrackDecorationPolicy$1, reason: invalid class name */
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
        TrackDecorationPolicy trackDecorationPolicy = new TrackDecorationPolicy();
        DEFAULT_INSTANCE = trackDecorationPolicy;
        h.registerDefaultInstance(TrackDecorationPolicy.class, trackDecorationPolicy);
    }

    private TrackDecorationPolicy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDiscNumber() {
        this.discNumber_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasLyrics() {
        this.hasLyrics_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIs19PlusOnly() {
        this.is19PlusOnly_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAvailableInMetadataCatalogue() {
        this.isAvailableInMetadataCatalogue_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsExplicit() {
        this.isExplicit_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsLocal() {
        this.isLocal_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPremiumOnly() {
        this.isPremiumOnly_ = false;
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
    public void clearLocallyPlayable() {
        this.locallyPlayable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayable() {
        this.playable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayableLocalTrack() {
        this.playableLocalTrack_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayableTrackLink() {
        this.playableTrackLink_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPopularity() {
        this.popularity_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreviewId() {
        this.previewId_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToBeObfuscated() {
        this.toBeObfuscated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackDescriptors() {
        this.trackDescriptors_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackNumber() {
        this.trackNumber_ = false;
    }

    public static TrackDecorationPolicy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TrackDecorationPolicy parseDelimitedFrom(InputStream inputStream) {
        return (TrackDecorationPolicy) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrackDecorationPolicy parseFrom(ByteBuffer byteBuffer) {
        return (TrackDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDiscNumber(boolean z) {
        this.discNumber_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasLyrics(boolean z) {
        this.hasLyrics_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIs19PlusOnly(boolean z) {
        this.is19PlusOnly_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAvailableInMetadataCatalogue(boolean z) {
        this.isAvailableInMetadataCatalogue_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsExplicit(boolean z) {
        this.isExplicit_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsLocal(boolean z) {
        this.isLocal_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPremiumOnly(boolean z) {
        this.isPremiumOnly_ = z;
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
    public void setLocallyPlayable(boolean z) {
        this.locallyPlayable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(boolean z) {
        this.name_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayable(boolean z) {
        this.playable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayableLocalTrack(boolean z) {
        this.playableLocalTrack_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayableTrackLink(boolean z) {
        this.playableTrackLink_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopularity(boolean z) {
        this.popularity_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviewId(boolean z) {
        this.previewId_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToBeObfuscated(boolean z) {
        this.toBeObfuscated_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackDescriptors(boolean z) {
        this.trackDescriptors_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackNumber(boolean z) {
        this.trackNumber_ = z;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0013\u0000\u0000\u0001\u0016\u0013\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\u0007\u0007\b\u0007\t\u0007\n\u0007\u000b\u0007\f\u0007\r\u0007\u000e\u0007\u000f\u0007\u0010\u0007\u0011\u0007\u0012\u0007\u0016\u0007", new Object[]{"hasLyrics_", "link_", "name_", "length_", "playable_", "isAvailableInMetadataCatalogue_", "locallyPlayable_", "playableLocalTrack_", "discNumber_", "trackNumber_", "isExplicit_", "previewId_", "isLocal_", "isPremiumOnly_", "playableTrackLink_", "popularity_", "is19PlusOnly_", "trackDescriptors_", "toBeObfuscated_"});
        }
        if (iOrdinal == 3) {
            return new TrackDecorationPolicy();
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
        synchronized (TrackDecorationPolicy.class) {
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

    @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
    public boolean getDiscNumber() {
        return this.discNumber_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
    public boolean getHasLyrics() {
        return this.hasLyrics_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
    public boolean getIs19PlusOnly() {
        return this.is19PlusOnly_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
    public boolean getIsAvailableInMetadataCatalogue() {
        return this.isAvailableInMetadataCatalogue_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
    public boolean getIsExplicit() {
        return this.isExplicit_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
    public boolean getIsLocal() {
        return this.isLocal_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
    public boolean getIsPremiumOnly() {
        return this.isPremiumOnly_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
    public boolean getLength() {
        return this.length_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
    public boolean getLink() {
        return this.link_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
    public boolean getLocallyPlayable() {
        return this.locallyPlayable_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
    public boolean getName() {
        return this.name_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
    public boolean getPlayable() {
        return this.playable_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
    public boolean getPlayableLocalTrack() {
        return this.playableLocalTrack_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
    public boolean getPlayableTrackLink() {
        return this.playableTrackLink_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
    public boolean getPopularity() {
        return this.popularity_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
    public boolean getPreviewId() {
        return this.previewId_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
    public boolean getToBeObfuscated() {
        return this.toBeObfuscated_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
    public boolean getTrackDescriptors() {
        return this.trackDescriptors_;
    }

    @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
    public boolean getTrackNumber() {
        return this.trackNumber_;
    }

    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements TrackDecorationPolicyOrBuilder {
        private Builder() {
            super(TrackDecorationPolicy.DEFAULT_INSTANCE);
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

        public Builder clearDiscNumber() {
            copyOnWrite();
            ((TrackDecorationPolicy) ((g) this).instance).clearDiscNumber();
            return this;
        }

        public Builder clearHasLyrics() {
            copyOnWrite();
            ((TrackDecorationPolicy) ((g) this).instance).clearHasLyrics();
            return this;
        }

        public Builder clearIs19PlusOnly() {
            copyOnWrite();
            ((TrackDecorationPolicy) ((g) this).instance).clearIs19PlusOnly();
            return this;
        }

        public Builder clearIsAvailableInMetadataCatalogue() {
            copyOnWrite();
            ((TrackDecorationPolicy) ((g) this).instance).clearIsAvailableInMetadataCatalogue();
            return this;
        }

        public Builder clearIsExplicit() {
            copyOnWrite();
            ((TrackDecorationPolicy) ((g) this).instance).clearIsExplicit();
            return this;
        }

        public Builder clearIsLocal() {
            copyOnWrite();
            ((TrackDecorationPolicy) ((g) this).instance).clearIsLocal();
            return this;
        }

        public Builder clearIsPremiumOnly() {
            copyOnWrite();
            ((TrackDecorationPolicy) ((g) this).instance).clearIsPremiumOnly();
            return this;
        }

        public Builder clearLength() {
            copyOnWrite();
            ((TrackDecorationPolicy) ((g) this).instance).clearLength();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((TrackDecorationPolicy) ((g) this).instance).clearLink();
            return this;
        }

        public Builder clearLocallyPlayable() {
            copyOnWrite();
            ((TrackDecorationPolicy) ((g) this).instance).clearLocallyPlayable();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((TrackDecorationPolicy) ((g) this).instance).clearName();
            return this;
        }

        public Builder clearPlayable() {
            copyOnWrite();
            ((TrackDecorationPolicy) ((g) this).instance).clearPlayable();
            return this;
        }

        public Builder clearPlayableLocalTrack() {
            copyOnWrite();
            ((TrackDecorationPolicy) ((g) this).instance).clearPlayableLocalTrack();
            return this;
        }

        public Builder clearPlayableTrackLink() {
            copyOnWrite();
            ((TrackDecorationPolicy) ((g) this).instance).clearPlayableTrackLink();
            return this;
        }

        public Builder clearPopularity() {
            copyOnWrite();
            ((TrackDecorationPolicy) ((g) this).instance).clearPopularity();
            return this;
        }

        public Builder clearPreviewId() {
            copyOnWrite();
            ((TrackDecorationPolicy) ((g) this).instance).clearPreviewId();
            return this;
        }

        public Builder clearToBeObfuscated() {
            copyOnWrite();
            ((TrackDecorationPolicy) ((g) this).instance).clearToBeObfuscated();
            return this;
        }

        public Builder clearTrackDescriptors() {
            copyOnWrite();
            ((TrackDecorationPolicy) ((g) this).instance).clearTrackDescriptors();
            return this;
        }

        public Builder clearTrackNumber() {
            copyOnWrite();
            ((TrackDecorationPolicy) ((g) this).instance).clearTrackNumber();
            return this;
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.clone();
        }

        @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
        public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
        public boolean getDiscNumber() {
            return ((TrackDecorationPolicy) ((g) this).instance).getDiscNumber();
        }

        @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
        public boolean getHasLyrics() {
            return ((TrackDecorationPolicy) ((g) this).instance).getHasLyrics();
        }

        @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
        public boolean getIs19PlusOnly() {
            return ((TrackDecorationPolicy) ((g) this).instance).getIs19PlusOnly();
        }

        @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
        public boolean getIsAvailableInMetadataCatalogue() {
            return ((TrackDecorationPolicy) ((g) this).instance).getIsAvailableInMetadataCatalogue();
        }

        @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
        public boolean getIsExplicit() {
            return ((TrackDecorationPolicy) ((g) this).instance).getIsExplicit();
        }

        @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
        public boolean getIsLocal() {
            return ((TrackDecorationPolicy) ((g) this).instance).getIsLocal();
        }

        @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
        public boolean getIsPremiumOnly() {
            return ((TrackDecorationPolicy) ((g) this).instance).getIsPremiumOnly();
        }

        @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
        public boolean getLength() {
            return ((TrackDecorationPolicy) ((g) this).instance).getLength();
        }

        @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
        public boolean getLink() {
            return ((TrackDecorationPolicy) ((g) this).instance).getLink();
        }

        @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
        public boolean getLocallyPlayable() {
            return ((TrackDecorationPolicy) ((g) this).instance).getLocallyPlayable();
        }

        @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
        public boolean getName() {
            return ((TrackDecorationPolicy) ((g) this).instance).getName();
        }

        @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
        public boolean getPlayable() {
            return ((TrackDecorationPolicy) ((g) this).instance).getPlayable();
        }

        @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
        public boolean getPlayableLocalTrack() {
            return ((TrackDecorationPolicy) ((g) this).instance).getPlayableLocalTrack();
        }

        @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
        public boolean getPlayableTrackLink() {
            return ((TrackDecorationPolicy) ((g) this).instance).getPlayableTrackLink();
        }

        @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
        public boolean getPopularity() {
            return ((TrackDecorationPolicy) ((g) this).instance).getPopularity();
        }

        @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
        public boolean getPreviewId() {
            return ((TrackDecorationPolicy) ((g) this).instance).getPreviewId();
        }

        @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
        public boolean getToBeObfuscated() {
            return ((TrackDecorationPolicy) ((g) this).instance).getToBeObfuscated();
        }

        @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
        public boolean getTrackDescriptors() {
            return ((TrackDecorationPolicy) ((g) this).instance).getTrackDescriptors();
        }

        @Override // com.spotify.cosmos.util.libs.proto.TrackDecorationPolicyOrBuilder
        public boolean getTrackNumber() {
            return ((TrackDecorationPolicy) ((g) this).instance).getTrackNumber();
        }

        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1340mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setDiscNumber(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) ((g) this).instance).setDiscNumber(z);
            return this;
        }

        public Builder setHasLyrics(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) ((g) this).instance).setHasLyrics(z);
            return this;
        }

        public Builder setIs19PlusOnly(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) ((g) this).instance).setIs19PlusOnly(z);
            return this;
        }

        public Builder setIsAvailableInMetadataCatalogue(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) ((g) this).instance).setIsAvailableInMetadataCatalogue(z);
            return this;
        }

        public Builder setIsExplicit(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) ((g) this).instance).setIsExplicit(z);
            return this;
        }

        public Builder setIsLocal(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) ((g) this).instance).setIsLocal(z);
            return this;
        }

        public Builder setIsPremiumOnly(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) ((g) this).instance).setIsPremiumOnly(z);
            return this;
        }

        public Builder setLength(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) ((g) this).instance).setLength(z);
            return this;
        }

        public Builder setLink(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) ((g) this).instance).setLink(z);
            return this;
        }

        public Builder setLocallyPlayable(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) ((g) this).instance).setLocallyPlayable(z);
            return this;
        }

        public Builder setName(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) ((g) this).instance).setName(z);
            return this;
        }

        public Builder setPlayable(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) ((g) this).instance).setPlayable(z);
            return this;
        }

        public Builder setPlayableLocalTrack(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) ((g) this).instance).setPlayableLocalTrack(z);
            return this;
        }

        public Builder setPlayableTrackLink(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) ((g) this).instance).setPlayableTrackLink(z);
            return this;
        }

        public Builder setPopularity(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) ((g) this).instance).setPopularity(z);
            return this;
        }

        public Builder setPreviewId(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) ((g) this).instance).setPreviewId(z);
            return this;
        }

        public Builder setToBeObfuscated(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) ((g) this).instance).setToBeObfuscated(z);
            return this;
        }

        public Builder setTrackDescriptors(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) ((g) this).instance).setTrackDescriptors(z);
            return this;
        }

        public Builder setTrackNumber(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) ((g) this).instance).setTrackNumber(z);
            return this;
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1339clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1341mergeFrom(byte[] bArr, int i, int i2) {
            return super.mergeFrom(bArr, i, i2);
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r2j0 m1338clone() {
            return super.clone();
        }

        /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ r8 m1342mergeFrom(byte[] bArr, int i, int i2, uz00 uz00Var) {
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

    public static Builder newBuilder(TrackDecorationPolicy trackDecorationPolicy) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(trackDecorationPolicy);
    }

    public static TrackDecorationPolicy parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (TrackDecorationPolicy) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static TrackDecorationPolicy parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (TrackDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static TrackDecorationPolicy parseFrom(phc phcVar) {
        return (TrackDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static TrackDecorationPolicy parseFrom(phc phcVar, uz00 uz00Var) {
        return (TrackDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    public static TrackDecorationPolicy parseFrom(byte[] bArr) {
        return (TrackDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TrackDecorationPolicy parseFrom(byte[] bArr, uz00 uz00Var) {
        return (TrackDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static TrackDecorationPolicy parseFrom(InputStream inputStream) {
        return (TrackDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrackDecorationPolicy parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (TrackDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static TrackDecorationPolicy parseFrom(lwg lwgVar) {
        return (TrackDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static TrackDecorationPolicy parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (TrackDecorationPolicy) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
