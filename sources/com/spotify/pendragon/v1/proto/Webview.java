package com.spotify.pendragon.v1.proto;

import com.google.protobuf.h;
import p.bf40;
import p.ixk1;
import p.jf40;
import p.qzr0;
import p.r2j0;
import p.s2j0;
import p.v2j0;
import p.xvj1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class Webview extends h implements v2j0 {
    public static final int BASIC_WEBVIEW_FIELD_NUMBER = 1;
    private static final Webview DEFAULT_INSTANCE;
    private static volatile qzr0 PARSER;
    private int webviewTemplateCase_ = 0;
    private Object webviewTemplate_;

    static {
        Webview webview = new Webview();
        DEFAULT_INSTANCE = webview;
        h.registerDefaultInstance(Webview.class, webview);
    }

    private Webview() {
    }

    public static Webview p() {
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
            return h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"webviewTemplate_", "webviewTemplateCase_", BasicWebview.class});
        }
        if (iOrdinal == 3) {
            return new Webview();
        }
        if (iOrdinal == 4) {
            return new ixk1((byte) 17);
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
        synchronized (Webview.class) {
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

    public final BasicWebview o() {
        return this.webviewTemplateCase_ == 1 ? (BasicWebview) this.webviewTemplate_ : BasicWebview.n();
    }

    public final int q() {
        return xvj1.a(this.webviewTemplateCase_);
    }

    public final /* bridge */ /* synthetic */ r2j0 toBuilder() {
        return toBuilder();
    }
}
