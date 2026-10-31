package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class stg0 {
    public final List a;
    public final long b;
    public final jfv c;

    public stg0(List list, long j, jfv jfvVar) {
        this.a = list;
        this.b = j;
        this.c = jfvVar;
    }

    public final jfv a() {
        return this.c;
    }

    public final long b() {
        return this.b;
    }

    public final List c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof stg0)) {
            return false;
        }
        stg0 stg0Var = (stg0) obj;
        return this.a.equals(stg0Var.a) && jfv.f(this.b, stg0Var.b) && u890.j(this.c, stg0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ytw0 ytw0Var = jfv.b;
        int iF = cy30.f(iHashCode, this.b, 31);
        jfv jfvVar = this.c;
        return iF + (jfvVar == null ? 0 : Long.hashCode(jfvVar.a));
    }
}
