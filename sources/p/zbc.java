package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zbc extends ezq0 implements dzq0 {
    public egy0 X;
    public git Y;
    public final xbc h;
    public final akn0 i;
    public final kdy0 t;

    public zbc(kf30 kf30Var, zim0 zim0Var, egy0 egy0Var, xbc xbcVar) {
        super(zim0Var, kf30Var);
        this.h = xbcVar;
        akn0 akn0Var = new akn0(egy0Var.d, egy0Var.e);
        this.i = akn0Var;
        this.t = new kdy0(egy0Var, akn0Var, xbcVar, new ryq(this, (byte) 2));
        this.X = egy0Var;
    }

    @Override // p.dzq0
    public final zpi0 E() {
        git gitVar = this.Y;
        if (gitVar != null) {
            return gitVar;
        }
        u890.C("_memberScope");
        throw null;
    }

    @Override // p.ezq0, p.o9r
    public final String toString() {
        StringBuilder sb = new StringBuilder("builtins package fragment for ");
        sb.append(this.f);
        sb.append(" from ");
        int i = kht.a;
        sb.append(iht.c(this));
        return sb.toString();
    }

    public final void y1(ks6 ks6Var) {
        egy0 egy0Var = this.X;
        if (egy0Var == null) {
            eg.m("Repeated call to DeserializedPackageFragmentImpl::initialize");
            return;
        }
        this.X = null;
        this.Y = new git(this, egy0Var.f, this.i, this.h, null, ks6Var, "scope of " + this, new ka(this, (byte) 28));
    }
}
