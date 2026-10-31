package p;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e041 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ l041 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e041(l041 l041Var, String str, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = l041Var;
        this.d = str;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        String str = this.d;
        l041 l041Var = this.c;
        switch (b) {
            case 0:
                return new e041(l041Var, str, lnmVar, (byte) 0);
            default:
                return new e041(l041Var, str, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        l041 l041Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                rsc0 rsc0Var = l041Var.a;
                qvc0 qvc0Var = new qvc0(this.d, (c3d0) null, (Set) null, new iqz0(0, 200), 6);
                this.b = true;
                obj = rsc0Var.i(qvc0Var, this);
                if (obj == d9nVar) {
                    return d9nVar;
                }
                List list = (List) ((py21) obj).c();
                if (list != null) {
                    List<pvc0> list2 = list;
                    ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                    String str = null;
                    for (pvc0 pvc0Var : list2) {
                        hzl1 hzl1Var = ytw0.f(pvc0Var.f).a;
                        String str2 = hzl1Var != null ? hzl1Var.a : null;
                        String str3 = pvc0Var.c;
                        if (str2 != null) {
                            str = str2;
                        }
                        arrayList.add(new yz31(str3, str));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        yz31 yz31Var = (yz31) obj2;
                        if (!ihc1.y0(yz31Var.a)) {
                            Set set = s4b1.f;
                            if (!uic.x(yz31Var.a).u()) {
                                arrayList2.add(obj2);
                            }
                        }
                    }
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : arrayList2) {
                        if (hashSet.add(((yz31) obj3).a)) {
                            arrayList3.add(obj3);
                        }
                    }
                    return arrayList3;
                }
                return null;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                xrc0 xrc0Var = l041Var.a;
                trc0 trc0Var = l041.i;
                xpv0 xpv0Var = l041Var.d;
                this.b = true;
                Object objS = ryo1.s(xrc0Var, this.d, trc0Var, xpv0Var, this);
                return objS == d9nVar ? d9nVar : objS;
        }
    }
}
