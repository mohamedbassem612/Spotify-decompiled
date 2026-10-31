package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s5u0 {
    public static final s5u0 O = a(new s5u0[0]);
    public final int A;
    public final long B;
    public final int C;
    public final long D;
    public final long E;
    public final long F;
    public final long G;
    public final long H;
    public final int I;
    public final int J;
    public final int K;
    public final List L;
    public final List M;
    public final long[] N;
    public final int a;
    public final List b;
    public final List c;
    public final long d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final long i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f132p;
    public final List q;
    public final List r;
    public final long s;
    public final long t;
    public final long u;
    public final long v;
    public final long w;
    public final long x;
    public final int y;
    public final int z;

    public s5u0(int i, long[] jArr, List list, List list2, long j, int i2, int i3, int i4, int i5, long j2, int i6, int i7, int i8, int i9, int i10, long j3, int i11, List list3, List list4, long j4, long j5, long j6, long j7, long j8, long j9, int i12, int i13, int i14, long j10, int i15, long j11, long j12, long j13, long j14, long j15, int i16, int i17, int i18, List list5, List list6) {
        this.a = i;
        this.N = jArr;
        this.b = Collections.unmodifiableList(list);
        this.c = Collections.unmodifiableList(list2);
        this.d = j;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = j2;
        this.j = i6;
        this.k = i7;
        this.l = i8;
        this.m = i9;
        this.n = i10;
        this.o = j3;
        this.f132p = i11;
        this.q = Collections.unmodifiableList(list3);
        this.r = Collections.unmodifiableList(list4);
        this.s = j4;
        this.t = j5;
        this.u = j6;
        this.v = j7;
        this.w = j8;
        this.x = j9;
        this.y = i12;
        this.z = i13;
        this.A = i14;
        this.B = j10;
        this.C = i15;
        this.D = j11;
        this.E = j12;
        this.F = j13;
        this.G = j14;
        this.H = j15;
        this.I = i16;
        this.J = i17;
        this.K = i18;
        this.L = Collections.unmodifiableList(list5);
        this.M = Collections.unmodifiableList(list6);
    }

    public static s5u0 a(s5u0... s5u0VarArr) {
        s5u0[] s5u0VarArr2 = s5u0VarArr;
        long[] jArr = new long[16];
        int length = s5u0VarArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = -1;
        long j12 = -1;
        long jMax = -9223372036854775807L;
        long jMin = -9223372036854775807L;
        long j13 = -9223372036854775807L;
        int i15 = -1;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i16 < length) {
            s5u0 s5u0Var = s5u0VarArr2[i16];
            int i20 = i + s5u0Var.a;
            for (int i21 = 0; i21 < 16; i21++) {
                jArr[i21] = jArr[i21] + s5u0Var.N[i21];
            }
            long j14 = s5u0Var.d;
            if (jMin == -9223372036854775807L) {
                jMin = j14;
            } else if (j14 != -9223372036854775807L) {
                jMin = Math.min(jMin, j14);
            }
            i17 += s5u0Var.e;
            i18 += s5u0Var.f;
            i19 += s5u0Var.g;
            i2 += s5u0Var.h;
            long j15 = s5u0Var.i;
            if (j13 == -9223372036854775807L) {
                j13 = j15;
            } else if (j15 != -9223372036854775807L) {
                j13 += j15;
            }
            i3 += s5u0Var.j;
            i4 += s5u0Var.k;
            i5 += s5u0Var.l;
            i6 += s5u0Var.m;
            i7 += s5u0Var.n;
            long j16 = s5u0Var.o;
            if (jMax == -9223372036854775807L) {
                jMax = j16;
            } else if (j16 != -9223372036854775807L) {
                jMax = Math.max(jMax, j16);
            }
            i8 += s5u0Var.f132p;
            j += s5u0Var.s;
            j2 += s5u0Var.t;
            j3 += s5u0Var.u;
            j4 += s5u0Var.v;
            j5 += s5u0Var.w;
            j6 += s5u0Var.x;
            i9 += s5u0Var.y;
            i10 += s5u0Var.z;
            int i22 = s5u0Var.A;
            int i23 = i15;
            int i24 = length;
            if (i23 != -1) {
                i22 = i22 != -1 ? i22 + i23 : i23;
            }
            long j17 = s5u0Var.B;
            if (j11 == -1) {
                j11 = j17;
            } else if (j17 != -1) {
                j11 += j17;
            }
            i11 += s5u0Var.C;
            long j18 = s5u0Var.D;
            if (j12 == -1) {
                j12 = j18;
            } else if (j18 != -1) {
                j12 += j18;
            }
            j7 += s5u0Var.E;
            j8 += s5u0Var.F;
            j9 += s5u0Var.G;
            j10 += s5u0Var.H;
            i12 += s5u0Var.I;
            i13 += s5u0Var.J;
            i14 += s5u0Var.K;
            i16++;
            length = i24;
            i = i20;
            i15 = i22;
            s5u0VarArr2 = s5u0VarArr;
        }
        int i25 = i17;
        long j19 = jMin;
        int i26 = i2;
        long j20 = j13;
        int i27 = i3;
        int i28 = i4;
        int i29 = i5;
        int i30 = i6;
        int i31 = i7;
        long j21 = jMax;
        List list = Collections.EMPTY_LIST;
        return new s5u0(i, jArr, list, list, j19, i25, i18, i19, i26, j20, i27, i28, i29, i30, i31, j21, i8, list, list, j, j2, j3, j4, j5, j6, i9, i10, i15, j11, i11, j12, j7, j8, j9, j10, i12, i13, i14, list, list);
    }
}
