package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a3e0 implements iu30 {
    public final pvm0 a;
    public final fey b;
    public final rok0 c;
    public final boolean d;

    public a3e0(pvm0 pvm0Var, fey feyVar, rok0 rok0Var, ot4 ot4Var) {
        this.a = pvm0Var;
        this.b = feyVar;
        this.c = rok0Var;
        this.d = ot4Var.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(lnm lnmVar) {
        z2e0 z2e0Var;
        if (lnmVar instanceof z2e0) {
            z2e0Var = (z2e0) lnmVar;
            int i = z2e0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                z2e0Var.c = i - Integer.MIN_VALUE;
            } else {
                z2e0Var = new z2e0(this, lnmVar);
            }
        } else {
            z2e0Var = new z2e0(this, lnmVar);
        }
        Object objB = z2e0Var.a;
        int i2 = z2e0Var.c;
        if (i2 == 0) {
            hm5.M(objB);
            z2e0Var.c = 1;
            objB = this.a.b(this.d, z2e0Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
        }
        eib1 eib1Var = (eib1) objB;
        dib1 dib1Var = eib1Var.c;
        ArrayList arrayList = eib1Var.b;
        String str = eib1Var.a;
        if (dib1Var == null) {
            return new w0j1(str, arrayList);
        }
        String str2 = dib1Var.b;
        String str3 = dib1Var.a;
        int i3 = dib1Var.c;
        if (i3 <= 0) {
            hhg1.n("Time step must be positive");
            return null;
        }
        long jB = (((yqg) this.c.b).b() / 1000) / ((long) i3);
        return new v0j1(str, arrayList, new u0j1(i3, str3, str2), this.b.a(jB, str3, str2), jB);
    }
}
