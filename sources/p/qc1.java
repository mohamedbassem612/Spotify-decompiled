package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class qc1 implements Update {
    public final Next a(Object obj, Object obj2) {
        wc1 wc1Var = (wc1) obj;
        pc1 pc1Var = (pc1) obj2;
        fc1 fc1Var = wc1Var.b;
        wxn0 wxn0Var = wc1Var.c;
        if (pc1Var instanceof jc1) {
            return Next.a(Collections.singleton(new ic1(((jc1) pc1Var).a)));
        }
        if (pc1Var.equals(kc1.a)) {
            return Next.a(Collections.singleton(hc1.a));
        }
        if (pc1Var.equals(mc1.a)) {
            return Next.h(new wc1(2, fc1Var, wxn0Var));
        }
        if (pc1Var.equals(lc1.a)) {
            return Next.h(new wc1(3, fc1Var, wxn0Var));
        }
        if (pc1Var.equals(nc1.a)) {
            return Next.h(new wc1(1, fc1Var, wxn0Var));
        }
        if (pc1Var instanceof oc1) {
            return Next.a(Collections.singleton(new gc1(((oc1) pc1Var).a, wxn0Var)));
        }
        eg.o();
        return null;
    }
}
