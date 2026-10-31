package com.spotify.premiummarketing.premiumdestinationpage.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.ia20;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class FlavorPageViewModel extends h implements v2j0 {
    public static final int BENEFIT_FIELD_NUMBER = 2;
    public static final int CTA_TEXT_FIELD_NUMBER = 7;
    private static final FlavorPageViewModel DEFAULT_INSTANCE;
    public static final int INVITE_EXPLANATION_FIELD_NUMBER = 4;
    public static final int LEGAL_TEXT_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int PLANS_FIELD_NUMBER = 6;
    public static final int PLAN_NAME_FIELD_NUMBER = 1;
    public static final int TAG_LINE_FIELD_NUMBER = 3;
    private int bitField0_;
    private String planName_ = "";
    private String benefit_ = "";
    private String tagLine_ = "";
    private String inviteExplanation_ = "";
    private String legalText_ = "";
    private h290 plans_ = h.emptyProtobufList();
    private String ctaText_ = "";

    static {
        FlavorPageViewModel flavorPageViewModel = new FlavorPageViewModel();
        DEFAULT_INSTANCE = flavorPageViewModel;
        h.registerDefaultInstance(FlavorPageViewModel.class, flavorPageViewModel);
    }

    private FlavorPageViewModel() {
    }

    public static FlavorPageViewModel p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ለ\u0000\u0005ለ\u0001\u0006\u001b\u0007ለ\u0002", new Object[]{"bitField0_", "planName_", "benefit_", "tagLine_", "inviteExplanation_", "legalText_", "plans_", PlanDetailViewModel.class, "ctaText_"});
        }
        if (iOrdinal == 3) {
            return new FlavorPageViewModel();
        }
        if (iOrdinal == 4) {
            return new ia20(DEFAULT_INSTANCE, (byte) 11);
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
        synchronized (FlavorPageViewModel.class) {
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

    public final String n() {
        return this.benefit_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.ctaText_;
    }

    public final String q() {
        return this.inviteExplanation_;
    }

    public final String r() {
        return this.legalText_;
    }

    public final h290 s() {
        return this.plans_;
    }

    public final String t() {
        return this.tagLine_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
