package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class roh0 {
    public static final roh0 f = new roh0(new qoh0());
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;

    static {
        String str = zoi1.a;
        g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        i = Integer.toString(2, 36);
        j = Integer.toString(3, 36);
        k = Integer.toString(4, 36);
    }

    public roh0(qoh0 qoh0Var) {
        long j2 = qoh0Var.a;
        long j3 = qoh0Var.b;
        long j4 = qoh0Var.c;
        float f2 = qoh0Var.d;
        float f3 = qoh0Var.e;
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = f2;
        this.e = f3;
    }

    public static roh0 b(Bundle bundle) {
        qoh0 qoh0Var = new qoh0();
        roh0 roh0Var = f;
        qoh0Var.a = bundle.getLong(g, roh0Var.a);
        qoh0Var.b = bundle.getLong(h, roh0Var.b);
        qoh0Var.c = bundle.getLong(i, roh0Var.c);
        qoh0Var.d = bundle.getFloat(j, roh0Var.d);
        qoh0Var.e = bundle.getFloat(k, roh0Var.e);
        return new roh0(qoh0Var);
    }

    public final qoh0 a() {
        qoh0 qoh0Var = new qoh0();
        qoh0Var.a = this.a;
        qoh0Var.b = this.b;
        qoh0Var.c = this.c;
        qoh0Var.d = this.d;
        qoh0Var.e = this.e;
        return qoh0Var;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        roh0 roh0Var = f;
        long j2 = roh0Var.a;
        long j3 = this.a;
        if (j3 != j2) {
            bundle.putLong(g, j3);
        }
        long j4 = roh0Var.b;
        long j5 = this.b;
        if (j5 != j4) {
            bundle.putLong(h, j5);
        }
        long j6 = roh0Var.c;
        long j7 = this.c;
        if (j7 != j6) {
            bundle.putLong(i, j7);
        }
        float f2 = roh0Var.d;
        float f3 = this.d;
        if (f3 != f2) {
            bundle.putFloat(j, f3);
        }
        float f4 = roh0Var.e;
        float f5 = this.e;
        if (f5 != f4) {
            bundle.putFloat(k, f5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof roh0)) {
            return false;
        }
        roh0 roh0Var = (roh0) obj;
        return this.a == roh0Var.a && this.b == roh0Var.b && this.c == roh0Var.c && this.d == roh0Var.d && this.e == roh0Var.e;
    }

    public final int hashCode() {
        long j2 = this.a;
        long j3 = this.b;
        int i2 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.c;
        int i3 = (i2 + ((int) ((j4 >>> 32) ^ j4))) * 31;
        float f2 = this.d;
        int iFloatToIntBits = (i3 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        float f3 = this.e;
        return iFloatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0);
    }
}
