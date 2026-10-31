package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qno extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qno(Object obj, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.d = obj;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj2).intValue();
                qno qnoVar = new qno((asn) obj4, (lnm) obj3, (byte) 0);
                qnoVar.c = (k8g1) obj;
                qnoVar.b = iIntValue;
                return qnoVar.invokeSuspend(rih1Var);
            default:
                int iIntValue2 = ((Number) obj2).intValue();
                qno qnoVar2 = new qno((j1v0) obj4, (lnm) obj3, (byte) 1);
                qnoVar2.c = (List) obj;
                qnoVar2.b = iIntValue2;
                return qnoVar2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        mmr0 mmr0Var;
        switch (this.a) {
            case 0:
                k8g1 k8g1Var = (k8g1) this.c;
                int i = this.b;
                hm5.M(obj);
                if (k8g1Var != null) {
                    List list = k8g1Var.i;
                    of51 of51Var = (of51) list.get(hxo1.o(list, i, pno.b));
                    if (of51Var instanceof yde1) {
                        yde1 yde1Var = (yde1) of51Var;
                        List list2 = yde1Var.c;
                        String str = yde1Var.b;
                        if (list2.isEmpty() || k8g1Var.X != qpe1.c) {
                            mmr0Var = new mmr0(new Integer(str.length()), new Integer(str.length()));
                        } else {
                            int i2 = ((mbe1) list2.get(hxo1.o(list2, i, ono.b))).b;
                            int iMin = Math.min(i2 - 1, str.length() - 1);
                            while (iMin >= 0 && str.charAt(iMin) != ' ') {
                                iMin--;
                            }
                            mmr0Var = new mmr0(new Integer(i2), new Integer(Math.max(0, iMin + 1)));
                        }
                        return new mno(str, ((Number) mmr0Var.a).intValue(), ((Number) mmr0Var.b).intValue());
                    }
                    if (of51Var instanceof j2n0) {
                        return new kno(((j2n0) of51Var).c);
                    }
                }
                return lno.a;
            default:
                List list3 = (List) this.c;
                int i3 = this.b;
                hm5.M(obj);
                int size = list3.size();
                int i4 = i3 - ((j1v0) this.d).l;
                if (i4 < 0) {
                    i4 = 0;
                }
                int i5 = size - i4;
                return o7h.e1(i5 >= 0 ? i5 : 0, list3);
        }
    }
}
