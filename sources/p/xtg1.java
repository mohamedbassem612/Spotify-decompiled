package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final /* synthetic */ class xtg1 implements Update {
    public final Next a(Object obj, Object obj2) {
        fhm0 fhm0Var = (fhm0) obj;
        exz exzVar = (exz) obj2;
        zrg1 zrg1Var = fhm0Var.b;
        msg1 msg1Var = fhm0Var.a;
        boolean zEquals = exzVar.equals(exz.d);
        m9w m9wVar = m9w.a;
        ksg1 ksg1Var = ksg1.a;
        if (zEquals) {
            return Next.i(new fhm0(ksg1Var, zrg1Var), f46.S0(new miw[]{m9wVar, lcw.a}));
        }
        if (exzVar.equals(exz.f)) {
            return Next.i(new fhm0(ksg1Var, zrg1Var), f46.S0(new miw[]{m9wVar, pcw.a}));
        }
        boolean zEquals2 = exzVar.equals(exz.e);
        lsg1 lsg1Var = lsg1.a;
        if (zEquals2) {
            return msg1Var.equals(lsg1Var) ? Next.j() : Next.i(new fhm0(isg1.a, zrg1Var), Collections.singleton(ocw.a));
        }
        boolean zEquals3 = exzVar.equals(exz.b);
        gaw gawVar = gaw.a;
        if (zEquals3) {
            return msg1Var.equals(ksg1Var) ? Next.j() : Next.a(f46.S0(new miw[]{gawVar, ybw.a}));
        }
        if (exzVar.equals(exz.g)) {
            return Next.i(new fhm0(ksg1Var, zrg1Var), Collections.singleton(odw.a));
        }
        if (exzVar.equals(exz.a)) {
            return Next.i(new fhm0(lsg1Var, zrg1Var), Collections.singleton(xgw.a));
        }
        if (exzVar.equals(exz.c)) {
            return Next.i(fhm0Var, f46.S0(new miw[]{idw.a, gawVar}));
        }
        eg.o();
        return null;
    }
}
