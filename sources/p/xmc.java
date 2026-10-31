package p;

import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xmc implements o5s {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xmc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void onStop(iac0 iac0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                dnc dncVar = (dnc) obj;
                Disposable disposable = dncVar.i;
                if (disposable != null) {
                    disposable.dispose();
                }
                dncVar.i = null;
                break;
            default:
                joc jocVar = (joc) obj;
                if (!joc.e(jocVar).get()) {
                    t890.l("cwp_page_load", jocVar.b());
                    jocVar.b().a("outcome", "cancelled");
                    jocVar.b().a("page", vno1.p(jocVar.g()));
                    ((s45) joc.f(jocVar)).b(jocVar.b().e());
                    joc.e(jocVar).set(true);
                    break;
                }
                break;
        }
    }
}
