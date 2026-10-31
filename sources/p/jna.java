package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jna extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jna(String str, long j, Long l, loj1 loj1Var, String str2, String str3) {
        super(3);
        this.a = (byte) 0;
        this.c = str;
        this.b = j;
        this.f = l;
        this.g = loj1Var;
        this.d = str2;
        this.e = str3;
    }

    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v6 */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ?? r14;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.g;
        Object obj5 = this.c;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        switch (b) {
            case 0:
                loj1 loj1Var = (loj1) obj4;
                return new dia((i3i0) obj, (xcu0) obj2, (n900) obj3, new eia((String) obj5, this.b, (Long) obj6, loj1Var != null ? loj1Var.a : 0L, loj1Var != null ? loj1Var.b : 0L, (String) obj8, (String) obj7));
            case 1:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                w6e0 w6e0Var = (w6e0) obj4;
                iu30 iu30Var = (iu30) obj7;
                j1e1.f(null, this.b, x340Var, 0, 1);
                vbe.o((es41) obj5, (vzq0) obj, (qze0) obj8, iu30Var, (jqp) obj6, w6e0Var, x340Var, (iIntValue << 3) & 112);
                qze0 qze0Var = (qze0) obj8;
                if (qze0Var.g == 3) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(116647514);
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == m4cVar) {
                        objT = new ijd0(iu30Var, (byte) 23);
                        x340Var2.s0(objT);
                    }
                    dro.l((Function0) objT, x340Var2, 0);
                    x340Var2.r(false);
                } else {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(116741692);
                    x340Var3.r(false);
                }
                if (qze0Var.g != 2 || qze0Var.h) {
                    x340 x340Var4 = x340Var;
                    x340Var4.i0(117385500);
                    x340Var4.r(false);
                } else {
                    x340 x340Var5 = x340Var;
                    x340Var5.i0(116872326);
                    boolean zI = x340Var5.i(w6e0Var) | x340Var5.g(iu30Var) | x340Var5.i(qze0Var);
                    Object objT2 = x340Var5.T();
                    if (zI || objT2 == m4cVar) {
                        objT2 = new vze0(w6e0Var, iu30Var, qze0Var);
                        x340Var5.s0(objT2);
                    }
                    Function0 function0 = (Function0) objT2;
                    boolean zI2 = x340Var5.i(w6e0Var) | x340Var5.g(iu30Var);
                    Object objT3 = x340Var5.T();
                    if (zI2 || objT3 == m4cVar) {
                        r14 = 0;
                        objT3 = new xze0(w6e0Var, iu30Var, (byte) 0);
                        x340Var5.s0(objT3);
                    } else {
                        r14 = 0;
                    }
                    vbe.l(w6e0Var, function0, (Function0) objT3, x340Var5, (int) r14);
                    x340Var5.r((boolean) r14);
                }
                return rih1Var;
            case 2:
                b0k b0kVar = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                j1e1.f(null, this.b, b0kVar, 0, 1);
                sqe.f((es41) obj5, (vzq0) obj, (jqp) obj8, (kqp) obj7, (w6e0) obj6, (r0f0) obj4, b0kVar, (iIntValue2 << 3) & 112);
                return rih1Var;
            default:
                x340 x340Var6 = (b0k) obj2;
                ((Number) obj3).intValue();
                iu30 iu30Var2 = (iu30) obj6;
                String strO0 = cwl1.o0(x340Var6, 2131962468);
                gym1 gym1Var = (gym1) obj5;
                String strO1 = cwl1.o0(x340Var6, gym1Var.d);
                String str = gym1Var.c;
                wat watVar = (wat) obj8;
                float fX0 = watVar.X0(((i2c) obj).d());
                float fX1 = watVar.X0(16.0f);
                float fX2 = watVar.X0(10.0f) * 2.0f;
                float fX3 = watVar.X0(64.0f);
                uwr uwrVar = cbx.a;
                boolean z = str.length() > 0 && (((fX1 + ((float) ((int) (yae1.a((yae1) obj7, strO1, cbx.d(x340Var6).g, 0, false, 1, 0L, (flb0) null, (xat) null, 996).c >> 32)))) + ((float) ((int) (yae1.a((yae1) obj7, str, cbx.d(x340Var6).j, 0, false, 1, 0L, (flb0) null, (xat) null, 996).c >> 32)))) + fX2) + fX3 < fX0;
                qim0 qim0VarF = u291.f(nim0.a, 1.0f);
                x340 x340Var7 = x340Var6;
                boolean zG2 = x340Var7.g(iu30Var2);
                Object objT4 = x340Var7.T();
                if (zG2 || objT4 == fkj0.X) {
                    objT4 = new wel1(iu30Var2, (byte) 17);
                    x340Var7.s0(objT4);
                }
                Function0 function1 = (Function0) objT4;
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                jto1.b(qim0VarF, (uvx) null, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(strO0), function1), (gbx) null, apo.r(-1829792524, new eom1(gym1Var, (byte) 5), x340Var7), (xu30) null, (xu30) null, (xu30) null, apo.r(2112668279, new vpw(z, (hym1) obj4, str, this.b), x340Var7), (xu30) null, (xu30) null, apo.r(736761722, new sgi1(gym1Var, strO1, (byte) 15), x340Var7), x340Var7, 100663296, 196992, 28350);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jna(long j, es41 es41Var, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(3);
        this.a = b;
        this.b = j;
        this.c = es41Var;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jna(gym1 gym1Var, wat watVar, yae1 yae1Var, iu30 iu30Var, hym1 hym1Var, long j) {
        super(3);
        this.a = (byte) 3;
        this.c = gym1Var;
        this.d = watVar;
        this.e = yae1Var;
        this.f = iu30Var;
        this.g = hym1Var;
        this.b = j;
    }
}
