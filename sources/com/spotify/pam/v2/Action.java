package com.spotify.pam.v2;

import com.google.protobuf.h;
import p.bf40;
import p.j;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class Action extends h implements v2j0 {
    public static final int COLOR_FIELD_NUMBER = 5;
    private static final Action DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 4;
    public static final int NOTE_FIELD_NUMBER = 6;
    private static volatile qzr0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int URI_FIELD_NUMBER = 3;
    private int bitField0_;
    private String title_ = "";
    private String subtitle_ = "";
    private String uri_ = "";
    private String icon_ = "";
    private String color_ = "";
    private String note_ = "";

    static {
        Action action = new Action();
        DEFAULT_INSTANCE = action;
        h.registerDefaultInstance(Action.class, action);
    }

    private Action() {
    }

    public static Action o() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006ለ\u0000", new Object[]{"bitField0_", "title_", "subtitle_", "uri_", "icon_", "color_", "note_"});
        }
        if (iOrdinal == 3) {
            return new Action();
        }
        if (iOrdinal == 4) {
            return new j(DEFAULT_INSTANCE, (byte) 14);
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
        synchronized (Action.class) {
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

    public final String getNote() {
        return this.note_;
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
        return this.color_;
    }

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String p() {
        return this.icon_;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
