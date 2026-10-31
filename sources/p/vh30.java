package p;

import android.content.res.Configuration;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vh30 implements dkl {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zh30 b;

    public /* synthetic */ vh30(zh30 zh30Var, byte b) {
        this.a = b;
        this.b = zh30Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        zh30 zh30Var = this.b;
        switch (b) {
            case 0:
                ((tg30) zh30Var.i.b).g.t(true);
                break;
            case 1:
                lmw lmwVar = zh30Var.i;
                lmwVar.u();
                ((tg30) lmwVar.b).g.j(true, (Configuration) obj);
                break;
            case 2:
                ((Number) obj).intValue();
                ((tg30) zh30Var.i.b).g.n(true);
                break;
            default:
                zh30Var.i.u();
                break;
        }
    }
}
