package p;

import com.spotify.mobius.First;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Next;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zjg0 implements MobiusLoop.Logger {
    public final i8h1 a;
    public final String b;
    public final yok0 c;

    public zjg0(String str, i8h1 i8h1Var) {
        this.a = i8h1Var;
        this.b = str;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        String str2 = yon1.G1("PUFFIN_MANUAL_SELECT", "puffin/manual-select", 1598, "puffin").c;
        r6h1 r6h1Var = r6h1.c;
        this.c = new yok0(str2, (byte) 28);
    }

    public final void a(Object obj, Object obj2, Next next) {
        yjg0 yjg0Var = (yjg0) obj2;
        rrn1 rrn1Var = ((hkg0) obj).g;
        if (next.d()) {
            hkg0 hkg0Var = (hkg0) next.g();
            if (rrn1Var.getClass() != hkg0Var.g.getClass()) {
                g(hkg0Var);
            }
        }
        y6h1 y6h1Var = this.c.b;
        boolean zEquals = yjg0Var.equals(kjg0.a);
        b7x b7xVar = b7x.a;
        i8h1 i8h1Var = this.a;
        if (zEquals) {
            if (rrn1Var.equals(ndr0.c)) {
                x6h1 x6h1VarC = y6h1Var.c();
                x6h1VarC.i.add(new a7h1("manualselection_disconnect_error_screen", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return;
            }
            if (rrn1Var instanceof aer0) {
                x6h1 x6h1VarC3 = y6h1Var.c();
                x6h1VarC3.i.add(new a7h1("manualselection_connected_screen", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return;
            }
            return;
        }
        if (yjg0Var.equals(hjg0.a)) {
            if (rrn1Var instanceof aer0) {
                x6h1 x6h1VarC5 = y6h1Var.c();
                x6h1VarC5.i.add(new a7h1("manualselection_connected_screen", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = true;
                x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                x6h1VarC6.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return;
            }
            return;
        }
        boolean z = yjg0Var instanceof ljg0;
        String str = this.b;
        if (!z) {
            if (!(yjg0Var instanceof jjg0)) {
                if (yjg0Var.equals(xjg0.a)) {
                    x6h1 x6h1VarC7 = y6h1Var.c();
                    x6h1VarC7.i.add(new a7h1("optimizing_screen", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                    x6h1VarC8.i.add(new a7h1("start_listening", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    return;
                }
                return;
            }
            x6h1 x6h1VarC9 = y6h1Var.c();
            x6h1VarC9.i.add(new a7h1("manualselection_connected_screen", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC9.j = true;
            x6h1 x6h1VarC10 = x6h1VarC9.a().c();
            x6h1VarC10.i.add(new a7h1("results_list", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC10.j = false;
            x6h1 x6h1VarC11 = x6h1VarC10.a().c();
            x6h1VarC11.i.add(new a7h1("not_listed_row", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC11.j = false;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC11.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
            return;
        }
        cpa1 cpa1Var = ((ljg0) yjg0Var).a;
        if (cpa1Var instanceof cpa1) {
            x6h1 x6h1VarC12 = y6h1Var.c();
            x6h1VarC12.i.add(new a7h1("manualselection_connected_screen", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC12.j = true;
            x6h1 x6h1VarC13 = x6h1VarC12.a().c();
            x6h1VarC13.i.add(new a7h1("results_list", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC13.j = false;
            y6h1 y6h1VarA = x6h1VarC13.a();
            String str2 = cpa1Var.a;
            x6h1 x6h1VarC14 = y6h1VarA.c();
            x6h1VarC14.i.add(new a7h1("filter_row", str2, (Integer) null, (String) null, (String) null));
            x6h1VarC14.j = false;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC14.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
            return;
        }
        if (cpa1Var instanceof jz3) {
            x6h1 x6h1VarC15 = y6h1Var.c();
            x6h1VarC15.i.add(new a7h1("manualselection_ambiguous_screen", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC15.j = true;
            x6h1 x6h1VarC16 = x6h1VarC15.a().c();
            x6h1VarC16.i.add(new a7h1("results_list", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC16.j = false;
            y6h1 y6h1VarA2 = x6h1VarC16.a();
            String str3 = ((jz3) cpa1Var).a;
            x6h1 x6h1VarC17 = y6h1VarA2.c();
            x6h1VarC17.i.add(new a7h1("filter_row", str3, (Integer) null, (String) null, (String) null));
            x6h1VarC17.j = false;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC17.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        }
    }

    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2, Exception exc) {
    }

    public final void c(Object obj, First first) {
        g((hkg0) first.d());
    }

    public final /* bridge */ /* synthetic */ void d(Object obj, Object obj2) {
    }

    public final /* bridge */ /* synthetic */ void e(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void f(Object obj, Exception exc) {
    }

    public final void g(hkg0 hkg0Var) {
        y6h1 y6h1Var = this.c.b;
        rrn1 rrn1Var = hkg0Var.g;
        boolean z = rrn1Var instanceof aer0;
        i8h1 i8h1Var = this.a;
        if (z) {
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("manualselection_connected_screen", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = true;
            y6h1 y6h1VarA = x6h1VarC.a();
            k7h1 k7h1Var = new k7h1();
            ((xjn) k7h1Var).a = y6h1VarA;
            ((xjn) k7h1Var).b = r6h1.c;
            ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
            i8h1Var.f(k7h1Var.a(), (Set) null);
            return;
        }
        if (rrn1Var instanceof idr0) {
            x6h1 x6h1VarC2 = y6h1Var.c();
            x6h1VarC2.i.add(new a7h1("manualselection_ambiguous_screen", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = true;
            y6h1 y6h1VarA2 = x6h1VarC2.a();
            k7h1 k7h1Var2 = new k7h1();
            ((xjn) k7h1Var2).a = y6h1VarA2;
            ((xjn) k7h1Var2).b = r6h1.c;
            ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
            i8h1Var.f(k7h1Var2.a(), (Set) null);
            return;
        }
        if (!rrn1Var.equals(ndr0.c)) {
            if (rrn1Var.equals(qdr0.c) || rrn1Var.equals(jdr0.c)) {
                return;
            }
            eg.o();
            return;
        }
        x6h1 x6h1VarC3 = y6h1Var.c();
        x6h1VarC3.i.add(new a7h1("manualselection_disconnect_error_screen", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC3.j = true;
        y6h1 y6h1VarA3 = x6h1VarC3.a();
        k7h1 k7h1Var3 = new k7h1();
        ((xjn) k7h1Var3).a = y6h1VarA3;
        ((xjn) k7h1Var3).b = r6h1.c;
        ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
        i8h1Var.f(k7h1Var3.a(), (Set) null);
    }
}
