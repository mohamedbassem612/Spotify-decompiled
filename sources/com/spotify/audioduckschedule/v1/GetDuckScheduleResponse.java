package com.spotify.audioduckschedule.v1;

import com.google.protobuf.h;
import p.bf40;
import p.em40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class GetDuckScheduleResponse extends h implements v2j0 {
    public static final int AUDIO_DURATION_SECONDS_FIELD_NUMBER = 3;
    public static final int AUDIO_URI_FIELD_NUMBER = 2;
    private static final GetDuckScheduleResponse DEFAULT_INSTANCE;
    public static final int EPISODE_URI_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SEGMENTS_FIELD_NUMBER = 4;
    private double audioDurationSeconds_;
    private String episodeUri_ = "";
    private String audioUri_ = "";
    private h290 segments_ = h.emptyProtobufList();

    static {
        GetDuckScheduleResponse getDuckScheduleResponse = new GetDuckScheduleResponse();
        DEFAULT_INSTANCE = getDuckScheduleResponse;
        h.registerDefaultInstance(GetDuckScheduleResponse.class, getDuckScheduleResponse);
    }

    private GetDuckScheduleResponse() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0000\u0004\u001b", new Object[]{"episodeUri_", "audioUri_", "audioDurationSeconds_", "segments_", DuckSegment.class});
        }
        if (iOrdinal == 3) {
            return new GetDuckScheduleResponse();
        }
        if (iOrdinal == 4) {
            return new em40(DEFAULT_INSTANCE, (byte) 10);
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
        synchronized (GetDuckScheduleResponse.class) {
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
        return this.segments_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
