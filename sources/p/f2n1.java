package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class f2n1 implements ufp1, vcp1, jgg1 {
    public static final /* synthetic */ f2n1 a = new f2n1();
    public static final /* synthetic */ f2n1 b = new f2n1();

    public static ArrayList c(List list, q9t q9tVar) {
        ArrayList arrayList = new ArrayList(list);
        int i = q9tVar.b;
        wro0 wro0Var = (wro0) arrayList.get(i);
        ArrayList arrayList2 = new ArrayList(wro0Var.a);
        arrayList2.add(q9tVar.c, q9tVar.a);
        arrayList.set(i, new wro0(wro0Var.b, arrayList2, wro0Var.c));
        return arrayList;
    }

    public /* synthetic */ pno1 a(kap1 kap1Var, a2x0 a2x0Var) {
        return yfn1.c(kap1Var);
    }

    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    public /* synthetic */ Object b(pno1 pno1Var) {
        return zfn1.d((ccn1) pno1Var);
    }
}
