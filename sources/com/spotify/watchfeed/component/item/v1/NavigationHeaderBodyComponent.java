package com.spotify.watchfeed.component.item.v1;

import p.bf40;
import p.fin0;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class NavigationHeaderBodyComponent extends com.google.protobuf.h implements v2j0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 4;
    private static final NavigationHeaderBodyComponent DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 2;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 3;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private String title_ = "";
    private String icon_ = "";
    private String navigationUri_ = "";
    private String accessibilityText_ = "";

    static {
        NavigationHeaderBodyComponent navigationHeaderBodyComponent = new NavigationHeaderBodyComponent();
        DEFAULT_INSTANCE = navigationHeaderBodyComponent;
        com.google.protobuf.h.registerDefaultInstance(NavigationHeaderBodyComponent.class, navigationHeaderBodyComponent);
    }

    private NavigationHeaderBodyComponent() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static NavigationHeaderBodyComponent q(phc phcVar) {
        return (NavigationHeaderBodyComponent) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"title_", "icon_", "navigationUri_", "accessibilityText_"});
        }
        if (iOrdinal == 3) {
            return new NavigationHeaderBodyComponent();
        }
        if (iOrdinal == 4) {
            return new fin0(DEFAULT_INSTANCE, (byte) 14);
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
        synchronized (NavigationHeaderBodyComponent.class) {
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

    public final String o() {
        return this.icon_;
    }

    public final String p() {
        return this.navigationUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
