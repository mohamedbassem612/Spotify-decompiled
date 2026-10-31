package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class et60 extends jto1 {
    public final String b;
    public final j16 c;
    public final vr60 d;

    public et60(String str, j16 j16Var, vr60 vr60Var) {
        this.b = str;
        this.c = j16Var;
        this.d = vr60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et60)) {
            return false;
        }
        et60 et60Var = (et60) obj;
        return u890.j(this.b, et60Var.b) && this.c == et60Var.c && this.d.equals(et60Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }
}
