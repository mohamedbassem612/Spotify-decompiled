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
public final class PaymentSdkNativeServiceProto$PaymentMethod extends com.google.protobuf.h implements v2j0 {
    public static final int BRAND_SELECTION_FIELD_NUMBER = 6;
    private static final PaymentSdkNativeServiceProto$PaymentMethod DEFAULT_INSTANCE;
    public static final int GRAYED_OUT_MESSAGE_FIELD_NUMBER = 2;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int INITIAL_FORM_FIELD_NUMBER = 5;
    public static final int IS_METHOD_SUPPORTED_FIELD_NUMBER = 3;
    public static final int LABEL_FIELD_NUMBER = 7;
    public static final int LABEL_SUBTITLE_FIELD_NUMBER = 9;
    public static final int LEGAL_TERMS_FIELD_NUMBER = 4;
    public static final int LOGOS_FIELD_NUMBER = 10;
    public static final int PAINTED_DOOR_CONFIG_FIELD_NUMBER = 12;
    private static volatile qzr0 PARSER = null;
    public static final int STORED_METHOD_ID_FIELD_NUMBER = 11;
    public static final int SUBTITLE_FIELD_NUMBER = 8;
    private int bitField0_;
    private PaymentSdkNativeServiceProto$BrandSelection brandSelection_;
    private PaymentSdkNativeServiceProto$Form initialForm_;
    private boolean isMethodSupported_;
    private PaymentSdkNativeServiceProto$PaintedDoorConfig paintedDoorConfig_;
    private String id_ = "";
    private String grayedOutMessage_ = "";
    private h290 legalTerms_ = com.google.protobuf.h.emptyProtobufList();
    private String label_ = "";
    private String subtitle_ = "";
    private String labelSubtitle_ = "";
    private h290 logos_ = com.google.protobuf.h.emptyProtobufList();
    private String storedMethodId_ = "";

    static {
        PaymentSdkNativeServiceProto$PaymentMethod paymentSdkNativeServiceProto$PaymentMethod = new PaymentSdkNativeServiceProto$PaymentMethod();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$PaymentMethod;
        com.google.protobuf.h.registerDefaultInstance(PaymentSdkNativeServiceProto$PaymentMethod.class, paymentSdkNativeServiceProto$PaymentMethod);
    }

    private PaymentSdkNativeServiceProto$PaymentMethod() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\f\f\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004\u001b\u0005ဉ\u0000\u0006ဉ\u0001\u0007Ȉ\bȈ\tȈ\nȚ\u000bȈ\fဉ\u0002", new Object[]{"bitField0_", "id_", "grayedOutMessage_", "isMethodSupported_", "legalTerms_", PaymentSdkNativeServiceProto$LegalTerm.class, "initialForm_", "brandSelection_", "label_", "subtitle_", "labelSubtitle_", "logos_", "storedMethodId_", "paintedDoorConfig_"});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$PaymentMethod();
        }
        if (iOrdinal == 4) {
            return new sas0(DEFAULT_INSTANCE, (byte) 10);
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
        synchronized (PaymentSdkNativeServiceProto$PaymentMethod.class) {
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

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String n() {
        return this.grayedOutMessage_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final PaymentSdkNativeServiceProto$Form o() {
        PaymentSdkNativeServiceProto$Form paymentSdkNativeServiceProto$Form = this.initialForm_;
        return paymentSdkNativeServiceProto$Form == null ? PaymentSdkNativeServiceProto$Form.p() : paymentSdkNativeServiceProto$Form;
    }

    public final boolean p() {
        return this.isMethodSupported_;
    }

    public final String q() {
        return this.label_;
    }

    public final h290 r() {
        return this.legalTerms_;
    }

    public final h290 s() {
        return this.logos_;
    }

    public final PaymentSdkNativeServiceProto$PaintedDoorConfig t() {
        PaymentSdkNativeServiceProto$PaintedDoorConfig paymentSdkNativeServiceProto$PaintedDoorConfig = this.paintedDoorConfig_;
        return paymentSdkNativeServiceProto$PaintedDoorConfig == null ? PaymentSdkNativeServiceProto$PaintedDoorConfig.p() : paymentSdkNativeServiceProto$PaintedDoorConfig;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final String u() {
        return this.storedMethodId_;
    }

    public final boolean v() {
        return (this.bitField0_ & 4) != 0;
    }
}
