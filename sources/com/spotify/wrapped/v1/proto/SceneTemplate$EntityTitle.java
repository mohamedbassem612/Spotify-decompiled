package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.x341;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SceneTemplate$EntityTitle extends com.google.protobuf.h implements v2j0 {
    private static final SceneTemplate$EntityTitle DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 4;
    public static final int IMAGE_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private Paragraph header_;
    private Image image_;
    private Paragraph title_;

    static {
        SceneTemplate$EntityTitle sceneTemplate$EntityTitle = new SceneTemplate$EntityTitle();
        DEFAULT_INSTANCE = sceneTemplate$EntityTitle;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$EntityTitle.class, sceneTemplate$EntityTitle);
    }

    private SceneTemplate$EntityTitle() {
    }

    public static SceneTemplate$EntityTitle n() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဉ\u0002", new Object[]{"bitField0_", "title_", "image_", "header_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$EntityTitle();
        }
        if (iOrdinal == 4) {
            return new x341(DEFAULT_INSTANCE, (byte) 20);
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
        synchronized (SceneTemplate$EntityTitle.class) {
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
        Paragraph paragraph = this.header_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final Image p() {
        Image image = this.image_;
        return image == null ? Image.o() : image;
    }

    public final Paragraph q() {
        Paragraph paragraph = this.title_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final boolean r() {
        return (this.bitField0_ & 4) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
