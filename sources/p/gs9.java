package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gs9 extends hab0 implements xu30 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ j2i d;
    public final /* synthetic */ j2i e;
    public final /* synthetic */ j2i f;
    public final /* synthetic */ j2i g;
    public final /* synthetic */ j2i h;
    public final /* synthetic */ j2i i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs9(int i, iu30 iu30Var, Function0 function0, j2i j2iVar, j2i j2iVar2, j2i j2iVar3, j2i j2iVar4, j2i j2iVar5, j2i j2iVar6) {
        super(3);
        this.a = i;
        this.b = iu30Var;
        this.c = function0;
        this.d = j2iVar;
        this.e = j2iVar2;
        this.f = j2iVar3;
        this.g = j2iVar4;
        this.h = j2iVar5;
        this.i = j2iVar6;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        iu30 iu30Var = (iu30) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.i(iu30Var) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            int i = this.a;
            iu30 iu30Var2 = this.b;
            if (i == 1) {
                x340Var2.i0(-125751157);
                boolean zG = x340Var2.g(iu30Var2);
                Object objT = x340Var2.T();
                if (zG || objT == m4cVar) {
                    objT = new nc8(iu30Var2, (byte) 10);
                    x340Var2.s0(objT);
                }
                l3p1.l(0, (Function0) objT, x340Var2, null);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-125639898);
                boolean zG2 = x340Var2.g(iu30Var2);
                Object objT2 = x340Var2.T();
                if (zG2 || objT2 == m4cVar) {
                    objT2 = new nc8(iu30Var2, (byte) 11);
                    x340Var2.s0(objT2);
                }
                l3p1.j((Function0) objT2, this.c, this.d, this.e, this.f, this.g, this.h, this.i, iu30Var, null, x340Var2, (iIntValue << 24) & 234881024);
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
