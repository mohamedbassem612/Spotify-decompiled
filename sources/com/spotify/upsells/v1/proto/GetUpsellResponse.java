package com.spotify.upsells.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sp40;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class GetUpsellResponse extends h implements v2j0 {
    public static final int BOTTOM_SHEET_FIELD_NUMBER = 2;
    private static final GetUpsellResponse DEFAULT_INSTANCE;
    public static final int INLINE_UPSELL_FIELD_NUMBER = 3;
    public static final int NO_UPSELL_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private int upsellCase_ = 0;
    private Object upsell_;

    static {
        GetUpsellResponse getUpsellResponse = new GetUpsellResponse();
        DEFAULT_INSTANCE = getUpsellResponse;
        h.registerDefaultInstance(GetUpsellResponse.class, getUpsellResponse);
    }

    private GetUpsellResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"upsell_", "upsellCase_", NoUpsell.class, BottomSheet.class, InlineUpsell.class});
        }
        if (iOrdinal == 3) {
            return new GetUpsellResponse();
        }
        if (iOrdinal == 4) {
            return new sp40(DEFAULT_INSTANCE, (byte) 29);
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
        synchronized (GetUpsellResponse.class) {
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

    public final BottomSheet n() {
        return this.upsellCase_ == 2 ? (BottomSheet) this.upsell_ : BottomSheet.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final InlineUpsell o() {
        return this.upsellCase_ == 3 ? (InlineUpsell) this.upsell_ : InlineUpsell.o();
    }

    public final int p() {
        int i = this.upsellCase_;
        if (i == 0) {
            return 4;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return 0;
                }
            }
        }
        return i2;
    }

    public final boolean q() {
        return this.upsellCase_ == 2;
    }

    public final boolean r() {
        return this.upsellCase_ == 3;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
