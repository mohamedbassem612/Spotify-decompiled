package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class z7l {
    public final boolean a;
    public final String b;
    public final Double c;

    public z7l(boolean z, String str, Double d) {
        this.a = z;
        this.b = str;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7l)) {
            return false;
        }
        z7l z7lVar = (z7l) obj;
        return this.a == z7lVar.a && this.b.equals(z7lVar.b) && u890.j(this.c, z7lVar.c);
    }

    public final int hashCode() {
        int iD = cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b);
        Double d = this.c;
        return iD + (d == null ? 0 : d.hashCode());
    }
}
