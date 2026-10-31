package p;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class k6s extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Set b;
    public /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6s() {
        super(3, (lnm) null);
        this.a = (byte) 1;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = 3;
        switch (b) {
            case 0:
                k6s k6sVar = new k6s(b2, (lnm) obj3, (byte) 0);
                k6sVar.c = (List) obj;
                k6sVar.b = (Set) obj2;
                return k6sVar.invokeSuspend(rih1Var);
            case 1:
                k6s k6sVar2 = new k6s(b2, (lnm) obj3, (byte) 1);
                k6sVar2.b = (Set) obj;
                k6sVar2.c = (List) obj2;
                return k6sVar2.invokeSuspend(rih1Var);
            case 2:
                k6s k6sVar3 = new k6s(b2, (lnm) obj3, (byte) 2);
                k6sVar3.b = (Set) obj;
                k6sVar3.c = (List) obj2;
                return k6sVar3.invokeSuspend(rih1Var);
            default:
                k6s k6sVar4 = new k6s(b2, (lnm) obj3, b2);
                k6sVar4.c = (List) obj;
                k6sVar4.b = (Set) obj2;
                return k6sVar4.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                List arrayList = this.c;
                Set set = this.b;
                hm5.M(obj);
                if (!set.isEmpty()) {
                    List<yd20> list = arrayList;
                    ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
                    for (yd20 yd20Var : list) {
                        ArrayList arrayList3 = yd20Var.b.a;
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj2 : arrayList3) {
                            if (!set.contains(((q620) obj2).a)) {
                                arrayList4.add(obj2);
                            }
                        }
                        arrayList2.add(new yd20(yd20Var.a, new sg51(arrayList4)));
                    }
                    arrayList = new ArrayList();
                    for (Object obj3 : arrayList2) {
                        if (!((yd20) obj3).b.a.isEmpty()) {
                            arrayList.add(obj3);
                        }
                    }
                }
                return arrayList;
            case 1:
                Set set2 = this.b;
                List list2 = this.c;
                hm5.M(obj);
                return new mmr0(set2, list2);
            case 2:
                Set setX0 = this.b;
                List<mmr0> list3 = this.c;
                hm5.M(obj);
                for (mmr0 mmr0Var : list3) {
                    int iIntValue = ((Number) mmr0Var.a).intValue();
                    setX0 = ((Boolean) mmr0Var.b).booleanValue() ? dm61.x0(new Integer(iIntValue), setX0) : dm61.u0(new Integer(iIntValue), setX0);
                }
                return setX0;
            default:
                List list4 = this.c;
                Set set3 = this.b;
                hm5.M(obj);
                if (set3.isEmpty()) {
                    return list4;
                }
                List<vb61> list5 = list4;
                ArrayList arrayList5 = new ArrayList(q7h.U(list5, 10));
                for (vb61 vb61VarA : list5) {
                    if (set3.contains(vb61VarA.a)) {
                        vb61VarA = vb61.a(vb61VarA, (Set) null, (String) null, 251);
                    }
                    arrayList5.add(vb61VarA);
                }
                return arrayList5;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k6s(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }
}
