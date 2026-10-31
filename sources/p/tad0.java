package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tad0 implements vad0 {
    public final rad0 a;

    public tad0(rad0 rad0Var) {
        this.a = rad0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tad0) && u890.j(this.a, ((tad0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
