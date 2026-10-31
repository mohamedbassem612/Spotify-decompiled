package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vsc {
    public final String a;
    public final btc b;

    public vsc(String str, btc btcVar) {
        this.a = str;
        this.b = btcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vsc)) {
            return false;
        }
        vsc vscVar = (vsc) obj;
        return u890.j(this.a, vscVar.a) && this.b.equals(vscVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
