package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cn40 {
    public final hm41 a;

    public cn40(hm41 hm41Var) {
        this.a = hm41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cn40) && this.a.equals(((cn40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
