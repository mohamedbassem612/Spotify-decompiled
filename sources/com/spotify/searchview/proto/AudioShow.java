package com.spotify.searchview.proto;

import p.bf40;
import p.hw7;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class AudioShow extends com.google.protobuf.h implements v2j0 {
    public static final int CATEGORY_FIELD_NUMBER = 4;
    private static final AudioShow DEFAULT_INSTANCE;
    public static final int MUSIC_AND_TALK_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PUBLISHER_NAME_FIELD_NUMBER = 1;
    public static final int VERIFIED_FIELD_NUMBER = 6;
    private boolean musicAndTalk_;
    private boolean verified_;
    private String publisherName_ = "";
    private String category_ = "";

    static {
        AudioShow audioShow = new AudioShow();
        DEFAULT_INSTANCE = audioShow;
        com.google.protobuf.h.registerDefaultInstance(AudioShow.class, audioShow);
    }

    private AudioShow() {
    }

    public static AudioShow o() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0006\u0004\u0000\u0000\u0000\u0001Ȉ\u0003\u0007\u0004Ȉ\u0006\u0007", new Object[]{"publisherName_", "musicAndTalk_", "category_", "verified_"});
        }
        if (iOrdinal == 3) {
            return new AudioShow();
        }
        if (iOrdinal == 4) {
            return new hw7(DEFAULT_INSTANCE, (byte) 9);
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
        synchronized (AudioShow.class) {
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
        return this.category_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String p() {
        return this.publisherName_;
    }

    public final boolean q() {
        return this.verified_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
