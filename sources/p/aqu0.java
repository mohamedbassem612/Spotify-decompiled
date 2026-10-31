package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class aqu0 extends a8d1 implements zu30 {
    public ArrayList a;
    public boolean b;
    public /* synthetic */ List c;
    public /* synthetic */ boolean d;
    public /* synthetic */ th61 e;
    public final /* synthetic */ wmy f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqu0(wmy wmyVar, lnm lnmVar) {
        super(4, lnmVar);
        this.f = wmyVar;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        aqu0 aqu0Var = new aqu0(this.f, (lnm) obj4);
        aqu0Var.c = (List) obj;
        aqu0Var.d = zBooleanValue;
        aqu0Var.e = (th61) obj3;
        return aqu0Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object next;
        ArrayList arrayList;
        Set setP1;
        List list = this.c;
        boolean z = this.d;
        th61 th61Var = this.e;
        boolean z2 = this.b;
        try {
            if (!z2) {
                hm5.M(obj);
                wmy wmyVar = this.f;
                if (!((gdx0) wmyVar.f).a.b() && z) {
                    th61Var.getClass();
                    String str = th61Var.a;
                    List list2 = list;
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        fji0 fji0Var = (fji0) next;
                        if (u890.j(new y6b1(fji0Var.a.a, false).d, str) && fji0Var.f == wls0.f) {
                            break;
                        }
                    }
                    if (next != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : list2) {
                            if (!u890.j(new y6b1(((fji0) obj2).a.a, false).d, str)) {
                                arrayList2.add(obj2);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            try {
                                bfd bfdVar = (bfd) wmyVar.e;
                                ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    arrayList3.add(((fji0) it2.next()).a.b);
                                }
                                this.c = null;
                                this.e = null;
                                this.a = arrayList2;
                                this.d = z;
                                this.b = true;
                                obj = bfdVar.b.g(arrayList3, this);
                                d9n d9nVar = d9n.a;
                                if (obj == d9nVar) {
                                    return d9nVar;
                                }
                                arrayList = arrayList2;
                            } catch (Throwable unused) {
                                arrayList = arrayList2;
                                setP1 = w7x.a;
                            }
                        }
                    }
                }
                return z6x.a;
            }
            if (!z2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = this.a;
            try {
                hm5.M(obj);
            } catch (Throwable unused2) {
                setP1 = w7x.a;
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : (Iterable) obj) {
                if (((mfd) obj3).b) {
                    arrayList4.add(obj3);
                }
            }
            ArrayList arrayList5 = new ArrayList(q7h.U(arrayList4, 10));
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                arrayList5.add(((mfd) it3.next()).a);
            }
            setP1 = o7h.p1(arrayList5);
            ArrayList arrayList6 = new ArrayList();
            for (Object obj4 : arrayList) {
                if (setP1.contains(((fji0) obj4).a.b)) {
                    arrayList6.add(obj4);
                }
            }
            return arrayList6;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
