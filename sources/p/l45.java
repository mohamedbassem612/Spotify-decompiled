package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class l45 implements w7e1 {
    public final /* synthetic */ xid a;

    @Override // p.w7e1
    public final void a(i4e1 i4e1Var, i4e1 i4e1Var2, boolean z) {
        long j = i4e1Var.e;
        nbe1 nbe1Var = i4e1Var.f;
        long j2 = i4e1Var2.e;
        nbe1 nbe1Var2 = i4e1Var2.f;
        xid xidVar = this.a;
        if (z) {
            xidVar.s().restartInput((View) xidVar.b);
            return;
        }
        if (nbe1.c(j, j2) && u890.j(nbe1Var, nbe1Var2)) {
            return;
        }
        xidVar.s().updateSelection((View) xidVar.b, nbe1.g(j2), nbe1.f(j2), nbe1Var2 != null ? nbe1.g(nbe1Var2.a) : -1, nbe1Var2 != null ? nbe1.f(nbe1Var2.a) : -1);
    }
}
