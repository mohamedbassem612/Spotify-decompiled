package com.spotify.lyrics.complianceitgc.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.rpf0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class LyricsSnippetViewEvent extends h implements v2j0 {
    private static final LyricsSnippetViewEvent DEFAULT_INSTANCE;
    public static final int LYRICS_FORMAT_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 3;
    public static final int PROVIDER_FIELD_NUMBER = 4;
    public static final int PROVIDER_LYRICS_ID_FIELD_NUMBER = 5;
    public static final int SYNC_TYPE_FIELD_NUMBER = 6;
    public static final int TRACK_URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private String trackUri_ = "";
    private String lyricsFormat_ = "";
    private String playbackId_ = "";
    private String provider_ = "";
    private String providerLyricsId_ = "";
    private String syncType_ = "";

    static {
        LyricsSnippetViewEvent lyricsSnippetViewEvent = new LyricsSnippetViewEvent();
        DEFAULT_INSTANCE = lyricsSnippetViewEvent;
        h.registerDefaultInstance(LyricsSnippetViewEvent.class, lyricsSnippetViewEvent);
    }

    private LyricsSnippetViewEvent() {
    }

    public static rpf0 n() {
        return (rpf0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"bitField0_", "trackUri_", "lyricsFormat_", "playbackId_", "provider_", "providerLyricsId_", "syncType_"});
        }
        if (iOrdinal == 3) {
            return new LyricsSnippetViewEvent();
        }
        if (iOrdinal == 4) {
            return new rpf0(DEFAULT_INSTANCE);
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
        synchronized (LyricsSnippetViewEvent.class) {
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
        this.bitField0_ |= 2;
        this.lyricsFormat_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.playbackId_ = str;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.provider_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.providerLyricsId_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.syncType_ = str;
    }

    public final void t(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.trackUri_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
