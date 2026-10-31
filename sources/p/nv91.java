package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nv91 implements Iterable, ola0 {
    public static final nv91 e = new nv91(0, 0, 0, null);
    public final long a;
    public final long b;
    public final long c;
    public final long[] d;

    public nv91(long j, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = jArr;
    }

    public final nv91 b(nv91 nv91Var) {
        long[] jArr;
        nv91 nv91VarC = this;
        nv91 nv91Var2 = e;
        if (nv91Var == nv91Var2) {
            return nv91VarC;
        }
        if (nv91VarC == nv91Var2) {
            return nv91Var2;
        }
        long j = nv91Var.c;
        long j2 = nv91Var.c;
        long[] jArr2 = nv91Var.d;
        long j3 = nv91Var.b;
        long j4 = nv91Var.a;
        long j5 = nv91VarC.c;
        if (j == j5 && jArr2 == (jArr = nv91VarC.d)) {
            return new nv91(nv91VarC.a & (~j4), nv91VarC.b & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                nv91VarC = nv91VarC.c(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    nv91VarC = nv91VarC.c(((long) i) + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    nv91VarC = nv91VarC.c(((long) i2) + j2 + 64);
                }
            }
        }
        return nv91VarC;
    }

    public final nv91 c(long j) {
        long[] jArr;
        int iG;
        long[] jArr2;
        long j2 = j - this.c;
        if (u890.r(j2, 0L) >= 0 && u890.r(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.b;
            if ((j4 & j3) != 0) {
                return new nv91(this.a, j4 & (~j3), this.c, this.d);
            }
        } else if (u890.r(j2, 64L) >= 0 && u890.r(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.a;
            if ((j6 & j5) != 0) {
                return new nv91(j6 & (~j5), this.b, this.c, this.d);
            }
        } else if (u890.r(j2, 0L) < 0 && (jArr = this.d) != null && (iG = bmq0.g(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (iG > 0) {
                    f46.T(jArr, jArr3, 0, 0, iG);
                }
                if (iG < i) {
                    f46.T(jArr, jArr3, iG, iG + 1, length);
                }
                jArr2 = jArr3;
            }
            return new nv91(this.a, this.b, this.c, jArr2);
        }
        return this;
    }

    public final boolean d(long j) {
        long[] jArr;
        long j2 = j - this.c;
        if (u890.r(j2, 0L) >= 0 && u890.r(j2, 64L) < 0) {
            return ((1 << ((int) j2)) & this.b) != 0;
        }
        if (u890.r(j2, 64L) < 0 || u890.r(j2, 128L) >= 0) {
            return u890.r(j2, 0L) <= 0 && (jArr = this.d) != null && bmq0.g(jArr, j) >= 0;
        }
        return ((1 << (((int) j2) + (-64))) & this.a) != 0;
    }

    public final nv91 e(nv91 nv91Var) {
        nv91 nv91VarF;
        long[] jArr;
        nv91 nv91VarF2 = this;
        nv91 nv91Var2 = e;
        if (nv91Var == nv91Var2) {
            return nv91VarF2;
        }
        if (nv91VarF2 == nv91Var2) {
            return nv91Var;
        }
        long j = nv91Var.c;
        long j2 = nv91Var.c;
        long[] jArr2 = nv91Var.d;
        long j3 = nv91Var.b;
        long j4 = nv91Var.a;
        long j5 = nv91VarF2.c;
        long j6 = nv91VarF2.b;
        long j7 = nv91VarF2.a;
        if (j == j5 && jArr2 == (jArr = nv91VarF2.d)) {
            return new nv91(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = nv91VarF2.d;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    nv91VarF2 = nv91VarF2.f(j8);
                }
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        nv91VarF2 = nv91VarF2.f(((long) i2) + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        nv91VarF2 = nv91VarF2.f(((long) i) + j2 + 64);
                    }
                    i++;
                }
            }
            return nv91VarF2;
        }
        if (jArr3 != null) {
            nv91VarF = nv91Var;
            for (long j9 : jArr3) {
                nv91VarF = nv91VarF.f(j9);
            }
        } else {
            nv91VarF = nv91Var;
        }
        long j10 = nv91VarF2.c;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    nv91VarF = nv91VarF.f(((long) i3) + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    nv91VarF = nv91VarF.f(((long) i) + j10 + 64);
                }
                i++;
            }
        }
        return nv91VarF;
    }

    public final nv91 f(long j) {
        long j2;
        long j3;
        long[] jArrM;
        int i;
        long j4 = this.c;
        long j5 = j - j4;
        long j6 = 0;
        int iR = u890.r(j5, 0L);
        long j7 = this.b;
        if (iR < 0 || u890.r(j5, 64L) >= 0) {
            int iR2 = u890.r(j5, 64L);
            long j8 = this.a;
            int i2 = 64;
            if (iR2 < 0 || u890.r(j5, 128L) >= 0) {
                int iR3 = u890.r(j5, 128L);
                long[] jArr = this.d;
                if (iR3 >= 0) {
                    if (!d(j)) {
                        long j9 = ((j + 1) / 64) * 64;
                        if (u890.r(j9, 0L) < 0) {
                            j9 = 9223372036854775680L;
                        }
                        xq81 xq81Var = null;
                        long j10 = j8;
                        while (true) {
                            if (u890.r(j4, j9) >= 0) {
                                j2 = j4;
                                j3 = j7;
                                break;
                            }
                            if (j7 != j6) {
                                if (xq81Var == null) {
                                    xq81Var = new xq81(jArr);
                                }
                                int i3 = 0;
                                i = i2;
                                while (i3 < i) {
                                    long j11 = j6;
                                    if ((j7 & (1 << i3)) != j6) {
                                        xq81Var.e(((long) i3) + j4);
                                    }
                                    i3++;
                                    j6 = j11;
                                }
                            } else {
                                i = i2;
                            }
                            long j12 = j6;
                            if (j10 == j12) {
                                j2 = j9;
                                j3 = j12;
                                break;
                            }
                            j4 += 64;
                            j6 = j12;
                            j7 = j10;
                            i2 = i;
                            j10 = j6;
                        }
                        return new nv91(j10, j3, j2, (xq81Var == null || (jArrM = xq81Var.m()) == null) ? jArr : jArrM).f(j);
                    }
                } else {
                    if (jArr == null) {
                        return new nv91(this.a, this.b, this.c, new long[]{j});
                    }
                    int iG = bmq0.g(jArr, j);
                    if (iG < 0) {
                        int i4 = -(iG + 1);
                        int length = jArr.length;
                        long[] jArr2 = new long[length + 1];
                        f46.T(jArr, jArr2, 0, 0, i4);
                        f46.T(jArr, jArr2, i4 + 1, i4, length);
                        jArr2[i4] = j;
                        return new nv91(this.a, this.b, this.c, jArr2);
                    }
                }
            } else {
                long j13 = 1 << (((int) j5) - 64);
                if ((j8 & j13) == 0) {
                    return new nv91(j8 | j13, this.b, this.c, this.d);
                }
            }
        } else {
            long j14 = 1 << ((int) j5);
            if ((j7 & j14) == 0) {
                return new nv91(this.a, j7 | j14, this.c, this.d);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new i46(new mv91(this, (lnm) null), (byte) 3).iterator();
    }

    public final String toString() {
        String string = super.toString();
        ArrayList arrayList = new ArrayList(q7h.U(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        return string + " [" + syo1.p(arrayList) + "]";
    }
}
