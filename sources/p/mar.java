package p;

import io.reactivex.rxjava3.core.Single;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mar {
    public final z3v0 a;
    public final wr00 b;
    public final yh2 c;
    public final y5v0 d;

    public mar(z3v0 z3v0Var, wr00 wr00Var, yh2 yh2Var, y5v0 y5v0Var, iac0 iac0Var) {
        this.a = z3v0Var;
        this.b = wr00Var;
        this.c = yh2Var;
        this.d = y5v0Var;
        iac0Var.getLifecycle().a(new ct6(this, (byte) 4));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, lnm lnmVar) {
        lar larVar;
        rzs0 rzs0Var;
        if (lnmVar instanceof lar) {
            larVar = (lar) lnmVar;
            int i = larVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                larVar.d = i - Integer.MIN_VALUE;
            } else {
                larVar = new lar(this, lnmVar);
            }
        } else {
            larVar = new lar(this, lnmVar);
        }
        Object objR = larVar.b;
        int i2 = larVar.d;
        if (i2 == 0) {
            hm5.M(objR);
            Single map = this.a.a(Collections.singletonList(str)).firstOrError().map(u321.U0);
            larVar.a = this;
            larVar.d = 1;
            ohd ohdVar = new ohd(1, aym.t(larVar));
            ohdVar.t();
            ohdVar.n(new vlb(map.subscribe(new kar(ohdVar, (byte) 0)), (byte) 1));
            objR = ohdVar.r();
            d9n d9nVar = d9n.a;
            if (objR == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = larVar.a;
            hm5.M(objR);
        }
        i1z i1zVar = (i1z) objR;
        this.getClass();
        rzs0 rzs0Var2 = s321.U0;
        rzs0 rzs0Var3 = pzs0.U0;
        rzs0 rzs0Var4 = qzs0.V0;
        int i3 = i1zVar.E;
        String str2 = i1zVar.a;
        if (i3 == 3) {
            rzs0Var = rzs0Var4;
        } else if (i3 == 4) {
            rzs0Var = rzs0Var3;
        } else {
            b9v0 b9v0VarA = i1zVar.D.a(b9v0.class);
            rzs0Var = (b9v0VarA == null || !b9v0VarA.d) ? rzs0.V0 : rzs0Var2;
        }
        if (rzs0Var.equals(rzs0Var4)) {
            this.b.a(str2);
        } else if (rzs0Var.equals(rzs0Var3)) {
            this.c.b(str2, i1zVar.b(4));
        } else if (rzs0Var.equals(rzs0Var2)) {
            this.d.a(str2, (String) null);
        }
        return rih1.a;
    }
}
