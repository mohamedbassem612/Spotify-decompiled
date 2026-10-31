package p;

import com.spotify.mobius.functions.Consumer;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class trm1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ urm1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ trm1(urm1 urm1Var, byte b) {
        super(1);
        this.a = b;
        this.b = urm1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        urm1 urm1Var = this.b;
        switch (b) {
            case 0:
                idd1 idd1Var = prm1.d;
                prm1 prm1Var = (prm1) ((Map) prm1.h.getValue()).get(((hqm1) obj).a);
                if (prm1Var == null) {
                    prm1Var = prm1.i;
                }
                Consumer consumer = urm1Var.f;
                if (consumer != null) {
                    consumer.accept(new wqm1(prm1Var.c));
                }
                break;
            default:
                idd1 idd1Var2 = qrm1.d;
                qrm1 qrm1Var = (qrm1) ((Map) qrm1.h.getValue()).get(((hqm1) obj).a);
                if (qrm1Var == null) {
                    qrm1Var = qrm1.i;
                }
                Consumer consumer2 = urm1Var.f;
                if (consumer2 != null) {
                    consumer2.accept(new yqm1(qrm1Var.c));
                }
                break;
        }
        return rih1Var;
    }
}
