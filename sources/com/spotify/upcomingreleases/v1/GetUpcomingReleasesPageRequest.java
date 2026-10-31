package com.spotify.upcomingreleases.v1;

import com.google.protobuf.h;
import p.bf40;
import p.br40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class GetUpcomingReleasesPageRequest extends h implements v2j0 {
    private static final GetUpcomingReleasesPageRequest DEFAULT_INSTANCE;
    public static final int IS_HTTP_REQUEST_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private boolean isHttpRequest_;

    static {
        GetUpcomingReleasesPageRequest getUpcomingReleasesPageRequest = new GetUpcomingReleasesPageRequest();
        DEFAULT_INSTANCE = getUpcomingReleasesPageRequest;
        h.registerDefaultInstance(GetUpcomingReleasesPageRequest.class, getUpcomingReleasesPageRequest);
    }

    private GetUpcomingReleasesPageRequest() {
    }

    public static br40 n() {
        return (br40) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"isHttpRequest_"});
        }
        if (iOrdinal == 3) {
            return new GetUpcomingReleasesPageRequest();
        }
        if (iOrdinal == 4) {
            return new br40(DEFAULT_INSTANCE);
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
        synchronized (GetUpcomingReleasesPageRequest.class) {
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

    public final void o() {
        this.isHttpRequest_ = true;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
