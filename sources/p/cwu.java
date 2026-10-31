package p;

import android.util.LruCache;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cwu extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwu(int i, List list, iu30 iu30Var, un60 un60Var, iu30 iu30Var2, boolean z, boolean z2, vn60 vn60Var, ven0 ven0Var) {
        super(1);
        this.d = list;
        this.e = iu30Var;
        this.f = un60Var;
        this.g = iu30Var2;
        this.b = z;
        this.c = z2;
        this.h = vn60Var;
        this.i = ven0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        boolean z = this.b;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.d;
        Object obj7 = this.e;
        switch (b) {
            case 0:
                i1z i1zVar = (i1z) obj7;
                suu suuVar = (suu) obj5;
                yjq yjqVar = (yjq) obj6;
                if (!z) {
                    xab1 xab1VarT = fn31.T(cto1.q((dg30) yjqVar.c), (o8n) null, 0, new ett(suuVar, (lnm) null, (byte) 4), 3);
                    lik1 lik1Var = (lik1) obj3;
                    drj0 drj0Var = (drj0) obj2;
                    boolean z2 = this.c;
                    suuVar.b(i1zVar.A, (v1v) obj4, new bwu(xab1VarT, yjqVar, i1zVar, lik1Var, drj0Var, z2), new bwu(xab1VarT, yjqVar, lik1Var, i1zVar, drj0Var, z2));
                } else {
                    ((drp0) yjqVar.f).g(5, i1zVar.a);
                }
                break;
            case 1:
                ven0 ven0Var = (ven0) obj5;
                if (((wz20) obj).b()) {
                    ven0Var.setValue(Boolean.TRUE);
                    fn31.T((c9n) obj6, (o8n) null, 0, new xtz((tob1) obj4, (j5c) obj3, (icr0) obj2, (lnm) null, (byte) 2), 3);
                } else if (((Boolean) ven0Var.getValue()).booleanValue() && !z && !this.c) {
                    ((Function0) obj7).invoke();
                }
                break;
            case 2:
                List list = (List) obj6;
                ((rtb0) obj).e(list.size(), (iu30) null, new xg50(list, (byte) 8), new j2i(2039820996, new ylh(list, new j2i(1376947395, new co60((iu30) obj7, (un60) obj5, (iu30) obj4, this.b, this.c, (vn60) obj3, (ven0) obj2), true), (byte) 1), true));
                break;
            default:
                epb0 epb0Var = (epb0) obj;
                if (z) {
                    epb0.Q(epb0Var, (Object) null, (Object) null, new j2i(175874029, new oa5((Function0) obj7, (byte) 11), true), 7);
                }
                List list2 = (List) obj6;
                epb0Var.R(list2.size(), new ehf0(list2, (byte) 12), (vu30) null, new ehf0(list2, (byte) 13), new j2i(-1117249557, new ymh(list2, (List) obj5, (LruCache) obj4, (q8n) obj3, this.c, (iu30) obj2), true));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwu(c9n c9nVar, boolean z, boolean z2, Function0 function0, ven0 ven0Var, tob1 tob1Var, j5c j5cVar, icr0 icr0Var) {
        super(1);
        this.d = c9nVar;
        this.b = z;
        this.c = z2;
        this.e = function0;
        this.f = ven0Var;
        this.g = tob1Var;
        this.h = j5cVar;
        this.i = icr0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwu(boolean z, List list, Function0 function0, List list2, LruCache lruCache, q8n q8nVar, boolean z2, iu30 iu30Var) {
        super(1);
        this.b = z;
        this.d = list;
        this.e = function0;
        this.f = list2;
        this.g = lruCache;
        this.h = q8nVar;
        this.c = z2;
        this.i = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwu(boolean z, yjq yjqVar, i1z i1zVar, suu suuVar, v1v v1vVar, lik1 lik1Var, drj0 drj0Var, boolean z2) {
        super(1);
        this.b = z;
        this.d = yjqVar;
        this.e = i1zVar;
        this.f = suuVar;
        this.g = v1vVar;
        this.h = lik1Var;
        this.i = drj0Var;
        this.c = z2;
    }
}
