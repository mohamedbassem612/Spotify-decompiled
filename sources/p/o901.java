package p;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class o901 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kly0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o901(kly0 kly0Var, byte b) {
        super(1);
        this.a = b;
        this.b = kly0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        kly0 kly0Var = this.b;
        switch (b) {
            case 0:
                xhm xhmVar = (xhm) kly0Var.get();
                pim pimVar = new pim((String) null, false);
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                xhmVar.a(pimVar, yon1.D4());
                return rih1.a;
            default:
                m3n1 m3n1Var = (m3n1) kly0Var.get();
                return new k3n1(new zm41((dn41) obj, new c4m1(m3n1Var, (byte) 20), dw81.a1, new v2n1(m3n1Var, (byte) 1), new qdp0(m3n1Var, (byte) 1), (Function0) null, 96));
        }
    }
}
