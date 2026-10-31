package p;

import android.os.Build;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class dh implements xu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: Code duplicated, block: B:81:0x021d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0269  */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        d6o0 d6o0Var;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        final byte b2 = 2;
        final byte b3 = 0;
        switch (b) {
            case 0:
                ifh0 ifh0Var = (ifh0) obj;
                final int iI0 = ifh0Var.i0(10.0f);
                int i = iI0 * 2;
                final q5t0 q5t0VarH = ((afh0) obj2).H(jjl.i(i, ((hjl) obj3).a, 0));
                int i2 = q5t0VarH.b;
                int i3 = q5t0VarH.a - i;
                final byte b4 = z ? (byte) 1 : (byte) 0;
                return ifh0Var.S(i3, i2, b7xVar, new iu30() { // from class: p.eh
                    public final Object invoke(Object obj5) {
                        byte b5 = b4;
                        rih1 rih1Var2 = rih1.a;
                        int i4 = iI0;
                        q5t0 q5t0Var = q5t0VarH;
                        p5t0 p5t0Var = (p5t0) obj5;
                        switch (b5) {
                            case 0:
                                p5t0.g(0, -i4, p5t0Var, q5t0Var);
                                break;
                            case 1:
                                p5t0.g(-i4, 0, p5t0Var, q5t0Var);
                                break;
                            default:
                                p5t0.g(0, -i4, p5t0Var, q5t0Var);
                                break;
                        }
                        return rih1Var2;
                    }
                });
            case 1:
                ifh0 ifh0Var2 = (ifh0) obj;
                final int iI1 = ifh0Var2.i0(10.0f);
                int i4 = iI1 * 2;
                final q5t0 q5t0VarH2 = ((afh0) obj2).H(jjl.i(0, ((hjl) obj3).a, i4));
                return ifh0Var2.S(q5t0VarH2.a, q5t0VarH2.b - i4, b7xVar, new iu30() { // from class: p.eh
                    public final Object invoke(Object obj5) {
                        byte b5 = b3;
                        rih1 rih1Var2 = rih1.a;
                        int i5 = iI1;
                        q5t0 q5t0Var = q5t0VarH2;
                        p5t0 p5t0Var = (p5t0) obj5;
                        switch (b5) {
                            case 0:
                                p5t0.g(0, -i5, p5t0Var, q5t0Var);
                                break;
                            case 1:
                                p5t0.g(-i5, 0, p5t0Var, q5t0Var);
                                break;
                            default:
                                p5t0.g(0, -i5, p5t0Var, q5t0Var);
                                break;
                        }
                        return rih1Var2;
                    }
                });
            case 2:
                vu30 vu30Var = (vu30) obj;
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var.i(vu30Var) ? 4 : 2;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    vu30Var.invoke(x340Var2, Integer.valueOf(iIntValue & 14));
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 3:
                vu30 vu30Var2 = (vu30) obj;
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= x340Var3.i(vu30Var2) ? 4 : 2;
                }
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    vu30Var2.invoke(x340Var4, Integer.valueOf(iIntValue2 & 14));
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 4:
                mdm mdmVar = (mdm) obj;
                x340 x340Var5 = (b0k) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= x340Var5.g(mdmVar) ? 4 : 2;
                }
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    t1c.a(dug.f(u291.h(u291.f(uyn1.z(0.0f, ajm.g, 1, nim0.a), 1.0f), ajm.f), mdmVar.c, d4o1.a), x340Var6, 0);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var7 = (b0k) obj2;
                if ((((Integer) obj3).intValue() & 17) == 16) {
                    x340 x340Var8 = x340Var7;
                    if (x340Var8.H()) {
                        x340Var8.b0();
                    } else {
                        q9e1.b(cwl1.o0(x340Var7, 2131960580), (qim0) null, 0L, 0L, (FontWeight) null, 0L, (a0e1) null, 0L, 0, false, 0, 0, (lee1) null, x340Var7, 0, 0, 131070);
                    }
                } else {
                    q9e1.b(cwl1.o0(x340Var7, 2131960580), (qim0) null, 0L, 0L, (FontWeight) null, 0L, (a0e1) null, 0L, 0, false, 0, 0, (lee1) null, x340Var7, 0, 0, 131070);
                }
                return rih1Var;
            case 6:
                x340 x340Var9 = (b0k) obj2;
                if ((((Integer) obj3).intValue() & 17) == 16) {
                    x340 x340Var10 = x340Var9;
                    if (x340Var10.H()) {
                        x340Var10.b0();
                    } else {
                        q9e1.b(cwl1.o0(x340Var9, 2131960579), (qim0) null, 0L, 0L, (FontWeight) null, 0L, (a0e1) null, 0L, 0, false, 0, 0, (lee1) null, x340Var9, 0, 0, 131070);
                    }
                } else {
                    q9e1.b(cwl1.o0(x340Var9, 2131960579), (qim0) null, 0L, 0L, (FontWeight) null, 0L, (a0e1) null, 0L, 0, false, 0, 0, (lee1) null, x340Var9, 0, 0, 131070);
                }
                return rih1Var;
            case 7:
                cs91 cs91Var = (cs91) obj;
                x340 x340Var11 = (b0k) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= x340Var11.g(cs91Var) ? 4 : 2;
                }
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    sbl.u(cs91Var, null, null, x340Var12, iIntValue4 & 14, 6);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 8:
                cs91 cs91Var2 = (cs91) obj;
                x340 x340Var13 = (b0k) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= x340Var13.g(cs91Var2) ? 4 : 2;
                }
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    sbl.u(cs91Var2, null, null, x340Var14, iIntValue5 & 14, 6);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 9:
                xr91 xr91Var = (xr91) obj;
                x340 x340Var15 = (b0k) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= (iIntValue6 & 8) == 0 ? x340Var15.g(xr91Var) : x340Var15.i(xr91Var) ? 4 : 2;
                }
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    cxm.m(xr91Var, (qim0) null, (hw61) null, 0L, 0L, 0L, 0.0f, x340Var16, iIntValue6 & 14, 254);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 10:
                hsl1 hsl1Var = (hsl1) obj2;
                uc80 uc80Var = (uc80) obj3;
                ((View) obj).setPadding(uc80Var.a, uc80Var.b, uc80Var.c, uc80Var.d + hsl1Var.a.i(519).d);
                return hsl1Var;
            case 11:
                hsl1 hsl1Var2 = (hsl1) obj2;
                uc80 uc80Var2 = (uc80) obj3;
                ((View) obj).setPadding(uc80Var2.a, uc80Var2.b, uc80Var2.c, uc80Var2.d + hsl1Var2.a.i(2).d);
                return hsl1Var2;
            case 12:
                ifh0 ifh0Var3 = (ifh0) obj;
                final int iI2 = ifh0Var3.i0(10.0f);
                int i5 = iI2 * 2;
                final q5t0 q5t0VarH3 = ((afh0) obj2).H(jjl.i(0, ((hjl) obj3).a, i5));
                return ifh0Var3.S(q5t0VarH3.a, q5t0VarH3.b - i5, b7xVar, new iu30() { // from class: p.eh
                    public final Object invoke(Object obj5) {
                        byte b5 = b2;
                        rih1 rih1Var2 = rih1.a;
                        int i6 = iI2;
                        q5t0 q5t0Var = q5t0VarH3;
                        p5t0 p5t0Var = (p5t0) obj5;
                        switch (b5) {
                            case 0:
                                p5t0.g(0, -i6, p5t0Var, q5t0Var);
                                break;
                            case 1:
                                p5t0.g(-i6, 0, p5t0Var, q5t0Var);
                                break;
                            default:
                                p5t0.g(0, -i6, p5t0Var, q5t0Var);
                                break;
                        }
                        return rih1Var2;
                    }
                });
            default:
                qim0 qim0Var = (qim0) obj;
                ((Integer) obj3).getClass();
                x340 x340Var17 = (b0k) obj2;
                x340Var17.i0(-369978792);
                WeakHashMap weakHashMap = osl1.x;
                u85 u85Var = lhc.g(x340Var17).c;
                m4c m4cVar = fkj0.X;
                x340Var17.i0(-1011341039);
                if (Build.VERSION.SDK_INT < 30) {
                    x340Var17.r(false);
                    d6o0Var = tpu.a;
                } else {
                    vf81.j0.getClass();
                    zct0 zct0Var = uf81.c;
                    zct0 zct0Var2 = uf81.b;
                    zct0 zct0Var3 = uf81.d;
                    View view = (View) x340Var17.k(AndroidCompositionLocals_androidKt.f);
                    wat watVar = (wat) x340Var17.k(t4k.h);
                    boolean zG = x340Var17.g(u85Var) | x340Var17.g(view) | x340Var17.g(zct0Var3) | x340Var17.g(watVar);
                    Object objT = x340Var17.T();
                    if (zG || objT == m4cVar) {
                        obj4 = objT;
                        vsl1 vsl1Var = new vsl1(u85Var, view, zct0Var3, watVar);
                        x340Var17.s0(vsl1Var);
                        obj4 = vsl1Var;
                    }
                    vsl1 vsl1Var2 = (vsl1) obj4;
                    boolean zI = x340Var17.i(vsl1Var2);
                    Object objT2 = x340Var17.T();
                    Object obj5 = objT2;
                    if (zI || objT2 == m4cVar) {
                        isl1 isl1Var = new isl1(vsl1Var2, (byte) 0);
                        x340Var17.s0(isl1Var);
                        obj5 = isl1Var;
                    }
                    qxd0.i(vsl1Var2, (iu30) obj5, x340Var17);
                    x340Var17.r(false);
                    d6o0Var = vsl1Var2;
                }
                qim0 qim0VarL = bmq0.L(qim0Var, d6o0Var, (g6o0) null);
                x340Var17.r(false);
                return qim0VarL;
        }
    }
}
