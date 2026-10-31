package com.spotify.share.linkgeneration.api.proto;

import com.google.protobuf.h;
import p.bf40;
import p.bqi1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class UtmParameters extends h implements v2j0 {
    private static final UtmParameters DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int UTM_CAMPAIGN_FIELD_NUMBER = 1;
    public static final int UTM_CONTENT_FIELD_NUMBER = 5;
    public static final int UTM_MEDIUM_FIELD_NUMBER = 3;
    public static final int UTM_SOURCE_FIELD_NUMBER = 2;
    public static final int UTM_TERM_FIELD_NUMBER = 4;
    private String utmCampaign_ = "";
    private String utmSource_ = "";
    private String utmMedium_ = "";
    private String utmTerm_ = "";
    private String utmContent_ = "";

    static {
        UtmParameters utmParameters = new UtmParameters();
        DEFAULT_INSTANCE = utmParameters;
        h.registerDefaultInstance(UtmParameters.class, utmParameters);
    }

    private UtmParameters() {
    }

    public static bqi1 n() {
        return (bqi1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"utmCampaign_", "utmSource_", "utmMedium_", "utmTerm_", "utmContent_"});
        }
        if (iOrdinal == 3) {
            return new UtmParameters();
        }
        if (iOrdinal == 4) {
            return new bqi1(DEFAULT_INSTANCE);
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
        synchronized (UtmParameters.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void o(String str) {
        str.getClass();
        this.utmCampaign_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.utmContent_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.utmMedium_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.utmSource_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.utmTerm_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
