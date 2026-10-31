package com.spotify.artistconcertspageview.v2;

import com.google.protobuf.h;
import p.bf40;
import p.h4m;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ContentRow extends h implements v2j0 {
    public static final int BANNER_ROW_FIELD_NUMBER = 4;
    public static final int CONCERT_ROW_FIELD_NUMBER = 3;
    private static final ContentRow DEFAULT_INSTANCE;
    public static final int EMPTY_SECTION_ROW_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int UBI_IDENTIFIER_FIELD_NUMBER = 1;
    private int bitField0_;
    private Object content_;
    private int contentCase_ = 0;
    private String ubiIdentifier_ = "";

    static {
        ContentRow contentRow = new ContentRow();
        DEFAULT_INSTANCE = contentRow;
        h.registerDefaultInstance(ContentRow.class, contentRow);
    }

    private ContentRow() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"content_", "contentCase_", "bitField0_", "ubiIdentifier_", ConcertRow.class, BannerRow.class, EmptySectionRow.class});
        }
        if (iOrdinal == 3) {
            return new ContentRow();
        }
        if (iOrdinal == 4) {
            return new h4m(DEFAULT_INSTANCE, (byte) 2);
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
        synchronized (ContentRow.class) {
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

    public final BannerRow n() {
        return this.contentCase_ == 4 ? (BannerRow) this.content_ : BannerRow.r();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final ConcertRow o() {
        return this.contentCase_ == 3 ? (ConcertRow) this.content_ : ConcertRow.n();
    }

    public final int p() {
        int i = this.contentCase_;
        if (i == 0) {
            return 4;
        }
        if (i == 3) {
            return 1;
        }
        if (i != 4) {
            return i != 5 ? 0 : 3;
        }
        return 2;
    }

    public final EmptySectionRow q() {
        return this.contentCase_ == 5 ? (EmptySectionRow) this.content_ : EmptySectionRow.p();
    }

    public final String r() {
        return this.ubiIdentifier_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
