package p;

import android.net.Uri;
import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class oqe1 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final Object q = new Object();
    public static final yoh0 r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public Object b;
    public Object d;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;
    public roh0 j;
    public boolean k;
    public long l;
    public long m;
    public int n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f108p;
    public Object a = q;
    public yoh0 c = r;

    static {
        koh0 koh0Var = new koh0();
        koh0Var.b = "androidx.media3.common.Timeline";
        koh0Var.e = Uri.EMPTY;
        r = koh0Var.a();
        s = Integer.toString(1, 36);
        t = Integer.toString(2, 36);
        u = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        w = Integer.toString(5, 36);
        x = Integer.toString(6, 36);
        y = Integer.toString(7, 36);
        z = Integer.toString(8, 36);
        A = Integer.toString(9, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(11, 36);
        D = Integer.toString(12, 36);
        E = Integer.toString(13, 36);
        F = Integer.toString(14, 36);
    }

    public final long a() {
        long j = this.g;
        return j == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j;
    }

    public final long b() {
        return zoi1.n0(this.m);
    }

    public final boolean c() {
        return this.j != null;
    }

    public final void d(Object obj, yoh0 yoh0Var, Object obj2, long j, long j2, long j3, boolean z2, boolean z3, roh0 roh0Var, long j4, long j5, int i, int i2, long j6) {
        this.a = obj;
        this.c = yoh0Var != null ? yoh0Var : r;
        if (yoh0Var != null) {
            soh0 soh0Var = yoh0Var.b;
        }
        this.b = null;
        this.d = obj2;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = z2;
        this.i = z3;
        this.j = roh0Var;
        this.l = j4;
        this.m = j5;
        this.n = i;
        this.o = i2;
        this.f108p = j6;
        this.k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && oqe1.class.equals(obj.getClass())) {
            oqe1 oqe1Var = (oqe1) obj;
            if (Objects.equals(this.a, oqe1Var.a) && Objects.equals(this.c, oqe1Var.c) && Objects.equals(this.d, oqe1Var.d) && Objects.equals(this.j, oqe1Var.j) && this.e == oqe1Var.e && this.f == oqe1Var.f && this.g == oqe1Var.g && this.h == oqe1Var.h && this.i == oqe1Var.i && this.k == oqe1Var.k && this.l == oqe1Var.l && this.m == oqe1Var.m && this.n == oqe1Var.n && this.o == oqe1Var.o && this.f108p == oqe1Var.f108p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        roh0 roh0Var = this.j;
        int iHashCode3 = (iHashCode2 + (roh0Var != null ? roh0Var.hashCode() : 0)) * 31;
        long j = this.e;
        int i = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.g;
        int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31;
        long j4 = this.l;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.m;
        int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.n) * 31) + this.o) * 31;
        long j6 = this.f108p;
        return i5 + ((int) (j6 ^ (j6 >>> 32)));
    }
}
