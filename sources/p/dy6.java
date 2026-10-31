package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dy6 {
    public final String a;
    public final String b;
    public final boolean c;

    public dy6(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy6)) {
            return false;
        }
        dy6 dy6Var = (dy6) obj;
        return u890.j(this.a, dy6Var.a) && u890.j(this.b, dy6Var.b) && this.c == dy6Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
