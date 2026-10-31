package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gx11 implements ix11 {
    public final su6 a;

    public gx11(su6 su6Var) {
        this.a = su6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gx11) && u890.j(this.a, ((gx11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
