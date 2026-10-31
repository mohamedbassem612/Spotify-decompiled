package com.spotify.musicquizservice.v1;

import com.google.protobuf.h;
import p.bf40;
import p.ghc0;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ListChallengeTargetsResponse extends h implements v2j0 {
    private static final ListChallengeTargetsResponse DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private h290 username_ = h.emptyProtobufList();

    static {
        ListChallengeTargetsResponse listChallengeTargetsResponse = new ListChallengeTargetsResponse();
        DEFAULT_INSTANCE = listChallengeTargetsResponse;
        h.registerDefaultInstance(ListChallengeTargetsResponse.class, listChallengeTargetsResponse);
    }

    private ListChallengeTargetsResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"username_"});
        }
        if (iOrdinal == 3) {
            return new ListChallengeTargetsResponse();
        }
        if (iOrdinal == 4) {
            return new ghc0(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (ListChallengeTargetsResponse.class) {
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
        return this.username_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
