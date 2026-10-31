package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fnw0 {
    public final no90 a;

    public fnw0(no90 no90Var) {
        this.a = no90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fnw0) && u890.j(this.a, ((fnw0) obj).a);
    }

    public final int hashCode() {
        no90 no90Var = this.a;
        if (no90Var == null) {
            return 0;
        }
        return no90Var.hashCode();
    }
}
