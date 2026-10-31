package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ah20 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah20(Function0 function0, iu30 iu30Var) {
        super(2);
        this.a = (byte) 1;
        this.b = iu30Var;
        this.c = function0;
    }

    public final Object invoke(Object obj, Object obj2) {
        pjw0 pjw0Var;
        yo60 yo60Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        Function0 function0 = this.c;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                b2p1.o(czo1.p(1), function0, (b0k) obj, iu30Var);
                return rih1Var;
            case 1:
                ioj0 ioj0Var = (ioj0) obj2;
                String str = (String) iu30Var.invoke(obj);
                goj0 goj0VarC = ioj0Var.c(yo60.class, str);
                zrw bswVar = null;
                goj0 goj0Var = goj0VarC instanceof goj0 ? goj0VarC : null;
                if (goj0Var != null && (yo60Var = (yo60) goj0Var.a) != null) {
                    return c97.w(yo60Var, (hwt) function0.invoke());
                }
                goj0 goj0VarC2 = ioj0Var.c(pjw0.class, str);
                goj0 goj0Var2 = goj0VarC2 instanceof goj0 ? goj0VarC2 : null;
                if (goj0Var2 == null || (pjw0Var = (pjw0) goj0Var2.a) == null) {
                    return null;
                }
                hwt hwtVar = (hwt) function0.invoke();
                ljw0 ljw0Var = pjw0Var.b;
                if (ljw0Var instanceof ljw0) {
                    String str2 = ljw0Var.a.a.a.a;
                    if (str2.length() <= 0) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        bswVar = new zrw(str2);
                    }
                } else {
                    if (!(ljw0Var instanceof mjw0)) {
                        eg.o();
                        return null;
                    }
                    if (kno1.B(pjw0Var, hwtVar).equals(m8i0.a)) {
                        mjw0 mjw0Var = (mjw0) ljw0Var;
                        z6j1 z6j1Var = mjw0Var.a;
                        ojw0 ojw0Var = mjw0Var.b;
                        x6j1 x6j1Var = z6j1Var.a;
                        if (x6j1Var instanceof x6j1) {
                            bswVar = new asw(ojw0Var != null ? Integer.valueOf((int) jfv.h(ojw0Var.a)) : null, x6j1Var.a, ojw0Var != null ? Integer.valueOf((int) jfv.h(ojw0Var.b)) : null);
                        } else {
                            if (!(x6j1Var instanceof w6j1)) {
                                eg.o();
                                return null;
                            }
                            String str3 = ((w6j1) x6j1Var).a.a;
                            if (str3.length() <= 0) {
                                str3 = null;
                            }
                            if (str3 != null) {
                                bswVar = new bsw(str3);
                            }
                        }
                    }
                }
                return new yrw(p7h.N(bswVar));
            case 2:
                ((Number) obj2).intValue();
                pro1.i(czo1.p(1), function0, (b0k) obj, iu30Var);
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                n1p1.i(czo1.p(1), function0, (b0k) obj, iu30Var);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah20(Function0 function0, iu30 iu30Var, int i) {
        super(2);
        this.a = (byte) 3;
        this.c = function0;
        this.b = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ah20(iu30 iu30Var, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.b = iu30Var;
        this.c = function0;
    }
}
