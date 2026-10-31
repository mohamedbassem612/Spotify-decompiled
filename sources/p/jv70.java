package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jv70 implements ov70 {
    public final aw70 a;
    public final String b;

    public jv70(aw70 aw70Var, String str) {
        this.a = aw70Var;
        this.b = str;
    }

    @Override // p.ov70
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jv70)) {
            return false;
        }
        jv70 jv70Var = (jv70) obj;
        return this.a.equals(jv70Var.a) && u890.j(this.b, jv70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
