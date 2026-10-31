package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kf7 implements xf7 {
    public final String a;
    public final tv80 b;

    public kf7(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf7)) {
            return false;
        }
        kf7 kf7Var = (kf7) obj;
        return u890.j(this.a, kf7Var.a) && u890.j(this.b, kf7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
