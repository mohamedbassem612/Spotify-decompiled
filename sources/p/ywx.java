package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ywx extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ywx(float f, ksg ksgVar, List list, boolean z, swx swxVar, zwx zwxVar, int i, int i2) {
        super(2);
        this.b = f;
        this.e = ksgVar;
        this.f = list;
        this.c = z;
        this.g = swxVar;
        this.h = zwxVar;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int i = this.d;
                int iP = czo1.p(1);
                float f = this.b;
                boolean z = this.c;
                guo1.j(f, (ksg) obj6, (List) obj5, z, (swx) obj4, (zwx) obj3, i, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(this.d | 1);
                float f2 = this.b;
                boolean z2 = this.c;
                pvm1.a((ovm1) obj6, (me10) obj5, (ke10) obj4, f2, z2, (iu30) obj3, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ywx(ovm1 ovm1Var, me10 me10Var, ke10 ke10Var, float f, boolean z, iu30 iu30Var, int i) {
        super(2);
        this.e = ovm1Var;
        this.f = me10Var;
        this.g = ke10Var;
        this.b = f;
        this.c = z;
        this.h = iu30Var;
        this.d = i;
    }
}
