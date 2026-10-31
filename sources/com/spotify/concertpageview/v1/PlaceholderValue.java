package com.spotify.concertpageview.v1;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import com.google.type.DateTime;
import com.google.type.Money;
import p.bf40;
import p.ets0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class PlaceholderValue extends h implements v2j0 {
    public static final int COUNTDOWN_END_TIME_FIELD_NUMBER = 4;
    private static final PlaceholderValue DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PRICE_FIELD_NUMBER = 2;
    public static final int TEXT_FIELD_NUMBER = 1;
    public static final int USER_LOCAL_TIME_FIELD_NUMBER = 5;
    public static final int VENUE_DATE_TIME_FIELD_NUMBER = 3;
    private int valueCase_ = 0;
    private Object value_;

    static {
        PlaceholderValue placeholderValue = new PlaceholderValue();
        DEFAULT_INSTANCE = placeholderValue;
        h.registerDefaultInstance(PlaceholderValue.class, placeholderValue);
    }

    private PlaceholderValue() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȼ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"value_", "valueCase_", Money.class, DateTime.class, Timestamp.class, Timestamp.class});
        }
        if (iOrdinal == 3) {
            return new PlaceholderValue();
        }
        if (iOrdinal == 4) {
            return new ets0(DEFAULT_INSTANCE, (byte) 13);
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
        synchronized (PlaceholderValue.class) {
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

    public final Timestamp n() {
        return this.valueCase_ == 4 ? (Timestamp) this.value_ : Timestamp.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Money o() {
        return this.valueCase_ == 2 ? (Money) this.value_ : Money.o();
    }

    public final String p() {
        return this.valueCase_ == 1 ? (String) this.value_ : "";
    }

    public final Timestamp q() {
        return this.valueCase_ == 5 ? (Timestamp) this.value_ : Timestamp.o();
    }

    public final int r() {
        int i = this.valueCase_;
        if (i == 0) {
            return 6;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i2;
    }

    public final DateTime s() {
        return this.valueCase_ == 3 ? (DateTime) this.value_ : DateTime.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
