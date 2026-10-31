package com.spotify.familyverify.v1;

import com.google.protobuf.h;
import p.bf40;
import p.cp40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class GetQrCodeVerificationOnboardingRequest extends h implements v2j0 {
    private static final GetQrCodeVerificationOnboardingRequest DEFAULT_INSTANCE;
    public static final int FILLER_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int V2_ENABLED_FIELD_NUMBER = 2;
    private String filler_ = "";
    private boolean v2Enabled_;

    static {
        GetQrCodeVerificationOnboardingRequest getQrCodeVerificationOnboardingRequest = new GetQrCodeVerificationOnboardingRequest();
        DEFAULT_INSTANCE = getQrCodeVerificationOnboardingRequest;
        h.registerDefaultInstance(GetQrCodeVerificationOnboardingRequest.class, getQrCodeVerificationOnboardingRequest);
    }

    private GetQrCodeVerificationOnboardingRequest() {
    }

    public static cp40 o() {
        return DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"filler_", "v2Enabled_"});
        }
        if (iOrdinal == 3) {
            return new GetQrCodeVerificationOnboardingRequest();
        }
        if (iOrdinal == 4) {
            return new cp40();
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
        synchronized (GetQrCodeVerificationOnboardingRequest.class) {
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

    public final void p() {
        this.filler_ = " ";
    }

    public final void q(boolean z) {
        this.v2Enabled_ = z;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
