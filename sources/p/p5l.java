package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class p5l extends r5l {
    public final String a;
    public final boolean b;
    public final f0u c;

    public p5l(String str, boolean z, f0u f0uVar) {
        this.a = str;
        this.b = z;
        this.c = f0uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5l)) {
            return false;
        }
        p5l p5lVar = (p5l) obj;
        return u890.j(this.a, p5lVar.a) && this.b == p5lVar.b && this.c == p5lVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
