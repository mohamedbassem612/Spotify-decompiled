package com.spotify.concertview.concertfeedview.v1;

import com.google.protobuf.h;
import p.bf40;
import p.gg51;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.z451;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class SectionCta extends h implements v2j0 {
    public static final int CTA_FIELD_NUMBER = 1;
    public static final int CTA_TYPE_FIELD_NUMBER = 3;
    private static final SectionCta DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TARGET_URI_FIELD_NUMBER = 2;
    private int ctaType_;
    private String cta_ = "";
    private String targetUri_ = "";

    static {
        SectionCta sectionCta = new SectionCta();
        DEFAULT_INSTANCE = sectionCta;
        h.registerDefaultInstance(SectionCta.class, sectionCta);
    }

    private SectionCta() {
    }

    public static SectionCta p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f", new Object[]{"cta_", "targetUri_", "ctaType_"});
        }
        if (iOrdinal == 3) {
            return new SectionCta();
        }
        if (iOrdinal == 4) {
            return new z451(DEFAULT_INSTANCE, (byte) 29);
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
        synchronized (SectionCta.class) {
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

    public final gg51 o() {
        gg51 gg51Var;
        int i = this.ctaType_;
        if (i == 0) {
            gg51Var = gg51.CTA_TYPE_UNSPECIFIED;
        } else if (i != 1) {
            gg51Var = i != 2 ? null : gg51.CTA_TYPE_EDITORIAL;
        } else {
            gg51Var = gg51.CTA_TYPE_URI;
        }
        return gg51Var == null ? gg51.UNRECOGNIZED : gg51Var;
    }

    public final String q() {
        return this.targetUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
