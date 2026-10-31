package com.spotify.payment.endpoint.proto;

import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PaymentSdkNativeServiceProto$DropdownField extends com.google.protobuf.h implements v2j0 {
    public static final int CHOICES_FIELD_NUMBER = 3;
    private static final PaymentSdkNativeServiceProto$DropdownField DEFAULT_INSTANCE;
    public static final int INITIAL_VALUE_FIELD_NUMBER = 4;
    public static final int LABEL_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private String label_ = "";
    private String name_ = "";
    private h290 choices_ = com.google.protobuf.h.emptyProtobufList();
    private String initialValue_ = "";

    public static final class DropdownChoice extends com.google.protobuf.h implements v2j0 {
        private static final DropdownChoice DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 2;
        public static final int LABEL_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER;
        private String label_ = "";
        private String id_ = "";

        static {
            DropdownChoice dropdownChoice = new DropdownChoice();
            DEFAULT_INSTANCE = dropdownChoice;
            com.google.protobuf.h.registerDefaultInstance(DropdownChoice.class, dropdownChoice);
        }

        private DropdownChoice() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"label_", "id_"});
            }
            if (iOrdinal == 3) {
                return new DropdownChoice();
            }
            if (iOrdinal == 4) {
                return new k(DEFAULT_INSTANCE);
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
            synchronized (DropdownChoice.class) {
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
            return this.label_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        PaymentSdkNativeServiceProto$DropdownField paymentSdkNativeServiceProto$DropdownField = new PaymentSdkNativeServiceProto$DropdownField();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$DropdownField;
        com.google.protobuf.h.registerDefaultInstance(PaymentSdkNativeServiceProto$DropdownField.class, paymentSdkNativeServiceProto$DropdownField);
    }

    private PaymentSdkNativeServiceProto$DropdownField() {
    }

    public static PaymentSdkNativeServiceProto$DropdownField o() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004Ȉ", new Object[]{"label_", "name_", "choices_", DropdownChoice.class, "initialValue_"});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$DropdownField();
        }
        if (iOrdinal == 4) {
            return new j(DEFAULT_INSTANCE);
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
        synchronized (PaymentSdkNativeServiceProto$DropdownField.class) {
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

    public final h290 n() {
        return this.choices_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String p() {
        return this.initialValue_;
    }

    public final String q() {
        return this.label_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
