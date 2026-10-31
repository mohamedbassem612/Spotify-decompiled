package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class odz extends fy31 {
    public final boolean U0;
    public final qzh V0;
    public final ufs W0;

    public odz(boolean z, qzh qzhVar, ufs ufsVar) {
        super(qzhVar.getView());
        this.U0 = z;
        this.V0 = qzhVar;
        this.W0 = ufsVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006b  */
    /* JADX WARN: Code duplicated, block: B:19:0x006f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0073  */
    /* JADX WARN: Code duplicated, block: B:22:0x0076  */
    /* JADX WARN: Code duplicated, block: B:25:0x0098  */
    /* JADX WARN: Code duplicated, block: B:27:0x009c  */
    public final void E(bw31 bw31Var, List list, ym ymVar) {
        ziw0 yiw0Var;
        ziw0 ajw0Var;
        k4m k4mVar;
        qk1 qk1Var;
        bv31 bv31Var = (bv31) bw31Var;
        jh90 jh90Var = bv31Var.a;
        String str = jh90Var.b;
        boolean z = bv31Var.b;
        tfs tfsVarA = this.W0.a(str, (int) jh90Var.t, (int) jh90Var.i, (Integer) null, false, false);
        tfsVarA.i = false;
        tfsVarA.g = true;
        tfsVarA.g("d MMM yyyy");
        tfsVarA.f = 2;
        String strA = tfsVarA.a();
        String str2 = jh90Var.c;
        String str3 = jh90Var.f;
        nv31 nv31Var = bv31Var.d;
        if (nv31Var instanceof jv31) {
            ajw0Var = ziw0.a;
        } else {
            if (!(nv31Var instanceof lv31)) {
                if (nv31Var instanceof kv31) {
                    ajw0Var = ziw0.b;
                } else if (!(nv31Var instanceof mv31)) {
                    eg.o();
                    return;
                } else {
                    mv31 mv31Var = (mv31) nv31Var;
                    yiw0Var = new yiw0(mv31Var.a, mv31Var.b);
                }
                String strR = aqo1.r(((w611) this).a.getContext(), jh90Var);
                if (jh90Var.h) {
                    k4mVar = k4m.a;
                } else if (jh90Var.g) {
                    k4mVar = k4m.b;
                } else {
                    k4mVar = k4m.d;
                }
                k4m k4mVar2 = k4mVar;
                String str4 = jh90Var.b;
                boolean zContains = list.contains("addStateChanged");
                qzh qzhVar = this.V0;
                String string = qzhVar.getView().getContext().getString(2131952505);
                if (bv31Var.e == 1) {
                    qk1Var = qk1.b;
                } else {
                    qk1Var = qk1.a;
                }
                qzhVar.f(new u9z(str, strR, strA, str3, str2, z, new pk1(qk1Var, zContains, str4, string, tk1.c), yiw0Var, k4mVar2));
                qzhVar.n(new lhx(ymVar, jh90Var, this, bw31Var, (byte) 5));
            }
            ajw0Var = new ajw0((cjw0) null);
        }
        yiw0Var = ajw0Var;
        String strR2 = aqo1.r(((w611) this).a.getContext(), jh90Var);
        if (jh90Var.h) {
            k4mVar = k4m.a;
        } else if (jh90Var.g) {
            k4mVar = k4m.b;
        } else {
            k4mVar = k4m.d;
        }
        k4m k4mVar3 = k4mVar;
        String str5 = jh90Var.b;
        boolean zContains2 = list.contains("addStateChanged");
        qzh qzhVar2 = this.V0;
        String string2 = qzhVar2.getView().getContext().getString(2131952505);
        if (bv31Var.e == 1) {
            qk1Var = qk1.b;
        } else {
            qk1Var = qk1.a;
        }
        qzhVar2.f(new u9z(str, strR2, strA, str3, str2, z, new pk1(qk1Var, zContains2, str5, string2, tk1.c), yiw0Var, k4mVar3));
        qzhVar2.n(new lhx(ymVar, jh90Var, this, bw31Var, (byte) 5));
    }
}
