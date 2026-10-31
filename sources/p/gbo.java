package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gbo implements pd51 {
    public final String a;
    public final d8r0 b;
    public final dbo c;

    public gbo(String str, d8r0 d8r0Var, dbo dboVar) {
        this.a = str;
        this.b = d8r0Var;
        this.c = dboVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbo)) {
            return false;
        }
        gbo gboVar = (gbo) obj;
        return this.a.equals(gboVar.a) && this.b.equals(gboVar.b) && this.c.equals(gboVar.c);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + hrt.i(this.b, this.a.hashCode() * 31, 31);
    }
}
