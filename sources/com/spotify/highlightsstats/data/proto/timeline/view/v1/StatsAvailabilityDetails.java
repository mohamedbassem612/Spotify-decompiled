package com.spotify.highlightsstats.data.proto.timeline.view.v1;

import com.google.protobuf.h;
import com.spotify.paragraph.v1.proto.Paragraph;
import p.bf40;
import p.ftb1;
import p.jf40;
import p.o9b1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class StatsAvailabilityDetails extends h implements v2j0 {
    private static final StatsAvailabilityDetails DEFAULT_INSTANCE;
    public static final int EMPTY_SHARE_CONTENT_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int SUBTITLE_PARAGRAPH_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private EmptyShareContent emptyShareContent_;
    private int status_;
    private Paragraph subtitleParagraph_;
    private String title_ = "";
    private String subtitle_ = "";

    static {
        StatsAvailabilityDetails statsAvailabilityDetails = new StatsAvailabilityDetails();
        DEFAULT_INSTANCE = statsAvailabilityDetails;
        h.registerDefaultInstance(StatsAvailabilityDetails.class, statsAvailabilityDetails);
    }

    private StatsAvailabilityDetails() {
    }

    public static StatsAvailabilityDetails n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000\u0005ဉ\u0001", new Object[]{"bitField0_", "status_", "title_", "subtitle_", "subtitleParagraph_", "emptyShareContent_"});
        }
        if (iOrdinal == 3) {
            return new StatsAvailabilityDetails();
        }
        if (iOrdinal == 4) {
            return new o9b1(DEFAULT_INSTANCE, (byte) 19);
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
        synchronized (StatsAvailabilityDetails.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final EmptyShareContent o() {
        EmptyShareContent emptyShareContent = this.emptyShareContent_;
        return emptyShareContent == null ? EmptyShareContent.o() : emptyShareContent;
    }

    public final ftb1 p() {
        ftb1 ftb1Var;
        int i = this.status_;
        if (i == 0) {
            ftb1Var = ftb1.b;
        } else if (i == 1) {
            ftb1Var = ftb1.c;
        } else if (i != 2) {
            ftb1Var = i != 3 ? null : ftb1.e;
        } else {
            ftb1Var = ftb1.d;
        }
        return ftb1Var == null ? ftb1.f : ftb1Var;
    }

    public final Paragraph q() {
        Paragraph paragraph = this.subtitleParagraph_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final boolean r() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
