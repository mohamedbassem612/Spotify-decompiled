package com.spotify.automix.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.dlz;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class EsAutomix$AdjustTransitionRecipeForItemSpeedsRequest extends h implements v2j0 {
    private static final EsAutomix$AdjustTransitionRecipeForItemSpeedsRequest DEFAULT_INSTANCE;
    public static final int NEW_ITEM_SPEED_A_FIELD_NUMBER = 2;
    public static final int NEW_ITEM_SPEED_B_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int TRANSITION_RECIPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private double newItemSpeedA_;
    private double newItemSpeedB_;
    private String transitionRecipe_ = "";

    static {
        EsAutomix$AdjustTransitionRecipeForItemSpeedsRequest esAutomix$AdjustTransitionRecipeForItemSpeedsRequest = new EsAutomix$AdjustTransitionRecipeForItemSpeedsRequest();
        DEFAULT_INSTANCE = esAutomix$AdjustTransitionRecipeForItemSpeedsRequest;
        h.registerDefaultInstance(EsAutomix$AdjustTransitionRecipeForItemSpeedsRequest.class, esAutomix$AdjustTransitionRecipeForItemSpeedsRequest);
    }

    private EsAutomix$AdjustTransitionRecipeForItemSpeedsRequest() {
    }

    public static dlz n() {
        return (dlz) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002က\u0000\u0003က\u0001", new Object[]{"bitField0_", "transitionRecipe_", "newItemSpeedA_", "newItemSpeedB_"});
        }
        if (iOrdinal == 3) {
            return new EsAutomix$AdjustTransitionRecipeForItemSpeedsRequest();
        }
        if (iOrdinal == 4) {
            return new dlz(DEFAULT_INSTANCE);
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
        synchronized (EsAutomix$AdjustTransitionRecipeForItemSpeedsRequest.class) {
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

    public final void o(double d) {
        this.bitField0_ |= 1;
        this.newItemSpeedA_ = d;
    }

    public final void p(double d) {
        this.bitField0_ |= 2;
        this.newItemSpeedB_ = d;
    }

    public final void q(String str) {
        this.transitionRecipe_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
