package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final /* synthetic */ class phr0 implements vr20, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ phr0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // p.vr20
    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((c7r0) obj2).e((vir0) obj);
                break;
            default:
                ((bpb1) ((wen0) obj2)).emit((e090) obj, lnmVar);
                break;
        }
        return rih1Var;
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof vr20) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof vr20) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    @Override // p.iv30
    public final cv30 getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new k01(2, (c7r0) this.b, c7r0.class, "onPageVisibilityChanged", "onPageVisibilityChanged(Lcom/spotify/tome/pagevisibility/PageVisibility;)V", 4);
            default:
                return new tv30(2, (wen0) this.b, wen0.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                break;
        }
        return getFunctionDelegate().hashCode();
    }
}
