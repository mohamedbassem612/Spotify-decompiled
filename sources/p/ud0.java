package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ud0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ ud0(vr20 vr20Var, String str, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = str;
        this.d = arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    public final Object emit(Object obj, lnm lnmVar) {
        td0 td0Var;
        Object obj2;
        rs51 rs51Var;
        ls51 ls51Var;
        rq51 rq51Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ArrayList arrayList = this.d;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        String str = this.c;
        switch (b) {
            case 0:
                if (lnmVar instanceof td0) {
                    td0Var = (td0) lnmVar;
                    int i = td0Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        td0Var.b = i - Integer.MIN_VALUE;
                    } else {
                        td0Var = new td0(this, lnmVar);
                    }
                } else {
                    td0Var = new td0(this, lnmVar);
                }
                Object obj3 = td0Var.a;
                int i2 = td0Var.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                tfv0 tfv0Var = (tfv0) obj;
                if (tfv0Var == null || !tfv0Var.a.equals(str)) {
                    obj2 = null;
                } else {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            kd0 kd0Var = (kd0) next;
                            long j = tfv0Var.b;
                            if (j >= kd0Var.b && j < kd0Var.c) {
                                obj2 = next;
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                }
                td0Var.b = 1;
                return vr20Var.emit(obj2, td0Var) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof rs51) {
                    rs51Var = (rs51) lnmVar;
                    int i3 = rs51Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        rs51Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        rs51Var = new rs51(this, lnmVar);
                    }
                } else {
                    rs51Var = new rs51(this, lnmVar);
                }
                Object obj4 = rs51Var.a;
                int i4 = rs51Var.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj4);
                List list = (List) obj;
                ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
                Iterator it2 = list.iterator();
                int i5 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            p7h.T();
                            throw null;
                        }
                        i1r i1rVar = (k1r) next2;
                        i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                        if (i1rVar2 == null || (rq51Var = (rq51) i1rVar2.a) == null) {
                            ls51Var = new ls51(str, z6x.a);
                        } else {
                            String str2 = (String) arrayList.get(i5);
                            String str3 = rq51Var.b;
                            n5f0 n5f0Var = rq51Var.a.a;
                            arrayList2.add(new ps51(n5f0Var.a, n5f0Var.b, str2, str3));
                            i5 = i6;
                        }
                    } else {
                        ls51Var = new ls51(str, arrayList2);
                    }
                }
                rs51Var.b = 1;
                return vr20Var.emit(ls51Var, rs51Var) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
