package com.spotify.widgets.widgetattributionimpl.events.proto;

import com.google.protobuf.h;
import p.bf40;
import p.f0u0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class PlaybackFromIntent extends h implements v2j0 {
    private static final PlaybackFromIntent DEFAULT_INSTANCE;
    public static final int INTERACTION_ID_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 3;
    public static final int PLAYING_CONTEXT_URI_FIELD_NUMBER = 2;
    public static final int PLAYING_ENTITY_URI_FIELD_NUMBER = 1;
    public static final int SELECTED_CONTEXT_URI_FIELD_NUMBER = 6;
    public static final int SELECTED_ENTITY_URI_FIELD_NUMBER = 5;
    public static final int WIDGET_TYPE_FIELD_NUMBER = 7;
    private int bitField0_;
    private String playingEntityUri_ = "";
    private String playingContextUri_ = "";
    private String playbackId_ = "";
    private String interactionId_ = "";
    private String selectedEntityUri_ = "";
    private String selectedContextUri_ = "";
    private String widgetType_ = "";

    static {
        PlaybackFromIntent playbackFromIntent = new PlaybackFromIntent();
        DEFAULT_INSTANCE = playbackFromIntent;
        h.registerDefaultInstance(PlaybackFromIntent.class, playbackFromIntent);
    }

    private PlaybackFromIntent() {
    }

    public static f0u0 n() {
        return (f0u0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"bitField0_", "playingEntityUri_", "playingContextUri_", "playbackId_", "interactionId_", "selectedEntityUri_", "selectedContextUri_", "widgetType_"});
        }
        if (iOrdinal == 3) {
            return new PlaybackFromIntent();
        }
        if (iOrdinal == 4) {
            return new f0u0(DEFAULT_INSTANCE);
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
        synchronized (PlaybackFromIntent.class) {
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
        this.bitField0_ |= 8;
        this.interactionId_ = str;
    }

    public final void p(String str) {
        this.bitField0_ |= 4;
        this.playbackId_ = str;
    }

    public final void q(String str) {
        this.bitField0_ |= 2;
        this.playingContextUri_ = str;
    }

    public final void r(String str) {
        this.bitField0_ |= 1;
        this.playingEntityUri_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.selectedContextUri_ = str;
    }

    public final void t(String str) {
        this.bitField0_ |= 64;
        this.widgetType_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
