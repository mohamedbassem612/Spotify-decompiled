package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qg40 implements ypx0 {
    public final /* synthetic */ byte a = 1;
    public final a1r0 b;
    public final Object c;
    public final Object d;

    public qg40(a1r0 a1r0Var, v67 v67Var, x1i1 x1i1Var) {
        this.b = a1r0Var;
        this.c = v67Var;
        this.d = x1i1Var;
    }

    @Override // p.ypx0
    public final vpx0 a(c9n c9nVar, da6 da6Var, iu30 iu30Var) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                return new pg40(da6Var, (rg4) obj, this.b, (rg40) obj2, c9nVar, iu30Var);
            default:
                return new pm70(da6Var, new tm(this.b, da6Var, (x1i1) obj2), (v67) obj, c9nVar, iu30Var);
        }
    }

    public qg40(rg4 rg4Var, a1r0 a1r0Var, rg40 rg40Var) {
        this.c = rg4Var;
        this.b = a1r0Var;
        this.d = rg40Var;
    }
}
