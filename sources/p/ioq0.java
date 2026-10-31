package p;

import com.spotify.mobius.First;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Next;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ioq0 implements MobiusLoop.Logger {
    public final i8h1 a;
    public final yok0 b;

    public ioq0(i8h1 i8h1Var) {
        this.a = i8h1Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        String str = yon1.G1("PUFFIN_MANAGEMENT", "puffin/management", 1597, "puffin").c;
        r6h1 r6h1Var = r6h1.c;
        this.b = new yok0(str, (byte) 26);
    }

    public final void a(Object obj, Object obj2, Next next) {
        koq0 koq0Var = (toq0) obj;
        hoq0 hoq0Var = (hoq0) obj2;
        joq0 joq0Var = joq0.f;
        if (next.d()) {
            toq0 toq0Var = (toq0) next.g();
            if (koq0Var.getClass() != toq0Var.getClass()) {
                g(toq0Var);
            }
        }
        joq0 joq0Var2 = joq0.e;
        joq0 joq0Var3 = joq0.d;
        joq0 joq0Var4 = joq0.c;
        joq0 joq0Var5 = joq0.b;
        joq0 joq0Var6 = joq0.a;
        y6h1 y6h1Var = this.b.b;
        boolean z = hoq0Var instanceof eoq0;
        i8h1 i8h1Var = this.a;
        b7x b7xVar = b7x.a;
        if (z) {
            if (koq0Var instanceof koq0) {
                if (koq0Var.a.b().f) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("optimizations_device_setup", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = true;
                    x6h1 x6h1VarC2 = x6h1VarC.a().c();
                    x6h1VarC2.i.add(new a7h1("specific_filter_toggle", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{new mmr0("state_before_toggle", "filter_on"), new mmr0("state_after_toggle", "filter_off")})), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else {
                    x6h1 x6h1VarC3 = y6h1Var.c();
                    x6h1VarC3.i.add(new a7h1("optimizations_device_setup", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = true;
                    x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                    x6h1VarC4.i.add(new a7h1("specific_filter_toggle", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{new mmr0("state_before_toggle", "filter_off"), new mmr0("state_after_toggle", "filter_on")})), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                }
            }
            if (koq0Var instanceof moq0) {
                if (((moq0) koq0Var).a.b().f) {
                    x6h1 x6h1VarC5 = y6h1Var.c();
                    x6h1VarC5.i.add(new a7h1("optimizations_device_content_does_not_support_externalization", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = true;
                    x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                    x6h1VarC6.i.add(new a7h1("specific_filter_only_toggle", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{new mmr0("state_before_toggle", "filter_on"), new mmr0("state_after_toggle", "filter_off")})), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    return;
                }
                x6h1 x6h1VarC7 = y6h1Var.c();
                x6h1VarC7.i.add(new a7h1("optimizations_device_content_does_not_support_externalization", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = true;
                x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                x6h1VarC8.i.add(new a7h1("specific_filter_only_toggle", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{new mmr0("state_before_toggle", "filter_off"), new mmr0("state_after_toggle", "filter_on")})), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return;
            }
            return;
        }
        if (hoq0Var instanceof qnq0) {
            if (koq0Var instanceof koq0) {
                if (koq0Var.a.b().c) {
                    x6h1 x6h1VarC9 = y6h1Var.c();
                    x6h1VarC9.i.add(new a7h1("optimizations_device_setup", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = true;
                    x6h1 x6h1VarC10 = x6h1VarC9.a().c();
                    x6h1VarC10.i.add(new a7h1("externalization_filter_toggle", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{new mmr0("state_before_toggle", "filter_on"), new mmr0("state_after_toggle", "filter_off")})), x6h1VarC10.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    return;
                }
                x6h1 x6h1VarC11 = y6h1Var.c();
                x6h1VarC11.i.add(new a7h1("optimizations_device_setup", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC11.j = true;
                x6h1 x6h1VarC12 = x6h1VarC11.a().c();
                x6h1VarC12.i.add(new a7h1("externalization_filter_toggle", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC12.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{new mmr0("state_before_toggle", "filter_off"), new mmr0("state_after_toggle", "filter_on")})), x6h1VarC12.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return;
            }
            return;
        }
        boolean z2 = hoq0Var instanceof doq0;
        roq0 roq0Var = roq0.a;
        qoq0 qoq0Var = qoq0.a;
        poq0 poq0Var = poq0.a;
        soq0 soq0Var = soq0.a;
        if (z2) {
            if (koq0Var instanceof koq0) {
                x6h1 x6h1VarC13 = y6h1Var.c();
                x6h1VarC13.i.add(new a7h1("optimizations_device_setup", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC13.j = true;
                x6h1 x6h1VarC14 = x6h1VarC13.a().c();
                x6h1VarC14.i.add(new a7h1("setup_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC14.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:internal:puffin-intro")), x6h1VarC14.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return;
            }
            if ((koq0Var instanceof ooq0) || koq0Var.equals(soq0Var)) {
                x6h1 x6h1VarC15 = y6h1Var.c();
                x6h1VarC15.i.add(new a7h1("optimizations_new_device", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC15.j = true;
                x6h1 x6h1VarC16 = x6h1VarC15.a().c();
                x6h1VarC16.i.add(new a7h1("setup_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC16.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:internal:puffin-intro")), x6h1VarC16.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return;
            }
            if (koq0Var.equals(joq0Var6)) {
                x6h1 x6h1VarC17 = y6h1Var.c();
                x6h1VarC17.i.add(new a7h1("optimizations_device_error", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC17.j = true;
                x6h1 x6h1VarC18 = x6h1VarC17.a().c();
                x6h1VarC18.i.add(new a7h1("setup_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC18.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:internal:puffin-intro")), x6h1VarC18.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return;
            }
            if (koq0Var.equals(joq0Var5)) {
                x6h1 x6h1VarC19 = y6h1Var.c();
                x6h1VarC19.i.add(new a7h1("optimizations_device_error", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC19.j = true;
                x6h1 x6h1VarC20 = x6h1VarC19.a().c();
                x6h1VarC20.i.add(new a7h1("setup_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC20.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:internal:puffin-intro")), x6h1VarC20.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return;
            }
            if (koq0Var instanceof moq0) {
                moq0 moq0Var = (moq0) koq0Var;
                boolean z3 = moq0Var.c;
                boolean z4 = moq0Var.b;
                if (!z4 && !z3) {
                    x6h1 x6h1VarC21 = y6h1Var.c();
                    x6h1VarC21.i.add(new a7h1("optimizations_device_content_does_not_support_both_filters", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC21.j = true;
                    x6h1 x6h1VarC22 = x6h1VarC21.a().c();
                    x6h1VarC22.i.add(new a7h1("setup_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC22.j = false;
                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:internal:puffin-intro")), x6h1VarC22.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                }
                if (z4 || !z3) {
                    return;
                }
                x6h1 x6h1VarC23 = y6h1Var.c();
                x6h1VarC23.i.add(new a7h1("optimizations_device_content_does_not_support_externalization", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC23.j = true;
                x6h1 x6h1VarC24 = x6h1VarC23.a().c();
                x6h1VarC24.i.add(new a7h1("setup_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC24.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:internal:puffin-intro")), x6h1VarC24.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return;
            }
            if (koq0Var instanceof loq0) {
                x6h1 x6h1VarC25 = y6h1Var.c();
                x6h1VarC25.i.add(new a7h1("optimizations_device_content_does_not_support_both_filters", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC25.j = true;
                x6h1 x6h1VarC26 = x6h1VarC25.a().c();
                x6h1VarC26.i.add(new a7h1("setup_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC26.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:internal:puffin-intro")), x6h1VarC26.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return;
            }
            if (!(koq0Var instanceof noq0)) {
                if (koq0Var.equals(joq0Var4) || koq0Var.equals(joq0Var3) || koq0Var.equals(joq0Var2) || koq0Var.equals(poq0Var) || koq0Var.equals(joq0Var) || koq0Var.equals(qoq0Var) || koq0Var.equals(roq0Var)) {
                    return;
                }
                eg.o();
                return;
            }
            x6h1 x6h1VarC27 = y6h1Var.c();
            x6h1VarC27.i.add(new a7h1("optimizations_device_content_does_not_support_both_filters", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC27.j = true;
            x6h1 x6h1VarC28 = x6h1VarC27.a().c();
            x6h1VarC28.i.add(new a7h1("setup_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC28.j = false;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:internal:puffin-intro")), x6h1VarC28.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
            return;
        }
        if (hoq0Var.equals(pnq0.a) || hoq0Var.equals(pnq0.b) || hoq0Var.equals(pnq0.c) || (hoq0Var instanceof rnq0) || (hoq0Var instanceof snq0) || (hoq0Var instanceof tnq0) || (hoq0Var instanceof vnq0) || (hoq0Var instanceof unq0) || hoq0Var.equals(wnq0.a) || hoq0Var.equals(pnq0.d) || hoq0Var.equals(pnq0.e) || (hoq0Var instanceof xnq0) || hoq0Var.equals(goq0.a) || hoq0Var.equals(ynq0.a)) {
            return;
        }
        if (hoq0Var.equals(pnq0.f)) {
            if (koq0Var instanceof ooq0) {
                x6h1 x6h1VarC29 = y6h1Var.c();
                x6h1VarC29.i.add(new a7h1("optimizations_new_device", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC29.j = true;
                x6h1 x6h1VarC30 = x6h1VarC29.a().c();
                x6h1VarC30.i.add(new a7h1("not_headphones", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC30.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC30.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return;
            }
            if (koq0Var.equals(joq0Var6) || koq0Var.equals(joq0Var5) || (koq0Var instanceof koq0) || (koq0Var instanceof loq0) || (koq0Var instanceof noq0) || (koq0Var instanceof moq0) || koq0Var.equals(joq0Var4) || koq0Var.equals(joq0Var3) || koq0Var.equals(joq0Var2) || koq0Var.equals(poq0Var) || koq0Var.equals(joq0Var) || koq0Var.equals(qoq0Var) || koq0Var.equals(roq0Var) || koq0Var.equals(soq0Var)) {
                return;
            }
            eg.o();
            return;
        }
        if (hoq0Var.equals(pnq0.g) || hoq0Var.equals(foq0.a)) {
            return;
        }
        if (!hoq0Var.equals(coq0.a)) {
            if (hoq0Var.equals(znq0.a)) {
                x6h1 x6h1VarC31 = y6h1Var.c();
                x6h1VarC31.i.add(new a7h1("reset_filter_confirmation_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC31.j = true;
                x6h1 x6h1VarC32 = x6h1VarC31.a().c();
                x6h1VarC32.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC32.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC32.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return;
            }
            if (hoq0Var.equals(aoq0.a)) {
                x6h1 x6h1VarC33 = y6h1Var.c();
                x6h1VarC33.i.add(new a7h1("reset_filter_confirmation_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC33.j = true;
                x6h1 x6h1VarC34 = x6h1VarC33.a().c();
                x6h1VarC34.i.add(new a7h1("reset_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC34.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC34.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return;
            }
            if (!hoq0Var.equals(boq0.a)) {
                eg.o();
                return;
            }
            x6h1 x6h1VarC35 = y6h1Var.c();
            x6h1VarC35.i.add(new a7h1("reset_filter_confirmation_dialog", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC35.j = true;
            y6h1 y6h1VarA = x6h1VarC35.a();
            k7h1 k7h1Var = new k7h1();
            ((xjn) k7h1Var).a = y6h1VarA;
            ((xjn) k7h1Var).b = r6h1.c;
            ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
            i8h1Var.f(k7h1Var.a(), (Set) null);
            return;
        }
        if ((koq0Var instanceof ooq0) || koq0Var.equals(joq0Var6) || koq0Var.equals(joq0Var5)) {
            return;
        }
        if (koq0Var instanceof koq0) {
            x6h1 x6h1VarC36 = y6h1Var.c();
            x6h1VarC36.i.add(new a7h1("optimizations_device_setup", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC36.j = true;
            x6h1 x6h1VarC37 = x6h1VarC36.a().c();
            x6h1VarC37.i.add(new a7h1("remove_optimizations_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC37.j = false;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC37.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
            return;
        }
        if ((koq0Var instanceof loq0) || (koq0Var instanceof noq0)) {
            x6h1 x6h1VarC38 = y6h1Var.c();
            x6h1VarC38.i.add(new a7h1("optimizations_device_content_does_not_support_both_filters", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC38.j = true;
            x6h1 x6h1VarC39 = x6h1VarC38.a().c();
            x6h1VarC39.i.add(new a7h1("remove_optimizations_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC39.j = false;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC39.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
            return;
        }
        if (!(koq0Var instanceof moq0)) {
            if (koq0Var.equals(joq0Var4) || koq0Var.equals(joq0Var3) || koq0Var.equals(joq0Var2) || koq0Var.equals(poq0Var) || koq0Var.equals(joq0Var) || koq0Var.equals(qoq0Var) || koq0Var.equals(roq0Var) || koq0Var.equals(soq0Var)) {
                return;
            }
            eg.o();
            return;
        }
        moq0 moq0Var2 = (moq0) koq0Var;
        boolean z5 = moq0Var2.c;
        boolean z6 = moq0Var2.b;
        if (!z6 && !z5) {
            x6h1 x6h1VarC40 = y6h1Var.c();
            x6h1VarC40.i.add(new a7h1("optimizations_device_content_does_not_support_both_filters", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC40.j = true;
            x6h1 x6h1VarC41 = x6h1VarC40.a().c();
            x6h1VarC41.i.add(new a7h1("remove_optimizations_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC41.j = false;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC41.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        }
        if (z6 || !z5) {
            return;
        }
        x6h1 x6h1VarC42 = y6h1Var.c();
        x6h1VarC42.i.add(new a7h1("optimizations_device_content_does_not_support_externalization", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC42.j = true;
        x6h1 x6h1VarC43 = x6h1VarC42.a().c();
        x6h1VarC43.i.add(new a7h1("remove_optimizations_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC43.j = false;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC43.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2, Exception exc) {
    }

    public final void c(Object obj, First first) {
        g((toq0) first.d());
    }

    public final /* bridge */ /* synthetic */ void d(Object obj, Object obj2) {
    }

    public final /* bridge */ /* synthetic */ void e(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void f(Object obj, Exception exc) {
    }

    public final void g(toq0 toq0Var) {
        y6h1 y6h1Var = this.b.b;
        boolean z = toq0Var instanceof koq0;
        i8h1 i8h1Var = this.a;
        if (z) {
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("optimizations_device_setup", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = true;
            y6h1 y6h1VarA = x6h1VarC.a();
            k7h1 k7h1Var = new k7h1();
            ((xjn) k7h1Var).a = y6h1VarA;
            ((xjn) k7h1Var).b = r6h1.c;
            ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
            i8h1Var.f(k7h1Var.a(), (Set) null);
            return;
        }
        if ((toq0Var instanceof ooq0) || toq0Var.equals(soq0.a)) {
            x6h1 x6h1VarC2 = y6h1Var.c();
            x6h1VarC2.i.add(new a7h1("optimizations_new_device", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = true;
            y6h1 y6h1VarA2 = x6h1VarC2.a();
            k7h1 k7h1Var2 = new k7h1();
            ((xjn) k7h1Var2).a = y6h1VarA2;
            ((xjn) k7h1Var2).b = r6h1.c;
            ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
            i8h1Var.f(k7h1Var2.a(), (Set) null);
            return;
        }
        if (toq0Var instanceof moq0) {
            moq0 moq0Var = (moq0) toq0Var;
            boolean z2 = moq0Var.c;
            boolean z3 = moq0Var.b;
            if (!z3 && z2) {
                x6h1 x6h1VarC3 = y6h1Var.c();
                x6h1VarC3.i.add(new a7h1("optimizations_device_content_does_not_support_externalization", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                y6h1 y6h1VarA3 = x6h1VarC3.a();
                k7h1 k7h1Var3 = new k7h1();
                ((xjn) k7h1Var3).a = y6h1VarA3;
                ((xjn) k7h1Var3).b = r6h1.c;
                ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var.f(k7h1Var3.a(), (Set) null);
            }
            if (z3 || z2) {
                return;
            }
            x6h1 x6h1VarC4 = y6h1Var.c();
            x6h1VarC4.i.add(new a7h1("optimizations_device_content_does_not_support_both_filters", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC4.j = true;
            y6h1 y6h1VarA4 = x6h1VarC4.a();
            k7h1 k7h1Var4 = new k7h1();
            ((xjn) k7h1Var4).a = y6h1VarA4;
            ((xjn) k7h1Var4).b = r6h1.c;
            ((xjn) k7h1Var4).c = Long.valueOf(System.currentTimeMillis());
            i8h1Var.f(k7h1Var4.a(), (Set) null);
            return;
        }
        if (toq0Var.equals(joq0.a)) {
            x6h1 x6h1VarC5 = y6h1Var.c();
            x6h1VarC5.i.add(new a7h1("optimizations_device_error", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC5.j = true;
            y6h1 y6h1VarA5 = x6h1VarC5.a();
            k7h1 k7h1Var5 = new k7h1();
            ((xjn) k7h1Var5).a = y6h1VarA5;
            ((xjn) k7h1Var5).b = r6h1.c;
            ((xjn) k7h1Var5).c = Long.valueOf(System.currentTimeMillis());
            i8h1Var.f(k7h1Var5.a(), (Set) null);
            return;
        }
        if (toq0Var.equals(joq0.b)) {
            x6h1 x6h1VarC6 = y6h1Var.c();
            x6h1VarC6.i.add(new a7h1("optimizations_device_error", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC6.j = true;
            y6h1 y6h1VarA6 = x6h1VarC6.a();
            k7h1 k7h1Var6 = new k7h1();
            ((xjn) k7h1Var6).a = y6h1VarA6;
            ((xjn) k7h1Var6).b = r6h1.c;
            ((xjn) k7h1Var6).c = Long.valueOf(System.currentTimeMillis());
            i8h1Var.f(k7h1Var6.a(), (Set) null);
            return;
        }
        if (toq0Var instanceof loq0) {
            x6h1 x6h1VarC7 = y6h1Var.c();
            x6h1VarC7.i.add(new a7h1("optimizations_device_content_does_not_support_both_filters", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC7.j = true;
            y6h1 y6h1VarA7 = x6h1VarC7.a();
            k7h1 k7h1Var7 = new k7h1();
            ((xjn) k7h1Var7).a = y6h1VarA7;
            ((xjn) k7h1Var7).b = r6h1.c;
            ((xjn) k7h1Var7).c = Long.valueOf(System.currentTimeMillis());
            i8h1Var.f(k7h1Var7.a(), (Set) null);
            return;
        }
        if (!(toq0Var instanceof noq0)) {
            if (toq0Var.equals(joq0.c) || toq0Var.equals(joq0.d) || toq0Var.equals(joq0.e) || toq0Var.equals(joq0.f) || toq0Var.equals(qoq0.a) || (toq0Var instanceof poq0) || toq0Var.equals(roq0.a)) {
                return;
            }
            eg.o();
            return;
        }
        x6h1 x6h1VarC8 = y6h1Var.c();
        x6h1VarC8.i.add(new a7h1("optimizations_device_content_does_not_support_both_filters", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC8.j = true;
        y6h1 y6h1VarA8 = x6h1VarC8.a();
        k7h1 k7h1Var8 = new k7h1();
        ((xjn) k7h1Var8).a = y6h1VarA8;
        ((xjn) k7h1Var8).b = r6h1.c;
        ((xjn) k7h1Var8).c = Long.valueOf(System.currentTimeMillis());
        i8h1Var.f(k7h1Var8.a(), (Set) null);
    }
}
