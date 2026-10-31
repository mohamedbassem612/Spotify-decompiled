package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vms0 {
    public final String a;
    public final cns0 b;

    public vms0(String str, cns0 cns0Var) {
        this.a = str;
        this.b = cns0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vms0)) {
            return false;
        }
        vms0 vms0Var = (vms0) obj;
        return u890.j(this.a, vms0Var.a) && this.b == vms0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
