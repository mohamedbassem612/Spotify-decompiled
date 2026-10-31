package com.spotify.listeningactivity.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.zg7;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class AudienceUserResponse extends h implements v2j0 {
    private static final AudienceUserResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int USER_FIELD_NUMBER = 1;
    private int bitField0_;
    private AudienceUser user_;

    static {
        AudienceUserResponse audienceUserResponse = new AudienceUserResponse();
        DEFAULT_INSTANCE = audienceUserResponse;
        h.registerDefaultInstance(AudienceUserResponse.class, audienceUserResponse);
    }

    private AudienceUserResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "user_"});
        }
        if (iOrdinal == 3) {
            return new AudienceUserResponse();
        }
        if (iOrdinal == 4) {
            return new zg7(DEFAULT_INSTANCE, (byte) 19);
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
        synchronized (AudienceUserResponse.class) {
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

    public final boolean hasUser() {
        return (this.bitField0_ & 1) != 0;
    }

    public final AudienceUser n() {
        AudienceUser audienceUser = this.user_;
        return audienceUser == null ? AudienceUser.n() : audienceUser;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
