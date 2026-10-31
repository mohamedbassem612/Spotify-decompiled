package com.spotify.browsita.v1.resolved;

import com.google.protobuf.h;
import p.bf40;
import p.jf40;
import p.nzd1;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class TextHeading extends h implements v2j0 {
    private static final TextHeading DEFAULT_INSTANCE;
    public static final int ENCORE_ICON_NAME_FIELD_NUMBER = 3;
    public static final int NAVIGATION_ACTION_FIELD_NUMBER = 2;
    private static volatile qzr0 PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    private int bitField0_;
    private NavigationAction navigationAction_;
    private String text_ = "";
    private String encoreIconName_ = "";

    static {
        TextHeading textHeading = new TextHeading();
        DEFAULT_INSTANCE = textHeading;
        h.registerDefaultInstance(TextHeading.class, textHeading);
    }

    private TextHeading() {
    }

    public static TextHeading n() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ", new Object[]{"bitField0_", "text_", "navigationAction_", "encoreIconName_"});
        }
        if (iOrdinal == 3) {
            return new TextHeading();
        }
        if (iOrdinal == 4) {
            return new nzd1(DEFAULT_INSTANCE, (byte) 4);
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
        synchronized (TextHeading.class) {
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

    public final /* bridge */ /* synthetic */ r2j0 newBuilderForType() {
        return newBuilderForType();
    }

    public final String o() {
        return this.encoreIconName_;
    }

    public final NavigationAction p() {
        NavigationAction navigationAction = this.navigationAction_;
        return navigationAction == null ? NavigationAction.n() : navigationAction;
    }

    public final String q() {
        return this.text_;
    }

    public final boolean r() {
        return (this.bitField0_ & 1) != 0;
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
