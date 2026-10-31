package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.login.phonenumbersignup.callingcode.CallingCodePickerActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class xpn1 {
    public static final fyd a = new fyd((byte) 7);
    public static b180 b = null;
    public static final float c = 32.0f;

    public static p95 A(nha0 nha0Var, fcf0 fcf0Var, int i) {
        ij81 ij81Var = new ij81((byte) 14);
        ij81Var.b = i;
        ArrayList arrayListA = vua0.a(nha0Var, fcf0Var, 1.0f, ij81Var, false);
        for (int i2 = 0; i2 < arrayListA.size(); i2++) {
            sua0 sua0Var = (sua0) arrayListA.get(i2);
            o650 o650Var = (o650) sua0Var.b;
            o650 o650Var2 = (o650) sua0Var.c;
            if (o650Var != null && o650Var2 != null) {
                float[] fArr = o650Var.a;
                int length = fArr.length;
                float[] fArr2 = o650Var2.a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f = Float.NaN;
                    int i3 = 0;
                    for (int i4 = 0; i4 < length2; i4++) {
                        float f2 = fArr3[i4];
                        if (f2 != f) {
                            fArr3[i3] = f2;
                            i3++;
                            f = fArr3[i4];
                        }
                    }
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i3);
                    sua0Var = new sua0(o650Var.b(fArrCopyOfRange), o650Var2.b(fArrCopyOfRange));
                }
            }
            arrayListA.set(i2, sua0Var);
        }
        return new p95(arrayListA, (byte) 1);
    }

    public static p95 B(nha0 nha0Var, fcf0 fcf0Var) {
        return new p95(vua0.a(nha0Var, fcf0Var, 1.0f, yb10.g, false), false);
    }

    public static p95 C(nha0 nha0Var, fcf0 fcf0Var) {
        return new p95(vua0.a(nha0Var, fcf0Var, qpi1.c(), ak20.Z0, true), (byte) 3);
    }

    public static p95 D(nha0 nha0Var, fcf0 fcf0Var) {
        return new p95(vua0.a(nha0Var, fcf0Var, 1.0f, gex0.i, false), (byte) 4);
    }

    public static p95 E(nha0 nha0Var, fcf0 fcf0Var) {
        return new p95(vua0.a(nha0Var, fcf0Var, qpi1.c(), mw61.a, false), (byte) 5);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object F(Set set, onm onmVar) {
        in41 in41Var;
        if (onmVar instanceof in41) {
            in41Var = (in41) onmVar;
            int i = in41Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                in41Var.b = i - Integer.MIN_VALUE;
            } else {
                in41Var = new in41(onmVar);
            }
        } else {
            in41Var = new in41(onmVar);
        }
        Object objS = in41Var.a;
        int i2 = in41Var.b;
        if (i2 == 0) {
            hm5.M(objS);
            lc41 lc41Var = new lc41(set, (lnm) null, (byte) 5);
            in41Var.b = 1;
            objS = smo1.s(lc41Var, in41Var);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objS);
        }
        return ((pvg1) objS).a;
    }

    public static h491 G(e491... e491VarArr) {
        return new h491(Arrays.asList(e491VarArr));
    }

    public static final Object H(onm onmVar) {
        rih1 rih1Var;
        o8n context = onmVar.getContext();
        op71.x(context);
        vfu vfuVarT = aym.t(onmVar);
        vfu vfuVar = vfuVarT instanceof vfu ? vfuVarT : null;
        rih1 rih1Var2 = d9n.a;
        rih1 rih1Var3 = rih1.a;
        if (vfuVar == null) {
            rih1Var = rih1Var3;
        } else {
            q8n q8nVar = vfuVar.d;
            if (hr80.y(q8nVar, context)) {
                vfuVar.f = rih1Var3;
                ((xfu) vfuVar).c = 1;
                q8nVar.q(context, vfuVar);
            } else {
                fnm1 fnm1Var = new fnm1(fnm1.c);
                o8n o8nVarY = context.y(fnm1Var);
                vfuVar.f = rih1Var3;
                ((xfu) vfuVar).c = 1;
                q8nVar.q(o8nVarY, vfuVar);
                if (fnm1Var.b) {
                    ab00 ab00VarA = jge1.a();
                    if (!ab00VarA.X()) {
                        if (ab00VarA.V()) {
                            vfuVar.f = rih1Var3;
                            ((xfu) vfuVar).c = 1;
                            ab00VarA.R(vfuVar);
                        } else {
                            ab00VarA.T(true);
                            try {
                                vfuVar.run();
                                do {
                                } while (ab00VarA.Z());
                            } catch (Throwable th) {
                                try {
                                    vfuVar.g(th);
                                } catch (Throwable th2) {
                                    ab00VarA.N(true);
                                    throw th2;
                                }
                            }
                            ab00VarA.N(true);
                        }
                    }
                    rih1Var = rih1Var3;
                }
            }
            rih1Var = rih1Var2;
        }
        return rih1Var == rih1Var2 ? rih1Var : rih1Var3;
    }

    public static final void a(uyl uylVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(659004907);
        int i2 = (x340Var.i(uylVar) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            h5p1.c(6, apo.r(1491621749, new pu2(apo.r(-817017285, new zzj(uylVar, (byte) 5), x340Var), (byte) 16), x340Var), x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zzj(uylVar, i, (byte) 2);
        }
    }

    public static final void b(uyl uylVar, vu30 vu30Var, aul aulVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(221147000);
        int i2 = (x340Var.i(uylVar) ? 4 : 2) | i | (x340Var.i(vu30Var) ? 32 : 16) | (x340Var.i(aulVar) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            mod.b(fde0.a.a(aulVar), apo.r(517825208, new vyl(vu30Var, uylVar, aulVar), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vyl(uylVar, vu30Var, aulVar, i);
        }
    }

    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    public static final void c(String str, boolean z, Function0 function0, iu30 iu30Var, Function0 function1, b0k b0kVar, int i) {
        ?? r15;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1285962288);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(iu30Var) ? 2048 : 1024) | (x340Var.i(function1) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            Object[] objArr = new Object[0];
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = xzu.X;
                x340Var.s0(objT);
            }
            ven0 ven0VarV = k5p1.v(objArr, c8e1.d, (Function0) objT, x340Var, 384);
            Object[] objArr2 = new Object[0];
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = xzu.t;
                x340Var.s0(objT2);
            }
            ven0 ven0Var = (ven0) k5p1.s(objArr2, (Function0) objT2, x340Var, 48);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).a.c;
            u5j1 u5j1Var = d4o1.a;
            qim0 qim0VarF = dug.f(qim0VarD, j, u5j1Var);
            u85 u85Var = (erl1) x340Var.k(szf0.b);
            if (u85Var == null) {
                x340Var.i0(-241884180);
                WeakHashMap weakHashMap = osl1.x;
                u85Var = lhc.g(x340Var).g;
                r15 = 0;
            } else {
                r15 = 0;
                x340Var.i0(-241885792);
            }
            x340Var.r((boolean) r15);
            qim0 qim0VarY = too1.y(qim0VarF, u85Var);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, (int) r15);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF2);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            boolean z3 = (i2 & 896) == 256;
            Object objT3 = x340Var.T();
            if (z3 || objT3 == m4cVar) {
                objT3 = new z9t(function0, (byte) 18);
                x340Var.s0(objT3);
            }
            z50 z50Var = z50.c;
            gbx gbxVar = new gbx(z50Var, (Function0) objT3);
            ldx ldxVar = ldx.c;
            gdx gdxVarS = yla.s(x340Var);
            hax haxVar = jax.a;
            byte b2 = 1;
            foo1.c(gbxVar, ldxVar, null, z ? new hax("Saving") : haxVar, gdxVarS, null, null, null, null, null, ski.a, x340Var, 0, 48, 1996);
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            op71.g(x340Var, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            uwo1.e(cwl1.o0(x340Var, 2131953373), null, cbx.d(x340Var).h, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            op71.g(x340Var, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            String string = ihc1.e1(((c8e1) ven0VarV.getValue()).a.b).toString();
            boolean z4 = string.length() > 0 && !z;
            boolean zH = x340Var.h(z4) | ((i2 & 7168) == 2048) | x340Var.g(string);
            Object objT4 = x340Var.T();
            if (zH || objT4 == m4cVar) {
                objT4 = new cpv((byte) 0, string, iu30Var, z4);
                x340Var.s0(objT4);
            }
            foo1.c(new gbx(z50Var, (Function0) objT4), ldxVar, null, z4 ? haxVar : new hax("Done button disabled"), yla.s(x340Var), null, null, null, null, null, ski.b, x340Var, 0, 48, 1996);
            x340Var.r(true);
            qim0 qim0VarO = ab80.o(nim0Var, cbx.b(x340Var).b.a, x340Var, nim0Var, 1.0f);
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarH = u291.h(dug.f(i1p1.q(uyn1.z(16.0f, 0.0f, 2, qim0VarO), er31.b(8.0f)), cbx.a(x340Var).a.b.a(), u5j1Var), 48.0f);
            gfh0 gfh0VarC = t1c.c(een.g, false);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarH);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            c8e1 c8e1Var = (c8e1) ven0VarV.getValue();
            boolean z5 = !z;
            qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarZ2 = uyn1.z(12.0f, 0.0f, 2, qim0VarF3);
            lee1 lee1VarA = lee1.a(cbx.d(x340Var).g, cbx.a(x340Var).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214);
            n6a1 n6a1Var = new n6a1(cbx.a(x340Var).b.c);
            boolean zI = x340Var.i(ven0Var) | x340Var.i(ven0VarV) | ((i2 & 57344) == 16384);
            Object objT5 = x340Var.T();
            if (zI || objT5 == m4cVar) {
                objT5 = new nih(function1, ven0Var, ven0VarV, (byte) 1);
                x340Var.s0(objT5);
            }
            xea.d(c8e1Var, (iu30) objT5, qim0VarZ2, z5, lee1VarA, (kua0) null, (bua0) null, true, 0, 0, (elk1) null, (iu30) null, n6a1Var, apo.r(-823798551, new xt3(str, ven0VarV, b2), x340Var), x340Var, 100663296, 196608, 16080);
            x340Var = x340Var;
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ey((Object) str, z, (Object) function0, (Object) iu30Var, (Object) function1, i, (byte) 14);
        }
    }

    public static final void d(yqg yqgVar, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1440639241);
        int i2 = (x340Var.g((Object) null) ? 4 : 2) | i | (x340Var.h(false) ? 32 : 16) | (x340Var.g(yqgVar) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            x340Var.i0(1474846388);
            int i3 = yqgVar.d().get(11);
            int i4 = 2131958276;
            if (i3 < 17) {
                if (i3 >= 12) {
                    i4 = 2131958275;
                } else if (i3 >= 5) {
                    i4 = 2131958277;
                }
            }
            String strO0 = cwl1.o0(x340Var, i4);
            x340Var.r(false);
            x340Var.i0(1474850515);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).c;
            x340Var.r(false);
            long j = cbx.a(x340Var).b.a;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 0.8f);
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(strO0, uyn1.z(0.0f, 12.0f, 1, qim0VarF), lee1Var, j, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xh00((Object) yqgVar, (Object) qim0Var2, i, (byte) 27);
        }
    }

    public static final void e(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(834259764);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(8.0f, true, new um5(false));
            fra fraVar = een.N0;
            qim0 qim0VarF = dug.f(u291.j(48.0f, 0.0f, 2, u291.f(qim0Var, 1.0f)), cbx.a(x340Var).a.b.a(), er31.b(12.0f));
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new lpx0(function0, (byte) 0);
                x340Var.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarF, false, null, null, null, (Function0) objT, 15);
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarX2 = uyn1.x(qim0VarX, 16.0f);
            jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX2);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            ulx ulxVar = ulx.c;
            long j = cbx.a(x340Var).b.b;
            nim0 nim0Var = nim0.a;
            w0h1.a(ulxVar, isl.a, u291.h(nim0Var, 16.0f), j, 0L, false, x340Var, ulx.d | 48, 48);
            String strO0 = cwl1.o0(x340Var, 2131960629);
            long j2 = cbx.a(x340Var).b.b;
            lee1 lee1Var = cbx.d(x340Var).j;
            cvx cvxVar3 = cbx.b(x340Var).b;
            uwo1.e(strO0, uyn1.B(nim0Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), lee1Var, j2, new a0e1(5), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bb50(qim0Var, function0, i, (byte) 23);
        }
    }

    public static final void f(uyl uylVar, b0k b0kVar, int i) {
        j2i j2iVar = kfi.a;
        j2i j2iVar2 = kfi.b;
        j2i j2iVar3 = kfi.a;
        j2i j2iVar4 = kfi.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(271762077);
        int i2 = (x340Var.i(uylVar) ? 4 : 2) | i;
        if (!x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            x340Var.b0();
        } else if (uylVar instanceof fuj) {
            x340Var.i0(-829635583);
            fuj fujVar = (fuj) uylVar;
            j2iVar.J(fujVar.a, fujVar.c, x340Var, 384);
            x340Var.r(false);
        } else if (uylVar instanceof d2i) {
            x340Var.i0(-829633287);
            j2iVar2.invoke(((d2i) uylVar).a, x340Var, 48);
            x340Var.r(false);
        } else {
            if (uylVar instanceof aak1) {
                x340Var.i0(-829631106);
                throw null;
            }
            x340Var.i0(51341637);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zzj(uylVar, i, (byte) 6);
        }
    }

    public static final void g(vu30 vu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1511558648);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(vu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b2 = 14;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new pm0(vu30Var, (byte) 1);
                x340Var.s0(objT);
            }
            dm5.a((iu30) objT, (qim0) null, (iu30) null, x340Var, 0, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new du0(vu30Var, i, b2);
        }
    }

    public static final void h(maa maaVar, Object obj, b0k b0kVar, int i) {
        int i2;
        maa maaVar2;
        Object obj2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1343854663);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(maaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(obj) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            maaVar2 = maaVar;
            obj2 = obj;
            otw.c(maaVar2, obj2, (qim0) null, (ipb1) null, x340Var, i2 & 126, 12);
        } else {
            maaVar2 = maaVar;
            obj2 = obj;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bkh(maaVar2, obj2, i, (byte) 7);
        }
    }

    public static final void i(laa laaVar, Object obj, b0k b0kVar, int i) {
        int i2;
        Object obj2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(654923532);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(laaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(obj) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            obj2 = obj;
            otw.c(q1o1.u(laaVar, null, null, 7), obj2, (qim0) null, (ipb1) null, x340Var, i2 & 112, 12);
        } else {
            obj2 = obj;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bkh(laaVar, obj2, i, (byte) 8);
        }
    }

    public static final void j(gt40 gt40Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(789079799);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            gt40 gt40Var2 = et40.a;
            j2h1.b(eqr0.E(gt40Var2, 12.0f), (ql3) null, wkj.a, x340Var, 384, 2);
            gt40Var = gt40Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m7x(gt40Var, i, (byte) 3);
        }
    }

    public static final Object[] k(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        f46.W(0, i, 6, objArr, objArr2);
        f46.Q(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] l(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        f46.W(0, i, 6, objArr, objArr2);
        f46.Q(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] m(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        f46.W(0, i, 6, objArr, objArr2);
        f46.Q(i, i + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] n(Object[] objArr, int i, int i2, kug1 kug1Var) {
        Object[] objArr2 = new Object[objArr.length - 1];
        f46.W(0, i, 6, objArr, objArr2);
        f46.Q(i, i + 2, i2, objArr, objArr2);
        objArr2[i2 - 2] = kug1Var;
        f46.Q(i2 - 1, i2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] o(int i, int i2, Object obj, Object obj2, Object[] objArr) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        f46.Q(i + 2, i + 1, objArr.length, objArrCopyOf, objArrCopyOf);
        f46.Q(i2 + 2, i2, i, objArrCopyOf, objArrCopyOf);
        objArrCopyOf[i2] = obj;
        objArrCopyOf[i2 + 1] = obj2;
        return objArrCopyOf;
    }

    public static void p(os11 os11Var, o241 o241Var, tzr0 tzr0Var, tzo tzoVar, yyo yyoVar, fap fapVar, vyo vyoVar, drp0 drp0Var, xyo xyoVar, kwn kwnVar, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, iu30 iu30Var4, iu30 iu30Var5, iu30 iu30Var6, iu30 iu30Var7, d771 d771Var, ycm ycmVar, boolean z, kaz kazVar, du11 du11Var, tld1 tld1Var, yqg yqgVar, boolean z2, Context context, boolean z3, boolean z4, boolean z5, q8n q8nVar, q8n q8nVar2, vb2 vb2Var, boolean z6, int i, int i2) {
        du11 du11Var2 = (i & 1048576) != 0 ? null : du11Var;
        boolean z7 = (i & 2097152) == 0;
        tld1 tld1Var2 = (i & 4194304) != 0 ? t8z.a : tld1Var;
        Context context2 = (i & 33554432) != 0 ? null : context;
        boolean z8 = (i & 67108864) != 0 ? false : z3;
        boolean z9 = (i & 134217728) != 0 ? false : z4;
        boolean z10 = (i & 268435456) != 0 ? false : z5;
        boolean z11 = (i2 & 1) == 0 ? z6 : false;
        os11Var.r = new lvc1(kqn1.s(true, z2), dm61.B0(new yp21[]{new yp21(den.class), z8 ? new yp21(n4v0.class) : null}), new bdz(new tf((Object) context2, z2, (Object) yqgVar, (Object) ((!z8 || context2 == null) ? null : new twb((byte) 9)), (byte) 10)), (byte) 26);
        os11Var.o = z10;
        os11Var.g = new mka((byte) 3);
        os11Var.y = 1;
        os11Var.k = new hzw(kwnVar, (byte) 13);
        os11Var.p = z9;
        if (z11) {
            os11Var.x = new cjx0(Collections.singleton(u7n0.a));
        }
        os11Var.j = new a2(new hzw(tzoVar, (byte) 11), (byte) 12);
        qw1 qw1Var = new qw1(tzr0Var, kwnVar, (dvn) tld1Var2, q8nVar, q8nVar2, iu30Var7, vb2Var, z7, tzoVar);
        br11 br11Var = br11.W0;
        w7x w7xVar = w7x.a;
        os11Var.e = two1.q(br11Var, w7xVar, qw1Var);
        ozw ozwVar = new ozw(iu30Var, q8nVar2, (byte) 26);
        rih1 rih1Var = rih1.a;
        os11Var.a = new d50(Collections.singletonMap(rih1Var, w7xVar), ozwVar);
        du11 du11Var3 = du11Var2;
        os11Var.b = new d50(Collections.singletonMap(rih1Var, f46.S0(new yp21[]{new yp21(bku.class), new yp21(prl.class)})), new x8z(yyoVar, iu30Var3, fapVar, iu30Var4, xyoVar, iu30Var6, iu30Var5, o241Var, drp0Var, vyoVar, iu30Var2, q8nVar2));
        os11Var.c = new d50(Collections.singletonMap(rih1Var, c13.i(vn71.class)), new ozw(d771Var, q8nVar2, (byte) 27));
        os11Var.d = new d50(Collections.singletonMap(rih1Var, w7xVar), new zs((Object) ycmVar, (Object) iu30Var7, z, (byte) 16));
        if (kazVar != null) {
            os11Var.h = kazVar;
        }
        if (du11Var3 != null) {
            os11Var.i = du11Var3;
        }
    }

    public static Intent q(Context context, m0d m0dVar) {
        Intent intent = new Intent(context, (Class<?>) CallingCodePickerActivity.class);
        intent.putExtra("selected-country-code", m0dVar != null ? m0dVar.a : null);
        return intent;
    }

    public static final String r(String str, ymd0 ymd0Var) {
        hoj0 hoj0VarC;
        goj0 goj0VarA;
        mdz mdzVar;
        ioj0 ioj0Var = (ioj0) ymd0Var.e();
        if (ioj0Var == null || (hoj0VarC = ioj0Var.c(mdz.class, str)) == null || (goj0VarA = hoj0VarC.a()) == null || (mdzVar = (mdz) goj0VarA.a) == null) {
            return null;
        }
        return mdzVar.c;
    }

    public static Object s(Class cls) {
        String name;
        String str;
        Package r0 = cls.getPackage();
        if (r0 == null || (name = r0.getName()) == null) {
            name = "";
        }
        String canonicalName = cls.getCanonicalName();
        canonicalName.getClass();
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String strConcat = canonicalName.replace('.', '_').concat("_Impl");
        try {
            if (name.length() == 0) {
                str = strConcat;
            } else {
                str = name + '.' + strConcat;
            }
            return Class.forName(str, true, cls.getClassLoader()).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e);
        } catch (IllegalAccessException e2) {
            bhn0.o(cy30.k(cls, new StringBuilder("Cannot access the constructor ")), e2);
            return null;
        } catch (InstantiationException e3) {
            bhn0.o(cy30.k(cls, new StringBuilder("Failed to create an instance of ")), e3);
            return null;
        }
    }

    public static final int t(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static z7r0 u() {
        return new z7r0();
    }

    public static p95 v(nha0 nha0Var, fcf0 fcf0Var) {
        return new p95(vua0.a(nha0Var, fcf0Var, 1.0f, e4y.R0, false), (byte) 0);
    }

    public static bpn0 w(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        Uri uri = Uri.parse(str);
        if (!u890.j(uri.getScheme(), "spotify-auth-music") || !u890.j(uri.getHost(), "callback") || !"/r/android/music/login".equalsIgnoreCase(uri.getEncodedPath())) {
            return null;
        }
        if (uri.getQueryParameter("code") == null && uri.getQueryParameter("error") == null) {
            return null;
        }
        return new bpn0(uri.getQueryParameter("code"), uri.getQueryParameter("state"), uri.getQueryParameter("error"), uri.getQueryParameter("error_description"));
    }

    public static u95 x(nha0 nha0Var, fcf0 fcf0Var) {
        return new u95(vua0.a(nha0Var, fcf0Var, qpi1.c(), aqu.a, false), (byte) 3);
    }

    public static q95 y(eha0 eha0Var, fcf0 fcf0Var, boolean z) {
        return new q95(vua0.a(eha0Var, fcf0Var, z ? qpi1.c() : 1.0f, xi10.c, false), (byte) 3);
    }

    public static q95 z(nha0 nha0Var, fcf0 fcf0Var) {
        return y(nha0Var, fcf0Var, true);
    }
}
