package p;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j3h1 implements i3h1 {
    public final i8h1 a;
    public final edr0 b;

    public j3h1(i8h1 i8h1Var, edr0 edr0Var) {
        this.a = i8h1Var;
        this.b = edr0Var;
    }

    public final grk0 a(String str) {
        return new grk0(str, this.b.b(of61.a));
    }

    @Override // p.i3h1
    public final void b(String str) {
        x6h1 x6h1VarC = a(str).a.c();
        x6h1VarC.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        this.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public final void c(String str, boolean z) {
        grk0 grk0VarA = a(str);
        List list = grk0VarA.b;
        y6h1 y6h1Var = grk0VarA.a;
        i8h1 i8h1Var = this.a;
        if (z) {
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("action_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = true;
            y6h1 y6h1VarA = x6h1VarC.a();
            k7h1 k7h1Var = new k7h1();
            ((xjn) k7h1Var).a = y6h1VarA;
            ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
            k7h1Var.e = list;
            i8h1Var.f(k7h1Var.a(), (Set) null);
            return;
        }
        x6h1 x6h1VarC2 = y6h1Var.c();
        x6h1VarC2.i.add(new a7h1("secondary_action_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = true;
        y6h1 y6h1VarA2 = x6h1VarC2.a();
        k7h1 k7h1Var2 = new k7h1();
        ((xjn) k7h1Var2).a = y6h1VarA2;
        ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var2.e = list;
        i8h1Var.f(k7h1Var2.a(), (Set) null);
    }

    @Override // p.i3h1
    public final void d(int i, String str, String str2) {
        x6h1 x6h1VarC = a(str).a.c();
        x6h1VarC.i.add(new a7h1("filter_chips", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        Integer numValueOf = Integer.valueOf(i);
        x6h1 x6h1VarC2 = y6h1VarA.c();
        x6h1VarC2.i.add(new a7h1("filter_chip", (String) null, numValueOf, str2, (String) null));
        x6h1VarC2.j = true;
        y6h1 y6h1VarA2 = x6h1VarC2.a();
        b7x b7xVar = b7x.a;
        this.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("filter", 1, b7xVar), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    @Override // p.i3h1
    public final void e(String str) {
        x6h1 x6h1VarC = a(str).a.c();
        x6h1VarC.i.add(new a7h1("search_bar", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("input_field", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = true;
        this.a.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "")), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    @Override // p.i3h1
    public final void f(String str, boolean z) {
        y6h1 y6h1Var = a(str).a;
        b7x b7xVar = b7x.a;
        i8h1 i8h1Var = this.a;
        if (z) {
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("action_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = true;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
            return;
        }
        x6h1 x6h1VarC2 = y6h1Var.c();
        x6h1VarC2.i.add(new a7h1("secondary_action_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = true;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "")), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public final void g(int i, String str, String str2) {
        grk0 grk0VarA = a(str);
        x6h1 x6h1VarC = grk0VarA.a.c();
        x6h1VarC.i.add(new a7h1("filter_chips", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        Integer numValueOf = Integer.valueOf(i);
        x6h1 x6h1VarC2 = y6h1VarA.c();
        x6h1VarC2.i.add(new a7h1("filter_chip", (String) null, numValueOf, str2, (String) null));
        x6h1VarC2.j = true;
        y6h1 y6h1VarA2 = x6h1VarC2.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA2;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var.e = grk0VarA.b;
        this.a.f(k7h1Var.a(), (Set) null);
    }

    @Override // p.i3h1
    public final tv80 h(String str, int i, int i2, gxs0 gxs0Var) {
        boolean z = gxs0Var.d;
        y6h1 y6h1Var = a(str).a;
        xl81 xl81Var = gxs0Var.c;
        boolean z2 = xl81Var instanceof w4a;
        i8h1 i8h1Var = this.a;
        b7x b7xVar = b7x.a;
        if (z2) {
            Integer numValueOf = Integer.valueOf(i);
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("banner_section", (String) null, numValueOf, (String) null, (String) null));
            x6h1VarC.j = true;
            y6h1 y6h1VarA = x6h1VarC.a();
            Integer numValueOf2 = Integer.valueOf(i2);
            String str2 = ((w4a) xl81Var).a;
            x6h1 x6h1VarC2 = y6h1VarA.c();
            x6h1VarC2.i.add(new a7h1("banner_tile", (String) null, numValueOf2, str2, (String) null));
            x6h1VarC2.j = true;
            y6h1 y6h1VarA2 = x6h1VarC2.a();
            return i8h1Var.m(z ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_interest", 1, b7xVar), y6h1VarA2, r6h1.c, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("add_interest", 1, b7xVar), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
        }
        if (xl81Var instanceof qpl) {
            Integer numValueOf3 = Integer.valueOf(i);
            x6h1 x6h1VarC3 = y6h1Var.c();
            x6h1VarC3.i.add(new a7h1("squircle_section", (String) null, numValueOf3, (String) null, (String) null));
            x6h1VarC3.j = true;
            y6h1 y6h1VarA3 = x6h1VarC3.a();
            Integer numValueOf4 = Integer.valueOf(i2);
            String str3 = ((qpl) xl81Var).a;
            x6h1 x6h1VarC4 = y6h1VarA3.c();
            x6h1VarC4.i.add(new a7h1("squircle_tile", (String) null, numValueOf4, str3, (String) null));
            x6h1VarC4.j = true;
            y6h1 y6h1VarA4 = x6h1VarC4.a();
            return i8h1Var.m(z ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_interest", 1, b7xVar), y6h1VarA4, r6h1.c, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("add_interest", 1, b7xVar), y6h1VarA4, r6h1.c, System.currentTimeMillis()), (xj61) null);
        }
        if (!(xl81Var instanceof ckm0)) {
            return null;
        }
        Integer numValueOf5 = Integer.valueOf(i);
        x6h1 x6h1VarC5 = y6h1Var.c();
        x6h1VarC5.i.add(new a7h1("squircle_section", (String) null, numValueOf5, (String) null, (String) null));
        x6h1VarC5.j = true;
        y6h1 y6h1VarA5 = x6h1VarC5.a();
        Integer numValueOf6 = Integer.valueOf(i2);
        String str4 = ((ckm0) xl81Var).a;
        x6h1 x6h1VarC6 = y6h1VarA5.c();
        x6h1VarC6.i.add(new a7h1("squircle_more", (String) null, numValueOf6, str4, (String) null));
        x6h1VarC6.j = true;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public final void i(String str, int i, jxs0 jxs0Var) {
        grk0 grk0VarA = a(str);
        List list = grk0VarA.b;
        y6h1 y6h1Var = grk0VarA.a;
        if (jxs0Var instanceof gxs0) {
            gxs0 gxs0Var = (gxs0) jxs0Var;
            int i2 = gxs0Var.b;
            xl81 xl81Var = gxs0Var.c;
            boolean z = xl81Var instanceof w4a;
            i8h1 i8h1Var = this.a;
            if (z) {
                Integer numValueOf = Integer.valueOf(i2);
                x6h1 x6h1VarC = y6h1Var.c();
                x6h1VarC.i.add(new a7h1("banner_section", (String) null, numValueOf, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                Integer numValueOf2 = Integer.valueOf(i);
                String str2 = ((w4a) xl81Var).a;
                x6h1 x6h1VarC2 = y6h1VarA.c();
                x6h1VarC2.i.add(new a7h1("banner_tile", (String) null, numValueOf2, str2, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA2;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = list;
                i8h1Var.f(k7h1Var.a(), (Set) null);
                return;
            }
            if (xl81Var instanceof qpl) {
                Integer numValueOf3 = Integer.valueOf(i2);
                x6h1 x6h1VarC3 = y6h1Var.c();
                x6h1VarC3.i.add(new a7h1("squircle_section", (String) null, numValueOf3, (String) null, (String) null));
                x6h1VarC3.j = true;
                y6h1 y6h1VarA3 = x6h1VarC3.a();
                Integer numValueOf4 = Integer.valueOf(i);
                String str3 = ((qpl) xl81Var).a;
                x6h1 x6h1VarC4 = y6h1VarA3.c();
                x6h1VarC4.i.add(new a7h1("squircle_tile", (String) null, numValueOf4, str3, (String) null));
                x6h1VarC4.j = true;
                y6h1 y6h1VarA4 = x6h1VarC4.a();
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1VarA4;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var2.e = list;
                i8h1Var.f(k7h1Var2.a(), (Set) null);
                return;
            }
            if (xl81Var instanceof ckm0) {
                Integer numValueOf5 = Integer.valueOf(i2);
                x6h1 x6h1VarC5 = y6h1Var.c();
                x6h1VarC5.i.add(new a7h1("squircle_section", (String) null, numValueOf5, (String) null, (String) null));
                x6h1VarC5.j = true;
                y6h1 y6h1VarA5 = x6h1VarC5.a();
                Integer numValueOf6 = Integer.valueOf(i);
                String str4 = ((ckm0) xl81Var).a;
                x6h1 x6h1VarC6 = y6h1VarA5.c();
                x6h1VarC6.i.add(new a7h1("squircle_more", (String) null, numValueOf6, str4, (String) null));
                x6h1VarC6.j = true;
                y6h1 y6h1VarA6 = x6h1VarC6.a();
                k7h1 k7h1Var3 = new k7h1();
                ((xjn) k7h1Var3).a = y6h1VarA6;
                ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var3.e = list;
                i8h1Var.f(k7h1Var3.a(), (Set) null);
            }
        }
    }
}
