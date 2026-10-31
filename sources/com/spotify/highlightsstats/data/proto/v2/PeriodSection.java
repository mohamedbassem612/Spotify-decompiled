package com.spotify.highlightsstats.data.proto.v2;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import com.spotify.wrapped.v1.proto.Paragraph;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sas0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class PeriodSection extends h implements v2j0 {
    public static final int ACCESSIBILITY_DESCRIPTION_FIELD_NUMBER = 5;
    public static final int DATE_FIELD_NUMBER = 1;
    private static final PeriodSection DEFAULT_INSTANCE;
    public static final int LAST_UPDATED_MESSAGE_FIELD_NUMBER = 4;
    public static final int NON_SHAREABLE_FIELD_NUMBER = 7;
    private static volatile qzr0 PARSER = null;
    public static final int SECTION_SUBTITLE_FIELD_NUMBER = 3;
    public static final int SECTION_TITLE_FIELD_NUMBER = 2;
    public static final int SHAREABLE_FIELD_NUMBER = 6;
    private int bitField0_;
    private Timestamp date_;
    private Paragraph sectionSubtitle_;
    private Paragraph sectionTitle_;
    private Object shareability_;
    private int shareabilityCase_ = 0;
    private String lastUpdatedMessage_ = "";
    private String accessibilityDescription_ = "";

    static {
        PeriodSection periodSection = new PeriodSection();
        DEFAULT_INSTANCE = periodSection;
        h.registerDefaultInstance(PeriodSection.class, periodSection);
    }

    private PeriodSection() {
    }

    public static PeriodSection o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ለ\u0003\u0005Ȉ\u0006<\u0000\u0007<\u0000", new Object[]{"shareability_", "shareabilityCase_", "bitField0_", "date_", "sectionTitle_", "sectionSubtitle_", "lastUpdatedMessage_", "accessibilityDescription_", Shareable.class, NonShareable.class});
        }
        if (iOrdinal == 3) {
            return new PeriodSection();
        }
        if (iOrdinal == 4) {
            return new sas0(DEFAULT_INSTANCE, (byte) 20);
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
        synchronized (PeriodSection.class) {
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

    public final String p() {
        return this.lastUpdatedMessage_;
    }

    public final NonShareable q() {
        return this.shareabilityCase_ == 7 ? (NonShareable) this.shareability_ : NonShareable.o();
    }

    public final Paragraph r() {
        Paragraph paragraph = this.sectionSubtitle_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final Paragraph s() {
        Paragraph paragraph = this.sectionTitle_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final int t() {
        int i = this.shareabilityCase_;
        if (i == 0) {
            return 3;
        }
        if (i != 6) {
            return i != 7 ? 0 : 2;
        }
        return 1;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final Shareable u() {
        return this.shareabilityCase_ == 6 ? (Shareable) this.shareability_ : Shareable.n();
    }

    public final boolean v() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean w() {
        return (this.bitField0_ & 4) != 0;
    }
}
