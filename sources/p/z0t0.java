package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class z0t0 implements Update {
    public static final z0t0 a = new z0t0();

    public final Next a(Object obj, Object obj2) {
        b1t0 b1t0Var = (b1t0) obj;
        t0t0 t0t0Var = (t0t0) obj2;
        if (t0t0Var instanceof p0t0) {
            return Next.i(new b1t0(l1t0.a), Collections.singleton(new uzs0(((p0t0) t0t0Var).a)));
        }
        if (t0t0Var instanceof r0t0) {
            return Next.i(new b1t0(m1t0.a), f46.S0(new vzs0[]{tzs0.a, rzs0.b}));
        }
        if (t0t0Var instanceof q0t0) {
            return Next.i(b1t0Var, Collections.singleton(ozs0.a));
        }
        if (t0t0Var instanceof s0t0) {
            return Next.h(new b1t0(h1t0.a));
        }
        boolean z = t0t0Var instanceof n0t0;
        g1t0 g1t0Var = g1t0.a;
        if (z) {
            int i = ((n0t0) t0t0Var).a;
            if (i == 0) {
                return !u890.j(b1t0Var.a, g1t0Var) ? Next.h(new b1t0(j1t0.a)) : Next.j();
            }
            return Next.i(new b1t0(new i1t0(i)), Collections.singleton(new nzs0(i)));
        }
        if (t0t0Var instanceof m0t0) {
            return Next.h(new b1t0(g1t0Var));
        }
        if (t0t0Var instanceof o0t0) {
            return Next.a(Collections.singleton(pzs0.b));
        }
        eg.o();
        return null;
    }
}
