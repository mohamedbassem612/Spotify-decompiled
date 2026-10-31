package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class nge1 {
    public static final /* synthetic */ long b = avg.a.objectFieldOffset(nge1.class.getDeclaredField("_size$volatile"));
    private volatile /* synthetic */ int _size$volatile;
    public eb00[] a;

    public final void a(eb00 eb00Var) {
        eb00Var.c((fb00) this);
        eb00[] eb00VarArr = this.a;
        if (eb00VarArr == null) {
            eb00VarArr = new eb00[4];
            this.a = eb00VarArr;
        } else if (b() >= eb00VarArr.length) {
            eb00VarArr = (eb00[]) Arrays.copyOf(eb00VarArr, b() * 2);
            this.a = eb00VarArr;
        }
        int iB = b();
        avg.a.putIntVolatile(this, b, iB + 1);
        eb00VarArr[iB] = eb00Var;
        eb00Var.b = iB;
        d(iB);
    }

    public final int b() {
        return avg.a.getIntVolatile(this, b);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Code duplicated, block: B:14:0x0054  */
    /* JADX WARN: Code duplicated, block: B:17:0x0065  */
    /* JADX WARN: Code duplicated, block: B:21:0x0077 A[LOOP:0: B:9:0x003c->B:21:0x0077, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x007c A[EDGE_INSN: B:24:0x007c->B:22:0x007c BREAK  A[LOOP:0: B:9:0x003c->B:21:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007c A[EDGE_INSN: B:25:0x007c->B:22:0x007c BREAK  A[LOOP:0: B:9:0x003c->B:21:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    public final eb00 c(int i) {
        int i2;
        int i3;
        Object[] objArr;
        int i4;
        Comparable comparable;
        Comparable comparable2;
        Comparable comparable3;
        Object obj;
        Object[] objArr2 = this.a;
        objArr2.getClass();
        avg.a.putIntVolatile(this, b, b() - 1);
        if (i < b()) {
            e(i, b());
            int i5 = (i - 1) / 2;
            if (i > 0) {
                eb00 eb00Var = objArr2[i];
                eb00Var.getClass();
                Object obj2 = objArr2[i5];
                obj2.getClass();
                if (eb00Var.compareTo(obj2) < 0) {
                    e(i, i5);
                    d(i5);
                } else {
                    while (true) {
                        i2 = i * 2;
                        i3 = i2 + 1;
                        if (i3 >= b()) {
                            break;
                        }
                        objArr = this.a;
                        objArr.getClass();
                        i4 = i2 + 2;
                        if (i4 < b()) {
                            comparable3 = objArr[i4];
                            comparable3.getClass();
                            obj = objArr[i3];
                            obj.getClass();
                            if (comparable3.compareTo(obj) >= 0) {
                                i4 = i3;
                            }
                        } else {
                            i4 = i3;
                        }
                        comparable = objArr[i];
                        comparable.getClass();
                        comparable2 = objArr[i4];
                        comparable2.getClass();
                        if (comparable.compareTo(comparable2) <= 0) {
                            break;
                        }
                        e(i, i4);
                        i = i4;
                    }
                }
            } else {
                while (true) {
                    i2 = i * 2;
                    i3 = i2 + 1;
                    if (i3 >= b()) {
                        break;
                        break;
                    }
                    objArr = this.a;
                    objArr.getClass();
                    i4 = i2 + 2;
                    if (i4 < b()) {
                        comparable3 = objArr[i4];
                        comparable3.getClass();
                        obj = objArr[i3];
                        obj.getClass();
                        if (comparable3.compareTo(obj) >= 0) {
                            i4 = i3;
                        }
                    } else {
                        i4 = i3;
                    }
                    comparable = objArr[i];
                    comparable.getClass();
                    comparable2 = objArr[i4];
                    comparable2.getClass();
                    if (comparable.compareTo(comparable2) <= 0) {
                        break;
                        break;
                    }
                    e(i, i4);
                    i = i4;
                }
            }
        }
        eb00 eb00Var2 = objArr2[b()];
        eb00Var2.getClass();
        eb00Var2.c(null);
        eb00Var2.b = -1;
        objArr2[b()] = null;
        return eb00Var2;
    }

    public final void d(int i) {
        while (i > 0) {
            eb00[] eb00VarArr = this.a;
            eb00VarArr.getClass();
            int i2 = (i - 1) / 2;
            eb00 eb00Var = eb00VarArr[i2];
            eb00Var.getClass();
            eb00 eb00Var2 = eb00VarArr[i];
            eb00Var2.getClass();
            if (eb00Var.compareTo(eb00Var2) <= 0) {
                return;
            }
            e(i, i2);
            i = i2;
        }
    }

    public final void e(int i, int i2) {
        eb00[] eb00VarArr = this.a;
        eb00VarArr.getClass();
        eb00 eb00Var = eb00VarArr[i2];
        eb00Var.getClass();
        eb00 eb00Var2 = eb00VarArr[i];
        eb00Var2.getClass();
        eb00VarArr[i] = eb00Var;
        eb00VarArr[i2] = eb00Var2;
        eb00Var.b = i;
        eb00Var2.b = i2;
    }
}
