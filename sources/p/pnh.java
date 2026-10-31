package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pnh implements snh {
    public final lnh a;
    public final String b;

    public pnh(lnh lnhVar, String str) {
        this.a = lnhVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pnh)) {
            return false;
        }
        pnh pnhVar = (pnh) obj;
        return this.a.equals(pnhVar.a) && u890.j(this.b, pnhVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
