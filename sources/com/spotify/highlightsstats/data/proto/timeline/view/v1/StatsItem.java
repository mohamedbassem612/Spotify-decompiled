package com.spotify.highlightsstats.data.proto.timeline.view.v1;

import com.google.protobuf.h;
import com.spotify.paragraph.v1.proto.Paragraph;
import p.bf40;
import p.jf40;
import p.o9b1;
import p.qzr0;
import p.r2j0;
import p.rtb1;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class StatsItem extends h implements v2j0 {
    public static final int ACCESSIBILITY_DESCRIPTION_FIELD_NUMBER = 7;
    public static final int CHANGE_PREVIOUS_PERIOD_LABEL_FIELD_NUMBER = 6;
    public static final int CURRENT_LOOK_BACK_FIELD_NUMBER = 1;
    private static final StatsItem DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 3;
    public static final int IMAGE_URL_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private PositionChangeLabel changePreviousPeriodLabel_;
    private int currentLookBack_;
    private Paragraph title_;
    private int type_;
    private String header_ = "";
    private String imageUrl_ = "";
    private String accessibilityDescription_ = "";

    static {
        StatsItem statsItem = new StatsItem();
        DEFAULT_INSTANCE = statsItem;
        h.registerDefaultInstance(StatsItem.class, statsItem);
    }

    private StatsItem() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u000b\u0002\f\u0003Ȉ\u0004ဉ\u0000\u0005Ȉ\u0006ဉ\u0001\u0007Ȉ", new Object[]{"bitField0_", "currentLookBack_", "type_", "header_", "title_", "imageUrl_", "changePreviousPeriodLabel_", "accessibilityDescription_"});
        }
        if (iOrdinal == 3) {
            return new StatsItem();
        }
        if (iOrdinal == 4) {
            return new o9b1(DEFAULT_INSTANCE, (byte) 24);
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
        synchronized (StatsItem.class) {
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

    public final String getImageUrl() {
        return this.imageUrl_;
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
        return this.header_;
    }

    public final Paragraph q() {
        Paragraph paragraph = this.title_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final rtb1 r() {
        rtb1 rtb1VarA = rtb1.a(this.type_);
        return rtb1VarA == null ? rtb1.UNRECOGNIZED : rtb1VarA;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
