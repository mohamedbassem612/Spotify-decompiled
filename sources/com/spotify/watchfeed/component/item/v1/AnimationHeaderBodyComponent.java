package com.spotify.watchfeed.component.item.v1;

import p.a53;
import p.bf40;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class AnimationHeaderBodyComponent extends com.google.protobuf.h implements v2j0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 6;
    public static final int ANIMATION_DURATION_FIELD_NUMBER = 5;
    private static final AnimationHeaderBodyComponent DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 4;
    public static final int LOGO_FIELD_NUMBER = 1;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    private int animationDuration_;
    private String logo_ = "";
    private String subtitle_ = "";
    private String navigationUri_ = "";
    private String icon_ = "";
    private String accessibilityText_ = "";

    static {
        AnimationHeaderBodyComponent animationHeaderBodyComponent = new AnimationHeaderBodyComponent();
        DEFAULT_INSTANCE = animationHeaderBodyComponent;
        com.google.protobuf.h.registerDefaultInstance(AnimationHeaderBodyComponent.class, animationHeaderBodyComponent);
    }

    private AnimationHeaderBodyComponent() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static AnimationHeaderBodyComponent s(phc phcVar) {
        return (AnimationHeaderBodyComponent) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0004\u0006Ȉ", new Object[]{"logo_", "subtitle_", "navigationUri_", "icon_", "animationDuration_", "accessibilityText_"});
        }
        if (iOrdinal == 3) {
            return new AnimationHeaderBodyComponent();
        }
        if (iOrdinal == 4) {
            return new a53(DEFAULT_INSTANCE, (byte) 14);
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
        synchronized (AnimationHeaderBodyComponent.class) {
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

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String n() {
        return this.accessibilityText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final int o() {
        return this.animationDuration_;
    }

    public final String p() {
        return this.icon_;
    }

    public final String q() {
        return this.logo_;
    }

    public final String r() {
        return this.navigationUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
