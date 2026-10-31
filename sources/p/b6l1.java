package p;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b6l1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d6l1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b6l1(d6l1 d6l1Var, byte b) {
        super(0);
        this.a = b;
        this.b = d6l1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d6l1 d6l1Var = this.b;
        switch (b) {
            case 0:
                d6l1Var.e.b();
                break;
            case 1:
                d6l1Var.e.k();
                break;
            default:
                Iterator it = ((h0z) d6l1Var.e.c).X.iterator();
                while (it.hasNext()) {
                    ((g0z) it.next()).V0.c(zyz.g);
                }
                break;
        }
        return rih1Var;
    }
}
