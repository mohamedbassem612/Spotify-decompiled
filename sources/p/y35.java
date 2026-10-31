package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class y35 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d45 b;
    public final /* synthetic */ g3e1 c;

    public /* synthetic */ y35(d45 d45Var, g3e1 g3e1Var, byte b) {
        this.a = b;
        this.b = d45Var;
        this.c = g3e1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        byte b2 = 2;
        g3e1 g3e1Var = this.c;
        d45 d45Var = this.b;
        switch (b) {
            case 0:
                x35 x35Var = d45Var.f;
                hx4 hx4Var = new hx4(g3e1Var, b2);
                p811 p811Var = new p811();
                d45Var.e.d("dataBuilder", x35Var, new og(p811Var, hx4Var, (byte) 4));
                Object obj = p811Var.a;
                if (obj != null) {
                    return (f3e1) obj;
                }
                u890.C("result");
                throw null;
            case 1:
                x35 x35Var2 = d45Var.g;
                y35 y35Var = new y35(d45Var, g3e1Var, b2);
                p811 p811Var2 = new p811();
                d45Var.e.d("positioner", x35Var2, new og(p811Var2, y35Var, (byte) 4));
                Object obj2 = p811Var2.a;
                if (obj2 != null) {
                    return (n511) obj2;
                }
                u890.C("result");
                throw null;
            default:
                Object objInvoke = d45Var.c.invoke();
                elb0 elb0Var = (elb0) (((elb0) objInvoke).a() ? objInvoke : null);
                return elb0Var == null ? n511.e : g3e1Var.o0(elb0Var).n(elb0Var.O(0L));
        }
    }
}
