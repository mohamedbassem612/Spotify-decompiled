package com.spotify.culturalmoments.stories.v1;

import com.google.protobuf.h;
import p.bf40;
import p.iqu0;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class PlaylistStory extends h implements v2j0 {
    public static final int BACKGROUND_IMAGE_URL_FIELD_NUMBER = 5;
    public static final int BASE_FIELD_NUMBER = 1;
    public static final int BUTTON_FIELD_NUMBER = 4;
    private static final PlaylistStory DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int PLAYLIST_URI_FIELD_NUMBER = 6;
    public static final int TITLE_FIELD_NUMBER = 2;
    private BaseStory base_;
    private int bitField0_;
    private Button button_;
    private Text title_;
    private String imageUrl_ = "";
    private String backgroundImageUrl_ = "";
    private String playlistUri_ = "";

    static {
        PlaylistStory playlistStory = new PlaylistStory();
        DEFAULT_INSTANCE = playlistStory;
        h.registerDefaultInstance(PlaylistStory.class, playlistStory);
    }

    private PlaylistStory() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static PlaylistStory q() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004ဉ\u0002\u0005Ȉ\u0006Ȉ", new Object[]{"bitField0_", "base_", "title_", "imageUrl_", "button_", "backgroundImageUrl_", "playlistUri_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistStory();
        }
        if (iOrdinal == 4) {
            return new iqu0(DEFAULT_INSTANCE, (byte) 24);
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
        synchronized (PlaylistStory.class) {
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

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    public final String getPlaylistUri() {
        return this.playlistUri_;
    }

    public final String n() {
        return this.backgroundImageUrl_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final BaseStory o() {
        BaseStory baseStory = this.base_;
        return baseStory == null ? BaseStory.p() : baseStory;
    }

    public final Button p() {
        Button button = this.button_;
        return button == null ? Button.o() : button;
    }

    public final Text r() {
        Text text = this.title_;
        return text == null ? Text.n() : text;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
