package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pmd {
    public final omd a;
    public final boolean b;
    public final boolean c;

    public pmd(omd omdVar, boolean z, boolean z2) {
        this.a = omdVar;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pmd)) {
            return false;
        }
        pmd pmdVar = (pmd) obj;
        return this.a == pmdVar.a && this.b == pmdVar.b && this.c == pmdVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
