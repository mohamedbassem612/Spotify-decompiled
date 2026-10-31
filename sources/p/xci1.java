package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class xci1 implements Update {
    public static final xci1 a = new xci1();

    /* JADX WARN: Multi-variable type inference failed */
    public final Next a(Object obj, Object obj2) {
        zci1 zci1Var = (zci1) obj;
        vci1 vci1Var = (vci1) obj2;
        m6r m6rVar = zci1Var.b;
        if (vci1Var instanceof sci1) {
            zci1 zci1VarA = zci1.a(zci1Var, ((sci1) vci1Var).a, null, 0, false, null, null, false, 1022);
            return Next.i(zci1.a(zci1VarA, null, null, iqo1.p(zci1VarA), false, null, null, false, 1007), Collections.singleton(cci1.a));
        }
        int i = 1;
        if (vci1Var instanceof rci1) {
            String str = ((rci1) vci1Var).a;
            if (!zci1Var.t && str.length() <= 0) {
                i = 0;
            }
            zci1 zci1VarA2 = zci1.a(zci1Var, null, null, 0, false, str, null, i, 383);
            return Next.h(zci1.a(zci1VarA2, null, null, iqo1.p(zci1VarA2), false, null, null, false, 1007));
        }
        if (vci1Var instanceof oci1) {
            zci1 zci1VarA3 = zci1.a(zci1Var, null, null, 0, false, null, ((oci1) vci1Var).a, false, 767);
            return Next.h(zci1.a(zci1VarA3, null, null, iqo1.p(zci1VarA3), false, null, null, false, 1007));
        }
        if (vci1Var instanceof qci1) {
            qci1 qci1Var = (qci1) vci1Var;
            return Next.a(Collections.singleton(new aci1(m6rVar.f, qci1Var.a, qci1Var.b, qci1Var.c, m6rVar.g)));
        }
        if (vci1Var instanceof pci1) {
            pci1 pci1Var = (pci1) vci1Var;
            m6r m6rVar2 = new m6r(pci1Var.a, pci1Var.b, Integer.valueOf(pci1Var.c), Integer.valueOf(pci1Var.d), Integer.valueOf(pci1Var.e), m6rVar.f, m6rVar.g);
            int i2 = pci1Var.f;
            zci1 zci1VarA4 = zci1.a(zci1Var, null, m6rVar2, i2 != 0 ? 3 : 1, false, null, null, false, 1005);
            return Next.i(zci1.a(zci1VarA4, null, null, iqo1.p(zci1VarA4), false, null, null, false, 1007), i2 != 0 ? Collections.singleton(new bci1(i2)) : w7x.a);
        }
        if (vci1Var instanceof tci1) {
            return iqo1.p(zci1Var) == 2 ? Next.a(Collections.singleton(new dci1(zci1Var.a, m6rVar.a))) : Next.j();
        }
        if (vci1Var instanceof nci1) {
            return Next.a(Collections.singleton(zbi1.a));
        }
        if (vci1Var instanceof uci1) {
            return Next.a(Collections.singleton(new eci1(((uci1) vci1Var).a)));
        }
        eg.o();
        return null;
    }
}
