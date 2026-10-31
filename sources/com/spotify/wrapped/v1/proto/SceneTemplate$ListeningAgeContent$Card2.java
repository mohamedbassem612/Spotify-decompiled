package com.spotify.wrapped.v1.proto;

import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.x341;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SceneTemplate$ListeningAgeContent$Card2 extends com.google.protobuf.h implements v2j0 {
    public static final int AGE_GROUP_FIELD_NUMBER = 4;
    private static final SceneTemplate$ListeningAgeContent$Card2 DEFAULT_INSTANCE;
    public static final int HEROTEXT_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int REVEAL_ANIMATION_FIELD_NUMBER = 5;
    public static final int SHARE_BUTTON_FIELD_NUMBER = 6;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int ageGroup_;
    private int bitField0_;
    private Paragraph herotext_;
    private RiveAnimation revealAnimation_;
    private ButtonConfiguration shareButton_;
    private Paragraph subtitle_;
    private Paragraph title_;

    static {
        SceneTemplate$ListeningAgeContent$Card2 sceneTemplate$ListeningAgeContent$Card2 = new SceneTemplate$ListeningAgeContent$Card2();
        DEFAULT_INSTANCE = sceneTemplate$ListeningAgeContent$Card2;
        com.google.protobuf.h.registerDefaultInstance(SceneTemplate$ListeningAgeContent$Card2.class, sceneTemplate$ListeningAgeContent$Card2);
    }

    private SceneTemplate$ListeningAgeContent$Card2() {
    }

    public static SceneTemplate$ListeningAgeContent$Card2 o() {
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u0004\u0005ဉ\u0003\u0006ဉ\u0004", new Object[]{"bitField0_", "title_", "herotext_", "subtitle_", "ageGroup_", "revealAnimation_", "shareButton_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$ListeningAgeContent$Card2();
        }
        if (iOrdinal == 4) {
            return new x341(DEFAULT_INSTANCE, (byte) 28);
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
        synchronized (SceneTemplate$ListeningAgeContent$Card2.class) {
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

    public final int n() {
        return this.ageGroup_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final Paragraph p() {
        Paragraph paragraph = this.herotext_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final RiveAnimation q() {
        RiveAnimation riveAnimation = this.revealAnimation_;
        return riveAnimation == null ? RiveAnimation.o() : riveAnimation;
    }

    public final ButtonConfiguration r() {
        ButtonConfiguration buttonConfiguration = this.shareButton_;
        return buttonConfiguration == null ? ButtonConfiguration.o() : buttonConfiguration;
    }

    public final Paragraph s() {
        Paragraph paragraph = this.subtitle_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final Paragraph t() {
        Paragraph paragraph = this.title_;
        return paragraph == null ? Paragraph.n() : paragraph;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
