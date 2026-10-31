package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class udz0 implements wdz0 {
    public final pf9 a;

    public udz0(pf9 pf9Var) {
        this.a = pf9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof udz0) && this.a.equals(((udz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
