package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d971 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y441 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d971(y441 y441Var, byte b) {
        super(1);
        this.a = b;
        this.b = y441Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        y441 y441Var = this.b;
        switch (b) {
            case 0:
                r6h1 r6h1Var = r6h1.c;
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return new itl0(new htl0(new ntl0(new qtl0(0, yon1.D4().c, (String) y441Var.d, r6h1Var), (otl0) y441Var.c), (byte) 1));
            default:
                ((jz51) y441Var.b).a((String) y441Var.d);
                return rih1.a;
        }
    }
}
