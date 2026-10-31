package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class of3 {
    public final hr80 a;

    public of3(hr80 hr80Var) {
        this.a = hr80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof of3) && this.a.equals(((of3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
