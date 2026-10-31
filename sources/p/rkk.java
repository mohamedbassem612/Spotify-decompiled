package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rkk extends vlk {
    public final String a;
    public final int b;
    public final tv80 c;

    public rkk(int i, String str, tv80 tv80Var) {
        this.a = str;
        this.b = i;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rkk)) {
            return false;
        }
        rkk rkkVar = (rkk) obj;
        return u890.j(this.a, rkkVar.a) && this.b == rkkVar.b && u890.j(this.c, rkkVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
