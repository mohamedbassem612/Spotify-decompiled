package p;

import android.view.WindowInsets;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hua0 implements eua0 {
    public final vql1 a;
    public int c;
    public int d;
    public final kdn0 b = new kdn0();
    public final gs90 e = new gs90(this, (byte) 11);
    public final fai0 f = w6d1.h(new fua0(this));

    public hua0(vql1 vql1Var) {
        this.a = vql1Var;
    }

    @Override // p.eua0
    public final ymd0 a() {
        return this.f;
    }

    public final void b(boolean z) {
        int i = this.d + (z ? 1 : -1);
        this.d = i;
        gs90 gs90Var = this.e;
        vql1 vql1Var = this.a;
        if (i == 1) {
            vql1Var.a(new gua0(gs90Var));
        } else if (i == 0) {
            vql1Var.b(new gua0(gs90Var));
        }
    }

    public final void c(WindowInsets windowInsets) {
        boolean zIsVisible = windowInsets.isVisible(WindowInsets.Type.ime());
        int iO = jah.o(windowInsets.getInsets(WindowInsets.Type.ime()));
        kdn0 kdn0Var = this.b;
        if (zIsVisible && iO != this.c) {
            kdn0Var.j(Integer.valueOf(iO));
            this.c = iO;
        } else {
            if (zIsVisible || this.c == 0) {
                return;
            }
            kdn0Var.j(0);
            this.c = 0;
        }
    }
}
