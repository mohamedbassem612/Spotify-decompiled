package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t430 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t430(iu30 iu30Var, iu30 iu30Var2, byte b) {
        super(2);
        this.a = b;
        this.b = iu30Var;
        this.c = iu30Var2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        iu30 iu30Var = this.c;
        iu30 iu30Var2 = this.b;
        switch (b) {
            case 0:
                k430 k430Var = (k430) obj;
                u910 u910Var = (u910) obj2;
                String str = k430Var.a;
                String str2 = u910Var.d;
                if (str2 == null) {
                    str2 = (String) iu30Var2.invoke(k430Var);
                }
                return new s430(str, str2, u910Var.b.equals(fcl.b), u910Var.a.a, u910Var.c, ((Boolean) iu30Var.invoke(k430Var)).booleanValue());
            default:
                iys0 iys0Var = (iys0) obj;
                tv80 tv80Var = (tv80) obj2;
                if (iys0Var.j) {
                    iu30Var2.invoke(tv80Var);
                } else {
                    iu30Var.invoke(iys0Var);
                }
                return rih1.a;
        }
    }
}
