package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bl2 {
    public final s2j1 a;
    public final String b;

    public bl2(s2j1 s2j1Var, String str) {
        this.a = s2j1Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl2)) {
            return false;
        }
        bl2 bl2Var = (bl2) obj;
        return this.a == bl2Var.a && u890.j(this.b, bl2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
