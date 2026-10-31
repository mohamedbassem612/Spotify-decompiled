package com.spotify.extendedmetadata.extensions.promov1trait.proto;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.d131;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vzw0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class PromoV1Trait extends h implements v2j0 {
    public static final int CONTENT_PARENT_NAME_FIELD_NUMBER = 8;
    public static final int CONTENT_TYPE_NAME_FIELD_NUMBER = 5;
    public static final int CREATORS_FIELD_NUMBER = 9;
    private static final PromoV1Trait DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 11;
    public static final int IMAGE_URL_FIELD_NUMBER = 4;
    public static final int IS_SINGLE_RELEASE_FIELD_NUMBER = 15;
    public static final int ITEMS_DESCRIPTION_FIELD_NUMBER = 14;
    public static final int LABELS_FIELD_NUMBER = 6;
    public static final int NAVIGATE_URI_FIELD_NUMBER = 3;
    public static final int NUMBER_OF_ITEMS_FIELD_NUMBER = 13;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_URI_FIELD_NUMBER = 10;
    public static final int PREVIEW_RESTRICTION_FIELD_NUMBER = 12;
    public static final int PUBLISH_TIME_FIELD_NUMBER = 7;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean isSingleRelease_;
    private int numberOfItems_;
    private int previewRestriction_;
    private Timestamp publishTime_;
    private String title_ = "";
    private String subtitle_ = "";
    private String navigateUri_ = "";
    private String imageUrl_ = "";
    private String contentTypeName_ = "";
    private h290 labels_ = h.emptyProtobufList();
    private String contentParentName_ = "";
    private h290 creators_ = h.emptyProtobufList();
    private String playbackUri_ = "";
    private String description_ = "";
    private String itemsDescription_ = "";

    static {
        PromoV1Trait promoV1Trait = new PromoV1Trait();
        DEFAULT_INSTANCE = promoV1Trait;
        h.registerDefaultInstance(PromoV1Trait.class, promoV1Trait);
    }

    private PromoV1Trait() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static PromoV1Trait z(byte[] bArr) {
        return (PromoV1Trait) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u001b\u0007ဉ\u0000\bȈ\t\u001b\nȈ\u000bȈ\f\f\r\u0004\u000eȈ\u000f\u0007", new Object[]{"bitField0_", "title_", "subtitle_", "navigateUri_", "imageUrl_", "contentTypeName_", "labels_", Label.class, "publishTime_", "contentParentName_", "creators_", Creator.class, "playbackUri_", "description_", "previewRestriction_", "numberOfItems_", "itemsDescription_", "isSingleRelease_"});
        }
        if (iOrdinal == 3) {
            return new PromoV1Trait();
        }
        if (iOrdinal == 4) {
            return new vzw0(DEFAULT_INSTANCE, (byte) 14);
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
        synchronized (PromoV1Trait.class) {
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

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final String n() {
        return this.contentParentName_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.contentTypeName_;
    }

    public final h290 p() {
        return this.creators_;
    }

    public final boolean q() {
        return this.isSingleRelease_;
    }

    public final String r() {
        return this.itemsDescription_;
    }

    public final h290 s() {
        return this.labels_;
    }

    public final String t() {
        return this.navigateUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final int u() {
        return this.numberOfItems_;
    }

    public final String v() {
        return this.playbackUri_;
    }

    public final d131 w() {
        d131 d131Var;
        int i = this.previewRestriction_;
        if (i == 0) {
            d131Var = d131.NONE;
        } else if (i != 1) {
            d131Var = i != 2 ? null : d131.IS_19_PLUS;
        } else {
            d131Var = d131.IS_EXPLICIT;
        }
        return d131Var == null ? d131.UNRECOGNIZED : d131Var;
    }

    public final Timestamp x() {
        Timestamp timestamp = this.publishTime_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final boolean y() {
        return (this.bitField0_ & 1) != 0;
    }
}
