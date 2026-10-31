package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zuu implements dvu {
    public final r6h1 a;

    public zuu(r6h1 r6h1Var) {
        this.a = r6h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zuu) && u890.j(this.a, ((zuu) obj).a);
    }

    public final int hashCode() {
        r6h1 r6h1Var = this.a;
        if (r6h1Var == null) {
            return 0;
        }
        return r6h1Var.hashCode();
    }
}
