package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hfk implements pd51 {
    public final String a;
    public final d8r0 b;
    public final efk c;

    public hfk(String str, d8r0 d8r0Var, efk efkVar) {
        this.a = str;
        this.b = d8r0Var;
        this.c = efkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfk)) {
            return false;
        }
        hfk hfkVar = (hfk) obj;
        return this.a.equals(hfkVar.a) && this.b.equals(hfkVar.b) && this.c.equals(hfkVar.c);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + hrt.i(this.b, this.a.hashCode() * 31, 31);
    }
}
