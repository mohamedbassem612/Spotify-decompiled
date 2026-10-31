package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fok0 implements hok0 {
    public final zge1 a;

    public fok0(zge1 zge1Var) {
        this.a = zge1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fok0) && u890.j(this.a, ((fok0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
