package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u2z implements pd51 {
    public final String a;
    public final d8r0 b;
    public final o2z c;

    public u2z(String str, d8r0 d8r0Var, o2z o2zVar) {
        this.a = str;
        this.b = d8r0Var;
        this.c = o2zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2z)) {
            return false;
        }
        u2z u2zVar = (u2z) obj;
        return this.a.equals(u2zVar.a) && this.b.equals(u2zVar.b) && this.c.equals(u2zVar.c);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + hrt.i(this.b, this.a.hashCode() * 31, 31);
    }
}
