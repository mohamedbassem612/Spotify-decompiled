package com.spotify.teenlink.proto.view;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.yo30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class GetAgeConfigResponse extends h implements v2j0 {
    public static final int CHILD_MAX_AGE_FIELD_NUMBER = 1;
    private static final GetAgeConfigResponse DEFAULT_INSTANCE;
    public static final int OLDER_TEEN_MAX_AGE_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int YOUNGER_TEEN_MAX_AGE_FIELD_NUMBER = 2;
    private int childMaxAge_;
    private int olderTeenMaxAge_;
    private int youngerTeenMaxAge_;

    static {
        GetAgeConfigResponse getAgeConfigResponse = new GetAgeConfigResponse();
        DEFAULT_INSTANCE = getAgeConfigResponse;
        h.registerDefaultInstance(GetAgeConfigResponse.class, getAgeConfigResponse);
    }

    private GetAgeConfigResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"childMaxAge_", "youngerTeenMaxAge_", "olderTeenMaxAge_"});
        }
        if (iOrdinal == 3) {
            return new GetAgeConfigResponse();
        }
        if (iOrdinal == 4) {
            return new yo30(DEFAULT_INSTANCE, (byte) 27);
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
        synchronized (GetAgeConfigResponse.class) {
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
        return this.childMaxAge_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.olderTeenMaxAge_;
    }

    public final int p() {
        return this.youngerTeenMaxAge_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
