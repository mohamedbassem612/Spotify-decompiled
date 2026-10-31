package p;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentContainerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class qj4 implements iu30 {
    public final /* synthetic */ th30 a;
    public final /* synthetic */ pg30 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Class d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ pi30 f;
    public final /* synthetic */ Bundle g;
    public final /* synthetic */ int h;
    public final /* synthetic */ w8c0 i;

    public /* synthetic */ qj4(th30 th30Var, pg30 pg30Var, Context context, Class cls, ven0 ven0Var, pi30 pi30Var, Bundle bundle, int i, w8c0 w8c0Var) {
        this.a = th30Var;
        this.b = pg30Var;
        this.c = context;
        this.d = cls;
        this.e = ven0Var;
        this.f = pi30Var;
        this.g = bundle;
        this.h = i;
        this.i = w8c0Var;
    }

    public final Object invoke(Object obj) {
        l811 l811Var = new l811();
        pg30 pg30Var = this.b;
        int id = pg30Var.a().getId();
        th30 th30Var = this.a;
        zf30 zf30VarF = th30Var.F(id);
        pi30 pi30Var = this.f;
        if (zf30VarF == null) {
            zf30VarF = th30Var.N().a(this.c.getClassLoader(), this.d.getName());
            zf30VarF.V0((yf30) pi30Var.a.getValue());
            zf30VarF.T0(this.g);
            nu9 nu9Var = new nu9(th30Var);
            nu9Var.r = true;
            FragmentContainerView fragmentContainerViewA = pg30Var.a();
            String strValueOf = String.valueOf(this.h);
            zf30VarF.i1 = fragmentContainerViewA;
            zf30VarF.Q0 = true;
            nu9Var.k(fragmentContainerViewA.getId(), zf30VarF, strValueOf, 1);
            w8c0 w8c0Var = w8c0.c;
            w8c0 w8c0Var2 = this.i;
            if (w8c0Var2.a(w8c0Var)) {
                nu9Var.p(zf30VarF, w8c0Var2);
            }
            if (th30Var.U()) {
                l811Var.a = true;
                zf30VarF.s1.a(new it0(l811Var, zf30VarF, (byte) 2));
                nu9Var.i();
            } else {
                nu9Var.h();
            }
        }
        zf30 zf30Var = zf30VarF;
        th30Var.X(pg30Var.a());
        ((iu30) this.e.getValue()).invoke(zf30Var);
        return new sj4(th30Var, zf30Var, pi30Var, l811Var, (byte) 0);
    }
}
