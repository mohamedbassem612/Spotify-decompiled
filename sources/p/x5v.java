package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class x5v extends m5v {
    public vvr j1;
    public iu30 k1;
    public iu30 l1;

    public final Object L1(swn swnVar, rzu rzuVar) {
        vvr vvrVar = this.j1;
        zlo zloVar = new zlo(swnVar, this, (lnm) null, (byte) 29);
        vvrVar.getClass();
        Object objS = smo1.s(new clo(vvrVar, zloVar, (lnm) null, (byte) 21), rzuVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objS != d9nVar) {
            objS = rih1Var;
        }
        return objS == d9nVar ? objS : rih1Var;
    }

    public final void Q1(long j) {
        this.k1.invoke(new Offset(j));
    }

    public final void R1(n4v n4vVar) {
        this.l1.invoke(new qui1(n4vVar.a));
    }
}
