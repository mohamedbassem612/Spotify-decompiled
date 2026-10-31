package p;

import android.net.Uri;
import android.widget.TextView;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.share.resultactivity.api.ShareResultActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class n1p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(c380 c380Var, qim0 qim0Var, hcx hcxVar, float f, float f2, b0k b0kVar, int i) {
        qim0 qim0Var2;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(349281238);
        float f3 = f2;
        int i2 = i | (x340Var.i(c380Var) ? 4 : 2) | 3504 | (x340Var.d(f) ? 131072 : 65536) | (x340Var.d(f3) ? 1048576 : 524288);
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                qim0Var3 = nim0.a;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var;
            }
            x340Var.s();
            jw31 jw31VarA = ew31.a(new d36(-f, true, new g21(een.Q0, (byte) 29)), een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            Iterator itN = kk0.n(x340Var, qim0VarE, y580.Y, -1123537752, c380Var);
            int i3 = 0;
            while (itN.hasNext()) {
                Object next = itN.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p7h.T();
                    throw null;
                }
                phx phxVar = (phx) next;
                x340Var.i0(-1008288539);
                x340Var.r(false);
                h(phxVar, null, i3 > 0, hcxVar, f, f3, c380Var.size() - i3, x340Var, (458752 & i2) | 24632 | (3670016 & i2));
                f3 = f2;
                i3 = i4;
            }
            x340Var.r(false);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ub9(c380Var, qim0Var2, hcxVar, f, f2, i);
        }
    }

    public static final void b(String str, boolean z, y7e1 y7e1Var, qim0 qim0Var, String str2, y7e1 y7e1Var2, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, b0k b0kVar, int i, int i2) {
        y7e1 y7e1Var3;
        int i3;
        int i4;
        iu30 iu30Var4;
        int i5;
        iu30 iu30Var5;
        iu30 iu30Var6;
        y7e1 y7e1Var4;
        ecx ecxVarA;
        boolean z2;
        iu30 iu30Var7;
        iu30 iu30Var8;
        y7e1 y7e1Var5;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1470604984);
        j06 j06Var = x340Var.a;
        int i6 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.i(y7e1Var) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024) | (x340Var.g(str2) ? 16384 : 8192);
        int i7 = i2 & 32;
        if (i7 != 0) {
            i3 = i6 | 196608;
            y7e1Var3 = y7e1Var2;
        } else {
            y7e1Var3 = y7e1Var2;
            i3 = i6 | (x340Var.i(y7e1Var3) ? 131072 : 65536);
        }
        int i8 = i2 & 64;
        if (i8 != 0) {
            i4 = i3 | 1572864;
        } else {
            i4 = i3 | (x340Var.i(iu30Var) ? 1048576 : 524288);
        }
        int i9 = i2 & 128;
        if (i9 != 0) {
            i5 = i4 | 12582912;
            iu30Var4 = iu30Var2;
        } else {
            iu30Var4 = iu30Var2;
            i5 = i4 | (x340Var.i(iu30Var4) ? 8388608 : 4194304);
        }
        int i10 = i5 | (x340Var.i(iu30Var3) ? 67108864 : 33554432);
        if (x340Var.Y(i10 & 1, (i10 & 38347923) != 38347922)) {
            y7e1 y7e1Var6 = i7 != 0 ? null : y7e1Var3;
            iu30 iu30Var9 = i8 != 0 ? null : iu30Var;
            if (i9 != 0) {
                iu30Var4 = null;
            }
            uwr uwrVar = cbx.a;
            if (z) {
                cbx.a.getClass();
                ecxVarA = uwr.d();
            } else {
                cbx.a.getClass();
                ecxVarA = uwr.a();
            }
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
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
            nim0 nim0Var = nim0.a;
            iu30 iu30Var10 = iu30Var4;
            qim0 qim0VarD = sgc1.D(1, u291.f(nim0Var, 1.0f));
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), een.N0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarD);
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
            boolean z4 = (i10 & 14) == 4;
            Object objT = x340Var.T();
            if (z4 || objT == obj) {
                objT = Uri.parse(str);
                x340Var.s0(objT);
            }
            Uri uri = (Uri) objT;
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(c4n1.a, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            uri.getClass();
            qim0 qim0VarR = d7e.r(ecxVarA.a, u291.c(nim0Var, 1.0f), true);
            cua cuaVar = cbx.b(x340Var).f;
            iu30 iu30Var11 = iu30Var9;
            eso1.e(uri, isl.a, i1p1.q(qim0VarR, er31.b(4.0f)), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 224304, 0, 4032);
            x340Var = x340Var;
            x340Var.r(true);
            int i11 = i10 >> 12;
            j(y7e1Var, new wnb0(1.0f, true), iu30Var11, x340Var, ((i10 >> 6) & 14) | (i11 & 896));
            x340Var.r(true);
            if (str2 == null || str2.length() == 0) {
                z2 = false;
                x340Var.i0(-197932800);
                x340Var.r(false);
            } else {
                x340Var.i0(-198215520);
                long j = cbx.a(x340Var).b.a;
                lee1 lee1Var = cbx.d(x340Var).j;
                cjc0 cjc0Var = new cjc0(2);
                cvx cvxVar2 = cbx.b(x340Var).b;
                z2 = false;
                uwo1.e(str2, uyn1.B(nim0Var, 0.0f, 12.0f, 0.0f, 0.0f, 13), lee1Var, j, null, null, 2, false, cjc0Var, 0, null, x340Var, i11 & 14, 0, 1712);
                x340Var.r(false);
            }
            if (y7e1Var6 == null) {
                x340Var = x340Var;
                x340Var.i0(-197906730);
                x340Var.r(z2);
                iu30Var8 = iu30Var10;
                y7e1Var5 = y7e1Var6;
            } else {
                x340Var.i0(-197906729);
                if (iu30Var3 == null) {
                    x340Var.i0(-1622217165);
                    Object objT2 = x340Var.T();
                    if (objT2 == obj) {
                        x340Var = x340Var;
                        objT2 = tzf.O0;
                        x340Var.s0(objT2);
                    }
                    x340Var = x340Var;
                    x340Var.r(z2);
                    iu30Var7 = (iu30) objT2;
                } else {
                    x340Var = x340Var;
                    x340Var.i0(1056048327);
                    x340Var.r(z2);
                    iu30Var7 = iu30Var3;
                }
                cvx cvxVar3 = cbx.b(x340Var).b;
                iu30Var8 = iu30Var10;
                y7e1Var5 = y7e1Var6;
                nho1.h(y7e1Var5, sho0.a, iu30Var7, uyn1.B(nim0Var, 0.0f, 12.0f, 0.0f, 0.0f, 13), iu30Var8, x340Var, (i10 >> 9) & 57344, 0);
                x340Var.r(z2);
            }
            x340Var.r(true);
            y7e1Var4 = y7e1Var5;
            iu30Var6 = iu30Var8;
            iu30Var5 = iu30Var11;
        } else {
            x340Var.b0();
            iu30Var5 = iu30Var;
            iu30Var6 = iu30Var4;
            y7e1Var4 = y7e1Var3;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new eng(str, z, y7e1Var, qim0Var, str2, y7e1Var4, iu30Var5, iu30Var6, iu30Var3, i, i2);
        }
    }

    public static final void c(hux huxVar, int i, int i2, b0k b0kVar, int i3) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-622917472);
        int i4 = ((i3 & 8) == 0 ? b0kVar3.g(huxVar) : b0kVar3.i(huxVar) ? 4 : 2) | i3 | (b0kVar3.e(i) ? 32 : 16) | (b0kVar3.e(i2) ? 256 : 128);
        if (b0kVar3.Y(i4 & 1, (i4 & 147) != 146)) {
            b0kVar2 = b0kVar3;
            jto1.b(u291.f(nim0.a, 1.0f), new uvx(0, (pgx) null, 0, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 503), null, false, null, null, null, null, apo.r(1284626090, new g70(huxVar, (byte) 12), b0kVar3), null, null, apo.r(1605081192, new f13(i2, (byte) 21), b0kVar3), null, null, null, apo.r(-1401115420, new f13(i, (byte) 22), b0kVar3), b0kVar2, 100663360, 196656, 30460);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new h13(huxVar, i, i2, i3);
        }
    }

    public static final void d(boolean z, j2i j2iVar, qim0 qim0Var, j2i j2iVar2, j2i j2iVar3, j2i j2iVar4, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-253906270);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.g(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            kiv kivVar = t4k.h;
            wat watVar = (wat) x340Var.k(kivVar);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = bb00.h(0, x340Var);
            }
            hdn0 hdn0Var = (hdn0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = bb00.h(0, x340Var);
            }
            hdn0 hdn0Var2 = (hdn0) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = bb00.h(0, x340Var);
            }
            hdn0 hdn0Var3 = (hdn0) objT3;
            int i3 = (i2 >> 6) & 14;
            x340Var.j0(475845883);
            wat watVar2 = (wat) x340Var.k(kivVar);
            x340Var.j0(-492369756);
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = x0d.o(watVar2, x340Var);
            }
            x340Var.r(false);
            ufh0 ufh0Var = (ufh0) objT4;
            x340Var.j0(-492369756);
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar) {
                objT5 = x0d.m(x340Var);
            }
            x340Var.r(false);
            xhl xhlVar = (xhl) objT5;
            x340Var.j0(-492369756);
            Object objT6 = x340Var.T();
            if (objT6 == m4cVar) {
                objT6 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT6);
            }
            x340Var.r(false);
            ven0 ven0Var = (ven0) objT6;
            x340Var.j0(-492369756);
            Object objT7 = x340Var.T();
            if (objT7 == m4cVar) {
                objT7 = x0d.n(xhlVar, x340Var);
            }
            x340Var.r(false);
            nil nilVar = (nil) objT7;
            x340Var.j0(-492369756);
            Object objT8 = x340Var.T();
            if (objT8 == m4cVar) {
                objT8 = bb00.i(rih1.a, f331.X0, x340Var);
            }
            x340Var.r(false);
            ven0 ven0Var2 = (ven0) objT8;
            who1.h(s161.b(qim0Var, false, new tu(ufh0Var, (byte) 14)), apo.i(x340Var, -1488813576, new hrc(ven0Var2, xhlVar, i3, new su(ven0Var, nilVar, (byte) 10), z, j2iVar, j2iVar2, j2iVar3, watVar, j2iVar4, hdn0Var, hdn0Var2, hdn0Var3)), new ru(ven0Var2, ufh0Var, nilVar, ven0Var, (byte) 10), x340Var, 48);
            x340Var.r(false);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wr1(z, (Object) j2iVar, (Object) qim0Var, (Object) j2iVar2, (Object) j2iVar3, (cv30) j2iVar4, i, (byte) 11);
        }
    }

    public static final void e(int i, Function0 function0, b0k b0kVar, qim0 qim0Var, jtl1 jtl1Var, boolean z) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1661799200);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.i(jtl1Var) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            ven0 ven0VarJ = f4p1.j(new xr0(jtl1Var.b, (byte) 23), Boolean.FALSE, (iac0) null, x340Var, 48, 14);
            String strO0 = cwl1.o0(x340Var, 2131963232);
            long jC = upo1.C(z, x340Var);
            String strO1 = cwl1.o0(x340Var, 2131963232);
            boolean z2 = (i2 & 896) == 256;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new tze0(function0, (byte) 28);
                x340Var.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (ihc1.y0(strO1)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO1), function1);
            boolean zBooleanValue = ((Boolean) ven0VarJ.getValue()).booleanValue();
            j2i j2iVarR = apo.r(388281031, new k750((byte) 10, z), x340Var);
            qim0 qim0Var3 = nim0.a;
            upo1.l(strO0, jC, gbxVar, true, zBooleanValue, qim0Var3, false, null, j2iVarR, x340Var, 805506048, 448);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pn50(z, jtl1Var, function0, qim0Var2, i);
        }
    }

    public static final void f(int i, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        b0k b0kVar2;
        qim0 qim0Var2;
        String str;
        b0k b0kVar3;
        mmr0 mmr0Var;
        b0k b0kVar4 = (x340) b0kVar;
        b0kVar4.k0(-295119537);
        int i2 = i | (b0kVar4.h(z) ? 4 : 2) | (b0kVar4.i(function0) ? 32 : 16) | 384;
        if (b0kVar4.Y(i2 & 1, (i2 & 147) != 146)) {
            if (z) {
                str = "PlayPreview_Playing";
            } else {
                if (z) {
                    eg.o();
                    return;
                }
                str = "PlayPreview_Paused";
            }
            fra fraVar = een.N0;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N(str, qim0Var3);
            boolean z2 = (i2 & 112) == 32;
            Object objT = b0kVar4.T();
            if (z2 || objT == fkj0.X) {
                objT = new isr0(function0, (byte) 20);
                b0kVar4.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarN, false, null, null, null, (Function0) objT, 15);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, b0kVar4, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar4).T);
            xos0 xos0VarM = b0kVar4.m();
            qim0 qim0VarE = zr7.E(b0kVar4, qim0VarX);
            hzj.A.getClass();
            if (((x340) b0kVar4).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar4.m0();
            if (((x340) b0kVar4).S) {
                b0kVar4.l(hmb0.t1);
            } else {
                b0kVar4.v0();
            }
            nko1.H(jw31VarA, b0kVar4, y580.O0);
            nko1.H(xos0VarM, b0kVar4, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar4, y580.R0);
            nko1.F(b0kVar4);
            nko1.H(qim0VarE, b0kVar4, y580.Y);
            qim0 qim0VarR = u291.r(uyn1.x(qim0Var3, 12.0f), 24.0f);
            if (z) {
                b0kVar4.i0(1582023848);
                uwr uwrVar = cbx.a;
                b0kVar3 = b0kVar4;
                wkt0.a(zkt0.a, qim0VarR, (ksl) null, cbx.a(b0kVar4).b.a, false, b0kVar3, 6, 20);
                b0kVar3.r(false);
            } else {
                if (z) {
                    throw p3d1.k(b0kVar4, 1582022880, false);
                }
                b0kVar4.i0(1798274494);
                aux auxVar = aux.c;
                uwr uwrVar2 = cbx.a;
                w0h1.a(auxVar, new jsl(cwl1.o0(b0kVar4, 2131951783)), qim0VarR, cbx.a(b0kVar4).b.b, 0L, false, b0kVar4, aux.d, 48);
                b0kVar3 = b0kVar4;
                b0kVar3.r(false);
            }
            if (z) {
                b0kVar3.i0(1582040346);
                mmr0Var = new mmr0(2131951785, new u7h(cbx.a(b0kVar3).b.a));
                b0kVar3.r(false);
            } else {
                if (z) {
                    throw p3d1.k(b0kVar3, 1582039360, false);
                }
                b0kVar3.i0(1582043196);
                mmr0Var = new mmr0(2131951784, new u7h(cbx.a(b0kVar3).b.b));
                b0kVar3.r(false);
            }
            b0k b0kVar5 = b0kVar3;
            uwo1.e(cwl1.o0(b0kVar3, ((Number) mmr0Var.a).intValue()), null, cbx.d(b0kVar3).g, ((u7h) mmr0Var.b).a, null, null, 0, false, null, 0, null, b0kVar5, 0, 0, 2034);
            b0kVar2 = b0kVar5;
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar4;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new le3(z, function0, qim0Var2, i, (byte) 17);
        }
    }

    public static final void g(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(5020808);
        int i2 = (b0kVar3.i(function0) ? 4 : 2) | i | 48;
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(b0kVar3, 2131952930);
            if (ihc1.y0(strO0)) {
                hhg1.n("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function0);
            pex pexVar = pex.b;
            lex lexVarZ = yoo1.z(b0kVar3);
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            poo1.e(gbxVar, pexVar, lexVarZ, anm1.N("refine_podcast_button", qim0Var3), 0, null, null, ncj.a, null, null, null, false, null, apo.r(235638989, new p9y0(strO0, (byte) 10), b0kVar3), b0kVar2, 12582912, 3072, 8048);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bb50(function0, qim0Var2, i, (byte) 28);
        }
    }

    public static final void h(phx phxVar, Function0 function0, boolean z, hcx hcxVar, float f, float f2, float f3, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1044774960);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(phxVar) : b0kVar3.i(phxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g((Object) null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.e(hcxVar.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.d(f) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= b0kVar3.d(f2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= b0kVar3.d(f3) ? 8388608 : 4194304;
        }
        if (b0kVar3.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            qim0 qim0VarX = lrn1.x(nim0.a, f3);
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = zv8.t;
                b0kVar3.s0(objT);
            }
            qim0 qim0VarC = i541.C(qim0VarX, (iu30) objT);
            boolean z2 = ((i2 & 7168) == 2048) | ((3670016 & i2) == 1048576) | ((i2 & 458752) == 131072);
            Object objT2 = b0kVar3.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new wb9(f2, f, z);
                b0kVar3.s0(objT2);
            }
            qim0 qim0VarS = exd0.s(qim0VarC, (iu30) objT2);
            gbx gbxVar = function0 != null ? new gbx(z50.c, function0) : null;
            cr31 cr31Var = er31.a;
            Object objT3 = b0kVar3.T();
            if (objT3 == m4cVar) {
                objT3 = tj8.Z;
                b0kVar3.s0(objT3);
            }
            kgx kgxVar = new kgx(0, (vu30) objT3, (vu30) null, (vu30) null, 13);
            vzq0.a.getClass();
            b0kVar2 = b0kVar3;
            cwl1.b(qim0VarS, (tl3) null, cr31Var, kgxVar, uzq0.b, (max) null, false, (idn0) null, ny3.a, gbxVar, (gbx) null, apo.r(1338313895, new ef8(phxVar, hcxVar, (byte) 4), b0kVar3), b0kVar2, 0, 48, 1250);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vb9(phxVar, function0, z, hcxVar, f, f2, f3, i);
        }
    }

    public static final void i(int i, Function0 function0, b0k b0kVar, iu30 iu30Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-117739097);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            r1p1.c(48, apo.r(974260590, new xw91(function0, iu30Var, (byte) 15), x340Var), x340Var, ppd1.g);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ah20(function0, iu30Var, i);
        }
    }

    public static final void j(y7e1 y7e1Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        y7e1 y7e1Var2;
        int i2;
        b0k b0kVar2;
        float f;
        lee1 lee1Var;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(770180268);
        if ((i & 6) == 0) {
            y7e1Var2 = y7e1Var;
            i2 = (b0kVar3.i(y7e1Var2) ? 4 : 2) | i;
        } else {
            y7e1Var2 = y7e1Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 256 : 128;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            lee1 lee1Var2 = cbx.d(b0kVar3).j;
            cvx cvxVar = cbx.b(b0kVar3).b;
            yae1 yae1VarQ = d5p1.q(0, b0kVar3, 1);
            wat watVar = (wat) b0kVar3.k(t4k.h);
            boolean zG = b0kVar3.g(lee1Var2) | b0kVar3.d(6.0f) | b0kVar3.g(watVar);
            Object objT = b0kVar3.T();
            if (zG || objT == m4cVar) {
                f = 6.0f;
                lee1Var = lee1Var2;
                objT = ktd.k(watVar.M0((watVar.i0(6.0f) * 2) + ((int) (yae1.b(yae1VarQ, new af5("\n"), lee1Var, 0, false, 0, 0L, (flb0) null, (wat) null, (f930) null, 2044).c & 4294967295L))), b0kVar3);
            } else {
                f = 6.0f;
                lee1Var = lee1Var2;
            }
            qim0 qim0VarN = anm1.N("clip_title_editing_title_field", u291.h(qim0Var, ((p3v) objT).a));
            boolean z = (i2 & 896) == 256;
            Object objT2 = b0kVar3.T();
            if (z || objT2 == m4cVar) {
                objT2 = new wqf(iu30Var, (byte) 2);
                b0kVar3.s0(objT2);
            }
            b0kVar2 = b0kVar3;
            rwo1.b(y7e1Var2, cev0.G(qim0VarN, (iu30) objT2), null, cwl1.o0(b0kVar3, 2131953932), null, null, false, false, k8p1.m(vy5.e, 100), lee1Var, null, null, new c6e1(2, 2), null, null, null, null, new zzq0(f, f, f, f), 0.0f, false, new zxx(cbx.a(b0kVar3).b.a, cbx.a(b0kVar3).b.a, cbx.a(b0kVar3).b.b, cbx.a(b0kVar3).b.d, cbx.a(b0kVar3).a.b.a(), cbx.a(b0kVar3).a.b.a(), cbx.a(b0kVar3).b.c, 0L, 896), b0kVar2, i2 & 14, 0, 912628);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new p1b(y7e1Var, qim0Var, iu30Var, i, (byte) 24);
        }
    }

    public static s24 k(l8x0 l8x0Var, sbx0 sbx0Var, q7r0 q7r0Var, rih1 rih1Var) {
        l8x0Var.getClass();
        rih1Var.getClass();
        return new s24(l8x0Var, sbx0Var, q7r0Var);
    }

    public static final String l(long j, Locale locale) {
        int i = ((int) (j / 3600000)) % 24;
        int i2 = ((int) (j / 60000)) % 60;
        int i3 = ((int) (j / 1000)) % 60;
        if (i > 0) {
            return String.format(locale, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, 3));
        }
        if (i2 > 0) {
            return String.format(locale, "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, 2));
        }
        return i3 > 0 ? String.format(locale, "%02d:%02d", Arrays.copyOf(new Object[]{0, Integer.valueOf(i3)}, 2)) : "--:--";
    }

    public static void m(ShareResultActivity shareResultActivity, s6z0 s6z0Var) {
        shareResultActivity.a1 = s6z0Var;
    }

    public static final go80 n(klm klmVar, xbp0 xbp0Var, xbp0 xbp0Var2, xbp0 xbp0Var3) {
        return klmVar.a("OnDemandTrialsDaemon", new iyo0(xbp0Var, xbp0Var2, xbp0Var3, (byte) 26));
    }

    public static String o(int i) {
        if (i != -1) {
            return i != 0 ? String.valueOf(i) : "RESULT_CANCELED";
        }
        return "RESULT_OK";
    }

    public static final void p(TextView textView, boolean z, boolean z2) {
        String string;
        String str = null;
        if (z) {
            string = textView.getResources().getString(2131960806);
        } else {
            string = z2 ? textView.getResources().getString(2131960805) : null;
        }
        if (string != null) {
            str = ((Object) textView.getText()) + ", " + string;
        }
        textView.setContentDescription(str);
    }

    public static final ArrayList q(List list) {
        List<ea20> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (ea20 ea20Var : list2) {
            arrayList.add(new s520(ea20Var.a, ea20Var.b));
        }
        return arrayList;
    }
}
