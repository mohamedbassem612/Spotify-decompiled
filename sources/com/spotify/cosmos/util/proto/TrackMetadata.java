package com.spotify.cosmos.util.proto;

import com.google.protobuf.h;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.lwg;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.uz00;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class TrackMetadata extends h implements TrackMetadataOrBuilder {
    public static final int ALBUM_FIELD_NUMBER = 1;
    public static final int ARTIST_FIELD_NUMBER = 2;
    private static final TrackMetadata DEFAULT_INSTANCE;
    public static final int DISC_NUMBER_FIELD_NUMBER = 7;
    public static final int EXTENSION_FIELD_NUMBER = 20;
    public static final int HAS_LYRICS_FIELD_NUMBER = 13;
    public static final int IS_19_PLUS_ONLY_FIELD_NUMBER = 18;
    public static final int IS_CURATED_FIELD_NUMBER = 21;
    public static final int IS_EXPLICIT_FIELD_NUMBER = 9;
    public static final int IS_LOCAL_FIELD_NUMBER = 11;
    public static final int IS_PREMIUM_ONLY_FIELD_NUMBER = 14;
    public static final int LENGTH_FIELD_NUMBER = 5;
    public static final int LINK_FIELD_NUMBER = 3;
    public static final int LOCALLY_PLAYABLE_FIELD_NUMBER = 15;
    public static final int NAME_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYABLE_FIELD_NUMBER = 6;
    public static final int PLAYABLE_LOCAL_TRACK_FIELD_NUMBER = 12;
    public static final int PLAYABLE_TRACK_LINK_FIELD_NUMBER = 16;
    public static final int POPULARITY_FIELD_NUMBER = 17;
    public static final int PREVIEW_ID_FIELD_NUMBER = 10;
    public static final int TO_BE_OBFUSCATED_FIELD_NUMBER = 22;
    public static final int TRACK_DESCRIPTORS_FIELD_NUMBER = 19;
    public static final int TRACK_NUMBER_FIELD_NUMBER = 8;
    private TrackAlbumMetadata album_;
    private int bitField0_;
    private int discNumber_;
    private boolean hasLyrics_;
    private boolean is19PlusOnly_;
    private boolean isCurated_;
    private boolean isExplicit_;
    private boolean isLocal_;
    private boolean isPremiumOnly_;
    private int length_;
    private boolean locallyPlayable_;
    private boolean playableLocalTrack_;
    private boolean playable_;
    private int popularity_;
    private boolean toBeObfuscated_;
    private int trackNumber_;
    private h290 artist_ = h.emptyProtobufList();
    private String link_ = "";
    private String name_ = "";
    private String previewId_ = "";
    private String playableTrackLink_ = "";
    private h290 trackDescriptors_ = h.emptyProtobufList();
    private h290 extension_ = h.emptyProtobufList();

    static {
        TrackMetadata trackMetadata = new TrackMetadata();
        DEFAULT_INSTANCE = trackMetadata;
        h.registerDefaultInstance(TrackMetadata.class, trackMetadata);
    }

    private TrackMetadata() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllArtist(Iterable<? extends TrackArtistMetadata> iterable) {
        ensureArtistIsMutable();
        s8.addAll(iterable, this.artist_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExtension(Iterable<? extends Extension> iterable) {
        ensureExtensionIsMutable();
        s8.addAll(iterable, this.extension_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTrackDescriptors(Iterable<? extends TrackDescriptor> iterable) {
        ensureTrackDescriptorsIsMutable();
        s8.addAll(iterable, this.trackDescriptors_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addArtist(TrackArtistMetadata trackArtistMetadata) {
        trackArtistMetadata.getClass();
        ensureArtistIsMutable();
        this.artist_.add(trackArtistMetadata);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtension(Extension extension) {
        extension.getClass();
        ensureExtensionIsMutable();
        this.extension_.add(extension);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTrackDescriptors(TrackDescriptor trackDescriptor) {
        trackDescriptor.getClass();
        ensureTrackDescriptorsIsMutable();
        this.trackDescriptors_.add(trackDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlbum() {
        this.album_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArtist() {
        this.artist_ = h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDiscNumber() {
        this.bitField0_ &= -33;
        this.discNumber_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtension() {
        this.extension_ = h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasLyrics() {
        this.bitField0_ &= -2049;
        this.hasLyrics_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIs19PlusOnly() {
        this.bitField0_ &= -65537;
        this.is19PlusOnly_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsCurated() {
        this.bitField0_ &= -131073;
        this.isCurated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsExplicit() {
        this.bitField0_ &= -129;
        this.isExplicit_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsLocal() {
        this.bitField0_ &= -513;
        this.isLocal_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPremiumOnly() {
        this.bitField0_ &= -4097;
        this.isPremiumOnly_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLength() {
        this.bitField0_ &= -9;
        this.length_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLink() {
        this.bitField0_ &= -3;
        this.link_ = getDefaultInstance().getLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocallyPlayable() {
        this.bitField0_ &= -8193;
        this.locallyPlayable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -5;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayable() {
        this.bitField0_ &= -17;
        this.playable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayableLocalTrack() {
        this.bitField0_ &= -1025;
        this.playableLocalTrack_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayableTrackLink() {
        this.bitField0_ &= -16385;
        this.playableTrackLink_ = getDefaultInstance().getPlayableTrackLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPopularity() {
        this.bitField0_ &= -32769;
        this.popularity_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreviewId() {
        this.bitField0_ &= -257;
        this.previewId_ = getDefaultInstance().getPreviewId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToBeObfuscated() {
        this.bitField0_ &= -262145;
        this.toBeObfuscated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackDescriptors() {
        this.trackDescriptors_ = h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackNumber() {
        this.bitField0_ &= -65;
        this.trackNumber_ = 0;
    }

    private void ensureArtistIsMutable() {
        h290 h290Var = this.artist_;
        if (((i9) h290Var).a) {
            return;
        }
        this.artist_ = h.mutableCopy(h290Var);
    }

    private void ensureExtensionIsMutable() {
        h290 h290Var = this.extension_;
        if (((i9) h290Var).a) {
            return;
        }
        this.extension_ = h.mutableCopy(h290Var);
    }

    private void ensureTrackDescriptorsIsMutable() {
        h290 h290Var = this.trackDescriptors_;
        if (((i9) h290Var).a) {
            return;
        }
        this.trackDescriptors_ = h.mutableCopy(h290Var);
    }

    public static TrackMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlbum(TrackAlbumMetadata trackAlbumMetadata) {
        trackAlbumMetadata.getClass();
        TrackAlbumMetadata trackAlbumMetadata2 = this.album_;
        if (trackAlbumMetadata2 == null || trackAlbumMetadata2 == TrackAlbumMetadata.getDefaultInstance()) {
            this.album_ = trackAlbumMetadata;
        } else {
            this.album_ = (TrackAlbumMetadata) TrackAlbumMetadata.newBuilder(this.album_).mergeFrom(trackAlbumMetadata).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TrackMetadata parseDelimitedFrom(InputStream inputStream) {
        return (TrackMetadata) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrackMetadata parseFrom(ByteBuffer byteBuffer) {
        return (TrackMetadata) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeArtist(int i) {
        ensureArtistIsMutable();
        this.artist_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeExtension(int i) {
        ensureExtensionIsMutable();
        this.extension_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTrackDescriptors(int i) {
        ensureTrackDescriptorsIsMutable();
        this.trackDescriptors_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlbum(TrackAlbumMetadata trackAlbumMetadata) {
        trackAlbumMetadata.getClass();
        this.album_ = trackAlbumMetadata;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArtist(int i, TrackArtistMetadata trackArtistMetadata) {
        trackArtistMetadata.getClass();
        ensureArtistIsMutable();
        this.artist_.set(i, trackArtistMetadata);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDiscNumber(int i) {
        this.bitField0_ |= 32;
        this.discNumber_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtension(int i, Extension extension) {
        extension.getClass();
        ensureExtensionIsMutable();
        this.extension_.set(i, extension);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasLyrics(boolean z) {
        this.bitField0_ |= 2048;
        this.hasLyrics_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIs19PlusOnly(boolean z) {
        this.bitField0_ |= 65536;
        this.is19PlusOnly_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsCurated(boolean z) {
        this.bitField0_ |= 131072;
        this.isCurated_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsExplicit(boolean z) {
        this.bitField0_ |= 128;
        this.isExplicit_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsLocal(boolean z) {
        this.bitField0_ |= NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS;
        this.isLocal_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPremiumOnly(boolean z) {
        this.bitField0_ |= 4096;
        this.isPremiumOnly_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLength(int i) {
        this.bitField0_ |= 8;
        this.length_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLink(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.link_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkBytes(phc phcVar) {
        this.link_ = phcVar.v();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocallyPlayable(boolean z) {
        this.bitField0_ |= 8192;
        this.locallyPlayable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(phc phcVar) {
        this.name_ = phcVar.v();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayable(boolean z) {
        this.bitField0_ |= 16;
        this.playable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayableLocalTrack(boolean z) {
        this.bitField0_ |= 1024;
        this.playableLocalTrack_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayableTrackLink(String str) {
        str.getClass();
        this.bitField0_ |= 16384;
        this.playableTrackLink_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayableTrackLinkBytes(phc phcVar) {
        this.playableTrackLink_ = phcVar.v();
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopularity(int i) {
        this.bitField0_ |= 32768;
        this.popularity_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviewId(String str) {
        str.getClass();
        this.bitField0_ |= 256;
        this.previewId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviewIdBytes(phc phcVar) {
        this.previewId_ = phcVar.v();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToBeObfuscated(boolean z) {
        this.bitField0_ |= 262144;
        this.toBeObfuscated_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackDescriptors(int i, TrackDescriptor trackDescriptor) {
        trackDescriptor.getClass();
        ensureTrackDescriptorsIsMutable();
        this.trackDescriptors_.set(i, trackDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackNumber(int i) {
        this.bitField0_ |= 64;
        this.trackNumber_ = i;
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0016\u0000\u0001\u0001\u0016\u0016\u0000\u0003\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဋ\u0003\u0006ဇ\u0004\u0007ဋ\u0005\bဋ\u0006\tဇ\u0007\nဈ\b\u000bဇ\t\fဇ\n\rဇ\u000b\u000eဇ\f\u000fဇ\r\u0010ဈ\u000e\u0011ဋ\u000f\u0012ဇ\u0010\u0013\u001b\u0014\u001b\u0015ဇ\u0011\u0016ဇ\u0012", new Object[]{"bitField0_", "album_", "artist_", TrackArtistMetadata.class, "link_", "name_", "length_", "playable_", "discNumber_", "trackNumber_", "isExplicit_", "previewId_", "isLocal_", "playableLocalTrack_", "hasLyrics_", "isPremiumOnly_", "locallyPlayable_", "playableTrackLink_", "popularity_", "is19PlusOnly_", "trackDescriptors_", TrackDescriptor.class, "extension_", Extension.class, "isCurated_", "toBeObfuscated_"});
        }
        if (iOrdinal == 3) {
            return new TrackMetadata();
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
        synchronized (TrackMetadata.class) {
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

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public TrackAlbumMetadata getAlbum() {
        TrackAlbumMetadata trackAlbumMetadata = this.album_;
        return trackAlbumMetadata == null ? TrackAlbumMetadata.getDefaultInstance() : trackAlbumMetadata;
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public TrackArtistMetadata getArtist(int i) {
        return (TrackArtistMetadata) this.artist_.get(i);
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public int getArtistCount() {
        return this.artist_.size();
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public List<TrackArtistMetadata> getArtistList() {
        return this.artist_;
    }

    public TrackArtistMetadataOrBuilder getArtistOrBuilder(int i) {
        return (TrackArtistMetadataOrBuilder) this.artist_.get(i);
    }

    public List<? extends TrackArtistMetadataOrBuilder> getArtistOrBuilderList() {
        return this.artist_;
    }

    @Override // com.google.protobuf.h, p.v2j0
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public int getDiscNumber() {
        return this.discNumber_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public Extension getExtension(int i) {
        return (Extension) this.extension_.get(i);
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public int getExtensionCount() {
        return this.extension_.size();
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public List<Extension> getExtensionList() {
        return this.extension_;
    }

    public ExtensionOrBuilder getExtensionOrBuilder(int i) {
        return (ExtensionOrBuilder) this.extension_.get(i);
    }

    public List<? extends ExtensionOrBuilder> getExtensionOrBuilderList() {
        return this.extension_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public boolean getHasLyrics() {
        return this.hasLyrics_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public boolean getIs19PlusOnly() {
        return this.is19PlusOnly_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public boolean getIsCurated() {
        return this.isCurated_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public boolean getIsExplicit() {
        return this.isExplicit_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public boolean getIsLocal() {
        return this.isLocal_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public boolean getIsPremiumOnly() {
        return this.isPremiumOnly_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public int getLength() {
        return this.length_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public String getLink() {
        return this.link_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public phc getLinkBytes() {
        return phc.i(this.link_);
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public boolean getLocallyPlayable() {
        return this.locallyPlayable_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public phc getNameBytes() {
        return phc.i(this.name_);
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public boolean getPlayable() {
        return this.playable_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public boolean getPlayableLocalTrack() {
        return this.playableLocalTrack_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public String getPlayableTrackLink() {
        return this.playableTrackLink_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public phc getPlayableTrackLinkBytes() {
        return phc.i(this.playableTrackLink_);
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public int getPopularity() {
        return this.popularity_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public String getPreviewId() {
        return this.previewId_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public phc getPreviewIdBytes() {
        return phc.i(this.previewId_);
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public boolean getToBeObfuscated() {
        return this.toBeObfuscated_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public TrackDescriptor getTrackDescriptors(int i) {
        return (TrackDescriptor) this.trackDescriptors_.get(i);
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public int getTrackDescriptorsCount() {
        return this.trackDescriptors_.size();
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public List<TrackDescriptor> getTrackDescriptorsList() {
        return this.trackDescriptors_;
    }

    public TrackDescriptorOrBuilder getTrackDescriptorsOrBuilder(int i) {
        return (TrackDescriptorOrBuilder) this.trackDescriptors_.get(i);
    }

    public List<? extends TrackDescriptorOrBuilder> getTrackDescriptorsOrBuilderList() {
        return this.trackDescriptors_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public int getTrackNumber() {
        return this.trackNumber_;
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public boolean hasAlbum() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public boolean hasDiscNumber() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public boolean hasHasLyrics() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public boolean hasIs19PlusOnly() {
        return (this.bitField0_ & 65536) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public boolean hasIsCurated() {
        return (this.bitField0_ & 131072) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public boolean hasIsExplicit() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public boolean hasIsLocal() {
        return (this.bitField0_ & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public boolean hasIsPremiumOnly() {
        return (this.bitField0_ & 4096) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public boolean hasLength() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public boolean hasLink() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public boolean hasLocallyPlayable() {
        return (this.bitField0_ & 8192) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public boolean hasName() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public boolean hasPlayable() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public boolean hasPlayableLocalTrack() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public boolean hasPlayableTrackLink() {
        return (this.bitField0_ & 16384) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public boolean hasPopularity() {
        return (this.bitField0_ & 32768) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public boolean hasPreviewId() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public boolean hasToBeObfuscated() {
        return (this.bitField0_ & 262144) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.TrackMetadataOrBuilder
    public boolean hasTrackNumber() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(TrackMetadata trackMetadata) {
        return DEFAULT_INSTANCE.createBuilder(trackMetadata);
    }

    public static TrackMetadata parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (TrackMetadata) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static TrackMetadata parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (TrackMetadata) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static TrackMetadata parseFrom(phc phcVar) {
        return (TrackMetadata) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static TrackMetadata parseFrom(phc phcVar, uz00 uz00Var) {
        return (TrackMetadata) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addArtist(int i, TrackArtistMetadata trackArtistMetadata) {
        trackArtistMetadata.getClass();
        ensureArtistIsMutable();
        this.artist_.add(i, trackArtistMetadata);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtension(int i, Extension extension) {
        extension.getClass();
        ensureExtensionIsMutable();
        this.extension_.add(i, extension);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTrackDescriptors(int i, TrackDescriptor trackDescriptor) {
        trackDescriptor.getClass();
        ensureTrackDescriptorsIsMutable();
        this.trackDescriptors_.add(i, trackDescriptor);
    }

    public static TrackMetadata parseFrom(byte[] bArr) {
        return (TrackMetadata) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TrackMetadata parseFrom(byte[] bArr, uz00 uz00Var) {
        return (TrackMetadata) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static TrackMetadata parseFrom(InputStream inputStream) {
        return (TrackMetadata) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrackMetadata parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (TrackMetadata) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static TrackMetadata parseFrom(lwg lwgVar) {
        return (TrackMetadata) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static TrackMetadata parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (TrackMetadata) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
