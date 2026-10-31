package p;

import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class z550 {
    public final dma1 a;

    public z550(dma1 dma1Var) {
        this.a = dma1Var;
    }

    public final void a(y550 y550Var) {
        hma1 hma1VarEdit = this.a.edit();
        hma1VarEdit.d(a650.a, "1|" + Build.FINGERPRINT);
        hma1VarEdit.d(a650.b, y550Var.a);
        hma1VarEdit.d(a650.c, y550Var.b);
        hma1VarEdit.g();
    }
}
