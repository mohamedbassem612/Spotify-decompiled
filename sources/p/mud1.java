package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mud1 implements nud1 {
    public final sud1 a;

    public mud1(sud1 sud1Var) {
        this.a = sud1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mud1) && u890.j(this.a, ((mud1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
