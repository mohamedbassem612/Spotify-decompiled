package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yvt0 implements gwt0 {
    public final String a;
    public final ewt0 b;
    public final boolean c;

    public yvt0(String str, ewt0 ewt0Var, boolean z) {
        this.a = str;
        this.b = ewt0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yvt0)) {
            return false;
        }
        yvt0 yvt0Var = (yvt0) obj;
        return u890.j(this.a, yvt0Var.a) && this.b == yvt0Var.b && this.c == yvt0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
