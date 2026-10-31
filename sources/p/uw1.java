package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uw1 extends hab0 implements dv30 {
    public final /* synthetic */ fu1 a;
    public final /* synthetic */ kw1 b;
    public final /* synthetic */ jw1 c;
    public final /* synthetic */ ow1 d;
    public final /* synthetic */ iu30 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw1(fu1 fu1Var, kw1 kw1Var, jw1 jw1Var, ow1 ow1Var, iu30 iu30Var) {
        super(6);
        this.a = fu1Var;
        this.b = kw1Var;
        this.c = jw1Var;
        this.d = ow1Var;
        this.e = iu30Var;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00dd  */
    public final Object Y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i;
        su1 su1Var = (su1) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        Function0 function0 = (Function0) obj3;
        Function0 function1 = (Function0) obj4;
        x340 x340Var = (b0k) obj5;
        int iIntValue = ((Number) obj6).intValue();
        vo1 vo1Var = su1Var.b;
        if ((iIntValue & 6) == 0) {
            i = ((iIntValue & 8) == 0 ? x340Var.g(su1Var) : x340Var.i(su1Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= x340Var.h(zBooleanValue) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(function0) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i |= x340Var.i(function1) ? 2048 : 1024;
        }
        x340 x340Var2 = x340Var;
        if (!x340Var2.Y(i & 1, (i & 9363) != 9362)) {
            x340Var2.b0();
        } else if (u890.j(vo1Var, qn31.a)) {
            x340Var2.i0(1539079672);
            fu1 fu1Var = this.a;
            j2i j2iVarR = apo.r(-1453387613, new tw1(su1Var, fu1Var), x340Var2);
            int i2 = i << 12;
            v9p1.b(fu1Var, this.b, this.c, this.d, this.e, zBooleanValue, function0, function1, j2iVarR, x340Var2, (458752 & i2) | 100663296 | (3670016 & i2) | (i2 & 29360128));
            x340Var2.r(false);
        } else {
            p030 p030Var = vo1Var instanceof p030 ? (p030) vo1Var : null;
            if (u890.j(p030Var != null ? p030Var.b : null, "atp")) {
                x340Var2.i0(1539079672);
                fu1 fu1Var2 = this.a;
                j2i j2iVarR2 = apo.r(-1453387613, new tw1(su1Var, fu1Var2), x340Var2);
                int i3 = i << 12;
                v9p1.b(fu1Var2, this.b, this.c, this.d, this.e, zBooleanValue, function0, function1, j2iVarR2, x340Var2, (458752 & i3) | 100663296 | (3670016 & i3) | (i3 & 29360128));
                x340Var2.r(false);
            } else if (u890.j(vo1Var, u7c0.a)) {
                x340Var2.i0(1539435087);
                j2i j2iVar = q4i.a;
                x340Var2.i0(1539640431);
                v9p1.d(function0, j2iVar, x340Var2, ((i >> 6) & 14) | 48);
                x340Var2.r(false);
                x340Var2.r(false);
            } else {
                x340Var2.i0(1539760866);
                x340Var2.r(false);
            }
        }
        return rih1.a;
    }
}
