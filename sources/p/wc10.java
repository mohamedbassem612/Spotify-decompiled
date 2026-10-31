package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wc10 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ k1r b;
    public /* synthetic */ k1r c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wc10(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = 3;
        k1r k1rVar = (k1r) obj;
        k1r k1rVar2 = (k1r) obj2;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                wc10 wc10Var = new wc10(b2, lnmVar, (byte) 0);
                wc10Var.b = k1rVar;
                wc10Var.c = k1rVar2;
                return wc10Var.invokeSuspend(rih1Var);
            case 1:
                wc10 wc10Var2 = new wc10(b2, lnmVar, (byte) 1);
                wc10Var2.b = k1rVar;
                wc10Var2.c = k1rVar2;
                return wc10Var2.invokeSuspend(rih1Var);
            case 2:
                wc10 wc10Var3 = new wc10(b2, lnmVar, (byte) 2);
                wc10Var3.b = k1rVar;
                wc10Var3.c = k1rVar2;
                return wc10Var3.invokeSuspend(rih1Var);
            case 3:
                wc10 wc10Var4 = new wc10(b2, lnmVar, b2);
                wc10Var4.b = k1rVar;
                wc10Var4.c = k1rVar2;
                return wc10Var4.invokeSuspend(rih1Var);
            default:
                wc10 wc10Var5 = new wc10(b2, lnmVar, (byte) 4);
                wc10Var5.b = k1rVar;
                wc10Var5.c = k1rVar2;
                return wc10Var5.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        xm6 xm6Var;
        xm6 xm6Var2;
        switch (this.a) {
            case 0:
                i1r i1rVar = this.b;
                i1r i1rVar2 = this.c;
                hm5.M(obj);
                i1r i1rVar3 = i1rVar2 instanceof i1r ? i1rVar2 : null;
                List list = i1rVar3 != null ? (List) i1rVar3.a : null;
                List list2 = z6x.a;
                if (list == null) {
                    list = list2;
                }
                List list3 = list;
                i1r i1rVar4 = i1rVar instanceof i1r ? i1rVar : null;
                List list4 = i1rVar4 != null ? (List) i1rVar4.a : null;
                if (list4 != null) {
                    list2 = list4;
                }
                ArrayList arrayListN0 = o7h.N0(list2, list3);
                if (arrayListN0.isEmpty()) {
                    i1rVar.getClass();
                    if (i1rVar instanceof j1r) {
                        return null;
                    }
                    i1rVar2.getClass();
                    if (i1rVar2 instanceof j1r) {
                        return null;
                    }
                }
                return arrayListN0;
            case 1:
                k1r k1rVar = this.b;
                k1r k1rVar2 = this.c;
                hm5.M(obj);
                return new tnj0(k1rVar, k1rVar2);
            case 2:
                k1r k1rVar3 = this.b;
                k1r k1rVar4 = this.c;
                hm5.M(obj);
                return new mmr0(k1rVar3, k1rVar4);
            case 3:
                k1r k1rVar5 = this.b;
                i1r i1rVar5 = this.c;
                hm5.M(obj);
                k1rVar5.getClass();
                if ((k1rVar5 instanceof j1r) || (k1rVar5 instanceof h1r)) {
                    return k1rVar5;
                }
                hlg0 hlg0Var = (hlg0) u890.k(k1rVar5, (d0r) null, (n4r) null);
                if (!(i1rVar5 instanceof j1r)) {
                    if (i1rVar5 instanceof i1r) {
                        xm6Var2 = (xm6) i1rVar5.a;
                    } else {
                        if (!(i1rVar5 instanceof h1r)) {
                            eg.o();
                            return null;
                        }
                        xm6Var = null;
                    }
                    return new i1r(new hlg0(hlg0Var.a, hlg0Var.b, hlg0Var.c, hlg0Var.d, hlg0Var.e, xm6Var), (Integer) null);
                }
                xm6Var2 = vm6.a;
                xm6Var = xm6Var2;
                return new i1r(new hlg0(hlg0Var.a, hlg0Var.b, hlg0Var.c, hlg0Var.d, hlg0Var.e, xm6Var), (Integer) null);
            default:
                i1r i1rVar6 = this.b;
                k1r k1rVar6 = this.c;
                hm5.M(obj);
                if (i1rVar6 instanceof h1r) {
                    return i1rVar6;
                }
                if (i1rVar6 instanceof i1r) {
                    return i1rVar6.map(new zw11(k1rVar6, (byte) 23));
                }
                j1r j1rVar = j1r.a;
                if (u890.j(i1rVar6, j1rVar)) {
                    return j1rVar;
                }
                eg.o();
                return null;
        }
    }
}
