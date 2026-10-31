package com.spotify.subscriptionviewservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.wah;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class Component extends h implements v2j0 {
    public static final int BANNER_FIELD_NUMBER = 5;
    public static final int BENEFITS_CARD_FIELD_NUMBER = 3;
    public static final int BENEFITS_SUBSCRIPTION_CARD_FIELD_NUMBER = 6;
    private static final Component DEFAULT_INSTANCE;
    public static final int ENTRY_CARD_FIELD_NUMBER = 2;
    public static final int ICON_SUBSCRIPTION_CARD_FIELD_NUMBER = 7;
    public static final int INFO_PANEL_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int SUBSCRIPTION_FIELD_NUMBER = 1;
    private int componentCase_ = 0;
    private Object component_;

    static {
        Component component = new Component();
        DEFAULT_INSTANCE = component;
        h.registerDefaultInstance(Component.class, component);
    }

    private Component() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"component_", "componentCase_", SubscriptionCard.class, EntryPointCard.class, BenefitsCard.class, InfoPanel.class, Banner.class, BenefitsSubscriptionCard.class, IconSubscriptionCard.class});
        }
        if (iOrdinal == 3) {
            return new Component();
        }
        if (iOrdinal == 4) {
            return new wah(DEFAULT_INSTANCE, (byte) 28);
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
        synchronized (Component.class) {
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

    public final Banner n() {
        return this.componentCase_ == 5 ? (Banner) this.component_ : Banner.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final BenefitsCard o() {
        return this.componentCase_ == 3 ? (BenefitsCard) this.component_ : BenefitsCard.r();
    }

    public final BenefitsSubscriptionCard p() {
        return this.componentCase_ == 6 ? (BenefitsSubscriptionCard) this.component_ : BenefitsSubscriptionCard.p();
    }

    public final int q() {
        switch (this.componentCase_) {
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

    public final EntryPointCard r() {
        return this.componentCase_ == 2 ? (EntryPointCard) this.component_ : EntryPointCard.n();
    }

    public final IconSubscriptionCard s() {
        return this.componentCase_ == 7 ? (IconSubscriptionCard) this.component_ : IconSubscriptionCard.n();
    }

    public final InfoPanel t() {
        return this.componentCase_ == 4 ? (InfoPanel) this.component_ : InfoPanel.o();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final SubscriptionCard u() {
        return this.componentCase_ == 1 ? (SubscriptionCard) this.component_ : SubscriptionCard.q();
    }
}
