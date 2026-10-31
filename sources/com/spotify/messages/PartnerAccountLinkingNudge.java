package com.spotify.messages;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.y0s0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class PartnerAccountLinkingNudge extends com.google.protobuf.h implements v2j0 {
    private static final PartnerAccountLinkingNudge DEFAULT_INSTANCE;
    public static final int IMPRESSION_ID_FIELD_NUMBER = 2;
    public static final int LINKING_ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PARTNER_FIELD_NUMBER = 3;
    public static final int PRELOAD_PARTNER_FIELD_NUMBER = 4;
    public static final int SOURCE_FIELD_NUMBER = 5;
    private int bitField0_;
    private String linkingId_ = "";
    private String impressionId_ = "";
    private String partner_ = "";
    private String preloadPartner_ = "";
    private String source_ = "";

    static {
        PartnerAccountLinkingNudge partnerAccountLinkingNudge = new PartnerAccountLinkingNudge();
        DEFAULT_INSTANCE = partnerAccountLinkingNudge;
        com.google.protobuf.h.registerDefaultInstance(PartnerAccountLinkingNudge.class, partnerAccountLinkingNudge);
    }

    private PartnerAccountLinkingNudge() {
    }

    public static y0s0 n() {
        return (y0s0) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "linkingId_", "impressionId_", "partner_", "preloadPartner_", "source_"});
        }
        if (iOrdinal == 3) {
            return new PartnerAccountLinkingNudge();
        }
        if (iOrdinal == 4) {
            return new y0s0(DEFAULT_INSTANCE);
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
        synchronized (PartnerAccountLinkingNudge.class) {
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
        this.bitField0_ |= 2;
        this.impressionId_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.linkingId_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 4;
        this.partner_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.preloadPartner_ = str;
    }

    public final void s(String str) {
        this.bitField0_ |= 16;
        this.source_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
