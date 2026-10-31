package com.spotify.wrapped.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.hk41;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class SceneTemplate$WrappedPlacesContent$Track extends h implements v2j0 {
    public static final int ARTIST_FIELD_NUMBER = 2;
    private static final SceneTemplate$WrappedPlacesContent$Track DEFAULT_INSTANCE;
    public static final int IMAGE_FIELD_NUMBER = 4;
    private static volatile qzr0 PARSER = null;
    public static final int PREVIEW_URL_FIELD_NUMBER = 5;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int URI_FIELD_NUMBER = 3;
    private Paragraph artist_;
    private int bitField0_;
    private Image image_;
    private Paragraph title_;
    private String uri_ = "";
    private String previewUrl_ = "";

    static {
        SceneTemplate$WrappedPlacesContent$Track sceneTemplate$WrappedPlacesContent$Track = new SceneTemplate$WrappedPlacesContent$Track();
        DEFAULT_INSTANCE = sceneTemplate$WrappedPlacesContent$Track;
        h.registerDefaultInstance(SceneTemplate$WrappedPlacesContent$Track.class, sceneTemplate$WrappedPlacesContent$Track);
    }

    private SceneTemplate$WrappedPlacesContent$Track() {
    }

    public static SceneTemplate$WrappedPlacesContent$Track o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004ဉ\u0002\u0005Ȉ", new Object[]{"bitField0_", "title_", "artist_", "uri_", "image_", "previewUrl_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$WrappedPlacesContent$Track();
        }
        if (iOrdinal == 4) {
            return new hk41(DEFAULT_INSTANCE, (byte) 17);
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
        synchronized (SceneTemplate$WrappedPlacesContent$Track.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    public final Paragraph n() {
        Paragraph paragraph = this.artist_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Image p() {
        Image image = this.image_;
        return image == null ? Image.o() : image;
    }

    public final String q() {
        return this.previewUrl_;
    }

    public final Paragraph r() {
        Paragraph paragraph = this.title_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
