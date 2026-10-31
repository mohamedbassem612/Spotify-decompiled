package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yho0 {
    public final som a;
    public final gho0 b;
    public final boolean c;

    public yho0(som somVar, gho0 gho0Var, boolean z) {
        this.a = somVar;
        this.b = gho0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yho0)) {
            return false;
        }
        yho0 yho0Var = (yho0) obj;
        return this.a.equals(yho0Var.a) && this.b.equals(yho0Var.b) && this.c == yho0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
