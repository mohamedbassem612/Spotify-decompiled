package p;

import android.app.Activity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class msq {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ msq(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final sdv0 a() {
        byte b = this.a;
        af afVar = af.c;
        tsq tsqVar = this.b;
        switch (b) {
            case 0:
                wdm wdmVar = (wdm) tsqVar.c;
                return new sdv0(wdmVar.t(), (nsq) ((jly0) wdmVar.g).get());
            case 1:
                f0a f0aVar = (f0a) tsqVar.c;
                f0aVar.getClass();
                Activity activity = (Activity) ((lii1) f0aVar.b).a.get();
                c8o.l(activity);
                return new sdv0(new bf(activity).a().compareTo(afVar) >= 0, (nsq) ((jly0) f0aVar.t).get());
            default:
                wj3 wj3Var = (wj3) tsqVar.c;
                wj3Var.getClass();
                gj5 gj5Var = (gj5) ((pii1) wj3Var.b).b.get();
                c8o.l(gj5Var);
                return new sdv0(new bf(gj5Var).a().compareTo(afVar) >= 0, (nsq) ((jly0) wj3Var.i).get());
        }
    }
}
