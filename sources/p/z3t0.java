package p;

import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class z3t0 {
    public final String a;
    public final String b;
    public final String c;
    public final dcr0 d;
    public air0 e = null;
    public final BehaviorSubject f;
    public a4t0 g;

    public z3t0(String str, String str2, String str3, dcr0 dcr0Var, BehaviorSubject behaviorSubject, a4t0 a4t0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = dcr0Var;
        this.f = behaviorSubject;
        this.g = a4t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z3t0) {
            z3t0 z3t0Var = (z3t0) obj;
            if (u890.j(this.a, z3t0Var.a) && this.b.equals(z3t0Var.b) && this.c.equals(z3t0Var.c) && this.d == z3t0Var.d && u890.j(this.e, z3t0Var.e) && this.f == z3t0Var.f && this.g.equals(z3t0Var.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        air0 air0Var = this.e;
        return this.g.hashCode() + ((this.f.hashCode() + ((iHashCode + (air0Var == null ? 0 : air0Var.hashCode())) * 31)) * 31);
    }
}
