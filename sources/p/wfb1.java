package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wfb1 extends hab0 implements xu30 {
    public final /* synthetic */ xu30 N0;
    public final /* synthetic */ xu30 O0;
    public final /* synthetic */ xu30 P0;
    public final /* synthetic */ xu30 X;
    public final /* synthetic */ xu30 Y;
    public final /* synthetic */ xu30 Z;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ j8e0 b;
    public final /* synthetic */ uw9 c;
    public final /* synthetic */ xu30 d;
    public final /* synthetic */ mta e;
    public final /* synthetic */ xu30 f;
    public final /* synthetic */ xu30 g;
    public final /* synthetic */ xu30 h;
    public final /* synthetic */ xu30 i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wfb1(boolean z, j8e0 j8e0Var, uw9 uw9Var, xu30 xu30Var, mta mtaVar, xu30 xu30Var2, xu30 xu30Var3, xu30 xu30Var4, xu30 xu30Var5, boolean z2, xu30 xu30Var6, xu30 xu30Var7, xu30 xu30Var8, xu30 xu30Var9, xu30 xu30Var10, xu30 xu30Var11) {
        super(3);
        this.a = z;
        this.b = j8e0Var;
        this.c = uw9Var;
        this.d = xu30Var;
        this.e = mtaVar;
        this.f = xu30Var2;
        this.g = xu30Var3;
        this.h = xu30Var4;
        this.i = xu30Var5;
        this.t = z2;
        this.X = xu30Var6;
        this.Y = xu30Var7;
        this.Z = xu30Var8;
        this.N0 = xu30Var9;
        this.O0 = xu30Var10;
        this.P0 = xu30Var11;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        iu30 iu30Var = (iu30) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.i(iu30Var) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            vjx vjxVar = vjx.c;
            boolean z = (iIntValue & 14) == 4;
            Object objT = x340Var2.T();
            if (z || objT == fkj0.X) {
                objT = new pba1(iu30Var, (byte) 11);
                x340Var2.s0(objT);
            }
            puo1.c(u291.d(nim0.a, 1.0f), new n9d1(1, (Function0) objT, vjxVar), (n9d1) null, this.a, apo.r(1903030321, new vfb1(this.b, this.c, this.d, this.e, iu30Var, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, this.O0, this.P0), x340Var2), x340Var2, 24582, 4);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
