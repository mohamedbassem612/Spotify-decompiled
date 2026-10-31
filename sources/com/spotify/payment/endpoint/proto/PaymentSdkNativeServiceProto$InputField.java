package com.spotify.payment.endpoint.proto;

import p.bf40;
import p.h290;
import p.jf40;
import p.ncs0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PaymentSdkNativeServiceProto$InputField extends com.google.protobuf.h implements v2j0 {
    private static final PaymentSdkNativeServiceProto$InputField DEFAULT_INSTANCE;
    public static final int HINT_MESSAGE_FIELD_NUMBER = 8;
    public static final int INITIAL_VALUE_FIELD_NUMBER = 6;
    public static final int LABEL_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PLACEHOLDER_FIELD_NUMBER = 4;
    public static final int PREFIX_FIELD_NUMBER = 7;
    public static final int TYPE_FIELD_NUMBER = 10;
    public static final int VALIDATION_RULES_FIELD_NUMBER = 5;
    private int type_;
    private String label_ = "";
    private String name_ = "";
    private String placeholder_ = "";
    private h290 validationRules_ = com.google.protobuf.h.emptyProtobufList();
    private String initialValue_ = "";
    private String prefix_ = "";
    private String hintMessage_ = "";

    public static final class InputValidationRule extends com.google.protobuf.h implements v2j0 {
        public static final int CPF_FOR_BRAZIL_FIELD_NUMBER = 5;
        private static final InputValidationRule DEFAULT_INSTANCE;
        public static final int ERROR_MESSAGE_FIELD_NUMBER = 1;
        public static final int MAX_LENGTH_FIELD_NUMBER = 2;
        public static final int NO_CARD_NUMBER_FIELD_NUMBER = 6;
        private static volatile qzr0 PARSER = null;
        public static final int REGEX_FIELD_NUMBER = 3;
        public static final int REQUIRED_FIELD_NUMBER = 4;
        private Object rule_;
        private int ruleCase_ = 0;
        private String errorMessage_ = "";

        public static final class CpfForBrazilRule extends com.google.protobuf.h implements v2j0 {
            private static final CpfForBrazilRule DEFAULT_INSTANCE;
            private static volatile qzr0 PARSER;

            static {
                CpfForBrazilRule cpfForBrazilRule = new CpfForBrazilRule();
                DEFAULT_INSTANCE = cpfForBrazilRule;
                com.google.protobuf.h.registerDefaultInstance(CpfForBrazilRule.class, cpfForBrazilRule);
            }

            private CpfForBrazilRule() {
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
                }
                if (iOrdinal == 3) {
                    return new CpfForBrazilRule();
                }
                if (iOrdinal == 4) {
                    return new o(DEFAULT_INSTANCE);
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
                synchronized (CpfForBrazilRule.class) {
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

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class MaxLengthRule extends com.google.protobuf.h implements v2j0 {
            private static final MaxLengthRule DEFAULT_INSTANCE;
            public static final int MAX_LENGTH_FIELD_NUMBER = 1;
            private static volatile qzr0 PARSER;
            private int maxLength_;

            static {
                MaxLengthRule maxLengthRule = new MaxLengthRule();
                DEFAULT_INSTANCE = maxLengthRule;
                com.google.protobuf.h.registerDefaultInstance(MaxLengthRule.class, maxLengthRule);
            }

            private MaxLengthRule() {
            }

            public static MaxLengthRule n() {
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"maxLength_"});
                }
                if (iOrdinal == 3) {
                    return new MaxLengthRule();
                }
                if (iOrdinal == 4) {
                    return new p(DEFAULT_INSTANCE);
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
                synchronized (MaxLengthRule.class) {
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

            public final int o() {
                return this.maxLength_;
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class NoCardNumberRule extends com.google.protobuf.h implements v2j0 {
            private static final NoCardNumberRule DEFAULT_INSTANCE;
            private static volatile qzr0 PARSER;

            static {
                NoCardNumberRule noCardNumberRule = new NoCardNumberRule();
                DEFAULT_INSTANCE = noCardNumberRule;
                com.google.protobuf.h.registerDefaultInstance(NoCardNumberRule.class, noCardNumberRule);
            }

            private NoCardNumberRule() {
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
                }
                if (iOrdinal == 3) {
                    return new NoCardNumberRule();
                }
                if (iOrdinal == 4) {
                    return new q(DEFAULT_INSTANCE);
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
                synchronized (NoCardNumberRule.class) {
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

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class RegexRule extends com.google.protobuf.h implements v2j0 {
            private static final RegexRule DEFAULT_INSTANCE;
            private static volatile qzr0 PARSER = null;
            public static final int REGEX_FIELD_NUMBER = 1;
            private String regex_ = "";

            static {
                RegexRule regexRule = new RegexRule();
                DEFAULT_INSTANCE = regexRule;
                com.google.protobuf.h.registerDefaultInstance(RegexRule.class, regexRule);
            }

            private RegexRule() {
            }

            public static RegexRule n() {
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"regex_"});
                }
                if (iOrdinal == 3) {
                    return new RegexRule();
                }
                if (iOrdinal == 4) {
                    return new r(DEFAULT_INSTANCE);
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
                synchronized (RegexRule.class) {
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

            public final String o() {
                return this.regex_;
            }

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        public static final class RequiredRule extends com.google.protobuf.h implements v2j0 {
            private static final RequiredRule DEFAULT_INSTANCE;
            private static volatile qzr0 PARSER;

            static {
                RequiredRule requiredRule = new RequiredRule();
                DEFAULT_INSTANCE = requiredRule;
                com.google.protobuf.h.registerDefaultInstance(RequiredRule.class, requiredRule);
            }

            private RequiredRule() {
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
                    return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
                }
                if (iOrdinal == 3) {
                    return new RequiredRule();
                }
                if (iOrdinal == 4) {
                    return new s(DEFAULT_INSTANCE);
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
                synchronized (RequiredRule.class) {
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

            public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
                return toBuilder();
            }
        }

        static {
            InputValidationRule inputValidationRule = new InputValidationRule();
            DEFAULT_INSTANCE = inputValidationRule;
            com.google.protobuf.h.registerDefaultInstance(InputValidationRule.class, inputValidationRule);
        }

        private InputValidationRule() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"rule_", "ruleCase_", "errorMessage_", MaxLengthRule.class, RegexRule.class, RequiredRule.class, CpfForBrazilRule.class, NoCardNumberRule.class});
            }
            if (iOrdinal == 3) {
                return new InputValidationRule();
            }
            if (iOrdinal == 4) {
                return new n(DEFAULT_INSTANCE);
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
            synchronized (InputValidationRule.class) {
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
            return this.errorMessage_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final MaxLengthRule o() {
            return this.ruleCase_ == 2 ? (MaxLengthRule) this.rule_ : MaxLengthRule.n();
        }

        public final RegexRule p() {
            return this.ruleCase_ == 3 ? (RegexRule) this.rule_ : RegexRule.n();
        }

        public final int q() {
            int i = this.ruleCase_;
            if (i == 0) {
                return 6;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 3) {
                return 2;
            }
            if (i == 4) {
                return 3;
            }
            if (i != 5) {
                return i != 6 ? 0 : 5;
            }
            return 4;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        PaymentSdkNativeServiceProto$InputField paymentSdkNativeServiceProto$InputField = new PaymentSdkNativeServiceProto$InputField();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$InputField;
        com.google.protobuf.h.registerDefaultInstance(PaymentSdkNativeServiceProto$InputField.class, paymentSdkNativeServiceProto$InputField);
    }

    private PaymentSdkNativeServiceProto$InputField() {
    }

    public static PaymentSdkNativeServiceProto$InputField n() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0002\n\b\u0000\u0001\u0000\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u001b\u0006Ȉ\u0007Ȉ\bȈ\n\f", new Object[]{"label_", "name_", "placeholder_", "validationRules_", InputValidationRule.class, "initialValue_", "prefix_", "hintMessage_", "type_"});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$InputField();
        }
        if (iOrdinal == 4) {
            return new m(DEFAULT_INSTANCE);
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
        synchronized (PaymentSdkNativeServiceProto$InputField.class) {
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
        return this.initialValue_;
    }

    public final String q() {
        return this.label_;
    }

    public final String r() {
        return this.placeholder_;
    }

    public final String s() {
        return this.prefix_;
    }

    public final ncs0 t() {
        ncs0 ncs0Var;
        int i = this.type_;
        if (i == 0) {
            ncs0Var = ncs0.INPUT_FIELD_TYPE_UNKNOWN;
        } else if (i == 1) {
            ncs0Var = ncs0.INPUT_FIELD_TYPE_TEXT;
        } else if (i == 2) {
            ncs0Var = ncs0.INPUT_FIELD_TYPE_NUMBER;
        } else if (i == 3) {
            ncs0Var = ncs0.INPUT_FIELD_TYPE_PHONE;
        } else if (i != 4) {
            ncs0Var = i != 5 ? null : ncs0.INPUT_FIELD_TYPE_HIDDEN;
        } else {
            ncs0Var = ncs0.INPUT_FIELD_TYPE_EMAIL;
        }
        return ncs0Var == null ? ncs0.UNRECOGNIZED : ncs0Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final h290 u() {
        return this.validationRules_;
    }
}
