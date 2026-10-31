package p;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ehs extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ toj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ehs(toj0 toj0Var, byte b) {
        super(0);
        this.a = b;
        this.b = toj0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        toj0 toj0Var = this.b;
        switch (b) {
            case 0:
                ((h98) toj0Var.e).b();
                break;
            case 1:
                ((h98) toj0Var.e).k();
                break;
            default:
                Iterator it = ((h0z) ((h98) toj0Var.e).c).X.iterator();
                while (it.hasNext()) {
                    ((g0z) it.next()).V0.c(zyz.g);
                }
                break;
        }
        return rih1Var;
    }
}
