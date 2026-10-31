package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kfb1 {
    public final String a;
    public final String b;
    public final int c;

    public kfb1(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfb1)) {
            return false;
        }
        kfb1 kfb1Var = (kfb1) obj;
        return u890.j(this.a, kfb1Var.a) && u890.j(this.b, kfb1Var.b) && this.c == kfb1Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
