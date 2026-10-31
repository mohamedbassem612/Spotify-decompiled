package com.spotify.ads.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.j;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class AdEvent extends h implements v2j0 {
    public static final int AD_FIELD_NUMBER = 3;
    private static final AdEvent DEFAULT_INSTANCE;
    public static final int EVENT_TYPE_FIELD_NUMBER = 1;
    public static final int IS_MANAGED_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int SLOT_ID_FIELD_NUMBER = 2;
    private Ad ad_;
    private int bitField0_;
    private boolean isManaged_;
    private String eventType_ = "";
    private String slotId_ = "";

    static {
        AdEvent adEvent = new AdEvent();
        DEFAULT_INSTANCE = adEvent;
        h.registerDefaultInstance(AdEvent.class, adEvent);
    }

    private AdEvent() {
    }

    public static AdEvent o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004\u0007", new Object[]{"bitField0_", "eventType_", "slotId_", "ad_", "isManaged_"});
        }
        if (iOrdinal == 3) {
            return new AdEvent();
        }
        if (iOrdinal == 4) {
            return new j(DEFAULT_INSTANCE, (byte) 27);
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
        synchronized (AdEvent.class) {
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

    public final String p() {
        return this.eventType_;
    }

    public final boolean q() {
        return this.isManaged_;
    }

    public final String r() {
        return this.slotId_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
