package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class al8 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iuw0 b;
    public final /* synthetic */ wh61 c;
    public final /* synthetic */ kh61 d;
    public final /* synthetic */ u380 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al8(xnn0 xnn0Var, iuw0 iuw0Var, wh61 wh61Var, kh61 kh61Var, u380 u380Var) {
        super(1);
        this.a = (byte) 0;
        this.b = iuw0Var;
        this.c = wh61Var;
        this.d = kh61Var;
        this.e = u380Var;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                kh61 kh61Var = this.d;
                u380 u380Var = this.e;
                return new cl8(this.b, this.c, kh61Var, (jl8) obj, u380Var);
            case 1:
                xnn0 xnn0Var = (xnn0) obj;
                return new df41(new al8(xnn0Var, this.b, this.c, this.d, this.e), tj8.f);
            default:
                u380 u380Var2 = this.e;
                return new cl8(this.b, this.c, this.d, il8.a, u380Var2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ al8(iuw0 iuw0Var, wh61 wh61Var, kh61 kh61Var, u380 u380Var, byte b) {
        super(1);
        this.a = b;
        this.b = iuw0Var;
        this.c = wh61Var;
        this.d = kh61Var;
        this.e = u380Var;
    }
}
