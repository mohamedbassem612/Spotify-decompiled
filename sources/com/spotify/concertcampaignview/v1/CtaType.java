package com.spotify.concertcampaignview.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.p2o;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.udo;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class CtaType extends h implements v2j0 {
    public static final int BUY_TICKETS_FIELD_NUMBER = 600;
    public static final int CTA_CANT_ATTEND_FIELD_NUMBER = 400;
    public static final int CTA_JOIN_WAITLIST_FIELD_NUMBER = 200;
    public static final int CTA_NOT_INTERESTED_FIELD_NUMBER = 500;
    public static final int CTA_REMIND_ME_FIELD_NUMBER = 100;
    public static final int CTA_SHARE_FIELD_NUMBER = 800;
    public static final int CTA_WAITLISTED_FIELD_NUMBER = 300;
    private static final CtaType DEFAULT_INSTANCE;
    public static final int OVERRIDE_CTA_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SEE_ALL_SHOWS_FIELD_NUMBER = 700;
    public static final int STYLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private Object ctaType_;
    private int style_;
    private int ctaTypeCase_ = 0;
    private String overrideCta_ = "";

    static {
        CtaType ctaType = new CtaType();
        DEFAULT_INSTANCE = ctaType;
        h.registerDefaultInstance(CtaType.class, ctaType);
    }

    private CtaType() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public final boolean A() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean B() {
        return this.ctaTypeCase_ == 700;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0001\u0001\u0001̠\n\u0000\u0000\u0000\u0001\f\u0002ለ\u0000d<\u0000È<\u0000Ĭ<\u0000Ɛ<\u0000Ǵ<\u0000ɘ<\u0000ʼ<\u0000̠<\u0000", new Object[]{"ctaType_", "ctaTypeCase_", "bitField0_", "style_", "overrideCta_", CtaTypeRemindMe.class, CtaTypeJoinWaitlist.class, CtaTypeWaitlisted.class, CtaTypeCantAttend.class, CtaTypeNotInterested.class, CtaTypeBuyTickets.class, CtaTypeSeeAllShows.class, CtaTypeShare.class});
        }
        if (iOrdinal == 3) {
            return new CtaType();
        }
        if (iOrdinal == 4) {
            return new p2o(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (CtaType.class) {
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

    public final CtaTypeBuyTickets n() {
        return this.ctaTypeCase_ == 600 ? (CtaTypeBuyTickets) this.ctaType_ : CtaTypeBuyTickets.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final CtaTypeCantAttend o() {
        return this.ctaTypeCase_ == 400 ? (CtaTypeCantAttend) this.ctaType_ : CtaTypeCantAttend.n();
    }

    public final CtaTypeRemindMe p() {
        return this.ctaTypeCase_ == 100 ? (CtaTypeRemindMe) this.ctaType_ : CtaTypeRemindMe.o();
    }

    public final CtaTypeShare q() {
        return this.ctaTypeCase_ == 800 ? (CtaTypeShare) this.ctaType_ : CtaTypeShare.n();
    }

    public final String r() {
        return this.overrideCta_;
    }

    public final udo s() {
        udo udoVar;
        int i = this.style_;
        if (i == 0) {
            udoVar = udo.CTA_STYLE_UNKNOWN;
        } else if (i != 1) {
            udoVar = i != 2 ? null : udo.CTA_STYLE_SECONDARY;
        } else {
            udoVar = udo.CTA_STYLE_PRIMARY;
        }
        return udoVar == null ? udo.UNRECOGNIZED : udoVar;
    }

    public final boolean t() {
        return this.ctaTypeCase_ == 600;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return this.ctaTypeCase_ == 400;
    }

    public final boolean v() {
        return this.ctaTypeCase_ == 200;
    }

    public final boolean w() {
        return this.ctaTypeCase_ == 500;
    }

    public final boolean x() {
        return this.ctaTypeCase_ == 100;
    }

    public final boolean y() {
        return this.ctaTypeCase_ == 800;
    }

    public final boolean z() {
        return this.ctaTypeCase_ == 300;
    }
}
