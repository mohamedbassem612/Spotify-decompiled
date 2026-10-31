package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class oh91 {
    public final String a;
    public final String b;
    public final boolean c;

    public oh91(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh91)) {
            return false;
        }
        oh91 oh91Var = (oh91) obj;
        return u890.j(this.a, oh91Var.a) && u890.j(this.b, oh91Var.b) && this.c == oh91Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
