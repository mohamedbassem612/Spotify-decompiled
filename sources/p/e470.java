package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e470 extends hab0 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e470(hob1 hob1Var, j2i j2iVar, Function0 function0, Function0 function1, j2i j2iVar2, qim0 qim0Var, vu30 vu30Var, float f, vu30 vu30Var2, int i) {
        super(2);
        this.a = (byte) 1;
        this.e = hob1Var;
        this.f = j2iVar;
        this.g = function0;
        this.h = function1;
        this.i = j2iVar2;
        this.b = qim0Var;
        this.t = vu30Var;
        this.c = f;
        this.X = vu30Var2;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        Object obj3 = this.b;
        Object obj4 = this.X;
        Object obj5 = this.t;
        Object obj6 = this.i;
        Object obj7 = this.h;
        Object obj8 = this.g;
        Object obj9 = this.f;
        Object obj10 = this.e;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                float f = this.c;
                puo1.d((s370) obj10, (c380) obj9, (upb0) obj8, (wgh1) obj7, (zzq0) obj6, f, (dh30) obj5, (mev) obj4, (qim0) obj3, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                float f2 = this.c;
                u2o1.d((hob1) obj10, (j2i) obj9, (Function0) obj8, (Function0) obj7, (j2i) obj6, (qim0) obj3, (vu30) obj5, f2, (vu30) obj4, (b0k) obj, iP2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                float f3 = this.c;
                acf1.e((i2c) obj10, (j7s) obj9, (rk41) obj8, (Integer) obj7, (Integer) obj6, f3, (iu30) obj5, (iu30) obj4, (Function0) obj3, (b0k) obj, iP3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e470(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, float f, Object obj6, Object obj7, Object obj8, int i, byte b) {
        super(2);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
        this.i = obj5;
        this.c = f;
        this.t = obj6;
        this.X = obj7;
        this.b = obj8;
        this.d = i;
    }
}
