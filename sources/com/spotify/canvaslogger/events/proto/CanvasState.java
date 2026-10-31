package com.spotify.canvaslogger.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.fkd;
import p.hhc;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class CanvasState extends h implements v2j0 {
    public static final int APP_FOCUS_STATE_FIELD_NUMBER = 6;
    public static final int AUDIO_STATE_FIELD_NUMBER = 7;
    public static final int CANVAS_ID_FIELD_NUMBER = 1;
    private static final CanvasState DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 2;
    public static final int LOAD_STATE_FIELD_NUMBER = 5;
    public static final int PAGE_SOURCE_FIELD_NUMBER = 10;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 3;
    public static final int TRACK_TIME_FIELD_NUMBER = 4;
    public static final int VISUAL_STATE_FIELD_NUMBER = 8;
    private int bitField0_;
    private double trackTime_;
    private String canvasId_ = "";
    private String entityUri_ = "";
    private phc playbackId_ = phc.b;
    private String loadState_ = "";
    private String appFocusState_ = "";
    private String audioState_ = "";
    private String visualState_ = "";
    private String pageSource_ = "";

    static {
        CanvasState canvasState = new CanvasState();
        DEFAULT_INSTANCE = canvasState;
        h.registerDefaultInstance(CanvasState.class, canvasState);
    }

    private CanvasState() {
    }

    public static fkd n() {
        return (fkd) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004က\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\nဈ\b", new Object[]{"bitField0_", "canvasId_", "entityUri_", "playbackId_", "trackTime_", "loadState_", "appFocusState_", "audioState_", "visualState_", "pageSource_"});
        }
        if (iOrdinal == 3) {
            return new CanvasState();
        }
        if (iOrdinal == 4) {
            return new fkd(DEFAULT_INSTANCE);
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
        synchronized (CanvasState.class) {
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

    public final void o() {
        this.bitField0_ |= 32;
        this.appFocusState_ = "foreground";
    }

    public final void p(String str) {
        this.bitField0_ |= 64;
        this.audioState_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 1;
        this.canvasId_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.entityUri_ = str;
    }

    public final void s(String str) {
        this.bitField0_ |= 16;
        this.loadState_ = str;
    }

    public final void t() {
        this.bitField0_ |= 256;
        this.pageSource_ = "spotify:app:canvas";
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(hhc hhcVar) {
        this.bitField0_ |= 4;
        this.playbackId_ = hhcVar;
    }

    public final void v(double d) {
        this.bitField0_ |= 8;
        this.trackTime_ = d;
    }

    public final void w() {
        this.bitField0_ |= 128;
        this.visualState_ = "visible_full";
    }
}
