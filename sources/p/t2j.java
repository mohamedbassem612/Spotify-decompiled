package p;

import android.content.Context;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t2j extends hab0 implements bv30 {
    public static final t2j N0;
    public static final t2j O0;
    public static final t2j P0;
    public static final t2j Q0;
    public static final t2j R0;
    public static final t2j S0;
    public static final t2j T0;
    public static final t2j U0;
    public static final t2j V0;
    public static final t2j W0;
    public static final t2j X;
    public static final t2j X0;
    public static final t2j Y;
    public static final t2j Y0;
    public static final t2j Z;
    public static final t2j Z0;
    public static final t2j a1;
    public static final t2j b;
    public static final t2j b1;
    public static final t2j c;
    public static final t2j c1;
    public static final t2j d;
    public static final t2j d1;
    public static final t2j e;
    public static final t2j e1;
    public static final t2j f;
    public static final t2j g;
    public static final t2j h;
    public static final t2j i;
    public static final t2j t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 5;
        b = new t2j(i2, (byte) 0);
        c = new t2j(i2, (byte) 1);
        d = new t2j(i2, (byte) 2);
        e = new t2j(i2, (byte) 3);
        f = new t2j(i2, (byte) 4);
        g = new t2j(i2, (byte) 5);
        h = new t2j(i2, (byte) 6);
        i = new t2j(i2, (byte) 7);
        t = new t2j(i2, (byte) 8);
        X = new t2j(i2, (byte) 9);
        Y = new t2j(i2, (byte) 10);
        Z = new t2j(i2, (byte) 11);
        N0 = new t2j(i2, (byte) 12);
        O0 = new t2j(i2, (byte) 13);
        P0 = new t2j(i2, (byte) 14);
        Q0 = new t2j(i2, (byte) 15);
        R0 = new t2j(i2, (byte) 16);
        S0 = new t2j(i2, (byte) 17);
        T0 = new t2j(i2, (byte) 18);
        U0 = new t2j(i2, (byte) 19);
        V0 = new t2j(i2, (byte) 20);
        W0 = new t2j(i2, (byte) 21);
        X0 = new t2j(i2, (byte) 22);
        Y0 = new t2j(i2, (byte) 23);
        Z0 = new t2j(i2, (byte) 24);
        a1 = new t2j(i2, (byte) 25);
        b1 = new t2j(i2, (byte) 26);
        c1 = new t2j(i2, (byte) 27);
        d1 = new t2j(i2, (byte) 28);
        e1 = new t2j(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t2j(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        Boolean bool = ((sop0) obj2).a;
        boolean zJ = u890.j(bool, Boolean.TRUE);
        nim0 nim0Var = nim0.a;
        if (zJ) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1089475136);
            String strO0 = cwl1.o0(x340Var2, 2131959317);
            String strO1 = cwl1.o0(x340Var2, 2131959316);
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            jap1.l(anm1.N("offline_backup_empty_view", uyn1.z(cbx.b(x340Var2).b.b, 0.0f, 2, qim0VarD)), (qim0) null, strO0, strO1, (String) null, (gbx) null, (yf) null, (vu30) null, x340Var2, 0, 498);
            x340Var2.r(false);
        } else if (u890.j(bool, Boolean.FALSE)) {
            x340 x340Var3 = x340Var;
            x340Var3.i0(1089901913);
            String strO2 = cwl1.o0(x340Var3, 2131959321);
            String strO3 = cwl1.o0(x340Var3, 2131959320);
            String strO4 = cwl1.o0(x340Var3, 2131959319);
            boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var3.g(iu30Var)) || (iIntValue & 384) == 256;
            Object objT = x340Var3.T();
            if (z || objT == fkj0.X) {
                objT = new q4j(iu30Var, (byte) 0);
                x340Var3.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            qim0 qim0VarN = anm1.N("offline_backup_go_to_settings_button", nim0Var);
            qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
            uwr uwrVar2 = cbx.a;
            jap1.l(anm1.N("offline_backup_empty_view", uyn1.z(cbx.b(x340Var3).b.b, 0.0f, 2, qim0VarD2)), qim0VarN, strO2, strO3, strO4, gbxVar, (yf) null, (vu30) null, x340Var3, 0, 448);
            x340Var3.r(false);
        } else {
            if (bool != null) {
                throw p3d1.k(x340Var, -1211782781, false);
            }
            x340 x340Var4 = x340Var;
            x340Var4.i0(-1211744966);
            x340Var4.r(false);
        }
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        enx enxVar = enx.c;
        String strO0 = cwl1.o0(x340Var, 2131959318);
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (objT == fkj0.X) {
            objT = fki.d;
            x340Var2.s0(objT);
        }
        kyo1.c(strO0, enxVar, (Function0) objT, (qim0) null, false, (String) null, (v2g) null, (vu30) null, x340Var2, (enx.d << 3) | 384, 248);
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        rc2.f((q0q0) obj2, (iu30) obj3, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i2;
        String string;
        m6q0 m6q0Var = (m6q0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            i2 = (x340Var.g(m6q0Var) ? 32 : 16) | iIntValue;
        } else {
            i2 = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i2 & 1, (i2 & 1169) != 1168)) {
            y5q0 y5q0Var = m6q0Var.a;
            Context context = (Context) x340Var2.k(AndroidCompositionLocals_androidKt.b);
            if (y5q0Var instanceof y5q0) {
                string = context.getString(2131963538, y5q0Var.a.c);
            } else if (y5q0Var instanceof w5q0) {
                string = context.getString(2131963538, ((w5q0) y5q0Var).b);
            } else if (y5q0Var instanceof x5q0) {
                string = context.getString(((x5q0) y5q0Var).b);
            } else if (y5q0Var instanceof v5q0) {
                string = context.getString(((v5q0) y5q0Var).b);
            } else {
                if (!(y5q0Var instanceof z5q0)) {
                    eg.o();
                    return null;
                }
                string = context.getString(((z5q0) y5q0Var).b);
            }
            String str = string;
            boolean z = (i2 & 896) == 256;
            Object objT = x340Var2.T();
            if (z || objT == fkj0.X) {
                objT = new q4j(iu30Var, (byte) 1);
                x340Var2.s0(objT);
            }
            r1p1.b(str, (Function0) objT, (qim0) null, (Function0) null, apo.r(-287769794, new l8i(m6q0Var, (byte) 22), x340Var2), x340Var2, 24576, 12);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i2;
        gbq0 gbq0Var = (gbq0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            i2 = (x340Var.g(gbq0Var) ? 32 : 16) | iIntValue;
        } else {
            i2 = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i2 & 1, (i2 & 1169) != 1168)) {
            qxd0.y(gbq0Var.b, gbq0Var.c, gbq0Var.d, iu30Var, u291.f(nim0.a, 1.0f), x340Var2, ((i2 << 3) & 7168) | 24576);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new q4j(iu30Var, (byte) 2);
            x340Var2.s0(objT);
        }
        qtg.b((Function0) objT, x340Var2, 0);
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new q4j(iu30Var, (byte) 3);
            x340Var2.s0(objT);
        }
        x2g0.e(0, (Function0) objT, x340Var2, (qim0) null);
        return rih1.a;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i2;
        int i3;
        int i4;
        qim0 qim0VarS;
        float f2;
        byte b2 = this.a;
        qim0 qim0Var = nim0.a;
        Function0 function0 = null;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                rym0 rym0Var = (rym0) obj2;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                boolean z2 = rym0Var.a;
                z47.j(z2, x340Var, 0);
                x340 x340Var2 = x340Var;
                if (z2) {
                    x340Var2.i0(339495211);
                    fn31.f(rym0Var.b, iu30Var, (qim0) null, x340Var2, (iIntValue >> 3) & 112);
                } else {
                    x340Var2.i0(1934486143);
                }
                x340Var2.r(false);
                return rih1Var;
            case 1:
                g2n0 g2n0Var = (g2n0) obj2;
                b0k b0kVar = (b0k) obj4;
                ((Number) obj5).intValue();
                mod.b(t4k.n.a(f5p1.r(g2n0Var.b.e, b0kVar)), apo.r(88357858, new l2i(g2n0Var, (iu30) obj3, (byte) 14), b0kVar), b0kVar, 56);
                return rih1Var;
            case 2:
                i541.f((j3n0) obj2, (iu30) obj3, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
            case 3:
                b9n0 b9n0Var = (b9n0) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var3 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                m4c m4cVar = fkj0.X;
                int i5 = (iIntValue2 & 896) ^ 384;
                boolean z3 = (i5 > 256 && x340Var3.g(iu30Var2)) || (iIntValue2 & 384) == 256;
                x340 x340Var4 = x340Var3;
                Object objT = x340Var4.T();
                if (z3 || objT == m4cVar) {
                    objT = new c1j(iu30Var2, (byte) 14);
                    x340Var4.s0(objT);
                }
                Function0 function1 = (Function0) objT;
                boolean z4 = (i5 > 256 && x340Var4.g(iu30Var2)) || (iIntValue2 & 384) == 256;
                Object objT2 = x340Var4.T();
                if (z4 || objT2 == m4cVar) {
                    objT2 = new c1j(iu30Var2, (byte) 15);
                    x340Var4.s0(objT2);
                }
                Function0 function2 = (Function0) objT2;
                if ((i5 <= 256 || !x340Var4.g(iu30Var2)) && (iIntValue2 & 384) != 256) {
                    z = false;
                }
                Object objT3 = x340Var4.T();
                if (z || objT3 == m4cVar) {
                    objT3 = new c1j(iu30Var2, (byte) 16);
                    x340Var4.s0(objT3);
                }
                ha71.d(b9n0Var, function1, function2, (qim0) null, (Function0) objT3, x340Var4, (iIntValue2 >> 3) & 14);
                return rih1Var;
            case 4:
                vpb1.e((lob1) obj2, (iu30) obj3, (qim0) null, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
            case 5:
                yfn0 yfn0Var = (yfn0) obj2;
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var5 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                if ((((iIntValue3 & 896) ^ 384) <= 256 || !x340Var5.g(iu30Var3)) && (iIntValue3 & 384) != 256) {
                    z = false;
                }
                x340 x340Var6 = x340Var5;
                Object objT4 = x340Var6.T();
                if (z || objT4 == fkj0.X) {
                    objT4 = new c1j(iu30Var3, (byte) 17);
                    x340Var6.s0(objT4);
                }
                obg1.h(yfn0Var, (qim0) null, (Function0) objT4, x340Var6, (iIntValue3 >> 3) & 14);
                return rih1Var;
            case 6:
                jjn0 jjn0Var = (jjn0) obj2;
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var7 = (b0k) obj4;
                int iIntValue4 = ((Number) obj5).intValue();
                if ((iIntValue4 & 48) == 0) {
                    i2 = iIntValue4 | (x340Var7.g(jjn0Var) ? 32 : 16);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 384) == 0) {
                    i2 |= x340Var7.i(iu30Var4) ? 256 : 128;
                }
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(i2 & 1, (i2 & 1169) != 1168)) {
                    String strO0 = cwl1.o0(x340Var8, 2131951732);
                    String str = jjn0Var.c;
                    boolean z5 = jjn0Var.d;
                    qim0 qim0VarN = nim0.a;
                    if (z5) {
                        x340Var8.i0(1615276568);
                        String strO1 = cwl1.o0(x340Var8, 2131951731);
                        pm31 pm31Var = new pm31(0);
                        z = (i2 & 896) == 256;
                        Object objT5 = x340Var8.T();
                        if (z || objT5 == fkj0.X) {
                            objT5 = new c1j(iu30Var4, (byte) 18);
                            x340Var8.s0(objT5);
                        }
                        qim0VarN = anm1.N("name-element", bin.x(qim0VarN, false, strO1, pm31Var, (idn0) null, (Function0) objT5, 9));
                    } else {
                        x340Var8.i0(1615232827);
                    }
                    x340Var8.r(false);
                    yxo1.a(strO0, str, qim0VarN, z5, x340Var8, 0, 0);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 7:
                ekn0 ekn0Var = (ekn0) obj2;
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var9 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                if ((iIntValue5 & 48) == 0) {
                    i3 = iIntValue5 | (x340Var9.g(ekn0Var) ? 32 : 16);
                } else {
                    i3 = iIntValue5;
                }
                if ((iIntValue5 & 384) == 0) {
                    i3 |= x340Var9.i(iu30Var5) ? 256 : 128;
                }
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(i3 & 1, (i3 & 1169) != 1168)) {
                    String strO2 = cwl1.o0(x340Var10, 2131958482);
                    String str2 = ekn0Var.a;
                    vvm1 vvm1Var = ekn0Var.b;
                    boolean z6 = vvm1Var instanceof bkn0;
                    boolean z7 = vvm1Var instanceof ckn0;
                    qim0 qim0VarN2 = nim0.a;
                    if (z7) {
                        x340Var10.i0(546345301);
                    } else {
                        x340Var10.i0(546388763);
                        String strO3 = cwl1.o0(x340Var10, 2131958481);
                        pm31 pm31Var2 = new pm31(0);
                        z = (i3 & 896) == 256;
                        Object objT6 = x340Var10.T();
                        if (z || objT6 == fkj0.X) {
                            objT6 = new c1j(iu30Var5, (byte) 19);
                            x340Var10.s0(objT6);
                        }
                        qim0VarN2 = anm1.N("name-row", bin.x(qim0VarN2, false, strO3, pm31Var2, (idn0) null, (Function0) objT6, 9));
                    }
                    x340Var10.r(false);
                    cto1.h(strO2, str2, qim0VarN2, z6, x340Var10, 0, 0);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 8:
                t4n1.j((zkn0) obj2, (iu30) obj3, (qim0) null, 0, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
            case 9:
                psn0 psn0Var = (psn0) obj2;
                iu30 iu30Var6 = (iu30) obj3;
                x340 x340Var11 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                m4c m4cVar2 = fkj0.X;
                if ((iIntValue6 & 48) == 0) {
                    i4 = (x340Var11.g(psn0Var) ? 32 : 16) | iIntValue6;
                } else {
                    i4 = iIntValue6;
                }
                if ((iIntValue6 & 384) == 0) {
                    i4 |= x340Var11.i(iu30Var6) ? 256 : 128;
                }
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(i4 & 1, (i4 & 1169) != 1168)) {
                    int i6 = psn0Var.a;
                    int i7 = i4 & 896;
                    boolean z8 = i7 == 256;
                    Object objT7 = x340Var12.T();
                    if (z8 || objT7 == m4cVar2) {
                        objT7 = new c1j(iu30Var6, (byte) 20);
                        x340Var12.s0(objT7);
                    }
                    Function0 function3 = (Function0) objT7;
                    z = i7 == 256;
                    Object objT8 = x340Var12.T();
                    if (z || objT8 == m4cVar2) {
                        objT8 = new c1j(iu30Var6, (byte) 21);
                        x340Var12.s0(objT8);
                    }
                    wqn1.g(i6, function3, (Function0) objT8, x340Var12, 0);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 10:
                int iIntValue7 = (((Number) obj5).intValue() & 14) | 48;
                x340 x340Var13 = (b0k) obj4;
                x340Var13.i0(-442366078);
                w8p1.k((otn0) obj, qim0Var, x340Var13, iIntValue7 & 126);
                x340Var13.r(false);
                return rih1Var;
            case 11:
                g3o0 g3o0Var = (g3o0) obj2;
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var14 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                int i8 = g3o0Var.b;
                int i9 = g3o0Var.a;
                if ((((iIntValue8 & 896) ^ 384) <= 256 || !x340Var14.g(iu30Var7)) && (iIntValue8 & 384) != 256) {
                    z = false;
                }
                x340 x340Var15 = x340Var14;
                Object objT9 = x340Var15.T();
                if (z || objT9 == fkj0.X) {
                    objT9 = new c1j(iu30Var7, (byte) 22);
                    x340Var15.s0(objT9);
                }
                q0o1.c(i8, i9, 0, (Function0) objT9, x340Var15, (qim0) null);
                return rih1Var;
            case 12:
                x340 x340Var16 = (b0k) obj4;
                ((Number) obj5).intValue();
                xd10 xd10Var = ((jao0) obj2).a;
                if (xd10Var instanceof vd10) {
                    x340 x340Var17 = x340Var16;
                    x340Var17.i0(1464472899);
                    float fY = ((wat) x340Var17.k(t4k.h)).y(fc11.G(3));
                    long jG = z4p1.g(4282812374L);
                    uwr uwrVar = cbx.a;
                    qim0VarS = exd0.s(qim0Var, new dub(cbx.a(x340Var17).a.c, jG, fY, (byte) 2));
                    x340Var17.r(false);
                    f2 = 1.0f;
                } else {
                    if (xd10Var instanceof ud10) {
                        x340 x340Var18 = x340Var16;
                        x340Var18.i0(-1845724139);
                        int i10 = ((ud10) xd10Var).a;
                        String strValueOf = i10 >= 100 ? "99+" : String.valueOf(i10);
                        uwr uwrVar2 = cbx.a;
                        lee1 lee1VarA = lee1.a(cbx.d(x340Var18).n, 0L, 0L, FontWeight.Z, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777211);
                        y9e1 y9e1VarA = yae1.a(d5p1.q(0, x340Var18, 1), strValueOf, lee1VarA, 0, false, 0, 0L, (flb0) null, (xat) null, 1020);
                        long j = cbx.a(x340Var18).c.d;
                        long j2 = cbx.a(x340Var18).b.a;
                        long j3 = cbx.a(x340Var18).a.c;
                        long j4 = y9e1VarA.c;
                        qim0VarS = exd0.s(qim0Var, new kao0((int) (j4 & 4294967295L), (int) (j4 >> 32), j3, j, strValueOf, j2, lee1VarA));
                        x340Var18.r(false);
                    } else {
                        x340 x340Var19 = x340Var16;
                        x340Var19.i0(1464511167);
                        x340Var19.r(false);
                        qim0VarS = qim0Var;
                    }
                    f2 = 1.0f;
                }
                op71.g(x340Var16, u291.d(qim0Var, f2).then(qim0VarS));
                return rih1Var;
            case 13:
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var20 = (b0k) obj4;
                int iIntValue9 = ((Number) obj5).intValue();
                if ((((iIntValue9 & 896) ^ 384) <= 256 || !x340Var20.g(iu30Var8)) && (iIntValue9 & 384) != 256) {
                    z = false;
                }
                x340 x340Var21 = x340Var20;
                Object objT10 = x340Var21.T();
                if (z || objT10 == fkj0.X) {
                    objT10 = new c1j(iu30Var8, (byte) 23);
                    x340Var21.s0(objT10);
                }
                foo1.c(new gbx(z50.c, (Function0) objT10), ldx.c, anm1.N("dsl_new_playlist", qim0Var), (max) null, yla.s(x340Var21), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, p3j.a, x340Var21, 0, 48, 2008);
                return rih1Var;
            case 14:
                sao0 sao0Var = (sao0) obj2;
                iu30 iu30Var9 = (iu30) obj3;
                x340 x340Var22 = (b0k) obj4;
                int iIntValue10 = ((Number) obj5).intValue();
                qim0 qim0VarN3 = anm1.N("dsl_new_playlist_row", u291.f(qim0Var, 1.0f));
                uvx uvxVar = new uvx(null, 3, null, null, 27);
                String strO4 = cwl1.o0(x340Var22, 2131955157);
                boolean z9 = (((iIntValue10 & 896) ^ 384) > 256 && x340Var22.g(iu30Var9)) || (iIntValue10 & 384) == 256;
                if ((((iIntValue10 & 112) ^ 48) <= 32 || !x340Var22.g(sao0Var)) && (iIntValue10 & 48) != 32) {
                    z = false;
                }
                boolean z10 = z9 | z;
                x340 x340Var23 = x340Var22;
                Object objT11 = x340Var23.T();
                if (z10 || objT11 == fkj0.X) {
                    objT11 = new dfi(iu30Var9, sao0Var, (byte) 16);
                    x340Var23.s0(objT11);
                }
                Function0 function4 = (Function0) objT11;
                if (ihc1.y0(strO4)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                jto1.b(qim0VarN3, uvxVar, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(strO4), function4), (gbx) null, (xu30) null, q3j.a, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, q3j.b, x340Var23, 805306432, 196608, 32188);
                return rih1Var;
            case 15:
                beo0 beo0Var = (beo0) obj2;
                Object obj6 = (iu30) obj3;
                ((Number) obj5).intValue();
                String str3 = beo0Var.i;
                String str4 = beo0Var.k;
                boolean z11 = beo0Var.g;
                x340 x340Var24 = (b0k) obj4;
                Object objT12 = x340Var24.T();
                m4c m4cVar3 = fkj0.X;
                if (objT12 == m4cVar3) {
                    x340Var24.s0(obj6);
                } else {
                    obj6 = objT12;
                }
                iu30 iu30Var10 = (iu30) obj6;
                boolean z12 = (beo0Var.f == 0 || z11) ? false : true;
                int i11 = beo0Var.e;
                boolean z13 = i11 > 0 && !z11;
                String str5 = beo0Var.c + ", " + beo0Var.d + ", " + i11;
                x340Var24.i0(-410399357);
                smc0 smc0VarN = k4p1.n();
                if (!z12 || ihc1.y0(str4)) {
                    x340Var24.i0(-1870371533);
                    x340Var24.r(false);
                } else {
                    x340Var24.i0(-1870553162);
                    Object objT13 = x340Var24.T();
                    if (objT13 == m4cVar3) {
                        objT13 = new c1j(iu30Var10, (byte) 24);
                        x340Var24.s0(objT13);
                    }
                    smc0VarN.add(new epo(str4, (Function0) objT13));
                    x340Var24.r(false);
                }
                if (!z13 || ihc1.y0(str3)) {
                    x340Var24.i0(-1870102701);
                    x340Var24.r(false);
                } else {
                    x340Var24.i0(-1870287213);
                    Object objT14 = x340Var24.T();
                    if (objT14 == m4cVar3) {
                        objT14 = new c1j(iu30Var10, (byte) 25);
                        x340Var24.s0(objT14);
                    }
                    smc0VarN.add(new epo(str3, (Function0) objT14));
                    x340Var24.r(false);
                }
                smc0 smc0VarK = k4p1.k(smc0VarN);
                x340Var24.r(false);
                boolean zG = x340Var24.g(str5) | x340Var24.i(smc0VarK);
                Object objT15 = x340Var24.T();
                if (zG || objT15 == m4cVar3) {
                    objT15 = new r3j(str5, smc0VarK, (byte) 0);
                    x340Var24.s0(objT15);
                }
                qim0 qim0VarA = s161.a(qim0Var, (iu30) objT15);
                uvx uvxVar2 = (uvx) x340Var24.k(vvx.a);
                uwr uwrVar3 = cbx.a;
                cvx cvxVar = cbx.b(x340Var24).b;
                cvx cvxVar2 = cbx.b(x340Var24).b;
                jto1.b(qim0VarA, uvx.a(uvxVar2, null, 3, new zzq0(16.0f, 12.0f, 16.0f, 12.0f), null, null, null, 499), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, apo.r(-434607837, new s3j(beo0Var, (byte) 0), x340Var24), (xu30) null, apo.r(-99898942, new s3j(beo0Var, (byte) 1), x340Var24), apo.r(1611379425, new gb7(z13, z12, beo0Var, iu30Var10, (byte) 1), x340Var24), (xu30) null, (xu30) null, apo.r(-1844720066, new s3j(beo0Var, (byte) 2), x340Var24), x340Var24, 805306432, 197040, 26108);
                return rih1Var;
            case 16:
                ggo0 ggo0Var = (ggo0) obj2;
                iu30 iu30Var11 = (iu30) obj3;
                x340 x340Var25 = (b0k) obj4;
                int iIntValue11 = ((Number) obj5).intValue();
                boolean z14 = ggo0Var.b;
                int i12 = z14 ? 2131959948 : 2131959954;
                int i13 = z14 ? 2131959947 : 2131959953;
                boolean z15 = (((iIntValue11 & 896) ^ 384) > 256 && x340Var25.g(iu30Var11)) || (iIntValue11 & 384) == 256;
                if ((((iIntValue11 & 112) ^ 48) <= 32 || !x340Var25.g(ggo0Var)) && (iIntValue11 & 48) != 32) {
                    z = false;
                }
                boolean z16 = z15 | z;
                x340 x340Var26 = x340Var25;
                Object objT16 = x340Var26.T();
                if (z16 || objT16 == fkj0.X) {
                    objT16 = new dfi(iu30Var11, ggo0Var, (byte) 17);
                    x340Var26.s0(objT16);
                }
                yoi1.c(2131959955, i12, i13, (Function0) objT16, x340Var26, 0);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                rho0 rho0Var = (rho0) obj2;
                iu30 iu30Var12 = (iu30) obj3;
                x340 x340Var27 = (b0k) obj4;
                int iIntValue12 = ((Number) obj5).intValue();
                m4c m4cVar4 = fkj0.X;
                xho0 xho0Var = rho0Var.a;
                int i14 = (iIntValue12 & 896) ^ 384;
                boolean z17 = (i14 > 256 && x340Var27.g(iu30Var12)) || (iIntValue12 & 384) == 256;
                x340 x340Var28 = x340Var27;
                boolean zI = z17 | x340Var28.i(rho0Var);
                Object objT17 = x340Var28.T();
                if (zI || objT17 == m4cVar4) {
                    objT17 = new y3j(iu30Var12, rho0Var, (byte) 0);
                    x340Var28.s0(objT17);
                }
                Function0 function5 = (Function0) objT17;
                boolean zI2 = ((i14 > 256 && x340Var28.g(iu30Var12)) || (iIntValue12 & 384) == 256) | x340Var28.i(rho0Var);
                Object objT18 = x340Var28.T();
                if (zI2 || objT18 == m4cVar4) {
                    objT18 = new y3j(iu30Var12, rho0Var, (byte) 1);
                    x340Var28.s0(objT18);
                }
                Function0 function6 = (Function0) objT18;
                String str6 = xho0Var.a.d;
                if (str6 == null) {
                    x340Var28.i0(-1651832558);
                    x340Var28.r(false);
                } else {
                    x340Var28.i0(-1651832557);
                    boolean zG2 = ((i14 > 256 && x340Var28.g(iu30Var12)) || (iIntValue12 & 384) == 256) | x340Var28.g(str6);
                    Object objT19 = x340Var28.T();
                    if (zG2 || objT19 == m4cVar4) {
                        objT19 = new are(iu30Var12, str6, (byte) 1);
                        x340Var28.s0(objT19);
                    }
                    function0 = (Function0) objT19;
                    x340Var28.r(false);
                }
                iho1.h(xho0Var, (qim0) null, function5, function6, function0, x340Var28, 0);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                joo0 joo0Var = (joo0) obj2;
                iu30 iu30Var13 = (iu30) obj3;
                x340 x340Var29 = (b0k) obj4;
                int iIntValue13 = ((Number) obj5).intValue();
                m4c m4cVar5 = fkj0.X;
                int i15 = (iIntValue13 & 896) ^ 384;
                boolean z18 = (i15 > 256 && x340Var29.g(iu30Var13)) || (iIntValue13 & 384) == 256;
                x340 x340Var30 = x340Var29;
                Object objT20 = x340Var30.T();
                if (z18 || objT20 == m4cVar5) {
                    objT20 = new c1j(iu30Var13, (byte) 26);
                    x340Var30.s0(objT20);
                }
                Function0 function7 = (Function0) objT20;
                if ((i15 <= 256 || !x340Var30.g(iu30Var13)) && (iIntValue13 & 384) != 256) {
                    z = false;
                }
                Object objT21 = x340Var30.T();
                if (z || objT21 == m4cVar5) {
                    objT21 = new c1j(iu30Var13, (byte) 27);
                    x340Var30.s0(objT21);
                }
                ujo1.f(joo0Var, function7, (Function0) objT21, (qim0) null, x340Var30, (iIntValue13 >> 3) & 14);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                w9p0 w9p0Var = (w9p0) obj2;
                iu30 iu30Var14 = (iu30) obj3;
                x340 x340Var31 = (b0k) obj4;
                int iIntValue14 = ((Number) obj5).intValue();
                if ((((iIntValue14 & 896) ^ 384) <= 256 || !x340Var31.g(iu30Var14)) && (iIntValue14 & 384) != 256) {
                    z = false;
                }
                x340 x340Var32 = x340Var31;
                Object objT22 = x340Var32.T();
                if (z || objT22 == fkj0.X) {
                    objT22 = new cci(iu30Var14, (byte) 29);
                    x340Var32.s0(objT22);
                }
                voo1.f(w9p0Var, (qim0) null, (iu30) objT22, x340Var32, (iIntValue14 >> 3) & 14);
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                w9p0 w9p0Var2 = (w9p0) obj2;
                iu30 iu30Var15 = (iu30) obj3;
                x340 x340Var33 = (b0k) obj4;
                int iIntValue15 = ((Number) obj5).intValue();
                if ((((iIntValue15 & 896) ^ 384) <= 256 || !x340Var33.g(iu30Var15)) && (iIntValue15 & 384) != 256) {
                    z = false;
                }
                x340 x340Var34 = x340Var33;
                Object objT23 = x340Var34.T();
                if (z || objT23 == fkj0.X) {
                    objT23 = new k4j(iu30Var15, (byte) 0);
                    x340Var34.s0(objT23);
                }
                epo1.z(w9p0Var2, (qim0) null, (iu30) objT23, x340Var34, (iIntValue15 >> 3) & 14);
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                qmp0 qmp0Var = (qmp0) obj2;
                iu30 iu30Var16 = (iu30) obj3;
                x340 x340Var35 = (b0k) obj4;
                int iIntValue16 = ((Number) obj5).intValue();
                m4c m4cVar6 = fkj0.X;
                int i16 = (iIntValue16 & 896) ^ 384;
                boolean z19 = (i16 > 256 && x340Var35.g(iu30Var16)) || (iIntValue16 & 384) == 256;
                x340 x340Var36 = x340Var35;
                Object objT24 = x340Var36.T();
                if (z19 || objT24 == m4cVar6) {
                    objT24 = new c1j(iu30Var16, (byte) 28);
                    x340Var36.s0(objT24);
                }
                Function0 function8 = (Function0) objT24;
                if ((i16 <= 256 || !x340Var36.g(iu30Var16)) && (iIntValue16 & 384) != 256) {
                    z = false;
                }
                Object objT25 = x340Var36.T();
                if (z || objT25 == m4cVar6) {
                    objT25 = new c1j(iu30Var16, (byte) 29);
                    x340Var36.s0(objT25);
                }
                jap1.k(qmp0Var, function8, (Function0) objT25, x340Var36, (iIntValue16 >> 3) & 14);
                return rih1Var;
            case 22:
                return a(obj, obj2, obj3, obj4, obj5);
            case 23:
                return d(obj, obj2, obj3, obj4, obj5);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return e(obj, obj2, obj3, obj4, obj5);
            case 25:
                return f(obj, obj2, obj3, obj4, obj5);
            case 26:
                return g(obj, obj2, obj3, obj4, obj5);
            case 27:
                return h(obj, obj2, obj3, obj4, obj5);
            case 28:
                return i(obj, obj2, obj3, obj4, obj5);
            default:
                hdq0 hdq0Var = (hdq0) obj2;
                iu30 iu30Var17 = (iu30) obj3;
                x340 x340Var37 = (b0k) obj4;
                int iIntValue17 = ((Number) obj5).intValue();
                fdq0 fdq0Var = hdq0Var.b;
                xbq0 xbq0Var = hdq0Var.c;
                boolean z20 = hdq0Var.d != null;
                if ((((iIntValue17 & 896) ^ 384) <= 256 || !x340Var37.g(iu30Var17)) && (iIntValue17 & 384) != 256) {
                    z = false;
                }
                x340 x340Var38 = x340Var37;
                Object objT26 = x340Var38.T();
                if (z || objT26 == fkj0.X) {
                    objT26 = new q4j(iu30Var17, (byte) 4);
                    x340Var38.s0(objT26);
                }
                rqg0.e(fdq0Var, xbq0Var, z20, (Function0) objT26, x340Var38, 0);
                return rih1Var;
        }
    }
}
