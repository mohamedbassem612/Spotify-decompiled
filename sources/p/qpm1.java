package p;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qpm1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public final /* synthetic */ rpm1 c;
    public final /* synthetic */ List d;
    public final /* synthetic */ ppm1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qpm1(ppm1 ppm1Var, rpm1 rpm1Var, List list, lnm lnmVar) {
        super(2, lnmVar);
        this.e = ppm1Var;
        this.c = rpm1Var;
        this.d = list;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ppm1 ppm1Var = this.e;
        List list = this.d;
        rpm1 rpm1Var = this.c;
        switch (b) {
            case 0:
                return new qpm1(ppm1Var, rpm1Var, list, lnmVar);
            default:
                return new qpm1(rpm1Var, list, ppm1Var, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        tv80 zxc0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ppm1 ppm1Var = this.e;
        List list = this.d;
        rpm1 rpm1Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
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
                zxc0Var = ppm1Var != null ? new zxc0(ppm1Var.a.a) : null;
                this.b = true;
                xyc0 xyc0Var = rpm1Var.a;
                List list2 = list;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    String str = (String) obj2;
                    Set set = s4b1.f;
                    if (uic.x(str).c == blc0.Pg || uic.x(str).c == blc0.ed) {
                        arrayList.add(obj2);
                    }
                }
                return xyc0Var.d("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt", arrayList, "your-episodes-content", "your-episodes-content", zxc0Var, this) == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    zxc0Var = ppm1Var != null ? ppm1Var.a : null;
                    this.b = true;
                    return rpm1Var.a.l("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt", list, this, zxc0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (z2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qpm1(rpm1 rpm1Var, List list, ppm1 ppm1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = rpm1Var;
        this.d = list;
        this.e = ppm1Var;
    }
}
