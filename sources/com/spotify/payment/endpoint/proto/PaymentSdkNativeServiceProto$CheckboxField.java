package com.spotify.payment.endpoint.proto;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sas0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PaymentSdkNativeServiceProto$CheckboxField extends com.google.protobuf.h implements v2j0 {
    private static final PaymentSdkNativeServiceProto$CheckboxField DEFAULT_INSTANCE;
    public static final int HINT_MESSAGE_FIELD_NUMBER = 3;
    public static final int LABEL_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private String name_ = "";
    private String label_ = "";
    private String hintMessage_ = "";

    static {
        PaymentSdkNativeServiceProto$CheckboxField paymentSdkNativeServiceProto$CheckboxField = new PaymentSdkNativeServiceProto$CheckboxField();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$CheckboxField;
        com.google.protobuf.h.registerDefaultInstance(PaymentSdkNativeServiceProto$CheckboxField.class, paymentSdkNativeServiceProto$CheckboxField);
    }

    private PaymentSdkNativeServiceProto$CheckboxField() {
    }

    public static PaymentSdkNativeServiceProto$CheckboxField n() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"name_", "label_", "hintMessage_"});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$CheckboxField();
        }
        if (iOrdinal == 4) {
            return new sas0(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (PaymentSdkNativeServiceProto$CheckboxField.class) {
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

    public final String getName() {
        return this.name_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.hintMessage_;
    }

    public final String p() {
        return this.label_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
