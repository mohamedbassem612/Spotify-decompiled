package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class feh0 implements heh0 {
    public final jeh0 a;

    public feh0(jeh0 jeh0Var) {
        this.a = jeh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof feh0) && u890.j(this.a, ((feh0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
