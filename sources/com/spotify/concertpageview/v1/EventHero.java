package com.spotify.concertpageview.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.lrz;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sa00;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class EventHero extends h implements v2j0 {
    private static final EventHero DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TREATMENT_FIELD_NUMBER = 2;
    public static final int VISUAL_IDENTITY_URI_FIELD_NUMBER = 1;
    private int treatment_;
    private String visualIdentityUri_ = "";

    static {
        EventHero eventHero = new EventHero();
        DEFAULT_INSTANCE = eventHero;
        h.registerDefaultInstance(EventHero.class, eventHero);
    }

    private EventHero() {
    }

    public static EventHero n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"visualIdentityUri_", "treatment_"});
        }
        if (iOrdinal == 3) {
            return new EventHero();
        }
        if (iOrdinal == 4) {
            return new lrz(DEFAULT_INSTANCE, (byte) 20);
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
        synchronized (EventHero.class) {
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

    public final sa00 o() {
        sa00 sa00Var;
        int i = this.treatment_;
        if (i == 0) {
            sa00Var = sa00.EVENT_HERO_TREATMENT_UNSPECIFIED;
        } else if (i != 1) {
            sa00Var = i != 2 ? null : sa00.EVENT_HERO_TREATMENT_CAMPAIGN_RESERVED;
        } else {
            sa00Var = sa00.EVENT_HERO_TREATMENT_STANDARD;
        }
        return sa00Var == null ? sa00.UNRECOGNIZED : sa00Var;
    }

    public final String p() {
        return this.visualIdentityUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
