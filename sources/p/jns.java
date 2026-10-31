package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jns implements ct41 {
    public final iu30 a;
    public final ins b = new ins(this);
    public final pfn0 c = new pfn0();
    public final hrr0 d;
    public final hrr0 e;
    public final hrr0 f;

    public jns(iu30 iu30Var) {
        this.a = iu30Var;
        Boolean bool = Boolean.FALSE;
        this.d = xto.t(bool);
        this.e = xto.t(bool);
        this.f = xto.t(bool);
    }

    @Override // p.ct41
    public final Object a(hfn0 hfn0Var, vu30 vu30Var, lnm lnmVar) {
        Object objS = smo1.s(new zlo(this, hfn0Var, vu30Var, (lnm) null, (byte) 19), lnmVar);
        return objS == d9n.a ? objS : rih1.a;
    }

    @Override // p.ct41
    public final boolean b() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    @Override // p.ct41
    public final float e(float f) {
        return ((Number) this.a.invoke(Float.valueOf(f))).floatValue();
    }
}
