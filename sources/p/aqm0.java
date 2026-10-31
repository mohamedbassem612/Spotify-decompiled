package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class aqm0 {
    public final bqm0 a;

    public aqm0(bqm0 bqm0Var) {
        this.a = bqm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aqm0) && u890.j(this.a, ((aqm0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
