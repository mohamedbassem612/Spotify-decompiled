package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fio0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ el9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fio0(el9 el9Var, byte b) {
        super(1);
        this.a = b;
        this.b = el9Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        el9 el9Var = this.b;
        switch (b) {
            case 0:
                return ((smc0) el9Var.i).isEmpty() ? new huz(z6x.a, (byte) 10) : hu20.e(d3p1.F(el9Var.b, el9Var.c, (bio0) obj), new t4o0((lnm) null, el9Var, (byte) 5));
            default:
                bio0 bio0Var = (bio0) obj;
                return new mqm(new jvm(bio0Var.a, bio0Var.b, bio0Var.c), new lqm(Collections.singletonList(ovm.a), (smc0) el9Var.i, (qle1) null, 4));
        }
    }
}
