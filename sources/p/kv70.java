package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kv70 implements ov70 {
    public final mu70 a;
    public final String b;

    public kv70(mu70 mu70Var, String str) {
        this.a = mu70Var;
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
        if (!(obj instanceof kv70)) {
            return false;
        }
        kv70 kv70Var = (kv70) obj;
        return this.a.equals(kv70Var.a) && u890.j(this.b, kv70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
