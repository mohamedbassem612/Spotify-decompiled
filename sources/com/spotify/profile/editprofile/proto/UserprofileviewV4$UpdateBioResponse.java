package com.spotify.profile.editprofile.proto;

import com.google.protobuf.h;
import p.b290;
import p.bf40;
import p.c290;
import p.d290;
import p.jf40;
import p.mka;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8i1;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class UserprofileviewV4$UpdateBioResponse extends h implements v2j0 {
    public static final int BIO_FIELD_NUMBER = 1;
    private static final UserprofileviewV4$UpdateBioResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RATE_LIMIT_FIELD_NUMBER = 3;
    public static final int VIOLATIONS_FIELD_NUMBER = 2;
    private static final c290 violations_converter_ = new mka((byte) 29);
    private UserprofileviewV4$Bio bio_;
    private int bitField0_;
    private UserprofileviewV4.RateLimitInfo rateLimit_;
    private int violationsMemoizedSerializedSize;
    private b290 violations_ = h.emptyIntList();

    static {
        UserprofileviewV4$UpdateBioResponse userprofileviewV4$UpdateBioResponse = new UserprofileviewV4$UpdateBioResponse();
        DEFAULT_INSTANCE = userprofileviewV4$UpdateBioResponse;
        h.registerDefaultInstance(UserprofileviewV4$UpdateBioResponse.class, userprofileviewV4$UpdateBioResponse);
    }

    private UserprofileviewV4$UpdateBioResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002,\u0003ဉ\u0001", new Object[]{"bitField0_", "bio_", "violations_", "rateLimit_"});
        }
        if (iOrdinal == 3) {
            return new UserprofileviewV4$UpdateBioResponse();
        }
        if (iOrdinal == 4) {
            return new s8i1(DEFAULT_INSTANCE, (byte) 17);
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
        synchronized (UserprofileviewV4$UpdateBioResponse.class) {
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

    public final UserprofileviewV4$Bio n() {
        UserprofileviewV4$Bio userprofileviewV4$Bio = this.bio_;
        return userprofileviewV4$Bio == null ? UserprofileviewV4$Bio.n() : userprofileviewV4$Bio;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final UserprofileviewV4.RateLimitInfo o() {
        UserprofileviewV4.RateLimitInfo rateLimitInfo = this.rateLimit_;
        return rateLimitInfo == null ? UserprofileviewV4.RateLimitInfo.n() : rateLimitInfo;
    }

    public final d290 p() {
        return new d290(this.violations_, violations_converter_);
    }

    public final boolean q() {
        return (this.bitField0_ & 2) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
