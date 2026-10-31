package com.spotify.concertcampaignview.v1;

import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import com.google.type.DateTime;
import p.bf40;
import p.coc;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class CampaignCardPlaceholderValue extends h implements v2j0 {
    public static final int CONCERT_START_FIELD_NUMBER = 5;
    public static final int COUNTDOWN_END_TIME_FIELD_NUMBER = 4;
    public static final int DATE_TIME_FIELD_NUMBER = 3;
    private static final CampaignCardPlaceholderValue DEFAULT_INSTANCE;
    public static final int EMPHASIZED_TEXT_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    private int valueCase_ = 0;
    private Object value_;

    static {
        CampaignCardPlaceholderValue campaignCardPlaceholderValue = new CampaignCardPlaceholderValue();
        DEFAULT_INSTANCE = campaignCardPlaceholderValue;
        h.registerDefaultInstance(CampaignCardPlaceholderValue.class, campaignCardPlaceholderValue);
    }

    private CampaignCardPlaceholderValue() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"value_", "valueCase_", Timestamp.class, Timestamp.class, DateTime.class});
        }
        if (iOrdinal == 3) {
            return new CampaignCardPlaceholderValue();
        }
        if (iOrdinal == 4) {
            return new coc(DEFAULT_INSTANCE, (byte) 11);
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
        synchronized (CampaignCardPlaceholderValue.class) {
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

    public final DateTime n() {
        return this.valueCase_ == 5 ? (DateTime) this.value_ : DateTime.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Timestamp o() {
        return this.valueCase_ == 4 ? (Timestamp) this.value_ : Timestamp.o();
    }

    public final Timestamp p() {
        return this.valueCase_ == 3 ? (Timestamp) this.value_ : Timestamp.o();
    }

    public final String q() {
        return this.valueCase_ == 2 ? (String) this.value_ : "";
    }

    public final String r() {
        return this.valueCase_ == 1 ? (String) this.value_ : "";
    }

    public final boolean s() {
        return this.valueCase_ == 5;
    }

    public final boolean t() {
        return this.valueCase_ == 4;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return this.valueCase_ == 3;
    }

    public final boolean v() {
        return this.valueCase_ == 2;
    }

    public final boolean w() {
        return this.valueCase_ == 1;
    }
}
