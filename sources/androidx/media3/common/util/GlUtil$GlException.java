package androidx.media3.common.util;

import p.b380;
import p.bg11;
import p.w280;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class GlUtil$GlException extends Exception {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GlUtil$GlException(String str) {
        this(str, bg11.e);
        w280 w280Var = b380.b;
    }

    public GlUtil$GlException(String str, bg11 bg11Var) {
        super(str);
        b380.p(bg11Var);
    }
}
