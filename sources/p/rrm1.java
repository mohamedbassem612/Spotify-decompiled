package p;

import com.spotify.mobius.functions.Consumer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rrm1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ urm1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rrm1(urm1 urm1Var, byte b) {
        super(0);
        this.a = b;
        this.b = urm1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        urm1 urm1Var = this.b;
        switch (b) {
            case 0:
                t8h1.n(urm1Var.e, lqm1.d);
                Consumer consumer = urm1Var.f;
                if (consumer != null) {
                    consumer.accept(xqm1.a);
                }
                break;
            default:
                t8h1.n(urm1Var.e, lqm1.d);
                Consumer consumer2 = urm1Var.f;
                if (consumer2 != null) {
                    consumer2.accept(zqm1.a);
                }
                break;
        }
        return rih1Var;
    }
}
