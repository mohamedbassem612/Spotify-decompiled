package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class omg0 extends hab0 implements vu30 {
    public final /* synthetic */ Function0 X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ int a;
    public final /* synthetic */ vu30 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ vu30 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ String g;
    public final /* synthetic */ gbx h;
    public final /* synthetic */ String i;
    public final /* synthetic */ yae1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public omg0(int i, vu30 vu30Var, int i2, boolean z, vu30 vu30Var2, int i3, String str, gbx gbxVar, String str2, yae1 yae1Var, Function0 function0, boolean z2) {
        super(2);
        this.a = i;
        this.b = vu30Var;
        this.c = i2;
        this.d = z;
        this.e = vu30Var2;
        this.f = i3;
        this.g = str;
        this.h = gbxVar;
        this.i = str2;
        this.t = yae1Var;
        this.X = function0;
        this.Y = z2;
    }

    public final Object invoke(Object obj, Object obj2) {
        q5t0 q5t0VarH;
        int i;
        q5t0 q5t0VarH2;
        yvg1 yvg1Var;
        int i2;
        q5t0 q5t0VarH3;
        long j;
        int i3;
        q5t0 q5t0Var;
        q5t0 q5t0VarH4;
        q5t0 q5t0VarH5;
        boolean z;
        int i4;
        tlc1 tlc1Var = (tlc1) obj;
        long j2 = ((hjl) obj2).a;
        int iMin = Math.min(this.a, hjl.h(j2));
        q5t0 q5t0VarH6 = null;
        vu30 vu30Var = this.b;
        if (vu30Var != null) {
            afh0 afh0Var = (afh0) o7h.s0(tlc1Var.P(i61.g, new j2i(-1057198570, new k7f((byte) 21, vu30Var, false), true)));
            q5t0VarH6 = afh0Var != null ? afh0Var.H(hjl.b(j2, 0, 0, 0, 0, 10)) : null;
        }
        int i5 = q5t0VarH6 != null ? q5t0VarH6.b : 0;
        int i6 = this.c;
        int i7 = q5t0VarH6 != null ? i6 : 0;
        q5t0 q5t0VarH7 = this.d ? ((afh0) o7h.q0(tlc1Var.P(i61.h, lzi.a))).H(hjl.b(j2, 0, 0, 0, 0, 10)) : null;
        int i8 = hjl.i(j2) - (q5t0VarH7 != null ? q5t0VarH7.a : 0);
        int i9 = i8 < 0 ? 0 : i8;
        long jB = hjl.b(j2, 0, i9, 0, 0, 8);
        q5t0 q5t0VarH8 = ((afh0) o7h.q0(tlc1Var.P(i61.b, new j2i(-463016236, new y5d0(this.i, (byte) 17), true)))).H(jB);
        int i10 = this.f;
        vu30 vu30Var2 = this.e;
        int i11 = vu30Var2 != null ? i10 : 0;
        if (vu30Var2 == null) {
            i6 = 0;
        }
        int i12 = iMin - ((q5t0VarH8.b + i5) + i7);
        if (i12 < 0) {
            i12 = 0;
        }
        String str = this.g;
        if (str != null) {
            q5t0VarH = ((afh0) o7h.q0(tlc1Var.P(i61.c, new j2i(2019082716, new y5d0(str, (byte) 16), true)))).H(jB);
        } else {
            q5t0VarH = null;
        }
        int i13 = q5t0VarH != null ? q5t0VarH.b : 0;
        boolean z2 = i12 - i13 >= i11 + i6;
        if (i13 <= i12 && z2) {
            yvg1Var = new yvg1(q5t0VarH, Integer.valueOf(i13), Boolean.valueOf(vu30Var2 != 0));
        } else if (i13 <= i12 && vu30Var2 != 0) {
            if (i10 > 0) {
                int i14 = i12 / i10;
                if (i14 < 1) {
                    i14 = 1;
                }
                i2 = i14;
            } else {
                i2 = Integer.MAX_VALUE;
            }
            if (str != null) {
                q5t0VarH3 = ((afh0) o7h.q0(tlc1Var.P(i61.d, new j2i(705670611, new nmg0(str, i2, i9, this.t, this.X, (byte) 0), true)))).H(jB);
            } else {
                q5t0VarH3 = null;
            }
            yvg1Var = new yvg1(q5t0VarH3, Integer.valueOf(q5t0VarH3 != null ? q5t0VarH3.b : 0), Boolean.FALSE);
        } else if (i13 <= i12) {
            yvg1Var = new yvg1(q5t0VarH, Integer.valueOf(i13), Boolean.FALSE);
        } else {
            if (i10 > 0) {
                int i15 = i12 / i10;
                if (i15 < 1) {
                    i15 = 1;
                }
                i = i15;
            } else {
                i = Integer.MAX_VALUE;
            }
            if (str != null) {
                q5t0VarH2 = ((afh0) o7h.q0(tlc1Var.P(i61.e, new j2i(-850607417, new nmg0(str, i, i9, this.t, this.X, (byte) 1), true)))).H(jB);
            } else {
                q5t0VarH2 = null;
            }
            yvg1Var = new yvg1(q5t0VarH2, Integer.valueOf(q5t0VarH2 != null ? q5t0VarH2.b : 0), Boolean.FALSE);
        }
        q5t0 q5t0Var2 = (q5t0) yvg1Var.a;
        int iIntValue = ((Number) yvg1Var.b).intValue();
        boolean zBooleanValue = ((Boolean) yvg1Var.c).booleanValue();
        int i16 = q5t0VarH8.b + iIntValue;
        gbx gbxVar = this.h;
        if (gbxVar != null) {
            afh0 afh0Var2 = (afh0) o7h.q0(tlc1Var.P(i61.a, new j2i(538270550, new mmg0(gbxVar, (byte) 0), true)));
            int i17 = hjl.i(j2);
            i3 = 0;
            q5t0Var = q5t0VarH8;
            j = j2;
            q5t0VarH4 = afh0Var2.H(hjl.b(j, i17, 0, i16, i16, 2));
        } else {
            j = j2;
            i3 = 0;
            q5t0Var = q5t0VarH8;
            q5t0VarH4 = null;
        }
        int i18 = i12 - iIntValue;
        if (zBooleanValue) {
            int i19 = i18 - i6;
            int i20 = i19 < 0 ? i3 : i19;
            if (i10 > 0) {
                i4 = i20 / i10;
                z = true;
                if (i4 < 1) {
                    i4 = 1;
                }
            } else {
                z = true;
                i4 = Integer.MAX_VALUE;
            }
            q5t0VarH5 = ((afh0) o7h.q0(tlc1Var.P(i61.f, new j2i(1563994977, new se5(i4, vu30Var2, this.Y), z)))).H(hjl.b(j, 0, 0, 0, i20, 2));
        } else {
            q5t0VarH5 = null;
        }
        int i21 = q5t0VarH5 != null ? q5t0VarH5.b : i3;
        int i22 = q5t0VarH5 != null ? i6 : i3;
        int i23 = q5t0Var.b + iIntValue + i21 + i22 + i7 + i5;
        int i24 = i23 > iMin ? iMin : i23;
        return tlc1Var.S(hjl.i(j), i24, b7x.a, new lmg0(q5t0VarH4, q5t0Var, q5t0Var2, q5t0VarH7, iIntValue, q5t0VarH5, q5t0VarH6, j, i22, i21, i24, i5));
    }
}
