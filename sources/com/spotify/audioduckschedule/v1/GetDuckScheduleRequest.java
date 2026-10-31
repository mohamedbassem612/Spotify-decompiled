package com.spotify.audioduckschedule.v1;

import com.google.protobuf.h;
import p.an40;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class GetDuckScheduleRequest extends h implements v2j0 {
    private static final GetDuckScheduleRequest DEFAULT_INSTANCE;
    public static final int EPISODE_URI_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER;
    private String episodeUri_ = "";

    static {
        GetDuckScheduleRequest getDuckScheduleRequest = new GetDuckScheduleRequest();
        DEFAULT_INSTANCE = getDuckScheduleRequest;
        h.registerDefaultInstance(GetDuckScheduleRequest.class, getDuckScheduleRequest);
    }

    private GetDuckScheduleRequest() {
    }

    public static an40 n() {
        return (an40) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"episodeUri_"});
        }
        if (iOrdinal == 3) {
            return new GetDuckScheduleRequest();
        }
        if (iOrdinal == 4) {
            return new an40(DEFAULT_INSTANCE);
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
        synchronized (GetDuckScheduleRequest.class) {
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

    public final void o(String str) {
        str.getClass();
        this.episodeUri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
