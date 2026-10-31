package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class be10 implements fe10 {
    public final xd10 a;

    public be10(xd10 xd10Var) {
        this.a = xd10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof be10) && u890.j(this.a, ((be10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
