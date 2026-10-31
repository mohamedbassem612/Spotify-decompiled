package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class aty implements bty {
    public final String a;
    public final boolean b;
    public final String c;

    public aty(String str, String str2, boolean z) {
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aty)) {
            return false;
        }
        aty atyVar = (aty) obj;
        return u890.j(this.a, atyVar.a) && this.b == atyVar.b && u890.j(this.c, atyVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
