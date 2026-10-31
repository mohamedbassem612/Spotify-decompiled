package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xx90 implements ay90 {
    public final jeh0 a;

    public xx90(jeh0 jeh0Var) {
        this.a = jeh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xx90) && this.a.equals(((xx90) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
