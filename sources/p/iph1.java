package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class iph1 implements Update {
    public static final iph1 a = new iph1();

    public final Next a(Object obj, Object obj2) {
        hph1 hph1Var = (hph1) obj;
        fph1 fph1Var = (fph1) obj2;
        boolean z = fph1Var instanceof dph1;
        rph1 rph1Var = pph1.a;
        if (z) {
            if (((dph1) fph1Var).a.length() == 0) {
                rph1Var = nph1.a;
            }
            return Next.h(hph1.a(hph1Var, rph1Var));
        }
        if (fph1Var instanceof bph1) {
            bph1 bph1Var = (bph1) fph1Var;
            int i = bph1Var.a;
            if (gph1.a[l1d.C(i)] != 1) {
                rph1Var = oph1.a;
            }
            return Next.i(hph1.a(hph1Var, rph1Var), dm61.A0(i == 1 ? new moh1(hph1Var.a, bph1Var.b) : null));
        }
        if (fph1Var instanceof eph1) {
            return Next.i(hph1.a(hph1Var, qph1.a), Collections.singleton(new noh1(((eph1) fph1Var).a, hph1Var.b, hph1Var.c)));
        }
        boolean zEquals = fph1Var.equals(aph1.a);
        joh1 joh1Var = joh1.a;
        if (zEquals) {
            return Next.a(f46.S0(new ooh1[]{loh1.a, joh1Var}));
        }
        if (fph1Var.equals(zoh1.a)) {
            return Next.i(hph1.a(hph1Var, rph1Var), Collections.singleton(koh1.a));
        }
        if (fph1Var.equals(cph1.a)) {
            return Next.a(Collections.singleton(joh1Var));
        }
        eg.o();
        return null;
    }
}
