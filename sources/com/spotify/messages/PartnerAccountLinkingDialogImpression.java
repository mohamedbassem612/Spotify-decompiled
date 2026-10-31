package com.spotify.messages;

import p.bf40;
import p.jf40;
import p.o0s0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class PartnerAccountLinkingDialogImpression extends com.google.protobuf.h implements v2j0 {
    private static final PartnerAccountLinkingDialogImpression DEFAULT_INSTANCE;
    public static final int IMPRESSION_ID_FIELD_NUMBER = 1;
    public static final int IMPRESSION_REASON_FIELD_NUMBER = 2;
    public static final int LINKING_ID_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int TIMES_SHOWN_FIELD_NUMBER = 3;
    private int bitField0_;
    private String impressionId_ = "";
    private String impressionReason_ = "";
    private String linkingId_ = "";
    private int timesShown_;

    static {
        PartnerAccountLinkingDialogImpression partnerAccountLinkingDialogImpression = new PartnerAccountLinkingDialogImpression();
        DEFAULT_INSTANCE = partnerAccountLinkingDialogImpression;
        com.google.protobuf.h.registerDefaultInstance(PartnerAccountLinkingDialogImpression.class, partnerAccountLinkingDialogImpression);
    }

    private PartnerAccountLinkingDialogImpression() {
    }

    public static o0s0 n() {
        return (o0s0) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "impressionId_", "impressionReason_", "timesShown_", "linkingId_"});
        }
        if (iOrdinal == 3) {
            return new PartnerAccountLinkingDialogImpression();
        }
        if (iOrdinal == 4) {
            return new o0s0(DEFAULT_INSTANCE);
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
        synchronized (PartnerAccountLinkingDialogImpression.class) {
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
        this.bitField0_ |= 1;
        this.impressionId_ = str;
    }

    public final void p(String str) {
        this.bitField0_ |= 2;
        this.impressionReason_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.linkingId_ = str;
    }

    public final void r(int i) {
        this.bitField0_ |= 4;
        this.timesShown_ = i;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
