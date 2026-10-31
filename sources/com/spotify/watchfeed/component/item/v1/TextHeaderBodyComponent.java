package com.spotify.watchfeed.component.item.v1;

import p.bf40;
import p.jf40;
import p.nzd1;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class TextHeaderBodyComponent extends com.google.protobuf.h implements v2j0 {
    private static final TextHeaderBodyComponent DEFAULT_INSTANCE;
    public static final int NAVIGATION_ACCESSIBILITY_TEXT_FIELD_NUMBER = 5;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 4;
    public static final int OVERLINE_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    private String overline_ = "";
    private String title_ = "";
    private String subtitle_ = "";
    private String navigationUri_ = "";
    private String navigationAccessibilityText_ = "";

    static {
        TextHeaderBodyComponent textHeaderBodyComponent = new TextHeaderBodyComponent();
        DEFAULT_INSTANCE = textHeaderBodyComponent;
        com.google.protobuf.h.registerDefaultInstance(TextHeaderBodyComponent.class, textHeaderBodyComponent);
    }

    private TextHeaderBodyComponent() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static TextHeaderBodyComponent q(phc phcVar) {
        return (TextHeaderBodyComponent) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"overline_", "title_", "subtitle_", "navigationUri_", "navigationAccessibilityText_"});
        }
        if (iOrdinal == 3) {
            return new TextHeaderBodyComponent();
        }
        if (iOrdinal == 4) {
            return new nzd1(DEFAULT_INSTANCE, (byte) 3);
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
        synchronized (TextHeaderBodyComponent.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final String n() {
        return this.navigationAccessibilityText_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.navigationUri_;
    }

    public final String p() {
        return this.overline_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
