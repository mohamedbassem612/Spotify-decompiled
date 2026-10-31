package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class p1g0 {
    public static final ceo a = new ceo(0.51f, 0.0f, 0.26f, 1.0f);

    public static final void a(long j, long j2, dlv dlvVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-449450465);
        if ((i & 384) == 0) {
            i2 = (x340Var.g(dlvVar) ? 256 : 128) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (x340Var.g(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z = (i3 & 896) == 256;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                tr80 tr80Var = new tr80(0, 20, 1);
                ArrayList arrayList = new ArrayList(q7h.U(tr80Var, 10));
                lr80 it = tr80Var.iterator();
                while (((sr80) it).c) {
                    arrayList.add(Float.valueOf(dlvVar.a(it.nextInt() / 20.0f)));
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new u7h(z4p1.A(((Number) it2.next()).floatValue(), j, j2)));
                }
                x340Var.s0(arrayList2);
                objT = arrayList2;
            }
            t1c.a(dug.e(qim0Var, v9c.s((List) objT, 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new o1g0(j, j2, dlvVar, qim0Var, i);
        }
    }
}
