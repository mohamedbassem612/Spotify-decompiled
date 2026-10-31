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
public final class SceneTemplate$RelationshipStatusContent$Card2 extends h implements v2j0 {
    public static final int BACKGROUND_ANIMATION_FIELD_NUMBER = 4;
    private static final SceneTemplate$RelationshipStatusContent$Card2 DEFAULT_INSTANCE;
    public static final int HAS_PULSING_HEART_HAPTICS_FEEDBACK_FIELD_NUMBER = 5;
    public static final int HAS_REVEAL_STATUS_HAPTICS_FEEDBACK_FIELD_NUMBER = 6;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    private RiveAnimation backgroundAnimation_;
    private int bitField0_;
    private boolean hasPulsingHeartHapticsFeedback_;
    private boolean hasRevealStatusHapticsFeedback_;
    private Paragraph header_;
    private Paragraph subtitle_;
    private Paragraph title_;

    static {
        SceneTemplate$RelationshipStatusContent$Card2 sceneTemplate$RelationshipStatusContent$Card2 = new SceneTemplate$RelationshipStatusContent$Card2();
        DEFAULT_INSTANCE = sceneTemplate$RelationshipStatusContent$Card2;
        h.registerDefaultInstance(SceneTemplate$RelationshipStatusContent$Card2.class, sceneTemplate$RelationshipStatusContent$Card2);
    }

    private SceneTemplate$RelationshipStatusContent$Card2() {
    }

    public static SceneTemplate$RelationshipStatusContent$Card2 o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u0007\u0006\u0007", new Object[]{"bitField0_", "header_", "title_", "subtitle_", "backgroundAnimation_", "hasPulsingHeartHapticsFeedback_", "hasRevealStatusHapticsFeedback_"});
        }
        if (iOrdinal == 3) {
            return new SceneTemplate$RelationshipStatusContent$Card2();
        }
        if (iOrdinal == 4) {
            return new hk41(DEFAULT_INSTANCE, (byte) 2);
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
        synchronized (SceneTemplate$RelationshipStatusContent$Card2.class) {
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

    public final RiveAnimation n() {
        RiveAnimation riveAnimation = this.backgroundAnimation_;
        return riveAnimation == null ? RiveAnimation.o() : riveAnimation;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final boolean p() {
        return this.hasPulsingHeartHapticsFeedback_;
    }

    public final boolean q() {
        return this.hasRevealStatusHapticsFeedback_;
    }

    public final Paragraph r() {
        Paragraph paragraph = this.header_;
        return paragraph == null ? Paragraph.n() : paragraph;
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
