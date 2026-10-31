package p;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pbd1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d520 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pbd1(d520 d520Var, byte b) {
        super(1);
        this.a = b;
        this.b = d520Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d520 d520Var = this.b;
        switch (b) {
            case 0:
                xv61 xv61Var = (xv61) d520Var.d;
                hbd1 hbd1Var = ((ibd1) obj).b;
                b7n b7nVar = (b7n) d520Var.b;
                if (hbd1Var instanceof cbd1) {
                    return new lt20(new tu41(b7nVar.a(((cbd1) hbd1Var).a), (byte) 9), new q8t0(3, (lnm) null, (byte) 13), (byte) 0);
                }
                if (hbd1Var instanceof bbd1) {
                    return new lt20(new tu41(rqt0.u(new jha1(b7nVar.a(j6n.a), (byte) 11)), (byte) 9), new q8t0(3, (lnm) null, (byte) 13), (byte) 0);
                }
                if (hbd1Var instanceof ebd1) {
                    ebd1 ebd1Var = (ebd1) hbd1Var;
                    return hu20.e(xv61Var.a(rc11.a.b(ivw0.class), ebd1Var.e).d, new an6(null, ebd1Var.b, (byte) 2));
                }
                if (hbd1Var instanceof dbd1) {
                    return new dt61(xv61Var.a(rc11.a.b(ivw0.class), ((dbd1) hbd1Var).e).d, new et61(new qwc1(d520Var, hbd1Var, (byte) 4), (byte) 0), (byte) 0);
                }
                if (hbd1Var instanceof gbd1) {
                    return new lt20(new tu41(((gbd1) hbd1Var).a, (byte) 9), new q8t0(3, (lnm) null, (byte) 13), (byte) 0);
                }
                if (!(hbd1Var instanceof fbd1)) {
                    if (hbd1Var instanceof abd1) {
                        return xv61Var.a(((abd1) hbd1Var).a, rih1Var).d;
                    }
                    eg.o();
                    return null;
                }
                fbd1 fbd1Var = (fbd1) hbd1Var;
                ueo0 ueo0Var = (ueo0) ((idd1) d520Var.h).getValue();
                Function0 function0 = fbd1Var.a;
                LinkedHashMap linkedHashMap = ueo0Var.a;
                Object objB = linkedHashMap.get(fbd1Var);
                if (objB == null) {
                    objB = gio1.b(function0.invoke());
                    linkedHashMap.put(fbd1Var, objB);
                }
                return new lt20(new tu41((wen0) objB, (byte) 9), new q8t0(3, (lnm) null, (byte) 13), (byte) 0);
            case 1:
                xv61 xv61Var2 = (xv61) d520Var.d;
                hbd1 hbd1Var2 = ((ibd1) obj).b;
                huz huzVar = d520.Y;
                if (!(hbd1Var2 instanceof cbd1) && !(hbd1Var2 instanceof bbd1)) {
                    if (hbd1Var2 instanceof ebd1) {
                        return hu20.e(xv61Var2.a(rc11.a.b(ivw0.class), ((ebd1) hbd1Var2).e).f, new afb1((lnm) null, hbd1Var2, (byte) 1));
                    }
                    if (hbd1Var2 instanceof dbd1) {
                        return new mpy0(xv61Var2.a(rc11.a.b(ivw0.class), ((dbd1) hbd1Var2).e).f, d520Var, hbd1Var2, (byte) 17);
                    }
                    if (!(hbd1Var2 instanceof gbd1) && !(hbd1Var2 instanceof fbd1)) {
                        if (hbd1Var2 instanceof abd1) {
                            return xv61Var2.a(((abd1) hbd1Var2).a, rih1Var).f;
                        }
                        eg.o();
                        return null;
                    }
                }
                return huzVar;
            default:
                hbd1 hbd1Var3 = ((ibd1) obj).b;
                return ((hbd1Var3 instanceof ebd1) || (hbd1Var3 instanceof dbd1)) ? ((pcl) d520Var.e).a() : new huz(iax.a, (byte) 10);
        }
    }
}
