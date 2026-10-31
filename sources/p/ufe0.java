package p;

import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ufe0 {
    public final o4o0 a;
    public final mr20 b;

    public ufe0(o4o0 o4o0Var) {
        this.a = o4o0Var;
        this.b = Build.VERSION.SDK_INT > 36 ? u4p1.b0(yoi1.g(o4o0Var.d.distinctUntilChanged()), new tfe0(this, (lnm) null, (byte) 0)) : h4p1.m(Boolean.TRUE);
    }
}
