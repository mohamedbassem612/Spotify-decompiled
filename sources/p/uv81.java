package p;

import android.os.SystemClock;
import androidx.media3.common.PlaybackException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class uv81 {
    public final int A;
    public final int B;
    public final sv81 C;
    public final sv81 D;
    public final l58 E;
    public final sv81 F;
    public final l58 G;
    public final byte H;
    public final boolean I;
    public final m8u0 a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final PlaybackException e;
    public final int f;
    public final boolean g;
    public final short h;
    public final short i;
    public final short j;
    public final k2u0 k;
    public final k0g1 l;
    public final po7 m;
    public final float n;
    public final float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z1k1 f155p;
    public final qeo q;
    public final xqt r;
    public final int s;
    public final l291 t;
    public final hjj0 u;
    public final sqe1 v;
    public final o3g1 w;
    public final tqh0 x;
    public final tqh0 y;
    public final int z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r6v15, types: [int, short] */
    /* JADX WARN: Type inference failed for: r6v18, types: [int, short] */
    /* JADX WARN: Type inference failed for: r6v21, types: [int, short] */
    public uv81(tv81 tv81Var) {
        int i;
        o3g1 o3g1Var = tv81Var.x;
        sv81 l58Var = tv81Var.E;
        tqh0 tqh0Var = tv81Var.y;
        boolean z = false;
        if (tv81Var.w.p()) {
            int i2 = tv81Var.d;
            dm5.n(i2 == 1 || i2 == 4, "Empty playlist only allowed in STATE_IDLE or STATE_ENDED");
            dm5.n(tv81Var.B == -1 && tv81Var.C == -1, "Ads not allowed if playlist is empty");
            o3g1Var = o3g1Var == null ? o3g1.b : o3g1Var;
            if (tqh0Var == null) {
                tqh0Var = tqh0.M;
            }
        } else {
            int i3 = tv81Var.A;
            if (i3 == -1) {
                i = 0;
            } else {
                dm5.n(i3 < tv81Var.w.o(), "currentMediaItemIndex must be less than playlist.size()");
                i = i3;
            }
            if (tv81Var.B != -1) {
                dqe1 dqe1Var = new dqe1();
                oqe1 oqe1Var = new oqe1();
                Long l = tv81Var.D;
                long jLongValue = l != null ? l.longValue() : l58Var.get();
                sqe1 sqe1Var = tv81Var.w;
                tv81Var.w.f(sqe1Var.b(sqe1Var.i(oqe1Var, dqe1Var, i, zoi1.W(jLongValue)).first), dqe1Var, false);
                dm5.n(tv81Var.B < dqe1Var.g.a, "PeriodData has less ad groups than adGroupIndex");
                int i4 = dqe1Var.g.a(tv81Var.B).b;
                if (i4 != -1) {
                    dm5.n(tv81Var.C < i4, "Ad group has less ads than adIndexInGroupIndex");
                }
            }
            b380 b380Var = tv81Var.v;
            if (b380Var != null) {
                nv81 nv81Var = (nv81) b380Var.get(i);
                o3g1 o3g1Var2 = nv81Var.b;
                tqh0Var = nv81Var.d;
                o3g1Var = o3g1Var2;
            }
            if (tqh0Var == null) {
                yoh0 yoh0Var = tv81Var.w.n(i, new oqe1(), 0L).c;
                o3g1Var.getClass();
                upq upqVar = new upq();
                b380 b380Var2 = o3g1Var.a;
                int size = b380Var2.size();
                int i5 = 0;
                while (i5 < size) {
                    n3g1 n3g1Var = (n3g1) b380Var2.get(i5);
                    for (?? r14 = z; r14 < n3g1Var.a; r14++) {
                        if (n3g1Var.e[r14]) {
                            ie30 ie30Var = n3g1Var.b.d[r14];
                            if (ie30Var.m != null) {
                                int i6 = 0;
                                while (true) {
                                    rij0[] rij0VarArr = ie30Var.m.a;
                                    if (i6 < rij0VarArr.length) {
                                        rij0VarArr[i6].b(upqVar);
                                        i6++;
                                    }
                                }
                            }
                        }
                    }
                    i5++;
                    z = false;
                }
                upqVar.b(yoh0Var.d);
                tqh0Var = new tqh0(upqVar);
                z = true;
            } else {
                z = false;
            }
        }
        if (tv81Var.e != null) {
            dm5.n(tv81Var.d == 1, "Player error only allowed in STATE_IDLE");
        }
        if (tv81Var.d != 1) {
        }
        Long l2 = tv81Var.D;
        if (l2 != null) {
            if (tv81Var.B == -1 && tv81Var.b && tv81Var.d == 3 && l2.longValue() != -9223372036854775807L) {
                final long jLongValue2 = tv81Var.D.longValue();
                final float f = tv81Var.k.a;
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                l58Var = new sv81() { // from class: p.rv81
                    @Override // p.sv81
                    public final long get() {
                        return jLongValue2 + ((long) ((SystemClock.elapsedRealtime() - jElapsedRealtime) * f));
                    }
                };
            } else {
                l58Var = new l58(tv81Var.D.longValue());
            }
        }
        sv81 sv81Var = tv81Var.F;
        this.a = tv81Var.a;
        this.b = tv81Var.b;
        this.c = tv81Var.c;
        this.d = tv81Var.d;
        this.e = tv81Var.e;
        this.f = tv81Var.f;
        this.g = tv81Var.g;
        this.h = tv81Var.h;
        this.i = tv81Var.i;
        this.j = tv81Var.j;
        this.k = tv81Var.k;
        this.l = tv81Var.l;
        this.m = tv81Var.m;
        this.n = tv81Var.n;
        this.o = tv81Var.o;
        this.f155p = tv81Var.f144p;
        this.q = tv81Var.q;
        this.r = tv81Var.r;
        this.s = tv81Var.s;
        this.t = tv81Var.t;
        this.u = tv81Var.u;
        this.v = tv81Var.w;
        o3g1Var.getClass();
        this.w = o3g1Var;
        this.x = tqh0Var;
        this.y = tv81Var.z;
        this.z = tv81Var.A;
        this.A = tv81Var.B;
        this.B = tv81Var.C;
        this.C = l58Var;
        this.D = sv81Var;
        this.E = tv81Var.G;
        this.F = tv81Var.H;
        this.G = tv81Var.I;
        this.H = tv81Var.J;
        this.I = z;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [int, short] */
    /* JADX WARN: Type inference failed for: r1v15, types: [int, short] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int, short] */
    public final tv81 a() {
        tv81 tv81Var = new tv81();
        tv81Var.a = this.a;
        tv81Var.b = this.b;
        tv81Var.c = this.c;
        tv81Var.d = this.d;
        tv81Var.e = this.e;
        tv81Var.f = this.f;
        tv81Var.g = this.g;
        tv81Var.h = this.h;
        tv81Var.i = this.i;
        tv81Var.j = this.j;
        tv81Var.k = this.k;
        tv81Var.l = this.l;
        tv81Var.m = this.m;
        tv81Var.n = this.n;
        tv81Var.o = this.o;
        tv81Var.f144p = this.f155p;
        tv81Var.q = this.q;
        tv81Var.r = this.r;
        tv81Var.s = this.s;
        tv81Var.t = this.t;
        tv81Var.u = this.u;
        sqe1 sqe1Var = this.v;
        tv81Var.w = sqe1Var;
        if (sqe1Var instanceof qv81) {
            tv81Var.v = ((qv81) sqe1Var).e;
        } else {
            tv81Var.x = this.w;
            tv81Var.y = this.I ? null : this.x;
        }
        tv81Var.z = this.y;
        tv81Var.A = this.z;
        tv81Var.B = this.A;
        tv81Var.C = this.B;
        tv81Var.D = null;
        tv81Var.E = this.C;
        tv81Var.F = this.D;
        tv81Var.G = this.E;
        tv81Var.H = this.F;
        tv81Var.I = this.G;
        tv81Var.J = this.H;
        return tv81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uv81) {
            uv81 uv81Var = (uv81) obj;
            if (this.b == uv81Var.b && this.c == uv81Var.c && this.a.equals(uv81Var.a) && this.d == uv81Var.d && this.e == uv81Var.e && this.f == uv81Var.f && this.g == uv81Var.g && this.h == uv81Var.h && this.i == uv81Var.i && this.j == uv81Var.j && this.k.equals(uv81Var.k) && this.l.equals(uv81Var.l) && this.m.equals(uv81Var.m) && this.n == uv81Var.n && this.o == uv81Var.o && this.f155p.equals(uv81Var.f155p) && this.q.equals(uv81Var.q) && this.r.equals(uv81Var.r) && this.s == uv81Var.s && this.t.equals(uv81Var.t) && this.u.equals(uv81Var.u) && this.v.equals(uv81Var.v) && this.w.equals(uv81Var.w) && this.x.equals(uv81Var.x) && this.y.equals(uv81Var.y) && this.z == uv81Var.z && this.A == uv81Var.A && this.B == uv81Var.B && this.C.equals(uv81Var.C) && this.D.equals(uv81Var.D) && this.E.equals(uv81Var.E) && this.F.equals(uv81Var.F) && this.G.equals(uv81Var.G) && this.H == uv81Var.H) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.a.hashCode() + 217) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + this.d) * 961;
        PlaybackException playbackException = this.e;
        int iHashCode2 = (((((iHashCode + (playbackException == null ? 0 : playbackException.hashCode())) * 31) + this.f) * 31) + (this.g ? 1 : 0)) * 961;
        long j = this.h;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.i;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.j;
        return (((this.G.hashCode() + ((this.F.hashCode() + ((this.E.hashCode() + ((this.D.hashCode() + ((this.C.hashCode() + ((((((((this.y.hashCode() + ((this.x.hashCode() + ((this.w.a.hashCode() + ((this.v.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + ((((this.r.hashCode() + ((this.q.hashCode() + ((this.f155p.hashCode() + ((Float.floatToRawIntBits(this.o) + ((Float.floatToRawIntBits(this.n) + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + this.s) * 961)) * 961)) * 31)) * 31)) * 31)) * 31)) * 31) + this.z) * 31) + this.A) * 31) + this.B) * 31)) * 31)) * 31)) * 31)) * 31)) * 961) + this.H) * 31;
    }
}
