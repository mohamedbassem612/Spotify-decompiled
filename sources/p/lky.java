package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lky {
    public final String a;
    public final boolean b;
    public final int c;

    public lky(String str, int i, boolean z) {
        z = (i & 4) != 0 ? false : z;
        this.a = str;
        this.b = z;
        this.c = 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lky)) {
            return false;
        }
        lky lkyVar = (lky) obj;
        return u890.j(this.a, lkyVar.a) && this.b == lkyVar.b && this.c == lkyVar.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + xcg1.g(this.a.hashCode() * 961, 31, this.b);
    }
}
