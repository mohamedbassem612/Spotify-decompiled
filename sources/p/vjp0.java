package p;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vjp0 {
    public final cc90 a;
    public final int[] b;
    public final String[] c;
    public final Set d;

    public vjp0(cc90 cc90Var, int[] iArr, String[] strArr) {
        this.a = cc90Var;
        this.b = iArr;
        this.c = strArr;
        if (iArr.length == strArr.length) {
            this.d = !(strArr.length == 0) ? Collections.singleton(strArr[0]) : w7x.a;
        } else {
            eg.m("Check failed.");
            throw null;
        }
    }

    public final int[] a() {
        return this.b;
    }

    public final void b(Set set) {
        int[] iArr = this.b;
        int length = iArr.length;
        xj61 xj61VarJ = w7x.a;
        if (length != 0) {
            int i = 0;
            if (length != 1) {
                xj61 xj61Var = new xj61();
                int length2 = iArr.length;
                int i2 = 0;
                while (i < length2) {
                    int i3 = i2 + 1;
                    if (set.contains(Integer.valueOf(iArr[i]))) {
                        xj61Var.add(this.c[i2]);
                    }
                    i++;
                    i2 = i3;
                }
                xj61VarJ = cwl1.j(xj61Var);
            } else if (set.contains(Integer.valueOf(iArr[0]))) {
                xj61VarJ = this.d;
            }
        }
        if (((Collection) xj61VarJ).isEmpty()) {
            return;
        }
        this.a.b(xj61VarJ);
    }
}
