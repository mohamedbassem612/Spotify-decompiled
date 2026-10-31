package p;

import com.spotify.creativework.v1.Release;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q1v0 implements wpw {
    public final y1c1 a;
    public final Release b;
    public final iac0 c;
    public final dys d;
    public final r1v0 e;
    public final rey0 f = ila0.D();
    public final eih1 g = new eih1();
    public final nsw h = jch0.j(new ixt0(this, (byte) 3));

    public q1v0(y1c1 y1c1Var, Release release, iac0 iac0Var, dys dysVar, r1v0 r1v0Var) {
        this.a = y1c1Var;
        this.b = release;
        this.c = iac0Var;
        this.d = dysVar;
        this.e = r1v0Var;
    }

    public final rqw a() {
        return this.g;
    }

    public final rsw c() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q1v0) {
            q1v0 q1v0Var = (q1v0) obj;
            if (this.a.equals(q1v0Var.a) && this.b.equals(q1v0Var.b) && this.c.equals(q1v0Var.c) && this.d == q1v0Var.d && this.e.equals(q1v0Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final mqw getBehavior() {
        return this.f;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
