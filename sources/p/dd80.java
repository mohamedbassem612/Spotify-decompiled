package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dd80 implements eck1 {
    public final zbk1[] a;

    public dd80(zbk1... zbk1VarArr) {
        this.a = zbk1VarArr;
    }

    public final xbk1 c(Class cls, wcn0 wcn0Var) {
        zbk1 zbk1Var;
        tka0 tka0VarB = rc11.a.b(cls);
        zbk1[] zbk1VarArr = this.a;
        zbk1[] zbk1VarArr2 = (zbk1[]) Arrays.copyOf(zbk1VarArr, zbk1VarArr.length);
        int length = zbk1VarArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                zbk1Var = null;
                break;
            }
            zbk1Var = zbk1VarArr2[i];
            if (zbk1Var.a.equals(tka0VarB)) {
                break;
            }
            i++;
        }
        ii30.a aVar = zbk1Var != null ? new ii30.a() : null;
        if (aVar != null) {
            return aVar;
        }
        hhg1.f(l1d.m("No initializer set for given class ", tka0VarB.o()));
        return null;
    }
}
