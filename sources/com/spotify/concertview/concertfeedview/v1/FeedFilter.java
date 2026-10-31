package com.spotify.concertview.concertfeedview.v1;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.bf40;
import p.h290;
import p.i9;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.up10;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class FeedFilter extends h implements v2j0 {
    public static final int BROWSE_LOCATION_FIELD_NUMBER = 1;
    public static final int BROWSE_RADIUS_IN_KM_FIELD_NUMBER = 2;
    public static final int CONCEPT_URIS_FIELD_NUMBER = 3;
    public static final int DATE_FILTER_FIELD_NUMBER = 4;
    private static final FeedFilter DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private int bitField0_;
    private int browseRadiusInKm_;
    private DateFilter dateFilter_;
    private String browseLocation_ = "";
    private h290 conceptUris_ = h.emptyProtobufList();

    static {
        FeedFilter feedFilter = new FeedFilter();
        DEFAULT_INSTANCE = feedFilter;
        h.registerDefaultInstance(FeedFilter.class, feedFilter);
    }

    private FeedFilter() {
    }

    public static up10 o() {
        return (up10) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ለ\u0000\u0002င\u0001\u0003Ț\u0004ဉ\u0002", new Object[]{"bitField0_", "browseLocation_", "browseRadiusInKm_", "conceptUris_", "dateFilter_"});
        }
        if (iOrdinal == 3) {
            return new FeedFilter();
        }
        if (iOrdinal == 4) {
            return new up10(DEFAULT_INSTANCE);
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
        synchronized (FeedFilter.class) {
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

    public final void n(ArrayList arrayList) {
        h290 h290VarMutableCopy = this.conceptUris_;
        if (!((i9) h290VarMutableCopy).a) {
            h290VarMutableCopy = h.mutableCopy(h290VarMutableCopy);
            this.conceptUris_ = h290VarMutableCopy;
        }
        s8.addAll(arrayList, h290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.browseLocation_ = str;
    }

    public final void q(DateFilter dateFilter) {
        dateFilter.getClass();
        this.dateFilter_ = dateFilter;
        this.bitField0_ |= 4;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
