package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hi91 {
    public final String a;
    public final String b;
    public final boolean c;

    public hi91(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi91)) {
            return false;
        }
        hi91 hi91Var = (hi91) obj;
        return this.a.equals(hi91Var.a) && this.b.equals(hi91Var.b) && this.c == hi91Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
