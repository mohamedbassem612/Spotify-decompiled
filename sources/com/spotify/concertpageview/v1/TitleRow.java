package com.spotify.concertpageview.v1;

import com.google.protobuf.h;
import p.bf40;
import p.hye1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class TitleRow extends h implements v2j0 {
    public static final int CTA_DESTINATION_FIELD_NUMBER = 3;
    public static final int CTA_FIELD_NUMBER = 2;
    private static final TitleRow DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int bitField0_;
    private String value_ = "";
    private String cta_ = "";
    private String ctaDestination_ = "";

    static {
        TitleRow titleRow = new TitleRow();
        DEFAULT_INSTANCE = titleRow;
        h.registerDefaultInstance(TitleRow.class, titleRow);
    }

    private TitleRow() {
    }

    public static TitleRow p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003ለ\u0001", new Object[]{"bitField0_", "value_", "cta_", "ctaDestination_"});
        }
        if (iOrdinal == 3) {
            return new TitleRow();
        }
        if (iOrdinal == 4) {
            return new hye1(DEFAULT_INSTANCE, (byte) 3);
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
        synchronized (TitleRow.class) {
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

    public final String getValue() {
        return this.value_;
    }

    public final String n() {
        return this.cta_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.ctaDestination_;
    }

    public final boolean q() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean r() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
