package com.spotify.kidsview.v2.proto;

import com.google.protobuf.h;
import p.bf40;
import p.fjj1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class VideoControls extends h implements v2j0 {
    public static final int ALLOW_CANVAS_FIELD_NUMBER = 2;
    public static final int ALLOW_MUSIC_VIDEO_FIELD_NUMBER = 1;
    public static final int ALLOW_OTHER_VIDEO_FIELD_NUMBER = 3;
    private static final VideoControls DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private boolean allowCanvas_;
    private boolean allowMusicVideo_;
    private boolean allowOtherVideo_;
    private int bitField0_;

    static {
        VideoControls videoControls = new VideoControls();
        DEFAULT_INSTANCE = videoControls;
        h.registerDefaultInstance(VideoControls.class, videoControls);
    }

    private VideoControls() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static VideoControls q() {
        return DEFAULT_INSTANCE;
    }

    public static fjj1 u() {
        return (fjj1) DEFAULT_INSTANCE.createBuilder();
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "allowMusicVideo_", "allowCanvas_", "allowOtherVideo_"});
        }
        if (iOrdinal == 3) {
            return new VideoControls();
        }
        if (iOrdinal == 4) {
            return new fjj1(DEFAULT_INSTANCE);
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
        synchronized (VideoControls.class) {
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

    public final boolean n() {
        return this.allowCanvas_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean o() {
        return this.allowMusicVideo_;
    }

    public final boolean p() {
        return this.allowOtherVideo_;
    }

    public final boolean r() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean s() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean t() {
        return (this.bitField0_ & 4) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void v(boolean z) {
        this.bitField0_ |= 2;
        this.allowCanvas_ = z;
    }

    public final void w(boolean z) {
        this.bitField0_ |= 1;
        this.allowMusicVideo_ = z;
    }

    public final void x(boolean z) {
        this.bitField0_ |= 4;
        this.allowOtherVideo_ = z;
    }
}
