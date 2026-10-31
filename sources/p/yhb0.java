package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class yhb0 implements Update {
    public final Next a(Object obj, Object obj2) {
        cib0 cib0Var = (cib0) obj;
        xhb0 xhb0Var = (xhb0) obj2;
        if (xhb0Var instanceof vhb0) {
            vhb0 vhb0Var = (vhb0) xhb0Var;
            String str = vhb0Var.b;
            return str == null ? Next.j() : Next.a(Collections.singleton(new dhb0(new qhs0(vhb0Var.a, str, vhb0Var.c, vhb0Var.d))));
        }
        if (xhb0Var instanceof shb0) {
            shb0 shb0Var = (shb0) xhb0Var;
            qhs0 qhs0Var = shb0Var.a;
            wro wroVar = shb0Var.b;
            if (wroVar instanceof uro) {
                xro xroVar = ((uro) wroVar).a;
                if (xroVar.a == null && xroVar.b == null) {
                    return Next.a(Collections.singleton(new fhb0(qhs0Var)));
                }
            } else if (!u890.j(wroVar, vro.a)) {
                eg.o();
                return null;
            }
            return Next.h(cib0.a(cib0Var, qhs0Var));
        }
        if (xhb0Var instanceof whb0) {
            qhs0 qhs0Var2 = cib0Var.e;
            if (qhs0Var2 == null) {
                return Next.j();
            }
            whb0 whb0Var = (whb0) xhb0Var;
            if (whb0Var.a) {
                return Next.i(cib0.a(cib0Var, null), Collections.singleton(new fhb0(new qhs0(qhs0Var2.a, qhs0Var2.b, qhs0Var2.c, whb0Var.b))));
            }
            return Next.h(cib0.a(cib0Var, null));
        }
        if (xhb0Var instanceof uhb0) {
            uhb0 uhb0Var = (uhb0) xhb0Var;
            return Next.a(Collections.singleton(new hhb0(uhb0Var.a, uhb0Var.b, uhb0Var.c, uhb0Var.d)));
        }
        if (xhb0Var instanceof qhb0) {
            return Next.a(Collections.singleton(new ehb0(((qhb0) xhb0Var).a)));
        }
        if (xhb0Var instanceof rhb0) {
            rhb0 rhb0Var = (rhb0) xhb0Var;
            return Next.a(Collections.singleton(new fhb0(new qhs0(rhb0Var.a, null, null, rhb0Var.b))));
        }
        if (xhb0Var.equals(thb0.a)) {
            return Next.a(Collections.singleton(ghb0.a));
        }
        eg.o();
        return null;
    }
}
