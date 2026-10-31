package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zgi0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ahi0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zgi0(ahi0 ahi0Var, byte b) {
        super(1);
        this.a = b;
        this.b = ahi0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ahi0 ahi0Var = this.b;
        switch (b) {
            case 0:
                hs00 hs00Var = (hs00) ahi0Var.N0;
                ezc ezcVarG = hs00Var != null ? yoi1.g(hs00Var.d()) : null;
                return ezcVarG != null ? new b8d0(ezcVarG, ahi0Var, (byte) 28) : new huz(new egi0((ioj0) ahi0Var.V0), (byte) 10);
            default:
                hgi0 hgi0Var = (hgi0) obj;
                hs00 hs00Var2 = (hs00) ahi0Var.N0;
                return zqo1.s(hgi0Var, new egi0((ioj0) ahi0Var.V0, hs00Var2 != null ? hs00Var2.b() : w7x.a));
        }
    }
}
