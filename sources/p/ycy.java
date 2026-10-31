package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ycy {
    public final String a;
    public final boolean b;
    public final xcy c;

    public ycy(String str, boolean z, xcy xcyVar) {
        this.a = str;
        this.b = z;
        this.c = xcyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ycy)) {
            return false;
        }
        ycy ycyVar = (ycy) obj;
        return u890.j(this.a, ycyVar.a) && this.b == ycyVar.b && this.c.equals(ycyVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
