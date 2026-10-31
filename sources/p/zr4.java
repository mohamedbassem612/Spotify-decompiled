package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import spotify.your_library.esperanto.proto.IsCuratedRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zr4 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ vr20 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ys4 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zr4(lnm lnmVar, ys4 ys4Var, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = ys4Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ys4 ys4Var = this.e;
        vr20 vr20Var = (vr20) obj;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                zr4 zr4Var = new zr4(lnmVar, ys4Var, (byte) 0);
                zr4Var.c = vr20Var;
                zr4Var.d = obj2;
                return zr4Var.invokeSuspend(rih1Var);
            case 1:
                zr4 zr4Var2 = new zr4(lnmVar, ys4Var, (byte) 1);
                zr4Var2.c = vr20Var;
                zr4Var2.d = obj2;
                return zr4Var2.invokeSuspend(rih1Var);
            case 2:
                zr4 zr4Var3 = new zr4(lnmVar, ys4Var, (byte) 2);
                zr4Var3.c = vr20Var;
                zr4Var3.d = obj2;
                return zr4Var3.invokeSuspend(rih1Var);
            case 3:
                zr4 zr4Var4 = new zr4(lnmVar, ys4Var, (byte) 3);
                zr4Var4.c = vr20Var;
                zr4Var4.d = obj2;
                return zr4Var4.invokeSuspend(rih1Var);
            case 4:
                zr4 zr4Var5 = new zr4(lnmVar, ys4Var, (byte) 4);
                zr4Var5.c = vr20Var;
                zr4Var5.d = obj2;
                return zr4Var5.invokeSuspend(rih1Var);
            default:
                zr4 zr4Var6 = new zr4(lnmVar, ys4Var, (byte) 5);
                zr4Var6.c = vr20Var;
                zr4Var6.d = obj2;
                return zr4Var6.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        huz huzVarU;
        huz ht20Var;
        io70 io70Var;
        huz ht20Var2;
        lt20 huzVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ys4 ys4Var = this.e;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                vr20 vr20Var = this.c;
                Object obj2 = this.d;
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                q0i0 q0i0Var = ys4Var.v;
                q0i0Var.getClass();
                o3r o3rVar = m2i0.c;
                mtl mtlVar = new mtl();
                jge jgeVarE = hu20.e(q0i0Var.a, new c6e0((lnm) null, new ntf0(q0i0Var, o3rVar, (String) obj2, mtlVar, (byte) 5), mtlVar, (byte) 2));
                this.c = null;
                this.d = null;
                this.b = true;
                u4p1.S(vr20Var);
                Object objCollect = jgeVarE.collect(new w93(vr20Var, (byte) 15), this);
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                return objCollect == d9nVar ? d9nVar : rih1Var;
            case 1:
                vr20 vr20Var2 = this.c;
                Object obj3 = this.d;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                String str = (String) obj3;
                if (str.length() == 0) {
                    huzVarU = new huz("", (byte) 10);
                } else {
                    q0i0 q0i0Var2 = ys4Var.v;
                    q0i0Var2.getClass();
                    o3r o3rVar2 = m2i0.b;
                    xkk1 xkk1Var = new xkk1((mq70) null, (mq70) null, (mq70) null, 63);
                    huzVarU = rqt0.u(new tf2(hu20.e(q0i0Var2.a, new c6e0((lnm) null, new ntf0(q0i0Var2, o3rVar2, str, xkk1Var, (byte) 5), xkk1Var, (byte) 2)), (byte) 2));
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var2, huzVarU, this) == d9nVar ? d9nVar : rih1Var;
            case 2:
                vr20 vr20Var3 = this.c;
                Object obj4 = this.d;
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                List<String> list = (List) obj4;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (String str2 : list) {
                    q0i0 q0i0Var3 = ys4Var.v;
                    str2.getClass();
                    q0i0Var3.getClass();
                    arrayList.add(new ks4(hu20.e(q0i0Var3.a, new c6e0((lnm) null, new n0i0(str2, q0i0Var3, (byte) 0), (Object) null, (byte) 2)), str2, (byte) 0));
                }
                mr20[] mr20VarArr = (mr20[]) o7h.l1(arrayList).toArray(new mr20[0]);
                this.c = null;
                this.d = null;
                this.b = true;
                u4p1.S(vr20Var3);
                Object objS = fc11.s(new ua3(mr20VarArr, (byte) 1), this, vr20Var3, new va3(3, null, (byte) 1), mr20VarArr);
                if (objS != d9nVar) {
                    objS = rih1Var;
                }
                if (objS != d9nVar) {
                    objS = rih1Var;
                }
                return objS == d9nVar ? d9nVar : rih1Var;
            case 3:
                vr20 vr20Var4 = this.c;
                Object obj5 = this.d;
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Map map = (Map) obj5;
                Collection<jo70> collectionValues = map.values();
                ArrayList arrayList2 = new ArrayList();
                for (jo70 jo70Var : collectionValues) {
                    String str3 = (jo70Var == null || (io70Var = jo70Var.e) == null) ? null : io70Var.b;
                    if (str3 != null) {
                        arrayList2.add(str3);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj6 : arrayList2) {
                    String str4 = (String) obj6;
                    if (str4.length() > 0 && !map.containsKey(str4)) {
                        arrayList3.add(obj6);
                    }
                }
                List listJ0 = o7h.j0(arrayList3);
                if (listJ0.isEmpty()) {
                    ht20Var = new huz(map, (byte) 10);
                } else {
                    List<String> list2 = listJ0;
                    ArrayList arrayList4 = new ArrayList(q7h.U(list2, 10));
                    for (String str5 : list2) {
                        q0i0 q0i0Var4 = ys4Var.v;
                        q0i0Var4.getClass();
                        arrayList4.add(new ks4(hu20.e(q0i0Var4.a, new c6e0((lnm) null, new n0i0(str5, q0i0Var4, (byte) 0), (Object) null, (byte) 2)), str5, (byte) 1));
                    }
                    ht20Var = new ht20(new c64((mr20[]) o7h.l1(arrayList4).toArray(new mr20[0]), map, (byte) 3), new hi2(map, (lnm) null, (byte) 17));
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var4, ht20Var, this) == d9nVar ? d9nVar : rih1Var;
            case 4:
                vr20 vr20Var5 = this.c;
                Object obj7 = this.d;
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                String str6 = (String) obj7;
                if (str6 == null) {
                    ht20Var2 = new huz(new ogl1((String) null), (byte) 10);
                } else {
                    q0i0 q0i0Var5 = ys4Var.v;
                    q0i0Var5.getClass();
                    o3r o3rVar3 = m2i0.c;
                    mtl mtlVar2 = new mtl();
                    ht20Var2 = new ht20(new ks4(hu20.e(q0i0Var5.a, new c6e0((lnm) null, new ntf0(q0i0Var5, o3rVar3, str6, mtlVar2, (byte) 5), mtlVar2, (byte) 2)), str6, (byte) 2), new ts4(str6, null, (byte) 0));
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var5, ht20Var2, this) == d9nVar ? d9nVar : rih1Var;
            default:
                vr20 vr20Var6 = this.c;
                Object obj8 = this.d;
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                spq0 spq0Var = (spq0) obj8;
                if (spq0Var.c()) {
                    String str7 = (String) spq0Var.b();
                    mwm1 mwm1Var = ys4Var.y;
                    str7.getClass();
                    hf90 hf90VarP = IsCuratedRequest.p();
                    hf90VarP.q(str7);
                    huzVar = new lt20(new xs4(yoi1.g(mwm1Var.d(hf90VarP.build())), str7, (byte) 0), new re1(3, (lnm) null, (byte) 4), (byte) 0);
                } else {
                    huzVar = new huz(j5.a, (byte) 10);
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var6, huzVar, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
