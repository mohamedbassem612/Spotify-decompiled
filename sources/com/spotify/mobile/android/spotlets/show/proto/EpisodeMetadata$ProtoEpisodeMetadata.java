package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.h;
import java.util.List;
import p.a01;
import p.bf40;
import p.fxy;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.v6z;
import p.w6z;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class EpisodeMetadata$ProtoEpisodeMetadata extends h implements v2j0 {
    public static final int AVAILABLE_FIELD_NUMBER = 11;
    public static final int BACKGROUNDABLE_FIELD_NUMBER = 14;
    public static final int COVERS_FIELD_NUMBER = 5;
    private static final EpisodeMetadata$ProtoEpisodeMetadata DEFAULT_INSTANCE;
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
    private static volatile qzr0 PARSER = null;
    public static final int PREVIEW_ID_FIELD_NUMBER = 17;
    public static final int PREVIEW_MANIFEST_ID_FIELD_NUMBER = 15;
    public static final int PUBLISH_DATE_FIELD_NUMBER = 8;
    public static final int SHOW_FIELD_NUMBER = 1;
    private boolean available_;
    private boolean backgroundable_;
    private int bitField0_;
    private ImageGroup$ProtoImageGroup covers_;
    private int episodeType_;
    private ImageGroup$ProtoImageGroup freezeFrames_;
    private boolean is19PlusOnly_;
    private boolean isBookChapter_;
    private boolean isCurated_;
    private boolean isExplicit_;
    private boolean isMusicAndTalk_;
    private boolean isPodcastShort_;
    private int length_;
    private int mediaTypeEnum_;
    private long publishDate_;
    private EpisodeMetadata$ProtoEpisodeShowMetadata show_;
    private String link_ = "";
    private String name_ = "";
    private String manifestId_ = "";
    private String description_ = "";
    private String language_ = "";
    private String previewManifestId_ = "";
    private String previewId_ = "";
    private h290 extension_ = h.emptyProtobufList();

    static {
        EpisodeMetadata$ProtoEpisodeMetadata episodeMetadata$ProtoEpisodeMetadata = new EpisodeMetadata$ProtoEpisodeMetadata();
        DEFAULT_INSTANCE = episodeMetadata$ProtoEpisodeMetadata;
        h.registerDefaultInstance(EpisodeMetadata$ProtoEpisodeMetadata.class, episodeMetadata$ProtoEpisodeMetadata);
    }

    private EpisodeMetadata$ProtoEpisodeMetadata() {
    }

    public static EpisodeMetadata$ProtoEpisodeMetadata o() {
        return DEFAULT_INSTANCE;
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0017\u0000\u0001\u0001\u001a\u0017\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဋ\u0003\u0005ဉ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\tဉ\b\nဈ\t\u000bဇ\n\f᠌\u000b\u000eဇ\f\u000fဈ\r\u0010ဇ\u000e\u0011ဈ\u000f\u0012᠌\u0010\u0013ဇ\u0011\u0016\u001b\u0017ဇ\u0012\u0018ဇ\u0013\u0019ဇ\u0014\u001aဇ\u0015", new Object[]{"bitField0_", "show_", "link_", "name_", "length_", "covers_", "manifestId_", "description_", "publishDate_", "freezeFrames_", "language_", "available_", "mediaTypeEnum_", a01.h, "backgroundable_", "previewManifestId_", "isExplicit_", "previewId_", "episodeType_", a01.g, "isMusicAndTalk_", "extension_", Extension.class, "is19PlusOnly_", "isBookChapter_", "isPodcastShort_", "isCurated_"});
        }
        if (iOrdinal == 3) {
            return new EpisodeMetadata$ProtoEpisodeMetadata();
        }
        if (iOrdinal == 4) {
            return new fxy(DEFAULT_INSTANCE, (byte) 11);
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
        synchronized (EpisodeMetadata$ProtoEpisodeMetadata.class) {
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

    public final boolean getAvailable() {
        return this.available_;
    }

    public final boolean getBackgroundable() {
        return this.backgroundable_;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getDescription() {
        return this.description_;
    }

    public final List getExtensionList() {
        return this.extension_;
    }

    public final boolean getIs19PlusOnly() {
        return this.is19PlusOnly_;
    }

    public final boolean getIsBookChapter() {
        return this.isBookChapter_;
    }

    public final boolean getIsCurated() {
        return this.isCurated_;
    }

    public final boolean getIsExplicit() {
        return this.isExplicit_;
    }

    public final boolean getIsMusicAndTalk() {
        return this.isMusicAndTalk_;
    }

    public final int getLength() {
        return this.length_;
    }

    public final String getLink() {
        return this.link_;
    }

    public final String getManifestId() {
        return this.manifestId_;
    }

    public final String getName() {
        return this.name_;
    }

    public final String getPreviewId() {
        return this.previewId_;
    }

    public final String getPreviewManifestId() {
        return this.previewManifestId_;
    }

    public final long getPublishDate() {
        return this.publishDate_;
    }

    public final boolean hasCovers() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean hasFreezeFrames() {
        return (this.bitField0_ & 256) != 0;
    }

    public final boolean hasMediaTypeEnum() {
        return (this.bitField0_ & 2048) != 0;
    }

    public final boolean hasShow() {
        return (this.bitField0_ & 1) != 0;
    }

    public final ImageGroup$ProtoImageGroup n() {
        ImageGroup$ProtoImageGroup imageGroup$ProtoImageGroup = this.covers_;
        return imageGroup$ProtoImageGroup == null ? ImageGroup$ProtoImageGroup.n() : imageGroup$ProtoImageGroup;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final v6z p() {
        v6z v6zVarA = v6z.a(this.episodeType_);
        return v6zVarA == null ? v6z.UNKNOWN : v6zVarA;
    }

    public final ImageGroup$ProtoImageGroup q() {
        ImageGroup$ProtoImageGroup imageGroup$ProtoImageGroup = this.freezeFrames_;
        return imageGroup$ProtoImageGroup == null ? ImageGroup$ProtoImageGroup.n() : imageGroup$ProtoImageGroup;
    }

    public final w6z r() {
        w6z w6zVarA = w6z.a(this.mediaTypeEnum_);
        return w6zVarA == null ? w6z.VODCAST : w6zVarA;
    }

    public final EpisodeMetadata$ProtoEpisodeShowMetadata s() {
        EpisodeMetadata$ProtoEpisodeShowMetadata episodeMetadata$ProtoEpisodeShowMetadata = this.show_;
        return episodeMetadata$ProtoEpisodeShowMetadata == null ? EpisodeMetadata$ProtoEpisodeShowMetadata.o() : episodeMetadata$ProtoEpisodeShowMetadata;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
