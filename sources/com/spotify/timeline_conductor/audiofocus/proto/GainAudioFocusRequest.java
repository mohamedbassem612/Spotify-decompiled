package com.spotify.timeline_conductor.audiofocus.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.sy30;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class GainAudioFocusRequest extends h implements v2j0 {
    public static final int AUTOMATIC_RESUME_ALLOWED_FIELD_NUMBER = 1;
    private static final GainAudioFocusRequest DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private boolean automaticResumeAllowed_;

    static {
        GainAudioFocusRequest gainAudioFocusRequest = new GainAudioFocusRequest();
        DEFAULT_INSTANCE = gainAudioFocusRequest;
        h.registerDefaultInstance(GainAudioFocusRequest.class, gainAudioFocusRequest);
    }

    private GainAudioFocusRequest() {
    }

    public static sy30 n() {
        return (sy30) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"automaticResumeAllowed_"});
        }
        if (iOrdinal == 3) {
            return new GainAudioFocusRequest();
        }
        if (iOrdinal == 4) {
            return new sy30(DEFAULT_INSTANCE);
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
        synchronized (GainAudioFocusRequest.class) {
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

    public final void o(boolean z) {
        this.automaticResumeAllowed_ = z;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
