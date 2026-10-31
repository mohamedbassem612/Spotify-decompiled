package p;

import java.util.TimerTask;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class y9o1 extends TimerTask {
    public final /* synthetic */ oao1 a;
    public final /* synthetic */ zwo1 b;

    public y9o1(oao1 oao1Var, zwo1 zwo1Var) {
        this.a = oao1Var;
        this.b = zwo1Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        oao1 oao1Var = this.a;
        fn31.T(oao1Var.g.b(), (o8n) null, 0, new u9o1(oao1Var, this.b, (lnm) null), 3);
    }
}
