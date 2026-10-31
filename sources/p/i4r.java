package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class i4r implements f4r {
    public final /* synthetic */ byte a = 1;
    public final f4r b;
    public final iu30 c;

    public i4r(iu30 iu30Var, f4r f4rVar) {
        this.c = iu30Var;
        this.b = f4rVar;
    }

    @Override // p.f4r
    public final f1r a(Object obj) {
        byte b = this.a;
        iu30 iu30Var = this.c;
        f4r f4rVar = this.b;
        switch (b) {
            case 0:
                Object objInvoke = iu30Var.invoke(obj);
                return objInvoke != null ? f4rVar.a(objInvoke) : xio1.k();
            default:
                return f4rVar.a(iu30Var.invoke(obj));
        }
    }

    public i4r(f4r f4rVar, iu30 iu30Var) {
        this.b = f4rVar;
        this.c = iu30Var;
    }
}
