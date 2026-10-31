package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y8b0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d9b0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y8b0(d9b0 d9b0Var, byte b) {
        super(2);
        this.a = b;
        this.b = d9b0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        d9b0 d9b0Var = this.b;
        switch (b) {
            case 0:
                return new jpg0((z331) d9b0Var.a.E.get(), u8b0.P0);
            default:
                esw eswVar = d9b0Var.a;
                return new jpg0(eswVar.e.a(d9b0Var.b), u8b0.R0);
        }
    }
}
