package com.spotify.musicvideos.musicvideowidget.proto.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.mwf1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class TrackRequest extends h implements v2j0 {
    public static final int ARTIST_URI_FIELD_NUMBER = 2;
    private static final TrackRequest DEFAULT_INSTANCE;
    public static final int IS_EXPLICIT_ENABLED_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int TRACK_URI_FIELD_NUMBER = 1;
    public static final int VIDEO_URI_FIELD_NUMBER = 3;
    private boolean isExplicitEnabled_;
    private String trackUri_ = "";
    private String artistUri_ = "";
    private String videoUri_ = "";

    static {
        TrackRequest trackRequest = new TrackRequest();
        DEFAULT_INSTANCE = trackRequest;
        h.registerDefaultInstance(TrackRequest.class, trackRequest);
    }

    private TrackRequest() {
    }

    public static mwf1 n() {
        return (mwf1) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0007", new Object[]{"trackUri_", "artistUri_", "videoUri_", "isExplicitEnabled_"});
        }
        if (iOrdinal == 3) {
            return new TrackRequest();
        }
        if (iOrdinal == 4) {
            return new mwf1(DEFAULT_INSTANCE);
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
        synchronized (TrackRequest.class) {
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
        this.artistUri_ = str;
    }

    public final void p(boolean z) {
        this.isExplicitEnabled_ = z;
    }

    public final void q(String str) {
        this.trackUri_ = str;
    }

    public final void r(String str) {
        this.videoUri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
