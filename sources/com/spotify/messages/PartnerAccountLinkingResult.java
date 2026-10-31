package com.spotify.messages;

import p.bf40;
import p.e1s0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class PartnerAccountLinkingResult extends com.google.protobuf.h implements v2j0 {
    private static final PartnerAccountLinkingResult DEFAULT_INSTANCE;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 5;
    public static final int ERROR_TYPE_FIELD_NUMBER = 4;
    public static final int LINKING_ID_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int PARTNER_FIELD_NUMBER = 1;
    public static final int PRELOAD_PARTNER_FIELD_NUMBER = 3;
    public static final int SUCCESS_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean success_;
    private String partner_ = "";
    private String preloadPartner_ = "";
    private String errorType_ = "";
    private String errorMessage_ = "";
    private String linkingId_ = "";

    static {
        PartnerAccountLinkingResult partnerAccountLinkingResult = new PartnerAccountLinkingResult();
        DEFAULT_INSTANCE = partnerAccountLinkingResult;
        com.google.protobuf.h.registerDefaultInstance(PartnerAccountLinkingResult.class, partnerAccountLinkingResult);
    }

    private PartnerAccountLinkingResult() {
    }

    public static e1s0 n() {
        return (e1s0) DEFAULT_INSTANCE.createBuilder();
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"bitField0_", "partner_", "success_", "preloadPartner_", "errorType_", "errorMessage_", "linkingId_"});
        }
        if (iOrdinal == 3) {
            return new PartnerAccountLinkingResult();
        }
        if (iOrdinal == 4) {
            return new e1s0(DEFAULT_INSTANCE);
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
        synchronized (PartnerAccountLinkingResult.class) {
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
        this.bitField0_ |= 16;
        this.errorMessage_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.errorType_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.linkingId_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 1;
        this.partner_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.preloadPartner_ = str;
    }

    public final void t(boolean z) {
        this.bitField0_ |= 2;
        this.success_ = z;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
