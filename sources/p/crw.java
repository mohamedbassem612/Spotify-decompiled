package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class crw implements gnc1 {
    public final /* synthetic */ zeu a;

    public crw(zeu zeuVar) {
        this.a = zeuVar;
    }

    public final void onComplete() {
        pnc1 pnc1VarD = zeu.d(this.a);
        if (pnc1VarD != null) {
            pnc1VarD.cancel();
        }
    }

    public final void onNext(Object obj) {
        zeu.b(this.a).invoke(obj);
    }

    public final void onSubscribe(pnc1 pnc1Var) {
        zeu.e(this.a, pnc1Var);
        pnc1Var.request(Long.MAX_VALUE);
    }

    public final void onError(Throwable th) throws Throwable {
        throw th;
    }
}
