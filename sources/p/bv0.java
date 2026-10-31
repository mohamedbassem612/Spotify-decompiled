package p;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bv0 {
    public static final String m;
    public static final String n;
    public static final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f19p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public final long a;
    public final int b;
    public final int c;
    public final Uri[] d;
    public final yoh0[] e;
    public final int[] f;
    public final long[] g;
    public final String[] h;
    public final cv0[] i;
    public final long j;
    public final boolean k;
    public final boolean l;

    static {
        String str = zoi1.a;
        m = Integer.toString(0, 36);
        n = Integer.toString(1, 36);
        o = Integer.toString(2, 36);
        f19p = Integer.toString(3, 36);
        q = Integer.toString(4, 36);
        r = Integer.toString(5, 36);
        s = Integer.toString(6, 36);
        t = Integer.toString(7, 36);
        u = Integer.toString(8, 36);
        v = Integer.toString(9, 36);
        w = Integer.toString(10, 36);
        x = Integer.toString(11, 36);
    }

    public bv0(long j, int i, int i2, int[] iArr, yoh0[] yoh0VarArr, long[] jArr, long j2, boolean z, String[] strArr, cv0[] cv0VarArr, boolean z2) {
        Uri uri;
        int i3 = 0;
        dm5.m(iArr.length == yoh0VarArr.length);
        dm5.m(iArr.length == cv0VarArr.length);
        this.a = j;
        this.b = i;
        this.c = i2;
        this.f = iArr;
        this.e = yoh0VarArr;
        this.g = jArr;
        this.j = j2;
        this.k = z;
        this.d = new Uri[yoh0VarArr.length];
        while (true) {
            Uri[] uriArr = this.d;
            if (i3 >= uriArr.length) {
                this.h = strArr;
                this.i = cv0VarArr;
                this.l = z2;
                return;
            }
            yoh0 yoh0Var = yoh0VarArr[i3];
            if (yoh0Var == null) {
                uri = null;
            } else {
                soh0 soh0Var = yoh0Var.b;
                soh0Var.getClass();
                uri = soh0Var.a;
            }
            uriArr[i3] = uri;
            i3++;
        }
    }

    public final int a(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.f;
            if (i3 >= iArr.length || this.k || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bv0.class != obj.getClass()) {
            return false;
        }
        bv0 bv0Var = (bv0) obj;
        return this.a == bv0Var.a && this.b == bv0Var.b && this.c == bv0Var.c && Arrays.equals(this.e, bv0Var.e) && Arrays.equals(this.f, bv0Var.f) && Arrays.equals(this.g, bv0Var.g) && this.j == bv0Var.j && this.k == bv0Var.k && Arrays.equals(this.h, bv0Var.h) && Arrays.equals(this.i, bv0Var.i) && this.l == bv0Var.l;
    }

    public final int hashCode() {
        int i = ((this.b * 31) + this.c) * 31;
        long j = this.a;
        int iHashCode = (Arrays.hashCode(this.g) + ((Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((i + ((int) (j ^ (j >>> 32)))) * 31)) * 31)) * 31)) * 31;
        long j2 = this.j;
        return ((Arrays.hashCode(this.i) + ((((((iHashCode + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.k ? 1 : 0)) * 31) + Arrays.hashCode(this.h)) * 31)) * 31) + (this.l ? 1 : 0);
    }
}
