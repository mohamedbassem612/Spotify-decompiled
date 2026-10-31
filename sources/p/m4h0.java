package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m4h0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ks6 b;
    public final /* synthetic */ otf0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m4h0(ks6 ks6Var, otf0 otf0Var, byte b) {
        super(1);
        this.a = b;
        this.b = ks6Var;
        this.c = otf0Var;
    }

    public final Object invoke(Object obj) {
        String strF;
        byte b = this.a;
        ks6 ks6Var = this.b;
        switch (b) {
            case 0:
                n5h0 n5h0Var = (n5h0) obj;
                return new f9m(k1o1.i(n5h0Var.d.a), n5h0Var.b, n5h0Var.c, null, false, false, ((mr4) ks6Var.S0).h(), null, null, null, null, this.c, 4024);
            default:
                s5h0 s5h0Var = (s5h0) obj;
                l7c1 l7c1Var = s5h0Var.d.a;
                if (((mr4) ks6Var.S0).b() == lr4.b || l7c1Var.d.isEmpty()) {
                    strF = l7c1Var.b;
                } else {
                    strF = l7c1Var.b;
                    c380 c380Var = l7c1Var.d;
                    if (!c380Var.isEmpty()) {
                        ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
                        int i = 0;
                        for (Object obj2 : c380Var) {
                            int i2 = i + 1;
                            if (i < 0) {
                                p7h.T();
                                throw null;
                            }
                            dka1 dka1Var = (dka1) obj2;
                            String str = i == 0 ? "(" : "";
                            String str2 = i == p7h.L(c380Var) ? ")" : ",";
                            String str3 = dka1Var.a;
                            String str4 = dka1Var.b;
                            StringBuilder sbN = gvg.n("[", str, str3, str2, "](");
                            sbN.append(str4);
                            sbN.append(")");
                            arrayList.add(sbN.toString());
                            i = i2;
                        }
                        strF = f4i1.f(strF, " ", o7h.y0(arrayList, " ", (String) null, (String) null, (iu30) null, 62));
                    }
                }
                return new f9m(strF, s5h0Var.b, s5h0Var.c, null, false, false, false, null, null, null, null, this.c, 4088);
        }
    }
}
