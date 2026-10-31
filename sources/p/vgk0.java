package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class vgk0 implements Update {
    public final Next a(Object obj, Object obj2) {
        zgk0 zgk0Var = (zgk0) obj;
        tgk0 tgk0Var = (tgk0) obj2;
        List list = zgk0Var.c;
        String str = zgk0Var.d;
        List list2 = zgk0Var.b;
        boolean z = tgk0Var instanceof igk0;
        rfk0 rfk0Var = rfk0.a;
        if (z) {
            return Next.a(Collections.singleton(rfk0Var));
        }
        if (tgk0Var instanceof jgk0) {
            return Next.a(Collections.singleton(rfk0Var));
        }
        if (tgk0Var instanceof kgk0) {
            return Next.i(zgk0.a(zgk0Var, null, null, ytb1.a, false, 47), Collections.singleton(new sfk0(list2)));
        }
        boolean z2 = tgk0Var instanceof hgk0;
        cub1 cub1Var = cub1.a;
        if (z2) {
            List list3 = zgk0Var.a;
            r561 r561VarA = j2h1.A((vu30) z561.n0(new i46(list3, (byte) 1)).b);
            while (r561VarA.hasNext()) {
                mmr0 mmr0Var = (mmr0) r561VarA.next();
                if (((di90) mmr0Var.a).c > ((di90) mmr0Var.b).c) {
                    r561 r561VarA2 = j2h1.A((vu30) z561.n0(new i46(list3, (byte) 1)).b);
                    while (r561VarA2.hasNext()) {
                        mmr0 mmr0Var2 = (mmr0) r561VarA2.next();
                        if (((di90) mmr0Var2.a).c < ((di90) mmr0Var2.b).c) {
                            return Next.h(zgk0.a(zgk0Var, null, null, null, true, 31));
                        }
                    }
                    break;
                }
            }
            return Next.i(zgk0.a(zgk0Var, null, null, cub1Var, false, 47), Collections.singleton(new qfk0(str, list2, list)));
        }
        if (tgk0Var instanceof pgk0) {
            return Next.i(zgk0.a(zgk0Var, null, null, cub1Var, false, 15), Collections.singleton(new qfk0(str, list2, list)));
        }
        if (tgk0Var instanceof ogk0) {
            return Next.i(zgk0.a(zgk0Var, null, null, null, false, 31), Collections.singleton(rfk0Var));
        }
        boolean z3 = tgk0Var instanceof lgk0;
        vtb1 vtb1Var = vtb1.a;
        if (z3) {
            return Next.h(zgk0.a(zgk0Var, null, null, vtb1Var, false, 47));
        }
        if (tgk0Var instanceof mgk0) {
            mgk0 mgk0Var = (mgk0) tgk0Var;
            return Next.h(zgk0.a(zgk0Var, mgk0Var.a, mgk0Var.b, xtb1.a, false, 35));
        }
        if (tgk0Var instanceof ngk0) {
            return Next.h(zgk0.a(zgk0Var, null, null, utb1.a, false, 47));
        }
        if (tgk0Var instanceof sgk0) {
            return Next.i(zgk0Var, f46.S0(new ufk0[]{tfk0.a, rfk0Var}));
        }
        if (tgk0Var instanceof qgk0) {
            return Next.h(zgk0.a(zgk0Var, null, null, vtb1Var, false, 47));
        }
        if (tgk0Var instanceof rgk0) {
            return Next.h(zgk0.a(zgk0Var, null, null, bub1.a, false, 47));
        }
        eg.o();
        return null;
    }
}
