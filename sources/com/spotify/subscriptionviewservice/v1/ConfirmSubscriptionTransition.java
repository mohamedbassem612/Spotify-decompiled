package com.spotify.subscriptionviewservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.n5k;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ConfirmSubscriptionTransition extends h implements v2j0 {
    public static final int CANCEL_LABEL_FIELD_NUMBER = 9;
    public static final int CONFIRM_LABEL_FIELD_NUMBER = 2;
    private static final ConfirmSubscriptionTransition DEFAULT_INSTANCE;
    public static final int DIALOG_BODY_FIELD_NUMBER = 8;
    public static final int DIALOG_TITLE_FIELD_NUMBER = 7;
    public static final int EFFECTIVE_DATE_FORMATTED_FIELD_NUMBER = 5;
    public static final int FORMATTED_PRICE_FIELD_NUMBER = 4;
    public static final int OFFER_UUID_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PLAN_NAME_FIELD_NUMBER = 3;
    public static final int USES_APPLICABLE_TAX_COPY_FIELD_NUMBER = 6;
    private boolean usesApplicableTaxCopy_;
    private String offerUuid_ = "";
    private String confirmLabel_ = "";
    private String planName_ = "";
    private String formattedPrice_ = "";
    private String effectiveDateFormatted_ = "";
    private String dialogTitle_ = "";
    private String dialogBody_ = "";
    private String cancelLabel_ = "";

    static {
        ConfirmSubscriptionTransition confirmSubscriptionTransition = new ConfirmSubscriptionTransition();
        DEFAULT_INSTANCE = confirmSubscriptionTransition;
        h.registerDefaultInstance(ConfirmSubscriptionTransition.class, confirmSubscriptionTransition);
    }

    private ConfirmSubscriptionTransition() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u0007\u0007Ȉ\bȈ\tȈ", new Object[]{"offerUuid_", "confirmLabel_", "planName_", "formattedPrice_", "effectiveDateFormatted_", "usesApplicableTaxCopy_", "dialogTitle_", "dialogBody_", "cancelLabel_"});
        }
        if (iOrdinal == 3) {
            return new ConfirmSubscriptionTransition();
        }
        if (iOrdinal == 4) {
            return new n5k(DEFAULT_INSTANCE, (byte) 21);
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
        synchronized (ConfirmSubscriptionTransition.class) {
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
