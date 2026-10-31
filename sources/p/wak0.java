package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wak0 implements yak0 {
    public final String a;
    public final String b;
    public final boolean c;

    public wak0(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wak0)) {
            return false;
        }
        wak0 wak0Var = (wak0) obj;
        return u890.j(this.a, wak0Var.a) && u890.j(this.b, wak0Var.b) && this.c == wak0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
