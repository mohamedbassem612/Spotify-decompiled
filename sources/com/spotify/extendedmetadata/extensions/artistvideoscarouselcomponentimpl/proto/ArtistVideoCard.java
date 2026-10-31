package com.spotify.extendedmetadata.extensions.artistvideoscarouselcomponentimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.db6;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ArtistVideoCard extends h implements v2j0 {
    public static final int ALBUM_URI_FIELD_NUMBER = 12;
    public static final int ARTIST_URI_FIELD_NUMBER = 11;
    public static final int DECISION_ID_FIELD_NUMBER = 13;
    private static final ArtistVideoCard DEFAULT_INSTANCE;
    public static final int INDEX_FIELD_NUMBER = 10;
    public static final int IS_19PLUS_FIELD_NUMBER = 4;
    public static final int IS_ANIMATED_FIELD_NUMBER = 2;
    public static final int IS_EXPLICIT_FIELD_NUMBER = 3;
    public static final int MANIFEST_ID_FIELD_NUMBER = 5;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int PLACEHOLDER_IMAGE_URL_FIELD_NUMBER = 6;
    public static final int SUBTITLE_FIELD_NUMBER = 9;
    public static final int TITLE_FIELD_NUMBER = 8;
    public static final int VIDEO_URI_FIELD_NUMBER = 1;
    private int index_;
    private boolean is19Plus_;
    private boolean isAnimated_;
    private boolean isExplicit_;
    private String videoUri_ = "";
    private String manifestId_ = "";
    private String placeholderImageUrl_ = "";
    private String navigationUri_ = "";
    private String title_ = "";
    private String subtitle_ = "";
    private String artistUri_ = "";
    private String albumUri_ = "";
    private String decisionId_ = "";

    static {
        ArtistVideoCard artistVideoCard = new ArtistVideoCard();
        DEFAULT_INSTANCE = artistVideoCard;
        h.registerDefaultInstance(ArtistVideoCard.class, artistVideoCard);
    }

    private ArtistVideoCard() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0000\u0001\r\r\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\u0007\u0004\u0007\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\n\u0004\u000bȈ\fȈ\rȈ", new Object[]{"videoUri_", "isAnimated_", "isExplicit_", "is19Plus_", "manifestId_", "placeholderImageUrl_", "navigationUri_", "title_", "subtitle_", "index_", "artistUri_", "albumUri_", "decisionId_"});
        }
        if (iOrdinal == 3) {
            return new ArtistVideoCard();
        }
        if (iOrdinal == 4) {
            return new db6(DEFAULT_INSTANCE, (byte) 14);
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
        synchronized (ArtistVideoCard.class) {
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

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final int getIndex() {
        return this.index_;
    }

    public final boolean getIsExplicit() {
        return this.isExplicit_;
    }

    public final String getManifestId() {
        return this.manifestId_;
    }

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final String n() {
        return this.albumUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.artistUri_;
    }

    public final String p() {
        return this.decisionId_;
    }

    public final boolean q() {
        return this.is19Plus_;
    }

    public final boolean r() {
        return this.isAnimated_;
    }

    public final String s() {
        return this.navigationUri_;
    }

    public final String t() {
        return this.placeholderImageUrl_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final String u() {
        return this.videoUri_;
    }
}
