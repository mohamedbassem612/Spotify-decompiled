package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tv4 {
    public final jeh0 a;

    public tv4(jeh0 jeh0Var) {
        this.a = jeh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tv4) && u890.j(this.a, ((tv4) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
