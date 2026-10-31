package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class faf1 extends f311 {
    public final h9f1 a;
    public final int b;
    public final boolean c;
    public final ok41 d;
    public final c380 e;

    public faf1(h9f1 h9f1Var, int i, boolean z) {
        this.a = h9f1Var;
        this.b = i;
        this.c = z;
        List list = h9f1Var.b;
        this.d = new ok41((list.size() * 83) + 666);
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((wi90) it.next()).a);
        }
        this.e = mqo1.A(arrayList);
    }

    @Override // p.f311
    public final void d(i2c i2cVar, rk41 rk41Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1348671659);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(i2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(rk41Var) : x340Var.i(rk41Var) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1043) != 1042)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = v8r.q(new rfv0(0, 0));
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            che0 che0VarV = hon1.v(x340Var);
            mod.b(dhe0.a.a(che0VarV), apo.r(1628740971, new ys(this, che0VarV, ven0Var, rk41Var, i2cVar.c() * (this.b == 3 ? 0.572f : 0.563f), (byte) 13), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uoc1(i, this, i2cVar, rk41Var, function0, (byte) 27);
        }
    }

    @Override // p.qj41
    public final qk41 getDuration() {
        return this.d;
    }
}
