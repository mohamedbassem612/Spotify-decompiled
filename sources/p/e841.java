package p;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e841 implements vih0 {
    public final nba a;
    public final tn31 b;
    public final m210 c;
    public final zv4 d;
    public final q881 e;
    public final kpw f;
    public final ajq0 g;
    public xab1 h;
    public final llm i;

    public e841(ruk rukVar, x610 x610Var, lxh0 lxh0Var, kjq kjqVar, zv4 zv4Var, q881 q881Var, q8n q8nVar, kpw kpwVar, ajq0 ajq0Var) {
        nba nbaVarB = kjqVar.b(rukVar, x610Var, lxh0Var);
        tn31 tn31Var = rukVar.b;
        m210 m210Var = rukVar.d;
        this.a = nbaVarB;
        this.b = tn31Var;
        this.c = m210Var;
        this.d = zv4Var;
        this.e = q881Var;
        this.f = kpwVar;
        this.g = ajq0Var;
        this.i = smo1.e(q8nVar);
    }

    public final Set a() {
        return this.a.a();
    }

    public final void b(vsr0 vsr0Var) {
        this.a.b(vsr0Var);
    }

    public final void c(vsr0 vsr0Var, Bundle bundle, iu30 iu30Var) {
        this.a.c(vsr0Var, bundle, iu30Var);
    }

    public final void d(String str, Bundle bundle, String str2, q1m q1mVar, iu30 iu30Var, vu30 vu30Var, Function0 function0) {
        if (u890.j(str2, "com.samsung.android.smartsuggestions") && this.d.a()) {
            vu30Var.invoke(pih0.a, "Samsung Now Brief is disabled.");
            return;
        }
        xab1 xab1Var = this.h;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.h = fn31.T(this.i, (o8n) null, 0, new yn0(this, str2, bundle, str, q1mVar, iu30Var, vu30Var, function0, (lnm) null, (byte) 9), 3);
    }

    public final void destroy() {
        this.a.destroy();
        smo1.p(this.i, (CancellationException) null);
    }

    public final vsr0 e() {
        return this.a.a.c();
    }

    public final lxh0 f() {
        return this.a.c;
    }

    public final long g() {
        return this.a.n;
    }

    public final boolean h() {
        return this.a.h();
    }

    public final void i(vsr0 vsr0Var) {
        this.a.i(vsr0Var);
    }

    public final void j(vsr0 vsr0Var) {
        this.a.j(vsr0Var);
    }

    public final boolean k() {
        return this.a.k();
    }

    public final String l() {
        return this.a.a.b();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object m(String str, String str2, q1m q1mVar, iu30 iu30Var, vu30 vu30Var, onm onmVar) {
        d841 d841Var;
        Object objA;
        String str3;
        ruk rukVar = this.a.a;
        if (onmVar instanceof d841) {
            d841Var = (d841) onmVar;
            int i = d841Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                d841Var.f = i - Integer.MIN_VALUE;
            } else {
                d841Var = new d841(this, onmVar);
            }
        } else {
            d841Var = new d841(this, onmVar);
        }
        d841 d841Var2 = d841Var;
        Object obj = d841Var2.d;
        int i2 = d841Var2.f;
        if (i2 == 0) {
            hm5.M(obj);
            String strB = rukVar.b();
            d841Var2.a = str2;
            d841Var2.b = (hab0) iu30Var;
            d841Var2.c = (hab0) vu30Var;
            d841Var2.f = 1;
            objA = this.f.a(str, str2, strB, q1mVar, d841Var2);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
            str3 = str2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vu30Var = (vu30) d841Var2.c;
            iu30Var = (iu30) d841Var2.b;
            str3 = d841Var2.a;
            hm5.M(obj);
            objA = ((e331) obj).a;
        }
        Throwable thA = e331.a(objA);
        rih1 rih1Var = rih1.a;
        if (thA != null) {
            String message = thA.getMessage();
            if (message == null) {
                message = "Unknown error during search.";
            }
            vu30Var.invoke(pih0.c, message);
            return rih1Var;
        }
        List<phh0> listB = this.e.b((List) objA, str3 == null ? rukVar.b() : str3, this.b.g);
        if (u890.j(str3, "com.samsung.android.smartsuggestions")) {
            ArrayList arrayList = new ArrayList(q7h.U(listB, 10));
            for (phh0 phh0Var : listB) {
                arrayList.add(new phh0(phh0Var.a, phh0Var.b, "", phh0Var.d, phh0Var.e, phh0Var.f, phh0Var.g));
            }
            listB = arrayList;
        }
        iu30Var.invoke(listB);
        return rih1Var;
    }
}
