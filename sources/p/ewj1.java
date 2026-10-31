package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ewj1 {
    public final vu30 a;

    public ewj1(vu30 vu30Var) {
        this.a = vu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ewj1) && u890.j(this.a, ((ewj1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
