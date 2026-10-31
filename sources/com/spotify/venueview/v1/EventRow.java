package com.spotify.venueview.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lrz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class EventRow extends h implements v2j0 {
    private static final EventRow DEFAULT_INSTANCE;
    public static final int EVENT_DATE_FIELD_NUMBER = 3;
    public static final int EVENT_URI_FIELD_NUMBER = 1;
    public static final int IMAGE_URL_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private DateTimeWithOffset eventDate_;
    private String eventUri_ = "";
    private String title_ = "";
    private String imageUrl_ = "";

    static {
        EventRow eventRow = new EventRow();
        DEFAULT_INSTANCE = eventRow;
        h.registerDefaultInstance(EventRow.class, eventRow);
    }

    private EventRow() {
    }

    public static EventRow n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004Ȉ", new Object[]{"bitField0_", "eventUri_", "title_", "eventDate_", "imageUrl_"});
        }
        if (iOrdinal == 3) {
            return new EventRow();
        }
        if (iOrdinal == 4) {
            return new lrz(DEFAULT_INSTANCE, (byte) 22);
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
        synchronized (EventRow.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final DateTimeWithOffset o() {
        DateTimeWithOffset dateTimeWithOffset = this.eventDate_;
        return dateTimeWithOffset == null ? DateTimeWithOffset.o() : dateTimeWithOffset;
    }

    public final String p() {
        return this.eventUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
