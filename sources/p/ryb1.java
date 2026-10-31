package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ryb1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ryb1(j2i j2iVar, iu30 iu30Var, i8h1 i8h1Var, l6h1 l6h1Var, gw70 gw70Var, op80 op80Var, int i) {
        super(2);
        this.a = (byte) 0;
        this.c = j2iVar;
        this.d = iu30Var;
        this.e = i8h1Var;
        this.f = l6h1Var;
        this.g = gw70Var;
        this.h = op80Var;
        this.b = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.b;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                xfo1.j((j2i) obj8, (iu30) obj7, (i8h1) obj6, (l6h1) obj5, (gw70) obj4, (op80) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                ajo1.p((cce) obj8, (o0i) obj7, (ubc1) obj6, (Function0) obj5, (dfn0) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP = czo1.p(1);
                int i2 = this.b;
                tto1.g((jxc1) obj8, i2, (String) obj7, (String) obj6, (dzo1) obj5, (qim0) obj4, (Function0) obj3, (b0k) obj, iP);
                break;
            case 3:
                ((Number) obj2).intValue();
                fae1.h((nue1) obj8, (ggv) obj6, (qim0) obj5, (sm51) obj4, (zge1) obj3, (iu30) obj7, (b0k) obj, czo1.p(i | 1));
                break;
            default:
                ((Number) obj2).intValue();
                s1p1.r((zdj1) obj8, (Function0) obj7, (Function0) obj6, (Function0) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ryb1(Object obj, Object obj2, Object obj3, Function0 function0, Object obj4, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = function0;
        this.g = obj4;
        this.h = qim0Var;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ryb1(jxc1 jxc1Var, int i, String str, String str2, dzo1 dzo1Var, qim0 qim0Var, Function0 function0, int i2) {
        super(2);
        this.a = (byte) 2;
        this.c = jxc1Var;
        this.b = i;
        this.d = str;
        this.e = str2;
        this.f = dzo1Var;
        this.g = qim0Var;
        this.h = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ryb1(nue1 nue1Var, ggv ggvVar, qim0 qim0Var, sm51 sm51Var, zge1 zge1Var, iu30 iu30Var, int i) {
        super(2);
        this.a = (byte) 3;
        this.c = nue1Var;
        this.e = ggvVar;
        this.f = qim0Var;
        this.g = sm51Var;
        this.h = zge1Var;
        this.d = iu30Var;
        this.b = i;
    }
}
