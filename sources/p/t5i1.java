package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t5i1 implements y5i1 {
    public final String a;
    public final String b;

    public t5i1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5i1)) {
            return false;
        }
        t5i1 t5i1Var = (t5i1) obj;
        return u890.j(this.a, t5i1Var.a) && u890.j(this.b, t5i1Var.b);
    }

    @Override // p.y5i1
    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
