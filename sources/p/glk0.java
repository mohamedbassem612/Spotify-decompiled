package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class glk0 {
    public final rxj0 a;

    public glk0(rxj0 rxj0Var) {
        this.a = rxj0Var;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d9  */
    public final boolean a(zkk0 zkk0Var, zkk0 zkk0Var2) {
        boolean zEquals;
        u0d u0dVarB;
        u0d u0dVarB2;
        int iAbs;
        int iAbs2;
        Double d = zkk0Var.a;
        Double d2 = zkk0Var2.a;
        if (d != null && d2 != null && Math.abs(d.doubleValue()) <= Double.MAX_VALUE && Math.abs(d2.doubleValue()) <= Double.MAX_VALUE && d.doubleValue() > 0.0d && d2.doubleValue() > 0.0d) {
            double dDoubleValue = d.doubleValue();
            double dDoubleValue2 = d2.doubleValue();
            while (dDoubleValue < 78.0d) {
                dDoubleValue *= 2.0d;
            }
            while (dDoubleValue > 156.0d) {
                dDoubleValue /= 2.0d;
            }
            while (dDoubleValue2 < 78.0d) {
                dDoubleValue2 *= 2.0d;
            }
            while (dDoubleValue2 > 156.0d) {
                dDoubleValue2 /= 2.0d;
            }
            while (dDoubleValue < dDoubleValue2) {
                double d3 = dDoubleValue2 / 2.0d;
                if (dDoubleValue / d3 >= dDoubleValue2 / dDoubleValue) {
                    break;
                }
                dDoubleValue2 = d3;
            }
            while (dDoubleValue2 < dDoubleValue) {
                double d4 = dDoubleValue / 2.0d;
                if (dDoubleValue2 / d4 >= dDoubleValue / dDoubleValue2) {
                    break;
                }
                dDoubleValue = d4;
            }
            double dAbs = (Math.abs(dDoubleValue - dDoubleValue2) / dDoubleValue2) * 100.0d;
            rxj0 rxj0Var = this.a;
            if (dAbs <= rxj0Var.c0) {
                String str = zkk0Var.b;
                String str2 = zkk0Var2.b;
                if (str == null || (u0dVarB = bqn1.B(str)) == null) {
                    zEquals = false;
                } else {
                    int i = u0dVarB.a;
                    if (str2 == null || (u0dVarB2 = bqn1.B(str2)) == null) {
                        zEquals = false;
                    } else {
                        int i2 = u0dVarB2.a;
                        int iC = l1d.C(rxj0Var.j0);
                        if (iC == 0) {
                            zEquals = u0dVarB.equals(u0dVarB2);
                        } else if (iC != 1) {
                            if (iC != 2) {
                                if (iC != 3) {
                                    eg.o();
                                    return false;
                                }
                                if (i == i2 || (iAbs2 = Math.abs(i - i2)) == 1 || iAbs2 == 11) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (i == i2 || (u0dVarB.b == u0dVarB2.b && ((iAbs = Math.abs(i - i2)) == 1 || iAbs == 11))) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (i == i2) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    }
                }
                if (zEquals) {
                    return true;
                }
            }
        }
        return false;
    }
}
