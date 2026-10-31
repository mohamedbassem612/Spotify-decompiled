package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v3z implements pd51 {
    public final String a;
    public final d8r0 b;
    public final int c;
    public final haz d;

    public v3z(String str, d8r0 d8r0Var, int i, haz hazVar) {
        this.a = str;
        this.b = d8r0Var;
        this.c = i;
        this.d = hazVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3z)) {
            return false;
        }
        v3z v3zVar = (v3z) obj;
        return this.a.equals(v3zVar.a) && this.b.equals(v3zVar.b) && this.c == v3zVar.c && this.d.equals(v3zVar.d);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + kaa0.f(this.c, hrt.i(this.b, this.a.hashCode() * 31, 31), 31);
    }
}
