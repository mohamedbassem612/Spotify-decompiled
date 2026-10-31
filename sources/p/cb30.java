package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cb30 {
    public final String a;
    public final f10 b;

    public cb30(String str, f10 f10Var) {
        this.a = str;
        this.b = f10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb30)) {
            return false;
        }
        cb30 cb30Var = (cb30) obj;
        return this.a.equals(cb30Var.a) && this.b.equals(cb30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
