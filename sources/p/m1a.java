package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m1a {
    public final String a;
    public final cr31 b;
    public final j2i c = new j2i(308850894, new pb9(this, (byte) 1), true);

    public m1a(String str, cr31 cr31Var) {
        this.a = str;
        this.b = cr31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1a)) {
            return false;
        }
        m1a m1aVar = (m1a) obj;
        return u890.j(this.a, m1aVar.a) && this.b.equals(m1aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
