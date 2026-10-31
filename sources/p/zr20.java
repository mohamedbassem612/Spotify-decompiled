package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zr20 implements bs20 {
    public final nv20 a;

    public zr20(nv20 nv20Var) {
        this.a = nv20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zr20) && u890.j(this.a, ((zr20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
