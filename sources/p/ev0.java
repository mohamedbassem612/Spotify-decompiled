package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ev0 {
    public static final ev0 f = new ev0(new bv0[0], 0, -9223372036854775807L, 0);
    public static final bv0 g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public final int a;
    public final long b;
    public final long c;
    public final int d;
    public final bv0[] e;

    static {
        bv0 bv0Var = new bv0(0L, -1, -1, new int[0], new yoh0[0], new long[0], 0L, false, new String[0], new cv0[0], false);
        int[] iArr = bv0Var.f;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = bv0Var.g;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        yoh0[] yoh0VarArr = (yoh0[]) Arrays.copyOf(bv0Var.e, 0);
        String[] strArr = (String[]) Arrays.copyOf(bv0Var.h, 0);
        cv0[] cv0VarArr = bv0Var.i;
        g = new bv0(bv0Var.a, 0, bv0Var.c, iArrCopyOf, yoh0VarArr, jArrCopyOf, bv0Var.j, bv0Var.k, strArr, (cv0[]) Arrays.copyOf(cv0VarArr, Math.max(0, cv0VarArr.length)), bv0Var.l);
        String str = zoi1.a;
        h = Integer.toString(1, 36);
        i = Integer.toString(2, 36);
        j = Integer.toString(3, 36);
        k = Integer.toString(4, 36);
    }

    public ev0(bv0[] bv0VarArr, long j2, long j3, int i2) {
        this.b = j2;
        this.c = j3;
        this.a = bv0VarArr.length + i2;
        this.e = bv0VarArr;
        this.d = i2;
    }

    public final bv0 a(int i2) {
        int i3 = this.d;
        return i2 < i3 ? g : this.e[i2 - i3];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ev0.class != obj.getClass()) {
            return false;
        }
        ev0 ev0Var = (ev0) obj;
        return this.a == ev0Var.a && this.b == ev0Var.b && this.c == ev0Var.c && this.d == ev0Var.d && Arrays.equals(this.e, ev0Var.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + (((((((this.a * 961) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + this.d) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=");
        sb.append(this.b);
        sb.append(", adGroups=[");
        int i2 = 0;
        while (true) {
            bv0[] bv0VarArr = this.e;
            if (i2 >= bv0VarArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=");
            sb.append(bv0VarArr[i2].a);
            sb.append(", contentResumeOffsetUs=");
            sb.append(bv0VarArr[i2].j);
            sb.append(", ads=[");
            for (int i3 = 0; i3 < bv0VarArr[i2].f.length; i3++) {
                sb.append("ad(state=");
                int i4 = bv0VarArr[i2].f[i3];
                if (i4 == 0) {
                    sb.append('_');
                } else if (i4 == 1) {
                    sb.append('R');
                } else if (i4 == 2) {
                    sb.append('S');
                } else if (i4 == 3) {
                    sb.append('P');
                } else if (i4 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(bv0VarArr[i2].g[i3]);
                sb.append(')');
                if (i3 < bv0VarArr[i2].f.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i2 < bv0VarArr.length - 1) {
                sb.append(", ");
            }
            i2++;
        }
    }
}
