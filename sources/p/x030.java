package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x030 implements EventSource {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public x030(xhp xhpVar) {
        this.a = (byte) 0;
        this.b = xhpVar;
        this.c = new idd1(new f710(this, (byte) 9));
    }

    public final Disposable a(Consumer consumer) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return ((EventSource) ((idd1) obj2).getValue()).a(consumer);
            case 1:
                j2e0 j2e0Var = (j2e0) obj;
                x8c0 x8c0Var = (x8c0) obj2;
                p811 p811Var = new p811();
                p811 p811Var2 = new p811();
                hre0 hre0Var = new hre0(p811Var2, consumer);
                x8c0Var.a(hre0Var);
                return new gre0(fn31.T(smo1.e(flo1.l(guo1.B(), (q8n) j2e0Var.c)), (o8n) null, 0, new ary((byte) 14, j2e0Var, p811Var, x8c0Var, consumer, p811Var2, (lnm) null), 3), x8c0Var, hre0Var);
            default:
                eaz0 eaz0Var = ((f7f0) obj).g;
                consumer.getClass();
                ibn ibnVarL = eaz0Var.L(consumer);
                return new b0c(((EventSource) obj2).a(ibnVarL), ibnVarL);
        }
    }

    public /* synthetic */ x030(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
