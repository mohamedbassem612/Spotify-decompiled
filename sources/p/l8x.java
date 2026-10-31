package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class l8x {
    public final String a;
    public final String b;
    public final int c;

    public l8x(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8x)) {
            return false;
        }
        l8x l8xVar = (l8x) obj;
        return u890.j(this.a, l8xVar.a) && u890.j(this.b, l8xVar.b) && this.c == l8xVar.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
