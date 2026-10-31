package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b0z {
    public final int a;
    public final p60 b;

    public b0z(int i, p60 p60Var) {
        this.a = i;
        this.b = p60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0z)) {
            return false;
        }
        b0z b0zVar = (b0z) obj;
        return this.a == b0zVar.a && u890.j(this.b, b0zVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
