package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vmh0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wmh0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vmh0(wmh0 wmh0Var, byte b) {
        super(1);
        this.a = b;
        this.b = wmh0Var;
    }

    public final Object invoke(Object obj) {
        qmh0 qmh0Var;
        byte b = this.a;
        wmh0 wmh0Var = this.b;
        switch (b) {
            case 0:
                pmh0 pmh0Var = (pmh0) obj;
                ppl pplVar = pmh0Var.c;
                List<opl> list = pplVar.b;
                if (!wmh0.e(pmh0Var)) {
                    q9i0 q9i0Var = wmh0Var.b;
                    return new f8f0(rqt0.u(new g9i0(((w8i0) q9i0Var.i.computeIfAbsent(pmh0Var.a, new e9i0(q9i0Var, (byte) 1))).b, pmh0Var.b, (byte) 0)), (byte) 14);
                }
                ArrayList arrayList = new ArrayList();
                for (opl oplVar : list) {
                    mg31 mg31Var = oplVar.c;
                    if (mg31Var != null) {
                        String str = mg31Var.b;
                        String str2 = mg31Var.a;
                        if (str2.length() == 0) {
                            str2 = mg31Var.b;
                        }
                        qmh0Var = new qmh0(str, str2, oplVar.b, mg31Var.c, mg31Var.d, mg31Var.f, mg31Var.g);
                    } else {
                        qmh0Var = null;
                    }
                    if (qmh0Var != null) {
                        arrayList.add(qmh0Var);
                    }
                }
                return new huz(new exh1(arrayList, rmh0.d, pplVar.c ? 0 : list.size()), (byte) 10);
            default:
                ((qtr) obj).b(new u08(wmh0Var, (lnm) null, (byte) 9));
                return rih1.a;
        }
    }
}
