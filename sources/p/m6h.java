package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m6h extends n6h {
    public final int a;
    public final w8d1 b;

    public m6h(int i, w8d1 w8d1Var) {
        this.a = i;
        this.b = w8d1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6h)) {
            return false;
        }
        m6h m6hVar = (m6h) obj;
        return this.a == m6hVar.a && this.b.equals(m6hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
