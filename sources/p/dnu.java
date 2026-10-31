package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dnu implements o5s {
    public final /* synthetic */ fnu a;

    public dnu(fnu fnuVar) {
        this.a = fnuVar;
    }

    public final void onStop(iac0 iac0Var) {
        zob1 zob1VarC;
        dx80 dx80Var;
        fnu fnuVar = this.a;
        if (!(((e090) fnuVar.o.getValue()) instanceof zz80) || fnuVar.i.isChangingConfigurations()) {
            return;
        }
        nw80 nw80Var = (nw80) fnuVar.p.get();
        if (nw80Var != null && (zob1VarC = nw80Var.c()) != null && (dx80Var = (dx80) zob1VarC.getValue()) != null) {
            dx80Var.cancel();
        }
        fnuVar.g.a.l();
    }
}
