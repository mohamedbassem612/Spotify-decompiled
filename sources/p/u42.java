package p;

import android.content.Intent;
import android.net.Uri;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class u42 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v42 b;

    public /* synthetic */ u42(v42 v42Var, byte b) {
        this.a = b;
        this.b = v42Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        v42 v42Var = this.b;
        switch (b) {
            case 0:
                u961 u961Var = v42Var.a;
                String str = ((r42) obj).a;
                l7m0 l7m0Var = (l7m0) u961Var.c;
                oxg1 oxg1Var = new oxg1();
                oxg1Var.g();
                dg30 dg30Var = (dg30) l7m0Var.b;
                oxg1Var.h(dg30Var.getColor(2131103941));
                oql oqlVarA = oxg1Var.a();
                ((Intent) oqlVarA.b).setFlags(268435456);
                oqlVarA.j(dg30Var, Uri.parse(str));
                break;
            default:
                ((n42) ((lqr) v42Var.a.d).b).Z0(false, false);
                break;
        }
    }
}
