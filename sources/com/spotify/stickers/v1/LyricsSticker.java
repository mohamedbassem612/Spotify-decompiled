package com.spotify.stickers.v1;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.vne0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class LyricsSticker extends h implements v2j0 {
    private static final LyricsSticker DEFAULT_INSTANCE;
    public static final int LYRICS_TEXT_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int TRACK_PREVIEW_URL_FIELD_NUMBER = 3;
    public static final int TRACK_URI_FIELD_NUMBER = 2;
    private int bitField0_;
    private String lyricsText_ = "";
    private String trackUri_ = "";
    private String trackPreviewUrl_ = "";

    static {
        LyricsSticker lyricsSticker = new LyricsSticker();
        DEFAULT_INSTANCE = lyricsSticker;
        h.registerDefaultInstance(LyricsSticker.class, lyricsSticker);
    }

    private LyricsSticker() {
    }

    public static LyricsSticker n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ለ\u0000", new Object[]{"bitField0_", "lyricsText_", "trackUri_", "trackPreviewUrl_"});
        }
        if (iOrdinal == 3) {
            return new LyricsSticker();
        }
        if (iOrdinal == 4) {
            return new vne0(DEFAULT_INSTANCE, (byte) 21);
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
        synchronized (LyricsSticker.class) {
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

    public final String o() {
        return this.lyricsText_;
    }

    public final String p() {
        return this.trackPreviewUrl_;
    }

    public final String q() {
        return this.trackUri_;
    }

    public final boolean r() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
