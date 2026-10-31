package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g2p0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j2p0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2p0(j2p0 j2p0Var, byte b) {
        super(1);
        this.a = b;
        this.b = j2p0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        j2p0 j2p0Var = this.b;
        switch (b) {
            case 0:
                j2p0Var.a.g.invoke(Integer.valueOf(((Number) obj).intValue()));
                return rih1.a;
            default:
                ((Number) obj).intValue();
                x6h1 x6h1VarC = j2p0Var.i.a.c();
                x6h1VarC.i.add(new a7h1("horizontal_layout", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                r6h1 r6h1Var = r6h1.c;
                return new r6h1(kk0.l(y6h1VarA), (u8h1) null);
        }
    }
}
