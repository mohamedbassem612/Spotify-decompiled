package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ytr extends a8d1 implements dv30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ytr(Object obj, lnm lnmVar, byte b) {
        super(6, lnmVar);
        this.a = b;
        this.g = obj;
    }

    public final Object Y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj7 = this.g;
        switch (b) {
            case 0:
                ytr ytrVar = new ytr((byp) obj7, (lnm) obj6, (byte) 0);
                ytrVar.b = (List) obj;
                ytrVar.f = (pp90) obj2;
                ytrVar.c = (List) obj3;
                ytrVar.d = (List) obj4;
                ytrVar.e = (List) obj5;
                return ytrVar.invokeSuspend(rih1Var);
            case 1:
                ytr ytrVar2 = new ytr((obi0) obj7, (lnm) obj6, (byte) 1);
                ytrVar2.b = (sbi0) obj;
                ytrVar2.c = (hwt) obj2;
                ytrVar2.d = (zkm) obj3;
                ytrVar2.e = (ijo) obj4;
                ytrVar2.f = (y2u0) obj5;
                return ytrVar2.invokeSuspend(rih1Var);
            default:
                ytr ytrVar3 = new ytr((j1v0) obj7, (lnm) obj6, (byte) 2);
                ytrVar3.f = (cxc0) obj;
                ytrVar3.b = (List) obj2;
                ytrVar3.c = (List) obj3;
                ytrVar3.d = (List) obj4;
                ytrVar3.e = (List) obj5;
                return ytrVar3.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Object obj2 = this.g;
        switch (b) {
            case 0:
                List list = (List) this.b;
                pp90 pp90Var = (pp90) this.f;
                List list2 = (List) this.c;
                List list3 = (List) this.d;
                List list4 = (List) this.e;
                hm5.M(obj);
                byp bypVar = (byp) obj2;
                return ((iir) bypVar.g).l(list, pp90Var, list2, list3, list4, (Map) ((uya) bypVar.f).a().getValue(), 1);
            case 1:
                sbi0 sbi0Var = (sbi0) this.b;
                hwt hwtVar = (hwt) this.c;
                zkm zkmVar = (zkm) this.d;
                ijo ijoVar = (ijo) this.e;
                y2u0 y2u0Var = (y2u0) this.f;
                hm5.M(obj);
                return new kbi0(new t810(new ioj0(), zkmVar, hwtVar, ijoVar, false, false, false, false, false, false, false, false, y2u0Var, (sq51) null, false, false, false, 2064304), sbi0Var);
            default:
                cxc0 cxc0Var = (cxc0) this.f;
                List list5 = (List) this.b;
                List list6 = (List) this.c;
                List list7 = (List) this.d;
                List list8 = (List) this.e;
                hm5.M(obj);
                List list9 = list7;
                List list10 = list8;
                return z561.m0(new sgg1(new n5u0(cxc0Var, (byte) 14), z561.T(zqb0.Q0, z561.f0(new n5u0((j1v0) obj2, (byte) 13), new i46(o7h.N0(list10, o7h.N0(list9, o7h.N0(list6, list5))), (byte) 1)))));
        }
    }
}
