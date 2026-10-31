package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class c601 extends hab0 implements zu30 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e601 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c601(int i, e601 e601Var, boolean z) {
        super(4);
        this.a = i;
        this.b = e601Var;
        this.c = z;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        l201 l201Var;
        e201 e201Var;
        c380 c380Var = (c380) obj2;
        ((Number) obj4).intValue();
        b0k b0kVar = (x340) ((b0k) obj3);
        Object objT = b0kVar.T();
        if (objT == fkj0.X) {
            int i = this.a;
            String str = i == 0 ? null : ((pxz0) c380Var.get(i - 1)).a;
            e601 e601Var = this.b;
            cnq cnqVar = e601Var.a;
            sxz0 sxz0Var = e601Var.e;
            frd1 frd1Var = e601Var.f;
            a601 a601Var = new a601(e601Var, (byte) 2);
            if (this.c) {
                m201 m201Var = e601Var.d;
                String str2 = str == null ? "" : str;
                LinkedHashMap linkedHashMap = m201Var.a;
                l201Var = (l201) linkedHashMap.get(frd1Var + str2);
                linkedHashMap.remove(frd1Var + str2);
                if (l201Var == null) {
                    l201Var = new l201();
                }
            } else {
                l201Var = new l201();
            }
            l201 l201Var2 = l201Var;
            switch (cnqVar.a) {
                case 0:
                    f0a f0aVar = (f0a) cnqVar.b.c;
                    pmq pmqVar = (pmq) ((jly0) f0aVar.t).get();
                    qmq qmqVar = (qmq) ((jly0) f0aVar.X).get();
                    rmq rmqVar = (rmq) ((jly0) f0aVar.N0).get();
                    m201 m201Var2 = (m201) ((e101) f0aVar.c).f.get();
                    c8o.l(m201Var2);
                    e201Var = new e201(pmqVar, qmqVar, rmqVar, m201Var2, sxz0Var, frd1Var, str, a601Var, l201Var2);
                    break;
                default:
                    uw0 uw0Var = (uw0) cnqVar.b.c;
                    pmq pmqVar2 = (pmq) ((jly0) uw0Var.t).get();
                    qmq qmqVar2 = (qmq) ((jly0) uw0Var.X).get();
                    rmq rmqVar2 = (rmq) ((jly0) uw0Var.Z).get();
                    m201 m201Var3 = (m201) ((v001) uw0Var.d).m.get();
                    c8o.l(m201Var3);
                    e201Var = new e201(pmqVar2, qmqVar2, rmqVar2, m201Var3, sxz0Var, frd1Var, str, a601Var, l201Var2);
                    break;
            }
            objT = e201Var;
            b0kVar.s0(objT);
        }
        ((e201) ((d101) objT)).a(b0kVar, 0);
        return rih1.a;
    }
}
