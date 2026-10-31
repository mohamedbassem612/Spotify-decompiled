package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class lt81 implements Update {
    public static final lt81 a = new lt81();

    public final Next a(Object obj, Object obj2) {
        nt81 nt81Var = (nt81) obj;
        ys81 ys81Var = (kt81) obj2;
        boolean z = nt81Var.a;
        if (ys81Var instanceof ft81) {
            return Next.i(nt81.a(nt81Var, false, null, null, null, null, false, false, null, false, true, false, null, false, 30719), Collections.singleton(yr81.a));
        }
        if (ys81Var instanceof gt81) {
            return Next.h(nt81.a(nt81Var, false, null, null, null, null, false, false, null, false, false, false, null, false, 30719));
        }
        if (ys81Var instanceof dt81) {
            return Next.i(nt81.a(nt81Var, false, null, null, null, null, false, false, null, false, false, false, null, ((dt81) ys81Var).a, 14335), Collections.singleton(zr81.a));
        }
        boolean z2 = ys81Var instanceof et81;
        as81 as81Var = as81.a;
        if (z2) {
            return Next.i(nt81.a(nt81Var, false, null, null, null, null, false, false, null, false, false, false, null, false, 30719), Collections.singleton(as81Var));
        }
        if (ys81Var instanceof xs81) {
            return Next.h(nt81.a(nt81Var, false, null, null, null, null, ((xs81) ys81Var).a, false, null, false, false, false, null, false, 32703));
        }
        if (ys81Var instanceof at81) {
            return Next.h(nt81.a(nt81Var, false, null, null, null, null, false, ((at81) ys81Var).a, null, false, false, false, null, false, 32639));
        }
        if (ys81Var instanceof us81) {
            us81 us81Var = (us81) ys81Var;
            return Next.h(nt81.a(nt81Var, false, null, null, null, us81Var.a, false, false, us81Var.b, false, false, false, null, false, 32479));
        }
        if (ys81Var instanceof jt81) {
            return Next.h(nt81.a(nt81Var, false, ((jt81) ys81Var).a, null, null, null, false, false, null, false, false, false, null, false, 32765));
        }
        if (ys81Var instanceof it81) {
            it81 it81Var = (it81) ys81Var;
            return Next.i(nt81.a(nt81Var, false, null, it81Var.a, null, null, false, false, null, false, false, false, null, false, 32759), Collections.singleton(new bs81(it81Var.a, it81Var.b)));
        }
        if (ys81Var instanceof ht81) {
            return Next.h(nt81.a(nt81Var, false, null, null, null, null, false, false, null, false, false, false, null, false, 32763));
        }
        ur81 ur81Var = null;
        if (ys81Var instanceof ys81) {
            ys81 ys81Var2 = ys81Var;
            e090 e090Var = ys81Var2.a;
            a090 a090Var = a090.a;
            boolean z3 = true;
            if (!z && u890.j(e090Var, a090Var)) {
                z3 = false;
            }
            nt81 nt81VarA = nt81.a(nt81Var, z3, null, null, e090Var, null, false, false, null, false, false, false, null, false, 32750);
            if (z && u890.j(ys81Var2.a, a090Var)) {
                ur81Var = ur81.a;
            }
            return Next.i(nt81VarA, dm61.A0(ur81Var));
        }
        if (ys81Var instanceof ws81) {
            return Next.h(nt81.a(nt81Var, false, null, null, null, null, false, false, null, false, false, false, null, false, 32766));
        }
        if (ys81Var instanceof ss81) {
            return Next.a(Collections.singleton(tr81.a));
        }
        if (ys81Var instanceof vs81) {
            return Next.h(nt81.a(nt81Var, false, null, null, null, null, false, false, null, true, false, false, null, true, 15871));
        }
        if (ys81Var instanceof bt81) {
            return Next.a(Collections.singleton(new vr81(((bt81) ys81Var).a)));
        }
        if (ys81Var instanceof ct81) {
            return Next.a(Collections.singleton(as81Var));
        }
        if (ys81Var instanceof zs81) {
            return Next.h(nt81.a(nt81Var, false, null, null, null, null, false, false, null, false, false, false, null, false, 31743));
        }
        if (ys81Var instanceof ts81) {
            ts81 ts81Var = (ts81) ys81Var;
            return Next.h(nt81.a(nt81Var, false, null, null, null, null, false, false, null, false, false, ts81Var.a, ts81Var.b, false, 20479));
        }
        eg.o();
        return null;
    }
}
