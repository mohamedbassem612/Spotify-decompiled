package p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class l660 extends cjl {
    public cjl[] u0 = new cjl[4];
    public int v0 = 0;

    public final void W(cjl cjlVar) {
        if (cjlVar == this || cjlVar == null) {
            return;
        }
        int i = this.v0 + 1;
        cjl[] cjlVarArr = this.u0;
        if (i > cjlVarArr.length) {
            cjlVarArr = (cjl[]) Arrays.copyOf(cjlVarArr, cjlVarArr.length * 2);
            this.u0 = cjlVarArr;
        }
        int i2 = this.v0;
        cjlVarArr[i2] = cjlVar;
        this.v0 = i2 + 1;
    }

    public final void X(int i, ArrayList arrayList, yol1 yol1Var) {
        for (int i2 = 0; i2 < this.v0; i2++) {
            cjl cjlVar = this.u0[i2];
            ArrayList arrayList2 = yol1Var.a;
            if (!arrayList2.contains(cjlVar)) {
                arrayList2.add(cjlVar);
            }
        }
        for (int i3 = 0; i3 < this.v0; i3++) {
            uyn1.q(this.u0[i3], i, arrayList, yol1Var);
        }
    }

    @Override // p.cjl
    public void h(cjl cjlVar, HashMap map) {
        super.h(cjlVar, map);
        l660 l660Var = (l660) cjlVar;
        this.v0 = 0;
        int i = l660Var.v0;
        for (int i2 = 0; i2 < i; i2++) {
            W((cjl) map.get(l660Var.u0[i2]));
        }
    }

    public void Y() {
    }
}
