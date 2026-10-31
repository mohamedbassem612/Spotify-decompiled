package p;

import android.os.Bundle;
import com.spotify.mobius.android.MobiusLoopViewModel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class q22 implements eck1 {
    public final n12 a;
    public final mmw b;
    public final q8n c;
    public final q8n d;

    public q22(n12 n12Var, mmw mmwVar, q8n q8nVar, q8n q8nVar2) {
        this.a = n12Var;
        this.b = mmwVar;
        this.c = q8nVar;
        this.d = q8nVar2;
    }

    public final xbk1 c(Class cls, wcn0 wcn0Var) {
        qe41 qe41Var = (qe41) ((esn) wcn0Var).a.get(a6o1.a);
        oe41 oe41VarP = qe41Var != null ? qe41Var.p() : null;
        if (oe41VarP == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        Bundle bundleA = oe41VarP.a("VM_STATE_PROVIDER");
        jhm0 jhm0Var = bundleA != null ? (jhm0) jhc1.t(bundleA, "VM_STATE_KEY", jhm0.class) : null;
        if (jhm0Var == null) {
            jhm0Var = ugm0.a;
        }
        MobiusLoopViewModel mobiusLoopViewModelT = MobiusLoopViewModel.T(new p22(this), jhm0Var, new gid(jhm0Var, this, (byte) 19));
        oe41VarP.c("VM_STATE_PROVIDER", new k21(mobiusLoopViewModelT, (byte) 1));
        return mobiusLoopViewModelT;
    }
}
