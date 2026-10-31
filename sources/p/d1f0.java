package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d1f0 extends e1f0 {
    public final String a;
    public final Object b;

    public d1f0(String str, Object obj) {
        this.a = str;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1f0)) {
            return false;
        }
        d1f0 d1f0Var = (d1f0) obj;
        return u890.j(this.a, d1f0Var.a) && u890.j(this.b, d1f0Var.b);
    }

    public final int hashCode() {
        return e331.b(this.b) + (this.a.hashCode() * 31);
    }
}
