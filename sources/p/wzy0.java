package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wzy0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a0z0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wzy0(a0z0 a0z0Var, byte b) {
        super(0);
        this.a = b;
        this.b = a0z0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        byte b2 = 10;
        byte b3 = 1;
        lnm lnmVar = null;
        a0z0 a0z0Var = this.b;
        switch (b) {
            case 0:
                return d5p1.r(hu20.e(new h5y0(((ov20) a0z0Var.c).c("audio-quality", ""), (byte) 6), new t4o0((lnm) null, a0z0Var, (byte) 26)), smo1.e(flo1.l(op71.f(), (q8n) a0z0Var.e)), new alb1(0L, Long.MAX_VALUE), 1);
            case 1:
                return new x010((mr20) ((idd1) a0z0Var.h).getValue(), (mr20) ((idd1) a0z0Var.g).getValue(), new irp0(3, (lnm) null, (byte) 13), (byte) 1);
            case 2:
                return new x010((mr20) ((idd1) a0z0Var.h).getValue(), (mr20) ((idd1) a0z0Var.g).getValue(), new irp0(3, (lnm) null, (byte) 14), (byte) 1);
            case 3:
                return a0z0Var.b ? (mr20) ((idd1) a0z0Var.h).getValue() : new huz(Boolean.FALSE, b2);
            case 4:
                return new uop0(((ov20) a0z0Var.c).a, (byte) 24);
            case 5:
                return ((ov20) a0z0Var.c).a("is-pigeon", false);
            case 6:
                return ((kz4) ((m7y0) a0z0Var.d).b).a() ? new h5y0(((ov20) a0z0Var.c).c("market-portfolio-type", ""), (byte) 7) : new huz(Boolean.FALSE, b2);
            default:
                return h5p1.r((at71) ((idd1) a0z0Var.l).getValue(), (mr20) ((idd1) a0z0Var.i).getValue(), (mr20) ((idd1) a0z0Var.k).getValue(), (mr20) ((idd1) a0z0Var.j).getValue(), new mrs(a0z0Var, lnmVar, b3));
        }
    }
}
