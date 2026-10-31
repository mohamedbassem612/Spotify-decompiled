package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fco implements pd51 {
    public final String a;
    public final d8r0 b;
    public final sbo c;

    public fco(String str, d8r0 d8r0Var, sbo sboVar) {
        this.a = str;
        this.b = d8r0Var;
        this.c = sboVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fco)) {
            return false;
        }
        fco fcoVar = (fco) obj;
        return this.a.equals(fcoVar.a) && this.b.equals(fcoVar.b) && this.c.equals(fcoVar.c);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + hrt.i(this.b, this.a.hashCode() * 31, 31);
    }
}
