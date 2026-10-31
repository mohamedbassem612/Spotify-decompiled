package com.spotify.artistconcertspageview.v2;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.pg51;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class SectionTitle extends h implements v2j0 {
    public static final int CTA_FIELD_NUMBER = 2;
    public static final int CTA_URI_FIELD_NUMBER = 3;
    private static final SectionTitle DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    private int bitField0_;
    private String text_ = "";
    private String cta_ = "";
    private String ctaUri_ = "";

    static {
        SectionTitle sectionTitle = new SectionTitle();
        DEFAULT_INSTANCE = sectionTitle;
        h.registerDefaultInstance(SectionTitle.class, sectionTitle);
    }

    private SectionTitle() {
    }

    public static SectionTitle p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003ለ\u0001", new Object[]{"bitField0_", "text_", "cta_", "ctaUri_"});
        }
        if (iOrdinal == 3) {
            return new SectionTitle();
        }
        if (iOrdinal == 4) {
            return new pg51(DEFAULT_INSTANCE, (byte) 13);
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
        synchronized (SectionTitle.class) {
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

    public final String n() {
        return this.cta_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.ctaUri_;
    }

    public final String q() {
        return this.text_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
