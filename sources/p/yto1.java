package p;

import android.R;
import android.content.Context;
import android.net.Uri;
import com.spotify.concertcampaignview.v1.CtaType;
import j$.util.Base64;
import java.io.File;
import java.util.WeakHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class yto1 {
    public static b180 a;

    public static final void a(String str, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1685505897);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String strO0 = cwl1.o0(x340Var, 2131953546);
            String strO1 = cwl1.o0(x340Var, R.string.cancel);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.TRUE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean zI = x340Var.i(ven0Var) | ((i2 & 896) == 256);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new cb(function1, ven0Var, (byte) 0);
                x340Var.s0(objT2);
            }
            Function0 function2 = (Function0) objT2;
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                x340Var.i0(-443079541);
                String strO2 = cwl1.o0(x340Var, 2131953548);
                String strN0 = cwl1.n0(2131953547, new Object[]{str}, x340Var);
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                zgx zgxVar = new zgx(strO0, new gbx(new y50(strO0), function0));
                if (ihc1.y0(strO1)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                } else {
                    mqo1.d(function2, null, null, strO2, strN0, zgxVar, new zgx(strO1, new gbx(new y50(strO1), function2)), x340Var, 2359296, 6);
                    x340Var.r(false);
                }
            } else {
                x340Var.i0(-442526005);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bb(str, function0, function1, i, (byte) 0);
        }
    }

    public static final void b(tkf tkfVar, b0k b0kVar, int i) {
        int i2;
        Uri uri;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2020533004);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(tkfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            boolean z = tkfVar.g;
            String str = tkfVar.d;
            if (z) {
                x340Var.i0(-267860935);
                n(x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(-267818899);
                boolean zG = x340Var.g(str);
                Object objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    if (str == null || (uri = Uri.parse(str)) == null) {
                        uri = Uri.EMPTY;
                    }
                    objT = uri;
                    x340Var.s0(objT);
                }
                Uri uri2 = (Uri) objT;
                uri2.getClass();
                bmq0.a(uri2, anm1.N("chat_avatar", nim0.a), hcx.b, tkfVar.b, (String) null, 0L, 0L, false, x340Var, 384, 240);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new du0((Object) tkfVar, i, (byte) 11);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void c(tkf tkfVar, Function0 function0, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1462268826);
        int i2 = i | (x340Var.i(tkfVar) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            j(tkfVar, function0, iu30Var, qim0Var3, null, false, x340Var, i2 & 8190, 48);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hwd(tkfVar, function0, iu30Var, qim0Var2, i, (byte) 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    public static final void d(float f, qim0 qim0Var, long j, int i, db80 db80Var, b0k b0kVar, int i2, int i3) {
        int i4;
        int i5;
        boolean z;
        long j2;
        db80 db80Var2;
        int i6;
        h311 h311VarV;
        int i7;
        db80 db80VarR;
        long j3;
        cb80 cb80VarG;
        cb80 cb80VarG2;
        boolean zI;
        Object objT;
        long j4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1585410283);
        int i8 = (x340Var.d(f) ? 4 : 2) | i2 | (x340Var.i(qim0Var) ? 32 : 16);
        int i9 = i8 | 128;
        int i10 = i3 & 8;
        if (i10 == 0) {
            if ((i2 & 3072) == 0) {
                i4 = i;
                i9 |= x340Var.e(i4) ? 2048 : 1024;
            }
            i5 = i9 | 8192;
            if ((i5 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i5 & 1, z)) {
                x340Var.d0();
                if ((i2 & 1) != 0 || x340Var.E()) {
                    uwr uwrVar = cbx.a;
                    long j5 = cbx.a(x340Var).c.a;
                    if (i10 != 0) {
                        i4 = 0;
                    }
                    i7 = i5 & (-58241);
                    db80VarR = t5p1.r("progress-dot-transition", x340Var, 0);
                    j3 = j5;
                } else {
                    x340Var.b0();
                    db80VarR = db80Var;
                    i7 = i5 & (-58241);
                    j3 = j;
                }
                x340Var.s();
                bb80 bb80Var = new bb80(irn1.o0(0, 0, null, 7), 2, i4 * (-1));
                int i11 = ((i7 << 3) & 112) | 29064;
                db80 db80Var3 = db80VarR;
                cb80VarG = t5p1.g(db80Var3, f, 1.0f, bb80Var, "progress-dot-size", x340Var, i11, 0);
                cb80VarG2 = t5p1.g(db80Var3, f, 0.4f, bb80Var, "progress-dot-size", x340Var, i11, 0);
                zI = x340Var.i(cb80VarG) | x340Var.f(j3) | x340Var.i(cb80VarG2);
                objT = x340Var.T();
                if (!zI || objT == fkj0.X) {
                    j4 = j3;
                    lff lffVar = new lff(cb80VarG, j4, cb80VarG2, (byte) 2);
                    x340Var.s0(lffVar);
                    objT = lffVar;
                } else {
                    j4 = j3;
                }
                j0o1.b((i7 >> 3) & 14, x340Var, (iu30) objT, qim0Var);
                db80Var2 = db80Var3;
                j2 = j4;
            } else {
                x340Var.b0();
                j2 = j;
                db80Var2 = db80Var;
            }
            i6 = i4;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new lwx(f, qim0Var, j2, i6, db80Var2, i2, i3);
            }
        }
        i9 = i8 | 3200;
        i4 = i;
        i5 = i9 | 8192;
        if ((i5 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i5 & 1, z)) {
            x340Var.d0();
            if ((i2 & 1) != 0) {
                uwr uwrVar2 = cbx.a;
                long j6 = cbx.a(x340Var).c.a;
                if (i10 != 0) {
                    i4 = 0;
                }
                i7 = i5 & (-58241);
                db80VarR = t5p1.r("progress-dot-transition", x340Var, 0);
                j3 = j6;
            } else {
                uwr uwrVar3 = cbx.a;
                long j7 = cbx.a(x340Var).c.a;
                if (i10 != 0) {
                    i4 = 0;
                }
                i7 = i5 & (-58241);
                db80VarR = t5p1.r("progress-dot-transition", x340Var, 0);
                j3 = j7;
            }
            x340Var.s();
            bb80 bb80Var2 = new bb80(irn1.o0(0, 0, null, 7), 2, i4 * (-1));
            int i12 = ((i7 << 3) & 112) | 29064;
            db80 db80Var4 = db80VarR;
            cb80VarG = t5p1.g(db80Var4, f, 1.0f, bb80Var2, "progress-dot-size", x340Var, i12, 0);
            cb80VarG2 = t5p1.g(db80Var4, f, 0.4f, bb80Var2, "progress-dot-size", x340Var, i12, 0);
            zI = x340Var.i(cb80VarG) | x340Var.f(j3) | x340Var.i(cb80VarG2);
            objT = x340Var.T();
            if (zI) {
                j4 = j3;
                lff lffVar2 = new lff(cb80VarG, j4, cb80VarG2, (byte) 2);
                x340Var.s0(lffVar2);
                objT = lffVar2;
            } else {
                j4 = j3;
                lff lffVar3 = new lff(cb80VarG, j4, cb80VarG2, (byte) 2);
                x340Var.s0(lffVar3);
                objT = lffVar3;
            }
            j0o1.b((i7 >> 3) & 14, x340Var, (iu30) objT, qim0Var);
            db80Var2 = db80Var4;
            j2 = j4;
        } else {
            x340Var.b0();
            j2 = j;
            db80Var2 = db80Var;
        }
        i6 = i4;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lwx(f, qim0Var, j2, i6, db80Var2, i2, i3);
        }
    }

    public static final void e(int i, int i2, int i3, b0k b0kVar, qim0 qim0Var) {
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1494062339);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else {
            i4 = (x340Var.i(qim0Var) ? 4 : 2) | i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= x340Var.e(i == 0 ? -1 : l1d.C(i)) ? 32 : 16;
        }
        if (x340Var.Y(i4 & 1, (i4 & 19) != 18)) {
            qim0 qim0Var2 = nim0.a;
            if (i5 != 0) {
                qim0Var = qim0Var2;
            }
            if (i6 != 0) {
                i = 2;
            }
            jw31 jw31VarA = ew31.a(new d36(rjx.c(x340Var, i), false, (e36) null), een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            d(rjx.g(i), u291.r(qim0Var2, rjx.c(x340Var, i)), 0L, 0, null, x340Var, 0, 28);
            d(rjx.g(i), u291.r(qim0Var2, rjx.c(x340Var, i)), 0L, 100, null, x340Var, 3072, 20);
            d(rjx.g(i), u291.r(qim0Var2, rjx.c(x340Var, i)), 0L, CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER, null, x340Var, 3072, 20);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mwx(i, i2, i3, qim0Var);
        }
    }

    public static final void f(int i, j2i j2iVar, b0k b0kVar, qim0 qim0Var, boolean z) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-234887940);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = c97.b(z ? 1.0f : 0.0f);
                x340Var.s0(objT);
            }
            o95 o95Var = (o95) objT;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zI = ((i2 & 14) == 4) | x340Var.i(o95Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new yg10((byte) 0, o95Var, (lnm) null, z);
                x340Var.s0(objT2);
            }
            qxd0.t(boolValueOf, x340Var, (vu30) objT2);
            boolean zI2 = x340Var.i(o95Var);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new o8x(o95Var, (byte) 23);
                x340Var.s0(objT3);
            }
            qim0 qim0VarX = j9k1.x(qim0Var, (xu30) objT3);
            boolean zI3 = x340Var.i(o95Var);
            Object objT4 = x340Var.T();
            if (zI3 || objT4 == m4cVar) {
                objT4 = new wqe(o95Var, (byte) 8);
                x340Var.s0(objT4);
            }
            qim0 qim0VarC = i541.C(qim0VarX, (iu30) objT4);
            qim0 qim0VarA = nim0.a;
            if (z) {
                x340Var.i0(1905980420);
            } else {
                x340Var.i0(1905981171);
                Object objT5 = x340Var.T();
                if (objT5 == m4cVar) {
                    objT5 = xc10.i;
                    x340Var.s0(objT5);
                }
                qim0VarA = s161.a(qim0VarA, (iu30) objT5);
            }
            x340Var.r(false);
            qim0 qim0VarThen = qim0VarC.then(qim0VarA);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarThen);
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
            dv20.l(6, j2iVar, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rbh(z, qim0Var, j2iVar, i, (byte) 1);
        }
    }

    public static final void g(ww60 ww60Var, Context context, pkp pkpVar, qkp qkpVar, rkp rkpVar, vbl0 vbl0Var, b0k b0kVar, int i) {
        int i2;
        String quantityString;
        int i3 = ww60Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1558900815);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(ww60Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(context) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var.g(pkpVar) : x340Var.i(pkpVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? x340Var.g(qkpVar) : x340Var.i(qkpVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? x340Var.g(rkpVar) : x340Var.i(rkpVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(vbl0Var) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarZ = u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarZ, cbx.a(x340Var).a.a.a(), d4o1.a);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0VarF);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 54);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarP);
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
            otw.c(new t060(), new k060(2131956917), u291.f(nim0Var, 1.0f), (ipb1) null, x340Var, 384, 8);
            z710 z710Var = (z710) ((is90) ((tnm) qkpVar.a.c).b).f.get();
            c8o.l(z710Var);
            qj0 qj0Var = new qj0(z710Var, vbl0Var);
            String str = ww60Var.b;
            int i4 = ww60Var.c;
            int iC = l1d.C(i3);
            if (iC == 0) {
                quantityString = context.getResources().getQuantityString(2131820718, i4, str, Integer.valueOf(i4 - 1));
            } else if (iC == 1) {
                quantityString = context.getResources().getQuantityString(2131820717, i4, str, Integer.valueOf(i4 - 1));
            } else if (iC == 2) {
                quantityString = context.getResources().getString(2131956914);
            } else {
                if (iC != 3) {
                    eg.o();
                    return;
                }
                quantityString = "";
            }
            otw.c(qj0Var, new ret(quantityString, ww60Var.d, ww60Var.e, ww60Var.f), u291.f(nim0Var, 1.0f), (ipb1) null, x340Var, 384, 8);
            tnm tnmVar = (tnm) rkpVar.a.c;
            ior iorVar = (ior) ((is90) tnmVar.b).e.get();
            c8o.l(iorVar);
            lzn0 lzn0Var = (lzn0) ((is90) tnmVar.b).g.get();
            c8o.l(lzn0Var);
            otw.c(new et90(iorVar, lzn0Var, vbl0Var), new psn0(i3), u291.f(nim0Var, 1.0f), (ipb1) null, x340Var, 384, 8);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wc0(ww60Var, context, pkpVar, qkpVar, rkpVar, vbl0Var, i, (byte) 21);
        }
    }

    public static final void h(p8i0 p8i0Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        qim0 qim0Var2;
        int i3;
        int i4;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1287591060);
        if ((i & 6) == 0) {
            i2 = i | (x340Var2.e(p8i0Var.ordinal()) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(function0) ? 32 : 16;
        }
        int i5 = i2 | 384;
        if (x340Var2.Y(i5 & 1, (i5 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = uyn1.z(0.0f, 8.0f, 1, u291.f(qim0Var3, 1.0f));
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var2, 54);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarZ);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            if (p8i0Var == p8i0.c) {
                i3 = 1151371002;
                i4 = 2131958418;
            } else {
                i3 = 1151464033;
                i4 = 2131958417;
            }
            uwo1.e(x0d.k(x340Var2, i3, i4, x340Var2, false), new wnb0(1.0f, true), cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2032);
            boolean z = (i5 & 112) == 32;
            Object objT = x340Var2.T();
            if (z || objT == fkj0.X) {
                objT = new aba0(function0, (byte) 14);
                x340Var2.s0(objT);
            }
            foo1.c(new gbx(z50.c, (Function0) objT), ldx.c, null, null, yla.s(x340Var2), null, null, null, null, null, lvi.a, x340Var2, 48, 48, 2012);
            x340Var = x340Var2;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ri60(p8i0Var, function0, qim0Var2, i, (byte) 25);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void i(tkf tkfVar, iu30 iu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        af5 af5VarA;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1403468915);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(tkfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            pkf pkfVar = tkfVar.c;
            if (pkfVar instanceof okf) {
                x340Var.i0(113902573);
                x340Var.r(false);
                af5VarA = new af5(((okf) pkfVar).a);
            } else {
                if (!(pkfVar instanceof nkf)) {
                    throw p3d1.k(x340Var, 113900534, false);
                }
                x340Var.i0(113905364);
                af5VarA = wmo1.A(2131957485, 2131957484, "https://www.spotify.com/platform-rules/plain/", null, iu30Var, x340Var, (i2 << 9) & 57344, 8);
                x340Var.r(false);
            }
            af5 af5Var = af5VarA;
            uwr uwrVar = cbx.a;
            uwo1.d(af5Var, cbx.a(x340Var).b.a, null, cbx.d(x340Var).j, null, null, 0, false, null, 0, null, null, x340Var, 0, 0, 4084);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g90(tkfVar, iu30Var, i, (byte) 23);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:106:0x0309  */
    /* JADX WARN: Code duplicated, block: B:108:0x0340  */
    /* JADX WARN: Code duplicated, block: B:111:0x0353  */
    /* JADX WARN: Code duplicated, block: B:113:0x0358  */
    /* JADX WARN: Code duplicated, block: B:116:0x0365  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:69:0x0131  */
    /* JADX WARN: Code duplicated, block: B:70:0x0152  */
    /* JADX WARN: Code duplicated, block: B:73:0x0182  */
    /* JADX WARN: Code duplicated, block: B:74:0x0186  */
    /* JADX WARN: Code duplicated, block: B:77:0x0199  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x0207  */
    /* JADX WARN: Code duplicated, block: B:87:0x021a  */
    /* JADX WARN: Code duplicated, block: B:93:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:96:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:98:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:99:0x02fa  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r4v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean, byte] */
    public static final void j(tkf tkfVar, Function0 function0, iu30 iu30Var, qim0 qim0Var, pl3 pl3Var, boolean z, b0k b0kVar, int i, int i2) throws NoWhenBranchMatchedException {
        int i3;
        boolean z2;
        boolean z3;
        x340 x340Var;
        Function0 function1;
        boolean z4;
        pl3 pl3Var2;
        h311 h311VarV;
        pl3 pl3Var3;
        int i4;
        boolean z5;
        pl3 pl3Var4;
        jw31 jw31VarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z6;
        n4k n4kVar;
        nim0 nim0Var;
        qim0 wnb0Var;
        ?? r4;
        qim0 qim0VarB;
        ?? r5;
        fra fraVar;
        ?? r6;
        long j;
        ?? r13;
        Object objT;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-183342415);
        j06 j06Var = x340Var2.a;
        if ((i & 6) == 0) {
            i3 = (x340Var2.i(tkfVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var2.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var2.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var2.i(qim0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        int i5 = i2 & 32;
        if (i5 == 0) {
            if ((i & 196608) == 0) {
                z2 = z;
                i3 |= x340Var2.h(z2) ? 131072 : 65536;
            }
            if ((74899 & i3) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var2.Y(i3 & 1, z3)) {
                x340Var2.d0();
                if ((i & 1) != 0 || x340Var2.E()) {
                    pl3Var3 = een.Z;
                    i4 = i3 & (-57345);
                    if (i5 != 0) {
                        pl3Var4 = pl3Var3;
                        z5 = false;
                    } else {
                        z5 = z2;
                        pl3Var4 = pl3Var3;
                    }
                } else {
                    x340Var2.b0();
                    i4 = i3 & (-57345);
                    z5 = z2;
                    pl3Var4 = pl3Var;
                }
                x340Var2.s();
                qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                jw31VarA = ew31.a(h36.a, pl3Var4, x340Var2, 0);
                iHashCode = Long.hashCode(x340Var2.T);
                xos0VarM = x340Var2.m();
                qim0VarE = zr7.E(x340Var2, qim0VarF);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                z6 = x340Var2.S;
                n4kVar = hmb0.t1;
                if (z6) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(jw31VarA, x340Var2, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var2, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var2, lljVar3);
                nko1.F(x340Var2);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var2, lljVar4);
                int i6 = i4 & 14;
                b(tkfVar, x340Var2, i6);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                nim0Var = nim0.a;
                op71.g(x340Var2, u291.v(nim0Var, 12.0f));
                x340Var2.i0(752532189);
                wnb0Var = new wnb0(1.0f, true);
                if (tkfVar.f) {
                    r4 = 0;
                    x340Var2.i0(-881517669);
                    x340Var2.r(false);
                    qim0VarB = wnb0Var;
                } else {
                    x340Var2.i0(-881519382);
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    qim0VarB = uyn1.B(wnb0Var, 0.0f, 0.0f, 12.0f, 0.0f, 11);
                    r4 = 0;
                    x340Var2.r(false);
                }
                x340Var2.r((boolean) r4);
                pl3Var = pl3Var4;
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, (int) r4);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarB);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA, x340Var2, lljVar);
                nko1.H(xos0VarM2, x340Var2, lljVar2);
                x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE2, x340Var2, lljVar4);
                if (z5) {
                    x340Var2.i0(-472357960);
                    r5 = 0;
                    l(x340Var2, 0);
                    cvx cvxVar3 = cbx.b(x340Var2).b;
                    x0d.s(nim0Var, 2.0f, x340Var2, false);
                } else {
                    r5 = 0;
                    x340Var2.i0(-472247445);
                    x340Var2.r(false);
                }
                cvx cvxVar4 = cbx.b(x340Var2).b;
                d36 d36Var = new d36(4.0f, true, new um5((boolean) r5));
                fraVar = een.N0;
                jw31 jw31VarA2 = ew31.a(d36Var, fraVar, x340Var2, (int) r5);
                int iHashCode3 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM3 = x340Var2.m();
                qim0 qim0VarE3 = zr7.E(x340Var2, nim0Var);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(jw31VarA2, x340Var2, lljVar);
                nko1.H(xos0VarM3, x340Var2, lljVar2);
                x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE3, x340Var2, lljVar4);
                String str = tkfVar.b;
                lee1 lee1Var = cbx.d(x340Var2).k;
                if (z5) {
                    x340Var2.i0(926849975);
                    j = cbx.a(x340Var2).b.a;
                    r6 = 0;
                } else {
                    r6 = 0;
                    x340Var2.i0(926850970);
                    j = cbx.a(x340Var2).b.b;
                }
                x340Var2.r((boolean) r6);
                uwo1.e(str, null, lee1Var, j, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2034);
                x340Var = x340Var2;
                if (tkfVar.e || tkfVar.g) {
                    x340Var.i0(-1331849585);
                    x340Var.r((boolean) r6);
                } else {
                    x340Var.i0(-1332290033);
                    wtx wtxVar = wtx.c;
                    jsl jslVar = new jsl(cwl1.o0(x340Var, 2131957487));
                    long j2 = ((wex) ((gmt) zex.a.c).c).b;
                    zov0 zov0Var = cbx.b(x340Var).g;
                    w0h1.a(wtxVar, jslVar, u291.r(nim0Var, 16.0f), j2, 0L, true, x340Var, wtx.d | 196608, 16);
                    x340Var = x340Var;
                    x340Var.r((boolean) r6);
                }
                x340Var.r(true);
                i(tkfVar, iu30Var, x340Var, i6 | ((i4 >> 3) & 112));
                x340Var.r(true);
                if (tkfVar.f) {
                    x340Var.i0(1854961862);
                    cvx cvxVar5 = cbx.b(x340Var).b;
                    op71.g(x340Var, u291.v(nim0Var, 2.0f));
                    i5j1 i5j1Var = new i5j1(fraVar);
                    mta mtaVar = cbx.b(x340Var).d;
                    qim0 qim0VarN = anm1.N("chat_overflow", j9k1.x(i5j1Var, new ac8(3, (byte) 1)));
                    String strO0 = cwl1.o0(x340Var, 2131957488);
                    if ((i4 & 112) == 32) {
                        r13 = 1;
                    } else {
                        r13 = r6;
                    }
                    objT = x340Var.T();
                    if (r13 == 0 || objT == fkj0.X) {
                        function1 = function0;
                        objT = new ukf(function1, (byte) r6);
                        x340Var.s0(objT);
                    } else {
                        function1 = function0;
                    }
                    x340 x340Var3 = x340Var;
                    wro1.h(new gbx(new y50(strO0), (Function0) objT), ldx.c, qim0VarN, null, yla.s(x340Var3), null, false, null, null, aci.a, x340Var3, 0, 6, 984);
                    x340Var = x340Var3;
                    x340Var.r((boolean) r6);
                } else {
                    function1 = function0;
                    x340Var.i0(1855714325);
                    x340Var.r((boolean) r6);
                }
                x340Var.r(true);
                z4 = z5;
            } else {
                x340Var = x340Var2;
                function1 = function0;
                x340Var.b0();
                z4 = z2;
            }
            pl3Var2 = pl3Var;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new yc5(tkfVar, function1, iu30Var, qim0Var, pl3Var2, z4, i, i2, (byte) 3);
            }
        }
        i3 |= 196608;
        z2 = z;
        if ((74899 & i3) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var2.Y(i3 & 1, z3)) {
            x340Var2.d0();
            if ((i & 1) != 0) {
                pl3Var3 = een.Z;
                i4 = i3 & (-57345);
                if (i5 != 0) {
                    pl3Var4 = pl3Var3;
                    z5 = false;
                } else {
                    z5 = z2;
                    pl3Var4 = pl3Var3;
                }
            } else {
                pl3Var3 = een.Z;
                i4 = i3 & (-57345);
                if (i5 != 0) {
                    pl3Var4 = pl3Var3;
                    z5 = false;
                } else {
                    z5 = z2;
                    pl3Var4 = pl3Var3;
                }
            }
            x340Var2.s();
            qim0 qim0VarF2 = u291.f(qim0Var, 1.0f);
            jw31VarA = ew31.a(h36.a, pl3Var4, x340Var2, 0);
            iHashCode = Long.hashCode(x340Var2.T);
            xos0VarM = x340Var2.m();
            qim0VarE = zr7.E(x340Var2, qim0VarF2);
            hzj.A.getClass();
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            z6 = x340Var2.S;
            n4kVar = hmb0.t1;
            if (z6) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar5 = y580.O0;
            nko1.H(jw31VarA, x340Var2, lljVar5);
            llj lljVar6 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar6);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            llj lljVar7 = y580.R0;
            nko1.H(numValueOf2, x340Var2, lljVar7);
            nko1.F(x340Var2);
            llj lljVar8 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar8);
            int i7 = i4 & 14;
            b(tkfVar, x340Var2, i7);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar6 = cbx.b(x340Var2).b;
            nim0Var = nim0.a;
            op71.g(x340Var2, u291.v(nim0Var, 12.0f));
            x340Var2.i0(752532189);
            wnb0Var = new wnb0(1.0f, true);
            if (tkfVar.f) {
                x340Var2.i0(-881519382);
                cvx cvxVar7 = cbx.b(x340Var2).b;
                qim0VarB = uyn1.B(wnb0Var, 0.0f, 0.0f, 12.0f, 0.0f, 11);
                r4 = 0;
                x340Var2.r(false);
            } else {
                r4 = 0;
                x340Var2.i0(-881517669);
                x340Var2.r(false);
                qim0VarB = wnb0Var;
            }
            x340Var2.r((boolean) r4);
            pl3Var = pl3Var4;
            mbh mbhVarA2 = jbh.a(h36.c, een.P0, x340Var2, (int) r4);
            int iHashCode4 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM4 = x340Var2.m();
            qim0 qim0VarE4 = zr7.E(x340Var2, qim0VarB);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA2, x340Var2, lljVar5);
            nko1.H(xos0VarM4, x340Var2, lljVar6);
            x0d.q(iHashCode4, x340Var2, lljVar7, x340Var2);
            nko1.H(qim0VarE4, x340Var2, lljVar8);
            if (z5) {
                x340Var2.i0(-472357960);
                r5 = 0;
                l(x340Var2, 0);
                cvx cvxVar8 = cbx.b(x340Var2).b;
                x0d.s(nim0Var, 2.0f, x340Var2, false);
            } else {
                r5 = 0;
                x340Var2.i0(-472247445);
                x340Var2.r(false);
            }
            cvx cvxVar9 = cbx.b(x340Var2).b;
            d36 d36Var2 = new d36(4.0f, true, new um5((boolean) r5));
            fraVar = een.N0;
            jw31 jw31VarA3 = ew31.a(d36Var2, fraVar, x340Var2, (int) r5);
            int iHashCode5 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM5 = x340Var2.m();
            qim0 qim0VarE5 = zr7.E(x340Var2, nim0Var);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA3, x340Var2, lljVar5);
            nko1.H(xos0VarM5, x340Var2, lljVar6);
            x0d.q(iHashCode5, x340Var2, lljVar7, x340Var2);
            nko1.H(qim0VarE5, x340Var2, lljVar8);
            String str2 = tkfVar.b;
            lee1 lee1Var2 = cbx.d(x340Var2).k;
            if (z5) {
                x340Var2.i0(926849975);
                j = cbx.a(x340Var2).b.a;
                r6 = 0;
            } else {
                r6 = 0;
                x340Var2.i0(926850970);
                j = cbx.a(x340Var2).b.b;
            }
            x340Var2.r((boolean) r6);
            uwo1.e(str2, null, lee1Var2, j, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2034);
            x340Var = x340Var2;
            if (tkfVar.e) {
                x340Var.i0(-1331849585);
                x340Var.r((boolean) r6);
            } else {
                x340Var.i0(-1331849585);
                x340Var.r((boolean) r6);
            }
            x340Var.r(true);
            i(tkfVar, iu30Var, x340Var, i7 | ((i4 >> 3) & 112));
            x340Var.r(true);
            if (tkfVar.f) {
                x340Var.i0(1854961862);
                cvx cvxVar10 = cbx.b(x340Var).b;
                op71.g(x340Var, u291.v(nim0Var, 2.0f));
                i5j1 i5j1Var2 = new i5j1(fraVar);
                mta mtaVar2 = cbx.b(x340Var).d;
                qim0 qim0VarN2 = anm1.N("chat_overflow", j9k1.x(i5j1Var2, new ac8(3, (byte) 1)));
                String strO1 = cwl1.o0(x340Var, 2131957488);
                if ((i4 & 112) == 32) {
                    r13 = 1;
                } else {
                    r13 = r6;
                }
                objT = x340Var.T();
                if (r13 == 0) {
                    function1 = function0;
                    objT = new ukf(function1, (byte) r6);
                    x340Var.s0(objT);
                } else {
                    function1 = function0;
                    objT = new ukf(function1, (byte) r6);
                    x340Var.s0(objT);
                }
                x340 x340Var4 = x340Var;
                wro1.h(new gbx(new y50(strO1), (Function0) objT), ldx.c, qim0VarN2, null, yla.s(x340Var4), null, false, null, null, aci.a, x340Var4, 0, 6, 984);
                x340Var = x340Var4;
                x340Var.r((boolean) r6);
            } else {
                function1 = function0;
                x340Var.i0(1855714325);
                x340Var.r((boolean) r6);
            }
            x340Var.r(true);
            z4 = z5;
        } else {
            x340Var = x340Var2;
            function1 = function0;
            x340Var.b0();
            z4 = z2;
        }
        pl3Var2 = pl3Var;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yc5(tkfVar, function1, iu30Var, qim0Var, pl3Var2, z4, i, i2, (byte) 3);
        }
    }

    public static final void k(wvs0 wvs0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1160991897);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(wvs0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        byte b = 0;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            Integer num = wvs0Var.b;
            int i3 = i2 & 112;
            boolean zI = (i3 == 32) | x340Var.i(wvs0Var) | x340Var.i(xtb0VarA);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                dvq0 dvq0Var = new dvq0(wvs0Var, xtb0VarA, iu30Var, (lnm) null, (byte) 12);
                x340Var.s0(dvq0Var);
                objT = dvq0Var;
            }
            qxd0.t(num, x340Var, (vu30) objT);
            qim0 qim0VarB = uyn1.B(nim0.a, 0.0f, 0.0f, 0.0f, 16.0f, 7);
            zzq0 zzq0VarH = uyn1.h(2, 12.0f, 0.0f);
            boolean zI2 = x340Var.i(wvs0Var) | (i3 == 32);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new ozp0(wvs0Var, iu30Var, (byte) 28);
                x340Var.s0(objT2);
            }
            too1.b(qim0VarB, xtb0VarA, zzq0VarH, (iu30) objT2, x340Var, 0, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yvs0(wvs0Var, iu30Var, i, b);
        }
    }

    public static final void l(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-475032503);
        if (x340Var.Y(i & 1, i != 0)) {
            String strO0 = cwl1.o0(x340Var, 2131957491);
            boolean zG = x340Var.g(strO0);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new w8c(strO0, (byte) 25);
                x340Var.s0(objT);
            }
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = s161.b(nim0Var, true, (iu30) objT);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5(false)), een.N0, x340Var, 0);
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
            wpx wpxVar = wpx.c;
            long j = cbx.a(x340Var).b.b;
            long j2 = cbx.a(x340Var).b.b;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(wpxVar, isl.a, u291.r(nim0Var, 12.0f), j, j2, true, x340Var, wpx.d | 196656, 0);
            uwo1.e(cwl1.o0(x340Var, 2131957492), null, cbx.d(x340Var).m, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qza((byte) 15, i, false);
        }
    }

    public static final void m(tkf tkfVar, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(298490267);
        int i2 = i | (x340Var.i(tkfVar) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = nve.Z0;
                x340Var.s0(objT);
            }
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var).e.b;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            j(tkfVar, function0, (iu30) objT, uyn1.B(qim0Var3, f, 16.0f, 0.0f, 8.0f, 4), null, true, x340Var, (i2 & 14) | 196992 | (i2 & 112), 16);
            rqo1.g(0, 1, x340Var, null);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new swc(tkfVar, function0, qim0Var2, i, (byte) 13);
        }
    }

    public static final void n(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1019537200);
        if (x340Var.Y(i & 1, i != 0)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarQ = i1p1.q(u291.r(anm1.N("chat_disclaimer_logo", nim0Var), hcx.b.a(x340Var)), er31.a);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarQ, cbx.a(x340Var).a.b.a(), d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            wsx wsxVar = wsx.c;
            long j = cbx.a(x340Var).b.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(wsxVar, isl.a, u291.r(nim0Var, 16.0f), j, 0L, false, x340Var, wsx.d | 48, 48);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qza((byte) 16, i, false);
        }
    }

    public static yy61 o(p371 p371Var) {
        if (p371Var instanceof g9c1) {
            return yy61.f;
        }
        if (p371Var instanceof f9c1) {
            return yy61.e;
        }
        if (p371Var instanceof h9c1) {
            return yy61.g;
        }
        if (p371Var instanceof pz70) {
            return yy61.d;
        }
        if (p371Var instanceof a6j0) {
            String str = ((a6j0) p371Var).b;
            if (str != null && !ihc1.y0(str)) {
                return yy61.c;
            }
        } else if (!(p371Var instanceof vkc0)) {
            eg.o();
            return null;
        }
        return yy61.b;
    }

    public static h8o p(Context context, yqg yqgVar, boolean z, Function0 function0) {
        gjv gjvVar;
        File file = new File(context.getCacheDir(), "cronet-cache");
        file.mkdirs();
        AtomicReference atomicReference = new AtomicReference(null);
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(4);
        scheduledExecutorServiceNewScheduledThreadPool.getClass();
        h8o h8oVar = new h8o(atomicReference, scheduledExecutorServiceNewScheduledThreadPool, file, yqgVar, function0, z);
        mz40 mz40Var = f8o.a;
        bsd1 bsd1Var = new bsd1();
        hfp1 hfp1Var = bsd1Var.a;
        synchronized (f8o.b) {
            gjvVar = f8o.c;
        }
        if (gjvVar != null) {
            bsd1Var.b((Object) null);
        } else {
            new Thread((Runnable) new ni(context, bsd1Var, false, (byte) 4)).start();
        }
        hfp1Var.d(scheduledExecutorServiceNewScheduledThreadPool, new g8o(context, z, file, atomicReference));
        hfp1Var.c(scheduledExecutorServiceNewScheduledThreadPool, y580.V0);
        return h8oVar;
    }

    public static String q(byte[] bArr, byte[] bArr2) {
        return cy30.p("[sc-sig:v1:", Base64.getUrlEncoder().withoutPadding().encodeToString(bArr), ":", Base64.getUrlEncoder().withoutPadding().encodeToString(bArr2), "]");
    }

    public static final float r(long j, qqq0 qqq0Var) {
        int iOrdinal = qqq0Var.ordinal();
        if (iOrdinal == 0) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        if (iOrdinal == 1) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        eg.o();
        return 0.0f;
    }

    public static final o9n1 s(Context context) {
        return new o9n1(context, null, o9n1.f26p, mh5.k, jz40.c);
    }

    public static boolean t(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (('A' > cCharAt || cCharAt >= '[') && (('a' > cCharAt || cCharAt >= '{') && !(('0' <= cCharAt && cCharAt < ':') || cCharAt == '-' || cCharAt == '_'))) {
                return false;
            }
        }
        return true;
    }

    public static final kri0 u(tlr0 tlr0Var, w281 w281Var) {
        String str = tlr0Var.g;
        if (w281Var == null || str.length() == 0 || tlr0Var.f != 5 || w281Var.c) {
            return iri0.a;
        }
        String str2 = tlr0Var.h;
        if (str2.length() == 0) {
            str2 = tlr0Var.d;
        }
        return new jri0(str, str2, tlr0Var.i.b, tlr0Var.a);
    }

    public static ozc1 v(String str) {
        String strSubstring;
        int iV0;
        String strSubstring2;
        int iV1;
        Object m231Var;
        Object m231Var2;
        if (!nhc1.Y(str, "[sc-sig:v1:", false) || (iV0 = ihc1.v0((strSubstring = str.substring(11)), ':', 0, 6)) < 0) {
            return null;
        }
        String strSubstring3 = strSubstring.substring(0, iV0);
        if (strSubstring3.length() != 22 || !t(strSubstring3) || (iV1 = ihc1.v0((strSubstring2 = strSubstring.substring(iV0 + 1)), ']', 0, 6)) < 0) {
            return null;
        }
        String strSubstring4 = strSubstring2.substring(0, iV1);
        if (strSubstring4.length() != 43 || !t(strSubstring4)) {
            return null;
        }
        String strSubstring5 = strSubstring2.substring(iV1 + 1);
        try {
            m231Var = Base64.getUrlDecoder().decode(strSubstring3);
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            m231Var = null;
        }
        byte[] bArr = (byte[]) m231Var;
        if (bArr == null || bArr.length != 16) {
            return null;
        }
        try {
            m231Var2 = Base64.getUrlDecoder().decode(strSubstring4);
        } catch (Throwable th2) {
            m231Var2 = new m231(th2);
        }
        if (m231Var2 instanceof m231) {
            m231Var2 = null;
        }
        byte[] bArr2 = (byte[]) m231Var2;
        if (bArr2 != null && bArr2.length == 32) {
            return new ozc1(strSubstring5, bArr, bArr2);
        }
        return null;
    }

    public static final long w(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final long x(long j, qqq0 qqq0Var) {
        int iOrdinal = qqq0Var.ordinal();
        if (iOrdinal == 0) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float f = -Float.intBitsToFloat((int) (j & 4294967295L));
            return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f)));
        }
        if (iOrdinal != 1) {
            eg.o();
            return 0L;
        }
        float f2 = -Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (((long) Float.floatToRawIntBits(f2)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
    }

    public static final int y(int i) {
        int iC = l1d.C(i);
        if (iC == 0) {
            return 2;
        }
        if (iC == 1) {
            return 1;
        }
        eg.o();
        return 0;
    }
}
