package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ns1 implements bt1 {
    public final bum0 a;

    public ns1(bum0 bum0Var) {
        this.a = bum0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ns1) && u890.j(this.a, ((ns1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
