package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vtk1 implements a4l {
    public final cpr a;
    public final Scheduler b;
    public final Scheduler c;
    public final agr d;
    public final Observable e;
    public ix5 f;
    public utk1 g;
    public final vku h = new vku();
    public final rku i = new rku();

    public vtk1(String str, cpr cprVar, Scheduler scheduler, Scheduler scheduler2, agr agrVar, Observable observable) {
        this.a = cprVar;
        this.b = scheduler;
        this.c = scheduler2;
        this.d = agrVar;
        this.e = observable;
    }

    @Override // p.a4l
    public final void a() {
        this.h.c();
        this.i.a();
    }

    @Override // p.a4l
    public final void b() {
        this.h.a(this.e.observeOn(this.c).subscribe(new vlk1(this, (byte) 1)));
    }

    public final void c(utk1 utk1Var) {
        String strE;
        String strS;
        int iD;
        String strD = utk1Var.a().d();
        float f = (float) utk1Var.f();
        float fD = (float) utk1Var.d();
        float fH = (float) utk1Var.h();
        int iG = utk1Var.g();
        h06 h06VarB = utk1Var.b();
        nnr nnrVarC = utk1Var.c();
        String lowerCase = (nnrVarC == null || (iD = hqq0.D(nnrVarC)) == 0) ? "" : td6.j(iD).toLowerCase(Locale.ROOT);
        boolean zI = utk1Var.i();
        String strE2 = utk1Var.e();
        boolean z = !utk1Var.a().l();
        l0l l0lVarA = utk1Var.a();
        nnr nnrVarC2 = utk1Var.c();
        if (!l0lVarA.l() || nnrVarC2 == null) {
            strE = l0lVarA.E();
        } else {
            up7 up7Var = nnrVarC2.B.a.e;
            strE = up7Var != null ? up7Var.b : nnrVarC2.o;
        }
        String str = strE;
        l0l l0lVarA2 = utk1Var.a();
        nnr nnrVarC3 = utk1Var.c();
        if (!l0lVarA2.l() || nnrVarC3 == null) {
            strS = l0lVarA2.s();
        } else {
            up7 up7Var2 = nnrVarC3.B.a.e;
            strS = up7Var2 != null ? up7Var2.c : nnrVarC3.f80p;
        }
        this.a.a(new xtk1(strD, f, fD, fH, iG, h06VarB, lowerCase, zI, strE2, z, strS, str));
    }
}
