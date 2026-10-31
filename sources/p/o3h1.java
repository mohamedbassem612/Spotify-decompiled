package p;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o3h1 implements n3h1 {
    public final i8h1 a;
    public final edr0 b;

    public o3h1(i8h1 i8h1Var, edr0 edr0Var) {
        this.a = i8h1Var;
        this.b = edr0Var;
    }

    public final void a(String str) {
        grk0 grk0VarF = f(str);
        x6h1 x6h1VarC = grk0VarF.a.c();
        x6h1VarC.i.add(new a7h1("skip_modal", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var.e = grk0VarF.b;
        this.a.f(k7h1Var.a(), (Set) null);
    }

    public final void b(String str) {
        grk0 grk0VarF = f(str);
        x6h1 x6h1VarC = grk0VarF.a.c();
        x6h1VarC.i.add(new a7h1("skip_modal", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("confirm_skip_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = true;
        y6h1 y6h1VarA = x6h1VarC2.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var.e = grk0VarF.b;
        this.a.f(k7h1Var.a(), (Set) null);
    }

    public final void c(String str) {
        x6h1 x6h1VarC = f(str).a.c();
        x6h1VarC.i.add(new a7h1("skip_modal", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("confirm_skip_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = true;
        this.a.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "")), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public final void d(String str) {
        grk0 grk0VarF = f(str);
        x6h1 x6h1VarC = grk0VarF.a.c();
        x6h1VarC.i.add(new a7h1("skip_modal", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("abort_skip_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = true;
        y6h1 y6h1VarA = x6h1VarC2.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var.e = grk0VarF.b;
        this.a.f(k7h1Var.a(), (Set) null);
    }

    public final void e(String str) {
        x6h1 x6h1VarC = f(str).a.c();
        x6h1VarC.i.add(new a7h1("skip_modal", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("abort_skip_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = true;
        y6h1 y6h1VarA = x6h1VarC2.a();
        b7x b7xVar = b7x.a;
        this.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public final grk0 f(String str) {
        return new grk0(str, this.b.b(of61.a));
    }
}
