package com.spotify.lyrics.complianceitgc.proto;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xsj0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class MinimumLyricsCharactersSeen extends h implements v2j0 {
    private static final MinimumLyricsCharactersSeen DEFAULT_INSTANCE;
    public static final int IS_OFFLINE_FIELD_NUMBER = 8;
    public static final int IS_SNIPPET_FIELD_NUMBER = 7;
    public static final int IS_TRANSLATION_DISPLAYED_FIELD_NUMBER = 9;
    public static final int LYRICS_FORMAT_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 3;
    public static final int PROVIDER_FIELD_NUMBER = 4;
    public static final int PROVIDER_LYRICS_ID_FIELD_NUMBER = 5;
    public static final int SYNC_TYPE_FIELD_NUMBER = 6;
    public static final int TRACK_URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean isOffline_;
    private boolean isSnippet_;
    private boolean isTranslationDisplayed_;
    private String trackUri_ = "";
    private String lyricsFormat_ = "";
    private String playbackId_ = "";
    private String provider_ = "";
    private String providerLyricsId_ = "";
    private String syncType_ = "";

    static {
        MinimumLyricsCharactersSeen minimumLyricsCharactersSeen = new MinimumLyricsCharactersSeen();
        DEFAULT_INSTANCE = minimumLyricsCharactersSeen;
        h.registerDefaultInstance(MinimumLyricsCharactersSeen.class, minimumLyricsCharactersSeen);
    }

    private MinimumLyricsCharactersSeen() {
    }

    public static xsj0 n() {
        return (xsj0) DEFAULT_INSTANCE.createBuilder();
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b", new Object[]{"bitField0_", "trackUri_", "lyricsFormat_", "playbackId_", "provider_", "providerLyricsId_", "syncType_", "isSnippet_", "isOffline_", "isTranslationDisplayed_"});
        }
        if (iOrdinal == 3) {
            return new MinimumLyricsCharactersSeen();
        }
        if (iOrdinal == 4) {
            return new xsj0(DEFAULT_INSTANCE);
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
        synchronized (MinimumLyricsCharactersSeen.class) {
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

    public final void o(boolean z) {
        this.bitField0_ |= 128;
        this.isOffline_ = z;
    }

    public final void p(boolean z) {
        this.bitField0_ |= 256;
        this.isTranslationDisplayed_ = z;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.lyricsFormat_ = str;
    }

    public final void r(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.playbackId_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.provider_ = str;
    }

    public final void t(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.providerLyricsId_ = str;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }

    public final void u(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.syncType_ = str;
    }

    public final void v(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.trackUri_ = str;
    }
}
