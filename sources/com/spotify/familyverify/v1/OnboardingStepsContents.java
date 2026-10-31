package com.spotify.familyverify.v1;

import com.google.protobuf.h;
import p.bf40;
import p.djp0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class OnboardingStepsContents extends h implements v2j0 {
    private static final OnboardingStepsContents DEFAULT_INSTANCE;
    public static final int FOOTER_FIELD_NUMBER = 4;
    public static final int GET_MANAGER_STEP_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int SCAN_CODE_INSTRUCTIONS_STEP_FIELD_NUMBER = 3;
    private int bitField0_;
    private SupportLink footer_;
    private GetManagerStepContents getManagerStep_;
    private ScanCodeInstructionsStepContents scanCodeInstructionsStep_;

    static {
        OnboardingStepsContents onboardingStepsContents = new OnboardingStepsContents();
        DEFAULT_INSTANCE = onboardingStepsContents;
        h.registerDefaultInstance(OnboardingStepsContents.class, onboardingStepsContents);
    }

    private OnboardingStepsContents() {
    }

    public static OnboardingStepsContents n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"bitField0_", "getManagerStep_", "scanCodeInstructionsStep_", "footer_"});
        }
        if (iOrdinal == 3) {
            return new OnboardingStepsContents();
        }
        if (iOrdinal == 4) {
            return new djp0(DEFAULT_INSTANCE, (byte) 23);
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
        synchronized (OnboardingStepsContents.class) {
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

    public final SupportLink o() {
        SupportLink supportLink = this.footer_;
        return supportLink == null ? SupportLink.n() : supportLink;
    }

    public final GetManagerStepContents p() {
        GetManagerStepContents getManagerStepContents = this.getManagerStep_;
        return getManagerStepContents == null ? GetManagerStepContents.o() : getManagerStepContents;
    }

    public final ScanCodeInstructionsStepContents q() {
        ScanCodeInstructionsStepContents scanCodeInstructionsStepContents = this.scanCodeInstructionsStep_;
        return scanCodeInstructionsStepContents == null ? ScanCodeInstructionsStepContents.o() : scanCodeInstructionsStepContents;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
