package com.spotify.payment.endpoint.proto;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sas0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PaymentSdkNativeServiceProto$FormField extends com.google.protobuf.h implements v2j0 {
    public static final int CHECKBOX_FIELD_FIELD_NUMBER = 6;
    public static final int CHIPS_FIELD_FIELD_NUMBER = 4;
    private static final PaymentSdkNativeServiceProto$FormField DEFAULT_INSTANCE;
    public static final int DROPDOWN_FIELD_FIELD_NUMBER = 3;
    public static final int INFORMATION_BANNER_FIELD_FIELD_NUMBER = 7;
    public static final int INPUT_FIELD_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PCI_FIELD_FIELD_NUMBER = 5;
    public static final int TEXT_FIELD_FIELD_NUMBER = 1;
    private int fieldCase_ = 0;
    private Object field_;

    static {
        PaymentSdkNativeServiceProto$FormField paymentSdkNativeServiceProto$FormField = new PaymentSdkNativeServiceProto$FormField();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$FormField;
        com.google.protobuf.h.registerDefaultInstance(PaymentSdkNativeServiceProto$FormField.class, paymentSdkNativeServiceProto$FormField);
    }

    private PaymentSdkNativeServiceProto$FormField() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"field_", "fieldCase_", PaymentSdkNativeServiceProto$TextField.class, PaymentSdkNativeServiceProto$InputField.class, PaymentSdkNativeServiceProto$DropdownField.class, PaymentSdkNativeServiceProto$ChipsField.class, PaymentSdkNativeServiceProto$PciField.class, PaymentSdkNativeServiceProto$CheckboxField.class, PaymentSdkNativeServiceProto$InformationBannerField.class});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$FormField();
        }
        if (iOrdinal == 4) {
            return new sas0(DEFAULT_INSTANCE, (byte) 6);
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
        synchronized (PaymentSdkNativeServiceProto$FormField.class) {
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

    public final PaymentSdkNativeServiceProto$CheckboxField n() {
        return this.fieldCase_ == 6 ? (PaymentSdkNativeServiceProto$CheckboxField) this.field_ : PaymentSdkNativeServiceProto$CheckboxField.n();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final PaymentSdkNativeServiceProto$ChipsField o() {
        return this.fieldCase_ == 4 ? (PaymentSdkNativeServiceProto$ChipsField) this.field_ : PaymentSdkNativeServiceProto$ChipsField.o();
    }

    public final PaymentSdkNativeServiceProto$DropdownField p() {
        return this.fieldCase_ == 3 ? (PaymentSdkNativeServiceProto$DropdownField) this.field_ : PaymentSdkNativeServiceProto$DropdownField.o();
    }

    public final int q() {
        switch (this.fieldCase_) {
            case 0:
                return 8;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            default:
                return 0;
        }
    }

    public final PaymentSdkNativeServiceProto$InformationBannerField r() {
        return this.fieldCase_ == 7 ? (PaymentSdkNativeServiceProto$InformationBannerField) this.field_ : PaymentSdkNativeServiceProto$InformationBannerField.o();
    }

    public final PaymentSdkNativeServiceProto$InputField s() {
        return this.fieldCase_ == 2 ? (PaymentSdkNativeServiceProto$InputField) this.field_ : PaymentSdkNativeServiceProto$InputField.n();
    }

    public final PaymentSdkNativeServiceProto$PciField t() {
        return this.fieldCase_ == 5 ? (PaymentSdkNativeServiceProto$PciField) this.field_ : PaymentSdkNativeServiceProto$PciField.p();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final PaymentSdkNativeServiceProto$TextField u() {
        return this.fieldCase_ == 1 ? (PaymentSdkNativeServiceProto$TextField) this.field_ : PaymentSdkNativeServiceProto$TextField.o();
    }
}
