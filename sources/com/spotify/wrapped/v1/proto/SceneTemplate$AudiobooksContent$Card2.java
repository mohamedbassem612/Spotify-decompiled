package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.x341;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SceneTemplate$AudiobooksContent$Card2 extends com.google.protobuf.h implements v2j0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 7;
    public static final int BACKGROUND_ANIMATION_FIELD_NUMBER = 5;
    public static final int COVER_REVEAL_ANIMATION_FIELD_NUMBER = 6;
    private static final SceneTemplate$AudiobooksContent$Card2 DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private String accessibilityText_ = "";
    private RiveAnimation backgroundAnimation_;
    private int bitField0_;
    private RiveAnimation coverRevealAnimation_;
    private Paragraph subtitle_;
    private Paragraph title_;

    static {
        SceneTemplate$AudiobooksContent$Card2 sceneTemplate$AudiobooksContent$Card2 = new SceneTemplate$AudiobooksContent$Card2();
        DEFAULT_INSTANCE = sceneTemplate$AudiobooksContent$Card2;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$AudiobooksContent$Card2.class, sceneTemplate$AudiobooksContent$Card2);
    }

    private SceneTemplate$AudiobooksContent$Card2() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static SceneTemplate$AudiobooksContent$Card2 q() {
        return DEFAULT_INSTANCE;
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0005ဉ\u0002\u0006ဉ\u0003\u0007Ȉ", new Object[]{"bitField0_", "title_", "subtitle_", "backgroundAnimation_", "coverRevealAnimation_", "accessibilityText_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$AudiobooksContent$Card2();
        }
        if (iOrdinal == 4) {
            return new x341(DEFAULT_INSTANCE, (byte) 18);
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
        synchronized (SceneTemplate$AudiobooksContent$Card2.class) {
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

    public final String n() {
        return this.accessibilityText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final RiveAnimation o() {
        RiveAnimation riveAnimation = this.backgroundAnimation_;
        return riveAnimation == null ? RiveAnimation.o() : riveAnimation;
    }

    public final RiveAnimation p() {
        RiveAnimation riveAnimation = this.coverRevealAnimation_;
        return riveAnimation == null ? RiveAnimation.o() : riveAnimation;
    }

    public final Paragraph r() {
        Paragraph paragraph = this.subtitle_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final Paragraph s() {
        Paragraph paragraph = this.title_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
