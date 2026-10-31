package com.spotify.pam.v2;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.uca;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class Benefit extends h implements v2j0 {
    private static final Benefit DEFAULT_INSTANCE;
    public static final int ICON_COLOR_FIELD_NUMBER = 4;
    public static final int ICON_FIELD_NUMBER = 1;
    public static final int IS_HIGHLIGHTED_FIELD_NUMBER = 5;
    private static volatile qzr0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 6;
    private boolean isHighlighted_;
    private String icon_ = "";
    private String title_ = "";
    private String subtitle_ = "";
    private String iconColor_ = "";
    private String uri_ = "";

    static {
        Benefit benefit = new Benefit();
        DEFAULT_INSTANCE = benefit;
        h.registerDefaultInstance(Benefit.class, benefit);
    }

    private Benefit() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0007\u0006Ȉ", new Object[]{"icon_", "title_", "subtitle_", "iconColor_", "isHighlighted_", "uri_"});
        }
        if (iOrdinal == 3) {
            return new Benefit();
        }
        if (iOrdinal == 4) {
            return new uca(DEFAULT_INSTANCE, (byte) 20);
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
        synchronized (Benefit.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    public final String n() {
        return this.icon_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.iconColor_;
    }

    public final boolean p() {
        return this.isHighlighted_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
