package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nom0 {
    public final String a;
    public final String b;
    public final boolean c;

    public nom0(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nom0)) {
            return false;
        }
        nom0 nom0Var = (nom0) obj;
        return this.a.equals(nom0Var.a) && this.b.equals(nom0Var.b) && this.c == nom0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
