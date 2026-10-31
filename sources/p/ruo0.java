package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ruo0 extends zuo0 {
    public final ya0 a;

    public ruo0(ya0 ya0Var) {
        this.a = ya0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ruo0) && u890.j(this.a, ((ruo0) obj).a);
    }

    public final int hashCode() {
        ya0 ya0Var = this.a;
        if (ya0Var == null) {
            return 0;
        }
        return ya0Var.hashCode();
    }
}
