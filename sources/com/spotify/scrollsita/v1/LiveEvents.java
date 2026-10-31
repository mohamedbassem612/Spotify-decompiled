package com.spotify.scrollsita.v1;

import com.google.protobuf.h;
import p.bf40;
import p.h290;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xnd0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class LiveEvents extends h implements v2j0 {
    public static final int ARTISTURI_FIELD_NUMBER = 2;
    public static final int CONCERT_URI_FIELD_NUMBER = 1;
    private static final LiveEvents DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private h290 concertUri_ = h.emptyProtobufList();
    private String artistUri_ = "";

    static {
        LiveEvents liveEvents = new LiveEvents();
        DEFAULT_INSTANCE = liveEvents;
        h.registerDefaultInstance(LiveEvents.class, liveEvents);
    }

    private LiveEvents() {
    }

    public static LiveEvents o() {
        return DEFAULT_INSTANCE;
    }

    public static xnd0 p() {
        return (xnd0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002Ȉ", new Object[]{"concertUri_", "artistUri_"});
        }
        if (iOrdinal == 3) {
            return new LiveEvents();
        }
        if (iOrdinal == 4) {
            return new xnd0(DEFAULT_INSTANCE);
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
        synchronized (LiveEvents.class) {
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
        return this.artistUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
