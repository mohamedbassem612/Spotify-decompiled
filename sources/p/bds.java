package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bds implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cds b;

    public /* synthetic */ bds(cds cdsVar, byte b) {
        this.a = b;
        this.b = cdsVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        rnp0 rnp0Var = rnp0.a;
        cds cdsVar = this.b;
        switch (b) {
            case 0:
                vi11 vi11Var = cdsVar.e;
                uoa uoaVar = (uoa) vi11Var.e;
                if (uoaVar != null) {
                    uoaVar.u();
                }
                uoa uoaVar2 = (uoa) vi11Var.e;
                if (uoaVar2 != null) {
                    ((woa) vi11Var.b).c(uoaVar2);
                    vi11Var.e = null;
                }
                cdsVar.N0.invoke(rnp0Var);
                break;
            case 1:
                vi11 vi11Var2 = cdsVar.e;
                uoa uoaVar3 = (uoa) vi11Var2.e;
                if (uoaVar3 != null) {
                    uoaVar3.u();
                }
                uoa uoaVar4 = (uoa) vi11Var2.e;
                if (uoaVar4 != null) {
                    ((woa) vi11Var2.b).c(uoaVar4);
                    vi11Var2.e = null;
                }
                cdsVar.N0.invoke(rnp0Var);
                break;
            default:
                vi11 vi11Var3 = cdsVar.e;
                uoa uoaVar5 = (uoa) vi11Var3.e;
                if (uoaVar5 != null) {
                    uoaVar5.u();
                }
                uoa uoaVar6 = (uoa) vi11Var3.e;
                if (uoaVar6 != null) {
                    ((woa) vi11Var3.b).c(uoaVar6);
                    vi11Var3.e = null;
                }
                cdsVar.N0.invoke(tnp0.a);
                break;
        }
    }
}
