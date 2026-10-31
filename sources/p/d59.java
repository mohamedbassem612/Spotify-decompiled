package p;

import com.spotify.mobius.First;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Next;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d59 implements MobiusLoop.Logger {
    public final i8h1 a;
    public final yok0 b;

    public d59(i8h1 i8h1Var) {
        this.a = i8h1Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        String str = yon1.G1("PUFFIN_AUTODETECT", "puffin/autodetect", 1594, "puffin").c;
        r6h1 r6h1Var = r6h1.c;
        this.b = new yok0(str, (byte) 25);
    }

    public final void a(Object obj, Object obj2, Next next) {
        c59 c59Var = (c59) obj2;
        prn1 prn1Var = ((h59) obj).a;
        if (next.d()) {
            h59 h59Var = (h59) next.g();
            if (prn1Var.getClass() != h59Var.a.getClass()) {
                g(h59Var);
            }
        }
        y6h1 y6h1Var = this.b.b;
        boolean zEquals = c59Var.equals(o49.a);
        b7x b7xVar = b7x.a;
        i8h1 i8h1Var = this.a;
        if (zEquals) {
            if (prn1Var instanceof ldr0) {
                x6h1 x6h1VarC = y6h1Var.c();
                x6h1VarC.i.add(new a7h1("autodetect_wireless_matched_specific_state_screen", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
            } else if (prn1Var.equals(odr0.b)) {
                x6h1 x6h1VarC3 = y6h1Var.c();
                x6h1VarC3.i.add(new a7h1("autodetect_disconnect_error_screen", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
            }
        }
        if (c59Var.equals(p49.a) && (prn1Var instanceof ldr0)) {
            x6h1 x6h1VarC5 = y6h1Var.c();
            x6h1VarC5.i.add(new a7h1("autodetect_wireless_matched_specific_state_screen", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC5.j = true;
            x6h1 x6h1VarC6 = x6h1VarC5.a().c();
            x6h1VarC6.i.add(new a7h1("turn_on_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC6.j = false;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        }
        if (c59Var.equals(b59.a) && (prn1Var instanceof ldr0)) {
            x6h1 x6h1VarC7 = y6h1Var.c();
            x6h1VarC7.i.add(new a7h1("autodetect_wireless_matched_specific_state_screen", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC7.j = true;
            x6h1 x6h1VarC8 = x6h1VarC7.a().c();
            x6h1VarC8.i.add(new a7h1("wrong_headphones_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC8.j = false;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:internal:puffin-setup-manual-select")), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        }
    }

    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2, Exception exc) {
    }

    public final void c(Object obj, First first) {
        g((h59) first.d());
    }

    public final /* bridge */ /* synthetic */ void d(Object obj, Object obj2) {
    }

    public final /* bridge */ /* synthetic */ void e(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void f(Object obj, Exception exc) {
    }

    public final void g(h59 h59Var) {
        y6h1 y6h1Var = this.b.b;
        prn1 prn1Var = h59Var.a;
        boolean z = prn1Var instanceof ldr0;
        i8h1 i8h1Var = this.a;
        if (z) {
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("autodetect_wireless_matched_specific_state_screen", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = true;
            y6h1 y6h1VarA = x6h1VarC.a();
            k7h1 k7h1Var = new k7h1();
            ((xjn) k7h1Var).a = y6h1VarA;
            ((xjn) k7h1Var).b = r6h1.c;
            ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
            i8h1Var.f(k7h1Var.a(), (Set) null);
            return;
        }
        if (prn1Var.equals(odr0.b)) {
            x6h1 x6h1VarC2 = y6h1Var.c();
            x6h1VarC2.i.add(new a7h1("autodetect_disconnect_error_screen", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = true;
            y6h1 y6h1VarA2 = x6h1VarC2.a();
            k7h1 k7h1Var2 = new k7h1();
            ((xjn) k7h1Var2).a = y6h1VarA2;
            ((xjn) k7h1Var2).b = r6h1.c;
            ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
            i8h1Var.f(k7h1Var2.a(), (Set) null);
        }
    }
}
