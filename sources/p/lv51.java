package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lv51 {
    public final ycv a;

    public lv51(ycv ycvVar) {
        this.a = ycvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lv51) && u890.j(this.a, ((lv51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
