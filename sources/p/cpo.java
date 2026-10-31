package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cpo {
    public final bpo a;
    public final int b;

    public cpo(bpo bpoVar, int i) {
        this.a = bpoVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpo)) {
            return false;
        }
        cpo cpoVar = (cpo) obj;
        return this.a == cpoVar.a && this.b == cpoVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
