package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j6l {
    public final m6l a;
    public final int b;

    public j6l(m6l m6lVar, int i) {
        this.a = m6lVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6l)) {
            return false;
        }
        j6l j6lVar = (j6l) obj;
        return u890.j(this.a, j6lVar.a) && this.b == j6lVar.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
