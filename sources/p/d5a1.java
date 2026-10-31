package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d5a1 implements g5a1 {
    public final String a;
    public final wea0 b;
    public final boolean c;

    public d5a1(String str, wea0 wea0Var, boolean z) {
        this.a = str;
        this.b = wea0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5a1)) {
            return false;
        }
        d5a1 d5a1Var = (d5a1) obj;
        return u890.j(this.a, d5a1Var.a) && this.b.equals(d5a1Var.b) && this.c == d5a1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
