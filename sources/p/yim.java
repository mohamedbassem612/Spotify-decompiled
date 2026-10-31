package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yim {
    public final xim a;
    public final wim b;

    public yim(xim ximVar, wim wimVar) {
        this.a = ximVar;
        this.b = wimVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yim)) {
            return false;
        }
        yim yimVar = (yim) obj;
        return u890.j(this.a, yimVar.a) && this.b.equals(yimVar.b);
    }

    public final int hashCode() {
        xim ximVar = this.a;
        return this.b.a.hashCode() + ((ximVar == null ? 0 : ximVar.hashCode()) * 31);
    }
}
