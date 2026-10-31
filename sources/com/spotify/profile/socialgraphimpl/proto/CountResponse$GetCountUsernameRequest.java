package com.spotify.profile.socialgraphimpl.proto;

import com.google.protobuf.h;
import p.bf40;
import p.h4m;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class CountResponse$GetCountUsernameRequest extends h implements v2j0 {
    private static final CountResponse$GetCountUsernameRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int RELATION_TYPE_FIELD_NUMBER = 2;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private int relationType_;
    private String username_ = "";

    static {
        CountResponse$GetCountUsernameRequest countResponse$GetCountUsernameRequest = new CountResponse$GetCountUsernameRequest();
        DEFAULT_INSTANCE = countResponse$GetCountUsernameRequest;
        h.registerDefaultInstance(CountResponse$GetCountUsernameRequest.class, countResponse$GetCountUsernameRequest);
    }

    private CountResponse$GetCountUsernameRequest() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"username_", "relationType_"});
        }
        if (iOrdinal == 3) {
            return new CountResponse$GetCountUsernameRequest();
        }
        if (iOrdinal == 4) {
            return new h4m(DEFAULT_INSTANCE, (byte) 26);
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
        synchronized (CountResponse$GetCountUsernameRequest.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
