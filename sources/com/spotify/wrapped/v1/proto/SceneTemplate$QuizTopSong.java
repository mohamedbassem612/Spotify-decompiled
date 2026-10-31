package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.hk41;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SceneTemplate$QuizTopSong extends com.google.protobuf.h implements v2j0 {
    public static final int AUDIO_OVERRIDE_FIELD_NUMBER = 2;
    public static final int CONTENT_FIELD_NUMBER = 1;
    private static final SceneTemplate$QuizTopSong DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private AudioPreview audioOverride_;
    private int bitField0_;
    private SceneTemplate$VideoEntity content_;

    static {
        SceneTemplate$QuizTopSong sceneTemplate$QuizTopSong = new SceneTemplate$QuizTopSong();
        DEFAULT_INSTANCE = sceneTemplate$QuizTopSong;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$QuizTopSong.class, sceneTemplate$QuizTopSong);
    }

    private SceneTemplate$QuizTopSong() {
    }

    public static SceneTemplate$QuizTopSong p() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "content_", "audioOverride_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$QuizTopSong();
        }
        if (iOrdinal == 4) {
            return new hk41(DEFAULT_INSTANCE, (byte) 1);
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
        synchronized (SceneTemplate$QuizTopSong.class) {
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

    public final AudioPreview n() {
        AudioPreview audioPreview = this.audioOverride_;
        return audioPreview == null ? AudioPreview.p() : audioPreview;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final SceneTemplate$VideoEntity o() {
        SceneTemplate$VideoEntity sceneTemplate$VideoEntity = this.content_;
        return sceneTemplate$VideoEntity == null ? SceneTemplate$VideoEntity.o() : sceneTemplate$VideoEntity;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
