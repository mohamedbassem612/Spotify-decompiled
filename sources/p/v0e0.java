package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v0e0 {
    public final d0r a;
    public final o3r b;

    public v0e0(d0r d0rVar, byte b) {
        switch (b) {
            case 1:
                this.a = d0rVar;
                this.b = w3p1.o(new l4r(hvm.c, 1, p761.T0, new j4r(p761.R0), p761.U0), p761.S0);
                break;
            default:
                this.a = d0rVar;
                jd11 jd11Var = rc11.a;
                this.b = w3p1.j(new l4r(new xv00(jd11Var.b(uia.class)), 2, god0.Y0, new j4r(god0.S0), god0.Z0), new l4r(new xv00(jd11Var.b(uia.class)), 2, god0.a1, new j4r(god0.T0), god0.b1), new l4r(new xv00(jd11Var.b(hll.class)), 1, u0e0.c, new j4r(god0.U0), u0e0.d), new l4r(new xv00(jd11Var.b(hll.class)), 1, u0e0.e, new j4r(god0.V0), u0e0.f), new l4r(new xv00(jd11Var.b(ro7.class)), 2, god0.c1, new j4r(god0.W0), god0.d1), new l4r(new xv00(jd11Var.b(ro7.class)), 2, god0.e1, new j4r(god0.X0), u0e0.b), mcm.i);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public void a(vr20 vr20Var, m0k0 m0k0Var, onm onmVar) {
        t0e0 t0e0Var;
        if (onmVar instanceof t0e0) {
            t0e0Var = (t0e0) onmVar;
            int i = t0e0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                t0e0Var.c = i - Integer.MIN_VALUE;
            } else {
                t0e0Var = new t0e0(this, onmVar);
            }
        } else {
            t0e0Var = new t0e0(this, onmVar);
        }
        Object obj = t0e0Var.a;
        int i2 = t0e0Var.c;
        if (i2 != 0) {
            if (i2 == 1) {
                throw l1d.v(obj);
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
        } else {
            hm5.M(obj);
            ay8 ay8VarF = d3p1.F(this.a, this.b, new mmr0(m0k0Var.a, m0k0Var.b));
            a8d0 a8d0Var = new a8d0((Object) vr20Var, (Object) m0k0Var, (byte) 8);
            t0e0Var.c = 1;
            ay8VarF.collect(a8d0Var, t0e0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(String str, onm onmVar) {
        e861 e861Var;
        if (onmVar instanceof e861) {
            e861Var = (e861) onmVar;
            int i = e861Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                e861Var.d = i - Integer.MIN_VALUE;
            } else {
                e861Var = new e861(this, onmVar);
            }
        } else {
            e861Var = new e861(this, onmVar);
        }
        Object objJ = e861Var.b;
        int i2 = e861Var.d;
        if (i2 == 0) {
            hm5.M(objJ);
            ay8 ay8VarF = d3p1.F(this.a, this.b, str);
            ck01 ck01Var = new ck01(2, (lnm) null, (byte) 14);
            e861Var.a = str;
            e861Var.d = 1;
            objJ = b5p1.j(ay8VarF, ck01Var, e861Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = e861Var.a;
            hm5.M(objJ);
        }
        i1r i1rVar = (k1r) objJ;
        if (i1rVar instanceof i1r) {
            List list = (List) i1rVar.a;
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new m761(((pvc0) it.next()).c));
            }
            return new f861(str, arrayList);
        }
        if (i1rVar instanceof h1r) {
            k220.i(((h1r) i1rVar).a.getMessage());
            return null;
        }
        if (u890.j(i1rVar, j1r.a)) {
            eg.m("filtered above");
            return null;
        }
        eg.o();
        return null;
    }
}
