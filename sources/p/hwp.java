package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hwp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ hwp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final u710 a(w710 w710Var) {
        byte b = this.a;
        thq thqVar = this.b;
        switch (b) {
            case 0:
                return new u710(w710Var, new bn3(((Context) ((nwp) ((gbp) thqVar).c).b.d).getApplicationContext()));
            case 1:
                return new u710(w710Var, new bn3((Context) thqVar.c.b.x1.a));
            case 2:
                return new u710(w710Var, new bn3((Context) ((r7q) thqVar).d.b.x1.a));
            default:
                return new u710(w710Var, new bn3((Context) thqVar.c.a.a.x1.a));
        }
    }
}
