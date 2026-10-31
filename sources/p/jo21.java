package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jo21 implements cxc {
    public final /* synthetic */ byte a;
    public final cxc b;
    public final Object c;

    public /* synthetic */ jo21(cxc cxcVar, Object obj, byte b) {
        this.a = b;
        this.b = cxcVar;
        this.c = obj;
    }

    public final jf01 a(ln21 ln21Var) {
        byte b = this.a;
        Object obj = this.c;
        cxc cxcVar = this.b;
        switch (b) {
            case 0:
                return cxcVar.a((ln21) ((v87) obj).apply(ln21Var));
            default:
                ne neVarB = ln21Var.b();
                neVarB.c0(pka1.class, new pka1((String) obj));
                return cxcVar.a(new ln21(neVarB));
        }
    }
}
