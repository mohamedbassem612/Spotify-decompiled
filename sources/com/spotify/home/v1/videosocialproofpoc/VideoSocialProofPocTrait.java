package com.spotify.home.v1.videosocialproofpoc;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.ofj1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class VideoSocialProofPocTrait extends h implements v2j0 {
    private static final VideoSocialProofPocTrait DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int STARTS_COUNT_FIELD_NUMBER = 2;
    private long startsCount_;

    static {
        VideoSocialProofPocTrait videoSocialProofPocTrait = new VideoSocialProofPocTrait();
        DEFAULT_INSTANCE = videoSocialProofPocTrait;
        h.registerDefaultInstance(VideoSocialProofPocTrait.class, videoSocialProofPocTrait);
    }

    private VideoSocialProofPocTrait() {
    }

    public static VideoSocialProofPocTrait o(byte[] bArr) {
        return (VideoSocialProofPocTrait) h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0002", new Object[]{"startsCount_"});
        }
        if (iOrdinal == 3) {
            return new VideoSocialProofPocTrait();
        }
        if (iOrdinal == 4) {
            return new ofj1(DEFAULT_INSTANCE, (byte) 17);
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
        synchronized (VideoSocialProofPocTrait.class) {
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

    public final long n() {
        return this.startsCount_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
