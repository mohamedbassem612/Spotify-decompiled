package com.spotify.venueview.v1;

import com.google.protobuf.h;
import p.bf40;
import p.gtq0;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class PageHeader extends h implements v2j0 {
    public static final int BACKGROUND_COLOR_FIELD_NUMBER = 2;
    public static final int BADGE_FIELD_NUMBER = 9;
    public static final int CONCEPTS_FIELD_NUMBER = 8;
    private static final PageHeader DEFAULT_INSTANCE;
    public static final int FOLLOWERS_COUNT_FIELD_NUMBER = 7;
    public static final int LOGO_URL_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SHORT_DESCRIPTION_FIELD_NUMBER = 5;
    public static final int SUBTITLE_FIELD_NUMBER = 6;
    public static final int VENUE_NAME_FIELD_NUMBER = 4;
    public static final int VENUE_URI_FIELD_NUMBER = 1;
    private Badge badge_;
    private int bitField0_;
    private long followersCount_;
    private String venueUri_ = "";
    private String backgroundColor_ = "";
    private String logoUrl_ = "";
    private String venueName_ = "";
    private String shortDescription_ = "";
    private String subtitle_ = "";
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005ለ\u0000\u0006Ȉ\u0007ဂ\u0001\b\u001b\tဉ\u0002", new Object[]{"bitField0_", "venueUri_", "backgroundColor_", "logoUrl_", "venueName_", "shortDescription_", "subtitle_", "followersCount_", "concepts_", HeaderConcept.class, "badge_"});
        }
        if (iOrdinal == 3) {
            return new PageHeader();
        }
        if (iOrdinal == 4) {
            return new gtq0(DEFAULT_INSTANCE, (byte) 8);
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

    public final /* bridge */ /* synthetic */ s2j0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String n() {
        return this.backgroundColor_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Badge o() {
        Badge badge = this.badge_;
        return badge == null ? Badge.n() : badge;
    }

    public final h290 p() {
        return this.concepts_;
    }

    public final long r() {
        return this.followersCount_;
    }

    public final String s() {
        return this.logoUrl_;
    }

    public final String t() {
        return this.shortDescription_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final String u() {
        return this.venueName_;
    }

    public final String v() {
        return this.venueUri_;
    }

    public final boolean w() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean x() {
        return (this.bitField0_ & 2) != 0;
    }
}
