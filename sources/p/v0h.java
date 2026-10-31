package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class v0h {
    public final tv80 a;
    public final boolean b;

    public v0h(tv80 tv80Var, boolean z) {
        this.a = tv80Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0h)) {
            return false;
        }
        v0h v0hVar = (v0h) obj;
        return u890.j(this.a, v0hVar.a) && this.b == v0hVar.b;
    }

    public final int hashCode() {
        tv80 tv80Var = this.a;
        return Boolean.hashCode(this.b) + ((tv80Var == null ? 0 : tv80Var.hashCode()) * 31);
    }
}
