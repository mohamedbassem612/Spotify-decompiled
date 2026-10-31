package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qbb implements vbb {
    public final og80 a;

    public qbb(og80 og80Var) {
        this.a = og80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qbb) && this.a.equals(((qbb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
