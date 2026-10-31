package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zvt0 implements gwt0 {
    public final String a;
    public final ewt0 b;
    public final boolean c;

    public zvt0(String str, ewt0 ewt0Var, boolean z) {
        this.a = str;
        this.b = ewt0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvt0)) {
            return false;
        }
        zvt0 zvt0Var = (zvt0) obj;
        return u890.j(this.a, zvt0Var.a) && this.b == zvt0Var.b && this.c == zvt0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
