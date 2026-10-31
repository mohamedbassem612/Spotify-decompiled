package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tw91 {
    public final String a;
    public final String b;
    public final boolean c;

    public tw91(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw91)) {
            return false;
        }
        tw91 tw91Var = (tw91) obj;
        return u890.j(this.a, tw91Var.a) && u890.j(this.b, tw91Var.b) && this.c == tw91Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
