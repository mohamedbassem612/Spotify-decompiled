package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s05 implements pdy0 {
    public final int a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new uz4(this, (byte) 16));

    public s05(int i, luk lukVar, boolean z) {
        this.a = i;
        this.b = z;
        this.c = lukVar;
    }

    public final int a() {
        s05 s05Var = (s05) this.d.getValue();
        return s05Var != null ? s05Var.a() : this.a;
    }

    public final boolean b() {
        s05 s05Var = (s05) this.d.getValue();
        return s05Var != null ? s05Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("content_resumed_snackbar_min_age_seconds", "android-resumption-contentresumedhat", a(), -1, 2592000), new fpb("enable_content_resumed_hat", "android-resumption-contentresumedhat", b())});
    }
}
