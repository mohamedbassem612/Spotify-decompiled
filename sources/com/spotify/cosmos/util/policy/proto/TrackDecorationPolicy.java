package com.spotify.cosmos.util.policy.proto;

import com.google.protobuf.g;
import com.google.protobuf.h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p.b290;
import p.bf40;
import p.c290;
import p.d290;
import p.er80;
import p.hz00;
import p.i9;
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
public final class TrackDecorationPolicy extends h implements TrackDecorationPolicyOrBuilder {
    private static final TrackDecorationPolicy DEFAULT_INSTANCE;
    public static final int DISC_NUMBER_FIELD_NUMBER = 9;
    public static final int EXTENSION_FIELD_NUMBER = 19;
    public static final int HAS_LYRICS_FIELD_NUMBER = 1;
    public static final int IS_19_PLUS_ONLY_FIELD_NUMBER = 17;
    public static final int IS_AVAILABLE_IN_METADATA_CATALOGUE_FIELD_NUMBER = 6;
    public static final int IS_CURATED_FIELD_NUMBER = 20;
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
    private static final c290 extension_converter_ = new c290() { // from class: com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy.1
        @Override // p.c290
        public hz00 convert(int i) {
            hz00 hz00VarB = hz00.b(i);
            return hz00VarB == null ? hz00.V5 : hz00VarB;
        }
    };
    private boolean discNumber_;
    private int extensionMemoizedSerializedSize;
    private b290 extension_ = h.emptyIntList();
    private boolean hasLyrics_;
    private boolean is19PlusOnly_;
    private boolean isAvailableInMetadataCatalogue_;
    private boolean isCurated_;
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

    static {
        TrackDecorationPolicy trackDecorationPolicy = new TrackDecorationPolicy();
        DEFAULT_INSTANCE = trackDecorationPolicy;
        h.registerDefaultInstance(TrackDecorationPolicy.class, trackDecorationPolicy);
    }

    private TrackDecorationPolicy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExtension(Iterable<? extends hz00> iterable) {
        ensureExtensionIsMutable();
        for (hz00 hz00Var : iterable) {
            ((er80) this.extension_).c(hz00Var.getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExtensionValue(Iterable<Integer> iterable) {
        ensureExtensionIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            ((er80) this.extension_).c(it.next().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtension(hz00 hz00Var) {
        hz00Var.getClass();
        ensureExtensionIsMutable();
        ((er80) this.extension_).c(hz00Var.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtensionValue(int i) {
        ensureExtensionIsMutable();
        ((er80) this.extension_).c(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDiscNumber() {
        this.discNumber_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtension() {
        this.extension_ = h.emptyIntList();
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
    public void clearIsCurated() {
        this.isCurated_ = false;
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

    /* JADX WARN: Multi-variable type inference failed */
    private void ensureExtensionIsMutable() {
        b290 b290Var = this.extension_;
        if (((i9) b290Var).a) {
            return;
        }
        this.extension_ = h.mutableCopy(b290Var);
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
    public void setExtension(int i, hz00 hz00Var) {
        hz00Var.getClass();
        ensureExtensionIsMutable();
        ((er80) this.extension_).i(i, hz00Var.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtensionValue(int i, int i2) {
        ensureExtensionIsMutable();
        ((er80) this.extension_).i(i, i2);
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
    public void setIsCurated(boolean z) {
        this.isCurated_ = z;
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

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0015\u0000\u0000\u0001\u0016\u0015\u0000\u0001\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\u0007\u0007\b\u0007\t\u0007\n\u0007\u000b\u0007\f\u0007\r\u0007\u000e\u0007\u000f\u0007\u0010\u0007\u0011\u0007\u0012\u0007\u0013,\u0014\u0007\u0016\u0007", new Object[]{"hasLyrics_", "link_", "name_", "length_", "playable_", "isAvailableInMetadataCatalogue_", "locallyPlayable_", "playableLocalTrack_", "discNumber_", "trackNumber_", "isExplicit_", "previewId_", "isLocal_", "isPremiumOnly_", "playableTrackLink_", "popularity_", "is19PlusOnly_", "trackDescriptors_", "extension_", "isCurated_", "toBeObfuscated_"});
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

    @Override // com.google.protobuf.h, p.v2j0
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
    public boolean getDiscNumber() {
        return this.discNumber_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
    public hz00 getExtension(int i) {
        hz00 hz00VarB = hz00.b(((er80) this.extension_).e(i));
        return hz00VarB == null ? hz00.V5 : hz00VarB;
    }

    @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
    public int getExtensionCount() {
        return this.extension_.size();
    }

    @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
    public List<hz00> getExtensionList() {
        return new d290(this.extension_, extension_converter_);
    }

    @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
    public int getExtensionValue(int i) {
        return ((er80) this.extension_).e(i);
    }

    @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
    public List<Integer> getExtensionValueList() {
        return this.extension_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
    public boolean getHasLyrics() {
        return this.hasLyrics_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
    public boolean getIs19PlusOnly() {
        return this.is19PlusOnly_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
    public boolean getIsAvailableInMetadataCatalogue() {
        return this.isAvailableInMetadataCatalogue_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
    public boolean getIsCurated() {
        return this.isCurated_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
    public boolean getIsExplicit() {
        return this.isExplicit_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
    public boolean getIsLocal() {
        return this.isLocal_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
    public boolean getIsPremiumOnly() {
        return this.isPremiumOnly_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
    public boolean getLength() {
        return this.length_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
    public boolean getLink() {
        return this.link_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
    public boolean getLocallyPlayable() {
        return this.locallyPlayable_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
    public boolean getName() {
        return this.name_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
    public boolean getPlayable() {
        return this.playable_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
    public boolean getPlayableLocalTrack() {
        return this.playableLocalTrack_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
    public boolean getPlayableTrackLink() {
        return this.playableTrackLink_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
    public boolean getPopularity() {
        return this.popularity_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
    public boolean getPreviewId() {
        return this.previewId_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
    public boolean getToBeObfuscated() {
        return this.toBeObfuscated_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
    public boolean getTrackDescriptors() {
        return this.trackDescriptors_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
    public boolean getTrackNumber() {
        return this.trackNumber_;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static final class Builder extends g implements TrackDecorationPolicyOrBuilder {
        private Builder() {
            super(TrackDecorationPolicy.DEFAULT_INSTANCE);
        }

        public Builder addAllExtension(Iterable<? extends hz00> iterable) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).addAllExtension(iterable);
            return this;
        }

        public Builder addAllExtensionValue(Iterable<Integer> iterable) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).addAllExtensionValue(iterable);
            return this;
        }

        public Builder addExtension(hz00 hz00Var) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).addExtension(hz00Var);
            return this;
        }

        public Builder addExtensionValue(int i) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).addExtensionValue(i);
            return this;
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

        public Builder clearDiscNumber() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearDiscNumber();
            return this;
        }

        public Builder clearExtension() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearExtension();
            return this;
        }

        public Builder clearHasLyrics() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearHasLyrics();
            return this;
        }

        public Builder clearIs19PlusOnly() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearIs19PlusOnly();
            return this;
        }

        public Builder clearIsAvailableInMetadataCatalogue() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearIsAvailableInMetadataCatalogue();
            return this;
        }

        public Builder clearIsCurated() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearIsCurated();
            return this;
        }

        public Builder clearIsExplicit() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearIsExplicit();
            return this;
        }

        public Builder clearIsLocal() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearIsLocal();
            return this;
        }

        public Builder clearIsPremiumOnly() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearIsPremiumOnly();
            return this;
        }

        public Builder clearLength() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearLength();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearLink();
            return this;
        }

        public Builder clearLocallyPlayable() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearLocallyPlayable();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearName();
            return this;
        }

        public Builder clearPlayable() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearPlayable();
            return this;
        }

        public Builder clearPlayableLocalTrack() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearPlayableLocalTrack();
            return this;
        }

        public Builder clearPlayableTrackLink() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearPlayableTrackLink();
            return this;
        }

        public Builder clearPopularity() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearPopularity();
            return this;
        }

        public Builder clearPreviewId() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearPreviewId();
            return this;
        }

        public Builder clearToBeObfuscated() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearToBeObfuscated();
            return this;
        }

        public Builder clearTrackDescriptors() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearTrackDescriptors();
            return this;
        }

        public Builder clearTrackNumber() {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).clearTrackNumber();
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

        @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
        public boolean getDiscNumber() {
            return ((TrackDecorationPolicy) this.instance).getDiscNumber();
        }

        @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
        public hz00 getExtension(int i) {
            return ((TrackDecorationPolicy) this.instance).getExtension(i);
        }

        @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
        public int getExtensionCount() {
            return ((TrackDecorationPolicy) this.instance).getExtensionCount();
        }

        @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
        public List<hz00> getExtensionList() {
            return ((TrackDecorationPolicy) this.instance).getExtensionList();
        }

        @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
        public int getExtensionValue(int i) {
            return ((TrackDecorationPolicy) this.instance).getExtensionValue(i);
        }

        @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
        public List<Integer> getExtensionValueList() {
            return Collections.unmodifiableList(((TrackDecorationPolicy) this.instance).getExtensionValueList());
        }

        @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
        public boolean getHasLyrics() {
            return ((TrackDecorationPolicy) this.instance).getHasLyrics();
        }

        @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
        public boolean getIs19PlusOnly() {
            return ((TrackDecorationPolicy) this.instance).getIs19PlusOnly();
        }

        @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
        public boolean getIsAvailableInMetadataCatalogue() {
            return ((TrackDecorationPolicy) this.instance).getIsAvailableInMetadataCatalogue();
        }

        @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
        public boolean getIsCurated() {
            return ((TrackDecorationPolicy) this.instance).getIsCurated();
        }

        @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
        public boolean getIsExplicit() {
            return ((TrackDecorationPolicy) this.instance).getIsExplicit();
        }

        @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
        public boolean getIsLocal() {
            return ((TrackDecorationPolicy) this.instance).getIsLocal();
        }

        @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
        public boolean getIsPremiumOnly() {
            return ((TrackDecorationPolicy) this.instance).getIsPremiumOnly();
        }

        @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
        public boolean getLength() {
            return ((TrackDecorationPolicy) this.instance).getLength();
        }

        @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
        public boolean getLink() {
            return ((TrackDecorationPolicy) this.instance).getLink();
        }

        @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
        public boolean getLocallyPlayable() {
            return ((TrackDecorationPolicy) this.instance).getLocallyPlayable();
        }

        @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
        public boolean getName() {
            return ((TrackDecorationPolicy) this.instance).getName();
        }

        @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
        public boolean getPlayable() {
            return ((TrackDecorationPolicy) this.instance).getPlayable();
        }

        @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
        public boolean getPlayableLocalTrack() {
            return ((TrackDecorationPolicy) this.instance).getPlayableLocalTrack();
        }

        @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
        public boolean getPlayableTrackLink() {
            return ((TrackDecorationPolicy) this.instance).getPlayableTrackLink();
        }

        @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
        public boolean getPopularity() {
            return ((TrackDecorationPolicy) this.instance).getPopularity();
        }

        @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
        public boolean getPreviewId() {
            return ((TrackDecorationPolicy) this.instance).getPreviewId();
        }

        @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
        public boolean getToBeObfuscated() {
            return ((TrackDecorationPolicy) this.instance).getToBeObfuscated();
        }

        @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
        public boolean getTrackDescriptors() {
            return ((TrackDecorationPolicy) this.instance).getTrackDescriptors();
        }

        @Override // com.spotify.cosmos.util.policy.proto.TrackDecorationPolicyOrBuilder
        public boolean getTrackNumber() {
            return ((TrackDecorationPolicy) this.instance).getTrackNumber();
        }

        @Override // com.google.protobuf.g, p.r8
        public /* bridge */ /* synthetic */ r8 internalMergeFrom(s8 s8Var) {
            return super.internalMergeFrom((h) s8Var);
        }

        @Override // com.google.protobuf.g, p.r8, p.r2j0
        public /* bridge */ /* synthetic */ r8 mergeFrom(lwg lwgVar, uz00 uz00Var) {
            return super.mergeFrom(lwgVar, uz00Var);
        }

        public Builder setDiscNumber(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setDiscNumber(z);
            return this;
        }

        public Builder setExtension(int i, hz00 hz00Var) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setExtension(i, hz00Var);
            return this;
        }

        public Builder setExtensionValue(int i, int i2) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setExtensionValue(i, i2);
            return this;
        }

        public Builder setHasLyrics(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setHasLyrics(z);
            return this;
        }

        public Builder setIs19PlusOnly(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setIs19PlusOnly(z);
            return this;
        }

        public Builder setIsAvailableInMetadataCatalogue(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setIsAvailableInMetadataCatalogue(z);
            return this;
        }

        public Builder setIsCurated(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setIsCurated(z);
            return this;
        }

        public Builder setIsExplicit(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setIsExplicit(z);
            return this;
        }

        public Builder setIsLocal(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setIsLocal(z);
            return this;
        }

        public Builder setIsPremiumOnly(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setIsPremiumOnly(z);
            return this;
        }

        public Builder setLength(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setLength(z);
            return this;
        }

        public Builder setLink(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setLink(z);
            return this;
        }

        public Builder setLocallyPlayable(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setLocallyPlayable(z);
            return this;
        }

        public Builder setName(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setName(z);
            return this;
        }

        public Builder setPlayable(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setPlayable(z);
            return this;
        }

        public Builder setPlayableLocalTrack(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setPlayableLocalTrack(z);
            return this;
        }

        public Builder setPlayableTrackLink(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setPlayableTrackLink(z);
            return this;
        }

        public Builder setPopularity(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setPopularity(z);
            return this;
        }

        public Builder setPreviewId(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setPreviewId(z);
            return this;
        }

        public Builder setToBeObfuscated(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setToBeObfuscated(z);
            return this;
        }

        public Builder setTrackDescriptors(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setTrackDescriptors(z);
            return this;
        }

        public Builder setTrackNumber(boolean z) {
            copyOnWrite();
            ((TrackDecorationPolicy) this.instance).setTrackNumber(z);
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
