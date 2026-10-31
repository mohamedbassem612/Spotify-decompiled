package com.spotify.concertcampaignview.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.p2o;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class CtaTypeRemindMe extends h implements v2j0 {
    public static final int ACTIVE_OVERRIDE_CTA_FIELD_NUMBER = 2;
    private static final CtaTypeRemindMe DEFAULT_INSTANCE;
    public static final int INACTIVE_OVERRIDE_CTA_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SET_ACTIVE_SNACKBAR_FIELD_NUMBER = 3;
    public static final int SET_INACTIVE_SNACKBAR_FIELD_NUMBER = 4;
    private int bitField0_;
    private String inactiveOverrideCta_ = "";
    private String activeOverrideCta_ = "";
    private String setActiveSnackbar_ = "";
    private String setInactiveSnackbar_ = "";

    static {
        CtaTypeRemindMe ctaTypeRemindMe = new CtaTypeRemindMe();
        DEFAULT_INSTANCE = ctaTypeRemindMe;
        h.registerDefaultInstance(CtaTypeRemindMe.class, ctaTypeRemindMe);
    }

    private CtaTypeRemindMe() {
    }

    public static CtaTypeRemindMe o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003", new Object[]{"bitField0_", "inactiveOverrideCta_", "activeOverrideCta_", "setActiveSnackbar_", "setInactiveSnackbar_"});
        }
        if (iOrdinal == 3) {
            return new CtaTypeRemindMe();
        }
        if (iOrdinal == 4) {
            return new p2o(DEFAULT_INSTANCE, (byte) 12);
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
        synchronized (CtaTypeRemindMe.class) {
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
        return this.activeOverrideCta_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String p() {
        return this.inactiveOverrideCta_;
    }

    public final String q() {
        return this.setActiveSnackbar_;
    }

    public final String r() {
        return this.setInactiveSnackbar_;
    }

    public final boolean s() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean t() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean v() {
        return (this.bitField0_ & 8) != 0;
    }
}
