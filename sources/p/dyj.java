package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dyj implements eyj {
    public final sw31 a;

    public dyj(sw31 sw31Var) {
        this.a = sw31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dyj) && u890.j(this.a, ((dyj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
