package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qlj0 implements w11 {
    public final w01 a;

    public qlj0(w01 w01Var) {
        this.a = w01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qlj0) && u890.j(this.a, ((qlj0) obj).a);
    }

    public final int hashCode() {
        w01 w01Var = this.a;
        if (w01Var == null) {
            return 0;
        }
        return w01Var.hashCode();
    }
}
