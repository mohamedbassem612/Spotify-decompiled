package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.h;
import java.util.List;
import p.bf40;
import p.h290;
import p.jf40;
import p.mn71;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ShowMetadata$ProtoShowMetadata extends h implements v2j0 {
    public static final int CONSUMPTION_ORDER_FIELD_NUMBER = 10;
    public static final int COPYRIGHT_FIELD_NUMBER = 12;
    public static final int COVERS_FIELD_NUMBER = 8;
    private static final ShowMetadata$ProtoShowMetadata DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int EXTENSION_FIELD_NUMBER = 15;
    public static final int FORMAT_LIST_ATTRIBUTES_FIELD_NUMBER = 18;
    public static final int IS_BOOK_FIELD_NUMBER = 16;
    public static final int IS_CREATOR_CHANNEL_FIELD_NUMBER = 17;
    public static final int IS_EXPLICIT_FIELD_NUMBER = 7;
    public static final int IS_MUSIC_AND_TALK_FIELD_NUMBER = 14;
    public static final int LANGUAGE_FIELD_NUMBER = 6;
    public static final int LINK_FIELD_NUMBER = 1;
    public static final int MEDIA_TYPE_ENUM_FIELD_NUMBER = 11;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int NUM_EPISODES_FIELD_NUMBER = 9;
    private static volatile qzr0 PARSER = null;
    public static final int POPULARITY_FIELD_NUMBER = 4;
    public static final int PUBLISHER_FIELD_NUMBER = 5;
    public static final int TRAILER_URI_FIELD_NUMBER = 13;
    private int bitField0_;
    private ImageGroup$ProtoImageGroup covers_;
    private boolean isBook_;
    private boolean isCreatorChannel_;
    private boolean isExplicit_;
    private boolean isMusicAndTalk_;
    private int mediaTypeEnum_;
    private int numEpisodes_;
    private int popularity_;
    private String link_ = "";
    private String name_ = "";
    private String description_ = "";
    private String publisher_ = "";
    private String language_ = "";
    private String consumptionOrder_ = "";
    private String copyright_ = "";
    private String trailerUri_ = "";
    private h290 extension_ = h.emptyProtobufList();
    private h290 formatListAttributes_ = h.emptyProtobufList();

    static {
        ShowMetadata$ProtoShowMetadata showMetadata$ProtoShowMetadata = new ShowMetadata$ProtoShowMetadata();
        DEFAULT_INSTANCE = showMetadata$ProtoShowMetadata;
        h.registerDefaultInstance(ShowMetadata$ProtoShowMetadata.class, showMetadata$ProtoShowMetadata);
    }

    private ShowMetadata$ProtoShowMetadata() {
    }

    public static ShowMetadata$ProtoShowMetadata p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0012\u0000\u0001\u0001\u0012\u0012\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဋ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဉ\u0007\tဋ\b\nဈ\t\u000bင\n\fဈ\u000b\rဈ\f\u000eဇ\r\u000f\u001b\u0010ဇ\u000e\u0011ဇ\u000f\u0012\u001b", new Object[]{"bitField0_", "link_", "name_", "description_", "popularity_", "publisher_", "language_", "isExplicit_", "covers_", "numEpisodes_", "consumptionOrder_", "mediaTypeEnum_", "copyright_", "trailerUri_", "isMusicAndTalk_", "extension_", Extension.class, "isBook_", "isCreatorChannel_", "formatListAttributes_", ShowMetadata$ProtoFormatListAttribute.class});
        }
        if (iOrdinal == 3) {
            return new ShowMetadata$ProtoShowMetadata();
        }
        if (iOrdinal == 4) {
            return new mn71(DEFAULT_INSTANCE, (byte) 28);
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
        synchronized (ShowMetadata$ProtoShowMetadata.class) {
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

    public final String getConsumptionOrder() {
        return this.consumptionOrder_;
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

    public final List getFormatListAttributesList() {
        return this.formatListAttributes_;
    }

    public final boolean getIsBook() {
        return this.isBook_;
    }

    public final boolean getIsExplicit() {
        return this.isExplicit_;
    }

    public final boolean getIsMusicAndTalk() {
        return this.isMusicAndTalk_;
    }

    public final String getLink() {
        return this.link_;
    }

    public final int getMediaTypeEnum() {
        return this.mediaTypeEnum_;
    }

    public final String getName() {
        return this.name_;
    }

    public final String getPublisher() {
        return this.publisher_;
    }

    public final String getTrailerUri() {
        return this.trailerUri_;
    }

    public final boolean hasCovers() {
        return (this.bitField0_ & 128) != 0;
    }

    public final boolean hasMediaTypeEnum() {
        return (this.bitField0_ & 1024) != 0;
    }

    public final String n() {
        return this.copyright_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ImageGroup$ProtoImageGroup o() {
        ImageGroup$ProtoImageGroup imageGroup$ProtoImageGroup = this.covers_;
        return imageGroup$ProtoImageGroup == null ? ImageGroup$ProtoImageGroup.n() : imageGroup$ProtoImageGroup;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
