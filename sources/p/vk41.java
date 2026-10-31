package p;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vk41 {
    public final List a;
    public int b;
    public u6c1 c = new u6c1(2);
    public final oho1 d;

    public vk41(List list) {
        oho1 w6c1Var;
        this.a = list;
        Iterator it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            pj41 pj41VarB = ((zda) it.next()).b();
            if (pj41VarB instanceof nj41) {
                j += ((nj41) pj41VarB).a;
            } else if (u890.j(pj41VarB, oj41.a)) {
                w6c1Var = x6c1.c;
                this.d = w6c1Var;
            } else if (!(pj41VarB instanceof mj41)) {
                eg.o();
                throw null;
            }
        }
        w6c1Var = new w6c1(j, TimeUnit.MILLISECONDS);
        this.d = w6c1Var;
    }

    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((zda) it.next()).a();
        }
    }

    public final oho1 b() {
        return this.d;
    }

    public final void c(ConstraintLayout constraintLayout, rmr rmrVar, q881 q881Var) {
        this.b = 0;
        for (zda zdaVar : this.a) {
            zdaVar.b = rmrVar;
            zdaVar.c = q881Var;
            f3a f3aVar = zdaVar.a;
            if (constraintLayout.findViewById(f3aVar.b) == null) {
                LayoutInflater.from(constraintLayout.getContext()).inflate(f3aVar.a, (ViewGroup) constraintLayout, true);
            }
            zdaVar.d(constraintLayout);
        }
    }

    public final void d(u6c1 u6c1Var) {
        this.c = u6c1Var;
        ((zda) this.a.get(this.b)).c(u6c1Var);
    }

    public final void e() {
        ((zda) this.a.get(this.b)).e();
    }

    public final void f() {
        ((zda) this.a.get(this.b)).g();
    }

    public final void g() {
        this.b = 0;
        List list = this.a;
        ((zda) list.get(0)).f(new uk41(this));
        ((zda) list.get(this.b)).c(this.c);
    }
}
