package com.spotify.audiobookdirectsales.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.o8t;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class DirectSalesPurchaseInfo extends h implements v2j0 {
    public static final int CONTEXT_MENU_LABEL_FIELD_NUMBER = 4;
    private static final DirectSalesPurchaseInfo DEFAULT_INSTANCE;
    public static final int ENGAGEMENT_UNLOCK_FIELD_NUMBER = 6;
    public static final int FREE_UNLOCK_FIELD_NUMBER = 5;
    public static final int IS_FREE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SHOW_BUY_OPTION_IN_CONTEXT_MENU_FIELD_NUMBER = 1;
    public static final int VARIANT_FIELD_NUMBER = 2;
    public static final int WEB_CHECKOUT_UNLOCK_FIELD_NUMBER = 7;
    private boolean isFree_;
    private boolean showBuyOptionInContextMenu_;
    private Object translationVariant_;
    private Object unlockFlow_;
    private int translationVariantCase_ = 0;
    private int unlockFlowCase_ = 0;
    private String contextMenuLabel_ = "";

    static {
        DirectSalesPurchaseInfo directSalesPurchaseInfo = new DirectSalesPurchaseInfo();
        DEFAULT_INSTANCE = directSalesPurchaseInfo;
        h.registerDefaultInstance(DirectSalesPurchaseInfo.class, directSalesPurchaseInfo);
    }

    private DirectSalesPurchaseInfo() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static DirectSalesPurchaseInfo r(byte[] bArr) {
        return (DirectSalesPurchaseInfo) h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0002\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0007\u0002?\u0000\u0003\u0007\u0004Ȉ\u0005<\u0001\u0006<\u0001\u0007<\u0001", new Object[]{"translationVariant_", "translationVariantCase_", "unlockFlow_", "unlockFlowCase_", "showBuyOptionInContextMenu_", "isFree_", "contextMenuLabel_", FreeUnlock.class, EngagementUnlock.class, WebCheckoutUnlock.class});
        }
        if (iOrdinal == 3) {
            return new DirectSalesPurchaseInfo();
        }
        if (iOrdinal == 4) {
            return new o8t(DEFAULT_INSTANCE, (byte) 14);
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
        synchronized (DirectSalesPurchaseInfo.class) {
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
        return this.contextMenuLabel_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final EngagementUnlock o() {
        return this.unlockFlowCase_ == 6 ? (EngagementUnlock) this.unlockFlow_ : EngagementUnlock.r();
    }

    public final boolean p() {
        return this.showBuyOptionInContextMenu_;
    }

    public final int q() {
        int i = this.unlockFlowCase_;
        if (i == 0) {
            return 4;
        }
        if (i == 5) {
            return 1;
        }
        if (i != 6) {
            return i != 7 ? 0 : 3;
        }
        return 2;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
