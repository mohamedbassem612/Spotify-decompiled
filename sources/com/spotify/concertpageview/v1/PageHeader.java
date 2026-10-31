package com.spotify.concertpageview.v1;

import com.google.protobuf.h;
import com.google.type.DateTime;
import java.util.List;
import p.bf40;
import p.gtq0;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class PageHeader extends h implements v2j0 {
    public static final int ARTISTS_FIELD_NUMBER = 2;
    public static final int CONCEPTS_FIELD_NUMBER = 7;
    public static final int CONCERT_URI_FIELD_NUMBER = 3;
    public static final int DATE_FIELD_NUMBER = 5;
    private static final PageHeader DEFAULT_INSTANCE;
    public static final int HEADER_BACKGROUND_COLOR_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 4;
    public static final int VENUE_FIELD_NUMBER = 6;
    private int bitField0_;
    private DateTime date_;
    private HeaderVenue venue_;
    private String headerBackgroundColor_ = "";
    private h290 artists_ = h.emptyProtobufList();
    private String concertUri_ = "";
    private String title_ = "";
    private h290 concepts_ = h.emptyProtobufList();

    static {
        PageHeader pageHeader = new PageHeader();
        DEFAULT_INSTANCE = pageHeader;
        h.registerDefaultInstance(PageHeader.class, pageHeader);
    }

    private PageHeader() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static PageHeader q() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003Ȉ\u0004Ȉ\u0005ဉ\u0000\u0006ဉ\u0001\u0007\u001b", new Object[]{"bitField0_", "headerBackgroundColor_", "artists_", HeaderArtist.class, "concertUri_", "title_", "date_", "venue_", "concepts_", HeaderConcept.class});
        }
        if (iOrdinal == 3) {
            return new PageHeader();
        }
        if (iOrdinal == 4) {
            return new gtq0(DEFAULT_INSTANCE, (byte) 6);
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
        synchronized (PageHeader.class) {
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

    public final List getArtistsList() {
        return this.artists_;
    }

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getTitle() {
        return this.title_;
    }

    public final h290 n() {
        return this.concepts_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.concertUri_;
    }

    public final DateTime p() {
        DateTime dateTime = this.date_;
        return dateTime == null ? DateTime.o() : dateTime;
    }

    public final String r() {
        return this.headerBackgroundColor_;
    }

    public final HeaderVenue s() {
        HeaderVenue headerVenue = this.venue_;
        return headerVenue == null ? HeaderVenue.n() : headerVenue;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
