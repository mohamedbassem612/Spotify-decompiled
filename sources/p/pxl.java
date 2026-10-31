package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class pxl {
    public static final /* synthetic */ mma0[] a = {new een0(pxl.class, "episodeUriKey", "getEpisodeUriKey(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new een0(pxl.class, "timeSyncedStatusKey", "getTimeSyncedStatusKey(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Lcom/spotify/transcript/model/TimeSyncedStatus;", 1)};
    public static final kiv b = new kiv(aok.O0, (byte) 1);
    public static final kiv c = new kiv(aok.P0, (byte) 1);
    public static final kiv d = new kiv(aok.R0, (byte) 1);
    public static final kiv e = new kiv(aok.Q0, (byte) 1);
    public static final kiv f = new kiv(aok.S0, (byte) 1);

    static {
        d261 d261Var = fzd1.a;
    }

    public static final void a(int i, String str, String str2, String str3, String str4, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
        int i2;
        iu30 iu30Var2;
        qim0 qim0Var2;
        int i3;
        int i4;
        String str5;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1449192328);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(qim0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(str4) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(iu30Var) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            o7h1 o7h1Var = (o7h1) x340Var.k(f);
            boolean zI = ((i2 & 112) == 32) | ((i2 & 14) == 4) | x340Var.i(o7h1Var);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                i3 = i2;
                i4 = 131072;
                ixl ixlVar = new ixl(o7h1Var, str, str2, null, (byte) 0);
                str5 = str2;
                x340Var.s0(ixlVar);
                objT = ixlVar;
            } else {
                str5 = str2;
                i4 = 131072;
                i3 = i2;
            }
            int i5 = i3 >> 3;
            qxd0.t(str5, x340Var, (vu30) objT);
            if (str4 != null) {
                x340Var.i0(-122257520);
                b((i5 & 7168) | (i3 & 1022) | (57344 & (i3 << 3)) | (458752 & i3), str, str5, str3, str4, x340Var, iu30Var, qim0Var);
                iu30Var2 = iu30Var;
                qim0Var2 = qim0Var;
                x340Var.r(false);
            } else {
                iu30Var2 = iu30Var;
                qim0Var2 = qim0Var;
                x340Var.i0(-122007846);
                qim0 qim0VarN = anm1.N("image", u291.d(qim0Var2, 1.0f));
                boolean z = (458752 & i3) == i4;
                Object objT2 = x340Var.T();
                if (z || objT2 == m4cVar) {
                    objT2 = new jzk(iu30Var2, (byte) 4);
                    x340Var.s0(objT2);
                }
                eso1.e(Uri.parse(str2), new jsl(str3), bin.x(qim0VarN, false, (String) null, (pm31) null, (idn0) null, (Function0) objT2, 15), (p3v) null, (zvx) null, (ecx) null, mif1.Q0, (tl3) null, (ColorFilter) null, oux.a, false, true, x340Var, 1769472, 48, 1432);
                x340Var = x340Var;
                x340Var.r(false);
            }
        } else {
            iu30Var2 = iu30Var;
            qim0Var2 = qim0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jxl(str, str2, str3, qim0Var2, str4, iu30Var2, i);
        }
    }

    public static final void b(int i, String str, String str2, String str3, String str4, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
        int i2;
        String str5;
        String str6;
        String str7;
        iu30 iu30Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1823045401);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str5 = str2;
            i2 |= x340Var.g(str5) ? 32 : 16;
        } else {
            str5 = str2;
        }
        if ((i & 384) == 0) {
            str6 = str3;
            i2 |= x340Var.g(str6) ? 256 : 128;
        } else {
            str6 = str3;
        }
        if ((i & 3072) == 0) {
            str7 = str4;
            i2 |= x340Var.g(str7) ? 2048 : 1024;
        } else {
            str7 = str4;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(qim0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            iu30Var2 = iu30Var;
            i2 |= x340Var.i(iu30Var2) ? 131072 : 65536;
        } else {
            iu30Var2 = iu30Var;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            ni7 ni7VarA = oi7.a(Uri.parse(str5), (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, true, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, x340Var, 805306368, 0, 130558);
            wat watVar = (wat) x340Var.k(t4k.h);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                x340Var = x340Var;
                objT = ktd.o(0.0f, x340Var);
            }
            x340Var = x340Var;
            w2g0.c(u291.d(qim0Var, 1.0f), (tl3) null, apo.r(385727549, new ri1(ni7VarA, watVar, (ven0) objT, iu30Var2, str6, str, str7, str5), x340Var), x340Var, 3072, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jxl(str, str2, str3, str4, qim0Var, iu30Var, i);
        }
    }

    public static final void c(int i, String str, String str2, String str3, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
        int i2;
        String str4 = str2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1922393169);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str4) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(qim0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(iu30Var) ? 16384 : 8192;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            o7h1 o7h1Var = (o7h1) x340Var.k(f);
            int i4 = i3 & 112;
            boolean zI = ((i3 & 14) == 4) | x340Var.i(o7h1Var) | (i4 == 32);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                ixl ixlVar = new ixl(o7h1Var, str, str4, null, (byte) 1);
                str4 = str4;
                x340Var.s0(ixlVar);
                objT = ixlVar;
            }
            qxd0.t(str4, x340Var, (vu30) objT);
            qim0 qim0VarN = anm1.N("looping-video", u291.d(qim0Var, 1.0f));
            boolean z = (57344 & i3) == 16384;
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new jzk(iu30Var, (byte) 6);
                x340Var.s0(objT2);
            }
            q7f0.a("npv-transcript", str4, str3, bin.x(qim0VarN, false, (String) null, (pm31) null, (idn0) null, (Function0) objT2, 15), (b3k1) null, false, x340Var, 6 | i4 | (i3 & 896), 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hy0((Object) str, (Object) str2, (Object) str3, qim0Var, (Object) iu30Var, i, (byte) 23);
        }
    }

    public static final void d(qwl qwlVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        txl sxlVar;
        int i3;
        txl txlVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1952890666);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(qwlVar) : x340Var.i(qwlVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            lxh lxhVar = qwlVar.c;
            if (u890.j(lxhVar, kxh.a)) {
                txlVar = new txl(1, qwlVar.d);
            } else if (u890.j(lxhVar, ixh.a)) {
                txlVar = new txl(2, u7h.k);
            } else {
                if (!(lxhVar instanceof jxh)) {
                    eg.o();
                    return;
                }
                if (u890.j(qwlVar.b, hno.a)) {
                    sxlVar = new rxl(((jxh) lxhVar).a);
                } else {
                    yvh yvhVar = ((jxh) lxhVar).a;
                    if ((yvhVar instanceof wvh) || (yvhVar instanceof xvh)) {
                        i3 = 3;
                    } else {
                        if (!(yvhVar instanceof uvh) && !(yvhVar instanceof vvh)) {
                            eg.o();
                            return;
                        }
                        i3 = 2;
                    }
                    sxlVar = new sxl(i3, yvhVar);
                }
                txlVar = sxlVar;
            }
            uwr uwrVar = cbx.a;
            eth.a(txlVar, qim0Var, irn1.o0(jfv.t(cbx.c(x340Var).b.d, ngv.d), 0, ((jhx) cbx.c(x340Var).a.b).b, 2), "ContentLayerLayout", apo.r(1812404016, new e6j(qwlVar, iu30Var, (byte) 11), x340Var), x340Var, ((i2 >> 3) & 112) | 27648, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nok((byte) 4, i, qwlVar, qim0Var, iu30Var);
        }
    }

    public static final void e(int i, String str, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-103989948);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.g(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Drawable drawable = ((Context) x340Var.k(AndroidCompositionLocals_androidKt.b)).getDrawable(2131233988);
            pxa pxaVar = drawable != null ? new pxa(new yk4(mno1.z(drawable, 0, 0, 7))) : new i9h(u7h.j);
            eso1.e(Uri.parse(str), isl.a, xcg1.k(cbx.a, uyn1.z(24.0f, 0.0f, 2, anm1.N("cover-art", qim0Var))), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new pux(pxaVar, pxaVar), false, false, x340Var, 1073741872, 0, 3576);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rj(str, qim0Var, i, (byte) 18);
        }
    }

    public static final void f(String str, t9b1 t9b1Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-480546082);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(t9b1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            zhy zhyVar = (zhy) x340Var.k(c);
            qim0 qim0VarN = anm1.N("entity-card", uyn1.z(24.0f, 0.0f, 2, u291.z(u291.f(qim0Var, 1.0f), (fra) null, 3)));
            zkb zkbVar = t9b1Var.a;
            uwr uwrVar = cbx.a;
            why whyVarV = i541.V(zkbVar, context, z4p1.G(((vex) zex.a.e).d));
            otw.c(zhyVar, new why(whyVarV.h, str, whyVarV.b, whyVarV.c, whyVarV.d, whyVarV.e, whyVarV.f, whyVarV.g, true), qim0VarN, (ipb1) null, x340Var, 0, 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nok(str, t9b1Var, qim0Var, i, (byte) 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x012c  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    public static final void g(String str, yvh yvhVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        h311 h311VarV;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1643904905);
        int i4 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(yvhVar) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128);
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i4 | 3072;
        } else {
            i3 = i4 | (x340Var.g(qim0Var) ? 2048 : 1024);
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            if (i5 != 0) {
                qim0Var = nim0.a;
            }
            if (yvhVar instanceof wvh) {
                x340Var.i0(1941262452);
                wvh wvhVar = (wvh) yvhVar;
                qim0 qim0Var3 = qim0Var;
                a(((i3 << 9) & 458752) | (i3 & 7182), str, wvhVar.a, wvhVar.b, wvhVar.c, x340Var, iu30Var, qim0Var3);
                x340Var = x340Var;
                qim0Var = qim0Var3;
                x340Var.r(false);
            } else if (yvhVar instanceof xvh) {
                x340Var.i0(755367393);
                xvh xvhVar = (xvh) yvhVar;
                c(((i3 << 6) & 57344) | (i3 & 7182), str, xvhVar.a, xvhVar.b, x340Var, iu30Var, qim0Var);
                qim0Var2 = qim0Var;
                x340Var.r(false);
            } else {
                qim0Var2 = qim0Var;
                if (yvhVar instanceof uvh) {
                    x340Var.i0(755375058);
                    f(str, ((uvh) yvhVar).a, qim0Var2, x340Var, ((i3 >> 3) & 896) | (i3 & 14));
                    x340Var.r(false);
                    x340Var = x340Var;
                } else {
                    if (!(yvhVar instanceof vvh)) {
                        throw p3d1.k(x340Var, 755357150, false);
                    }
                    x340Var.i0(1941939461);
                    vvh vvhVar = (vvh) yvhVar;
                    x340Var = x340Var;
                    otw.c((u710) x340Var.k(d), new t710(str, 48, vvhVar.a, vvhVar.b, true, (String) null), anm1.N("external-link", uyn1.z(24.0f, 0.0f, 2, u291.b(0.0f, 64.0f, 1, u291.f(qim0Var2, 1.0f)))), (ipb1) null, x340Var, 0, 8);
                    x340Var.r(false);
                }
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new lxl(str, yvhVar, iu30Var, qim0Var2, i, i2);
            }
        }
        x340Var.b0();
        qim0Var2 = qim0Var;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lxl(str, yvhVar, iu30Var, qim0Var2, i, i2);
        }
    }

    public static final void h(String str, jno jnoVar, qpe1 qpe1Var, int i, long j, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i2) {
        int i3;
        h311 h311VarV;
        mxl mxlVar;
        boolean z;
        int i4;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-289378741);
        int i5 = (x340Var.g(str) ? 4 : 2) | i2 | (x340Var.g(jnoVar) ? 32 : 16) | (x340Var.e(qpe1Var.ordinal()) ? 256 : 128) | (x340Var.e(l1d.C(i)) ? 2048 : 1024);
        if ((i2 & 24576) == 0) {
            i5 |= x340Var.f(j) ? 16384 : 8192;
        }
        int i6 = i5 | (x340Var.g(qim0Var) ? 131072 : 65536) | (x340Var.i(iu30Var) ? 1048576 : 524288);
        if (x340Var.Y(i6 & 1, (599187 & i6) != 599186)) {
            if (jnoVar.equals(hno.a)) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    mxlVar = new mxl(str, jnoVar, qpe1Var, i, j, qim0Var, iu30Var, i2, (byte) 0);
                }
            } else {
                qim0 qim0VarN = anm1.N("transcript", zr7.i(uyn1.z(24.0f, 0.0f, 2, qim0Var), new f13(i, (byte) 4)));
                boolean z2 = ((i6 & 14) == 4) | ((i6 & 896) == 256);
                Object objT = x340Var.T();
                if (z2 || objT == m4cVar) {
                    objT = new kjk(str, qpe1Var, (byte) 11);
                    x340Var.s0(objT);
                }
                qim0 qim0VarB = s161.b(qim0VarN, false, (iu30) objT);
                boolean z3 = (i6 & 3670016) == 1048576;
                Object objT2 = x340Var.T();
                if (z3 || objT2 == m4cVar) {
                    objT2 = new jzk(iu30Var, (byte) 7);
                    x340Var.s0(objT2);
                }
                qim0 qim0VarI = zr7.i(qim0VarB, new oa5((Function0) objT2, (byte) 3));
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarI);
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
                boolean z4 = jnoVar instanceof gno;
                nim0 nim0Var = nim0.a;
                if (z4) {
                    x340Var.i0(-1561229642);
                    String strF = f4i1.f("♩ ", ((gno) jnoVar).a, " ♩");
                    lee1 lee1VarI = i(x340Var, i);
                    uwr uwrVar = cbx.a;
                    uwo1.e(strF, anm1.N("music-caption", u291.z(u291.d(nim0Var, 1.0f), een.N0, 2)), lee1VarI, ((vex) zex.a.e).n, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 48, 0, 2016);
                    x340Var.r(false);
                    i3 = i;
                    z = true;
                } else {
                    if (!(jnoVar instanceof ino)) {
                        throw p3d1.k(x340Var, -1574384613, false);
                    }
                    x340Var.i0(-1560788977);
                    ymd ymdVar = (ymd) x340Var.k(b);
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    byte bC = xcg1.c(i);
                    uwr uwrVar2 = cbx.a;
                    long j2 = ((vex) zex.a.e).k;
                    long j3 = u7h.f;
                    i3 = i;
                    lee1 lee1VarI2 = i(x340Var, i3);
                    z = true;
                    if (i3 == 1 || i3 == 2) {
                        i4 = 5;
                    } else {
                        if (i3 != 3) {
                            throw null;
                        }
                        i4 = 3;
                    }
                    otw.c(ymdVar, new wmd(str, bC, j2, j3, j != 16 ? new u7h(j) : null, lee1VarI2, i4), qim0VarD, (ipb1) null, x340Var, 384, 8);
                    x340Var.r(false);
                }
                x340Var.r(z);
            }
            h311VarV.d = mxlVar;
        }
        i3 = i;
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            mxlVar = new mxl(str, jnoVar, qpe1Var, i3, j, qim0Var, iu30Var, i2, (byte) 1);
            h311VarV.d = mxlVar;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final lee1 i(b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int iC = l1d.C(i);
        if (iC == 0) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(281195742);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).c;
            x340Var.r(false);
            return lee1Var;
        }
        if (iC == 1) {
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.i0(281197695);
            uwr uwrVar2 = cbx.a;
            lee1 lee1Var2 = cbx.d(x340Var2).d;
            x340Var2.r(false);
            return lee1Var2;
        }
        if (iC != 2) {
            throw p3d1.k((x340) b0kVar, 281193921, false);
        }
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.i0(281199650);
        uwr uwrVar3 = cbx.a;
        lee1 lee1Var3 = cbx.d(x340Var3).h;
        x340Var3.r(false);
        return lee1Var3;
    }
}
