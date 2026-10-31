package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vuu implements wuu {
    public final String a;
    public final String b;

    public vuu(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vuu)) {
            return false;
        }
        vuu vuuVar = (vuu) obj;
        return u890.j(this.a, vuuVar.a) && this.b.equals(vuuVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
