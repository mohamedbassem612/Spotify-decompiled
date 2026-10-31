package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ojj1 {
    public final pr60 a;

    public ojj1(pr60 pr60Var) {
        this.a = pr60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ojj1) && this.a == ((ojj1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
