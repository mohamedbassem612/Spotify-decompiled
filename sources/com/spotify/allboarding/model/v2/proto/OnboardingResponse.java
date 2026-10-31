package com.spotify.allboarding.model.v2.proto;

import com.google.protobuf.h;
import p.bf40;
import p.djp0;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class OnboardingResponse extends h implements v2j0 {
    private static final OnboardingResponse DEFAULT_INSTANCE;
    public static final int EXPERIMENT_PROPERTIES_FIELD_NUMBER = 5;
    public static final int NEXT_FIELD_NUMBER = 3;
    public static final int NEXT_SECONDARY_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int SCREEN_FIELD_NUMBER = 2;
    public static final int STEP_FIELD_NUMBER = 1;
    private int bitField0_;
    private Step nextSecondary_;
    private Step next_;
    private Screen screen_;
    private String step_ = "";
    private h290 experimentProperties_ = h.emptyProtobufList();

    static {
        OnboardingResponse onboardingResponse = new OnboardingResponse();
        DEFAULT_INSTANCE = onboardingResponse;
        h.registerDefaultInstance(OnboardingResponse.class, onboardingResponse);
    }

    private OnboardingResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005\u001b", new Object[]{"bitField0_", "step_", "screen_", "next_", "nextSecondary_", "experimentProperties_", ExperimentProperty.class});
        }
        if (iOrdinal == 3) {
            return new OnboardingResponse();
        }
        if (iOrdinal == 4) {
            return new djp0(DEFAULT_INSTANCE, (byte) 22);
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
        synchronized (OnboardingResponse.class) {
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

    public final h290 n() {
        return this.experimentProperties_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Step o() {
        Step step = this.next_;
        return step == null ? Step.o() : step;
    }

    public final Step p() {
        Step step = this.nextSecondary_;
        return step == null ? Step.o() : step;
    }

    public final Screen q() {
        Screen screen = this.screen_;
        return screen == null ? Screen.q() : screen;
    }

    public final String r() {
        return this.step_;
    }

    public final boolean s() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean t() {
        return (this.bitField0_ & 4) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
