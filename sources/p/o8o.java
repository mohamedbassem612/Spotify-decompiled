package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o8o implements pd51 {
    public final String a;
    public final d8r0 b;
    public final dbo c;

    public o8o(String str, d8r0 d8r0Var, dbo dboVar) {
        this.a = str;
        this.b = d8r0Var;
        this.c = dboVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8o)) {
            return false;
        }
        o8o o8oVar = (o8o) obj;
        return this.a.equals(o8oVar.a) && this.b.equals(o8oVar.b) && this.c.equals(o8oVar.c);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + hrt.i(this.b, this.a.hashCode() * 31, 31);
    }
}
