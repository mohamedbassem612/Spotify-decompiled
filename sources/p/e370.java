package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class e370 extends g370 {
    public final /* synthetic */ byte d;
    public final fxc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e370(qo21 qo21Var, cxc cxcVar, t2n t2nVar, fxc fxcVar, byte b) {
        super(qo21Var, cxcVar, t2nVar);
        this.d = b;
        this.e = fxcVar;
    }

    @Override // p.g370
    public final Object a(wyp0 wyp0Var, Object[] objArr) {
        byte b = this.d;
        fxc fxcVar = this.e;
        switch (b) {
            case 0:
                return fxcVar.i(wyp0Var);
            default:
                dxc dxcVar = (dxc) fxcVar.i(wyp0Var);
                lnm lnmVar = (lnm) objArr[objArr.length - 1];
                try {
                    return b3o1.q(dxcVar, lnmVar);
                } catch (Exception e) {
                    b3o1.y(e, lnmVar);
                    return d9n.a;
                }
        }
    }
}
