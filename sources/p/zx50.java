package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zx50 {
    public final String a;
    public final String b;

    public zx50(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx50)) {
            return false;
        }
        zx50 zx50Var = (zx50) obj;
        return u890.j(this.a, zx50Var.a) && this.b.equals(zx50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
