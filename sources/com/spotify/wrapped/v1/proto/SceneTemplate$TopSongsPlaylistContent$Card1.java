package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.h290;
import p.hk41;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SceneTemplate$TopSongsPlaylistContent$Card1 extends com.google.protobuf.h implements v2j0 {
    public static final int ACCESSIBILITY_TITLE_FIELD_NUMBER = 1;
    public static final int ADD_TO_LIBRARY_FIELD_NUMBER = 5;
    public static final int BACKGROUND_ANIMATION_FIELD_NUMBER = 2;
    public static final int DECORATIONS_FIELD_NUMBER = 7;
    private static final SceneTemplate$TopSongsPlaylistContent$Card1 DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYLIST_IMAGE_FIELD_NUMBER = 3;
    public static final int PLAYLIST_URI_FIELD_NUMBER = 6;
    public static final int SHARE_BUTTON_FIELD_NUMBER = 8;
    public static final int TITLE_FIELD_NUMBER = 4;
    private ButtonConfiguration addToLibrary_;
    private RiveAnimation backgroundAnimation_;
    private int bitField0_;
    private Image playlistImage_;
    private ButtonConfiguration shareButton_;
    private Paragraph title_;
    private String accessibilityTitle_ = "";
    private String playlistUri_ = "";
    private h290 decorations_ = com.google.protobuf.h.emptyProtobufList();

    static {
        SceneTemplate$TopSongsPlaylistContent$Card1 sceneTemplate$TopSongsPlaylistContent$Card1 = new SceneTemplate$TopSongsPlaylistContent$Card1();
        DEFAULT_INSTANCE = sceneTemplate$TopSongsPlaylistContent$Card1;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$TopSongsPlaylistContent$Card1.class, sceneTemplate$TopSongsPlaylistContent$Card1);
    }

    private SceneTemplate$TopSongsPlaylistContent$Card1() {
    }

    public static SceneTemplate$TopSongsPlaylistContent$Card1 n() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006Ȉ\u0007\u001b\bဉ\u0004", new Object[]{"bitField0_", "accessibilityTitle_", "backgroundAnimation_", "playlistImage_", "title_", "addToLibrary_", "playlistUri_", "decorations_", Paragraph.class, "shareButton_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$TopSongsPlaylistContent$Card1();
        }
        if (iOrdinal == 4) {
            return new hk41(DEFAULT_INSTANCE, (byte) 11);
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
        synchronized (SceneTemplate$TopSongsPlaylistContent$Card1.class) {
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

    public final Paragraph o() {
        Paragraph paragraph = this.title_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
