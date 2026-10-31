package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class otv0 {
    public final String a;
    public final String b;
    public final int c;

    public otv0(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof otv0)) {
            return false;
        }
        otv0 otv0Var = (otv0) obj;
        return u890.j(this.a, otv0Var.a) && this.b.equals(otv0Var.b) && this.c == otv0Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        return ab80.k(this.c, cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31);
    }
}
