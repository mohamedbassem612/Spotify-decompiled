package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class whf {
    public final String a;
    public final ugf b;
    public final boolean c;
    public final boolean d;
    public final int e;

    public whf(String str, ugf ugfVar, boolean z, boolean z2, int i) {
        this.a = str;
        this.b = ugfVar;
        this.c = z;
        this.d = z2;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whf)) {
            return false;
        }
        whf whfVar = (whf) obj;
        return u890.j(this.a, whfVar.a) && this.b == whfVar.b && this.c == whfVar.c && this.d == whfVar.d && this.e == whfVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + xcg1.g(xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }
}
