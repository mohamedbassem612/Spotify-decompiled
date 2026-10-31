package p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ao31 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bo31 b;

    public /* synthetic */ ao31(bo31 bo31Var, byte b) {
        this.a = b;
        this.b = bo31Var;
    }

    public final void run() {
        byte b = this.a;
        bo31 bo31Var = this.b;
        switch (b) {
            case 0:
                k9r k9rVar = bo31Var.r;
                if (!((gz51) ((zns) k9rVar.d).b.getValue()).a) {
                    fn31.T((c9n) k9rVar.c, (o8n) null, 0, new clo(new clo(new gz51(w7x.a, true), (lnm) null, (byte) 28), k9rVar, (lnm) null, (byte) 29), 3);
                    break;
                }
                break;
            default:
                k9r k9rVar2 = bo31Var.r;
                fn31.T((c9n) k9rVar2.c, (o8n) null, 0, new clo(new qjr(2, (lnm) null, (byte) 9), k9rVar2, (lnm) null, (byte) 29), 3);
                break;
        }
    }
}
