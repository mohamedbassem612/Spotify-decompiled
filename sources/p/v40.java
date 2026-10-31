package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v40 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v40(List list, iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = list;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        List list = this.b;
        switch (b) {
            case 0:
                ((kex) obj).b(list.size(), new j2i(-1673449743, new u40(list, iu30Var, (byte) 0), true), new s6(list, (byte) 1));
                return rih1Var;
            case 1:
                ((kex) obj).b(list.size(), new j2i(-1673449743, new u40(list, iu30Var, (byte) 3), true), new nec0(list, (byte) 10));
                return rih1Var;
            case 2:
                int iIntValue = ((Number) obj).intValue();
                iu30Var.invoke(new q67(iIntValue, ((x2y0) list.get(iIntValue)).b));
                return rih1Var;
            case 3:
                ((rtb0) obj).e(list.size(), new vse1(list, (byte) 1), new vse1(list, (byte) 2), new j2i(802480018, new ki1(list, iu30Var, (byte) 9), true));
                return rih1Var;
            default:
                a6k a6kVar = (a6k) obj;
                if (a6kVar instanceof z5k) {
                    z5k z5kVar = (z5k) a6kVar;
                    p5k p5kVar = z5kVar.a;
                    iu30Var.invoke(new r720(p5kVar.a, z5kVar.b));
                    list.add(p5kVar);
                    return rih1Var;
                }
                if (!(a6kVar instanceof y5k)) {
                    eg.o();
                    return null;
                }
                y5k y5kVar = (y5k) a6kVar;
                p5k p5kVar2 = y5kVar.a;
                iu30Var.invoke(new q720(p5kVar2.a, y5kVar.b));
                list.remove(p5kVar2);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v40(iu30 iu30Var, List list, byte b) {
        super(1);
        this.a = b;
        this.c = iu30Var;
        this.b = list;
    }
}
