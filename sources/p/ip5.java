package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ip5 implements rjp0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ip5(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final void b(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                nxa1 nxa1Var = (nxa1) obj;
                o1f0 o1f0Var = (o1f0) ((kdn0) obj3).e();
                if (o1f0Var == null) {
                    o1f0Var = o1f0.b;
                }
                kp5 kp5Var = (kp5) obj2;
                fai0 fai0VarK = kp5.k(kp5Var);
                nxa1Var.getClass();
                kp5.j(kp5Var, fai0VarK, nxa1Var, o1f0Var);
                break;
            default:
                List list = (List) obj;
                list.getClass();
                teb.c((teb) obj3, (lvc1) obj2, list);
                break;
        }
    }
}
