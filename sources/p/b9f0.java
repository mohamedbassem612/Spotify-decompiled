package p;

import com.spotify.mobius.First;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Next;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b9f0 implements MobiusLoop.Logger {
    public final i8h1 a;
    public final pdl0 b = new pdl0((byte) 8);

    public b9f0(i8h1 i8h1Var) {
        this.a = i8h1Var;
    }

    public final void a(Object obj, Object obj2, Next next) {
        e9f0 e9f0Var = (e9f0) obj;
        a9f0 a9f0Var = (a9f0) obj2;
        int i = e9f0Var.a;
        y6h1 y6h1Var = this.b.b;
        boolean zEquals = a9f0Var.equals(y8f0.a);
        b7x b7xVar = b7x.a;
        i8h1 i8h1Var = this.a;
        if (zEquals) {
            Integer numValueOf = Integer.valueOf(i);
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("onboarding_page", (String) null, numValueOf, (String) null, (String) null));
            x6h1VarC.j = false;
            x6h1 x6h1VarC2 = x6h1VarC.a().c();
            x6h1VarC2.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
            return;
        }
        if (!a9f0Var.equals(z8f0.a)) {
            if (a9f0Var.equals(x8f0.a)) {
                return;
            }
            eg.o();
            return;
        }
        if (i == e9f0Var.c.size() - 1) {
            int iC = l1d.C(e9f0Var.d);
            if (iC == 0) {
                Integer numValueOf2 = Integer.valueOf(i);
                x6h1 x6h1VarC3 = y6h1Var.c();
                x6h1VarC3.i.add(new a7h1("onboarding_page", (String) null, numValueOf2, (String) null, (String) null));
                x6h1VarC3.j = false;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("end_button_close", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return;
            }
            if (iC != 1) {
                eg.o();
                return;
            }
            Integer numValueOf3 = Integer.valueOf(i);
            x6h1 x6h1VarC5 = y6h1Var.c();
            x6h1VarC5.i.add(new a7h1("onboarding_page", (String) null, numValueOf3, (String) null, (String) null));
            x6h1VarC5.j = false;
            x6h1 x6h1VarC6 = x6h1VarC5.a().c();
            x6h1VarC6.i.add(new a7h1("end_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC6.j = false;
            y6h1 y6h1VarA = x6h1VarC6.a();
            String str = nik1.c1.a;
            z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
            if (str == null) {
                str = "";
            }
            i8h1Var.m(new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
        }
    }

    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2, Exception exc) {
    }

    public final /* bridge */ /* synthetic */ void c(Object obj, First first) {
    }

    public final /* bridge */ /* synthetic */ void d(Object obj, Object obj2) {
    }

    public final /* bridge */ /* synthetic */ void e(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void f(Object obj, Exception exc) {
    }
}
