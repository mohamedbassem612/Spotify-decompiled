package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fbg implements gbg {
    public final tr80 a;

    public fbg(tr80 tr80Var) {
        this.a = tr80Var;
    }

    public final tr80 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fbg) && u890.j(this.a, ((fbg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
