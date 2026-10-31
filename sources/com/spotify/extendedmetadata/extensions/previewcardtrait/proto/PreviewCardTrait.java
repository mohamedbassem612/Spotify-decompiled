package com.spotify.extendedmetadata.extensions.previewcardtrait.proto;

import com.google.protobuf.Duration;
import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.c131;
import p.cj90;
import p.h290;
import p.jf40;
import p.lyv0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.tqc1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class PreviewCardTrait extends h implements v2j0 {
    public static final int BACKGROUND_COLOR_HEX_FIELD_NUMBER = 11;
    public static final int CONTENT_PARENT_FIELD_NUMBER = 17;
    public static final int CONTENT_TYPE_NAME_FIELD_NUMBER = 2;
    private static final PreviewCardTrait DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int DESCRIPTOR_TAGS_FIELD_NUMBER = 15;
    public static final int DURATION_FIELD_NUMBER = 9;
    public static final int ENTITY_IMAGE_URL_FIELD_NUMBER = 8;
    public static final int ENTITY_URI_FIELD_NUMBER = 5;
    public static final int ITEM_COUNT_UNIT_FIELD_NUMBER = 19;
    public static final int LABELS_FIELD_NUMBER = 14;
    public static final int LIKE_URI_FIELD_NUMBER = 7;
    public static final int NAVIGATE_URI_FIELD_NUMBER = 6;
    public static final int NUMBER_OF_ITEMS_FIELD_NUMBER = 16;
    private static volatile qzr0 PARSER = null;
    public static final int PREVIEW_RESTRICTION_FIELD_NUMBER = 13;
    public static final int PUBLISH_TIME_FIELD_NUMBER = 10;
    public static final int SUBTITLE_SOURCE_FIELD_NUMBER = 18;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int WAVEFORM_COLOR_HEX_FIELD_NUMBER = 12;
    private int bitField0_;
    private ContentParent contentParent_;
    private Duration duration_;
    private int itemCountUnit_;
    private Labels labels_;
    private int numberOfItems_;
    private int previewRestriction_;
    private Timestamp publishTime_;
    private int subtitleSource_;
    private String title_ = "";
    private String contentTypeName_ = "";
    private String description_ = "";
    private String entityUri_ = "";
    private String navigateUri_ = "";
    private String likeUri_ = "";
    private String entityImageUrl_ = "";
    private String backgroundColorHex_ = "";
    private String waveformColorHex_ = "";
    private h290 descriptorTags_ = h.emptyProtobufList();

    static {
        PreviewCardTrait previewCardTrait = new PreviewCardTrait();
        DEFAULT_INSTANCE = previewCardTrait;
        h.registerDefaultInstance(PreviewCardTrait.class, previewCardTrait);
    }

    private PreviewCardTrait() {
    }

    public static PreviewCardTrait C(byte[] bArr) {
        return (PreviewCardTrait) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final String A() {
        return this.waveformColorHex_;
    }

    public final boolean B() {
        return (this.bitField0_ & 8) != 0;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0012\u0000\u0001\u0001\u0013\u0012\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tဉ\u0000\nဉ\u0001\u000bȈ\fȈ\r\f\u000eဉ\u0002\u000f\u001b\u0010\u0004\u0011ဉ\u0003\u0012\f\u0013\f", new Object[]{"bitField0_", "title_", "contentTypeName_", "description_", "entityUri_", "navigateUri_", "likeUri_", "entityImageUrl_", "duration_", "publishTime_", "backgroundColorHex_", "waveformColorHex_", "previewRestriction_", "labels_", "descriptorTags_", DescriptorTag.class, "numberOfItems_", "contentParent_", "subtitleSource_", "itemCountUnit_"});
        }
        if (iOrdinal == 3) {
            return new PreviewCardTrait();
        }
        if (iOrdinal == 4) {
            return new lyv0(DEFAULT_INSTANCE, (byte) 12);
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
        synchronized (PreviewCardTrait.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final Duration getDuration() {
        Duration duration = this.duration_;
        return duration == null ? Duration.n() : duration;
    }

    public final String getEntityUri() {
        return this.entityUri_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final String n() {
        return this.backgroundColorHex_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ContentParent o() {
        ContentParent contentParent = this.contentParent_;
        return contentParent == null ? ContentParent.n() : contentParent;
    }

    public final String p() {
        return this.contentTypeName_;
    }

    public final h290 q() {
        return this.descriptorTags_;
    }

    public final String r() {
        return this.entityImageUrl_;
    }

    public final cj90 s() {
        cj90 cj90Var;
        int i = this.itemCountUnit_;
        if (i == 0) {
            cj90Var = cj90.ITEM_COUNT_UNIT_UNKNOWN;
        } else if (i == 1) {
            cj90Var = cj90.ITEM_COUNT_UNIT_SONGS;
        } else if (i == 2) {
            cj90Var = cj90.ITEM_COUNT_UNIT_BOOKS;
        } else if (i != 3) {
            cj90Var = i != 4 ? null : cj90.ITEM_COUNT_UNIT_ITEMS;
        } else {
            cj90Var = cj90.ITEM_COUNT_UNIT_EPISODES;
        }
        return cj90Var == null ? cj90.UNRECOGNIZED : cj90Var;
    }

    public final Labels t() {
        Labels labels = this.labels_;
        return labels == null ? Labels.n() : labels;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final String u() {
        return this.likeUri_;
    }

    public final String v() {
        return this.navigateUri_;
    }

    public final int w() {
        return this.numberOfItems_;
    }

    public final c131 x() {
        c131 c131Var;
        int i = this.previewRestriction_;
        if (i == 0) {
            c131Var = c131.NONE;
        } else if (i != 1) {
            c131Var = i != 2 ? null : c131.IS_19_PLUS;
        } else {
            c131Var = c131.IS_EXPLICIT;
        }
        return c131Var == null ? c131.UNRECOGNIZED : c131Var;
    }

    public final Timestamp y() {
        Timestamp timestamp = this.publishTime_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final tqc1 z() {
        tqc1 tqc1Var;
        int i = this.subtitleSource_;
        if (i == 0) {
            tqc1Var = tqc1.SUBTITLE_SOURCE_UNKNOWN;
        } else if (i != 1) {
            tqc1Var = i != 2 ? null : tqc1.SUBTITLE_SOURCE_OPERATOR_AUTHORED;
        } else {
            tqc1Var = tqc1.SUBTITLE_SOURCE_GENERATED_METADATA;
        }
        return tqc1Var == null ? tqc1.UNRECOGNIZED : tqc1Var;
    }
}
