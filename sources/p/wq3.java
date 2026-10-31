package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wq3 extends hr3 {
    public final jv51 a;

    public wq3(jv51 jv51Var) {
        this.a = jv51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wq3) && this.a.equals(((wq3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
