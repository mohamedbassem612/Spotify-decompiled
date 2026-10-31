package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class s0j1 implements Update {
    public static final s0j1 a = new s0j1();

    public final Next a(Object obj, Object obj2) {
        x0j1 x0j1Var = (x0j1) obj;
        r0j1 r0j1Var = (r0j1) obj2;
        boolean z = r0j1Var instanceof m0j1;
        d0j1 d0j1Var = d0j1.a;
        if (z) {
            return Next.a(Collections.singleton(d0j1Var));
        }
        if (r0j1Var instanceof n0j1) {
            return Next.a(Collections.singleton(d0j1Var));
        }
        if (r0j1Var instanceof o0j1) {
            if (!(x0j1Var instanceof v0j1)) {
                if (x0j1Var instanceof w0j1) {
                    return Next.j();
                }
                eg.o();
                return null;
            }
            v0j1 v0j1Var = (v0j1) x0j1Var;
            u0j1 u0j1Var = v0j1Var.c;
            return Next.a(Collections.singleton(new c0j1(u0j1Var.c, u0j1Var.a, u0j1Var.b, v0j1Var.e)));
        }
        if (r0j1Var instanceof q0j1) {
            return Next.j();
        }
        if (!(r0j1Var instanceof p0j1)) {
            eg.o();
            return null;
        }
        if (!(x0j1Var instanceof v0j1)) {
            if (x0j1Var instanceof w0j1) {
                return Next.j();
            }
            eg.o();
            return null;
        }
        v0j1 v0j1Var2 = (v0j1) x0j1Var;
        p0j1 p0j1Var = (p0j1) r0j1Var;
        return Next.h(new v0j1(v0j1Var2.a, v0j1Var2.b, v0j1Var2.c, p0j1Var.a, p0j1Var.b));
    }
}
