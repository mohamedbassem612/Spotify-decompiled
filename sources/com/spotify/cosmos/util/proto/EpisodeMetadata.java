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
import p.v190;
import p.y190;
import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class EpisodeMetadata extends h implements EpisodeMetadataOrBuilder {
    public static final int AVAILABLE_FIELD_NUMBER = 11;
    public static final int BACKGROUNDABLE_FIELD_NUMBER = 14;
    public static final int COVERS_FIELD_NUMBER = 5;
    private static final EpisodeMetadata DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 7;
    public static final int EPISODE_TYPE_FIELD_NUMBER = 18;
    public static final int EXTENSION_FIELD_NUMBER = 22;
    public static final int FREEZE_FRAMES_FIELD_NUMBER = 9;
    public static final int IS_19_PLUS_ONLY_FIELD_NUMBER = 23;
    public static final int IS_BOOK_CHAPTER_FIELD_NUMBER = 24;
    public static final int IS_CURATED_FIELD_NUMBER = 26;
    public static final int IS_EXPLICIT_FIELD_NUMBER = 16;
    public static final int IS_MUSIC_AND_TALK_FIELD_NUMBER = 19;
    public static final int IS_PODCAST_SHORT_FIELD_NUMBER = 25;
    public static final int LANGUAGE_FIELD_NUMBER = 10;
    public static final int LENGTH_FIELD_NUMBER = 4;
    public static final int LINK_FIELD_NUMBER = 2;
    public static final int MANIFEST_ID_FIELD_NUMBER = 6;
    public static final int MEDIA_TYPE_ENUM_FIELD_NUMBER = 12;
    public static final int NAME_FIELD_NUMBER = 3;
    public static final int NUMBER_FIELD_NUMBER = 13;
    private static volatile qzr0 PARSER = null;
    public static final int PREVIEW_ID_FIELD_NUMBER = 17;
    public static final int PREVIEW_MANIFEST_ID_FIELD_NUMBER = 15;
    public static final int PUBLISH_DATE_FIELD_NUMBER = 8;
    public static final int SHOW_FIELD_NUMBER = 1;
    private boolean available_;
    private boolean backgroundable_;
    private int bitField0_;
    private ImageGroup covers_;
    private int episodeType_;
    private ImageGroup freezeFrames_;
    private boolean is19PlusOnly_;
    private boolean isBookChapter_;
    private boolean isCurated_;
    private boolean isExplicit_;
    private boolean isMusicAndTalk_;
    private boolean isPodcastShort_;
    private int length_;
    private int mediaTypeEnum_;
    private int number_;
    private long publishDate_;
    private EpisodeShowMetadata show_;
    private String link_ = "";
    private String name_ = "";
    private String manifestId_ = "";
    private String description_ = "";
    private String language_ = "";
    private String previewManifestId_ = "";
    private String previewId_ = "";
    private h290 extension_ = h.emptyProtobufList();

    static {
        EpisodeMetadata episodeMetadata = new EpisodeMetadata();
        DEFAULT_INSTANCE = episodeMetadata;
        h.registerDefaultInstance(EpisodeMetadata.class, episodeMetadata);
    }

    private EpisodeMetadata() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExtension(Iterable<? extends Extension> iterable) {
        ensureExtensionIsMutable();
        s8.addAll(iterable, this.extension_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtension(Extension extension) {
        extension.getClass();
        ensureExtensionIsMutable();
        this.extension_.add(extension);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvailable() {
        this.bitField0_ &= -1025;
        this.available_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackgroundable() {
        this.bitField0_ &= -8193;
        this.backgroundable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCovers() {
        this.covers_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.bitField0_ &= -65;
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEpisodeType() {
        this.bitField0_ &= -131073;
        this.episodeType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtension() {
        this.extension_ = h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFreezeFrames() {
        this.freezeFrames_ = null;
        this.bitField0_ &= -257;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIs19PlusOnly() {
        this.bitField0_ &= -524289;
        this.is19PlusOnly_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsBookChapter() {
        this.bitField0_ &= -1048577;
        this.isBookChapter_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsCurated() {
        this.bitField0_ &= -4194305;
        this.isCurated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsExplicit() {
        this.bitField0_ &= -32769;
        this.isExplicit_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsMusicAndTalk() {
        this.bitField0_ &= -262145;
        this.isMusicAndTalk_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPodcastShort() {
        this.bitField0_ &= -2097153;
        this.isPodcastShort_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguage() {
        this.bitField0_ &= -513;
        this.language_ = getDefaultInstance().getLanguage();
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
    public void clearManifestId() {
        this.bitField0_ &= -33;
        this.manifestId_ = getDefaultInstance().getManifestId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMediaTypeEnum() {
        this.bitField0_ &= -2049;
        this.mediaTypeEnum_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -5;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumber() {
        this.bitField0_ &= -4097;
        this.number_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreviewId() {
        this.bitField0_ &= -65537;
        this.previewId_ = getDefaultInstance().getPreviewId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreviewManifestId() {
        this.bitField0_ &= -16385;
        this.previewManifestId_ = getDefaultInstance().getPreviewManifestId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublishDate() {
        this.bitField0_ &= -129;
        this.publishDate_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShow() {
        this.show_ = null;
        this.bitField0_ &= -2;
    }

    private void ensureExtensionIsMutable() {
        h290 h290Var = this.extension_;
        if (((i9) h290Var).a) {
            return;
        }
        this.extension_ = h.mutableCopy(h290Var);
    }

    public static EpisodeMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCovers(ImageGroup imageGroup) {
        imageGroup.getClass();
        ImageGroup imageGroup2 = this.covers_;
        if (imageGroup2 == null || imageGroup2 == ImageGroup.getDefaultInstance()) {
            this.covers_ = imageGroup;
        } else {
            this.covers_ = (ImageGroup) ImageGroup.newBuilder(this.covers_).mergeFrom(imageGroup).buildPartial();
        }
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFreezeFrames(ImageGroup imageGroup) {
        imageGroup.getClass();
        ImageGroup imageGroup2 = this.freezeFrames_;
        if (imageGroup2 == null || imageGroup2 == ImageGroup.getDefaultInstance()) {
            this.freezeFrames_ = imageGroup;
        } else {
            this.freezeFrames_ = (ImageGroup) ImageGroup.newBuilder(this.freezeFrames_).mergeFrom(imageGroup).buildPartial();
        }
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeShow(EpisodeShowMetadata episodeShowMetadata) {
        episodeShowMetadata.getClass();
        EpisodeShowMetadata episodeShowMetadata2 = this.show_;
        if (episodeShowMetadata2 == null || episodeShowMetadata2 == EpisodeShowMetadata.getDefaultInstance()) {
            this.show_ = episodeShowMetadata;
        } else {
            this.show_ = EpisodeShowMetadata.newBuilder(this.show_).mergeFrom(episodeShowMetadata).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static EpisodeMetadata parseDelimitedFrom(InputStream inputStream) {
        return (EpisodeMetadata) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodeMetadata parseFrom(ByteBuffer byteBuffer) {
        return (EpisodeMetadata) h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeExtension(int i) {
        ensureExtensionIsMutable();
        this.extension_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvailable(boolean z) {
        this.bitField0_ |= 1024;
        this.available_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackgroundable(boolean z) {
        this.bitField0_ |= 8192;
        this.backgroundable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCovers(ImageGroup imageGroup) {
        imageGroup.getClass();
        this.covers_ = imageGroup;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(phc phcVar) {
        this.description_ = phcVar.v();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEpisodeType(EpisodeType episodeType) {
        this.episodeType_ = episodeType.getNumber();
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtension(int i, Extension extension) {
        extension.getClass();
        ensureExtensionIsMutable();
        this.extension_.set(i, extension);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFreezeFrames(ImageGroup imageGroup) {
        imageGroup.getClass();
        this.freezeFrames_ = imageGroup;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIs19PlusOnly(boolean z) {
        this.bitField0_ |= 524288;
        this.is19PlusOnly_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsBookChapter(boolean z) {
        this.bitField0_ |= 1048576;
        this.isBookChapter_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsCurated(boolean z) {
        this.bitField0_ |= 4194304;
        this.isCurated_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsExplicit(boolean z) {
        this.bitField0_ |= 32768;
        this.isExplicit_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsMusicAndTalk(boolean z) {
        this.bitField0_ |= 262144;
        this.isMusicAndTalk_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPodcastShort(boolean z) {
        this.bitField0_ |= 2097152;
        this.isPodcastShort_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguage(String str) {
        str.getClass();
        this.bitField0_ |= NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS;
        this.language_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageBytes(phc phcVar) {
        this.language_ = phcVar.v();
        this.bitField0_ |= NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS;
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
    public void setManifestId(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.manifestId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setManifestIdBytes(phc phcVar) {
        this.manifestId_ = phcVar.v();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediaTypeEnum(MediaType mediaType) {
        this.mediaTypeEnum_ = mediaType.getNumber();
        this.bitField0_ |= 2048;
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
    public void setNumber(int i) {
        this.bitField0_ |= 4096;
        this.number_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviewId(String str) {
        str.getClass();
        this.bitField0_ |= 65536;
        this.previewId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviewIdBytes(phc phcVar) {
        this.previewId_ = phcVar.v();
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviewManifestId(String str) {
        str.getClass();
        this.bitField0_ |= 16384;
        this.previewManifestId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviewManifestIdBytes(phc phcVar) {
        this.previewManifestId_ = phcVar.v();
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublishDate(long j) {
        this.bitField0_ |= 128;
        this.publishDate_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShow(EpisodeShowMetadata episodeShowMetadata) {
        episodeShowMetadata.getClass();
        this.show_ = episodeShowMetadata;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.h
    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        qzr0 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0018\u0000\u0001\u0001\u001a\u0018\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဋ\u0003\u0005ဉ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\tဉ\b\nဈ\t\u000bဇ\n\f᠌\u000b\rင\f\u000eဇ\r\u000fဈ\u000e\u0010ဇ\u000f\u0011ဈ\u0010\u0012᠌\u0011\u0013ဇ\u0012\u0016\u001b\u0017ဇ\u0013\u0018ဇ\u0014\u0019ဇ\u0015\u001aဇ\u0016", new Object[]{"bitField0_", "show_", "link_", "name_", "length_", "covers_", "manifestId_", "description_", "publishDate_", "freezeFrames_", "language_", "available_", "mediaTypeEnum_", MediaType.internalGetVerifier(), "number_", "backgroundable_", "previewManifestId_", "isExplicit_", "previewId_", "episodeType_", EpisodeType.internalGetVerifier(), "isMusicAndTalk_", "extension_", Extension.class, "is19PlusOnly_", "isBookChapter_", "isPodcastShort_", "isCurated_"});
        }
        if (iOrdinal == 3) {
            return new EpisodeMetadata();
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
        synchronized (EpisodeMetadata.class) {
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

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean getAvailable() {
        return this.available_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean getBackgroundable() {
        return this.backgroundable_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public ImageGroup getCovers() {
        ImageGroup imageGroup = this.covers_;
        return imageGroup == null ? ImageGroup.getDefaultInstance() : imageGroup;
    }

    @Override // com.google.protobuf.h, p.v2j0
    public /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public String getDescription() {
        return this.description_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public phc getDescriptionBytes() {
        return phc.i(this.description_);
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public EpisodeType getEpisodeType() {
        EpisodeType episodeTypeForNumber = EpisodeType.forNumber(this.episodeType_);
        return episodeTypeForNumber == null ? EpisodeType.UNKNOWN : episodeTypeForNumber;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public Extension getExtension(int i) {
        return (Extension) this.extension_.get(i);
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public int getExtensionCount() {
        return this.extension_.size();
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public List<Extension> getExtensionList() {
        return this.extension_;
    }

    public ExtensionOrBuilder getExtensionOrBuilder(int i) {
        return (ExtensionOrBuilder) this.extension_.get(i);
    }

    public List<? extends ExtensionOrBuilder> getExtensionOrBuilderList() {
        return this.extension_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public ImageGroup getFreezeFrames() {
        ImageGroup imageGroup = this.freezeFrames_;
        return imageGroup == null ? ImageGroup.getDefaultInstance() : imageGroup;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean getIs19PlusOnly() {
        return this.is19PlusOnly_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean getIsBookChapter() {
        return this.isBookChapter_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean getIsCurated() {
        return this.isCurated_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean getIsExplicit() {
        return this.isExplicit_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean getIsMusicAndTalk() {
        return this.isMusicAndTalk_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean getIsPodcastShort() {
        return this.isPodcastShort_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public String getLanguage() {
        return this.language_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public phc getLanguageBytes() {
        return phc.i(this.language_);
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public int getLength() {
        return this.length_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public String getLink() {
        return this.link_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public phc getLinkBytes() {
        return phc.i(this.link_);
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public String getManifestId() {
        return this.manifestId_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public phc getManifestIdBytes() {
        return phc.i(this.manifestId_);
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public MediaType getMediaTypeEnum() {
        MediaType mediaTypeForNumber = MediaType.forNumber(this.mediaTypeEnum_);
        return mediaTypeForNumber == null ? MediaType.VODCAST : mediaTypeForNumber;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public phc getNameBytes() {
        return phc.i(this.name_);
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public int getNumber() {
        return this.number_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public String getPreviewId() {
        return this.previewId_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public phc getPreviewIdBytes() {
        return phc.i(this.previewId_);
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public String getPreviewManifestId() {
        return this.previewManifestId_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public phc getPreviewManifestIdBytes() {
        return phc.i(this.previewManifestId_);
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public long getPublishDate() {
        return this.publishDate_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public EpisodeShowMetadata getShow() {
        EpisodeShowMetadata episodeShowMetadata = this.show_;
        return episodeShowMetadata == null ? EpisodeShowMetadata.getDefaultInstance() : episodeShowMetadata;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasAvailable() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasBackgroundable() {
        return (this.bitField0_ & 8192) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasCovers() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasDescription() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasEpisodeType() {
        return (this.bitField0_ & 131072) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasFreezeFrames() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasIs19PlusOnly() {
        return (this.bitField0_ & 524288) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasIsBookChapter() {
        return (this.bitField0_ & 1048576) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasIsCurated() {
        return (this.bitField0_ & 4194304) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasIsExplicit() {
        return (this.bitField0_ & 32768) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasIsMusicAndTalk() {
        return (this.bitField0_ & 262144) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasIsPodcastShort() {
        return (this.bitField0_ & 2097152) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasLanguage() {
        return (this.bitField0_ & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasLength() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasLink() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasManifestId() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasMediaTypeEnum() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasName() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasNumber() {
        return (this.bitField0_ & 4096) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasPreviewId() {
        return (this.bitField0_ & 65536) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasPreviewManifestId() {
        return (this.bitField0_ & 16384) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasPublishDate() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasShow() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.h, p.s2j0
    public /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public enum EpisodeType implements v190 {
        UNKNOWN(0),
        FULL(1),
        TRAILER(2),
        BONUS(3);

        public static final int BONUS_VALUE = 3;
        public static final int FULL_VALUE = 1;
        public static final int TRAILER_VALUE = 2;
        public static final int UNKNOWN_VALUE = 0;
        private static final y190 internalValueMap = new y190() { // from class: com.spotify.cosmos.util.proto.EpisodeMetadata.EpisodeType.1
            @Override // p.y190
            public EpisodeType findValueByNumber(int i) {
                return EpisodeType.forNumber(i);
            }
        };
        private final int value;

        EpisodeType(int i) {
            this.value = i;
        }

        public static EpisodeType forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return FULL;
            }
            if (i == 2) {
                return TRAILER;
            }
            if (i != 3) {
                return null;
            }
            return BONUS;
        }

        public static y190 internalGetValueMap() {
            return internalValueMap;
        }

        public static z190 internalGetVerifier() {
            return EpisodeTypeVerifier.INSTANCE;
        }

        @Override // p.v190
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static EpisodeType valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum MediaType implements v190 {
        VODCAST(0),
        AUDIO(1),
        VIDEO(2);

        public static final int AUDIO_VALUE = 1;
        public static final int VIDEO_VALUE = 2;
        public static final int VODCAST_VALUE = 0;
        private static final y190 internalValueMap = new y190() { // from class: com.spotify.cosmos.util.proto.EpisodeMetadata.MediaType.1
            @Override // p.y190
            public MediaType findValueByNumber(int i) {
                return MediaType.forNumber(i);
            }
        };
        private final int value;

        MediaType(int i) {
            this.value = i;
        }

        public static MediaType forNumber(int i) {
            if (i == 0) {
                return VODCAST;
            }
            if (i == 1) {
                return AUDIO;
            }
            if (i != 2) {
                return null;
            }
            return VIDEO;
        }

        public static y190 internalGetValueMap() {
            return internalValueMap;
        }

        public static z190 internalGetVerifier() {
            return MediaTypeVerifier.INSTANCE;
        }

        @Override // p.v190
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static MediaType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static Builder newBuilder(EpisodeMetadata episodeMetadata) {
        return DEFAULT_INSTANCE.createBuilder(episodeMetadata);
    }

    public static EpisodeMetadata parseDelimitedFrom(InputStream inputStream, uz00 uz00Var) {
        return (EpisodeMetadata) h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static EpisodeMetadata parseFrom(ByteBuffer byteBuffer, uz00 uz00Var) {
        return (EpisodeMetadata) h.parseFrom(DEFAULT_INSTANCE, byteBuffer, uz00Var);
    }

    public static EpisodeMetadata parseFrom(phc phcVar) {
        return (EpisodeMetadata) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public static EpisodeMetadata parseFrom(phc phcVar, uz00 uz00Var) {
        return (EpisodeMetadata) h.parseFrom(DEFAULT_INSTANCE, phcVar, uz00Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtension(int i, Extension extension) {
        extension.getClass();
        ensureExtensionIsMutable();
        this.extension_.add(i, extension);
    }

    public static EpisodeMetadata parseFrom(byte[] bArr) {
        return (EpisodeMetadata) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EpisodeMetadata parseFrom(byte[] bArr, uz00 uz00Var) {
        return (EpisodeMetadata) h.parseFrom(DEFAULT_INSTANCE, bArr, uz00Var);
    }

    public static EpisodeMetadata parseFrom(InputStream inputStream) {
        return (EpisodeMetadata) h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodeMetadata parseFrom(InputStream inputStream, uz00 uz00Var) {
        return (EpisodeMetadata) h.parseFrom(DEFAULT_INSTANCE, inputStream, uz00Var);
    }

    public static EpisodeMetadata parseFrom(lwg lwgVar) {
        return (EpisodeMetadata) h.parseFrom(DEFAULT_INSTANCE, lwgVar);
    }

    public static EpisodeMetadata parseFrom(lwg lwgVar, uz00 uz00Var) {
        return (EpisodeMetadata) h.parseFrom(DEFAULT_INSTANCE, lwgVar, uz00Var);
    }
}
