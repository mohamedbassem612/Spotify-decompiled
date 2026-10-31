package com.spotify.showcase.v2;

import com.google.protobuf.h;
import p.bf40;
import p.ie81;
import p.jf40;
import p.jjn;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class CreativeAdMetadata extends h implements v2j0 {
    public static final int COMPANION_MUSIC_VIDEO_FIELD_NUMBER = 3;
    public static final int COMPANION_VIDEO_FIELD_NUMBER = 2;
    private static final CreativeAdMetadata DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private CompanionMusicVideo companionMusicVideo_;
    private CompanionVideo companionVideo_;
    private int type_;

    static {
        CreativeAdMetadata creativeAdMetadata = new CreativeAdMetadata();
        DEFAULT_INSTANCE = creativeAdMetadata;
        h.registerDefaultInstance(CreativeAdMetadata.class, creativeAdMetadata);
    }

    private CreativeAdMetadata() {
    }

    public static CreativeAdMetadata p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "type_", "companionVideo_", "companionMusicVideo_"});
        }
        if (iOrdinal == 3) {
            return new CreativeAdMetadata();
        }
        if (iOrdinal == 4) {
            return new jjn(DEFAULT_INSTANCE, (byte) 21);
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
        synchronized (CreativeAdMetadata.class) {
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

    public final CompanionMusicVideo n() {
        CompanionMusicVideo companionMusicVideo = this.companionMusicVideo_;
        return companionMusicVideo == null ? CompanionMusicVideo.o() : companionMusicVideo;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final CompanionVideo o() {
        CompanionVideo companionVideo = this.companionVideo_;
        return companionVideo == null ? CompanionVideo.n() : companionVideo;
    }

    public final ie81 q() {
        ie81 ie81Var;
        int i = this.type_;
        if (i == 0) {
            ie81Var = ie81.UNSET;
        } else if (i == 1) {
            ie81Var = ie81.SHOWCASE_DEFAULT;
        } else if (i == 2) {
            ie81Var = ie81.SHOWCASE_VIDEO;
        } else if (i != 3) {
            ie81Var = i != 4 ? null : ie81.SHOWCASE_MUSIC_VIDEO;
        } else {
            ie81Var = ie81.SHOWCASE_PRERELEASE;
        }
        return ie81Var == null ? ie81.UNRECOGNIZED : ie81Var;
    }

    public final boolean r() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean s() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
