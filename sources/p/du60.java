package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class du60 extends ru60 {
    public final w47 a;

    public du60(w47 w47Var) {
        this.a = w47Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof du60) && this.a.equals(((du60) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
