package com.spotify.automix.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.rdz;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class EsAutomix$AdjustTransitionRecipeForItemSpeedsResponse extends h implements v2j0 {
    private static final EsAutomix$AdjustTransitionRecipeForItemSpeedsResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TRANSITION_RECIPE_FIELD_NUMBER = 1;
    private String transitionRecipe_ = "";

    static {
        EsAutomix$AdjustTransitionRecipeForItemSpeedsResponse esAutomix$AdjustTransitionRecipeForItemSpeedsResponse = new EsAutomix$AdjustTransitionRecipeForItemSpeedsResponse();
        DEFAULT_INSTANCE = esAutomix$AdjustTransitionRecipeForItemSpeedsResponse;
        h.registerDefaultInstance(EsAutomix$AdjustTransitionRecipeForItemSpeedsResponse.class, esAutomix$AdjustTransitionRecipeForItemSpeedsResponse);
    }

    private EsAutomix$AdjustTransitionRecipeForItemSpeedsResponse() {
    }

    public static EsAutomix$AdjustTransitionRecipeForItemSpeedsResponse o(byte[] bArr) {
        return (EsAutomix$AdjustTransitionRecipeForItemSpeedsResponse) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"transitionRecipe_"});
        }
        if (iOrdinal == 3) {
            return new EsAutomix$AdjustTransitionRecipeForItemSpeedsResponse();
        }
        if (iOrdinal == 4) {
            return new rdz(DEFAULT_INSTANCE, (byte) 21);
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
        synchronized (EsAutomix$AdjustTransitionRecipeForItemSpeedsResponse.class) {
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
        return this.transitionRecipe_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
