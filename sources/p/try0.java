package p;

import com.spotify.mobius.First;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Next;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class try0 implements MobiusLoop.Logger {
    public final i8h1 a;
    public final yok0 b;

    public try0(i8h1 i8h1Var) {
        this.a = i8h1Var;
        r6h1 r6h1Var = r6h1.c;
        this.b = new yok0((byte) 29);
    }

    public final void a(Object obj, Object obj2, Next next) {
        sry0 sry0Var = (sry0) obj2;
        y6h1 y6h1Var = this.b.b;
        boolean zEquals = sry0Var.equals(ory0.a);
        b7x b7xVar = b7x.a;
        i8h1 i8h1Var = this.a;
        if (zEquals) {
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("final_page", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = true;
            x6h1 x6h1VarC2 = x6h1VarC.a().c();
            x6h1VarC2.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
            return;
        }
        if (!sry0Var.equals(rry0.a)) {
            if ((sry0Var instanceof mry0) || sry0Var.equals(nry0.a) || sry0Var.equals(pry0.a) || sry0Var.equals(qry0.a)) {
                return;
            }
            eg.o();
            return;
        }
        x6h1 x6h1VarC3 = y6h1Var.c();
        x6h1VarC3.i.add(new a7h1("final_page", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC3.j = true;
        x6h1 x6h1VarC4 = x6h1VarC3.a().c();
        x6h1VarC4.i.add(new a7h1("end_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC4.j = false;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
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
