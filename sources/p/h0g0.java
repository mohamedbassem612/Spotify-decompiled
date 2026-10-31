package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h0g0 implements chv {
    public final /* synthetic */ i0g0 a;
    public final /* synthetic */ zyf0 b;

    public h0g0(i0g0 i0g0Var, zyf0 zyf0Var) {
        this.a = i0g0Var;
        this.b = zyf0Var;
    }

    public final void a(d8b1 d8b1Var, boolean z, float f) {
        i0g0 i0g0Var = this.a;
        if (u890.j(i0g0Var.d, d8b1Var)) {
            i0g0Var.d = null;
        }
        if (z) {
            return;
        }
        Iterator it = i0g0Var.c.iterator();
        while (it.hasNext()) {
            ((azf0) it.next()).b(this.b);
        }
    }
}
