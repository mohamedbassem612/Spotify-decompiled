package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class q5f0 implements Cloneable {
    public /* synthetic */ boolean a;
    public /* synthetic */ long[] b;
    public /* synthetic */ Object[] c;
    public /* synthetic */ int d;

    public q5f0(int i) {
        if (i == 0) {
            this.b = mp10.b;
            this.c = mp10.c;
        } else {
            int iS = mp10.s(i);
            this.b = new long[iS];
            this.c = new Object[iS];
        }
    }

    public final void a() {
        int i = this.d;
        Object[] objArr = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.d = 0;
        this.a = false;
    }

    public final Object b(long j) {
        Object obj;
        int iK = mp10.k(this.b, this.d, j);
        if (iK < 0 || (obj = this.c[iK]) == qon1.a) {
            return null;
        }
        return obj;
    }

    public final Object clone() {
        q5f0 q5f0Var = (q5f0) super.clone();
        q5f0Var.b = (long[]) this.b.clone();
        q5f0Var.c = (Object[]) this.c.clone();
        return q5f0Var;
    }

    public final int d(long j) {
        if (this.a) {
            int i = this.d;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != qon1.a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.a = false;
            this.d = i2;
        }
        return mp10.k(this.b, this.d, j);
    }

    public final long e(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.d)) {
            eqr0.N("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.a) {
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != qon1.a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.a = false;
            this.d = i3;
        }
        return this.b[i];
    }

    public final void g(long j, Object obj) {
        int iK = mp10.k(this.b, this.d, j);
        if (iK >= 0) {
            this.c[iK] = obj;
            return;
        }
        int i = ~iK;
        int i2 = this.d;
        Object obj2 = qon1.a;
        if (i < i2) {
            Object[] objArr = this.c;
            if (objArr[i] == obj2) {
                this.b[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.a) {
            long[] jArr = this.b;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.c;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.a = false;
                this.d = i3;
                i = ~mp10.k(this.b, i3, j);
            }
        }
        int i5 = this.d;
        if (i5 >= this.b.length) {
            int iS = mp10.s(i5 + 1);
            this.b = Arrays.copyOf(this.b, iS);
            this.c = Arrays.copyOf(this.c, iS);
        }
        int i6 = this.d;
        if (i6 - i != 0) {
            long[] jArr2 = this.b;
            int i7 = i + 1;
            f46.T(jArr2, jArr2, i7, i, i6);
            Object[] objArr3 = this.c;
            f46.Q(i7, i, this.d, objArr3, objArr3);
        }
        this.b[i] = j;
        this.c[i] = obj;
        this.d++;
    }

    public final void h(long j) {
        int iK = mp10.k(this.b, this.d, j);
        if (iK >= 0) {
            Object[] objArr = this.c;
            Object obj = objArr[iK];
            Object obj2 = qon1.a;
            if (obj != obj2) {
                objArr[iK] = obj2;
                this.a = true;
            }
        }
    }

    public final int i() {
        if (this.a) {
            int i = this.d;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != qon1.a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.a = false;
            this.d = i2;
        }
        return this.d;
    }

    public final Object j(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.d)) {
            eqr0.N("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.a) {
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != qon1.a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.a = false;
            this.d = i3;
        }
        return this.c[i];
    }

    public final String toString() {
        if (i() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(e(i2));
            sb.append('=');
            Object objJ = j(i2);
            if (objJ != sb) {
                sb.append(objJ);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ q5f0(Object obj) {
        this(10);
    }
}
