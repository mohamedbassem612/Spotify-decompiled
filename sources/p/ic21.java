package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ic21 {
    public final int a;
    public final String b;
    public final kwy0 c;

    public ic21(int i, String str, kwy0 kwy0Var) {
        this.a = i;
        this.b = str;
        this.c = kwy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic21)) {
            return false;
        }
        ic21 ic21Var = (ic21) obj;
        return this.a == ic21Var.a && u890.j(this.b, ic21Var.b) && this.c.equals(ic21Var.c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
