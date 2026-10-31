package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tni0 {
    public final String a;
    public final String b;
    public final int c;

    public tni0(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tni0)) {
            return false;
        }
        tni0 tni0Var = (tni0) obj;
        return this.a.equals(tni0Var.a) && this.b.equals(tni0Var.b) && this.c == tni0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
