package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d911 extends g911 {
    public final pp90 a;

    public d911(pp90 pp90Var) {
        this.a = pp90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d911) && u890.j(this.a, ((d911) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
