package p;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kpn implements h0r0 {
    public final /* synthetic */ byte a = 0;
    public final boolean b;
    public final cbr0 c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public kpn(z7e0 z7e0Var, mfp mfpVar, tj00 tj00Var, bn70 bn70Var, mk00 mk00Var, w25 w25Var, t380 t380Var, boolean z, t2j0 t2j0Var, dxz0 dxz0Var, lmo lmoVar) {
        this.d = z7e0Var;
        this.e = mfpVar;
        this.f = tj00Var;
        this.g = w25Var;
        this.b = z;
        smc0 smc0VarN = k4p1.n();
        smc0VarN.add(new yxe1(new jx21(2131955785)));
        smc0VarN.add(bn70Var);
        smc0VarN.add(new t1r0(true));
        smc0VarN.add(new t7r0(zno1.t(oqn1.n("page_type", "CN"))));
        smc0VarN.add(new pu00(true));
        smc0VarN.add(new q1r0(w25Var.d0() || w25Var.g0()));
        smc0VarN.add(new qsm0(mk00Var));
        smc0VarN.add(new x7u0());
        ArrayList arrayList = new ArrayList();
        for (Object obj : t380Var) {
            l2r l2rVar = (l2r) obj;
            if (!(l2rVar instanceof kvc0) && !(l2rVar instanceof jxc0)) {
                arrayList.add(obj);
            }
        }
        smc0VarN.add(new e5b0(14, arrayList, null));
        smc0VarN.add(new s9h1(14, true, false, false));
        if (((w25) this.g).J()) {
            smc0VarN.add(new n5b0(new ukj0(lmoVar.a, new tkj0(t2j0Var, dxz0Var))));
        }
        dbr0[] dbr0VarArr = (dbr0[]) k4p1.k(smc0VarN).toArray(new dbr0[0]);
        this.c = new cbr0((dbr0[]) Arrays.copyOf(dbr0VarArr, dbr0VarArr.length), false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        byte b = this.a;
        return this.c;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        switch (this.a) {
            case 0:
                return ((qyj) this.e).a(apo.j(1724250528, new h1m(this, (byte) 23), true));
            default:
                z7e0 z7e0Var = (z7e0) this.d;
                return new w6e0((tj00) this.f, z7e0Var, new u7r0(a4p1.n(), null, null, false, ((w25) this.g).Z(), 62), new s20(this, (byte) 27), (byte) 3);
        }
    }

    public kpn(Resources resources, p6r0 p6r0Var, vuf0 vuf0Var, i8p i8pVar, qyj qyjVar, mpn mpnVar, boolean z, ynb0 ynb0Var) {
        this.d = i8pVar;
        this.e = qyjVar;
        this.f = mpnVar;
        this.b = z;
        this.g = ynb0Var;
        this.c = new cbr0(new dbr0[]{new yxe1(new ehc1("")), new bn70(p6r0Var, vuf0Var.getViewUri(), (nar0) null), new nxb((Integer) null, ixb.b, Integer.valueOf(resources.getDimensionPixelSize(2131165580)), 0, (mxb) null, (los) null, false, false, true, (nsm0) null, 3833), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }
}
