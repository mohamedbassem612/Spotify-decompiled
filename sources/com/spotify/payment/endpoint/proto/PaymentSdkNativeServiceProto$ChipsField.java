package com.spotify.payment.endpoint.proto;

import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PaymentSdkNativeServiceProto$ChipsField extends com.google.protobuf.h implements v2j0 {
    public static final int CHOICES_FIELD_NUMBER = 3;
    private static final PaymentSdkNativeServiceProto$ChipsField DEFAULT_INSTANCE;
    public static final int INITIAL_VALUE_FIELD_NUMBER = 4;
    public static final int LABEL_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER;
    private String label_ = "";
    private String name_ = "";
    private h290 choices_ = com.google.protobuf.h.emptyProtobufList();
    private String initialValue_ = "";

    public static final class ChipsChoice extends com.google.protobuf.h implements v2j0 {
        private static final ChipsChoice DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 3;
        public static final int ID_FIELD_NUMBER = 2;
        public static final int LABEL_FIELD_NUMBER = 1;
        private static volatile qzr0 PARSER;
        private String label_ = "";
        private String id_ = "";
        private String description_ = "";

        static {
            ChipsChoice chipsChoice = new ChipsChoice();
            DEFAULT_INSTANCE = chipsChoice;
            com.google.protobuf.h.registerDefaultInstance(ChipsChoice.class, chipsChoice);
        }

        private ChipsChoice() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"label_", "id_", "description_"});
            }
            if (iOrdinal == 3) {
                return new ChipsChoice();
            }
            if (iOrdinal == 4) {
                return new i(DEFAULT_INSTANCE);
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
            synchronized (ChipsChoice.class) {
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

        public final String getDescription() {
            return this.description_;
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
        PaymentSdkNativeServiceProto$ChipsField paymentSdkNativeServiceProto$ChipsField = new PaymentSdkNativeServiceProto$ChipsField();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$ChipsField;
        com.google.protobuf.h.registerDefaultInstance(PaymentSdkNativeServiceProto$ChipsField.class, paymentSdkNativeServiceProto$ChipsField);
    }

    private PaymentSdkNativeServiceProto$ChipsField() {
    }

    public static PaymentSdkNativeServiceProto$ChipsField o() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004Ȉ", new Object[]{"label_", "name_", "choices_", ChipsChoice.class, "initialValue_"});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$ChipsField();
        }
        if (iOrdinal == 4) {
            return new h(DEFAULT_INSTANCE);
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
        synchronized (PaymentSdkNativeServiceProto$ChipsField.class) {
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
