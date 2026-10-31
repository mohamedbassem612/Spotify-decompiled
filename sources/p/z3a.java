package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z3a extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hw2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z3a(hw2 hw2Var, byte b) {
        super(1);
        this.a = b;
        this.b = hw2Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        hw2 hw2Var = this.b;
        switch (b) {
            case 0:
                u3a u3aVar = (u3a) obj;
                d0r d0rVar = (d0r) hw2Var.h;
                return d0rVar != null ? d3p1.H(d0rVar, hw2Var.c, u3aVar) : new huz(new y3a(u3aVar.b, Boolean.valueOf(u3aVar.d)), (byte) 10);
            default:
                ((qtr) obj).b(new a4a(hw2Var, null));
                return rih1.a;
        }
    }
}
