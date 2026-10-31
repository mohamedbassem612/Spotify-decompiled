package com.spotify.user_prompts.v1;

import com.google.protobuf.h;
import p.bf40;
import p.eub1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sp40;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class GetStatusResponse extends h implements v2j0 {
    private static final GetStatusResponse DEFAULT_INSTANCE;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private String navigationUri_ = "";
    private int status_;

    static {
        GetStatusResponse getStatusResponse = new GetStatusResponse();
        DEFAULT_INSTANCE = getStatusResponse;
        h.registerDefaultInstance(GetStatusResponse.class, getStatusResponse);
    }

    private GetStatusResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"status_", "navigationUri_"});
        }
        if (iOrdinal == 3) {
            return new GetStatusResponse();
        }
        if (iOrdinal == 4) {
            return new sp40(DEFAULT_INSTANCE, (byte) 13);
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
        synchronized (GetStatusResponse.class) {
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

    public final String n() {
        return this.navigationUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final eub1 o() {
        eub1 eub1Var;
        int i = this.status_;
        if (i == 0) {
            eub1Var = eub1.UNSPECIFIED;
        } else if (i == 1) {
            eub1Var = eub1.QUEUED;
        } else if (i == 2) {
            eub1Var = eub1.PROCESSING;
        } else if (i == 3) {
            eub1Var = eub1.SUCCESS;
        } else if (i != 4) {
            eub1Var = i != 5 ? null : eub1.ERROR;
        } else {
            eub1Var = eub1.TIMEOUT;
        }
        return eub1Var == null ? eub1.UNRECOGNIZED : eub1Var;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
