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
import com.spotify.common.uri.SpotifyUriParserException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class h5p1 {
    public static b180 a;
    public static b180 b;

    public static final float[] A(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f3 * f12) + (f2 * f11) + (f * f10);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f10 / f13;
        fArr2[1] = f11 / f13;
        fArr2[2] = f12 / f13;
        fArr2[3] = ktd.e(f2, f9, f3 * f8, f13);
        fArr2[4] = ktd.e(f3, f7, f9 * f, f13);
        fArr2[5] = ktd.e(f, f8, f7 * f2, f13);
        fArr2[6] = ktd.e(f3, f5, f2 * f6, f13);
        fArr2[7] = ktd.e(f, f6, f3 * f4, f13);
        fArr2[8] = ktd.e(f2, f4, f * f5, f13);
        return fArr2;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:38:0x0112  */
    /* JADX WARN: Code duplicated, block: B:41:0x0116 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object B(Context context, qcf0 qcf0Var, String str, String str2, String str3, String str4, onm onmVar) {
        jy11 jy11Var;
        String str5;
        String str6;
        String str7;
        Context context2;
        Context context3;
        Object objY;
        String str8;
        fcf0 fcf0Var;
        String str9;
        Object objY2;
        if (onmVar instanceof jy11) {
            jy11Var = (jy11) onmVar;
            int i = jy11Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                jy11Var.f = i - Integer.MIN_VALUE;
            } else {
                jy11Var = new jy11(onmVar);
            }
        } else {
            jy11Var = new jy11(onmVar);
        }
        Object objR = jy11Var.e;
        int i2 = jy11Var.f;
        Object obj = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objR);
            qdf0 qdf0VarC = C(context, qcf0Var, str4);
            jy11Var.a = context;
            str5 = str;
            jy11Var.b = str5;
            jy11Var.c = str2;
            str6 = str3;
            jy11Var.d = str6;
            jy11Var.f = 1;
            ohd ohdVar = new ohd(1, aym.t(jy11Var));
            ohdVar.t();
            qdf0VarC.b(new jdf0(ohdVar, (byte) 4));
            qdf0VarC.a(new jdf0(ohdVar, (byte) 5));
            objR = ohdVar.r();
            if (objR != d9nVar) {
                str7 = str2;
                context2 = context;
            }
            return d9nVar;
        }
        if (i2 == 1) {
            String str10 = (String) jy11Var.d;
            String str11 = jy11Var.c;
            String str12 = jy11Var.b;
            context2 = (Context) jy11Var.a;
            hm5.M(objR);
            str6 = str10;
            str7 = str11;
            str5 = str12;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fcf0 fcf0Var2 = (fcf0) jy11Var.a;
                hm5.M(objR);
                return fcf0Var2;
            }
            fcf0Var = (fcf0) jy11Var.d;
            str9 = jy11Var.c;
            str8 = jy11Var.b;
            context3 = (Context) jy11Var.a;
            hm5.M(objR);
        }
        jy11Var.a = fcf0Var;
        jy11Var.b = null;
        jy11Var.c = null;
        jy11Var.d = null;
        jy11Var.f = 3;
        if (!fcf0Var.f.isEmpty()) {
            fns fnsVar = igu.a;
            Context context4 = context3;
            objY2 = fn31.Y(b3s.c, new c6h0(fcf0Var, context4, str8, str9, (lnm) null, (byte) 22), jy11Var);
            if (objY2 == d9nVar) {
                obj = objY2;
            }
        }
        if (obj != d9nVar) {
            return d9nVar;
        }
        return fcf0Var;
        fcf0 fcf0Var3 = (fcf0) objR;
        jy11Var.a = context2;
        jy11Var.b = str7;
        jy11Var.c = str6;
        jy11Var.d = fcf0Var3;
        jy11Var.f = 2;
        if (fcf0Var3.d.isEmpty()) {
            objY = obj;
            context3 = context2;
        } else {
            fns fnsVar2 = igu.a;
            Context context5 = context2;
            context3 = context5;
            objY = fn31.Y(b3s.c, new i3y0(fcf0Var3, context5, str5, (lnm) null, (byte) 13), jy11Var);
            if (objY != d9nVar) {
                objY = obj;
            }
        }
        if (objY != d9nVar) {
            str8 = str7;
            fcf0Var = fcf0Var3;
            str9 = str6;
            jy11Var.a = fcf0Var;
            jy11Var.b = null;
            jy11Var.c = null;
            jy11Var.d = null;
            jy11Var.f = 3;
            if (!fcf0Var.f.isEmpty()) {
                fns fnsVar3 = igu.a;
                Context context6 = context3;
                objY2 = fn31.Y(b3s.c, new c6h0(fcf0Var, context6, str8, str9, (lnm) null, (byte) 22), jy11Var);
                if (objY2 == d9nVar) {
                    obj = objY2;
                }
            }
            if (obj != d9nVar) {
                return fcf0Var;
            }
        }
        return d9nVar;
    }

    public static final qdf0 C(Context context, qcf0 qcf0Var, String str) {
        if (qcf0Var instanceof ocf0) {
            if (!u890.j(str, "__LottieInternalDefaultCacheKey__")) {
                return kcf0.e(((ocf0) qcf0Var).a, context, str);
            }
            int i = ((ocf0) qcf0Var).a;
            return kcf0.e(i, context, kcf0.l(context, i));
        }
        if (!(qcf0Var instanceof pcf0)) {
            eg.o();
            return null;
        }
        if (!u890.j(str, "__LottieInternalDefaultCacheKey__")) {
            return kcf0.g(context, ((pcf0) qcf0Var).a, str);
        }
        String str2 = ((pcf0) qcf0Var).a;
        HashMap map = kcf0.a;
        return kcf0.g(context, str2, "url_" + str2);
    }

    public static final float[] D(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f = fArr[0] * fArr2[0];
        float f2 = fArr[3];
        float f3 = fArr2[1];
        float f4 = fArr[6];
        float f5 = fArr2[2];
        fArr3[0] = (f4 * f5) + (f2 * f3) + f;
        float f6 = fArr[1];
        float f7 = fArr2[0];
        float f8 = fArr[4];
        float f9 = fArr[7];
        float f10 = f9 * f5;
        fArr3[1] = f10 + (f3 * f8) + (f6 * f7);
        float f11 = fArr[2] * f7;
        float f12 = fArr[5];
        float f13 = (fArr2[1] * f12) + f11;
        float f14 = fArr[8];
        fArr3[2] = (f5 * f14) + f13;
        float f15 = fArr[0];
        float f16 = fArr2[3] * f15;
        float f17 = fArr2[4];
        float f18 = (f2 * f17) + f16;
        float f19 = fArr2[5];
        fArr3[3] = (f4 * f19) + f18;
        float f20 = fArr[1];
        float f21 = fArr2[3];
        float f22 = f8 * f17;
        fArr3[4] = (f9 * f19) + f22 + (f20 * f21);
        float f23 = fArr[2];
        float f24 = f19 * f14;
        fArr3[5] = f24 + (f12 * fArr2[4]) + (f21 * f23);
        float f25 = f15 * fArr2[6];
        float f26 = fArr[3];
        float f27 = fArr2[7];
        float f28 = (f26 * f27) + f25;
        float f29 = fArr2[8];
        fArr3[6] = (f4 * f29) + f28;
        float f30 = fArr2[6];
        float f31 = f9 * f29;
        fArr3[7] = f31 + (fArr[4] * f27) + (f20 * f30);
        float f32 = f14 * f29;
        fArr3[8] = f32 + (fArr[5] * fArr2[7]) + (f23 * f30);
        return fArr3;
    }

    public static final float[] E(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        fArr2[1] = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        fArr2[2] = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        return fArr2;
    }

    public static ksk0 F() {
        return new ksk0((byte) 1);
    }

    public static final ncf0 G(qcf0 qcf0Var, String str, xu30 xu30Var, b0k b0kVar, int i, int i2) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.j0(-1248473602);
        if ((i2 & 16) != 0) {
            str = "__LottieInternalDefaultCacheKey__";
        }
        String str2 = str;
        if ((i2 & 32) != 0) {
            xu30Var = new bz0(3, (lnm) null, (byte) 26);
        }
        xu30 xu30Var2 = xu30Var;
        Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
        x340Var.j0(1388713922);
        int i3 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i3 > 4 && x340Var.g(qcf0Var)) || (i & 6) == 4;
        Object objT = x340Var.T();
        if (z2 || objT == m4cVar) {
            objT = v8r.q(new ncf0());
            x340Var.s0(objT);
        }
        ven0 ven0Var = (ven0) objT;
        x340Var.r(false);
        x340Var.j0(1388714213);
        boolean z3 = (i3 > 4 && x340Var.g(qcf0Var)) || (i & 6) == 4;
        if ((((57344 & i) ^ 24576) <= 16384 || !x340Var.g(str2)) && (i & 24576) != 16384) {
            z = false;
        }
        boolean z4 = z3 | z;
        Object objT2 = x340Var.T();
        if (z4 || objT2 == m4cVar) {
            objT2 = C(context, qcf0Var, str2);
            x340Var.s0(objT2);
        }
        x340Var.r(false);
        qxd0.s(qcf0Var, str2, new nx(xu30Var2, context, qcf0Var, str2, ven0Var, (lnm) null), x340Var);
        ncf0 ncf0Var = (ncf0) ven0Var.getValue();
        x340Var.r(false);
        return ncf0Var;
    }

    public static final List H(List list) {
        if (list.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (((InetAddress) obj) instanceof Inet6Address) {
                    arrayList.add(obj);
                } else {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList.isEmpty() && !arrayList2.isEmpty()) {
                byte[] bArr = w4n1.a;
                Iterator it = arrayList.iterator();
                Iterator it2 = arrayList2.iterator();
                smc0 smc0VarN = k4p1.n();
                while (true) {
                    if (!it.hasNext() && !it2.hasNext()) {
                        return k4p1.k(smc0VarN);
                    }
                    if (it.hasNext()) {
                        smc0VarN.add(it.next());
                    }
                    if (it2.hasNext()) {
                        smc0VarN.add(it2.next());
                    }
                }
            }
        }
        return list;
    }

    public static pl10[] I(kce1 kce1Var) {
        return kce1Var.a() ? vpq0.a : new pl10[]{vpq0.b};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void a(wc1 wc1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-774776986);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(wc1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            int iC = l1d.C(wc1Var.a);
            if (iC == 0) {
                x340Var.i0(-226723197);
                h(wc1Var, iu30Var, x340Var, i3 & 1022);
                x340Var.r(false);
            } else if (iC == 1) {
                x340Var.i0(-226626260);
                h(wc1Var, iu30Var, x340Var, i3 & 1022);
                f(null, x340Var, 0);
                x340Var.r(false);
            } else {
                if (iC != 2) {
                    throw p3d1.k(x340Var, -1531335844, false);
                }
                x340Var.i0(-226508677);
                h(wc1Var, iu30Var, x340Var, i3 & 1022);
                d(wc1Var, iu30Var, null, x340Var, i3 & 126);
                x340Var.r(false);
            }
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zc1(wc1Var, iu30Var, qim0Var2, i, (byte) 0);
        }
    }

    public static final void b(c3a c3aVar, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        int i3;
        int i4;
        String strN0;
        hax haxVar;
        m4c m4cVar = fkj0.X;
        String str = c3aVar.b;
        nji0 nji0Var = c3aVar.c;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1769450198);
        if ((i & 6) == 0) {
            i2 = i | (b0kVar3.i(c3aVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(function0) ? 32 : 16;
        }
        int i5 = i2 | 384;
        if (b0kVar3.Y(i5 & 1, (i5 & 147) != 146)) {
            boolean zM = wro1.M(nji0Var);
            String strO0 = cwl1.o0(b0kVar3, 2131958506);
            if (zM) {
                i3 = 1557528054;
                i4 = 2131958505;
            } else {
                i3 = 1557619349;
                i4 = 2131958504;
            }
            String strK = x0d.k(b0kVar3, i3, i4, b0kVar3, false);
            if (zM) {
                b0kVar3.i0(1557756927);
                strN0 = cwl1.n0(2131958502, new Object[]{str}, b0kVar3);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(1557902782);
                strN0 = cwl1.n0(2131958501, new Object[]{str}, b0kVar3);
                b0kVar3.r(false);
            }
            boolean z = (i5 & 112) == 32;
            Object objT = b0kVar3.T();
            byte b2 = 6;
            if (z || objT == m4cVar) {
                objT = new pj8(function0, (byte) 6);
                b0kVar3.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function1);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = uyn1.z(4.0f, 0.0f, 2, qim0Var3);
            boolean zG = b0kVar3.g(strN0);
            Object objT2 = b0kVar3.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new nb9(strN0, (byte) 7);
                b0kVar3.s0(objT2);
            }
            qim0 qim0VarB = s161.b(qim0VarZ, false, (iu30) objT2);
            if (nji0Var instanceof mji0) {
                b0kVar3.i0(1558368712);
                haxVar = new hax(cwl1.o0(b0kVar3, 2131958503));
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(1558502694);
                b0kVar3.r(false);
                haxVar = jax.a;
            }
            hax haxVar2 = haxVar;
            qim0Var2 = qim0Var3;
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarB, null, haxVar2, false, null, null, gbxVar, null, null, null, null, apo.r(2073330334, new p3(strK, (byte) 25), b0kVar3), apo.r(-1936501059, new aw1(b2, zM), b0kVar3), null, null, apo.r(-1081093350, new p3(strO0, (byte) 26), b0kVar3), b0kVar2, 0, 197040, 26554);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new xx(c3aVar, function0, qim0Var2, i, (byte) 22);
        }
    }

    public static final void c(int i, j2i j2iVar, b0k b0kVar) {
        vu30 vu30Var = y580.Y;
        llj lljVar = y580.R0;
        llj lljVar2 = y580.N0;
        llj lljVar3 = y580.O0;
        gra graVar = een.d;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-915253799);
        j06 j06Var = x340Var.a;
        if (!x340Var.Y(i & 1, (i & 3) != 2)) {
            x340Var.b0();
        } else {
            if (!((Boolean) x340Var.k(bsl.a)).booleanValue()) {
                x340Var.i0(-1873434837);
                j2iVar.invoke(x340Var, 6);
                x340Var.r(false);
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new pu2(j2iVar, i, (byte) 19);
                    return;
                }
                return;
            }
            x340Var.i0(-1873406007);
            x340Var.r(false);
            aul aulVar = (aul) x340Var.k(fde0.a);
            ven0 ven0VarA = gfe0.a(x340Var);
            smc0 smc0VarN = k4p1.n();
            if (aulVar instanceof ytl) {
                smc0VarN.add(new d8r(f4i1.c(((ytl) aulVar).a, "INDEX:"), z4p1.g(4283215696L)));
            }
            if (((op80) ven0VarA.getValue()).a(ns80.X0) != null) {
                bhn0.d();
                return;
            }
            smc0VarN.addAll(z6x.a);
            smc0 smc0VarK = k4p1.k(smc0VarN);
            if (smc0VarK.isEmpty()) {
                x340Var.i0(-1873067797);
                j2iVar.invoke(x340Var, 6);
                x340Var.r(false);
                h311 h311VarV2 = x340Var.v();
                if (h311VarV2 != null) {
                    h311VarV2.d = new pu2(j2iVar, i, (byte) 20);
                    return;
                }
                return;
            }
            x340Var.i0(-1873038967);
            x340Var.r(false);
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            Function0 function0 = hmb0.t1;
            if (z) {
                x340Var.l(function0);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar3);
            nko1.H(xos0VarM, x340Var, lljVar2);
            x0d.q(iHashCode, x340Var, lljVar, x340Var);
            nko1.H(qim0VarE, x340Var, vu30Var);
            j2iVar.invoke(x340Var, 6);
            x340Var.i0(1643380512);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            rmc0 rmc0VarListIterator = smc0VarK.listIterator(0);
            while (true) {
                rmc0 rmc0Var = rmc0VarListIterator;
                if (!rmc0Var.hasNext()) {
                    break;
                }
                Object next = rmc0Var.next();
                ((d8r) next).getClass();
                gra graVar2 = een.f;
                Object arrayList = linkedHashMap.get(graVar2);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(graVar2, arrayList);
                }
                ((List) arrayList).add(next);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                tl3 tl3Var = (tl3) entry.getKey();
                List<d8r> list = (List) entry.getValue();
                qim0 qim0VarA = h2c.a.a(qim0Var, tl3Var);
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarA);
                hzj.A.getClass();
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(function0);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar3);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar, x340Var);
                nko1.H(qim0VarE2, x340Var, vu30Var);
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0Var);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(function0);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA, x340Var, lljVar3);
                nko1.H(xos0VarM3, x340Var, lljVar2);
                x0d.q(iHashCode3, x340Var, lljVar, x340Var);
                nko1.H(qim0VarE3, x340Var, vu30Var);
                x340Var.i0(1063136544);
                for (d8r d8rVar : list) {
                    x340 x340Var2 = x340Var;
                    String str = d8rVar.a;
                    uwr uwrVar = cbx.a;
                    uwo1.e(str, uyn1.y(dug.f(uyn1.x(qim0Var, 1.0f), d8rVar.b, er31.b(4.0f)), 3.0f, 1.0f), lee1.a(cbx.d(x340Var2).j, 0L, fc11.G(9), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213), u7h.f, null, null, 0, false, null, 0, null, x340Var2, 3072, 0, 2032);
                    qim0Var = qim0Var;
                    x340Var = x340Var2;
                    function0 = function0;
                    vu30Var = vu30Var;
                }
                us71.m(x340Var, false, true, true);
                function0 = function0;
                vu30Var = vu30Var;
            }
            x340Var.r(false);
            x340Var.r(true);
        }
        h311 h311VarV3 = x340Var.v();
        if (h311VarV3 != null) {
            h311VarV3.d = new pu2(j2iVar, i, (byte) 21);
        }
    }

    public static final void d(wc1 wc1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(633238146);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(wc1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            boolean z = (i3 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new cr0(iu30Var, (byte) 9);
                x340Var.s0(objT);
            }
            mqo1.e((Function0) objT, null, null, y3i.c, y3i.d, apo.r(-1610687808, new n2(iu30Var, wc1Var), x340Var), apo.r(412811743, new sm(iu30Var), x340Var), x340Var, 1797120, 6);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zc1(wc1Var, iu30Var, qim0Var2, i, (byte) 1);
        }
    }

    public static final void e(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1245297973);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            float f = if71.c;
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarN = anm1.N("LoadingHorizontalListSection", u291.f(u291.j(f, 0.0f, 2, qim0Var2), 1.0f));
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            zzq0 zzq0Var = new zzq0(12.0f, 8.0f, 12.0f, 8.0f);
            cvx cvxVar3 = cbx.b(x340Var).b;
            d36 d36Var = new d36(8.0f, true, new um5(false));
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = u0e0.Y0;
                x340Var.s0(objT);
            }
            ujo1.e(qim0VarN, null, zzq0Var, d36Var, null, null, false, null, (iu30) objT, x340Var, 817889280, 362);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ns30(qim0Var, i, (byte) 24);
        }
    }

    public static final void f(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-645892818);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            gra graVar = een.h;
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var2, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarD, cbx.a(x340Var).a.b.a(), d4o1.a);
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            zov0 zov0Var = cbx.b(x340Var).g;
            rhx0.a(u291.v(qim0Var2, 24.0f), cbx.a(x340Var).c.c, 0.0f, 0L, 0, 0.0f, x340Var, 0, 60);
            x340Var.r(true);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b5(qim0Var, i, (byte) 4);
        }
    }

    public static final void g(qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1309523987);
        int i2 = i | (b0kVar3.i(qim0Var) ? 4 : 2);
        if (b0kVar3.Y(i2 & 1, (i2 & 3) != 2)) {
            b0kVar2 = b0kVar3;
            jto1.b(qim0Var, new uvx(1, (pgx) null, 3, (vzq0) null, (zzq0) null, (tvx) null, (hw61) null, 2, (p3v) null, 378), null, false, null, null, null, null, null, xqj.d, null, xqj.e, null, null, null, xqj.f, b0kVar2, (i2 & 14) | 805306432, 196656, 30204);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wfe1(qim0Var, i, (byte) 19);
        }
    }

    public static final void h(wc1 wc1Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        wc1 wc1Var2;
        iu30 iu30Var2;
        gex0 gex0Var;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        pl3 pl3Var = een.Z;
        era eraVar = een.Q0;
        m4c m4cVar = fkj0.X;
        fc1 fc1Var = wc1Var.b;
        y0x0 y0x0Var = fc1Var.c;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1082614728);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(wc1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i & 384;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 256 : 128;
        }
        int i4 = i2;
        if (x340Var.Y(i4 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            era eraVar2 = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar2, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar4);
            nko1.H(xos0VarM, x340Var, lljVar3);
            x0d.q(iHashCode, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE, x340Var, lljVar);
            pl3 pl3Var2 = pl3Var;
            m4c m4cVar2 = m4cVar;
            bzn1.e(null, null, false, null, null, null, null, null, x340Var, 0, 255);
            qim0 qim0VarH = l6o1.H(u291.d(nim0Var, 1.0f), l6o1.C(0, 0, 1, x340Var), false, 14);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarA = uyn1.A(qim0VarH, 16.0f, 16.0f, 16.0f, cbx.b(x340Var).b.c);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar2, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarA);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar4);
            nko1.H(xos0VarM2, x340Var, lljVar3);
            x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar);
            fc11.a(mqo1.s(Arrays.copyOf(new phx[]{new phx(2, z4p1.e(y0x0Var.c), y0x0Var.b, (String) null, y0x0Var.a)}, 1)), ktd.m(eraVar, uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 8.0f, 7)), hcx.e, (hux) null, false, 0, (gbx) null, (String) null, (idn0) null, x340Var, 392, 504);
            uwo1.e(y0x0Var.a, ktd.m(eraVar, uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 32.0f, 7)), cbx.d(x340Var).e, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
            uwo1.e(fc1Var.b, uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 16.0f, 7), cbx.d(x340Var).j, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
            uwo1.e(fc1Var.d, null, cbx.d(x340Var).k, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
            x340 x340Var2 = x340Var;
            x340Var2.i0(-857788706);
            Iterator it = fc1Var.e.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                gex0Var = h36.a;
                if (!zHasNext) {
                    break;
                }
                String str = (String) it.next();
                pl3 pl3Var3 = pl3Var2;
                jw31 jw31VarA = ew31.a(gex0Var, pl3Var3, x340Var2, 0);
                int iHashCode3 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM3 = x340Var2.m();
                qim0 qim0VarE3 = zr7.E(x340Var2, nim0Var);
                hzj.A.getClass();
                x340Var2.m0();
                Iterator it2 = it;
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(jw31VarA, x340Var2, lljVar4);
                nko1.H(xos0VarM3, x340Var2, lljVar3);
                x0d.q(iHashCode3, x340Var2, lljVar2, x340Var2);
                nko1.H(qim0VarE3, x340Var2, lljVar);
                uwr uwrVar2 = cbx.a;
                lee1 lee1Var = cbx.d(x340Var2).j;
                Object objT = x340Var2.T();
                m4c m4cVar3 = m4cVar2;
                if (objT == m4cVar3) {
                    objT = gx0.R0;
                    x340Var2.s0(objT);
                }
                x340 x340Var3 = x340Var2;
                uwo1.e(" • ", s161.b(nim0Var, false, (iu30) objT), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var3, 6, 0, 2040);
                uwo1.e(str, null, cbx.d(x340Var3).j, 0L, null, null, 0, false, null, 0, null, x340Var3, 0, 0, 2042);
                x340Var2 = x340Var3;
                x340Var2.r(true);
                pl3Var2 = pl3Var3;
                m4cVar2 = m4cVar3;
                it = it2;
            }
            m4c m4cVar4 = m4cVar2;
            pl3 pl3Var4 = pl3Var2;
            x340Var2.r(false);
            x340 x340Var4 = x340Var2;
            String str2 = fc1Var.f;
            uwr uwrVar3 = cbx.a;
            uwo1.e(str2, uyn1.B(nim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), cbx.d(x340Var4).k, 0L, null, null, 0, false, null, 0, null, x340Var4, 0, 0, 2040);
            x340 x340Var5 = x340Var4;
            x340Var5.i0(-857772706);
            Iterator it3 = fc1Var.g.iterator();
            while (it3.hasNext()) {
                String str3 = (String) it3.next();
                jw31 jw31VarA2 = ew31.a(gex0Var, pl3Var4, x340Var5, 0);
                int iHashCode4 = Long.hashCode(x340Var5.T);
                xos0 xos0VarM4 = x340Var5.m();
                pl3 pl3Var5 = pl3Var4;
                qim0 qim0VarE4 = zr7.E(x340Var5, nim0Var);
                hzj.A.getClass();
                x340Var5.m0();
                Iterator it4 = it3;
                if (x340Var5.S) {
                    x340Var5.l(n4kVar);
                } else {
                    x340Var5.v0();
                }
                nko1.H(jw31VarA2, x340Var5, lljVar4);
                nko1.H(xos0VarM4, x340Var5, lljVar3);
                x0d.q(iHashCode4, x340Var5, lljVar2, x340Var5);
                nko1.H(qim0VarE4, x340Var5, lljVar);
                uwr uwrVar4 = cbx.a;
                lee1 lee1Var2 = cbx.d(x340Var5).j;
                Object objT2 = x340Var5.T();
                if (objT2 == m4cVar4) {
                    objT2 = gx0.S0;
                    x340Var5.s0(objT2);
                }
                x340 x340Var6 = x340Var5;
                uwo1.e(" • ", s161.b(nim0Var, false, (iu30) objT2), lee1Var2, 0L, null, null, 0, false, null, 0, null, x340Var6, 6, 0, 2040);
                uwo1.e(str3, null, cbx.d(x340Var6).j, 0L, null, null, 0, false, null, 0, null, x340Var6, 0, 0, 2042);
                x340Var5 = x340Var6;
                x340Var5.r(true);
                it3 = it4;
                pl3Var4 = pl3Var5;
            }
            x340Var5.r(false);
            int i5 = i4 & 112;
            wc1Var2 = wc1Var;
            boolean zI = (i5 == 32) | x340Var5.i(wc1Var2);
            Object objT3 = x340Var5.T();
            if (zI || objT3 == m4cVar4) {
                iu30Var2 = iu30Var;
                objT3 = new ad1(iu30Var2, wc1Var2, (byte) 1);
                x340Var5.s0(objT3);
            } else {
                iu30Var2 = iu30Var;
            }
            x340 x340Var7 = x340Var5;
            z50 z50Var = z50.c;
            foo1.c(new gbx(z50Var, (Function0) objT3), new idx(4), ktd.m(eraVar, uyn1.B(nim0Var, 0.0f, 24.0f, 0.0f, 0.0f, 13)), null, yla.r(x340Var7), null, null, null, null, null, y3i.a, x340Var7, 0, 48, 2008);
            boolean z2 = i5 == 32;
            Object objT4 = x340Var7.T();
            if (z2 || objT4 == m4cVar4) {
                objT4 = new cr0(iu30Var2, (byte) 11);
                x340Var7.s0(objT4);
            }
            foo1.c(new gbx(z50Var, (Function0) objT4), ldx.c, new tq60(eraVar), null, yla.r(x340Var7), null, null, null, null, null, y3i.b, x340Var7, 0, 48, 2008);
            x340Var = x340Var7;
            x340Var.r(true);
            x340Var.r(true);
        } else {
            wc1Var2 = wc1Var;
            iu30Var2 = iu30Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g90(wc1Var2, iu30Var2, i);
        }
    }

    public static final void i(ArrayList arrayList, p081 p081Var, vnr vnrVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1900192818);
        int i2 = (i & 6) == 0 ? ((i & 8) == 0 ? x340Var.g(arrayList) : x340Var.i(arrayList) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(p081Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var.g(vnrVar) : x340Var.i(vnrVar) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof c181) {
                    arrayList2.add(obj);
                }
            }
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = rz71.e;
                x340Var.s0(objT);
            }
            t5p1.d(arrayList2, (iu30) objT, vnrVar, null, null, null, apo.r(1258754100, new cq61(p081Var, (byte) 8), x340Var), x340Var, (i2 & 896) | 805306416);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kk31(arrayList, p081Var, vnrVar, i, (byte) 25);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void j(h181 h181Var, p081 p081Var, vnr vnrVar, iuj iujVar, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1623900555);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(h181Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(p081Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var.g(vnrVar) : x340Var.i(vnrVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iujVar) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            iujVar.a(h181Var.a(), x340Var, (i3 >> 6) & 112);
            if (h181Var instanceof f181) {
                x340Var.i0(-67493972);
                ArrayList arrayList = ((f181) h181Var).a;
                if (arrayList.isEmpty()) {
                    x340Var.i0(-67266463);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-67454819);
                    i(arrayList, p081Var, vnrVar, x340Var, i3 & 1008);
                    x340Var.r(false);
                }
                x340Var.r(false);
            } else {
                if (!(h181Var instanceof g181)) {
                    throw p3d1.k(x340Var, -1110557085, false);
                }
                x340Var.i0(-1110547419);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ay71((byte) 2, i, (Object) h181Var, (Object) p081Var, (Object) vnrVar, (Object) iujVar, (Object) qim0Var2);
        }
    }

    public static final void k(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1658400766);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF = dug.f(qim0Var, jA, er31.b(4.0f));
            cua cuaVar2 = cbx.b(x340Var).f;
            qim0 qim0VarL0 = cwl1.l0(qim0VarF, 0L, er31.b(4.0f), 13);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarL0);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwo1.e(" ", null, null, u7h.j, null, null, 0, false, null, 0, null, x340Var, 6, 0, 2038);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wfe1(qim0Var, i, (byte) 20);
        }
    }

    public static final void l(String str, String str2, String str3, boolean z, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1540475718);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(str2) ? 32 : 16) | (b0kVar3.g(str3) ? 256 : 128) | (b0kVar3.h(z) ? 2048 : 1024) | (b0kVar3.i(function0) ? 16384 : 8192) | (b0kVar3.i(qim0Var) ? 131072 : 65536);
        if (b0kVar3.Y(i2 & 1, (74899 & i2) != 74898)) {
            idn0 idn0VarY = zso1.Y(b0kVar3);
            uvx uvxVar = new uvx(1, (pgx) null, 3, (vzq0) null, (zzq0) null, (tvx) null, (hw61) null, 2, (p3v) null, 378);
            String strO0 = cwl1.o0(b0kVar3, 2131963789);
            if (ihc1.y0(strO0)) {
                hhg1.n("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
                return;
            }
            y50 y50Var = new y50(strO0);
            boolean z2 = (57344 & i2) == 16384;
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new tpj1(function0, (byte) 4);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0Var, uvxVar, null, false, idn0VarY, null, new gbx(y50Var, (Function0) objT), null, null, apo.r(-1109541073, new dba1(str3, (byte) 13), b0kVar3), null, apo.r(1680032014, new dba1(str2, (byte) 14), b0kVar3), apo.r(1916201837, new n8k0(z, function0, idn0VarY, (byte) 20), b0kVar3), null, null, apo.r(-1670255990, new dba1(str, (byte) 15), b0kVar3), b0kVar2, ((i2 >> 15) & 14) | 805306432, 197040, 26028);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qzj1(str, str2, str3, z, function0, qim0Var, i, (byte) 0);
        }
    }

    public static final double m(double d) {
        double d2;
        double dPow = d < 0.0d ? -d : d;
        if (dPow >= 0.0031308049535603718d) {
            dPow = Math.pow(dPow, 0.4166666666666667d) - 0.05213270142180095d;
            d2 = 0.9478672985781991d;
        } else {
            d2 = 0.07739938080495357d;
        }
        return Math.copySign(dPow / d2, d);
    }

    public static final double n(double d) {
        double d2 = d < 0.0d ? -d : d;
        return Math.copySign(d2 >= 0.04045d ? Math.pow((0.9478672985781991d * d2) + 0.05213270142180095d, 2.4d) : d2 * 0.07739938080495357d, d);
    }

    public static hah o(hah hahVar) {
        fol1 fol1Var = dm5.c;
        dp5 dp5Var = dp5.e;
        if (jch0.x(hahVar.b, 12884901888L)) {
            je31 je31Var = (je31) hahVar;
            fol1 fol1Var2 = je31Var.d;
            if (!u(fol1Var2, fol1Var)) {
                return new je31(((hah) je31Var).a, je31Var.h, fol1Var, D(p((float[]) dp5Var.b, fol1Var2.a(), fol1Var.a()), je31Var.i), je31Var.k, je31Var.n, je31Var.e, je31Var.f, je31Var.g, -1);
            }
        }
        return hahVar;
    }

    public static final float[] p(float[] fArr, float[] fArr2, float[] fArr3) {
        E(fArr, fArr2);
        E(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrA = A(fArr);
        float f = fArr4[0];
        float f2 = fArr[0] * f;
        float f3 = fArr4[1];
        float f4 = fArr[1] * f3;
        float f5 = fArr4[2];
        return D(fArrA, new float[]{f2, f4, fArr[2] * f5, fArr[3] * f, fArr[4] * f3, fArr[5] * f5, f * fArr[6], f3 * fArr[7], f5 * fArr[8]});
    }

    public static final evz q(mr20 mr20Var, mr20 mr20Var2, mr20 mr20Var3, mr20 mr20Var4, mr20 mr20Var5, dv30 dv30Var) {
        return new evz(new mr20[]{mr20Var, mr20Var2, mr20Var3, mr20Var4, mr20Var5}, dv30Var, (byte) 15);
    }

    public static final evz r(mr20 mr20Var, mr20 mr20Var2, mr20 mr20Var3, mr20 mr20Var4, bv30 bv30Var) {
        return new evz(new mr20[]{mr20Var, mr20Var2, mr20Var3, mr20Var4}, bv30Var, (byte) 14);
    }

    public static final evz s(mr20 mr20Var, mr20 mr20Var2, mr20 mr20Var3, zu30 zu30Var) {
        return new evz(new mr20[]{mr20Var, mr20Var2, mr20Var3}, zu30Var, (byte) 13);
    }

    public static final x010 t(mr20 mr20Var, mr20 mr20Var2, xu30 xu30Var) {
        return new x010(mr20Var, mr20Var2, xu30Var, (byte) 1);
    }

    public static final boolean u(fol1 fol1Var, fol1 fol1Var2) {
        if (fol1Var == fol1Var2) {
            return true;
        }
        return Math.abs(fol1Var.a - fol1Var2.a) < 0.001f && Math.abs(fol1Var.b - fol1Var2.b) < 0.001f;
    }

    public static ucl v(hah hahVar, hah hahVar2) {
        int i = hahVar.c;
        int i2 = hahVar2.c;
        if ((i | i2) < 0) {
            return w(hahVar, hahVar2);
        }
        fdn0 fdn0Var = rfl.a;
        int i3 = i | (i2 << 6);
        Object objB = fdn0Var.b(i3);
        if (objB == null) {
            objB = w(hahVar, hahVar2);
            fdn0Var.i(i3, objB);
        }
        return (ucl) objB;
    }

    public static final ucl w(hah hahVar, hah hahVar2) {
        if (hahVar == hahVar2) {
            return new scl(hahVar, hahVar, 1);
        }
        return (jch0.x(hahVar.b, 12884901888L) && jch0.x(hahVar2.b, 12884901888L)) ? new tcl((je31) hahVar, (je31) hahVar2) : new ucl(hahVar, hahVar2, 0);
    }

    public static cmm x(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    return new cmm(str);
                }
            } catch (SpotifyUriParserException unused) {
                l1d.z("Uri ", str, " is invalid/unsupported.");
            }
        }
        return null;
    }

    public static final x010 y(mr20 mr20Var, zob1 zob1Var, xu30 xu30Var) {
        return new x010(mr20Var, zob1Var, xu30Var, (byte) 1);
    }

    public static final go80 z(klm klmVar, cdp0 cdp0Var, cdp0 cdp0Var2, cdp0 cdp0Var3, cdp0 cdp0Var4, cdp0 cdp0Var5, cdp0 cdp0Var6, cdp0 cdp0Var7, cdp0 cdp0Var8, cdp0 cdp0Var9) {
        return klmVar.a("UsersNearbyDaemon", new ang(cdp0Var, cdp0Var2, cdp0Var3, cdp0Var4, cdp0Var5, cdp0Var6, cdp0Var7, cdp0Var8, cdp0Var9, (byte) 9));
    }
}
