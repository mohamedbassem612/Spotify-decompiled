package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mv70 implements ov70 {
    public final aw70 a;
    public final String b;

    public mv70(aw70 aw70Var, String str) {
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
        if (!(obj instanceof mv70)) {
            return false;
        }
        mv70 mv70Var = (mv70) obj;
        return this.a.equals(mv70Var.a) && this.b.equals(mv70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
