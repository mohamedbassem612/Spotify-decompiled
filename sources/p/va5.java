package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class va5 implements gfh0 {
    public final eb5 a;
    public q5t0[] b;
    public q5t0[] c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final ua5 h = new ua5(this, (byte) 1);
    public final ua5 i = new ua5(this, (byte) 0);

    public va5(eb5 eb5Var) {
        this.a = eb5Var;
    }

    @Override // p.gfh0
    public final int maxIntrinsicHeight(p890 p890Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((afh0) list.get(0)).d(i));
            int iL = p7h.L(list);
            int i2 = 1;
            if (1 <= iL) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((afh0) list.get(i2)).d(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iL) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // p.gfh0
    public final int maxIntrinsicWidth(p890 p890Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((afh0) list.get(0)).C(i));
            int iL = p7h.L(list);
            int i2 = 1;
            if (1 <= iL) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((afh0) list.get(i2)).C(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iL) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // p.gfh0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final hfh0 mo23measure3p2s80s(ifh0 ifh0Var, List list, long j) {
        mmr0 mmr0VarN;
        int size = list.size();
        q5t0[] q5t0VarArr = new q5t0[size];
        List list2 = list;
        int size2 = list2.size();
        long j2 = 0;
        for (int i = 0; i < size2; i++) {
            afh0 afh0Var = (afh0) list.get(i);
            Object objG = afh0Var.g();
            ya5 ya5Var = objG instanceof ya5 ? (ya5) objG : null;
            if (ya5Var != null && ((Boolean) ya5Var.a.getValue()).booleanValue()) {
                q5t0 q5t0VarH = afh0Var.H(j);
                long j3 = (((long) q5t0VarH.b) & 4294967295L) | (((long) q5t0VarH.a) << 32);
                q5t0VarArr[i] = q5t0VarH;
                j2 = j3;
            }
        }
        int size3 = list2.size();
        for (int i2 = 0; i2 < size3; i2++) {
            afh0 afh0Var2 = (afh0) list.get(i2);
            if (q5t0VarArr[i2] == null) {
                q5t0VarArr[i2] = afh0Var2.H(j);
            }
        }
        if (ifh0Var.W()) {
            mmr0VarN = oqn1.n(Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) (j2 & 4294967295L)));
        } else {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                q5t0 q5t0Var = q5t0VarArr[i5];
                if (q5t0Var != null) {
                    Object objG2 = ((afh0) list.get(i5)).g();
                    ya5 ya5Var2 = objG2 instanceof ya5 ? (ya5) objG2 : null;
                    if (ya5Var2 == null || !((Boolean) ya5Var2.b.getValue()).booleanValue()) {
                        int i6 = q5t0Var.a;
                        if (i6 > i3) {
                            i3 = i6;
                        }
                        int i7 = q5t0Var.b;
                        if (i7 > i4) {
                            i4 = i7;
                        }
                    }
                }
            }
            mmr0VarN = oqn1.n(Integer.valueOf(i3), Integer.valueOf(i4));
        }
        int iIntValue = ((Number) mmr0VarN.a).intValue();
        int iIntValue2 = ((Number) mmr0VarN.b).intValue();
        boolean zW = ifh0Var.W();
        b7x b7xVar = b7x.a;
        if (zW) {
            this.b = q5t0VarArr;
            this.d = iIntValue;
            this.f = iIntValue2;
            return ifh0Var.S(iIntValue, iIntValue2, b7xVar, this.h);
        }
        this.a.d.setValue(new yr80((((long) iIntValue) << 32) | (((long) iIntValue2) & 4294967295L)));
        this.c = q5t0VarArr;
        this.e = iIntValue;
        this.g = iIntValue2;
        return ifh0Var.S(iIntValue, iIntValue2, b7xVar, this.i);
    }

    @Override // p.gfh0
    public final int minIntrinsicHeight(p890 p890Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((afh0) list.get(0)).n(i));
            int iL = p7h.L(list);
            int i2 = 1;
            if (1 <= iL) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((afh0) list.get(i2)).n(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iL) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // p.gfh0
    public final int minIntrinsicWidth(p890 p890Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((afh0) list.get(0)).w(i));
            int iL = p7h.L(list);
            int i2 = 1;
            if (1 <= iL) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((afh0) list.get(i2)).w(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iL) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
