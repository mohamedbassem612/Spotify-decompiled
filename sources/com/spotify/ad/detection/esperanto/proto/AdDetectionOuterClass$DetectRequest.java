package com.spotify.ad.detection.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.hn0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class AdDetectionOuterClass$DetectRequest extends h implements v2j0 {
    private static final AdDetectionOuterClass$DetectRequest DEFAULT_INSTANCE;
    public static final int EPISODE_URI_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 3;
    private String episodeUri_ = "";
    private String playbackId_ = "";

    static {
        AdDetectionOuterClass$DetectRequest adDetectionOuterClass$DetectRequest = new AdDetectionOuterClass$DetectRequest();
        DEFAULT_INSTANCE = adDetectionOuterClass$DetectRequest;
        h.registerDefaultInstance(AdDetectionOuterClass$DetectRequest.class, adDetectionOuterClass$DetectRequest);
    }

    private AdDetectionOuterClass$DetectRequest() {
    }

    public static hn0 n() {
        return (hn0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003Ȉ", new Object[]{"episodeUri_", "playbackId_"});
        }
        if (iOrdinal == 3) {
            return new AdDetectionOuterClass$DetectRequest();
        }
        if (iOrdinal == 4) {
            return new hn0(DEFAULT_INSTANCE);
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
        synchronized (AdDetectionOuterClass$DetectRequest.class) {
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

    public final void p(String str) {
        str.getClass();
        this.playbackId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
