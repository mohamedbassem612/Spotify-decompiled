package com.spotify.highlightsstats.data.proto.timeline.view.v1;

import com.google.protobuf.h;
import com.spotify.paragraph.v1.proto.Paragraph;
import p.bf40;
import p.bn81;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.rtb1;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class SocialStatsItem extends h implements v2j0 {
    public static final int ACCESSIBILITY_DESCRIPTION_FIELD_NUMBER = 6;
    public static final int CHANGE_PREVIOUS_PERIOD_LABEL_FIELD_NUMBER = 7;
    public static final int CURRENT_LOOK_BACK_FIELD_NUMBER = 1;
    private static final SocialStatsItem DEFAULT_INSTANCE;
    public static final int FALLBACK_IMAGE_URL_FIELD_NUMBER = 9;
    public static final int HEADER_FIELD_NUMBER = 3;
    public static final int IMAGE_URLS_FIELD_NUMBER = 10;
    public static final int IMAGE_URL_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int SOCIAL_DATA_INFO_FIELD_NUMBER = 8;
    public static final int TITLE_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private PositionChangeLabel changePreviousPeriodLabel_;
    private int currentLookBack_;
    private SocialDataInfo socialDataInfo_;
    private Paragraph title_;
    private int type_;
    private String header_ = "";
    private String imageUrl_ = "";
    private String accessibilityDescription_ = "";
    private String fallbackImageUrl_ = "";
    private h290 imageUrls_ = h.emptyProtobufList();

    static {
        SocialStatsItem socialStatsItem = new SocialStatsItem();
        DEFAULT_INSTANCE = socialStatsItem;
        h.registerDefaultInstance(SocialStatsItem.class, socialStatsItem);
    }

    private SocialStatsItem() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001\u000b\u0002\f\u0003Ȉ\u0004ဉ\u0000\u0005Ȉ\u0006Ȉ\u0007ဉ\u0001\bဉ\u0002\tȈ\nȚ", new Object[]{"bitField0_", "currentLookBack_", "type_", "header_", "title_", "imageUrl_", "accessibilityDescription_", "changePreviousPeriodLabel_", "socialDataInfo_", "fallbackImageUrl_", "imageUrls_"});
        }
        if (iOrdinal == 3) {
            return new SocialStatsItem();
        }
        if (iOrdinal == 4) {
            return new bn81(DEFAULT_INSTANCE, (byte) 28);
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
        synchronized (SocialStatsItem.class) {
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

    public final String n() {
        return this.accessibilityDescription_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final PositionChangeLabel o() {
        PositionChangeLabel positionChangeLabel = this.changePreviousPeriodLabel_;
        return positionChangeLabel == null ? PositionChangeLabel.o() : positionChangeLabel;
    }

    public final String p() {
        return this.fallbackImageUrl_;
    }

    public final String q() {
        return this.header_;
    }

    public final h290 r() {
        return this.imageUrls_;
    }

    public final SocialDataInfo s() {
        SocialDataInfo socialDataInfo = this.socialDataInfo_;
        return socialDataInfo == null ? SocialDataInfo.n() : socialDataInfo;
    }

    public final Paragraph t() {
        Paragraph paragraph = this.title_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final rtb1 u() {
        rtb1 rtb1VarA = rtb1.a(this.type_);
        return rtb1VarA == null ? rtb1.UNRECOGNIZED : rtb1VarA;
    }

    public final boolean v() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean w() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean x() {
        return (this.bitField0_ & 1) != 0;
    }
}
