package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class lro0 implements Update {
    public static final lro0 a = new lro0();

    public final Next a(Object obj, Object obj2) {
        pro0 pro0Var = (pro0) obj;
        kro0 kro0Var = (kro0) obj2;
        hpo0 hpo0Var = pro0Var.b;
        boolean z = kro0Var instanceof dro0;
        mqo0 mqo0Var = mqo0.a;
        if (z) {
            cpo0 cpo0Var = hpo0Var.e;
            if (cpo0Var instanceof bpo0) {
                return Next.a(f46.S0(new rqo0[]{new nqo0(pro0Var.a), oqo0.a}));
            }
            if (cpo0Var instanceof apo0) {
                return Next.a(Collections.singleton(mqo0Var));
            }
            eg.o();
            return null;
        }
        if (kro0Var instanceof hro0) {
            boolean z2 = ((hro0) kro0Var).a;
            bpo0 bpo0Var = hpo0Var.e;
            if (bpo0Var instanceof bpo0) {
                String str = bpo0Var.a;
                if (pro0Var.d) {
                    return z2 ? Next.i(pro0.a(pro0Var, false, false, 7), f46.S0(new rqo0[]{new qqo0(str), mqo0Var})) : Next.i(pro0.a(pro0Var, false, false, 7), Collections.singleton(mqo0Var));
                }
                return z2 ? Next.a(f46.S0(new rqo0[]{new qqo0(str), mqo0Var})) : Next.h(pro0.a(pro0Var, true, false, 11));
            }
            if (bpo0Var instanceof apo0) {
                return Next.a(Collections.singleton(mqo0Var));
            }
            eg.o();
            return null;
        }
        if (kro0Var instanceof jro0) {
            return Next.h(pro0.a(pro0Var, false, true, 3));
        }
        if (kro0Var instanceof gro0) {
            return Next.a(Collections.singleton(mqo0Var));
        }
        if (kro0Var instanceof iro0) {
            return Next.i(pro0.a(pro0Var, false, false, 7), f46.S0(new rqo0[]{pqo0.a, mqo0Var}));
        }
        if (kro0Var instanceof fro0) {
            return Next.a(Collections.singleton(lqo0.a));
        }
        if (kro0Var instanceof ero0) {
            return Next.j();
        }
        eg.o();
        return null;
    }
}
