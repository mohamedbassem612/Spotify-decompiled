package p;

import android.util.Pair;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nv81 {
    public final Object a;
    public final o3g1 b;
    public final yoh0 c;
    public final tqh0 d;
    public final Object e;
    public final roh0 f;
    public final long g;
    public final long h;
    public final long i;
    public final boolean j;
    public final boolean k;
    public final long l;
    public final long m;
    public final long n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b380 f104p;
    public final long[] q;

    public nv81(mv81 mv81Var) {
        roh0 roh0Var = mv81Var.f;
        long j = mv81Var.g;
        int i = 0;
        if (roh0Var == null) {
            dm5.n(j == -9223372036854775807L, "presentationStartTimeMs can only be set if liveConfiguration != null");
            dm5.n(mv81Var.h == -9223372036854775807L, "windowStartTimeMs can only be set if liveConfiguration != null");
            dm5.n(mv81Var.i == -9223372036854775807L, "elapsedRealtimeEpochOffsetMs can only be set if liveConfiguration != null");
        } else if (j != -9223372036854775807L) {
            long j2 = mv81Var.h;
            if (j2 != -9223372036854775807L) {
                dm5.n(j2 >= j, "windowStartTimeMs can't be less than presentationStartTimeMs");
            }
        }
        int size = mv81Var.f96p.size();
        long j3 = mv81Var.m;
        if (j3 != -9223372036854775807L) {
            dm5.n(mv81Var.l <= j3, "defaultPositionUs can't be greater than durationUs");
        }
        this.a = mv81Var.a;
        this.b = mv81Var.b;
        this.c = mv81Var.c;
        this.d = mv81Var.d;
        this.e = mv81Var.e;
        this.f = mv81Var.f;
        this.g = mv81Var.g;
        this.h = mv81Var.h;
        this.i = mv81Var.i;
        this.j = mv81Var.j;
        this.k = mv81Var.k;
        this.l = mv81Var.l;
        this.m = mv81Var.m;
        long j4 = mv81Var.n;
        this.n = j4;
        this.o = mv81Var.o;
        b380 b380Var = mv81Var.f96p;
        this.f104p = b380Var;
        long[] jArr = new long[b380Var.size()];
        this.q = jArr;
        if (b380Var.isEmpty()) {
            return;
        }
        jArr[0] = -j4;
        while (i < size - 1) {
            long[] jArr2 = this.q;
            int i2 = i + 1;
            long j5 = jArr2[i];
            ((ov81) this.f104p.get(i)).getClass();
            jArr2[i2] = j5 + 0;
            i = i2;
        }
    }

    public final Object a(int i) {
        b380 b380Var = this.f104p;
        boolean zIsEmpty = b380Var.isEmpty();
        Object obj = this.a;
        if (zIsEmpty) {
            return obj;
        }
        ((ov81) b380Var.get(i)).getClass();
        return Pair.create(obj, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nv81)) {
            return false;
        }
        nv81 nv81Var = (nv81) obj;
        if (this.a.equals(nv81Var.a) && this.b.equals(nv81Var.b) && this.c.equals(nv81Var.c) && Objects.equals(this.d, nv81Var.d) && Objects.equals(this.e, nv81Var.e) && Objects.equals(this.f, nv81Var.f) && this.g == nv81Var.g && this.h == nv81Var.h && this.i == nv81Var.i && this.j == nv81Var.j && this.k == nv81Var.k && this.l == nv81Var.l && this.m == nv81Var.m && this.n == nv81Var.n && this.o == nv81Var.o) {
            b380 b380Var = nv81Var.f104p;
            b380 b380Var2 = this.f104p;
            b380Var2.getClass();
            if (z1p1.j(b380Var2, b380Var)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.a.hashCode() + ((this.a.hashCode() + 217) * 31)) * 31)) * 31;
        tqh0 tqh0Var = this.d;
        int iHashCode2 = (iHashCode + (tqh0Var == null ? 0 : tqh0Var.hashCode())) * 31;
        Object obj = this.e;
        int iHashCode3 = (iHashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        roh0 roh0Var = this.f;
        int iHashCode4 = (iHashCode3 + (roh0Var != null ? roh0Var.hashCode() : 0)) * 31;
        long j = this.g;
        int i = (iHashCode4 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.h;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.i;
        int i3 = (((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.j ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31;
        long j4 = this.l;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.m;
        int i5 = (i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.n;
        return this.f104p.hashCode() + ((((i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31) + (this.o ? 1 : 0)) * 31);
    }
}
