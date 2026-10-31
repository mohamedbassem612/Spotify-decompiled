package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d7s extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ goq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d7s(goq goqVar, byte b) {
        super(1);
        this.a = b;
        this.b = goqVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        goq goqVar = this.b;
        switch (b) {
            case 0:
                ((iu30) goqVar.f).invoke(usg0.a);
                return rih1Var;
            default:
                ksg0 ksg0Var = (ksg0) obj;
                if (ksg0Var instanceof isg0) {
                    ((iu30) goqVar.f).invoke(new ssg0(((isg0) ksg0Var).a));
                    return rih1Var;
                }
                if (ksg0Var instanceof jsg0) {
                    ((iu30) goqVar.f).invoke(new tsg0(((jsg0) ksg0Var).a));
                    return rih1Var;
                }
                eg.o();
                return null;
        }
    }
}
