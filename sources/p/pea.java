package p;

import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.model.Alert;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class pea implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pea(xgn0 xgn0Var, wgn0 wgn0Var) {
        this.a = (byte) 4;
        this.b = xgn0Var;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x02ab  */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iI0;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        byte b2 = 21;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ifh0 ifh0Var = (ifh0) obj;
                afh0 afh0Var = (afh0) obj2;
                float f = ((p3v) ((aae1) obj4).g.getValue()).a;
                int iI1 = ifh0Var.i0(f);
                q5t0 q5t0VarH = afh0Var.H(jjl.e(((hjl) obj3).a, jjl.a(0, Alert.DURATION_SHOW_INDEFINITELY, iI1, p3v.c(f, 0.0f) ? Integer.MAX_VALUE : iI1)));
                return ifh0Var.S(q5t0VarH.a, q5t0VarH.b, b7xVar, new p6(q5t0VarH, (byte) 3));
            case 1:
                w7n w7nVar = (w7n) obj4;
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                if (!zBooleanValue) {
                    iIntValue = w7nVar.V0.i(iIntValue);
                }
                if (!zBooleanValue) {
                    iIntValue2 = w7nVar.V0.i(iIntValue2);
                }
                if (w7nVar.U0) {
                    long j = w7nVar.R0.b;
                    int i = nbe1.c;
                    if (iIntValue == ((int) (j >> 32)) && iIntValue2 == ((int) (j & 4294967295L))) {
                        z = false;
                    } else {
                        int iMin = Math.min(iIntValue, iIntValue2);
                        zr50 zr50Var = zr50.a;
                        if (iMin < 0 || Math.max(iIntValue, iIntValue2) > w7nVar.R0.a.b.length()) {
                            x6e1 x6e1Var = w7nVar.W0;
                            x6e1Var.u(false);
                            x6e1Var.r(zr50Var);
                            z = false;
                        } else {
                            if (zBooleanValue || iIntValue == iIntValue2) {
                                x6e1 x6e1Var2 = w7nVar.W0;
                                x6e1Var2.u(false);
                                x6e1Var2.r(zr50Var);
                            } else {
                                w7nVar.W0.e(true);
                            }
                            w7nVar.S0.v.invoke(new c8e1(w7nVar.R0.a, e6p1.e(iIntValue, iIntValue2), (nbe1) null));
                        }
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                j2i j2iVar = (j2i) obj4;
                aqb0 aqb0Var = (aqb0) obj;
                x340 x340Var = (b0k) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= x340Var.g(aqb0Var) ? 4 : 2;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    j2iVar.J(aqb0Var, 0, x340Var2, Integer.valueOf((iIntValue3 & 14) | 48));
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 3:
                xnm0 xnm0Var = (xnm0) obj4;
                x340 x340Var3 = (b0k) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= (iIntValue4 & 8) == 0 ? x340Var3.g(obj) : x340Var3.i(obj) ? 4 : 2;
                }
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x340Var4.J(xnm0Var, x340Var4.m(), obj, false);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 4:
                xgn0 xgn0Var = (xgn0) obj4;
                xgn0.t.set(xgn0Var, null);
                xgn0Var.c((Object) null);
                return rih1Var;
            case 5:
                tb91 tb91Var = (tb91) obj4;
                ifh0 ifh0Var2 = (ifh0) obj;
                q5t0 q5t0VarH2 = ((afh0) obj2).H(((hjl) obj3).a);
                if (p3v.c(Float.NaN, Float.NaN)) {
                    iI0 = tb91Var.m == qqq0.a ? q5t0VarH2.a / 2 : q5t0VarH2.b / 2;
                } else {
                    iI0 = ifh0Var2.i0(Float.NaN);
                }
                return ifh0Var2.S(q5t0VarH2.a, q5t0VarH2.b, Collections.singletonMap(rb91.d, Integer.valueOf(iI0)), new p6(q5t0VarH2, (byte) 15));
            case 6:
                String str = (String) obj4;
                x340 x340Var5 = (b0k) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    s9e1.b(str, null, 0L, 0L, 0L, 0L, 0, false, 0, 0, null, x340Var6, 0);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 7:
                q5t0 q5t0VarH3 = ((afh0) obj2).H(((hjl) obj3).a);
                return ((ifh0) obj).S(q5t0VarH3.a, q5t0VarH3.b, b7xVar, new gub0(q5t0VarH3, (tob1) obj4, (byte) 21));
            case 8:
                z4e1 z4e1Var = (z4e1) obj4;
                int iIntValue6 = ((Integer) obj).intValue();
                int iIntValue7 = ((Integer) obj2).intValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                ggg1 ggg1Var = z4e1Var.Q0;
                i4e1 i4e1VarD = zBooleanValue2 ? ggg1Var.a.d() : ggg1Var.h();
                long j2 = i4e1VarD.e;
                if (!z4e1Var.U0 || Math.min(iIntValue6, iIntValue7) < 0 || Math.max(iIntValue6, iIntValue7) > i4e1VarD.d.length()) {
                    z = false;
                } else {
                    int i2 = nbe1.c;
                    if (iIntValue6 != ((int) (j2 >> 32)) || iIntValue7 != ((int) (j2 & 4294967295L))) {
                        long jE = e6p1.e(iIntValue6, iIntValue7);
                        if (zBooleanValue2 || iIntValue6 == iIntValue7) {
                            z4e1Var.S0.x(ree1.a);
                        } else {
                            z4e1Var.S0.x(ree1.c);
                        }
                        ggg1 ggg1Var2 = z4e1Var.Q0;
                        if (zBooleanValue2) {
                            ggg1Var2.p(jE);
                        } else {
                            ggg1Var2.o(jE);
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 9:
                x6e1 x6e1Var3 = (x6e1) obj4;
                qim0 qim0Var = (qim0) obj;
                ((Integer) obj3).getClass();
                x340 x340Var7 = (b0k) obj2;
                x340Var7.i0(1980580247);
                wat watVar = (wat) x340Var7.k(t4k.h);
                Object objT = x340Var7.T();
                Object obj5 = fkj0.X;
                if (objT == obj5) {
                    objT = p3d1.n(0L, x340Var7);
                }
                ven0 ven0Var = (ven0) objT;
                boolean zI = x340Var7.i(x6e1Var3);
                Object objT2 = x340Var7.T();
                if (zI || objT2 == obj5) {
                    objT2 = new qga0(x6e1Var3, ven0Var, b2);
                    x340Var7.s0(objT2);
                }
                Function0 function0 = (Function0) objT2;
                boolean zG = x340Var7.g(watVar);
                Object objT3 = x340Var7.T();
                if (zG || objT3 == obj5) {
                    objT3 = new b7e1(watVar, ven0Var, (byte) 1);
                    x340Var7.s0(objT3);
                }
                le5 le5Var = vy51.a;
                qim0 qim0VarI = zr7.i(qim0Var, new gjm(function0, (iu30) objT3));
                x340Var7.r(false);
                return qim0VarI;
            default:
                View view = (View) obj4;
                hsl1 hsl1Var = (hsl1) obj2;
                uc80 uc80Var = (uc80) obj3;
                int i3 = hsl1Var.a.i(519).b;
                view.setPadding(uc80Var.a, uc80Var.b + i3, uc80Var.c, uc80Var.d);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = dug.k(view.getContext()) + i3;
                view.setLayoutParams(layoutParams);
                return hsl1Var;
        }
    }

    public /* synthetic */ pea(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
