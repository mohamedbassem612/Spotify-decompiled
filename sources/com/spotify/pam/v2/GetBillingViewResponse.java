package com.spotify.pam.v2;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vk40;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class GetBillingViewResponse extends h implements v2j0 {
    public static final int BILLING_DATE_ROW_FIELD_NUMBER = 5;
    private static final GetBillingViewResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PAST_RECEIPTS_ROW_FIELD_NUMBER = 6;
    public static final int PAYMENT_DETAILS_FIELD_NUMBER = 2;
    public static final int PAYMENT_HELP_ROW_FIELD_NUMBER = 4;
    public static final int PLAN_FIELD_NUMBER = 1;
    public static final int PRICE_ROW_FIELD_NUMBER = 3;
    private Action billingDateRow_;
    private int bitField0_;
    private Action pastReceiptsRow_;
    private PaymentDetails paymentDetails_;
    private Action paymentHelpRow_;
    private Plan plan_;
    private Action priceRow_;

    static {
        GetBillingViewResponse getBillingViewResponse = new GetBillingViewResponse();
        DEFAULT_INSTANCE = getBillingViewResponse;
        h.registerDefaultInstance(GetBillingViewResponse.class, getBillingViewResponse);
    }

    private GetBillingViewResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"bitField0_", "plan_", "paymentDetails_", "priceRow_", "paymentHelpRow_", "billingDateRow_", "pastReceiptsRow_"});
        }
        if (iOrdinal == 3) {
            return new GetBillingViewResponse();
        }
        if (iOrdinal == 4) {
            return new vk40(DEFAULT_INSTANCE, (byte) 10);
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
        synchronized (GetBillingViewResponse.class) {
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

    public final Action n() {
        Action action = this.billingDateRow_;
        return action == null ? Action.o() : action;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Action o() {
        Action action = this.pastReceiptsRow_;
        return action == null ? Action.o() : action;
    }

    public final PaymentDetails p() {
        PaymentDetails paymentDetails = this.paymentDetails_;
        return paymentDetails == null ? PaymentDetails.n() : paymentDetails;
    }

    public final Action q() {
        Action action = this.paymentHelpRow_;
        return action == null ? Action.o() : action;
    }

    public final Plan r() {
        Plan plan = this.plan_;
        return plan == null ? Plan.q() : plan;
    }

    public final Action s() {
        Action action = this.priceRow_;
        return action == null ? Action.o() : action;
    }

    public final boolean t() {
        return (this.bitField0_ & 16) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 32) != 0;
    }
}
