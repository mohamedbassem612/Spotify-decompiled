package com.spotify.watchfeed.component.item.v1;

import p.bf40;
import p.h290;
import p.hhe;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ChapterNavigationListButtonComponent extends com.google.protobuf.h implements v2j0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 1;
    public static final int CHAPTERS_FIELD_NUMBER = 2;
    public static final int CURRENT_ENTITY_URI_FIELD_NUMBER = 3;
    private static final ChapterNavigationListButtonComponent DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private String accessibilityText_ = "";
    private h290 chapters_ = com.google.protobuf.h.emptyProtobufList();
    private String currentEntityUri_ = "";

    static {
        ChapterNavigationListButtonComponent chapterNavigationListButtonComponent = new ChapterNavigationListButtonComponent();
        DEFAULT_INSTANCE = chapterNavigationListButtonComponent;
        com.google.protobuf.h.registerDefaultInstance(ChapterNavigationListButtonComponent.class, chapterNavigationListButtonComponent);
    }

    private ChapterNavigationListButtonComponent() {
    }

    public static qzr0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ChapterNavigationListButtonComponent q(phc phcVar) {
        return (ChapterNavigationListButtonComponent) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, phcVar);
    }

    public final Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2) {
        bf40 bf40Var;
        int iOrdinal = jf40Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003Ȉ", new Object[]{"accessibilityText_", "chapters_", ChapterItem.class, "currentEntityUri_"});
        }
        if (iOrdinal == 3) {
            return new ChapterNavigationListButtonComponent();
        }
        if (iOrdinal == 4) {
            return new hhe(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (ChapterNavigationListButtonComponent.class) {
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

    public final h290 o() {
        return this.chapters_;
    }

    public final String p() {
        return this.currentEntityUri_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
