package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vgw {
    public final String a;
    public final String b;

    public vgw(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vgw)) {
            return false;
        }
        vgw vgwVar = (vgw) obj;
        return u890.j(this.a, vgwVar.a) && u890.j(this.b, vgwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
