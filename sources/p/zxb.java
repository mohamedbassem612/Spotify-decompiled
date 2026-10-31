package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zxb implements vu30 {
    public final /* synthetic */ j2i X;
    public final /* synthetic */ xu30 Y;
    public final /* synthetic */ iyb a;
    public final /* synthetic */ j2i b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ hw61 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;
    public final /* synthetic */ float i;
    public final /* synthetic */ vu30 t;

    public zxb(iyb iybVar, j2i j2iVar, float f, float f2, boolean z, hw61 hw61Var, long j, long j2, float f3, vu30 vu30Var, j2i j2iVar2, xu30 xu30Var) {
        this.a = iybVar;
        this.b = j2iVar;
        this.c = f;
        this.d = f2;
        this.e = z;
        this.f = hw61Var;
        this.g = j;
        this.h = j2;
        this.i = f3;
        this.t = vu30Var;
        this.X = j2iVar2;
        this.Y = xu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            iyb iybVar = this.a;
            vy71 vy71Var = iybVar.a;
            j2i j2iVarR = apo.r(-519581786, new xxb(this.c, this.b), x340Var2);
            j2i j2iVarR2 = apo.r(-815624571, new yxb(this.a, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X), x340Var2);
            j2i j2iVarR3 = apo.r(-1111667356, new ek1(this.Y, iybVar, (byte) 3), x340Var2);
            boolean zG = x340Var2.g(iybVar);
            Object objT = x340Var2.T();
            if (zG || objT == fkj0.X) {
                objT = new hx4(iybVar, (byte) 9);
                x340Var2.s0(objT);
            }
            t890.b(j2iVarR, j2iVarR2, j2iVarR3, (Function0) objT, vy71Var, x340Var2, 3504);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
