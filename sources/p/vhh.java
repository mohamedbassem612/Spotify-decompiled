package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vhh implements xhh {
    public final String a;
    public final String b;

    public vhh(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhh)) {
            return false;
        }
        vhh vhhVar = (vhh) obj;
        return this.a.equals(vhhVar.a) && this.b.equals(vhhVar.b);
    }

    @Override // p.xhh
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
