package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class lj70 {
    public final hj70 a;
    public final String b;

    public lj70(hj70 hj70Var, String str) {
        this.a = hj70Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return getClass().equals(obj != null ? obj.getClass() : null) && this.a.equals(((lj70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
