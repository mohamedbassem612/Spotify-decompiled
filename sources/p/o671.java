package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class o671 {
    public final Flowable a;
    public final xh71 b;
    public final fbm c;
    public final u601 d;
    public final poj0 e;
    public final f771 f;
    public final q8n g;
    public final iac0 h;
    public final luk i;

    public o671(Flowable flowable, xh71 xh71Var, fbm fbmVar, u601 u601Var, poj0 poj0Var, f771 f771Var, q8n q8nVar, iac0 iac0Var, luk lukVar) {
        this.a = flowable;
        this.b = xh71Var;
        this.c = fbmVar;
        this.d = u601Var;
        this.e = poj0Var;
        this.f = f771Var;
        this.g = q8nVar;
        this.h = iac0Var;
        this.i = lukVar;
    }

    public static im0 a(o671 o671Var, qzh qzhVar) {
        Flowable flowable = o671Var.a;
        xh71 xh71Var = o671Var.b;
        fbm fbmVar = o671Var.c;
        poj0 poj0Var = o671Var.e;
        q8n q8nVar = o671Var.g;
        iac0 iac0Var = o671Var.h;
        u601 u601Var = o671Var.d;
        vbm[] vbmVarArr = q601.a;
        return new im0(flowable, xh71Var, fbmVar, qzhVar, poj0Var, q8nVar, iac0Var, u601Var, hu20.e(rqt0.u(new h801(new kge(flowable), (byte) 5)), new af01((lnm) null, o671Var, (byte) 16)), o671Var.f, new av4(o671Var.i).a());
    }
}
