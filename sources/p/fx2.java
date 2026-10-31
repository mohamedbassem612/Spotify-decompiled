package p;

import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fx2 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public boolean b;
    public final /* synthetic */ boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx2(gx2 gx2Var, tt2 tt2Var, String str, boolean z, String str2, dt2 dt2Var, us2 us2Var, String str3, lnm lnmVar) {
        super(2, lnmVar);
        this.d = gx2Var;
        this.e = tt2Var;
        this.f = str;
        this.c = z;
        this.g = str2;
        this.i = dt2Var;
        this.t = us2Var;
        this.h = str3;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        Object obj3 = this.t;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.f;
        switch (b) {
            case 0:
                return new fx2((gx2) this.d, (tt2) obj2, (String) obj7, this.c, (String) obj6, (dt2) obj4, (us2) obj3, (String) obj5, lnmVar);
            case 1:
                boolean z = this.c;
                fx2 fx2Var = new fx2(this.e, lnmVar, (rm5) obj7, (dg8) obj6, (kba) obj5, (kt91) obj4, (yqg) obj3, z);
                fx2Var.d = obj;
                return fx2Var;
            default:
                return new fx2((yjq) this.d, (List) obj2, this.c, (String) obj7, (String) obj6, (kio) obj5, (gj3) obj4, (o8n) obj3, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) throws Exception {
        Object objY;
        byte b = this.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        d9n d9nVar = d9n.a;
        Object obj6 = this.t;
        Object obj7 = this.e;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                wr2 wr2Var = ((gx2) this.d).a;
                this.b = true;
                Object objB = wr2Var.b((tt2) obj7, (String) obj5, this.c, (String) obj4, (dt2) obj2, (us2) obj6, (String) obj3, this);
                return objB == d9nVar ? d9nVar : objB;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.d = null;
                    this.b = true;
                    if (jik.e((vr20) this.d, (vfk) obj7, (rm5) obj5, (dg8) obj4, (kba) obj3, (kt91) obj2, (yqg) obj6, this.c, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            default:
                yjq yjqVar = (yjq) this.d;
                o8n o8nVar = (o8n) obj6;
                boolean z3 = this.b;
                try {
                    if (!z3) {
                        hm5.M(obj);
                        qut0 qut0Var = (qut0) yjqVar.e;
                        String str = (String) o7h.q0((List) obj7);
                        ((upp0) qut0Var.b.get()).getClass();
                        if (upp0.b(str)) {
                            return yjqVar.H(this.c);
                        }
                        this.b = true;
                        objY = yjqVar.y((List) obj7, (String) obj5, (String) obj4, this.c, (kio) obj3, (gj3) obj2, this);
                        if (objY == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z3) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objY = obj;
                    }
                    return (nj3) objY;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    if (!op71.C(o8nVar)) {
                        n57.t("Curation mutation failed after caller cancellation", e2);
                        op71.x(o8nVar);
                    }
                    throw e2;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx2(Object obj, lnm lnmVar, rm5 rm5Var, dg8 dg8Var, kba kbaVar, kt91 kt91Var, yqg yqgVar, boolean z) {
        super(2, lnmVar);
        this.e = obj;
        this.f = rm5Var;
        this.g = dg8Var;
        this.h = kbaVar;
        this.i = kt91Var;
        this.t = yqgVar;
        this.c = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx2(yjq yjqVar, List list, boolean z, String str, String str2, kio kioVar, gj3 gj3Var, o8n o8nVar, lnm lnmVar) {
        super(2, lnmVar);
        this.d = yjqVar;
        this.e = list;
        this.c = z;
        this.f = str;
        this.g = str2;
        this.h = kioVar;
        this.i = gj3Var;
        this.t = o8nVar;
    }
}
