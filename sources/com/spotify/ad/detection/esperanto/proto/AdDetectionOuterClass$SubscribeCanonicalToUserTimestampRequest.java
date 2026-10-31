package com.spotify.ad.detection.esperanto.proto;

import com.google.protobuf.h;
import java.util.ArrayList;
import p.b290;
import p.bf40;
import p.i9;
import p.jf40;
import p.ln0;
import p.on0;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.s8;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class AdDetectionOuterClass$SubscribeCanonicalToUserTimestampRequest extends h implements v2j0 {
    public static final int CANONICAL_TIMESTAMPS_MS_FIELD_NUMBER = 2;
    private static final AdDetectionOuterClass$SubscribeCanonicalToUserTimestampRequest DEFAULT_INSTANCE;
    public static final int EPISODE_URI_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 3;
    public static final int TIMESTAMP_TYPE_FIELD_NUMBER = 4;
    private int timestampType_;
    private int canonicalTimestampsMsMemoizedSerializedSize = -1;
    private String episodeUri_ = "";
    private b290 canonicalTimestampsMs_ = h.emptyIntList();
    private String playbackId_ = "";

    static {
        AdDetectionOuterClass$SubscribeCanonicalToUserTimestampRequest adDetectionOuterClass$SubscribeCanonicalToUserTimestampRequest = new AdDetectionOuterClass$SubscribeCanonicalToUserTimestampRequest();
        DEFAULT_INSTANCE = adDetectionOuterClass$SubscribeCanonicalToUserTimestampRequest;
        h.registerDefaultInstance(AdDetectionOuterClass$SubscribeCanonicalToUserTimestampRequest.class, adDetectionOuterClass$SubscribeCanonicalToUserTimestampRequest);
    }

    private AdDetectionOuterClass$SubscribeCanonicalToUserTimestampRequest() {
    }

    public static ln0 o() {
        return (ln0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002'\u0003Ȉ\u0004\f", new Object[]{"episodeUri_", "canonicalTimestampsMs_", "playbackId_", "timestampType_"});
        }
        if (iOrdinal == 3) {
            return new AdDetectionOuterClass$SubscribeCanonicalToUserTimestampRequest();
        }
        if (iOrdinal == 4) {
            return new ln0(DEFAULT_INSTANCE);
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
        synchronized (AdDetectionOuterClass$SubscribeCanonicalToUserTimestampRequest.class) {
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

    public final void n(ArrayList arrayList) {
        b290 b290VarMutableCopy = this.canonicalTimestampsMs_;
        if (!((i9) b290VarMutableCopy).a) {
            b290VarMutableCopy = h.mutableCopy(b290VarMutableCopy);
            this.canonicalTimestampsMs_ = b290VarMutableCopy;
        }
        s8.addAll(arrayList, b290VarMutableCopy);
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final void p(String str) {
        str.getClass();
        this.episodeUri_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.playbackId_ = str;
    }

    public final void r(on0 on0Var) {
        this.timestampType_ = on0Var.getNumber();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
