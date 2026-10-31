package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wmr extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zmr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wmr(zmr zmrVar, byte b) {
        super(1);
        this.a = b;
        this.b = zmrVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        zmr zmrVar = this.b;
        switch (b) {
            case 0:
                t5k t5kVar = (t5k) obj;
                if (t5kVar instanceof t5k) {
                    zmrVar.Y.invoke(t5kVar.a, Integer.valueOf(t5kVar.b));
                    return rih1Var;
                }
                eg.o();
                return null;
            default:
                b07 b07Var = (f07) obj;
                if (!(b07Var instanceof b07)) {
                    if ((b07Var instanceof c07) || (b07Var instanceof e07)) {
                        return rih1Var;
                    }
                    eg.o();
                    return null;
                }
                xik xikVar = zmrVar.c1;
                if (xikVar == null) {
                    u890.C("model");
                    throw null;
                }
                if (xikVar.t != null || xikVar.u) {
                    return rih1Var;
                }
                h72 h72Var = zmrVar.d;
                Integer num = b07Var.a;
                h360.j(h72Var, num != null ? num.intValue() : zmrVar.P0);
                return rih1Var;
        }
    }
}
