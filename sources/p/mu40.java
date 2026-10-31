package p;

import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mu40 implements eyf0 {
    public final tu40 a;
    public final uu40 b;
    public final f95 c;
    public final gj5 d;

    public mu40(tu40 tu40Var, uu40 uu40Var, f95 f95Var, gj5 gj5Var) {
        this.a = tu40Var;
        this.b = uu40Var;
        this.c = f95Var;
        this.d = gj5Var;
    }

    @Override // p.eyf0
    public final void a(Intent intent) {
        int iC = qxy0.C(intent);
        int i = iC == 0 ? -1 : ku40.a[l1d.C(iC)];
        if (i != -1) {
            gj5 gj5Var = this.d;
            f95 f95Var = this.c;
            if (i == 1) {
                if (f95Var.d()) {
                    c921.y(cto1.q(gj5Var), (o8n) null, 0, new lu40(this, (lnm) null, (byte) 0), 3);
                }
            } else if (i != 2) {
                if (i == 3) {
                    return;
                }
                eg.o();
            } else if (f95Var.e()) {
                c921.y(cto1.q(gj5Var), (o8n) null, 0, new lu40(this, (lnm) null, (byte) 2), 3);
            }
        }
    }
}
