package com.spotify.profile.profile.proto;

import com.google.protobuf.Duration;
import com.google.protobuf.Timestamp;
import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vzw0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ProfilemodelRequest$SocialHandleInfo extends h implements v2j0 {
    private static final ProfilemodelRequest$SocialHandleInfo DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RATE_LIMIT_MAX_CHANGES_FIELD_NUMBER = 2;
    public static final int RATE_LIMIT_WINDOW_FIELD_NUMBER = 3;
    public static final int RESTRICTED_UNTIL_FIELD_NUMBER = 1;
    private int bitField0_;
    private int rateLimitMaxChanges_;
    private Duration rateLimitWindow_;
    private Timestamp restrictedUntil_;

    static {
        ProfilemodelRequest$SocialHandleInfo profilemodelRequest$SocialHandleInfo = new ProfilemodelRequest$SocialHandleInfo();
        DEFAULT_INSTANCE = profilemodelRequest$SocialHandleInfo;
        h.registerDefaultInstance(ProfilemodelRequest$SocialHandleInfo.class, profilemodelRequest$SocialHandleInfo);
    }

    private ProfilemodelRequest$SocialHandleInfo() {
    }

    public static ProfilemodelRequest$SocialHandleInfo n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004\u0003ဉ\u0001", new Object[]{"bitField0_", "restrictedUntil_", "rateLimitMaxChanges_", "rateLimitWindow_"});
        }
        if (iOrdinal == 3) {
            return new ProfilemodelRequest$SocialHandleInfo();
        }
        if (iOrdinal == 4) {
            return new vzw0(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (ProfilemodelRequest$SocialHandleInfo.class) {
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

    public final int o() {
        return this.rateLimitMaxChanges_;
    }

    public final Duration p() {
        Duration duration = this.rateLimitWindow_;
        return duration == null ? Duration.n() : duration;
    }

    public final Timestamp q() {
        Timestamp timestamp = this.restrictedUntil_;
        return timestamp == null ? Timestamp.o() : timestamp;
    }

    public final boolean r() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean s() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
