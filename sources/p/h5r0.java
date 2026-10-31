package p;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h5r0 extends a8d1 implements dv30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5r0(l8r0 l8r0Var, h8r0 h8r0Var, k8r0 k8r0Var, lnm lnmVar) {
        super(6, lnmVar);
        this.a = (byte) 1;
        this.d = l8r0Var;
        this.e = h8r0Var;
        this.f = k8r0Var;
    }

    public final Object Y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                h5r0 h5r0Var = new h5r0((lnm) obj6, (byte) 0);
                h5r0Var.b = (yvg1) obj;
                h5r0Var.d = (gd80) obj2;
                h5r0Var.e = (gd80) obj3;
                h5r0Var.f = (List) obj4;
                h5r0Var.c = (yvg1) obj5;
                return h5r0Var.invokeSuspend(rih1Var);
            case 1:
                h5r0 h5r0Var2 = new h5r0((l8r0) this.d, (h8r0) this.e, (k8r0) this.f, (lnm) obj6);
                h5r0Var2.b = (yvg1) obj3;
                h5r0Var2.c = (x440) obj4;
                return h5r0Var2.invokeSuspend(rih1Var);
            default:
                h5r0 h5r0Var3 = new h5r0((lnm) obj6, (byte) 2);
                h5r0Var3.b = (Map) obj;
                h5r0Var3.c = (Map) obj2;
                h5r0Var3.d = (String) obj3;
                h5r0Var3.e = (Set) obj4;
                h5r0Var3.f = (Map) obj5;
                return h5r0Var3.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                yvg1 yvg1Var = (yvg1) this.b;
                gd80 gd80Var = (gd80) this.d;
                gd80 gd80Var2 = (gd80) this.e;
                List list = (List) this.f;
                yvg1 yvg1Var2 = (yvg1) this.c;
                hm5.M(obj);
                return new g5r0((List) yvg1Var.a, gd80Var, (List) yvg1Var.b, gd80Var2, list, (String) yvg1Var.c, (List) yvg1Var2.a, (List) yvg1Var2.b, (List) yvg1Var2.c);
            case 1:
                yvg1 yvg1Var3 = (yvg1) this.b;
                x440 x440Var = (x440) this.c;
                hm5.M(obj);
                return new k8r0(((Boolean) yvg1Var3.a).booleanValue(), (x440Var instanceof r440) || (x440Var instanceof w440) || (x440Var instanceof q440), ((Boolean) yvg1Var3.b).booleanValue(), ((Boolean) yvg1Var3.c).booleanValue());
            default:
                Map map = (Map) this.b;
                Map map2 = (Map) this.c;
                String str = (String) this.d;
                Set set = (Set) this.e;
                Map map3 = (Map) this.f;
                hm5.M(obj);
                return new mr01(map, map2, str, set, map3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h5r0(lnm lnmVar, byte b) {
        super(6, lnmVar);
        this.a = b;
    }
}
