package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jb5 implements gfh0 {
    public final dd5 a;
    public boolean b;

    public jb5(dd5 dd5Var) {
        this.a = dd5Var;
    }

    @Override // p.gfh0
    public final int maxIntrinsicHeight(p890 p890Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iD = ((afh0) list.get(0)).d(i);
        int iL = p7h.L(list);
        int i2 = 1;
        if (1 <= iL) {
            while (true) {
                int iD2 = ((afh0) list.get(i2)).d(i);
                if (iD2 > iD) {
                    iD = iD2;
                }
                if (i2 == iL) {
                    break;
                }
                i2++;
            }
        }
        return iD;
    }

    @Override // p.gfh0
    public final int maxIntrinsicWidth(p890 p890Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iC = ((afh0) list.get(0)).C(i);
        int iL = p7h.L(list);
        int i2 = 1;
        if (1 <= iL) {
            while (true) {
                int iC2 = ((afh0) list.get(i2)).C(i);
                if (iC2 > iC) {
                    iC = iC2;
                }
                if (i2 == iL) {
                    break;
                }
                i2++;
            }
        }
        return iC;
    }

    @Override // p.gfh0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final hfh0 mo23measure3p2s80s(ifh0 ifh0Var, List list, long j) {
        hrr0 hrr0Var = this.a.b;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            q5t0 q5t0VarH = ((afh0) list.get(i)).H(j);
            iMax = Math.max(iMax, q5t0VarH.a);
            iMax2 = Math.max(iMax2, q5t0VarH.b);
            arrayList.add(q5t0VarH);
        }
        if (ifh0Var.W()) {
            this.b = true;
            hrr0Var.setValue(new yr80((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        } else if (!this.b) {
            hrr0Var.setValue(new yr80((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        }
        return ifh0Var.S(iMax, iMax2, b7x.a, new ib5(arrayList, (byte) 0));
    }

    @Override // p.gfh0
    public final int minIntrinsicHeight(p890 p890Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iN = ((afh0) list.get(0)).n(i);
        int iL = p7h.L(list);
        int i2 = 1;
        if (1 <= iL) {
            while (true) {
                int iN2 = ((afh0) list.get(i2)).n(i);
                if (iN2 > iN) {
                    iN = iN2;
                }
                if (i2 == iL) {
                    break;
                }
                i2++;
            }
        }
        return iN;
    }

    @Override // p.gfh0
    public final int minIntrinsicWidth(p890 p890Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iW = ((afh0) list.get(0)).w(i);
        int iL = p7h.L(list);
        int i2 = 1;
        if (1 <= iL) {
            while (true) {
                int iW2 = ((afh0) list.get(i2)).w(i);
                if (iW2 > iW) {
                    iW = iW2;
                }
                if (i2 == iL) {
                    break;
                }
                i2++;
            }
        }
        return iW;
    }
}
