package com.spotify.payment.endpoint.proto;

import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sas0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PaymentSdkNativeServiceProto$Form extends com.google.protobuf.h implements v2j0 {
    public static final int CTA_LABEL_FIELD_NUMBER = 3;
    public static final int CTA_MODULE_TEXT_FIELD_NUMBER = 2;
    private static final PaymentSdkNativeServiceProto$Form DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 5;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private String id_ = "";
    private String ctaModuleText_ = "";
    private String ctaLabel_ = "";
    private h290 fields_ = com.google.protobuf.h.emptyProtobufList();

    static {
        PaymentSdkNativeServiceProto$Form paymentSdkNativeServiceProto$Form = new PaymentSdkNativeServiceProto$Form();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$Form;
        com.google.protobuf.h.registerDefaultInstance(PaymentSdkNativeServiceProto$Form.class, paymentSdkNativeServiceProto$Form);
    }

    private PaymentSdkNativeServiceProto$Form() {
    }

    public static PaymentSdkNativeServiceProto$Form p() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0005\u001b", new Object[]{"id_", "ctaModuleText_", "ctaLabel_", "fields_", PaymentSdkNativeServiceProto$FormField.class});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$Form();
        }
        if (iOrdinal == 4) {
            return new sas0(DEFAULT_INSTANCE, (byte) 5);
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
        synchronized (PaymentSdkNativeServiceProto$Form.class) {
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

    public final String getId() {
        return this.id_;
    }

    public final String n() {
        return this.ctaLabel_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.ctaModuleText_;
    }

    public final h290 q() {
        return this.fields_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
