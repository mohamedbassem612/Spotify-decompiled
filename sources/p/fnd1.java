package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fnd1 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tnd1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fnd1(tnd1 tnd1Var, byte b) {
        super(4);
        this.a = b;
        this.b = tnd1Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        tnd1 tnd1Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                return (n8h1) tnd1Var.d().invoke((r6h1) obj4);
            default:
                n8h1 n8h1Var = (n8h1) obj;
                dnd1 dnd1Var = (dnd1) obj4;
                if (dnd1Var instanceof and1) {
                    return tnd1Var.f((and1) dnd1Var, n8h1Var);
                }
                if (dnd1Var instanceof bnd1) {
                    return tnd1Var.j((bnd1) dnd1Var, n8h1Var);
                }
                if (dnd1Var instanceof cnd1) {
                    return tnd1Var.k((cnd1) dnd1Var, n8h1Var);
                }
                eg.o();
                return null;
        }
    }
}
