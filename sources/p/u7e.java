package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u7e extends w7e {
    public final kfe a;
    public final boolean b;
    public final rh90 c;

    public u7e(kfe kfeVar, boolean z, rh90 rh90Var) {
        this.a = kfeVar;
        this.b = z;
        this.c = rh90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7e)) {
            return false;
        }
        u7e u7eVar = (u7e) obj;
        return this.a == u7eVar.a && this.b == u7eVar.b && u890.j(this.c, u7eVar.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        rh90 rh90Var = this.c;
        return iG + (rh90Var == null ? 0 : rh90Var.hashCode());
    }
}
