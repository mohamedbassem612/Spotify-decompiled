package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ii21 extends si21 {
    public final sqw0 a;

    public ii21(sqw0 sqw0Var) {
        this.a = sqw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ii21) && this.a.equals(((ii21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
