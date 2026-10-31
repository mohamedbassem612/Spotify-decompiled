package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class umr implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ zmr c;

    public umr(zmr zmrVar, iu30 iu30Var) {
        this.a = (byte) 4;
        this.c = zmrVar;
        this.b = iu30Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        iu30 iu30Var = this.b;
        zmr zmrVar = this.c;
        switch (b) {
            case 0:
                xik xikVar = zmrVar.c1;
                if (xikVar != null) {
                    iu30Var.invoke(new sik(xikVar.j));
                    return;
                } else {
                    u890.C("model");
                    throw null;
                }
            case 1:
                xik xikVar2 = zmrVar.c1;
                if (xikVar2 != null) {
                    iu30Var.invoke(new sik(xikVar2.j));
                    return;
                } else {
                    u890.C("model");
                    throw null;
                }
            case 2:
                xik xikVar3 = zmrVar.c1;
                if (xikVar3 != null) {
                    iu30Var.invoke(new rik(xikVar3.a, xikVar3.n));
                    return;
                } else {
                    u890.C("model");
                    throw null;
                }
            case 3:
                xik xikVar4 = zmrVar.c1;
                if (xikVar4 != null) {
                    iu30Var.invoke(new rik(xikVar4.a, xikVar4.n));
                    return;
                } else {
                    u890.C("model");
                    throw null;
                }
            default:
                xik xikVar5 = zmrVar.c1;
                if (xikVar5 == null) {
                    u890.C("model");
                    throw null;
                }
                xk6 xk6VarA = zmrVar.a(xikVar5);
                if (xk6VarA != null) {
                    iu30Var.invoke(new mik(xk6VarA.c));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ umr(iu30 iu30Var, zmr zmrVar, byte b) {
        this.a = b;
        this.b = iu30Var;
        this.c = zmrVar;
    }
}
