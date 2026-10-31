package com.spotify.concertpageview.v1;

import com.google.protobuf.h;
import p.bf40;
import p.db6;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ArtistBottomUpSheetTriggerRow extends h implements v2j0 {
    public static final int ALREADY_PRESENTED_URIS_FIELD_NUMBER = 2;
    public static final int BOTTOM_UP_SHEET_TITLE_FIELD_NUMBER = 1;
    private static final ArtistBottomUpSheetTriggerRow DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int ROWS_FIELD_NUMBER = 3;
    private int bitField0_;
    private String bottomUpSheetTitle_ = "";
    private h290 alreadyPresentedUris_ = h.emptyProtobufList();
    private h290 rows_ = h.emptyProtobufList();

    static {
        ArtistBottomUpSheetTriggerRow artistBottomUpSheetTriggerRow = new ArtistBottomUpSheetTriggerRow();
        DEFAULT_INSTANCE = artistBottomUpSheetTriggerRow;
        h.registerDefaultInstance(ArtistBottomUpSheetTriggerRow.class, artistBottomUpSheetTriggerRow);
    }

    private ArtistBottomUpSheetTriggerRow() {
    }

    public static ArtistBottomUpSheetTriggerRow p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ለ\u0000\u0002Ț\u0003\u001b", new Object[]{"bitField0_", "bottomUpSheetTitle_", "alreadyPresentedUris_", "rows_", ArtistRow.class});
        }
        if (iOrdinal == 3) {
            return new ArtistBottomUpSheetTriggerRow();
        }
        if (iOrdinal == 4) {
            return new db6(DEFAULT_INSTANCE, (byte) 3);
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
        synchronized (ArtistBottomUpSheetTriggerRow.class) {
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

    public final h290 n() {
        return this.alreadyPresentedUris_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.bottomUpSheetTitle_;
    }

    public final h290 q() {
        return this.rows_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
