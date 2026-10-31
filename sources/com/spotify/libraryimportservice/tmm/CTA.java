package com.spotify.libraryimportservice.tmm;

import com.google.protobuf.h;
import p.bf40;
import p.coc;
import p.foc;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class CTA extends h implements v2j0 {
    public static final int CTA_TITLE_FIELD_NUMBER = 1;
    private static final CTA DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TARGET_TYPE_FIELD_NUMBER = 3;
    public static final int URL_FIELD_NUMBER = 2;
    private int bitField0_;
    private int targetType_;
    private String ctaTitle_ = "";
    private String url_ = "";

    static {
        CTA cta = new CTA();
        DEFAULT_INSTANCE = cta;
        h.registerDefaultInstance(CTA.class, cta);
    }

    private CTA() {
    }

    public static CTA o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003ဌ\u0001", new Object[]{"bitField0_", "ctaTitle_", "url_", "targetType_"});
        }
        if (iOrdinal == 3) {
            return new CTA();
        }
        if (iOrdinal == 4) {
            return new coc(DEFAULT_INSTANCE, (byte) 0);
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
        synchronized (CTA.class) {
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

    public final String getUrl() {
        return this.url_;
    }

    public final boolean hasUrl() {
        return (this.bitField0_ & 1) != 0;
    }

    public final String n() {
        return this.ctaTitle_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final foc p() {
        foc focVar;
        int i = this.targetType_;
        if (i == 0) {
            focVar = foc.b;
        } else if (i != 1) {
            focVar = i != 2 ? null : foc.d;
        } else {
            focVar = foc.c;
        }
        return focVar == null ? foc.e : focVar;
    }

    public final boolean q() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
