package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vmr extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ zmr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vmr(iu30 iu30Var, zmr zmrVar, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
        this.c = zmrVar;
    }

    public final Object invoke(Object obj) {
        String str;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        zmr zmrVar = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                xik xikVar = zmrVar.c1;
                if (xikVar == null) {
                    u890.C("model");
                    throw null;
                }
                String str2 = xikVar.a;
                wik wikVar = xikVar.t;
                if ((wikVar == null || (str = wikVar.a) == null) && (str = xikVar.g) == null) {
                    str = "";
                }
                iu30Var.invoke(new tik(str2, str));
                return rih1Var;
            case 1:
                xik xikVar2 = zmrVar.c1;
                if (xikVar2 != null) {
                    iu30Var.invoke(new pik(xikVar2.a));
                    return rih1Var;
                }
                u890.C("model");
                throw null;
            case 2:
                xik xikVar3 = zmrVar.c1;
                if (xikVar3 != null) {
                    iu30Var.invoke(new rik(xikVar3.a, xikVar3.n));
                    return rih1Var;
                }
                u890.C("model");
                throw null;
            default:
                xik xikVar4 = zmrVar.c1;
                if (xikVar4 != null) {
                    iu30Var.invoke(new rik(xikVar4.a, xikVar4.n));
                    return rih1Var;
                }
                u890.C("model");
                throw null;
        }
    }
}
