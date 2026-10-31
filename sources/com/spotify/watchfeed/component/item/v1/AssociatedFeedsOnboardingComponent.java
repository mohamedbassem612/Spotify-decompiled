package com.spotify.watchfeed.component.item.v1;

import com.google.protobuf.h;
import p.bf40;
import p.db6;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class AssociatedFeedsOnboardingComponent extends h implements v2j0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 6;
    private static final AssociatedFeedsOnboardingComponent DEFAULT_INSTANCE;
    public static final int DELAY_MS_FIELD_NUMBER = 2;
    public static final int FORCE_SHOW_FIELD_NUMBER = 5;
    public static final int NUMBER_OF_SWIPES_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int SHOW_DURATION_MS_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 1;
    private long delayMs_;
    private boolean forceShow_;
    private long numberOfSwipes_;
    private long showDurationMs_;
    private String title_ = "";
    private String accessibilityText_ = "";

    static {
        AssociatedFeedsOnboardingComponent associatedFeedsOnboardingComponent = new AssociatedFeedsOnboardingComponent();
        DEFAULT_INSTANCE = associatedFeedsOnboardingComponent;
        h.registerDefaultInstance(AssociatedFeedsOnboardingComponent.class, associatedFeedsOnboardingComponent);
    }

    private AssociatedFeedsOnboardingComponent() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static AssociatedFeedsOnboardingComponent s(phc phcVar) {
        return (AssociatedFeedsOnboardingComponent) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0002\u0005\u0007\u0006Ȉ", new Object[]{"title_", "delayMs_", "showDurationMs_", "numberOfSwipes_", "forceShow_", "accessibilityText_"});
        }
        if (iOrdinal == 3) {
            return new AssociatedFeedsOnboardingComponent();
        }
        if (iOrdinal == 4) {
            return new db6(DEFAULT_INSTANCE, (byte) 29);
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
        synchronized (AssociatedFeedsOnboardingComponent.class) {
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
        return this.accessibilityText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final long o() {
        return this.delayMs_;
    }

    public final boolean p() {
        return this.forceShow_;
    }

    public final long q() {
        return this.numberOfSwipes_;
    }

    public final long r() {
        return this.showDurationMs_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
