package p;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.webkit.MimeTypeMap;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.text.font.FontWeight;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import io.reactivex.rxjava3.core.Flowable;
import j$.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class h1p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(String str, String str2, boolean z, gbx gbxVar, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        String strK;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1066335575);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(str2) ? 32 : 16) | (b0kVar3.h(z) ? 256 : 128) | (b0kVar3.i(gbxVar) ? 2048 : 1024) | 24576;
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            xu30 xu30VarR = null;
            if (z) {
                strK = x0d.k(b0kVar3, 1748702205, 2131964194, b0kVar3, false);
            } else {
                b0kVar3.i0(-1624750444);
                b0kVar3.r(false);
                strK = null;
            }
            if (str2 == null) {
                b0kVar3.i0(-1624643618);
            } else {
                b0kVar3.i0(-1624643617);
                xu30VarR = apo.r(827150585, new p3(str2, (byte) 24), b0kVar3);
            }
            b0kVar3.r(false);
            xu30 xu30Var = xu30VarR;
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            jto1.b(u291.f(qim0Var3, 1.0f), null, null, false, null, null, gbxVar, null, null, null, null, xu30Var, null, null, null, apo.r(284153317, new xo6(str, strK, (byte) 3), b0kVar3), b0kVar2, (i2 << 9) & 3670016, 196608, 30654);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new oa9(str, str2, z, gbxVar, qim0Var2, i, (byte) 0);
        }
    }

    public static yk4 b(int i, int i2, int i3) {
        Bitmap bitmapCreateBitmap;
        je31 je31Var = kah.e;
        Bitmap.Config configV = no80.V(i3);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = kw7.o(i, i2, i3, je31Var);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, configV);
            bitmapCreateBitmap.setHasAlpha(true);
        }
        return new yk4(bitmapCreateBitmap);
    }

    public static final void c(int i, String str, LocalDate localDate, boolean z, qim0 qim0Var, b0k b0kVar, int i2) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        int i3 = i2 | (kk0.t(2104715390, i, x340Var) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.i(localDate) ? 256 : 128) | (x340Var.h(z) ? 2048 : 1024) | 24576;
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cua cuaVar2 = cbx.b(x340Var).f;
            qim0 qim0VarQ = i1p1.q(qim0VarF, er31.d(16.0f, 16.0f, 0.0f, 0.0f, 12));
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarQ);
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
            qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
            Uri uri = Uri.parse(str == null ? "" : str);
            as80 as80Var = mif1.P0;
            cbx.a.getClass();
            ecx ecxVar = (ecx) uwr.c.getValue();
            fwx fwxVarG = hso1.G(box.c, 0L, cbx.a(x340Var).a.d, x340Var, box.d, 22);
            eso1.e(uri, isl.a, qim0VarF2, (p3v) null, (zvx) null, ecxVar, as80Var, (tl3) null, (ColorFilter) null, new pux(fwxVarG, fwxVarG), false, false, x340Var, 1073766448, 0, 3464);
            x340Var = x340Var;
            h2c h2cVar = h2c.a;
            t1c.a(dug.e(h2cVar.b(qim0Var3), v9c.t(new mmr0[]{new mmr0(Float.valueOf(0.0f), new u7h(u7h.b(u7h.b, 0.5f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(0.5f), new u7h(u7h.j))}, 0.0f, 0.0f, 14), null, 0.0f, 6), x340Var, 0);
            qim0 qim0VarA = h2cVar.a(qim0Var3, een.t);
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            u0p1.c(localDate, uyn1.B(qim0VarA, 16.0f, 0.0f, 0.0f, 16.0f, 6), x340Var, 14 & (i3 >> 6));
            if (z) {
                x340Var.i0(1007785818);
                String strO0 = cwl1.o0(x340Var, zjd0.a[l1d.C(i)] == 1 ? 2131957470 : 2131957464);
                long j = cbx.a(x340Var).b.a;
                lee1 lee1Var = cbx.d(x340Var).h;
                qim0 qim0VarA2 = h2cVar.a(qim0Var3, graVar);
                cvx cvxVar3 = cbx.b(x340Var).b;
                cvx cvxVar4 = cbx.b(x340Var).b;
                uwo1.e(strO0, uyn1.B(qim0VarA2, 16.0f, 16.0f, 0.0f, 0.0f, 12), lee1Var, j, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(1008329930);
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
            h311VarV.d = new d30(i, str, localDate, z, qim0Var2, i2);
        }
    }

    public static final void d(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1414026759);
        if (x340Var.Y(i & 1, i != 0)) {
            String strO0 = cwl1.o0(x340Var, 2131956679);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).p;
            yfu yfuVar = ajx.a;
            Object obj = yfuVar.b;
            gxo1.c(strO0, u291.f(nim0.a, 1.0f), lee1Var, o8h0.b, new a0e1(3), 0, false, bjc0.a, null, 150.0f, (FontWeight) ((bjx) yfuVar.c).e, null, x340Var, 12586032, 0, 2400);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new t491(i, (byte) 28);
        }
    }

    public static final void e(String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-867938454);
        int i2 = i | (x340Var.g(str) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).e;
            yfu yfuVar = ajx.a;
            Object obj = yfuVar.b;
            gxo1.c(str, uyn1.B(u291.f(nim0.a, 1.0f), 0.0f, o8h0.f, 0.0f, 0.0f, 13), lee1Var, o8h0.b, new a0e1(3), 0, false, bjc0.a, null, 150.0f, (FontWeight) ((bjx) yfuVar.c).e, null, x340Var, (i2 & 14) | 12586032, 0, 2400);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nl41(str, i, (byte) 29);
        }
    }

    public static final void f(String str, rhq rhqVar, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-643598357);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(rhqVar) ? 32 : 16) | 384 | (x340Var.i(function0) ? 2048 : 1024);
        boolean z = false;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 16.0f, 0.0f, 0.0f, 0.0f, 14);
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var, 54);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            qim0 qim0VarN = anm1.N("sideDrawerSectionHeaderTitle", qim0Var3);
            String strO0 = cwl1.o0(x340Var, 2131962453);
            if (ihc1.y0(strO0)) {
                hhg1.n("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
                return;
            }
            foo1.c(new gbx(new y50(strO0), function0), ldx.c, qim0VarN, null, yla.s(x340Var), new zzq0(0.0f, 0.0f, 0.0f, 0.0f), null, null, null, kcj.a, kcj.b, x340Var, 1573296, 54, 920);
            if ((i2 & 14) == 4) {
                x340Var = x340Var;
                z = true;
            }
            x340Var = x340Var;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = rhqVar.a(str, new eao0(2));
                x340Var.s0(objT);
            }
            otw.c((hao0) objT, rih1.a, (qim0) null, (ipb1) null, x340Var, 48, 12);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pby0(i, str, rhqVar, qim0Var2, function0, (byte) 7);
        }
    }

    public static final void g(al80 al80Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        Function0 function1;
        int i2;
        Object next;
        Object obj;
        int i3;
        Map mapJ;
        af5 af5VarG;
        String strK;
        long j = al80Var.d;
        int i4 = al80Var.e;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(796264645);
        int i5 = (i & 6) == 0 ? (x340Var.i(al80Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            function1 = function0;
            i5 |= x340Var.i(function1) ? 32 : 16;
        } else {
            function1 = function0;
        }
        if ((i & 384) == 0) {
            i5 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i5 & 1, (i5 & 147) != 146)) {
            int iC = l1d.C(i4);
            if (iC == 0) {
                i2 = 2131956693;
            } else if (iC == 1) {
                i2 = 2131956676;
            } else {
                if (iC != 2) {
                    eg.o();
                    return;
                }
                i2 = 2131956682;
            }
            String strO0 = cwl1.o0(x340Var, i2);
            String strN0 = cwl1.n0(2131956680, new Object[]{Long.valueOf(j)}, x340Var);
            String strU = cwl1.U(2131820701, (int) j, new Object[]{Long.valueOf(j)}, x340Var);
            x340Var.i0(-1147755949);
            List listD1 = o7h.d1(al80Var.c, 2);
            if (listD1.size() < 2) {
                bl80 bl80Var = (bl80) o7h.s0(listD1);
                String str = bl80Var != null ? bl80Var.b : null;
                if (str == null) {
                    str = "";
                }
                af5VarG = new af5(str);
            } else {
                x340Var.i0(813135721);
                List<bl80> list = listD1;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (bl80 bl80Var2 : list) {
                    if (bl80Var2.e) {
                        strK = x0d.k(x340Var, 1243459733, 2131956673, x340Var, false);
                    } else {
                        x340Var.i0(1243461522);
                        x340Var.r(false);
                        strK = bl80Var2.b;
                    }
                    arrayList.add(strK);
                }
                x340Var.r(false);
                if (i4 != 1) {
                    x340Var.i0(-562408377);
                    af5VarG = p8p1.g(cwl1.n0(2131956681, new Object[]{"\ue000", "\ue001"}, x340Var), sqg0.J(new mmr0[]{new mmr0("\ue000", arrayList.get(0)), new mmr0("\ue001", arrayList.get(1))}), w7x.a, x340Var);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-562123921);
                    x340Var.r(false);
                    Iterator it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!((bl80) next).e);
                    bl80 bl80Var3 = (bl80) next;
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        Object next2 = it2.next();
                        if (!((bl80) next2).e) {
                            obj = next2;
                            break;
                        }
                    }
                    bl80 bl80Var4 = (bl80) obj;
                    boolean z = (bl80Var3 == null || bl80Var4 == null) ? false : true;
                    int iC2 = l1d.C(al80Var.f);
                    if (iC2 == 0 || iC2 == 1) {
                        i3 = z ? 2131956700 : 2131956701;
                    } else if (iC2 == 2) {
                        i3 = z ? 2131956696 : 2131956697;
                    } else if (iC2 == 3) {
                        i3 = z ? 2131956694 : 2131956695;
                    } else {
                        if (iC2 != 4) {
                            eg.o();
                            return;
                        }
                        i3 = z ? 2131956698 : 2131956699;
                    }
                    if (z) {
                        x340Var.i0(-561792655);
                        mapJ = sqg0.J(new mmr0[]{new mmr0("\ue000", cwl1.o0(x340Var, 2131956673)), new mmr0("\ue001", bl80Var4.b)});
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-561631579);
                        x340Var.r(false);
                        mapJ = sqg0.J(new mmr0[]{new mmr0("\ue000", ((bl80) listD1.get(0)).b), new mmr0("\ue001", ((bl80) listD1.get(1)).b)});
                    }
                    af5VarG = p8p1.g(cwl1.n0(i3, new Object[]{"\ue000", "\ue001"}, x340Var), mapJ, mapJ.keySet(), x340Var);
                }
            }
            x340Var.r(false);
            String strY0 = o7h.y0(p7h.M(new String[]{strO0, strU, af5VarG.b}), ". ", (String) null, (String) null, (iu30) null, 62);
            float f = o8h0.e;
            cua cuaVar = cbx.b(x340Var).f;
            gfx.b(18, apo.r(-1914431814, new wy51(qim0Var, er31.b(8.0f), strY0, strN0, function1, strO0, al80Var, af5VarG), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new um81(al80Var, function0, qim0Var, i, (byte) 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:56:0x0107  */
    /* JADX WARN: Code duplicated, block: B:59:0x0147  */
    /* JADX WARN: Code duplicated, block: B:61:0x014e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0154  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    public static final void h(qim0 qim0Var, qim0 qim0Var2, u7h u7hVar, xu30 xu30Var, xu30 xu30Var2, b0k b0kVar, int i, int i2) {
        int i3;
        u7h u7hVar2;
        int i4;
        boolean z;
        qim0 qim0Var3;
        u7h u7hVar3;
        h311 h311VarV;
        int i5;
        qim0 qim0Var4;
        qim0 qim0VarZ;
        int i6;
        qim0 qim0VarF;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        int i7;
        int i8;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1936834306);
        if ((i & 6) == 0) {
            i3 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= 16;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 384) == 0) {
                u7hVar2 = u7hVar;
                i3 |= x340Var.g(u7hVar2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if (x340Var.i(xu30Var)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i3 |= i8;
            }
            if ((i & 24576) == 0) {
                if (x340Var.i(xu30Var2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i4 = 0;
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                x340Var.d0();
                i5 = i & 1;
                qim0Var4 = nim0.a;
                if (i5 != 0 || x340Var.E()) {
                    qim0 qim0VarY = too1.y(qim0Var4, (erl1) x340Var.k(ede0.a));
                    uwr uwrVar = cbx.a;
                    qim0VarZ = uyn1.z(cbx.b(x340Var).e.b, 0.0f, 2, qim0VarY);
                    i6 = i3 & (-113);
                    if (i9 != 0) {
                        u7hVar2 = null;
                    }
                } else {
                    x340Var.b0();
                    i6 = i3 & (-113);
                    qim0VarZ = qim0Var2;
                }
                x340Var.s();
                qim0 qim0VarH = l6o1.H(u291.d(qim0Var, 1.0f), l6o1.C(0, 0, 1, x340Var), false, 14);
                if (u7hVar2 != null) {
                    x340Var.i0(-1639567386);
                    mmr0 mmr0Var = new mmr0(Float.valueOf(0.0f), u7hVar2);
                    Float fValueOf = Float.valueOf(0.7f);
                    uwr uwrVar2 = cbx.a;
                    qim0Var4 = qim0Var4;
                    qim0VarF = dug.e(qim0Var4, v9c.t(new mmr0[]{mmr0Var, new mmr0(fValueOf, new u7h(cbx.a(x340Var).a.c))}, 0.0f, 0.0f, 14), null, 0.0f, 6);
                    i4 = 0;
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1639468682);
                    uwr uwrVar3 = cbx.a;
                    qim0VarF = dug.f(qim0Var4, cbx.a(x340Var).a.c, d4o1.a);
                    x340Var.r(false);
                }
                qim0 qim0VarThen = qim0VarH.then(qim0VarF).then(qim0VarZ);
                mbhVarA = jbh.a(h36.c, een.Q0, x340Var, i4);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarThen);
                hzj.A.getClass();
                if (x340Var.a != null) {
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
                cvx cvxVar = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h(qim0Var4, 16.0f));
                pbh pbhVar = pbh.a;
                op71.g(x340Var, pbhVar.a(1.0f, qim0Var4, true));
                xu30Var.invoke(pbhVar, x340Var, Integer.valueOf(((i6 >> 6) & 112) | 6));
                cvx cvxVar2 = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h(qim0Var4, 16.0f));
                op71.g(x340Var, pbhVar.a(1.0f, qim0Var4, true));
                xu30Var2.invoke(pbhVar, x340Var, Integer.valueOf(((i6 >> 9) & 112) | 6));
                x340Var.r(true);
                qim0Var3 = qim0VarZ;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
            }
            u7hVar3 = u7hVar2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new j90(qim0Var, qim0Var3, u7hVar3, xu30Var, xu30Var2, i, i2, (byte) 17);
            }
        }
        i3 |= 384;
        u7hVar2 = u7hVar;
        if ((i & 3072) == 0) {
            if (x340Var.i(xu30Var)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i3 |= i8;
        }
        if ((i & 24576) == 0) {
            if (x340Var.i(xu30Var2)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        }
        i4 = 0;
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            x340Var.d0();
            i5 = i & 1;
            qim0Var4 = nim0.a;
            if (i5 != 0) {
                qim0 qim0VarY2 = too1.y(qim0Var4, (erl1) x340Var.k(ede0.a));
                uwr uwrVar4 = cbx.a;
                qim0VarZ = uyn1.z(cbx.b(x340Var).e.b, 0.0f, 2, qim0VarY2);
                i6 = i3 & (-113);
                if (i9 != 0) {
                    u7hVar2 = null;
                }
            } else {
                qim0 qim0VarY3 = too1.y(qim0Var4, (erl1) x340Var.k(ede0.a));
                uwr uwrVar5 = cbx.a;
                qim0VarZ = uyn1.z(cbx.b(x340Var).e.b, 0.0f, 2, qim0VarY3);
                i6 = i3 & (-113);
                if (i9 != 0) {
                    u7hVar2 = null;
                }
            }
            x340Var.s();
            qim0 qim0VarH2 = l6o1.H(u291.d(qim0Var, 1.0f), l6o1.C(0, 0, 1, x340Var), false, 14);
            if (u7hVar2 != null) {
                x340Var.i0(-1639567386);
                mmr0 mmr0Var2 = new mmr0(Float.valueOf(0.0f), u7hVar2);
                Float fValueOf2 = Float.valueOf(0.7f);
                uwr uwrVar6 = cbx.a;
                qim0Var4 = qim0Var4;
                qim0VarF = dug.e(qim0Var4, v9c.t(new mmr0[]{mmr0Var2, new mmr0(fValueOf2, new u7h(cbx.a(x340Var).a.c))}, 0.0f, 0.0f, 14), null, 0.0f, 6);
                i4 = 0;
                x340Var.r(false);
            } else {
                x340Var.i0(-1639468682);
                uwr uwrVar7 = cbx.a;
                qim0VarF = dug.f(qim0Var4, cbx.a(x340Var).a.c, d4o1.a);
                x340Var.r(false);
            }
            qim0 qim0VarThen2 = qim0VarH2.then(qim0VarF).then(qim0VarZ);
            mbhVarA = jbh.a(h36.c, een.Q0, x340Var, i4);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarThen2);
            hzj.A.getClass();
            if (x340Var.a != null) {
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
            cvx cvxVar3 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(qim0Var4, 16.0f));
            pbh pbhVar2 = pbh.a;
            op71.g(x340Var, pbhVar2.a(1.0f, qim0Var4, true));
            xu30Var.invoke(pbhVar2, x340Var, Integer.valueOf(((i6 >> 6) & 112) | 6));
            cvx cvxVar4 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(qim0Var4, 16.0f));
            op71.g(x340Var, pbhVar2.a(1.0f, qim0Var4, true));
            xu30Var2.invoke(pbhVar2, x340Var, Integer.valueOf(((i6 >> 9) & 112) | 6));
            x340Var.r(true);
            qim0Var3 = qim0VarZ;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        u7hVar3 = u7hVar2;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j90(qim0Var, qim0Var3, u7hVar3, xu30Var, xu30Var2, i, i2, (byte) 17);
        }
    }

    public static h72 i(yw30 yw30Var, zw30 zw30Var, q7r0 q7r0Var, rih1 rih1Var) {
        yw30Var.getClass();
        rih1Var.getClass();
        return new h72(yw30Var, zw30Var, q7r0Var);
    }

    public static final ofb j(h310 h310Var) {
        cp31 cp31Var = new cp31();
        cp31Var.a = h310Var;
        cp31Var.b = new b2p(cp31Var, 0, (byte) 23);
        cp31Var.c = new b2p(cp31Var, 1, (byte) 23);
        cp31Var.d = new b2p(cp31Var, 2, (byte) 23);
        cp31Var.e = new b2p(cp31Var, 3, (byte) 23);
        cp31Var.f = new b2p(cp31Var, 4, (byte) 23);
        Flowable flowable = (Flowable) h310Var.h.get();
        wma1 wma1VarS = x8p1.s("CMPManagerInit");
        try {
            kjc kjcVar = (kjc) h310Var.e.get();
            wma1VarS.a((Long) null);
            kjcVar.getClass();
            return new ofb(flowable, kjcVar, (b2p) cp31Var.b, (b2p) cp31Var.c, (b2p) cp31Var.d, (b2p) cp31Var.e, (b2p) cp31Var.f);
        } catch (Throwable th) {
            wma1VarS.a((Long) null);
            throw th;
        }
    }

    public static final boolean k(long j, long j2) {
        return j == j2;
    }

    public static final String l(String str) {
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
    }

    public static int m(long j) {
        return Long.hashCode(j);
    }

    public static final int n(ha20 ha20Var) {
        switch (ha20Var.ordinal()) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return 2131958735;
            case 1:
                return 2131958724;
            case 2:
                return 2131958736;
            case 3:
                return 2131958738;
            case 4:
                return 2131958737;
            case 5:
                return 2131958726;
            case 6:
                return 2131958729;
            case 7:
                return 2131958727;
            case 8:
                return 2131958725;
            case 9:
                return 2131958731;
            case 10:
                return 2131958734;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return 2131958733;
            case grn1.d /* 12 */:
                return 2131958728;
            case 13:
                return 2131958732;
            case 14:
                return 2131958730;
            case 15:
                return 2131958696;
            case 16:
                return 2131958739;
            default:
                eg.o();
                return 0;
        }
    }
}
