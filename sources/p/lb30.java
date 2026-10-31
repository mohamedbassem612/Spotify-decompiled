package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lb30 implements ob30 {
    public final boolean a;
    public final c9 b;
    public final boolean c;

    public lb30(boolean z, c9 c9Var, boolean z2) {
        this.a = z;
        this.b = c9Var;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lb30)) {
            return false;
        }
        lb30 lb30Var = (lb30) obj;
        return this.a == lb30Var.a && u890.j(this.b, lb30Var.b) && this.c == lb30Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }
}
