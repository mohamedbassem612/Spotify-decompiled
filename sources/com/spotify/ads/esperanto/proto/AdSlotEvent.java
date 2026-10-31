package com.spotify.ads.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.cq0;
import p.dw0;
import p.jf40;
import p.kx0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class AdSlotEvent extends h implements v2j0 {
    public static final int AD_FIELD_NUMBER = 4;
    private static final AdSlotEvent DEFAULT_INSTANCE;
    public static final int EVENT_TYPE_FIELD_NUMBER = 1;
    public static final int FORMAT_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SLOT_ID_FIELD_NUMBER = 2;
    private Ad ad_;
    private int bitField0_;
    private int eventType_;
    private int format_;
    private String slotId_ = "";

    static {
        AdSlotEvent adSlotEvent = new AdSlotEvent();
        DEFAULT_INSTANCE = adSlotEvent;
        h.registerDefaultInstance(AdSlotEvent.class, adSlotEvent);
    }

    private AdSlotEvent() {
    }

    public static AdSlotEvent o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\f\u0004ဉ\u0000", new Object[]{"bitField0_", "eventType_", "slotId_", "format_", "ad_"});
        }
        if (iOrdinal == 3) {
            return new AdSlotEvent();
        }
        if (iOrdinal == 4) {
            return new dw0(DEFAULT_INSTANCE, (byte) 1);
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
        synchronized (AdSlotEvent.class) {
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

    public final Ad n() {
        Ad ad = this.ad_;
        return ad == null ? Ad.r() : ad;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final kx0 p() {
        kx0 kx0Var;
        int i = this.eventType_;
        if (i == 0) {
            kx0Var = kx0.AVAILABLE;
        } else if (i != 1) {
            kx0Var = i != 2 ? null : kx0.DISCARD;
        } else {
            kx0Var = kx0.PLAY;
        }
        return kx0Var == null ? kx0.UNRECOGNIZED : kx0Var;
    }

    public final cq0 q() {
        cq0 cq0VarA = cq0.a(this.format_);
        return cq0VarA == null ? cq0.UNRECOGNIZED : cq0VarA;
    }

    public final String r() {
        return this.slotId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
