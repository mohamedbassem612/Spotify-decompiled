package com.spotify.highlightsstats.data.proto.timeline.view.v1;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import com.spotify.paragraph.v1.proto.Paragraph;
import p.bf40;
import p.jf40;
import p.nzd1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class TimelineDate extends h implements v2j0 {
    public static final int ACCESSIBILITY_DESCRIPTION_FIELD_NUMBER = 5;
    public static final int DATE_FIELD_NUMBER = 3;
    public static final int DATE_PARAGRAPH_FIELD_NUMBER = 4;
    public static final int DATE_SUBTITLE_FIELD_NUMBER = 6;
    private static final TimelineDate DEFAULT_INSTANCE;
    public static final int MONTH_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int YEAR_FIELD_NUMBER = 2;
    private int bitField0_;
    private Paragraph dateParagraph_;
    private Paragraph dateSubtitle_;
    private Timestamp date_;
    private String month_ = "";
    private String year_ = "";
    private String accessibilityDescription_ = "";

    static {
        TimelineDate timelineDate = new TimelineDate();
        DEFAULT_INSTANCE = timelineDate;
        h.registerDefaultInstance(TimelineDate.class, timelineDate);
    }

    private TimelineDate() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static TimelineDate q() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001\u0005Ȉ\u0006ဉ\u0002", new Object[]{"bitField0_", "month_", "year_", "date_", "dateParagraph_", "accessibilityDescription_", "dateSubtitle_"});
        }
        if (iOrdinal == 3) {
            return new TimelineDate();
        }
        if (iOrdinal == 4) {
            return new nzd1(DEFAULT_INSTANCE, (byte) 25);
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
        synchronized (TimelineDate.class) {
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

    public final Timestamp getDate() {
        Timestamp timestamp = this.date_;
        return timestamp == null ? Timestamp.o() : timestamp;
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

    public final Paragraph o() {
        Paragraph paragraph = this.dateParagraph_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final Paragraph p() {
        Paragraph paragraph = this.dateSubtitle_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final String r() {
        return this.month_;
    }

    public final String s() {
        return this.year_;
    }

    public final boolean t() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 4) != 0;
    }
}
