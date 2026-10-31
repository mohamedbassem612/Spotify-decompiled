package p;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class an0 implements wpw {
    public m62 N0;
    public final js20 O0;
    public final nsw P0 = jch0.j(new m3(this, (byte) 10));
    public final eih1 Q0 = new eih1();
    public final aq0 X;
    public final zm4 Y;
    public m62 Z;
    public final Observable a;
    public final u961 b;
    public final p2p0 c;
    public final h21 d;
    public final j62 e;
    public final xfx f;
    public final Resources g;
    public final ko0 h;
    public final dg30 i;
    public final up0 t;

    public an0(Observable observable, u961 u961Var, p2p0 p2p0Var, h21 h21Var, j62 j62Var, xfx xfxVar, Resources resources, ko0 ko0Var, dg30 dg30Var, up0 up0Var, aq0 aq0Var, zm4 zm4Var, am30 am30Var) {
        this.a = observable;
        this.b = u961Var;
        this.c = p2p0Var;
        this.d = h21Var;
        this.e = j62Var;
        this.f = xfxVar;
        this.g = resources;
        this.h = ko0Var;
        this.i = dg30Var;
        this.t = up0Var;
        this.X = aq0Var;
        this.Y = zm4Var;
        this.O0 = w3p1.p(new x010(yoi1.g(observable), am30Var.a(), new vm0(3, (lnm) null, (byte) 0), (byte) 1), di0.t, new ab(this, (byte) 14), (o8n) null, new j2(this, (byte) 12), 8);
    }

    public final rqw a() {
        return this.Q0;
    }

    public final rsw c() {
        return this.P0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object e(l62 l62Var, boolean z, ou80 ou80Var, onm onmVar) {
        ym0 ym0Var;
        t7d1 t7d1Var;
        l62 l62Var2 = l62Var;
        if (onmVar instanceof ym0) {
            ym0Var = (ym0) onmVar;
            int i = ym0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ym0Var.d = i - Integer.MIN_VALUE;
            } else {
                ym0Var = new ym0(this, onmVar);
            }
        } else {
            ym0Var = new ym0(this, onmVar);
        }
        Object objI = ym0Var.b;
        int i2 = ym0Var.d;
        if (i2 == 0) {
            hm5.M(objI);
            ds10 ds10Var = new ds10(l62Var2.T0, l62Var2.Z instanceof lsn, z);
            String str = l62Var2.f;
            if (str.length() == 0) {
                str = l62Var2.g;
            }
            this.t.b(ds10Var, !ihc1.y0(str) ? str : null, l62Var2.i, l62Var2.c, l62Var2.X, l62Var2.t, l62Var2.b, l62Var2.V0, l62Var2.R0.a, l62Var2.S0.a, (Long) null, (Double) null, ou80Var.a);
            gk gkVar = new gk(d5p1.g(this.X.a.a), l62Var2, (byte) 4);
            ym0Var.a = l62Var2;
            ym0Var.d = 1;
            objI = b5p1.i(gkVar, ym0Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l62Var2 = ym0Var.a;
            hm5.M(objI);
        }
        xx10 xx10Var = (xx10) objI;
        if (xx10Var instanceof ux10) {
            n42 n42VarA = this.d.a();
            Parcelable o52Var = new o52(l62Var2.i, l62Var2.t, l62Var2.c, l62Var2.X, l62Var2.b, l62Var2.f, "ad_npv");
            Bundle bundle = new Bundle();
            bundle.putParcelable("ad-data", o52Var);
            n42VarA.T0(bundle);
            this.c.d(n42VarA, "AdsDsaDialogFragment");
        } else if (xx10Var instanceof rx10) {
            ti tiVar = l62Var2.Z;
            lsn lsnVar = tiVar instanceof lsn ? (lsn) tiVar : null;
            if (lsnVar != null && (t7d1Var = lsnVar.c.d) != null) {
                this.h.c(this.i, new a580(t7d1Var.b, l62Var2.t, l62Var2.b, l62Var2.X));
            }
        } else if (!(xx10Var instanceof sx10)) {
            if (xx10Var instanceof tx10) {
                m62 m62Var = this.Z;
                if (m62Var != null) {
                    m62Var.invoke();
                }
            } else if (xx10Var instanceof vx10) {
                m62 m62Var2 = this.N0;
                if (m62Var2 != null) {
                    m62Var2.invoke();
                }
            } else if (!(xx10Var instanceof wx10)) {
                eg.o();
                return null;
            }
        }
        return rih1.a;
    }

    public final mqw getBehavior() {
        return this.O0;
    }
}
