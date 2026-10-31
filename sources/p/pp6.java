package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pp6 {
    public final iq6 a;

    public pp6(iq6 iq6Var) {
        this.a = iq6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pp6) && u890.j(this.a, ((pp6) obj).a);
    }

    public final int hashCode() {
        iq6 iq6Var = this.a;
        if (iq6Var == null) {
            return 0;
        }
        return iq6Var.a.hashCode();
    }
}
