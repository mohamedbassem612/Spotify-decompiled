package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dqe1 {
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public Object a;
    public Object b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public ev0 g = ev0.f;

    static {
        String str = zoi1.a;
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
        m = Integer.toString(5, 36);
        n = Integer.toString(6, 36);
    }

    public final long a(int i2, int i3) {
        bv0 bv0VarA = this.g.a(i2);
        if (bv0VarA.b != -1) {
            return bv0VarA.g[i3];
        }
        return -9223372036854775807L;
    }

    public final int b(long j2) {
        bv0 bv0VarA;
        int i2;
        ev0 ev0Var = this.g;
        long j3 = this.d;
        int i3 = ev0Var.a;
        if (j2 != Long.MIN_VALUE && (j3 == -9223372036854775807L || j2 < j3)) {
            int i4 = ev0Var.d;
            while (i4 < i3 && ((ev0Var.a(i4).a != Long.MIN_VALUE && ev0Var.a(i4).a <= j2) || ((i2 = (bv0VarA = ev0Var.a(i4)).b) != -1 && bv0VarA.a(-1) >= i2))) {
                i4++;
            }
            if (i4 < i3 && (j3 == -9223372036854775807L || ev0Var.a(i4).a <= j3)) {
                return i4;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    public final int c(long j2) {
        int i2;
        ev0 ev0Var = this.g;
        long j3 = this.d;
        int i3 = ev0Var.a;
        int i4 = i3 - 1;
        if (i4 == i3 - 1) {
            bv0 bv0VarA = ev0Var.a(i4);
            if (bv0VarA.l && bv0VarA.a == Long.MIN_VALUE && bv0VarA.b == -1) {
                i2 = 1;
            } else {
                i2 = 0;
            }
        } else {
            i2 = 0;
        }
        int i5 = i4 - i2;
        while (i5 >= 0 && j2 != Long.MIN_VALUE) {
            bv0 bv0VarA2 = ev0Var.a(i5);
            long j4 = bv0VarA2.a;
            if (j4 != Long.MIN_VALUE) {
                if (j2 >= j4) {
                    break;
                }
                i5--;
            } else {
                if (j3 != -9223372036854775807L && ((!bv0VarA2.l || j4 != Long.MIN_VALUE || bv0VarA2.b != -1) && j2 >= j3)) {
                    break;
                }
                i5--;
            }
        }
        if (i5 >= 0) {
            bv0 bv0VarA3 = ev0Var.a(i5);
            int i6 = bv0VarA3.b;
            if (i6 != -1) {
                for (int i7 = 0; i7 < i6; i7++) {
                    int i8 = bv0VarA3.f[i7];
                    if (i8 != 0 && i8 != 1) {
                    }
                }
            }
            return i5;
        }
        return -1;
    }

    public final long d(int i2) {
        return this.g.a(i2).a;
    }

    public final int e(int i2, int i3) {
        bv0 bv0VarA = this.g.a(i2);
        if (bv0VarA.b != -1) {
            return bv0VarA.f[i3];
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dqe1.class.equals(obj.getClass())) {
            dqe1 dqe1Var = (dqe1) obj;
            if (Objects.equals(this.a, dqe1Var.a) && Objects.equals(this.b, dqe1Var.b) && this.c == dqe1Var.c && this.d == dqe1Var.d && this.e == dqe1Var.e && this.f == dqe1Var.f && Objects.equals(this.g, dqe1Var.g)) {
                return true;
            }
        }
        return false;
    }

    public final int f(int i2) {
        return this.g.a(i2).a(-1);
    }

    public final boolean g(int i2) {
        ev0 ev0Var = this.g;
        int i3 = ev0Var.a;
        if (i2 != i3 - 1 || i2 != i3 - 1) {
            return false;
        }
        bv0 bv0VarA = ev0Var.a(i2);
        return bv0VarA.l && bv0VarA.a == Long.MIN_VALUE && bv0VarA.b == -1;
    }

    public final boolean h(int i2) {
        return this.g.a(i2).k;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.b;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c) * 31;
        long j2 = this.d;
        int i2 = (iHashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.e;
        return this.g.hashCode() + ((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
    }

    public final void i(Object obj, Object obj2, int i2, long j2, long j3, ev0 ev0Var, boolean z) {
        this.a = obj;
        this.b = obj2;
        this.c = i2;
        this.d = j2;
        this.e = j3;
        this.g = ev0Var;
        this.f = z;
    }
}
