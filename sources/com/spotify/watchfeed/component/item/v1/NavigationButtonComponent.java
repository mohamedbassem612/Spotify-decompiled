package com.spotify.watchfeed.component.item.v1;

import p.bec;
import p.bf40;
import p.fin0;
import p.jf40;
import p.mfc;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class NavigationButtonComponent extends com.google.protobuf.h implements v2j0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 3;
    public static final int BUTTON_COLOR_SCHEME_FIELD_NUMBER = 6;
    public static final int BUTTON_STYLE_FIELD_NUMBER = 4;
    private static final NavigationButtonComponent DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 5;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int buttonColorScheme_;
    private int buttonStyle_;
    private String title_ = "";
    private String navigationUri_ = "";
    private String accessibilityText_ = "";
    private String icon_ = "";

    static {
        NavigationButtonComponent navigationButtonComponent = new NavigationButtonComponent();
        DEFAULT_INSTANCE = navigationButtonComponent;
        com.google.protobuf.h.registerDefaultInstance(NavigationButtonComponent.class, navigationButtonComponent);
    }

    private NavigationButtonComponent() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static NavigationButtonComponent s(phc phcVar) {
        return (NavigationButtonComponent) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0005Ȉ\u0006\f", new Object[]{"title_", "navigationUri_", "accessibilityText_", "buttonStyle_", "icon_", "buttonColorScheme_"});
        }
        if (iOrdinal == 3) {
            return new NavigationButtonComponent();
        }
        if (iOrdinal == 4) {
            return new fin0(DEFAULT_INSTANCE, (byte) 12);
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
        synchronized (NavigationButtonComponent.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final String n() {
        return this.accessibilityText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final bec o() {
        bec becVarA = bec.a(this.buttonColorScheme_);
        return becVarA == null ? bec.UNRECOGNIZED : becVarA;
    }

    public final mfc p() {
        mfc mfcVarA = mfc.a(this.buttonStyle_);
        return mfcVarA == null ? mfc.UNRECOGNIZED : mfcVarA;
    }

    public final String q() {
        return this.icon_;
    }

    public final String r() {
        return this.navigationUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
