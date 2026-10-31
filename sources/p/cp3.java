package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cp3 extends hr3 {
    public final String a;
    public final String b;
    public final tv80 c;

    public cp3(String str, String str2, tv80 tv80Var) {
        this.a = str;
        this.b = str2;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp3)) {
            return false;
        }
        cp3 cp3Var = (cp3) obj;
        return u890.j(this.a, cp3Var.a) && u890.j(this.b, cp3Var.b) && this.c.equals(cp3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
