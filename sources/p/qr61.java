package p;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qr61 implements h0r0 {
    public final os61 a;
    public final rs61 b;
    public final kly0 c;
    public final kly0 d;
    public final idd1 e;
    public final cbr0 f;

    public qr61(os61 os61Var, rs61 rs61Var, ipq ipqVar, ipq ipqVar2) {
        this.a = os61Var;
        this.b = rs61Var;
        this.c = ipqVar;
        this.d = ipqVar2;
        idd1 idd1Var = new idd1(new l451(this, (byte) 24));
        this.e = idd1Var;
        smc0 smc0VarN = k4p1.n();
        smc0VarN.add(new yxe1(((xr61) idd1Var.getValue()).b()));
        v8h1 v8h1VarB = rs61Var.b();
        smc0VarN.add(v8h1VarB != null ? new bn70(rs61Var.e(), rs61Var.getViewUri(), v8h1VarB) : new bn70(rs61Var.e(), rs61Var.getViewUri(), (nar0) null));
        gn10 gn10VarA = ((xr61) idd1Var.getValue()).a();
        if (gn10VarA != null) {
            smc0VarN.add(new j0c0(gn10VarA));
        }
        smc0VarN.add(new pu00(true));
        smc0VarN.add(new t1r0(true));
        smc0VarN.add(new s9h1(14, true, false, false));
        dbr0[] dbr0VarArr = (dbr0[]) k4p1.k(smc0VarN).toArray(new dbr0[0]);
        this.f = new cbr0((dbr0[]) Arrays.copyOf(dbr0VarArr, dbr0VarArr.length), true);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.f;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        su61 su61Var = (su61) this.c.get();
        List listU = eso1.u((xr61) this.e.getValue(), this.d);
        os61 os61Var = this.a;
        return su61Var.b(os61Var.a(), listU, os61Var.b());
    }
}
