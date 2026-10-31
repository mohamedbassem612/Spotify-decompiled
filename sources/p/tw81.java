package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tw81 implements mh91 {
    public final s6l a;
    public final nqs b;
    public final ke71 c;

    public tw81(s6l s6lVar, nqs nqsVar) {
        ke71 ke71Var = new ke71();
        this.a = s6lVar;
        this.b = nqsVar;
        this.c = ke71Var;
    }

    @Override // p.mh91
    public final void a() {
        this.c.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tw81) {
            tw81 tw81Var = (tw81) obj;
            return this.a.equals(tw81Var.a) && u890.j(this.b, tw81Var.b) && this.c == tw81Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
