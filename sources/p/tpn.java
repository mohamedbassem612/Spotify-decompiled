package p;

import android.os.Build;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tpn implements h0r0 {
    public final kly0 a;
    public final cbr0 b;

    public tpn(jly0 jly0Var, dqn dqnVar) {
        int i;
        this.a = jly0Var;
        smc0 smc0VarN = k4p1.n();
        smc0VarN.add(new t1r0(true));
        smc0VarN.add(new s9h1(14, true, false, false));
        aqn aqnVar = dqnVar.b.c;
        if (aqnVar instanceof zpn) {
            i = ((zpn) aqnVar).b ? 2131954666 : 2131954675;
        } else {
            if (!(aqnVar instanceof vpn)) {
                eg.o();
                throw null;
            }
            i = 2131954627;
        }
        smc0VarN.add(new yxe1(new jx21(i)));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        smc0VarN.add(new bn70((n6r0) yon1.D3(), nik1.C1, (v8h1) t6p1.l(yon1.D3().c)));
        if (Build.VERSION.SDK_INT <= 29) {
            smc0VarN.add(new bt21());
        }
        dbr0[] dbr0VarArr = (dbr0[]) k4p1.k(smc0VarN).toArray(new dbr0[0]);
        this.b = new cbr0((dbr0[]) Arrays.copyOf(dbr0VarArr, dbr0VarArr.length), false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.b;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        zsc zscVarA = ((y8p) this.a.get()).a();
        yuj yujVar = (yuj) zscVarA.e;
        o6e0 o6e0Var = (o6e0) zscVarA.c;
        l7m0 l7m0Var = (l7m0) zscVarA.b;
        return yuj.b(yujVar, o6e0Var, apo.j(757077441, new zee(zscVarA, (byte) 22), true), new n7e0(new k7m0(l7m0Var), new ry90(l7m0Var, (byte) 29), va20.O0, new nrj0(l7m0Var, (byte) 7)));
    }
}
