package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mf50 implements o960 {
    public final c380 a;

    public mf50(c380 c380Var) {
        this.a = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mf50) && u890.j(this.a, ((mf50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
