package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class of1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ lf1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of1(lf1 lf1Var, iu30 iu30Var) {
        super(1);
        this.a = (byte) 4;
        this.c = lf1Var;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        lf1 lf1Var = this.c;
        switch (b) {
            case 0:
                iu30Var.invoke(new ef1(lf1Var.d, lf1Var.e, (String) obj));
                return rih1Var;
            case 1:
                iu30Var.invoke(new ef1(lf1Var.d, lf1Var.e, (String) obj));
                return rih1Var;
            case 2:
                iu30Var.invoke(new ef1(lf1Var.d, lf1Var.e, (String) obj));
                return rih1Var;
            case 3:
                iu30Var.invoke(new ef1(lf1Var.d, lf1Var.e, (String) obj));
                return rih1Var;
            default:
                rtb0 rtb0Var = (rtb0) obj;
                byte b2 = 3;
                rtb0.c(rtb0Var, (Object) null, new j2i(-126944046, new wf((byte) 7, lf1Var, iu30Var), true), 3);
                List list = lf1Var.b;
                String str = lf1Var.c;
                Iterator it = list.iterator();
                while (true) {
                    byte b3 = 0;
                    if (!it.hasNext()) {
                        if (str.length() <= 0) {
                            return rih1Var;
                        }
                        rtb0.c(rtb0Var, (Object) null, new j2i(-1312456915, new pf1(huj.a(str, new of1(iu30Var, lf1Var, b2)), (byte) 0), true), 3);
                        return rih1Var;
                    }
                    umc0 umc0Var = (umc0) it.next();
                    rtb0.c(rtb0Var, (Object) null, new j2i(-1673068035, new n891(umc0Var, iu30Var, lf1Var, (byte) 7), true), 3);
                    int i = umc0Var.c;
                    List list2 = umc0Var.b;
                    int iC = l1d.C(i);
                    if (iC == 0) {
                        rtb0Var.e(list2.size(), (iu30) null, new qf1(list2, (byte) 0), new j2i(2039820996, new rf1(b3, iu30Var, lf1Var, list2), true));
                    } else {
                        if (iC != 1) {
                            eg.o();
                            return null;
                        }
                        rtb0Var.e(list2.size(), (iu30) null, new qf1(list2, (byte) 1), new j2i(2039820996, new sf1(list2, (byte) 0), true));
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ of1(iu30 iu30Var, lf1 lf1Var, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
        this.c = lf1Var;
    }
}
