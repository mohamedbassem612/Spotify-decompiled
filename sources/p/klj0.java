package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class klj0 {
    public final boolean a;
    public final vjj0 b;

    public klj0(boolean z, vjj0 vjj0Var) {
        this.a = z;
        this.b = vjj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof klj0)) {
            return false;
        }
        klj0 klj0Var = (klj0) obj;
        return this.a == klj0Var.a && u890.j(this.b, klj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
