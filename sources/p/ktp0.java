package p;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ktp0 implements anh0 {
    public final yna a;
    public final LinkedHashMap b;

    public ktp0(yna ynaVar, List list) {
        this.a = ynaVar;
        List list2 = list;
        int iS = zno1.s(q7h.U(list2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS < 16 ? 16 : iS);
        for (Object obj : list2) {
            linkedHashMap.put(pze0.d(((anh0) obj).getType()).toLowerCase(Locale.ROOT), obj);
        }
        this.b = linkedHashMap;
    }

    @Override // p.anh0
    public final qba a(hoh0 hoh0Var, bpa bpaVar, gxu gxuVar, bnh0 bnh0Var, yeg1 yeg1Var) {
        anh0 anh0VarD = d(hoh0Var);
        anh0VarD.getClass();
        gxu gxuVarA = this.a.a(hoh0Var.a());
        gxuVarA.getClass();
        return anh0VarD.a(hoh0Var, bpaVar, gxuVarA, bnh0Var, yeg1Var);
    }

    @Override // p.anh0
    public final String b(hoh0 hoh0Var) {
        anh0 anh0VarD = d(hoh0Var);
        anh0VarD.getClass();
        return anh0VarD.b(hoh0Var);
    }

    @Override // p.anh0
    public final boolean c(hoh0 hoh0Var) {
        return d(hoh0Var) != null;
    }

    public final anh0 d(hoh0 hoh0Var) {
        gxu gxuVarA = this.a.a(hoh0Var.a());
        if (gxuVarA == null) {
            return null;
        }
        return (anh0) this.b.get(gxuVarA.b().toLowerCase(Locale.ROOT));
    }

    @Override // p.anh0
    public final int getType() {
        return 3;
    }
}
