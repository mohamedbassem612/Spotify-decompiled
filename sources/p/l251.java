package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l251 {
    public final String a;
    public final String b;
    public final String c;

    public l251(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l251)) {
            return false;
        }
        l251 l251Var = (l251) obj;
        return u890.j(this.a, l251Var.a) && u890.j(this.b, l251Var.b) && u890.j(this.c, l251Var.c);
    }

    public final int hashCode() {
        return Long.hashCode(350L) + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
