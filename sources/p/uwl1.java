package p;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class uwl1 {
    public final String a;
    public final wvl1 b;
    public final ewq c;
    public final long d;
    public final long e;
    public final long f;
    public final gjl g;
    public final int h;
    public final h0a i;
    public final long j;
    public final long k;
    public final int l;
    public final int m;
    public final long n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f158p;
    public final List q;

    public uwl1(String str, wvl1 wvl1Var, ewq ewqVar, long j, long j2, long j3, gjl gjlVar, int i, h0a h0aVar, long j4, long j5, int i2, int i3, long j6, int i4, List list, List list2) {
        this.a = str;
        this.b = wvl1Var;
        this.c = ewqVar;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = gjlVar;
        this.h = i;
        this.i = h0aVar;
        this.j = j4;
        this.k = j5;
        this.l = i2;
        this.m = i3;
        this.n = j6;
        this.o = i4;
        this.f158p = list;
        this.q = list2;
    }

    public final xvl1 a() {
        long j;
        long j2;
        List list = this.q;
        ewq ewqVar = !list.isEmpty() ? (ewq) list.get(0) : ewq.b;
        UUID uuidFromString = UUID.fromString(this.a);
        HashSet hashSet = new HashSet(this.f158p);
        long j3 = this.e;
        vvl1 vvl1Var = j3 != 0 ? new vvl1(j3, this.f) : null;
        wvl1 wvl1Var = this.b;
        int i = this.h;
        long j4 = this.d;
        wvl1 wvl1Var2 = wvl1.a;
        if (wvl1Var == wvl1Var2) {
            hhg1 hhg1Var = vwl1.z;
            j = j4;
            j2 = j2h1.j(wvl1Var == wvl1Var2 && i > 0, i, this.i, this.j, this.k, this.l, j3 != 0, j, this.f, j3, this.n);
        } else {
            j = j4;
            j2 = Long.MAX_VALUE;
        }
        return new xvl1(uuidFromString, wvl1Var, hashSet, this.c, ewqVar, i, this.m, this.g, j, vvl1Var, j2, this.o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uwl1)) {
            return false;
        }
        uwl1 uwl1Var = (uwl1) obj;
        return u890.j(this.a, uwl1Var.a) && this.b == uwl1Var.b && u890.j(this.c, uwl1Var.c) && this.d == uwl1Var.d && this.e == uwl1Var.e && this.f == uwl1Var.f && this.g.equals(uwl1Var.g) && this.h == uwl1Var.h && this.i == uwl1Var.i && this.j == uwl1Var.j && this.k == uwl1Var.k && this.l == uwl1Var.l && this.m == uwl1Var.m && this.n == uwl1Var.n && this.o == uwl1Var.o && this.f158p.equals(uwl1Var.f158p) && this.q.equals(uwl1Var.q);
    }

    public final int hashCode() {
        return this.q.hashCode() + f4i1.b(kaa0.f(this.o, cy30.f(kaa0.f(this.m, kaa0.f(this.l, cy30.f(cy30.f((this.i.hashCode() + kaa0.f(this.h, (this.g.hashCode() + cy30.f(cy30.f(cy30.f((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, this.d, 31), this.e, 31), this.f, 31)) * 31, 31)) * 31, this.j, 31), this.k, 31), 31), 31), this.n, 31), 31), 31, this.f158p);
    }

    public final String toString() {
        return "WorkInfoPojo(id=" + this.a + ", state=" + this.b + ", output=" + this.c + ", initialDelay=" + this.d + ", intervalDuration=" + this.e + ", flexDuration=" + this.f + ", constraints=" + this.g + ", runAttemptCount=" + this.h + ", backoffPolicy=" + this.i + ", backoffDelayDuration=" + this.j + ", lastEnqueueTime=" + this.k + ", periodCount=" + this.l + ", generation=" + this.m + ", nextScheduleTimeOverride=" + this.n + ", stopReason=" + this.o + ", tags=" + this.f158p + ", progress=" + this.q + ')';
    }
}
