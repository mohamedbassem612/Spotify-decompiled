package p;

import com.spotify.mobius.First;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Next;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yty0 implements MobiusLoop.Logger {
    public final i8h1 a;
    public final qrl0 b;

    public yty0(i8h1 i8h1Var) {
        this.a = i8h1Var;
        r6h1 r6h1Var = r6h1.c;
        this.b = new qrl0((byte) 0);
    }

    public final void a(Object obj, Object obj2, Next next) {
        fuy0 fuy0Var = (fuy0) obj;
        xty0 xty0Var = (xty0) obj2;
        y6h1 y6h1Var = this.b.b;
        if (xty0Var instanceof qty0) {
            return;
        }
        boolean zEquals = xty0Var.equals(rty0.a);
        i8h1 i8h1Var = this.a;
        b7x b7xVar = b7x.a;
        if (zEquals) {
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("add_new_model_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:internal:puffin-intro")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
            return;
        }
        if (xty0Var.equals(sty0.a)) {
            x6h1 x6h1VarC2 = y6h1Var.c();
            x6h1VarC2.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
            return;
        }
        if (xty0Var.equals(tty0.a)) {
            return;
        }
        if (!xty0Var.equals(uty0.a)) {
            if ((xty0Var instanceof vty0) || (xty0Var instanceof wty0)) {
                return;
            }
            eg.o();
            return;
        }
        ltn1 ltn1Var = fuy0Var.a;
        if (!(ltn1Var instanceof mdr0)) {
            if (ltn1Var.equals(rdr0.c) || ltn1Var.equals(ydr0.c)) {
                return;
            }
            eg.o();
            return;
        }
        if (((mdr0) ltn1Var).d) {
            x6h1 x6h1VarC3 = y6h1Var.c();
            x6h1VarC3.i.add(new a7h1("always_apply_filters_toggle", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC3.j = false;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{new mmr0("state_before_toggle", "enabled"), new mmr0("state_after_toggle", "disabled")})), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
            return;
        }
        x6h1 x6h1VarC4 = y6h1Var.c();
        x6h1VarC4.i.add(new a7h1("always_apply_filters_toggle", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC4.j = false;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{new mmr0("state_before_toggle", "disabled"), new mmr0("state_after_toggle", "enabled")})), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
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
