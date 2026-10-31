package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ftg {
    public final pqc1 a;

    public ftg(pqc1 pqc1Var) {
        this.a = pqc1Var;
    }

    public static hpc1 b(ktg ktgVar) {
        return new hpc1(ktgVar.a, Boolean.valueOf(ktgVar.b), ktgVar.c ? 1 : 0, ktgVar.d ? 2 : 1, 4, null);
    }

    public final void a(gtg gtgVar) {
        String str = gtgVar.a;
        pqc1 pqc1Var = this.a;
        if (str == null) {
            if (pqc1Var.e) {
                pqc1Var.e = false;
                pqc1Var.b(pqc1Var.c, pqc1Var.d);
                return;
            }
            return;
        }
        List list = gtgVar.b;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b((ktg) it.next()));
        }
        ktg ktgVar = gtgVar.c;
        hpc1 hpc1VarB = ktgVar != null ? b(ktgVar) : null;
        pqc1Var.e = true;
        pqc1Var.b(arrayList, hpc1VarB);
    }
}
