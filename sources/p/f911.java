package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f911 extends g911 {
    public final pp90 a;

    public f911(pp90 pp90Var) {
        this.a = pp90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f911) && u890.j(this.a, ((f911) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
