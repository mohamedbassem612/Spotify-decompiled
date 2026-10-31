package com.spotify.pam.showvalue;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.lub1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class SubscriptionCardProto extends h implements v2j0 {
    private static final SubscriptionCardProto DEFAULT_INSTANCE;
    public static final int DISPLAY_PREMIUM_LOGO_FIELD_NUMBER = 7;
    public static final int EXPIRATION_TEXT_FIELD_NUMBER = 6;
    public static final int MEMBERS_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int PLAN_NAME_FIELD_NUMBER = 1;
    public static final int PRIMARY_COLOR_FIELD_NUMBER = 3;
    public static final int SECONDARY_COLOR_FIELD_NUMBER = 4;
    public static final int SHORT_PLAN_NAME_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean displayPremiumLogo_;
    private String planName_ = "";
    private String shortPlanName_ = "";
    private String primaryColor_ = "";
    private String secondaryColor_ = "";
    private h290 members_ = h.emptyProtobufList();
    private String expirationText_ = "";

    static {
        SubscriptionCardProto subscriptionCardProto = new SubscriptionCardProto();
        DEFAULT_INSTANCE = subscriptionCardProto;
        h.registerDefaultInstance(SubscriptionCardProto.class, subscriptionCardProto);
    }

    private SubscriptionCardProto() {
    }

    public static SubscriptionCardProto n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u001b\u0006ለ\u0000\u0007\u0007", new Object[]{"bitField0_", "planName_", "shortPlanName_", "primaryColor_", "secondaryColor_", "members_", Member.class, "expirationText_", "displayPremiumLogo_"});
        }
        if (iOrdinal == 3) {
            return new SubscriptionCardProto();
        }
        if (iOrdinal == 4) {
            return new lub1(DEFAULT_INSTANCE, (byte) 29);
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
        synchronized (SubscriptionCardProto.class) {
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

    public final String getPlanName() {
        return this.planName_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.displayPremiumLogo_;
    }

    public final String p() {
        return this.expirationText_;
    }

    public final h290 q() {
        return this.members_;
    }

    public final String r() {
        return this.primaryColor_;
    }

    public final String s() {
        return this.secondaryColor_;
    }

    public final String t() {
        return this.shortPlanName_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final boolean u() {
        return (this.bitField0_ & 1) != 0;
    }
}
