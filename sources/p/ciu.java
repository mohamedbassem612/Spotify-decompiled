package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ciu implements ki0 {
    public final String a;
    public final ki0 b;

    public ciu(String str, ki0 ki0Var) {
        this.a = str;
        this.b = ki0Var;
    }

    public final String a() {
        return this.b.a();
    }

    public final boolean b() {
        return this.b.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ciu)) {
            return false;
        }
        ciu ciuVar = (ciu) obj;
        return u890.j(this.a, ciuVar.a) && this.b.equals(ciuVar.b);
    }

    public final String g() {
        return this.b.g();
    }

    public final String h() {
        return this.b.h();
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String j() {
        return this.b.j();
    }

    public final String k() {
        return this.b.k();
    }
}
