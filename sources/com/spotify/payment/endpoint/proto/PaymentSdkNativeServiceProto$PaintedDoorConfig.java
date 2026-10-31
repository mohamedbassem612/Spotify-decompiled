package com.spotify.payment.endpoint.proto;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sas0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class PaymentSdkNativeServiceProto$PaintedDoorConfig extends com.google.protobuf.h implements v2j0 {
    public static final int BODY_FIELD_NUMBER = 2;
    public static final int BUTTON_LABEL_FIELD_NUMBER = 3;
    private static final PaymentSdkNativeServiceProto$PaintedDoorConfig DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private String title_ = "";
    private String body_ = "";
    private String buttonLabel_ = "";

    static {
        PaymentSdkNativeServiceProto$PaintedDoorConfig paymentSdkNativeServiceProto$PaintedDoorConfig = new PaymentSdkNativeServiceProto$PaintedDoorConfig();
        DEFAULT_INSTANCE = paymentSdkNativeServiceProto$PaintedDoorConfig;
        com.google.protobuf.h.registerDefaultInstance(PaymentSdkNativeServiceProto$PaintedDoorConfig.class, paymentSdkNativeServiceProto$PaintedDoorConfig);
    }

    private PaymentSdkNativeServiceProto$PaintedDoorConfig() {
    }

    public static PaymentSdkNativeServiceProto$PaintedDoorConfig p() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"title_", "body_", "buttonLabel_"});
        }
        if (iOrdinal == 3) {
            return new PaymentSdkNativeServiceProto$PaintedDoorConfig();
        }
        if (iOrdinal == 4) {
            return new sas0(DEFAULT_INSTANCE, (byte) 9);
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
        synchronized (PaymentSdkNativeServiceProto$PaintedDoorConfig.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final String n() {
        return this.body_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.buttonLabel_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
