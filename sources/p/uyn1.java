package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.kidssessions.link.v1.LinkSession;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class uyn1 {
    public static b180 a;

    public static final qim0 A(qim0 qim0Var, float f, float f2, float f3, float f4) {
        return qim0Var.then(new qzq0(f, f2, f3, f4));
    }

    public static qim0 B(qim0 qim0Var, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return A(qim0Var, f, f2, f3, f4);
    }

    public static final c380 C(List list, b0k b0kVar) {
        boolean zG = ((x340) b0kVar).g(list);
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            objT = mqo1.A(list);
            x340Var.s0(objT);
        }
        return (c380) objT;
    }

    public static final void D(String str) {
        try {
            riz rizVar = new riz(str);
            if ((rizVar.b == null || rizVar.c == null) ? false : true) {
                fap1.r(rizVar.a, rizVar.toString());
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:192:0x0347  */
    /* JADX WARN: Code duplicated, block: B:207:0x037a  */
    public static boolean E(djl djlVar, vda vdaVar) {
        yol1 yol1Var;
        yol1 yol1Var2;
        int iB;
        yol1 yol1Var3;
        yol1 yol1Var4;
        boolean z;
        ArrayList arrayList = djlVar.u0;
        yic0 yic0Var = djlVar.A0;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i2 >= size) {
                int i4 = 0;
                ArrayList arrayList2 = null;
                ArrayList<l660> arrayList3 = null;
                ArrayList arrayList4 = null;
                ArrayList<l660> arrayList5 = null;
                ArrayList arrayList6 = null;
                ArrayList arrayList7 = null;
                while (i4 < size) {
                    tq50 tq50Var = (cjl) arrayList.get(i4);
                    bjl[] bjlVarArr = ((cjl) djlVar).U;
                    int i5 = i;
                    bjl bjlVar = bjlVarArr[i5];
                    bjl bjlVar2 = bjlVarArr[i3];
                    bjl[] bjlVarArr2 = ((cjl) tq50Var).U;
                    int i6 = i3;
                    if (!H(bjlVar, bjlVar2, bjlVarArr2[i5], bjlVarArr2[i6])) {
                        djl.a0(tq50Var, vdaVar, djlVar.P0);
                    }
                    boolean z2 = tq50Var instanceof tq50;
                    if (z2) {
                        tq50 tq50Var2 = tq50Var;
                        if (tq50Var2.y0 == 0) {
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList4.add(tq50Var2);
                        }
                        z = z2;
                        if (tq50Var2.y0 == i6) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(tq50Var2);
                        }
                    } else {
                        z = z2;
                    }
                    if (tq50Var instanceof l660) {
                        if (tq50Var instanceof c9a) {
                            c9a c9aVar = (c9a) tq50Var;
                            if (c9aVar.a0() == 0) {
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(c9aVar);
                            }
                            if (c9aVar.a0() == 1) {
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                }
                                arrayList5.add(c9aVar);
                            }
                        } else {
                            l660 l660Var = (l660) tq50Var;
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(l660Var);
                            if (arrayList5 == null) {
                                arrayList5 = new ArrayList();
                            }
                            arrayList5.add(l660Var);
                        }
                    }
                    if (((cjl) tq50Var).J.f == null && ((cjl) tq50Var).L.f == null && !z && !(tq50Var instanceof c9a)) {
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                        }
                        arrayList6.add(tq50Var);
                    }
                    if (((cjl) tq50Var).K.f == null && ((cjl) tq50Var).M.f == null && ((cjl) tq50Var).N.f == null && !z && !(tq50Var instanceof c9a)) {
                        if (arrayList7 == null) {
                            arrayList7 = new ArrayList();
                        }
                        arrayList7.add(tq50Var);
                    }
                    i4++;
                    i = i5;
                    i3 = 1;
                }
                int i7 = i;
                ArrayList<yol1> arrayList8 = new ArrayList();
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        q((tq50) it.next(), i7, arrayList8, null);
                    }
                }
                int i8 = i7;
                yol1 yol1Var5 = null;
                if (arrayList3 != null) {
                    for (l660 l660Var2 : arrayList3) {
                        yol1 yol1VarQ = q(l660Var2, i8, arrayList8, yol1Var5);
                        l660Var2.X(i8, arrayList8, yol1VarQ);
                        yol1VarQ.a(arrayList8);
                        yol1Var5 = null;
                        i8 = 0;
                    }
                }
                HashSet hashSet = djlVar.k(2).a;
                if (hashSet != null) {
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        q(((lhl) it2.next()).d, 0, arrayList8, null);
                    }
                }
                HashSet hashSet2 = djlVar.k(4).a;
                if (hashSet2 != null) {
                    Iterator it3 = hashSet2.iterator();
                    while (it3.hasNext()) {
                        q(((lhl) it3.next()).d, 0, arrayList8, null);
                    }
                }
                HashSet hashSet3 = djlVar.k(7).a;
                if (hashSet3 != null) {
                    Iterator it4 = hashSet3.iterator();
                    while (it4.hasNext()) {
                        q(((lhl) it4.next()).d, 0, arrayList8, null);
                    }
                }
                yol1 yol1Var6 = null;
                if (arrayList6 != null) {
                    Iterator it5 = arrayList6.iterator();
                    while (it5.hasNext()) {
                        q((cjl) it5.next(), 0, arrayList8, null);
                    }
                }
                if (arrayList4 != null) {
                    Iterator it6 = arrayList4.iterator();
                    while (it6.hasNext()) {
                        q((tq50) it6.next(), 1, arrayList8, null);
                    }
                }
                int i9 = 1;
                if (arrayList5 != null) {
                    for (l660 l660Var3 : arrayList5) {
                        yol1 yol1VarQ2 = q(l660Var3, i9, arrayList8, yol1Var6);
                        l660Var3.X(i9, arrayList8, yol1VarQ2);
                        yol1VarQ2.a(arrayList8);
                        yol1Var6 = null;
                        i9 = 1;
                    }
                }
                HashSet hashSet4 = djlVar.k(3).a;
                if (hashSet4 != null) {
                    Iterator it7 = hashSet4.iterator();
                    while (it7.hasNext()) {
                        q(((lhl) it7.next()).d, 1, arrayList8, null);
                    }
                }
                HashSet hashSet5 = djlVar.k(6).a;
                if (hashSet5 != null) {
                    Iterator it8 = hashSet5.iterator();
                    while (it8.hasNext()) {
                        q(((lhl) it8.next()).d, 1, arrayList8, null);
                    }
                }
                HashSet hashSet6 = djlVar.k(5).a;
                if (hashSet6 != null) {
                    Iterator it9 = hashSet6.iterator();
                    while (it9.hasNext()) {
                        q(((lhl) it9.next()).d, 1, arrayList8, null);
                    }
                }
                HashSet hashSet7 = djlVar.k(7).a;
                if (hashSet7 != null) {
                    Iterator it10 = hashSet7.iterator();
                    while (it10.hasNext()) {
                        q(((lhl) it10.next()).d, 1, arrayList8, null);
                    }
                }
                if (arrayList7 != null) {
                    Iterator it11 = arrayList7.iterator();
                    while (it11.hasNext()) {
                        q((cjl) it11.next(), 1, arrayList8, null);
                    }
                }
                for (int i10 = 0; i10 < size; i10++) {
                    cjl cjlVar = (cjl) arrayList.get(i10);
                    bjl[] bjlVarArr3 = cjlVar.U;
                    bjl bjlVar3 = bjlVarArr3[0];
                    bjl bjlVar4 = bjl.c;
                    if (bjlVar3 == bjlVar4 && bjlVarArr3[1] == bjlVar4) {
                        int i11 = cjlVar.s0;
                        int size2 = arrayList8.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size2) {
                                yol1Var3 = null;
                                break;
                            }
                            yol1Var3 = (yol1) arrayList8.get(i12);
                            if (i11 == yol1Var3.b) {
                                break;
                            }
                            i12++;
                        }
                        int i13 = cjlVar.t0;
                        int size3 = arrayList8.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 >= size3) {
                                yol1Var4 = null;
                                break;
                            }
                            yol1 yol1Var7 = (yol1) arrayList8.get(i14);
                            if (i13 == yol1Var7.b) {
                                yol1Var4 = yol1Var7;
                                break;
                            }
                            i14++;
                        }
                        if (yol1Var3 != null && yol1Var4 != null) {
                            yol1Var3.c(0, yol1Var4);
                            yol1Var4.c = 2;
                            arrayList8.remove(yol1Var3);
                        }
                    }
                }
                if (arrayList8.size() > 1) {
                    bjl bjlVar5 = ((cjl) djlVar).U[0];
                    bjl bjlVar6 = bjl.a;
                    bjl bjlVar7 = bjl.b;
                    if (bjlVar5 == bjlVar7) {
                        yol1Var = null;
                        int i15 = 0;
                        for (yol1 yol1Var8 : arrayList8) {
                            if (yol1Var8.c != 1 && (iB = yol1Var8.b(yic0Var, 0)) > i15) {
                                yol1Var = yol1Var8;
                                i15 = iB;
                            }
                        }
                        if (yol1Var != null) {
                            djlVar.P(bjlVar6);
                            djlVar.T(i15);
                        } else {
                            yol1Var = null;
                        }
                    } else {
                        yol1Var = null;
                    }
                    int i16 = 1;
                    if (((cjl) djlVar).U[1] == bjlVar7) {
                        yol1 yol1Var9 = null;
                        int i17 = 0;
                        for (yol1 yol1Var10 : arrayList8) {
                            if (yol1Var10.c != 0) {
                                int iB2 = yol1Var10.b(yic0Var, i16);
                                if (iB2 > i17) {
                                    yol1Var9 = yol1Var10;
                                    i17 = iB2;
                                }
                                i16 = 1;
                            }
                        }
                        if (yol1Var9 != null) {
                            djlVar.R(bjlVar6);
                            djlVar.O(i17);
                            yol1Var2 = yol1Var9;
                        } else {
                            yol1Var2 = null;
                        }
                    } else {
                        yol1Var2 = null;
                    }
                    if (yol1Var != null || yol1Var2 != null) {
                        return true;
                    }
                }
                return false;
            }
            cjl cjlVar2 = (cjl) arrayList.get(i2);
            bjl[] bjlVarArr4 = ((cjl) djlVar).U;
            bjl bjlVar8 = bjlVarArr4[0];
            bjl bjlVar9 = bjlVarArr4[1];
            bjl[] bjlVarArr5 = cjlVar2.U;
            if (!H(bjlVar8, bjlVar9, bjlVarArr5[0], bjlVarArr5[1]) || (cjlVar2 instanceof nr20)) {
                return false;
            }
            i2++;
        }
    }

    public static final qj90 F(zfb1 zfb1Var) {
        rh7 rh7Var;
        qfd qfdVar = zfb1Var.b;
        if (qfdVar != null) {
            if (qfdVar.b || qfdVar.c != 3) {
                qfdVar = null;
            }
            if (qfdVar != null && (rh7Var = qfdVar.d) != null) {
                return new pj90(rh7Var.a);
            }
        }
        return oj90.a;
    }

    public static final nkc0 G(LinkSession linkSession) {
        int i;
        String strO = linkSession.o();
        long millis = TimeUnit.SECONDS.toMillis(linkSession.q().q());
        switch (linkSession.p().ordinal()) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
            case 7:
                i = 1;
                break;
            case 1:
                i = 3;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            default:
                eg.o();
                return null;
        }
        return new nkc0(millis, i, strO);
    }

    public static boolean H(bjl bjlVar, bjl bjlVar2, bjl bjlVar3, bjl bjlVar4) {
        bjl bjlVar5 = bjl.d;
        bjl bjlVar6 = bjl.b;
        bjl bjlVar7 = bjl.a;
        return (bjlVar3 == bjlVar7 || bjlVar3 == bjlVar6 || (bjlVar3 == bjlVar5 && bjlVar != bjlVar6)) || (bjlVar4 == bjlVar7 || bjlVar4 == bjlVar6 || (bjlVar4 == bjlVar5 && bjlVar2 != bjlVar6));
    }

    public static final xu30 I(xu30 xu30Var, float f, x340 x340Var) {
        x340Var.i0(-784713520);
        if (p3v.b(f, 0.0f) <= 0) {
            x340Var.r(false);
            return xu30Var;
        }
        boolean zG = x340Var.g(xu30Var) | x340Var.d(f);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            objT = new j2i(386485609, new ye6(f, (Object) xu30Var, (byte) 11), true);
            x340Var.s0(objT);
        }
        xu30 xu30Var2 = (xu30) objT;
        x340Var.r(false);
        return xu30Var2;
    }

    public static final void a(int i, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1721115782);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            boolean z = (i3 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new gob(iu30Var, (byte) 5);
                x340Var.s0(objT);
            }
            z50 z50Var = z50.c;
            qim0Var2 = nim0.a;
            foo1.c(new gbx(z50Var, (Function0) objT), ldx.c, qim0Var2, null, null, null, null, null, null, null, rai.a, x340Var, ((i3 << 3) & 896) | 48, 48, 2040);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n52(iu30Var, qim0Var2, i, (byte) 4);
        }
    }

    public static final void b(bxn bxnVar, Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        gbx gbxVar;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-213810520);
        int i2 = (b0kVar3.g(bxnVar) ? 4 : 2) | i | (b0kVar3.i(function0) ? 32 : 16);
        byte b = 0;
        byte b2 = 1;
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            if (bxnVar.a.length() > 0) {
                b0kVar3.i0(686524771);
                boolean z = (i2 & 112) == 32;
                Object objT = b0kVar3.T();
                if (z || objT == fkj0.X) {
                    objT = new z9t(function0, (byte) 26);
                    b0kVar3.s0(objT);
                }
                gbxVar = new gbx(z50.c, (Function0) objT);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-192536555);
                b0kVar3.r(false);
                gbxVar = null;
            }
            b0kVar2 = b0kVar3;
            jto1.b(null, null, null, false, null, null, gbxVar, null, apo.r(111586398, new u7w(bxnVar, b), b0kVar3), null, null, null, bxnVar.a.length() > 0 ? fli.a : null, null, null, apo.r(1249525732, new u7w(bxnVar, b2), b0kVar3), b0kVar2, 100663296, 196608, 28351);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new o1t(bxnVar, function0, i, (byte) 23);
        }
    }

    public static final void c(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-485692990);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            dnx dnxVar = dnx.c;
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.b;
            jsl jslVar = new jsl(cwl1.o0(x340Var, 2131962086));
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarX = x(qim0Var2, 4.0f);
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(dnxVar, jslVar, u291.r(qim0VarX, 16.0f), j, 0L, false, x340Var, dnx.d, 48);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new one0(qim0Var, i, (byte) 13);
        }
    }

    public static final void d(String str, if5 if5Var, boolean z, gbx gbxVar, iu30 iu30Var, qim0 qim0Var, if5 if5Var2, lax laxVar, b0k b0kVar, int i) {
        int i2;
        int i3;
        boolean z2;
        xu30 xu30Var;
        xu30 xu30Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1267766015);
        if ((i & 6) == 0) {
            i2 = (b0kVar2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? b0kVar2.g(if5Var) : b0kVar2.i(if5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar2.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar2.i(gbxVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar2.i(iu30Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar2.i(qim0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= (2097152 & i) == 0 ? b0kVar2.g(if5Var2) : b0kVar2.i(if5Var2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= (16777216 & i) == 0 ? b0kVar2.g(laxVar) : b0kVar2.i(laxVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= (134217728 & i) == 0 ? b0kVar2.g((Object) null) : b0kVar2.i((Object) null) ? 67108864 : 33554432;
        }
        int i4 = i2;
        if (b0kVar2.Y(i4 & 1, (i4 & 38347923) != 38347922)) {
            b0kVar2.d0();
            if ((i & 1) != 0 && !b0kVar2.E()) {
                b0kVar2.b0();
            }
            b0kVar2.s();
            int i5 = i4 >> 15;
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0Var);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            uvx uvxVarB = uvx.b((uvx) b0kVar2.k(vvx.a), 0, (tvx) null, (p3v) null, 30);
            if (if5Var == null) {
                b0kVar2.i0(2099644249);
                b0kVar2.r(false);
                i3 = i5;
                z2 = true;
                xu30Var = null;
            } else {
                b0kVar2.i0(483372456);
                i3 = i5;
                z2 = true;
                xu30 xu30VarA = if5Var.a((qim0) null, (lee1) null, (u7h) null, (ib60) null, b0kVar2, 7);
                b0kVar2.r(false);
                xu30Var = xu30VarA;
            }
            if (z) {
                b0kVar2 = b0kVar2;
                xu30Var2 = l3j.a;
            } else {
                b0kVar2 = b0kVar2;
                xu30Var2 = null;
            }
            max maxVarZ = mmo1.z(laxVar, b0kVar2);
            qim0 qim0VarQ = m0p1.q(u291.f(nim0.a, 1.0f), laxVar, iu30Var);
            Object objT = b0kVar2.T();
            if (objT == fkj0.X) {
                objT = htn0.h;
                b0kVar2.s0(objT);
            }
            jto1.b(anm1.N("NavigationSettingRow", s161.b(qim0VarQ, z2, (iu30) objT)), uvxVarB, maxVarZ, false, null, null, gbxVar, null, null, null, null, xu30Var, xu30Var2, null, null, apo.r(1958787003, new qdg0(str, (byte) 14), b0kVar2), b0kVar2, 64 | ((i4 << 9) & 3670016), 196608, 26552);
            cso1.s(if5Var2 == null ? new if5((Integer) null, (String) null, (b2i) null, (hf5) null, 15) : if5Var2, null, laxVar, null, b0kVar2, 8 | (i3 & 896), 10);
            b0kVar2.r(z2);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new brf(str, if5Var, z, gbxVar, iu30Var, qim0Var, if5Var2, laxVar, i);
        }
    }

    public static final void e(String str, if5 if5Var, boolean z, gbx gbxVar, iu30 iu30Var, qim0 qim0Var, if5 if5Var2, lax laxVar, b0k b0kVar, int i, int i2) {
        int i3;
        b0k b0kVar2;
        qim0 qim0Var2;
        if5 if5Var3;
        qim0 qim0Var3;
        if5 if5Var4 = if5Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1433805212);
        int i4 = (b0kVar3.g(str) ? 4 : 2) | i | (b0kVar3.i(if5Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i4 |= b0kVar3.h(z) ? 256 : 128;
        }
        int i5 = i4 | (b0kVar3.i(gbxVar) ? 2048 : 1024) | (b0kVar3.i(iu30Var) ? 16384 : 8192);
        int i6 = 196608 | i5;
        int i7 = i2 & 64;
        if (i7 != 0) {
            i3 = i5 | 1769472;
        } else {
            i3 = ((2097152 & i) == 0 ? b0kVar3.g(if5Var4) : b0kVar3.i(if5Var4) ? 1048576 : 524288) | i6;
        }
        int i8 = i3 | (b0kVar3.g(laxVar) ? 8388608 : 4194304);
        if (b0kVar3.Y(i8 & 1, (4793491 & i8) != 4793490)) {
            b0kVar3.d0();
            if ((i & 1) == 0 || b0kVar3.E()) {
                if (i7 != 0) {
                    if5Var4 = null;
                }
                qim0Var3 = nim0.a;
            } else {
                b0kVar3.b0();
                qim0Var3 = qim0Var;
            }
            if5 if5Var5 = if5Var4;
            b0kVar3.s();
            b0kVar2 = b0kVar3;
            d(str, if5Var, z, gbxVar, iu30Var, qim0Var3, if5Var5, laxVar, b0kVar2, (i8 & 14) | 100663360 | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (57344 & i8) | 2293760 | (3670016 & i8) | (i8 & 29360128));
            qim0Var2 = qim0Var3;
            if5Var3 = if5Var5;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
            if5Var3 = if5Var4;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new rxn0(str, if5Var, z, gbxVar, iu30Var, qim0Var2, if5Var3, laxVar, i, i2);
        }
    }

    public static final zzq0 f(float f) {
        return new zzq0(f, f, f, f);
    }

    public static final zzq0 g(float f) {
        return new zzq0(f, 6.0f, f, 6.0f);
    }

    public static zzq0 h(int i, float f, float f2) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return new zzq0(f, f2, f, f2);
    }

    public static final zzq0 i(float f, float f2, float f3, float f4) {
        return new zzq0(f, f2, f3, f4);
    }

    public static zzq0 j(float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return new zzq0(f, f2, f3, f4);
    }

    public static final void k(List list, ngs0 ngs0Var, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-8242720);
        int i2 = i | (x340Var.g(list) ? 4 : 2) | (x340Var.i(ngs0Var) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            otw.c(ngs0Var, new owx0(list, function0), (qim0) null, (ipb1) null, x340Var, (i2 >> 3) & 14, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ffx0((byte) 2, i, list, ngs0Var, function0);
        }
    }

    public static final xu30 l(xk90 xk90Var, hwq hwqVar, x340 x340Var) {
        x340Var.i0(-552642707);
        if (xk90Var == null) {
            x340Var.r(false);
            return null;
        }
        String strB = xk90Var.b(hwqVar, true, x340Var, 48);
        if (strB == null) {
            x340Var.r(false);
            return null;
        }
        boolean zG = x340Var.g(strB) | x340Var.g(hwqVar);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            objT = new j2i(-1428273814, new lp7(new tk90(xk90Var, strB, hwqVar), hwqVar, (byte) 1), true);
            x340Var.s0(objT);
        }
        xu30 xu30Var = (xu30) objT;
        x340Var.r(false);
        return xu30Var;
    }

    public static final float m(vzq0 vzq0Var, flb0 flb0Var) {
        return flb0Var == flb0.a ? vzq0Var.c(flb0Var) : vzq0Var.b(flb0Var);
    }

    public static final float n(vzq0 vzq0Var, flb0 flb0Var) {
        return flb0Var == flb0.a ? vzq0Var.b(flb0Var) : vzq0Var.c(flb0Var);
    }

    public static final b7 o(oma0 oma0Var) {
        String strO;
        if (!oed1.a) {
            ax81 ax81Var = (ax81) oma0Var;
            tka0 tka0Var = ax81Var.b;
            tka0 tka0Var2 = tka0Var instanceof tka0 ? tka0Var : null;
            if (tka0Var2 == null || (strO = tka0Var2.o()) == null) {
                mna0.d(oma0Var, "Non-class type cannot be a mutable collection type: ");
                return null;
            }
            String str = j8a0.a;
            kf30 kf30VarH = j8a0.h(new lf30(strO));
            if (kf30VarH != null) {
                return new ax81(ax81Var.b, ax81Var.c, ax81Var.d, ax81Var.e, ax81Var.f, ax81Var.g, ax81Var.h, ax81Var.i, w6d1.n(kf30VarH, tka0Var), (Function0) null);
            }
            hhg1.g(oma0Var, "Not a readonly collection: ");
            return null;
        }
        qx81 qx81Var = ((rgt) oma0Var).b;
        if (!(qx81Var instanceof qx81)) {
            bhn0.s(oma0Var, "Non-simple type cannot be a mutable collection type: ");
            return null;
        }
        beg begVarS = qx81Var.t0().s();
        beg begVar = begVarS instanceof beg ? begVarS : null;
        if (begVar == null) {
            hhg1.g(oma0Var, "Non-class type cannot be a mutable collection type: ");
            return null;
        }
        qx81 qx81Var2 = qx81Var;
        String str2 = j8a0.a;
        int i = kht.a;
        kf30 kf30VarH2 = j8a0.h(iht.f(begVar));
        if (kf30VarH2 != null) {
            return new rgt(y3o1.i0(qx81Var2.r0(), qx81Var2.s0(), kht.e(begVar).k(kf30VarH2).g(), qx81Var2.u0()));
        }
        hhg1.g(begVar, "Not a readonly collection: ");
        return null;
    }

    public static final b7 p(oma0 oma0Var, oma0 oma0Var2) {
        if (oed1.a) {
            return new rgt(y3o1.Z(((rgt) oma0Var).b, ((rgt) oma0Var2).b));
        }
        b7 b7Var = (b7) oma0Var;
        b7 b7Var2 = (b7) oma0Var2;
        return b7Var.equals(b7Var2) ? b7Var : new cq20(b7Var, b7Var2, false, (Function0) null);
    }

    public static yol1 q(cjl cjlVar, int i, ArrayList arrayList, yol1 yol1Var) {
        int i2;
        int i3 = i == 0 ? cjlVar.s0 : cjlVar.t0;
        if (i3 != -1 && (yol1Var == null || i3 != yol1Var.b)) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                yol1 yol1Var2 = (yol1) arrayList.get(i4);
                if (yol1Var2.b == i3) {
                    if (yol1Var != null) {
                        yol1Var.c(i, yol1Var2);
                        arrayList.remove(yol1Var);
                    }
                    yol1Var = yol1Var2;
                    break;
                }
            }
        } else if (i3 != -1) {
            return yol1Var;
        }
        if (yol1Var == null) {
            if (cjlVar instanceof l660) {
                l660 l660Var = (l660) cjlVar;
                int i5 = 0;
                while (true) {
                    if (i5 >= l660Var.v0) {
                        i2 = -1;
                        break;
                    }
                    cjl cjlVar2 = l660Var.u0[i5];
                    if ((i == 0 && (i2 = cjlVar2.s0) != -1) || (i == 1 && (i2 = cjlVar2.t0) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        yol1 yol1Var3 = (yol1) arrayList.get(i6);
                        if (yol1Var3.b == i2) {
                            yol1Var = yol1Var3;
                            break;
                        }
                    }
                }
            }
            if (yol1Var == null) {
                yol1Var = new yol1();
                yol1Var.a = new ArrayList();
                yol1Var.d = null;
                yol1Var.e = -1;
                int i7 = yol1.f;
                yol1.f = i7 + 1;
                yol1Var.b = i7;
                yol1Var.c = i;
            }
            arrayList.add(yol1Var);
        }
        ArrayList arrayList2 = yol1Var.a;
        if (arrayList2.contains(cjlVar)) {
            return yol1Var;
        }
        arrayList2.add(cjlVar);
        if (cjlVar instanceof tq50) {
            tq50 tq50Var = (tq50) cjlVar;
            tq50Var.x0.c(tq50Var.y0 == 0 ? 1 : 0, arrayList, yol1Var);
        }
        int i8 = yol1Var.b;
        if (i == 0) {
            cjlVar.s0 = i8;
            cjlVar.J.c(i, arrayList, yol1Var);
            cjlVar.L.c(i, arrayList, yol1Var);
        } else {
            cjlVar.t0 = i8;
            cjlVar.K.c(i, arrayList, yol1Var);
            cjlVar.N.c(i, arrayList, yol1Var);
            cjlVar.M.c(i, arrayList, yol1Var);
        }
        cjlVar.Q.c(i, arrayList, yol1Var);
        return yol1Var;
    }

    public static final String r(ryn1 ryn1Var, Context context) {
        if (ryn1Var instanceof ehc1) {
            return ((ehc1) ryn1Var).c;
        }
        if (ryn1Var instanceof jx21) {
            return context.getString(((jx21) ryn1Var).c);
        }
        eg.o();
        return null;
    }

    public static View s(Context context, int i, ViewGroup viewGroup, int i2) {
        if ((i2 & 2) != 0) {
            viewGroup = null;
        }
        return LayoutInflater.from(context).inflate(i, viewGroup, false);
    }

    public static final boolean t(Context context) {
        Object systemService = context.getSystemService("accessibility");
        AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return false;
        }
        return !accessibilityManager.getEnabledAccessibilityServiceList(1).isEmpty();
    }

    public static ArrayList u(ArrayList arrayList, ArrayList arrayList2, float f) {
        Object next;
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ue5 ue5Var = (ue5) it.next();
            Iterator it2 = arrayList2.iterator();
            do {
                if (!it2.hasNext()) {
                    bhn0.t("Collection contains no element matching the predicate.");
                    return null;
                }
                next = it2.next();
            } while (!((ue5) next).a.equals(ue5Var.a));
            arrayList3.add(new ue5(ue5Var.a, ue5Var.b.a(((ue5) next).b, f)));
        }
        return arrayList3;
    }

    public static final String v(String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFC);
    }

    public static final qim0 w(qim0 qim0Var, vzq0 vzq0Var) {
        return qim0Var.then(new yzq0(vzq0Var));
    }

    public static final qim0 x(qim0 qim0Var, float f) {
        return qim0Var.then(new qzq0(f, f, f, f));
    }

    public static final qim0 y(qim0 qim0Var, float f, float f2) {
        return qim0Var.then(new qzq0(f, f2, f, f2));
    }

    public static qim0 z(float f, float f2, int i, qim0 qim0Var) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return y(qim0Var, f, f2);
    }
}
