package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hdz implements ez00 {
    public final h290 a;
    public final String b;

    public hdz(String str, h290 h290Var) {
        this.a = h290Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdz)) {
            return false;
        }
        hdz hdzVar = (hdz) obj;
        return this.a.equals(hdzVar.a) && this.b.equals(hdzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
