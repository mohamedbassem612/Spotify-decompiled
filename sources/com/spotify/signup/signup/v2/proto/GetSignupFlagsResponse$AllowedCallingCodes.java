package com.spotify.signup.signup.v2.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class GetSignupFlagsResponse$AllowedCallingCodes extends h implements v2j0 {
    public static final int CALLING_CODE_FIELD_NUMBER = 2;
    public static final int COUNTRY_CODE_FIELD_NUMBER = 1;
    private static final GetSignupFlagsResponse$AllowedCallingCodes DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private int callingCode_;
    private String countryCode_ = "";

    static {
        GetSignupFlagsResponse$AllowedCallingCodes getSignupFlagsResponse$AllowedCallingCodes = new GetSignupFlagsResponse$AllowedCallingCodes();
        DEFAULT_INSTANCE = getSignupFlagsResponse$AllowedCallingCodes;
        h.registerDefaultInstance(GetSignupFlagsResponse$AllowedCallingCodes.class, getSignupFlagsResponse$AllowedCallingCodes);
    }

    private GetSignupFlagsResponse$AllowedCallingCodes() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u000b", new Object[]{"countryCode_", "callingCode_"});
        }
        if (iOrdinal == 3) {
            return new GetSignupFlagsResponse$AllowedCallingCodes();
        }
        if (iOrdinal == 4) {
            return new a(DEFAULT_INSTANCE);
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
        synchronized (GetSignupFlagsResponse$AllowedCallingCodes.class) {
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

    public final int n() {
        return this.callingCode_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.countryCode_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
