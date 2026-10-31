package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class f370 extends g370 {
    public final fxc d;
    public final boolean e;

    public f370(qo21 qo21Var, cxc cxcVar, t2n t2nVar, fxc fxcVar, boolean z) {
        super(qo21Var, cxcVar, t2nVar);
        this.d = fxcVar;
        this.e = z;
    }

    @Override // p.g370
    public final Object a(wyp0 wyp0Var, Object[] objArr) {
        dxc dxcVar = (dxc) this.d.i(wyp0Var);
        lnm lnmVar = (lnm) objArr[objArr.length - 1];
        try {
            return this.e ? b3o1.r(dxcVar, lnmVar) : b3o1.p(dxcVar, lnmVar);
        } catch (LinkageError | ThreadDeath | VirtualMachineError e) {
            throw e;
        } catch (Throwable th) {
            b3o1.y(th, lnmVar);
            return d9n.a;
        }
    }
}
