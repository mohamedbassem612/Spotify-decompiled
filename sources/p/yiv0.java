package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yiv0 {
    public final String a;
    public final String b;
    public final int c;

    public yiv0(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yiv0)) {
            return false;
        }
        yiv0 yiv0Var = (yiv0) obj;
        return u890.j(this.a, yiv0Var.a) && u890.j(this.b, yiv0Var.b) && this.c == yiv0Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
