package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wn71 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public wn71(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wn71)) {
            return false;
        }
        wn71 wn71Var = (wn71) obj;
        return this.a.equals(wn71Var.a) && this.b == wn71Var.b && this.c == wn71Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
