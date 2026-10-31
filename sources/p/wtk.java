package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wtk {
    public final int a;
    public final xtk b;

    public wtk(int i, xtk xtkVar) {
        this.a = i;
        this.b = xtkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wtk)) {
            return false;
        }
        wtk wtkVar = (wtk) obj;
        return this.a == wtkVar.a && this.b == wtkVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
