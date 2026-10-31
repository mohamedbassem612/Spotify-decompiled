package com.spotify.watchfeed.component.item.v1;

import com.google.protobuf.h;
import p.bf40;
import p.gvi1;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class VerticalOnboardingComponent extends h implements v2j0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 7;
    public static final int ANIMATION_URL_FIELD_NUMBER = 8;
    private static final VerticalOnboardingComponent DEFAULT_INSTANCE;
    public static final int DELAY_MS_FIELD_NUMBER = 2;
    public static final int FORCE_SHOW_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int REPLAY_MS_FIELD_NUMBER = 5;
    public static final int SHOW_DURATION_MS_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 1;
    private long delayMs_;
    private boolean forceShow_;
    private long replayMs_;
    private long showDurationMs_;
    private String title_ = "";
    private String accessibilityText_ = "";
    private String animationUrl_ = "";

    static {
        VerticalOnboardingComponent verticalOnboardingComponent = new VerticalOnboardingComponent();
        DEFAULT_INSTANCE = verticalOnboardingComponent;
        h.registerDefaultInstance(VerticalOnboardingComponent.class, verticalOnboardingComponent);
    }

    private VerticalOnboardingComponent() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static VerticalOnboardingComponent t(phc phcVar) {
        return (VerticalOnboardingComponent) h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\b\u0007\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0007\u0004\u0002\u0005\u0002\u0007Ȉ\bȈ", new Object[]{"title_", "delayMs_", "forceShow_", "showDurationMs_", "replayMs_", "accessibilityText_", "animationUrl_"});
        }
        if (iOrdinal == 3) {
            return new VerticalOnboardingComponent();
        }
        if (iOrdinal == 4) {
            return new gvi1(DEFAULT_INSTANCE, (byte) 18);
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
        synchronized (VerticalOnboardingComponent.class) {
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

    public final String o() {
        return this.animationUrl_;
    }

    public final long p() {
        return this.delayMs_;
    }

    public final boolean q() {
        return this.forceShow_;
    }

    public final long r() {
        return this.replayMs_;
    }

    public final long s() {
        return this.showDurationMs_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
