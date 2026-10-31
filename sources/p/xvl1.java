package p;

import java.util.HashSet;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xvl1 {
    public final UUID a;
    public final wvl1 b;
    public final HashSet c;
    public final ewq d;
    public final ewq e;
    public final int f;
    public final int g;
    public final gjl h;
    public final long i;
    public final vvl1 j;
    public final long k;
    public final int l;

    public xvl1(UUID uuid, wvl1 wvl1Var, HashSet hashSet, ewq ewqVar, ewq ewqVar2, int i, int i2, gjl gjlVar, long j, vvl1 vvl1Var, long j2, int i3) {
        this.a = uuid;
        this.b = wvl1Var;
        this.c = hashSet;
        this.d = ewqVar;
        this.e = ewqVar2;
        this.f = i;
        this.g = i2;
        this.h = gjlVar;
        this.i = j;
        this.j = vvl1Var;
        this.k = j2;
        this.l = i3;
    }

    public final wvl1 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !xvl1.class.equals(obj.getClass())) {
            return false;
        }
        xvl1 xvl1Var = (xvl1) obj;
        if (this.f == xvl1Var.f && this.g == xvl1Var.g && this.a.equals(xvl1Var.a) && this.b == xvl1Var.b && u890.j(this.d, xvl1Var.d) && this.h.equals(xvl1Var.h) && this.i == xvl1Var.i && u890.j(this.j, xvl1Var.j) && this.k == xvl1Var.k && this.l == xvl1Var.l && this.c.equals(xvl1Var.c)) {
            return u890.j(this.e, xvl1Var.e);
        }
        return false;
    }

    public final int hashCode() {
        int iF = cy30.f((this.h.hashCode() + ((((((this.e.hashCode() + ((this.c.hashCode() + ((this.d.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f) * 31) + this.g) * 31)) * 31, this.i, 31);
        vvl1 vvl1Var = this.j;
        return Integer.hashCode(this.l) + cy30.f((iF + (vvl1Var != null ? vvl1Var.hashCode() : 0)) * 31, this.k, 31);
    }

    public final String toString() {
        return "WorkInfo{id='" + this.a + "', state=" + this.b + ", outputData=" + this.d + ", tags=" + this.c + ", progress=" + this.e + ", runAttemptCount=" + this.f + ", generation=" + this.g + ", constraints=" + this.h + ", initialDelayMillis=" + this.i + ", periodicityInfo=" + this.j + ", nextScheduleTimeMillis=" + this.k + "}, stopReason=" + this.l;
    }
}
