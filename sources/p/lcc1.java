package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class lcc1 implements Update {
    public final Next a(Object obj, Object obj2) {
        occ1 occ1Var = (occ1) obj;
        kcc1 kcc1Var = (kcc1) obj2;
        if (kcc1Var instanceof gcc1) {
            return Next.a(Collections.singleton(new dcc1(((gcc1) kcc1Var).a, occ1Var.c, occ1Var.d)));
        }
        boolean z = kcc1Var instanceof hcc1;
        vcc1 vcc1Var = vcc1.c;
        if (z) {
            return Next.a(f46.S0(new xcc1[]{wcc1.c, vcc1Var}));
        }
        if (kcc1Var.equals(icc1.a)) {
            return Next.a(Collections.singleton(vcc1Var));
        }
        if (kcc1Var instanceof jcc1) {
            return Next.a(Collections.singleton(new ucc1(((jcc1) kcc1Var).a)));
        }
        eg.o();
        return null;
    }
}
