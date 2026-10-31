package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.hk41;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SceneTemplate$Video extends com.google.protobuf.h implements v2j0 {
    private static final SceneTemplate$Video DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int VIDEO_FIELD_NUMBER = 1;
    private int bitField0_;
    private VideoConfiguration video_;

    static {
        SceneTemplate$Video sceneTemplate$Video = new SceneTemplate$Video();
        DEFAULT_INSTANCE = sceneTemplate$Video;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$Video.class, sceneTemplate$Video);
    }

    private SceneTemplate$Video() {
    }

    public static SceneTemplate$Video n() {
        return DEFAULT_INSTANCE;
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "video_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$Video();
        }
        if (iOrdinal == 4) {
            return new hk41(DEFAULT_INSTANCE, (byte) 12);
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
        synchronized (SceneTemplate$Video.class) {
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

    public final VideoConfiguration o() {
        VideoConfiguration videoConfiguration = this.video_;
        return videoConfiguration == null ? VideoConfiguration.n() : videoConfiguration;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
