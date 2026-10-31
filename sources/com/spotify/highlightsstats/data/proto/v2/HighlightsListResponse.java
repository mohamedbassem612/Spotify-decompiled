package com.spotify.highlightsstats.data.proto.v2;

import com.google.protobuf.h;
import com.spotify.highlightsstats.ShareConfiguration;
import java.util.List;
import p.bf40;
import p.h290;
import p.jf40;
import p.m660;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class HighlightsListResponse extends h implements v2j0 {
    private static final HighlightsListResponse DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PROMO_ITEMS_FIELD_NUMBER = 4;
    public static final int SHARE_CONFIGURATION_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private ShareConfiguration shareConfiguration_;
    private String title_ = "";
    private h290 items_ = h.emptyProtobufList();
    private h290 promoItems_ = h.emptyProtobufList();

    static {
        HighlightsListResponse highlightsListResponse = new HighlightsListResponse();
        DEFAULT_INSTANCE = highlightsListResponse;
        h.registerDefaultInstance(HighlightsListResponse.class, highlightsListResponse);
    }

    private HighlightsListResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003ဉ\u0000\u0004\u001b", new Object[]{"bitField0_", "title_", "items_", HighlightsItem.class, "shareConfiguration_", "promoItems_", PromoDetailCard.class});
        }
        if (iOrdinal == 3) {
            return new HighlightsListResponse();
        }
        if (iOrdinal == 4) {
            return new m660(DEFAULT_INSTANCE, (byte) 19);
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
        synchronized (HighlightsListResponse.class) {
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

    public final List getItemsList() {
        return this.items_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final h290 n() {
        return this.promoItems_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ShareConfiguration o() {
        ShareConfiguration shareConfiguration = this.shareConfiguration_;
        return shareConfiguration == null ? ShareConfiguration.n() : shareConfiguration;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
