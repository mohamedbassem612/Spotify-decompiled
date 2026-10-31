package com.spotify.watchfeed.component.item.v1;

import p.bf40;
import p.jf40;
import p.phc;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.wah;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class CommentsButtonComponent extends com.google.protobuf.h implements v2j0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 3;
    private static final CommentsButtonComponent DEFAULT_INSTANCE;
    public static final int DISABLE_COMMENT_INPUT_FIELD_NUMBER = 4;
    public static final int ENTITY_URI_FIELD_NUMBER = 1;
    private static volatile qzr0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    private boolean disableCommentInput_;
    private String entityUri_ = "";
    private String title_ = "";
    private String accessibilityText_ = "";

    static {
        CommentsButtonComponent commentsButtonComponent = new CommentsButtonComponent();
        DEFAULT_INSTANCE = commentsButtonComponent;
        com.google.protobuf.h.registerDefaultInstance(CommentsButtonComponent.class, commentsButtonComponent);
    }

    private CommentsButtonComponent() {
    }

    public static CommentsButtonComponent p(phc phcVar) {
        return (CommentsButtonComponent) com.google.protobuf.h.parseFrom(DEFAULT_INSTANCE, phcVar);
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
            return com.google.protobuf.h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0007", new Object[]{"entityUri_", "title_", "accessibilityText_", "disableCommentInput_"});
        }
        if (iOrdinal == 3) {
            return new CommentsButtonComponent();
        }
        if (iOrdinal == 4) {
            return new wah(DEFAULT_INSTANCE, (byte) 7);
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
        synchronized (CommentsButtonComponent.class) {
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

    public final String getEntityUri() {
        return this.entityUri_;
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

    public final boolean o() {
        return this.disableCommentInput_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
