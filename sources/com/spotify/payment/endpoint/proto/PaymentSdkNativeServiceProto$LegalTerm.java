package com.spotify.payment.endpoint.proto;

import p.bf40;
import p.jf40;
import p.ocs0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sas0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PaymentSdkNativeServiceProto$LegalTerm extends com.google.protobuf.h implements v2j0 {
    private static final PaymentSdkNativeServiceProto$LegalTerm DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 3;
    public static final int HTML_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    private String html_ = "";
    private String error_ = "";

    static {
        PaymentSdkNativeServiceProto$LegalTerm paymentSdkNativeServiceProto$LegalTerm = new PaymentSdkNativeServiceProto$LegalTerm();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$LegalTerm;
        com.google.protobuf.h.registerDefaultInstance(PaymentSdkNativeServiceProto$LegalTerm.class, paymentSdkNativeServiceProto$LegalTerm);
    }

    private PaymentSdkNativeServiceProto$LegalTerm() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ", new Object[]{"type_", "html_", "error_"});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$LegalTerm();
        }
        if (iOrdinal == 4) {
            return new sas0(DEFAULT_INSTANCE, (byte) 8);
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
        synchronized (PaymentSdkNativeServiceProto$LegalTerm.class) {
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
        return this.error_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.html_;
    }

    public final ocs0 p() {
        ocs0 ocs0Var;
        int i = this.type_;
        if (i == 0) {
            ocs0Var = ocs0.LEGAL_TERM_TYPE_UNKNOWN;
        } else if (i == 1) {
            ocs0Var = ocs0.LEGAL_TERM_TYPE_TEXT;
        } else if (i == 2) {
            ocs0Var = ocs0.LEGAL_TERM_TYPE_CONSPICUOUS_TEXT;
        } else if (i != 3) {
            ocs0Var = i != 4 ? null : ocs0.LEGAL_TERM_TYPE_CONSPICUOUS_CHECKBOX;
        } else {
            ocs0Var = ocs0.LEGAL_TERM_TYPE_CHECKBOX;
        }
        return ocs0Var == null ? ocs0.UNRECOGNIZED : ocs0Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
