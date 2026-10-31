package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kr51 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lr51 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kr51(lr51 lr51Var, byte b) {
        super(2);
        this.a = b;
        this.b = lr51Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lr51 lr51Var = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                lr51Var.l = str;
                lr51Var.e.a.l(new d220(str, (String) obj2, null, 12));
                break;
            case 1:
                String str2 = (String) obj;
                lr51Var.l = str2;
                lr51Var.e.a.l(new d220(str2, "", (hl51) obj2, 4));
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                byte b2 = 0;
                byte b3 = 1;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    mr51 mr51Var = lr51Var.c;
                    List list = mr51Var.a;
                    String str3 = mr51Var.b;
                    dt71 dt71Var = lr51Var.m;
                    nu nuVar = lr51Var.g;
                    up41 up41Var = lr51Var.h;
                    nl51 nl51Var = lr51Var.i;
                    boolean zI = x340Var2.i(lr51Var);
                    Object objT = x340Var2.T();
                    if (zI || objT == m4cVar) {
                        objT = new jr51(lr51Var, (byte) 1);
                        x340Var2.s0(objT);
                    }
                    yzu yzuVar = new yzu(nuVar, up41Var, nl51Var, (iu30) objT);
                    boolean zI2 = x340Var2.i(lr51Var);
                    Object objT2 = x340Var2.T();
                    if (zI2 || objT2 == m4cVar) {
                        objT2 = new kr51(lr51Var, b2);
                        x340Var2.s0(objT2);
                    }
                    vu30 vu30Var = (vu30) objT2;
                    boolean zI3 = x340Var2.i(lr51Var);
                    Object objT3 = x340Var2.T();
                    if (zI3 || objT3 == m4cVar) {
                        objT3 = new kr51(lr51Var, b3);
                        x340Var2.s0(objT3);
                    }
                    vu30 vu30Var2 = (vu30) objT3;
                    boolean zI4 = x340Var2.i(lr51Var);
                    Object objT4 = x340Var2.T();
                    if (zI4 || objT4 == m4cVar) {
                        objT4 = new jr51(lr51Var, (byte) 2);
                        x340Var2.s0(objT4);
                    }
                    iu30 iu30Var = (iu30) objT4;
                    boolean zI5 = x340Var2.i(lr51Var);
                    Object objT5 = x340Var2.T();
                    if (zI5 || objT5 == m4cVar) {
                        objT5 = new jr51(lr51Var, (byte) 3);
                        x340Var2.s0(objT5);
                    }
                    rr51.b(list, str3, dt71Var, yzuVar, vu30Var, vu30Var2, iu30Var, (iu30) objT5, x340Var2, 0);
                }
                break;
        }
        return rih1Var;
    }
}
