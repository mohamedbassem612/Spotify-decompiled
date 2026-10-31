package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pss {
    public final int a;
    public final int b;
    public final qss c;

    public pss(int i, int i2, qss qssVar) {
        this.a = i;
        this.b = i2;
        this.c = qssVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pss)) {
            return false;
        }
        pss pssVar = (pss) obj;
        return this.a == pssVar.a && this.b == pssVar.b && u890.j(this.c, pssVar.c);
    }

    public final int hashCode() {
        int iK = ab80.k(this.b, Integer.hashCode(this.a) * 31, 31);
        qss qssVar = this.c;
        return iK + (qssVar == null ? 0 : qssVar.hashCode());
    }
}
