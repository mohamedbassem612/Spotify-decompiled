package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xel1 extends hab0 implements xu30 {
    public final /* synthetic */ ven0 X;
    public final /* synthetic */ byte a;
    public final /* synthetic */ yqg b;
    public final /* synthetic */ dok0 c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ iu30 i;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xel1(yqg yqgVar, dok0 dok0Var, iu30 iu30Var, int i, int i2, int i3, int i4, iu30 iu30Var2, int i5, ven0 ven0Var, byte b) {
        super(3);
        this.a = b;
        this.b = yqgVar;
        this.c = dok0Var;
        this.d = iu30Var;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = iu30Var2;
        this.t = i5;
        this.X = ven0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object vel1Var;
        hdl1 hdl1Var;
        iu30 iu30Var;
        Object vel1Var2;
        hdl1 hdl1Var2;
        iu30 iu30Var2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.t;
        int i2 = this.h;
        int i3 = this.g;
        int i4 = this.f;
        int i5 = this.e;
        iu30 iu30Var3 = this.d;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                dok0 dok0Var = this.c;
                hdl1 hdl1Var3 = dok0Var.a.c;
                x340 x340Var = (b0k) obj2;
                boolean zG = x340Var.g(iu30Var3);
                Object objT = x340Var.T();
                if (zG || objT == m4cVar) {
                    objT = new izj1(iu30Var3, (byte) 29);
                    x340Var.s0(objT);
                }
                Function0 function0 = (Function0) objT;
                boolean zE = x340Var.e(i2) | x340Var.e(i3) | x340Var.e(i4) | x340Var.e(i5) | x340Var.i(dok0Var);
                iu30 iu30Var4 = this.i;
                boolean zE2 = x340Var.e(i) | zE | x340Var.g(iu30Var4);
                Object objT2 = x340Var.T();
                if (zE2 || objT2 == m4cVar) {
                    hdl1Var = hdl1Var3;
                    vel1Var = new vel1(this.e, this.f, this.g, this.h, this.X, dok0Var, iu30Var4, this.t, (byte) 0);
                    iu30Var = iu30Var4;
                    x340Var.s0(vel1Var);
                } else {
                    vel1Var = objT2;
                    iu30Var = iu30Var4;
                    hdl1Var = hdl1Var3;
                }
                iu30 iu30Var5 = (iu30) vel1Var;
                boolean zG2 = x340Var.g(iu30Var);
                Object objT3 = x340Var.T();
                if (zG2 || objT3 == m4cVar) {
                    objT3 = new wel1(iu30Var, (byte) 0);
                    x340Var.s0(objT3);
                }
                v8r.i(this.b, hdl1Var, function0, iu30Var5, (qim0) null, (Function0) objT3, x340Var, 0);
                break;
            default:
                ((Number) obj3).intValue();
                m4c m4cVar2 = fkj0.X;
                dok0 dok0Var2 = this.c;
                hdl1 hdl1Var4 = dok0Var2.a.c;
                x340 x340Var2 = (b0k) obj2;
                boolean zG3 = x340Var2.g(iu30Var3);
                Object objT4 = x340Var2.T();
                if (zG3 || objT4 == m4cVar2) {
                    objT4 = new wel1(iu30Var3, (byte) 2);
                    x340Var2.s0(objT4);
                }
                Function0 function1 = (Function0) objT4;
                boolean zE3 = x340Var2.e(i2) | x340Var2.e(i3) | x340Var2.e(i4) | x340Var2.e(i5) | x340Var2.i(dok0Var2);
                iu30 iu30Var6 = this.i;
                boolean zE4 = x340Var2.e(i) | zE3 | x340Var2.g(iu30Var6);
                Object objT5 = x340Var2.T();
                if (zE4 || objT5 == m4cVar2) {
                    hdl1Var2 = hdl1Var4;
                    vel1Var2 = new vel1(this.e, this.f, this.g, this.h, this.X, dok0Var2, iu30Var6, this.t, (byte) 1);
                    iu30Var2 = iu30Var6;
                    x340Var2.s0(vel1Var2);
                } else {
                    vel1Var2 = objT5;
                    iu30Var2 = iu30Var6;
                    hdl1Var2 = hdl1Var4;
                }
                iu30 iu30Var7 = (iu30) vel1Var2;
                boolean zG4 = x340Var2.g(iu30Var2);
                Object objT6 = x340Var2.T();
                if (zG4 || objT6 == m4cVar2) {
                    objT6 = new wel1(iu30Var2, (byte) 3);
                    x340Var2.s0(objT6);
                }
                v8r.i(this.b, hdl1Var2, function1, iu30Var7, (qim0) null, (Function0) objT6, x340Var2, 0);
                break;
        }
        return rih1Var;
    }
}
