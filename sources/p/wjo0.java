package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wjo0 {
    public final String a;
    public final int b;
    public final int c;

    public wjo0(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wjo0)) {
            return false;
        }
        wjo0 wjo0Var = (wjo0) obj;
        return this.a.equals(wjo0Var.a) && this.b == wjo0Var.b && this.c == wjo0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ab80.k(this.b, this.a.hashCode() * 31, 31);
    }
}
