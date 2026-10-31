package com.spotify.ad.detection.esperanto.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.nn0;
import p.on0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class AdDetectionOuterClass$SubscribeUserToCanonicalTimestampRequest extends h implements v2j0 {
    private static final AdDetectionOuterClass$SubscribeUserToCanonicalTimestampRequest DEFAULT_INSTANCE;
    public static final int EPISODE_URI_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 3;
    public static final int TIMESTAMP_TYPE_FIELD_NUMBER = 4;
    public static final int USER_TIMESTAMP_MS_FIELD_NUMBER = 2;
    private String episodeUri_ = "";
    private String playbackId_ = "";
    private int timestampType_;
    private int userTimestampMs_;

    static {
        AdDetectionOuterClass$SubscribeUserToCanonicalTimestampRequest adDetectionOuterClass$SubscribeUserToCanonicalTimestampRequest = new AdDetectionOuterClass$SubscribeUserToCanonicalTimestampRequest();
        DEFAULT_INSTANCE = adDetectionOuterClass$SubscribeUserToCanonicalTimestampRequest;
        h.registerDefaultInstance(AdDetectionOuterClass$SubscribeUserToCanonicalTimestampRequest.class, adDetectionOuterClass$SubscribeUserToCanonicalTimestampRequest);
    }

    private AdDetectionOuterClass$SubscribeUserToCanonicalTimestampRequest() {
    }

    public static nn0 n() {
        return (nn0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004\f", new Object[]{"episodeUri_", "userTimestampMs_", "playbackId_", "timestampType_"});
        }
        if (iOrdinal == 3) {
            return new AdDetectionOuterClass$SubscribeUserToCanonicalTimestampRequest();
        }
        if (iOrdinal == 4) {
            return new nn0(DEFAULT_INSTANCE);
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
        synchronized (AdDetectionOuterClass$SubscribeUserToCanonicalTimestampRequest.class) {
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
        this.episodeUri_ = str;
    }

    public final void p(String str) {
        this.playbackId_ = str;
    }

    public final void q() {
        this.timestampType_ = on0.c.getNumber();
    }

    public final void r(int i) {
        this.userTimestampMs_ = i;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
