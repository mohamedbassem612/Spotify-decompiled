package p;

import android.content.Context;
import android.os.Build;
import android.view.View;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j0g0 {
    public final tiq a;
    public final viq b;
    public final boolean c;
    public final Context d;
    public final View e;

    public j0g0(tiq tiqVar, viq viqVar, boolean z, Context context, View view) {
        this.a = tiqVar;
        this.b = viqVar;
        this.c = z;
        this.d = context;
        this.e = view;
    }

    public final void a(v0g0 v0g0Var, j6r0 j6r0Var, b0k b0kVar, int i) {
        int i2;
        fkk1 w5r0Var;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1918483976);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(v0g0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(j6r0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == obj) {
                teq teqVar = this.a.a.c;
                objT = (lzh) new yge0((uiq) teqVar.b.Aa.get(), zgf0.k(xqu.a(teqVar.n7), xqu.a(teqVar.p7)), v0g0Var, this.d, this.c).c;
                x340Var.s0(objT);
            }
            lzh lzhVar = (lzh) objT;
            boolean z2 = (i2 & 112) == 32;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == obj) {
                Observable observable = j6r0Var.a;
                thq thqVar = this.b.a;
                teq teqVar2 = thqVar.c;
                dg30 dg30Var = (dg30) teqVar2.f.a;
                teq teqVar3 = teqVar2.b.b;
                y45 y45Var = new y45(false, (luk) teqVar3.d.L1.get());
                eua0 eua0Var = (eua0) teqVar3.Eg.get();
                ced1 ced1Var = (ced1) teqVar3.Fg.get();
                mmo mmoVar = (mmo) teqVar3.z5.get();
                dg30 dg30Var2 = (dg30) teqVar3.f.a;
                wbr0 wbr0Var = (wbr0) teqVar2.Jg.get();
                sbr0 sbr0Var = (sbr0) teqVar2.Lg.get();
                teq teqVar4 = teqVar2.b.b;
                b0g0 b0g0Var = new b0g0((axn0) teqVar4.A5.get(), (dar0) teqVar4.N6.get());
                o7r0 o7r0Var = (o7r0) teqVar2.G2.get();
                dg0 dg0Var = (dg0) thqVar.b.Pg.get();
                n0g0 n0g0Var = new n0g0(0, teqVar2.Og, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 0);
                if (Build.VERSION.SDK_INT >= 30) {
                    View decorView = dg30Var2.getWindow().getDecorView();
                    s6p0 s6p0Var = new s6p0(this.e, mmoVar, dg30Var2);
                    y45Var.a();
                    w5r0Var = new z0g0(decorView, s6p0Var, dg30Var2, eua0Var, ced1Var);
                } else {
                    w5r0Var = new w5r0((byte) 1);
                }
                objT2 = new b6r0(dg30Var, dg30Var, o7r0Var, w5r0Var, wbr0Var, sbr0Var, null, ck7.a, dg0Var.a(dg30Var), observable, b0g0Var, null, n0g0Var, 8608);
                x340Var.s0(objT2);
            }
            eqn1.h(grn1.w(lzhVar, (b6r0) objT2, rih1.a, x340Var, 384), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqd0(this, v0g0Var, j6r0Var, i, (byte) 11);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0g0)) {
            return false;
        }
        j0g0 j0g0Var = (j0g0) obj;
        return u890.j(this.a, j0g0Var.a) && u890.j(this.b, j0g0Var.b) && this.c == j0g0Var.c && this.d.equals(j0g0Var.d) && u890.j(this.e, j0g0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31);
    }
}
