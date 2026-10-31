package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kq8 implements oq8 {
    public final fr8 a;

    public kq8(fr8 fr8Var) {
        this.a = fr8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kq8) && u890.j(this.a, ((kq8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
