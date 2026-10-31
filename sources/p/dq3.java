package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dq3 extends hr3 {
    public final w7c0 a;

    public dq3(w7c0 w7c0Var) {
        this.a = w7c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dq3) && this.a.equals(((dq3) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
