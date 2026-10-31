package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class smq0 {
    public final gfe a;
    public final mmq0 b;
    public final boolean c;

    public smq0(gfe gfeVar, mmq0 mmq0Var, boolean z) {
        this.a = gfeVar;
        this.b = mmq0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof smq0)) {
            return false;
        }
        smq0 smq0Var = (smq0) obj;
        return this.a == smq0Var.a && this.b == smq0Var.b && this.c == smq0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
