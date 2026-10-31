package p;

import com.spotify.martini.martinidata.model.Mode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n4h0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ks6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n4h0(ks6 ks6Var, byte b) {
        super(2);
        this.a = b;
        this.b = ks6Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        ks6 ks6Var = this.b;
        switch (b) {
            case 0:
                return new kpg0((lka1) ks6Var.P0, jtg0.Z);
            case 1:
                return new kpg0((xpw) ((kly0) ks6Var.R0).get(), jtg0.R0);
            case 2:
                return new kpg0((xpw) ((kly0) ks6Var.O0).get(), jtg0.W0);
            case 3:
                return new kpg0(((lwp) ks6Var.c).a(nik1.w6, true, Mode.MARTINI), jtg0.d1);
            case 4:
                return new kpg0((gmu) ks6Var.Q0, s4h0.e);
            default:
                return new kpg0((xpw) ((kly0) ks6Var.N0).get(), new r4h0(ks6Var, (byte) 1));
        }
    }
}
