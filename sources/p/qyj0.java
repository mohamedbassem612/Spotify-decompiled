package p;

import android.os.Build;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qyj0 implements h0r0 {
    public final kly0 a;
    public final kly0 b;
    public final nt50 c;
    public final oyj0 d;
    public final ank0 e;
    public iu30 f = hxj0.f;
    public boolean g;
    public final wik0 h;
    public final v8k0 i;
    public final cbr0 j;

    public qyj0(lik1 lik1Var, p6r0 p6r0Var, psp pspVar, osp ospVar, nxo nxoVar, nxo nxoVar2, nt50 nt50Var, e5b0 e5b0Var, oyj0 oyj0Var, ank0 ank0Var) {
        this.a = nxoVar;
        this.b = nxoVar2;
        this.c = nt50Var;
        this.d = oyj0Var;
        this.e = ank0Var;
        wik0 wik0VarA = pspVar.a(new r7j0(this, (byte) 19));
        this.h = wik0VarA;
        this.i = ospVar.a(wik0VarA);
        smc0 smc0VarN = k4p1.n();
        if (Build.VERSION.SDK_INT <= 29) {
            smc0VarN.add(new bt21());
        }
        smc0VarN.add(new yxe1(new jx21(2131958683)));
        smc0VarN.add(new t1r0(true));
        smc0VarN.add(new hgr0(egr0.a, 0, 2));
        smc0VarN.add(new bn70(p6r0Var, lik1Var, (nar0) null));
        smc0VarN.add(e5b0Var);
        dbr0[] dbr0VarArr = (dbr0[]) k4p1.k(smc0VarN).toArray(new dbr0[0]);
        this.j = new cbr0((dbr0[]) Arrays.copyOf(dbr0VarArr, dbr0VarArr.length), false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.j;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return ((yuj) this.a.get()).a(f4p1.g(this.i), apo.j(-131484559, new pah0(this, (byte) 15), true), new n7e0(new pyj0(this), new yih0(this, (byte) 24), sl10.R0, hxj0.e), new xvj(r1j.b, (j2i) null, (j2i) null, false, 62));
    }
}
