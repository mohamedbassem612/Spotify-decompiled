package p;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class b710 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g710 b;

    public /* synthetic */ b710(g710 g710Var, byte b) {
        this.a = b;
        this.b = g710Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        mgz mgzVar = mgz.d;
        g710 g710Var = this.b;
        switch (b) {
            case 0:
                g710Var.getClass();
                List listB = g710.b((feh) obj);
                if (listB != null) {
                    g710Var.i.onNext(new v031(mgz.g, listB));
                }
                break;
            case 1:
                List listB2 = g710.b((feh) obj);
                if (listB2 != null) {
                    g710Var.i.onNext(new v031(mgzVar, listB2));
                }
                break;
            case 2:
                g710Var.getClass();
                List listB3 = g710.b((feh) obj);
                if (listB3 != null) {
                    g710Var.i.onNext(new v031(mgzVar, listB3));
                }
                break;
            default:
                List listB4 = g710.b((feh) obj);
                if (listB4 != null) {
                    g710Var.i.onNext(new v031(mgzVar, listB4));
                }
                break;
        }
    }
}
