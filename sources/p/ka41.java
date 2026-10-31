package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ka41 {
    public final w01 a;

    public ka41(w01 w01Var) {
        this.a = w01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ka41) && u890.j(this.a, ((ka41) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
