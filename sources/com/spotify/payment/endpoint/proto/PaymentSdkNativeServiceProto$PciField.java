package com.spotify.payment.endpoint.proto;

import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PaymentSdkNativeServiceProto$PciField extends com.google.protobuf.h implements v2j0 {
    public static final int CVC_LENGTH_FIELD_NUMBER = 9;
    public static final int CVC_ONLY_FIELD_NUMBER = 8;
    private static final PaymentSdkNativeServiceProto$PciField DEFAULT_INSTANCE;
    public static final int ENABLE_KOREA_FIELDS_FIELD_NUMBER = 7;
    public static final int ERROR_MESSAGES_FIELD_NUMBER = 5;
    public static final int IS_RTL_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NETWORKS_FIELD_NUMBER = 10;
    private static volatile qzr0 PARSER = null;
    public static final int PRELOAD_ENABLED_FIELD_NUMBER = 11;
    public static final int PROVIDERS_FIELD_NUMBER = 3;
    public static final int TRANSLATIONS_FIELD_NUMBER = 4;
    public static final int WEBVIEW_BRIDGE_URL_FIELD_NUMBER = 2;
    private int bitField0_;
    private int cvcLength_;
    private boolean cvcOnly_;
    private boolean enableKoreaFields_;
    private PciErrorMessages errorMessages_;
    private boolean isRtl_;
    private boolean preloadEnabled_;
    private PciTranslations translations_;
    private String name_ = "";
    private String webviewBridgeUrl_ = "";
    private h290 providers_ = com.google.protobuf.h.emptyProtobufList();
    private h290 networks_ = com.google.protobuf.h.emptyProtobufList();

    public static final class PciCardNetwork extends com.google.protobuf.h implements v2j0 {
        private static final PciCardNetwork DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int LOGO_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile qzr0 PARSER;
        private String id_ = "";
        private String name_ = "";
        private String logo_ = "";

        static {
            PciCardNetwork pciCardNetwork = new PciCardNetwork();
            DEFAULT_INSTANCE = pciCardNetwork;
            com.google.protobuf.h.registerDefaultInstance(PciCardNetwork.class, pciCardNetwork);
        }

        private PciCardNetwork() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"id_", "name_", "logo_"});
            }
            if (iOrdinal == 3) {
                return new PciCardNetwork();
            }
            if (iOrdinal == 4) {
                return new w(DEFAULT_INSTANCE);
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
            synchronized (PciCardNetwork.class) {
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

    public static final class PciErrorMessages extends com.google.protobuf.h implements v2j0 {
        private static final PciErrorMessages DEFAULT_INSTANCE;
        public static final int EXPIRED_EXPIRY_DATE_FIELD_NUMBER = 4;
        public static final int INVALID_BIRTH_DATE_FIELD_NUMBER = 5;
        public static final int INVALID_CARD_NUMBER_FIELD_NUMBER = 1;
        public static final int INVALID_CORPORATE_REGISTRATION_NUMBER_FIELD_NUMBER = 6;
        public static final int INVALID_CVC_FIELD_NUMBER = 2;
        public static final int INVALID_EXPIRY_DATE_FIELD_NUMBER = 3;
        public static final int INVALID_TWO_DIGIT_PIN_FIELD_NUMBER = 7;
        private static volatile qzr0 PARSER;
        private String invalidCardNumber_ = "";
        private String invalidCvc_ = "";
        private String invalidExpiryDate_ = "";
        private String expiredExpiryDate_ = "";
        private String invalidBirthDate_ = "";
        private String invalidCorporateRegistrationNumber_ = "";
        private String invalidTwoDigitPin_ = "";

        static {
            PciErrorMessages pciErrorMessages = new PciErrorMessages();
            DEFAULT_INSTANCE = pciErrorMessages;
            com.google.protobuf.h.registerDefaultInstance(PciErrorMessages.class, pciErrorMessages);
        }

        private PciErrorMessages() {
        }

        public static PciErrorMessages n() {
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
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ", new Object[]{"invalidCardNumber_", "invalidCvc_", "invalidExpiryDate_", "expiredExpiryDate_", "invalidBirthDate_", "invalidCorporateRegistrationNumber_", "invalidTwoDigitPin_"});
            }
            if (iOrdinal == 3) {
                return new PciErrorMessages();
            }
            if (iOrdinal == 4) {
                return new x(DEFAULT_INSTANCE);
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
            synchronized (PciErrorMessages.class) {
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
            return this.expiredExpiryDate_;
        }

        public final String p() {
            return this.invalidBirthDate_;
        }

        public final String q() {
            return this.invalidCardNumber_;
        }

        public final String r() {
            return this.invalidCorporateRegistrationNumber_;
        }

        public final String s() {
            return this.invalidCvc_;
        }

        public final String t() {
            return this.invalidExpiryDate_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public final String u() {
            return this.invalidTwoDigitPin_;
        }
    }

    public static final class PciTranslations extends com.google.protobuf.h implements v2j0 {
        public static final int BIRTH_DATE_LABEL_FIELD_NUMBER = 7;
        public static final int BIRTH_DATE_PLACEHOLDER_FIELD_NUMBER = 8;
        public static final int CARD_NUMBER_LABEL_FIELD_NUMBER = 1;
        public static final int CORPORATE_CARD_LABEL_FIELD_NUMBER = 6;
        public static final int CORPORATE_REGISTRATION_NUMBER_LABEL_FIELD_NUMBER = 9;
        public static final int CORPORATE_REGISTRATION_NUMBER_PLACEHOLDER_FIELD_NUMBER = 10;
        private static final PciTranslations DEFAULT_INSTANCE;
        public static final int EXPIRATION_DATE_LABEL_FIELD_NUMBER = 3;
        public static final int EXPIRATION_DATE_PLACEHOLDER_FIELD_NUMBER = 4;
        private static volatile qzr0 PARSER = null;
        public static final int PERSONAL_CARD_LABEL_FIELD_NUMBER = 5;
        public static final int SECURITY_CODE_LABEL_FIELD_NUMBER = 2;
        public static final int TWO_DIGIT_PIN_LABEL_FIELD_NUMBER = 11;
        public static final int TWO_DIGIT_PIN_PLACEHOLDER_FIELD_NUMBER = 12;
        private String cardNumberLabel_ = "";
        private String securityCodeLabel_ = "";
        private String expirationDateLabel_ = "";
        private String expirationDatePlaceholder_ = "";
        private String personalCardLabel_ = "";
        private String corporateCardLabel_ = "";
        private String birthDateLabel_ = "";
        private String birthDatePlaceholder_ = "";
        private String corporateRegistrationNumberLabel_ = "";
        private String corporateRegistrationNumberPlaceholder_ = "";
        private String twoDigitPinLabel_ = "";
        private String twoDigitPinPlaceholder_ = "";

        static {
            PciTranslations pciTranslations = new PciTranslations();
            DEFAULT_INSTANCE = pciTranslations;
            com.google.protobuf.h.registerDefaultInstance(PciTranslations.class, pciTranslations);
        }

        private PciTranslations() {
        }

        public static qzr0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public static PciTranslations t() {
            return DEFAULT_INSTANCE;
        }

        public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
            bf40 bf40Var;
            int iOrdinal = jf40Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\fȈ", new Object[]{"cardNumberLabel_", "securityCodeLabel_", "expirationDateLabel_", "expirationDatePlaceholder_", "personalCardLabel_", "corporateCardLabel_", "birthDateLabel_", "birthDatePlaceholder_", "corporateRegistrationNumberLabel_", "corporateRegistrationNumberPlaceholder_", "twoDigitPinLabel_", "twoDigitPinPlaceholder_"});
            }
            if (iOrdinal == 3) {
                return new PciTranslations();
            }
            if (iOrdinal == 4) {
                return new y(DEFAULT_INSTANCE);
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
            synchronized (PciTranslations.class) {
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
            return this.birthDateLabel_;
        }

        public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
            return newBuilderForType();
        }

        public final String o() {
            return this.birthDatePlaceholder_;
        }

        public final String p() {
            return this.cardNumberLabel_;
        }

        public final String q() {
            return this.corporateCardLabel_;
        }

        public final String r() {
            return this.corporateRegistrationNumberLabel_;
        }

        public final String s() {
            return this.corporateRegistrationNumberPlaceholder_;
        }

        public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
            return toBuilder();
        }

        public final String u() {
            return this.expirationDateLabel_;
        }

        public final String v() {
            return this.expirationDatePlaceholder_;
        }

        public final String w() {
            return this.personalCardLabel_;
        }

        public final String x() {
            return this.securityCodeLabel_;
        }

        public final String y() {
            return this.twoDigitPinLabel_;
        }

        public final String z() {
            return this.twoDigitPinPlaceholder_;
        }
    }

    static {
        PaymentSdkNativeServiceProto$PciField paymentSdkNativeServiceProto$PciField = new PaymentSdkNativeServiceProto$PciField();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$PciField;
        com.google.protobuf.h.registerDefaultInstance(PaymentSdkNativeServiceProto$PciField.class, paymentSdkNativeServiceProto$PciField);
    }

    private PaymentSdkNativeServiceProto$PciField() {
    }

    public static PaymentSdkNativeServiceProto$PciField p() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003Ț\u0004ဉ\u0000\u0005ဉ\u0001\u0006\u0007\u0007\u0007\b\u0007\t\u0004\n\u001b\u000b\u0007", new Object[]{"bitField0_", "name_", "webviewBridgeUrl_", "providers_", "translations_", "errorMessages_", "isRtl_", "enableKoreaFields_", "cvcOnly_", "cvcLength_", "networks_", PciCardNetwork.class, "preloadEnabled_"});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$PciField();
        }
        if (iOrdinal == 4) {
            return new v(DEFAULT_INSTANCE);
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
        synchronized (PaymentSdkNativeServiceProto$PciField.class) {
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

    public final int n() {
        return this.cvcLength_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.cvcOnly_;
    }

    public final boolean q() {
        return this.enableKoreaFields_;
    }

    public final PciErrorMessages r() {
        PciErrorMessages pciErrorMessages = this.errorMessages_;
        return pciErrorMessages == null ? PciErrorMessages.n() : pciErrorMessages;
    }

    public final boolean s() {
        return this.isRtl_;
    }

    public final boolean t() {
        return this.preloadEnabled_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final h290 u() {
        return this.providers_;
    }

    public final PciTranslations v() {
        PciTranslations pciTranslations = this.translations_;
        return pciTranslations == null ? PciTranslations.t() : pciTranslations;
    }

    public final String w() {
        return this.webviewBridgeUrl_;
    }
}
